package net.dragonmounts.def;

import net.dragonmounts.entity.TameableDragonEntity;
import net.dragonmounts.entity.breath.BreathNode;
import net.dragonmounts.entity.breath.effects.NetherBreathFX;
import net.dragonmounts.entity.breath.weapons.BreathWeapon;
import net.dragonmounts.entity.breath.weapons.BreathWeaponNether;
import net.dragonmounts.entity.helper.DragonLifeStage;
import net.dragonmounts.init.DMSounds;
import net.dragonmounts.registry.DragonType;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class NetherType extends DragonType {
    public NetherType(ResourceLocation identifier, Properties props) {
        super(identifier, props);
    }

    @Override
    public void tick(TameableDragonEntity dragon) {
        World level = dragon.world;
        if (level.isRemote || dragon.isDead || !dragon.getLifeStageHelper().isOldEnough(DragonLifeStage.PREJUVENILE))
            return;
        Random random = level.rand;
        float s = dragon.getScale();
        float h = dragon.height * s;
        float f = (dragon.width - 0.65F) * s;
        boolean isWet = dragon.isWet();
        for (int i = -1; i < s; ++i) {
            level.spawnParticle(
                    EnumParticleTypes.DRIP_LAVA,
                    dragon.posX + (random.nextDouble() - 0.5) * f,
                    dragon.posY + (random.nextDouble() - 0.5) * h,
                    dragon.posZ + (random.nextDouble() - 0.5) * f,
                    0,
                    0,
                    0
            );
            if (isWet) {
                level.spawnParticle(
                        EnumParticleTypes.SMOKE_NORMAL,
                        dragon.posX + (random.nextDouble() - 0.5) * f,
                        dragon.posY + (random.nextDouble() - 0.5) * h,
                        dragon.posZ + (random.nextDouble() - 0.5) * f,
                        0,
                        0,
                        0
                );
            }
        }
    }

    @Override
    public BreathWeapon createBreathWeapon(TameableDragonEntity dragon) {
        return new BreathWeaponNether(dragon);
    }

    @Override
    public SoundEvent getLivingSound(TameableDragonEntity dragon) {
        return dragon.isBaby() ? DMSounds.ENTITY_DRAGON_HATCHLING_GROWL : DMSounds.ENTITY_NETHER_DRAGON_GROWL;
    }

    @Override
    public void spawnClientBreath(World world, Vec3d position, Vec3d direction, BreathNode.Power power, float partialTicks) {
        world.spawnEntity(new NetherBreathFX(world, position, direction, power, partialTicks));
    }
}
