package net.dragonmounts.entity.breath.weapons;

import net.dragonmounts.DragonMountsConfig;
import net.dragonmounts.entity.TameableDragonEntity;
import net.dragonmounts.entity.breath.BreathAffectedBlock;
import net.dragonmounts.entity.breath.BreathAffectedEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Random;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by TGG on 5/08/2015.
 *
 * Models the effects of a breathweapon on blocks and entities
 * Usage:
 * 1) Construct with a parent dragon
 * 2) affectBlock() to apply an area of effect to the given block (eg set fire to it)
 * 3) affectEntity() to apply an area of effect to the given entity (eg damage it)
 *
 * Currently does fire only.  Intended to be subclassed later on for different weapon types.
 */
public class BreathWeaponNether extends BreathWeapon {
	
  public BreathWeaponNether(TameableDragonEntity dragon) {
    super(dragon);
  }

  /** if the hitDensity is high enough, manipulate the block (eg set fire to it)
   * @param world
   * @param blockPosition  the world [x,y,z] of the block
   * @param currentHitDensity
   * @return the updated block hit density
   */
  public BreathAffectedBlock affectBlock(World world, Vec3i blockPosition, BreathAffectedBlock currentHitDensity) {
    checkNotNull(world);
    checkNotNull(blockPosition);
    checkNotNull(currentHitDensity);

    BlockPos pos = new BlockPos(blockPosition);
    IBlockState state = world.getBlockState(pos);
    Block block = state.getBlock();

    Random rand = new Random();

    // Flammable blocks: set fire to them once they have been exposed enough.  After sufficient exposure, destroy the
    //   block (otherwise -if it's raining, the burning block will keep going out)
    // Non-flammable blocks:
    // 1) liquids (except lava) evaporate
    // 2) If the block can be smelted (eg sand), then convert the block to the smelted version
    // 3) If the block can't be smelted then convert to lava
    if (DragonMountsConfig.canFireBreathAffectBlocks) {
      float max = 0.0F;
      for (EnumFacing facing : EnumFacing.values()) {
        float density = currentHitDensity.getHitDensity(facing);
        if (density > max) {
          max = density;
        }
        int flammability = getFlammabilityCompat(block, world, pos, facing);
        if (flammability > 0) {
          float thresholdForIgnition = convertFlammabilityToHitDensityThreshold(flammability);
          //float thresholdForDestruction = thresholdForIgnition * 10;
          BlockPos sideToIgnite = pos.offset(facing);
          if (currentHitDensity.getHitDensity(facing) >= thresholdForIgnition && world.isAirBlock(sideToIgnite)) {
            burnBlocks(sideToIgnite, rand, 77, world);
            //    if (densityOfThisFace >= thresholdForDestruction && state.getBlockHardness(world, pos) != -1 && DragonMountsConfig.canFireBreathAffectBlocks) {
            //   world.setBlockToAir(pos);
          }
        }
      }
      if (max > 0.25F) {
        this.smeltBlock(world, pos, state);
      }
    }
    return new BreathAffectedBlock();  // reset to zero
  }

  private BlockBurnProperties getBurnProperties(IBlockState iBlockState) {
    Block block = iBlockState.getBlock();
    if (blockBurnPropertiesCache.containsKey(block)) {
      return  blockBurnPropertiesCache.get(block);
    }

    BlockBurnProperties blockBurnProperties = new BlockBurnProperties();
    IBlockState result = getSmeltingResult(iBlockState);
    blockBurnProperties.threshold = 20;
//    if (result == null) {
//      blockBurnProperties.threshold = 3;
//      result = getScorchedResult(iBlockState);
//    }
    if (result == null) {
      blockBurnProperties.threshold = 5;
      result = getVaporisedLiquidResult(iBlockState);
    }
    if (result == null) {
      blockBurnProperties.threshold = 100;
      result = getMoltenLavaResult(iBlockState);
    }
    blockBurnProperties.burnResult = result;
    blockBurnPropertiesCache.put(block, blockBurnProperties);
    return blockBurnProperties;
  }

  private static class BlockBurnProperties {
    public IBlockState burnResult = null;  // null if no effect
    public float threshold;
  }

  /** if sourceBlock can be smelted, return the smelting result as a block
   * @param sourceBlock
   * @return the smelting result, or null if none
   */
  private static IBlockState getSmeltingResult(IBlockState sourceBlock) {
    Block block = sourceBlock.getBlock();
    Item itemFromBlock = Item.getItemFromBlock(block);
    ItemStack itemStack;
    if (itemFromBlock != null && itemFromBlock.getHasSubtypes())     {
      int metadata = block.getMetaFromState(sourceBlock);
      itemStack = new ItemStack(itemFromBlock, 1, metadata);
    } else {
      itemStack = new ItemStack(itemFromBlock);
    }

    ItemStack smeltingResult = FurnaceRecipes.instance().getSmeltingResult(itemStack);
    if (smeltingResult != null) {
      Block smeltedResultBlock = Block.getBlockFromItem(smeltingResult.getItem());
      if (smeltedResultBlock != null) {
        IBlockState iBlockStateSmelted = smeltedResultBlock.getStateFromMeta(smeltingResult.getMetadata());
        return iBlockStateSmelted;
      }
    } 
    return null;
  }

  /** if sourceBlock is a liquid or snow that can be molten or vaporised, return the result as a block
   *
   * @param sourceBlock
   * @return the vaporised result, or null if none
   */
  private static IBlockState getVaporisedLiquidResult(IBlockState sourceBlock) {
    Block block = sourceBlock.getBlock();
    Material material = block.getDefaultState().getMaterial();

    if (material == Material.SNOW || material == Material.ICE) {
      final int SMALL_LIQUID_AMOUNT = 4;
      return Blocks.FLOWING_WATER.getDefaultState().withProperty(BlockLiquid.LEVEL, SMALL_LIQUID_AMOUNT);
    } else if (material == Material.PACKED_ICE || material == Material.CRAFTED_SNOW) {
      final int LARGE_LIQUID_AMOUNT = 1;
      return Blocks.FLOWING_WATER.getDefaultState().withProperty(BlockLiquid.LEVEL, LARGE_LIQUID_AMOUNT);
    }
    return null;
  }

  /** if sourceBlock is a block that can be melted to lava, return the result as a block
   * @param sourceBlock
   * @return the molten lava result, or null if none
   */
  private static IBlockState getMoltenLavaResult(IBlockState sourceBlock) {
    Block block = sourceBlock.getBlock();
    Material material = block.getDefaultState().getMaterial();

    if (material == Material.SAND || material == Material.CLAY
            || material == Material.GLASS || material == Material.IRON
            || material == Material.GROUND || material == Material.ROCK
            || block != Blocks.BEDROCK || block != Blocks.OBSIDIAN) {
      final int LARGE_LIQUID_AMOUNT = 1;
      return Blocks.LAVA.getDefaultState().withProperty(BlockLiquid.LEVEL, LARGE_LIQUID_AMOUNT);
    }
    return null;
  }

  /** if sourceBlock is a block that isn't flammable but can be scorched / changed, return the result as a block
   * @param sourceBlock
   * @return the scorched result, or null if none
   */
  private static IBlockState getScorchedResult(IBlockState sourceBlock) {
    Block block = sourceBlock.getBlock();
    Material material = block.getDefaultState().getMaterial();

    if (material == Material.GRASS) {
      return Blocks.DIRT.getDefaultState();
    }
    return null;
  }


  private HashMap<Block, BlockBurnProperties> blockBurnPropertiesCache = new HashMap<Block, BlockBurnProperties>();

  /** if the hitDensity is high enough, manipulate the entity (eg set fire to it, damage it)
   * A dragon can't be damaged by its own breathweapon;
   * @param world
   * @param entityID  the ID of the affected entity
   * @param currentHitDensity the hit density
   * @return the updated hit density; null if entity dead, doesn't exist, or otherwise not affected
   */
  @Override
  public BreathAffectedEntity affectEntity(World world, int entityID, BreathAffectedEntity currentHitDensity) {
    checkNotNull(world);
    checkNotNull(currentHitDensity);

    Entity entity = world.getEntityByID(entityID);
    if (!(entity instanceof EntityLivingBase) || entity.isDead) return null;
    if (entityID == dragon.getEntityId()) return null;

    final float CATCH_FIRE_THRESHOLD = 1.4F;
    final float BURN_SECONDS_PER_HIT_DENSITY = 1.0F;
    float hitDensity = currentHitDensity.getHitDensity();

    final float DAMAGE_PER_HIT_DENSITY = NETHER_DAMAGE * hitDensity;
    
    triggerDamageExceptionsForFire(entity, entityID, DAMAGE_PER_HIT_DENSITY, currentHitDensity);
    entity.attackEntityFrom(DamageSource.causeMobDamage(dragon), DAMAGE_PER_HIT_DENSITY);

    return currentHitDensity;
  }

}
