package net.dragonmounts.init;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import mcp.MethodsReturnNonnullByDefault;
import net.dragonmounts.DragonMountsTags;
import net.dragonmounts.api.IDescribableArmorEffect;
import net.dragonmounts.item.*;
import net.dragonmounts.registry.DragonType;
import net.dragonmounts.util.DragonScaleArmorSuit;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@MethodsReturnNonnullByDefault
public class DMItems {
    public static final ObjectArrayList<Item> ITEMS = new ObjectArrayList<>();
    //Scales Start
    public static final DragonScalesItem FOREST_DRAGON_SCALES = createDragonScalesItem("forest_dragon_scales", DragonTypes.FOREST);
    public static final DragonScalesItem FIRE_DRAGON_SCALES = createDragonScalesItem("fire_dragon_scales", DragonTypes.FIRE);
    public static final DragonScalesItem ICE_DRAGON_SCALES = createDragonScalesItem("ice_dragon_scales", DragonTypes.ICE);
    public static final DragonScalesItem WATER_DRAGON_SCALES = createDragonScalesItem("water_dragon_scales", DragonTypes.WATER);
    public static final DragonScalesItem AETHER_DRAGON_SCALES = createDragonScalesItem("aether_dragon_scales", DragonTypes.AETHER);
    public static final DragonScalesItem NETHER_DRAGON_SCALES = createDragonScalesItem("nether_dragon_scales", DragonTypes.NETHER);
    public static final DragonScalesItem ENDER_DRAGON_SCALES = createDragonScalesItem("ender_dragon_scales", DragonTypes.ENDER);
    public static final DragonScalesItem SUNLIGHT_DRAGON_SCALES = createDragonScalesItem("sunlight_dragon_scales", DragonTypes.SUNLIGHT);
    public static final DragonScalesItem ENCHANT_DRAGON_SCALES = createDragonScalesItem("enchant_dragon_scales", DragonTypes.ENCHANT);
    public static final DragonScalesItem STORM_DRAGON_SCALES = createDragonScalesItem("storm_dragon_scales", DragonTypes.STORM);
    public static final DragonScalesItem TERRA_DRAGON_SCALES = createDragonScalesItem("terra_dragon_scales", DragonTypes.TERRA);
    public static final DragonScalesItem ZOMBIE_DRAGON_SCALES = createDragonScalesItem("zombie_dragon_scales", DragonTypes.ZOMBIE);
    public static final DragonScalesItem MOONLIGHT_DRAGON_SCALES = createDragonScalesItem("moonlight_dragon_scales", DragonTypes.MOONLIGHT);

    //Dragon Armor
    public static final DragonArmorItem IRON_DRAGON_ARMOR = createDragonArmorItem("iron_dragon_armor", DragonArmorItem.TEXTURE_PREFIX + "iron.png", 3);
    public static final DragonArmorItem GOLDEN_DRAGON_ARMOR = createDragonArmorItem("golden_dragon_armor", DragonArmorItem.TEXTURE_PREFIX + "gold.png", 5);
    public static final DragonArmorItem DIAMOND_DRAGON_ARMOR = createDragonArmorItem("diamond_dragon_armor", DragonArmorItem.TEXTURE_PREFIX + "diamond.png", 9);
    public static final DragonArmorItem EMERALD_DRAGON_ARMOR = createDragonArmorItem("emerald_dragon_armor", DragonArmorItem.TEXTURE_PREFIX + "emerald.png", 3);

    //Dragon Scale Swords
    public static final DragonScaleSwordItem AETHER_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("aether_dragon_scale_sword", DragonTypes.AETHER, DMTiers.AETHER_DRAGON_SCALE);
    public static final DragonScaleSwordItem WATER_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("water_dragon_scale_sword", DragonTypes.WATER, DMTiers.WATER_DRAGON_SCALE);
    public static final DragonScaleSwordItem ICE_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("ice_dragon_scale_sword", DragonTypes.ICE, DMTiers.ICE_DRAGON_SCALE);
    public static final DragonScaleSwordItem FIRE_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("fire_dragon_scale_sword", DragonTypes.FIRE, DMTiers.FIRE_DRAGON_SCALE);
    public static final DragonScaleSwordItem FOREST_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("forest_dragon_scale_sword", DragonTypes.FOREST, DMTiers.FOREST_DRAGON_SCALE);
    public static final DragonScaleSwordItem NETHER_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("nether_dragon_scale_sword", DragonTypes.NETHER, DMTiers.NETHER_DRAGON_SCALE);
    public static final DragonScaleSwordItem ENDER_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("ender_dragon_scale_sword", DragonTypes.ENDER, DMTiers.ENDER_DRAGON_SCALE);
    public static final DragonScaleSwordItem ENCHANT_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("enchant_dragon_scale_sword", DragonTypes.ENCHANT, DMTiers.ENCHANT_DRAGON_SCALE);
    public static final DragonScaleSwordItem SUNLIGHT_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("sunlight_dragon_scale_sword", DragonTypes.SUNLIGHT, DMTiers.SUNLIGHT_DRAGON_SCALE);
    public static final DragonScaleSwordItem MOONLIGHT_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("moonlight_dragon_scale_sword", DragonTypes.MOONLIGHT, DMTiers.MOONLIGHT_DRAGON_SCALE);
    public static final DragonScaleSwordItem STORM_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("storm_dragon_scale_sword", DragonTypes.STORM, DMTiers.STORM_DRAGON_SCALE);
    public static final DragonScaleSwordItem TERRA_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("terra_dragon_scale_sword", DragonTypes.TERRA, DMTiers.TERRA_DRAGON_SCALE);
    public static final DragonScaleSwordItem ZOMBIE_DRAGON_SCALE_SWORD = createDragonScaleSwordItem("zombie_dragon_scale_sword", DragonTypes.ZOMBIE, DMTiers.ZOMBIE_DRAGON_SCALE);

    //Dragon Scale Axes
    public static final DragonScaleAxeItem AETHER_DRAGON_SCALE_AXE = createDragonScaleAxeItem("aether_dragon_scale_axe", DragonTypes.AETHER, DMTiers.AETHER_DRAGON_SCALE);
    public static final DragonScaleAxeItem WATER_DRAGON_SCALE_AXE = createDragonScaleAxeItem("water_dragon_scale_axe", DragonTypes.WATER, DMTiers.WATER_DRAGON_SCALE);
    public static final DragonScaleAxeItem ICE_DRAGON_SCALE_AXE = createDragonScaleAxeItem("ice_dragon_scale_axe", DragonTypes.ICE, DMTiers.ICE_DRAGON_SCALE);
    public static final DragonScaleAxeItem FIRE_DRAGON_SCALE_AXE = createDragonScaleAxeItem("fire_dragon_scale_axe", DragonTypes.FIRE, DMTiers.FIRE_DRAGON_SCALE);
    public static final DragonScaleAxeItem FOREST_DRAGON_SCALE_AXE = createDragonScaleAxeItem("forest_dragon_scale_axe", DragonTypes.FOREST, DMTiers.FOREST_DRAGON_SCALE);
    public static final DragonScaleAxeItem NETHER_DRAGON_SCALE_AXE = createDragonScaleAxeItem("nether_dragon_scale_axe", DragonTypes.NETHER, DMTiers.NETHER_DRAGON_SCALE, 12.0F, -2.9F);
    public static final DragonScaleAxeItem ENDER_DRAGON_SCALE_AXE = createDragonScaleAxeItem("ender_dragon_scale_axe", DragonTypes.ENDER, DMTiers.ENDER_DRAGON_SCALE, 9.0F, -2.9F);
    public static final DragonScaleAxeItem ENCHANT_DRAGON_SCALE_AXE = createDragonScaleAxeItem("enchant_dragon_scale_axe", DragonTypes.ENCHANT, DMTiers.ENCHANT_DRAGON_SCALE);
    public static final DragonScaleAxeItem SUNLIGHT_DRAGON_SCALE_AXE = createDragonScaleAxeItem("sunlight_dragon_scale_axe", DragonTypes.SUNLIGHT, DMTiers.SUNLIGHT_DRAGON_SCALE);
    public static final DragonScaleAxeItem MOONLIGHT_DRAGON_SCALE_AXE = createDragonScaleAxeItem("moonlight_dragon_scale_axe", DragonTypes.MOONLIGHT, DMTiers.MOONLIGHT_DRAGON_SCALE);
    public static final DragonScaleAxeItem STORM_DRAGON_SCALE_AXE = createDragonScaleAxeItem("storm_dragon_scale_axe", DragonTypes.STORM, DMTiers.STORM_DRAGON_SCALE);
    public static final DragonScaleAxeItem TERRA_DRAGON_SCALE_AXE = createDragonScaleAxeItem("terra_dragon_scale_axe", DragonTypes.TERRA, DMTiers.TERRA_DRAGON_SCALE);
    public static final DragonScaleAxeItem ZOMBIE_DRAGON_SCALE_AXE = createDragonScaleAxeItem("zombie_dragon_scale_axe", DragonTypes.ZOMBIE, DMTiers.ZOMBIE_DRAGON_SCALE);

    //Dragon Scale Bows
    public static final DragonScaleBowItem AETHER_DRAGON_SCALE_BOW = createDragonScaleBowItem("aether_dragon_scale_bow", DragonTypes.AETHER, DMTiers.AETHER_DRAGON_SCALE);
    public static final DragonScaleBowItem WATER_DRAGON_SCALE_BOW = createDragonScaleBowItem("water_dragon_scale_bow", DragonTypes.WATER, DMTiers.WATER_DRAGON_SCALE);
    public static final DragonScaleBowItem ICE_DRAGON_SCALE_BOW = createDragonScaleBowItem("ice_dragon_scale_bow", DragonTypes.ICE, DMTiers.ICE_DRAGON_SCALE);
    public static final DragonScaleBowItem FIRE_DRAGON_SCALE_BOW = createDragonScaleBowItem("fire_dragon_scale_bow", DragonTypes.FIRE, DMTiers.FIRE_DRAGON_SCALE);
    public static final DragonScaleBowItem FOREST_DRAGON_SCALE_BOW = createDragonScaleBowItem("forest_dragon_scale_bow", DragonTypes.FOREST, DMTiers.FOREST_DRAGON_SCALE);
    public static final DragonScaleBowItem NETHER_DRAGON_SCALE_BOW = createDragonScaleBowItem("nether_dragon_scale_bow", DragonTypes.NETHER, DMTiers.NETHER_DRAGON_SCALE);
    public static final DragonScaleBowItem ENDER_DRAGON_SCALE_BOW = createDragonScaleBowItem("ender_dragon_scale_bow", DragonTypes.ENDER, DMTiers.ENDER_DRAGON_SCALE);
    public static final DragonScaleBowItem ENCHANT_DRAGON_SCALE_BOW = createDragonScaleBowItem("enchant_dragon_scale_bow", DragonTypes.ENCHANT, DMTiers.ENCHANT_DRAGON_SCALE);
    public static final DragonScaleBowItem SUNLIGHT_DRAGON_SCALE_BOW = createDragonScaleBowItem("sunlight_dragon_scale_bow", DragonTypes.SUNLIGHT, DMTiers.SUNLIGHT_DRAGON_SCALE);
    public static final DragonScaleBowItem MOONLIGHT_DRAGON_SCALE_BOW = createDragonScaleBowItem("moonlight_dragon_scale_bow", DragonTypes.MOONLIGHT, DMTiers.MOONLIGHT_DRAGON_SCALE);
    public static final DragonScaleBowItem STORM_DRAGON_SCALE_BOW = createDragonScaleBowItem("storm_dragon_scale_bow", DragonTypes.STORM, DMTiers.STORM_DRAGON_SCALE);
    public static final DragonScaleBowItem TERRA_DRAGON_SCALE_BOW = createDragonScaleBowItem("terra_dragon_scale_bow", DragonTypes.TERRA, DMTiers.TERRA_DRAGON_SCALE);
    public static final DragonScaleBowItem ZOMBIE_DRAGON_SCALE_BOW = createDragonScaleBowItem("zombie_dragon_scale_bow", DragonTypes.ZOMBIE, DMTiers.ZOMBIE_DRAGON_SCALE);

    //Dragon Scale Shields
    public static final DragonScaleShieldItem AETHER_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("aether_dragon_scale_shield", DragonTypes.AETHER, DMMaterials.AETHER_DRAGON_SCALE);
    public static final DragonScaleShieldItem WATER_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("water_dragon_scale_shield", DragonTypes.WATER, DMMaterials.WATER_DRAGON_SCALE);
    public static final DragonScaleShieldItem ICE_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("ice_dragon_scale_shield", DragonTypes.ICE, DMMaterials.ICE_DRAGON_SCALE);
    public static final DragonScaleShieldItem FIRE_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("fire_dragon_scale_shield", DragonTypes.FIRE, DMMaterials.FIRE_DRAGON_SCALE);
    public static final DragonScaleShieldItem FOREST_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("forest_dragon_scale_shield", DragonTypes.FOREST, DMMaterials.FOREST_DRAGON_SCALE);
    public static final DragonScaleShieldItem NETHER_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("nether_dragon_scale_shield", DragonTypes.NETHER, DMMaterials.NETHER_DRAGON_SCALE);
    public static final DragonScaleShieldItem ENDER_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("ender_dragon_scale_shield", DragonTypes.ENDER, DMMaterials.ENDER_DRAGON_SCALE);
    public static final DragonScaleShieldItem ENCHANT_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("enchant_dragon_scale_shield", DragonTypes.ENCHANT, DMMaterials.ENCHANT_DRAGON_SCALE);
    public static final DragonScaleShieldItem SUNLIGHT_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("sunlight_dragon_scale_shield", DragonTypes.SUNLIGHT, DMMaterials.SUNLIGHT_DRAGON_SCALE);
    public static final DragonScaleShieldItem MOONLIGHT_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("moonlight_dragon_scale_shield", DragonTypes.MOONLIGHT, DMMaterials.MOONLIGHT_DRAGON_SCALE);
    public static final DragonScaleShieldItem STORM_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("storm_dragon_scale_shield", DragonTypes.STORM, DMMaterials.STORM_DRAGON_SCALE);
    public static final DragonScaleShieldItem TERRA_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("terra_dragon_scale_shield", DragonTypes.TERRA, DMMaterials.TERRA_DRAGON_SCALE);
    public static final DragonScaleShieldItem ZOMBIE_DRAGON_SCALE_SHIELD = createDragonScaleShieldItem("zombie_dragon_scale_shield", DragonTypes.ZOMBIE, DMMaterials.ZOMBIE_DRAGON_SCALE);

    //Dragon Scale Tools - Aether
    public static final DragonScaleShovelItem AETHER_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("aether_dragon_scale_shovel", DragonTypes.AETHER, DMTiers.AETHER_DRAGON_SCALE);
    public static final DragonScalePickaxeItem AETHER_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("aether_dragon_scale_pickaxe", DragonTypes.AETHER, DMTiers.AETHER_DRAGON_SCALE);
    public static final DragonScaleHoeItem AETHER_DRAGON_SCALE_HOE = createDragonScaleHoeItem("aether_dragon_scale_hoe", DragonTypes.AETHER, DMTiers.AETHER_DRAGON_SCALE);
    //Dragon Scale Tools - Water
    public static final DragonScaleShovelItem WATER_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("water_dragon_scale_shovel", DragonTypes.WATER, DMTiers.WATER_DRAGON_SCALE);
    public static final DragonScalePickaxeItem WATER_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("water_dragon_scale_pickaxe", DragonTypes.WATER, DMTiers.WATER_DRAGON_SCALE);
    public static final DragonScaleHoeItem WATER_DRAGON_SCALE_HOE = createDragonScaleHoeItem("water_dragon_scale_hoe", DragonTypes.WATER, DMTiers.WATER_DRAGON_SCALE);
    //Dragon Scale Tools - Ice
    public static final DragonScaleShovelItem ICE_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("ice_dragon_scale_shovel", DragonTypes.ICE, DMTiers.ICE_DRAGON_SCALE);
    public static final DragonScalePickaxeItem ICE_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("ice_dragon_scale_pickaxe", DragonTypes.ICE, DMTiers.ICE_DRAGON_SCALE);
    public static final DragonScaleHoeItem ICE_DRAGON_SCALE_HOE = createDragonScaleHoeItem("ice_dragon_scale_hoe", DragonTypes.ICE, DMTiers.ICE_DRAGON_SCALE);
    //Dragon Scale Tools - Fire
    public static final DragonScaleShovelItem FIRE_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("fire_dragon_scale_shovel", DragonTypes.FIRE, DMTiers.FIRE_DRAGON_SCALE);
    public static final DragonScalePickaxeItem FIRE_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("fire_dragon_scale_pickaxe", DragonTypes.FIRE, DMTiers.FIRE_DRAGON_SCALE);
    public static final DragonScaleHoeItem FIRE_DRAGON_SCALE_HOE = createDragonScaleHoeItem("fire_dragon_scale_hoe", DragonTypes.FIRE, DMTiers.FIRE_DRAGON_SCALE);
    //Dragon Scale Tools - Forest
    public static final DragonScaleShovelItem FOREST_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("forest_dragon_scale_shovel", DragonTypes.FOREST, DMTiers.FOREST_DRAGON_SCALE);
    public static final DragonScalePickaxeItem FOREST_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("forest_dragon_scale_pickaxe", DragonTypes.FOREST, DMTiers.FOREST_DRAGON_SCALE);
    public static final DragonScaleHoeItem FOREST_DRAGON_SCALE_HOE = createDragonScaleHoeItem("forest_dragon_scale_hoe", DragonTypes.FOREST, DMTiers.FOREST_DRAGON_SCALE);
    //Dragon Scale Tools - Nether
    public static final DragonScaleShovelItem NETHER_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("nether_dragon_scale_shovel", DragonTypes.NETHER, DMTiers.NETHER_DRAGON_SCALE);
    public static final DragonScalePickaxeItem NETHER_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("nether_dragon_scale_pickaxe", DragonTypes.NETHER, DMTiers.NETHER_DRAGON_SCALE);
    public static final DragonScaleHoeItem NETHER_DRAGON_SCALE_HOE = createDragonScaleHoeItem("nether_dragon_scale_hoe", DragonTypes.NETHER, DMTiers.NETHER_DRAGON_SCALE);
    //Dragon Scale Tools - Ender
    public static final DragonScaleShovelItem ENDER_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("ender_dragon_scale_shovel", DragonTypes.ENDER, DMTiers.ENDER_DRAGON_SCALE);
    public static final DragonScalePickaxeItem ENDER_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("ender_dragon_scale_pickaxe", DragonTypes.ENDER, DMTiers.ENDER_DRAGON_SCALE);
    public static final DragonScaleHoeItem ENDER_DRAGON_SCALE_HOE = createDragonScaleHoeItem("ender_dragon_scale_hoe", DragonTypes.ENDER, DMTiers.ENDER_DRAGON_SCALE);
    //Dragon Scale Tools - Enchant
    public static final DragonScaleShovelItem ENCHANT_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("enchant_dragon_scale_shovel", DragonTypes.ENCHANT, DMTiers.ENCHANT_DRAGON_SCALE);
    public static final DragonScalePickaxeItem ENCHANT_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("enchant_dragon_scale_pickaxe", DragonTypes.ENCHANT, DMTiers.ENCHANT_DRAGON_SCALE);
    public static final DragonScaleHoeItem ENCHANT_DRAGON_SCALE_HOE = createDragonScaleHoeItem("enchant_dragon_scale_hoe", DragonTypes.ENCHANT, DMTiers.ENCHANT_DRAGON_SCALE);
    //Dragon Scale Tools - Sunlight
    public static final DragonScaleShovelItem SUNLIGHT_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("sunlight_dragon_scale_shovel", DragonTypes.SUNLIGHT, DMTiers.SUNLIGHT_DRAGON_SCALE);
    public static final DragonScalePickaxeItem SUNLIGHT_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("sunlight_dragon_scale_pickaxe", DragonTypes.SUNLIGHT, DMTiers.SUNLIGHT_DRAGON_SCALE);
    public static final DragonScaleHoeItem SUNLIGHT_DRAGON_SCALE_HOE = createDragonScaleHoeItem("sunlight_dragon_scale_hoe", DragonTypes.SUNLIGHT, DMTiers.SUNLIGHT_DRAGON_SCALE);
    //Dragon Scale Tools - Moonlight
    public static final DragonScaleShovelItem MOONLIGHT_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("moonlight_dragon_scale_shovel", DragonTypes.MOONLIGHT, DMTiers.MOONLIGHT_DRAGON_SCALE);
    public static final DragonScalePickaxeItem MOONLIGHT_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("moonlight_dragon_scale_pickaxe", DragonTypes.MOONLIGHT, DMTiers.MOONLIGHT_DRAGON_SCALE);
    public static final DragonScaleHoeItem MOONLIGHT_DRAGON_SCALE_HOE = createDragonScaleHoeItem("moonlight_dragon_scale_hoe", DragonTypes.MOONLIGHT, DMTiers.MOONLIGHT_DRAGON_SCALE);
    //Dragon Scale Tools - Storm
    public static final DragonScaleShovelItem STORM_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("storm_dragon_scale_shovel", DragonTypes.STORM, DMTiers.STORM_DRAGON_SCALE);
    public static final DragonScalePickaxeItem STORM_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("storm_dragon_scale_pickaxe", DragonTypes.STORM, DMTiers.STORM_DRAGON_SCALE);
    public static final DragonScaleHoeItem STORM_DRAGON_SCALE_HOE = createDragonScaleHoeItem("storm_dragon_scale_hoe", DragonTypes.STORM, DMTiers.STORM_DRAGON_SCALE);
    //Dragon Scale Tools - Terra
    public static final DragonScaleShovelItem TERRA_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("terra_dragon_scale_shovel", DragonTypes.TERRA, DMTiers.TERRA_DRAGON_SCALE);
    public static final DragonScalePickaxeItem TERRA_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("terra_dragon_scale_pickaxe", DragonTypes.TERRA, DMTiers.TERRA_DRAGON_SCALE);
    public static final DragonScaleHoeItem TERRA_DRAGON_SCALE_HOE = createDragonScaleHoeItem("terra_dragon_scale_hoe", DragonTypes.TERRA, DMTiers.TERRA_DRAGON_SCALE);
    //Dragon Scale Tools - Zombie
    public static final DragonScaleShovelItem ZOMBIE_DRAGON_SCALE_SHOVEL = createDragonScaleShovelItem("zombie_dragon_scale_shovel", DragonTypes.ZOMBIE, DMTiers.ZOMBIE_DRAGON_SCALE);
    public static final DragonScalePickaxeItem ZOMBIE_DRAGON_SCALE_PICKAXE = createDragonScalePickaxeItem("zombie_dragon_scale_pickaxe", DragonTypes.ZOMBIE, DMTiers.ZOMBIE_DRAGON_SCALE);
    public static final DragonScaleHoeItem ZOMBIE_DRAGON_SCALE_HOE = createDragonScaleHoeItem("zombie_dragon_scale_hoe", DragonTypes.ZOMBIE, DMTiers.ZOMBIE_DRAGON_SCALE);

    //Dragon Scale Armors
    public static final DragonScaleArmorSuit AETHER_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "aether_dragon_scale_helmet",
            "aether_dragon_scale_chestplate",
            "aether_dragon_scale_leggings",
            "aether_dragon_scale_boots",
            DMMaterials.AETHER_DRAGON_SCALE,
            DragonTypes.AETHER,
            DMArmorEffects.AETHER_EFFECT
    );
    public static final DragonScaleArmorSuit WATER_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "water_dragon_scale_helmet",
            "water_dragon_scale_chestplate",
            "water_dragon_scale_leggings",
            "water_dragon_scale_boots",
            DMMaterials.WATER_DRAGON_SCALE,
            DragonTypes.WATER,
            DMArmorEffects.WATER_EFFECT
    );
    public static final DragonScaleArmorSuit ICE_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "ice_dragon_scale_helmet",
            "ice_dragon_scale_chestplate",
            "ice_dragon_scale_leggings",
            "ice_dragon_scale_boots",
            DMMaterials.ICE_DRAGON_SCALE,
            DragonTypes.ICE,
            DMArmorEffects.ICE_EFFECT
    );
    public static final DragonScaleArmorSuit FIRE_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "fire_dragon_scale_helmet",
            "fire_dragon_scale_chestplate",
            "fire_dragon_scale_leggings",
            "fire_dragon_scale_boots",
            DMMaterials.FIRE_DRAGON_SCALE,
            DragonTypes.FIRE,
            DMArmorEffects.FIRE_EFFECT
    );
    public static final DragonScaleArmorSuit FOREST_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "forest_dragon_scale_helmet",
            "forest_dragon_scale_chestplate",
            "forest_dragon_scale_leggings",
            "forest_dragon_scale_boots",
            DMMaterials.FOREST_DRAGON_SCALE,
            DragonTypes.FOREST,
            DMArmorEffects.FOREST_EFFECT
    );
    public static final DragonScaleArmorSuit NETHER_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "nether_dragon_scale_helmet",
            "nether_dragon_scale_chestplate",
            "nether_dragon_scale_leggings",
            "nether_dragon_scale_boots",
            DMMaterials.NETHER_DRAGON_SCALE,
            DragonTypes.NETHER,
            DMArmorEffects.NETHER_EFFECT
    );
    public static final DragonScaleArmorSuit ENDER_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "ender_dragon_scale_helmet",
            "ender_dragon_scale_chestplate",
            "ender_dragon_scale_leggings",
            "ender_dragon_scale_boots",
            DMMaterials.ENDER_DRAGON_SCALE,
            DragonTypes.ENDER,
            DMArmorEffects.ENDER_EFFECT
    );
    public static final DragonScaleArmorSuit ENCHANT_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "enchant_dragon_scale_helmet",
            "enchant_dragon_scale_chestplate",
            "enchant_dragon_scale_leggings",
            "enchant_dragon_scale_boots",
            DMMaterials.ENCHANT_DRAGON_SCALE,
            DragonTypes.ENCHANT,
            DMArmorEffects.ENCHANT_EFFECT
    );
    public static final DragonScaleArmorSuit SUNLIGHT_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "sunlight_dragon_scale_helmet",
            "sunlight_dragon_scale_chestplate",
            "sunlight_dragon_scale_leggings",
            "sunlight_dragon_scale_boots",
            DMMaterials.SUNLIGHT_DRAGON_SCALE,
            DragonTypes.SUNLIGHT,
            DMArmorEffects.SUNLIGHT_EFFECT
    );
    public static final DragonScaleArmorSuit MOONLIGHT_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "moonlight_dragon_scale_helmet",
            "moonlight_dragon_scale_chestplate",
            "moonlight_dragon_scale_leggings",
            "moonlight_dragon_scale_boots",
            DMMaterials.MOONLIGHT_DRAGON_SCALE,
            DragonTypes.MOONLIGHT,
            DMArmorEffects.MOONLIGHT_EFFECT
    );
    public static final DragonScaleArmorSuit STORM_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "storm_dragon_scale_helmet",
            "storm_dragon_scale_chestplate",
            "storm_dragon_scale_leggings",
            "storm_dragon_scale_boots",
            DMMaterials.STORM_DRAGON_SCALE,
            DragonTypes.STORM,
            DMArmorEffects.STORM_EFFECT
    );
    public static final DragonScaleArmorSuit TERRA_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "terra_dragon_scale_helmet",
            "terra_dragon_scale_chestplate",
            "terra_dragon_scale_leggings",
            "terra_dragon_scale_boots",
            DMMaterials.TERRA_DRAGON_SCALE,
            DragonTypes.TERRA,
            DMArmorEffects.TERRA_EFFECT
    );
    public static final DragonScaleArmorSuit ZOMBIE_DRAGON_SCALE_ARMORS = createDragonScaleArmors(
            "zombie_dragon_scale_helmet",
            "zombie_dragon_scale_chestplate",
            "zombie_dragon_scale_leggings",
            "zombie_dragon_scale_boots",
            DMMaterials.ZOMBIE_DRAGON_SCALE,
            DragonTypes.ZOMBIE,
            DMArmorEffects.ZOMBIE_EFFECT
    );

    //Dragon Spawn Eggs
    public static final DragonSpawnEggItem AETHER_DRAGON_SPAWN_EGG = createDragonSpawnEgg("aether_dragon_spawn_egg", DragonTypes.AETHER, 0x06E9FA, 0x281EE7);
    public static final DragonSpawnEggItem ENCHANT_DRAGON_SPAWN_EGG = createDragonSpawnEgg("enchant_dragon_spawn_egg", DragonTypes.ENCHANT, 0xF30FFF, 0xD7D7D7);
    public static final DragonSpawnEggItem ENDER_DRAGON_SPAWN_EGG = createDragonSpawnEgg("ender_dragon_spawn_egg", DragonTypes.ENDER, 0x1D1D24, 0x900996);
    public static final DragonSpawnEggItem FIRE_DRAGON_SPAWN_EGG = createDragonSpawnEgg("fire_dragon_spawn_egg", DragonTypes.FIRE, 0x9F2909, 0xF7A502);
    public static final DragonSpawnEggItem FOREST_DRAGON_SPAWN_EGG = createDragonSpawnEgg("forest_dragon_spawn_egg", DragonTypes.FOREST, 0x28AA29, 0x024F06);
    public static final DragonSpawnEggItem ICE_DRAGON_SPAWN_EGG = createDragonSpawnEgg("ice_dragon_spawn_egg", DragonTypes.ICE, 0xD7D7D7, 0xB3FFF8);
    public static final DragonSpawnEggItem MOONLIGHT_DRAGON_SPAWN_EGG = createDragonSpawnEgg("moonlight_dragon_spawn_egg", DragonTypes.MOONLIGHT, 0x002A95, 0xDAF3AF);
    public static final DragonSpawnEggItem NETHER_DRAGON_SPAWN_EGG = createDragonSpawnEgg("nether_dragon_spawn_egg", DragonTypes.NETHER, 0xF79C03, 0x9E4B2B);
    public static final DragonSpawnEggItem SKELETON_DRAGON_SPAWN_EGG = createDragonSpawnEgg("skeleton_dragon_spawn_egg", DragonTypes.SKELETON, 0xD7D7D7, 0x727F82);
    public static final DragonSpawnEggItem STORM_DRAGON_SPAWN_EGG = createDragonSpawnEgg("storm_dragon_spawn_egg", DragonTypes.STORM, 0x023C54, 0x0DA2C7);
    public static final DragonSpawnEggItem SUNLIGHT_DRAGON_SPAWN_EGG = createDragonSpawnEgg("sunlight_dragon_spawn_egg", DragonTypes.SUNLIGHT, 0xF07F07, 0xF2EA04);
    public static final DragonSpawnEggItem TERRA_DRAGON_SPAWN_EGG = createDragonSpawnEgg("terra_dragon_spawn_egg", DragonTypes.TERRA, 0x543813, 0xB3782A);
    public static final DragonSpawnEggItem WATER_DRAGON_SPAWN_EGG = createDragonSpawnEgg("water_dragon_spawn_egg", DragonTypes.WATER, 0x4F6AA6, 0x223464);
    public static final DragonSpawnEggItem WITHER_DRAGON_SPAWN_EGG = createDragonSpawnEgg("wither_dragon_spawn_egg", DragonTypes.WITHER, 0x839292, 0x383F40);
    public static final DragonSpawnEggItem ZOMBIE_DRAGON_SPAWN_EGG = createDragonSpawnEgg("zombie_dragon_spawn_egg", DragonTypes.ZOMBIE, 0x56562E, 0xA7BF2F);
    //?
    public static final VariantSwitcherItem VARIANT_SWITCHER = createItem("variant_switcher", "variant_switcher", new VariantSwitcherItem());
    //Shears
    public static final HardShearsItem DIAMOND_SHEARS = createHardShearsItem("diamond_shears", Item.ToolMaterial.DIAMOND, 345);/*
    //Carriages
    public static final CarriageItem ACACIA_CARRIAGE = createItem("acacia_carriage", new CarriageItem(CarriageTypes.ACACIA));
    public static final CarriageItem BIRCH_CARRIAGE = createItem("birch_carriage", new CarriageItem(CarriageTypes.BIRCH));
    public static final CarriageItem DARK_OAK_CARRIAGE = createItem("dark_oak_carriage", new CarriageItem(CarriageTypes.DARK_OAK));
    public static final CarriageItem JUNGLE_CARRIAGE = createItem("jungle_carriage", new CarriageItem(CarriageTypes.JUNGLE));
    public static final CarriageItem OAK_CARRIAGE = createItem("oak_carriage", new CarriageItem(CarriageTypes.OAK));
    public static final CarriageItem SPRUCE_CARRIAGE = createItem("spruce_carriage", new CarriageItem(CarriageTypes.SPRUCE));*/
    //Dragon Amulets
    public static final AmuletItem<Entity> AMULET = createItem("amulet", "dragon_amulet", new AmuletItem<>(Entity.class));
    public static final DragonAmuletItem FOREST_DRAGON_AMULET = createDragonAmuletItem("forest_dragon_amulet", DragonTypes.FOREST);
    public static final DragonAmuletItem FIRE_DRAGON_AMULET = createDragonAmuletItem("fire_dragon_amulet", DragonTypes.FIRE);
    public static final DragonAmuletItem ICE_DRAGON_AMULET = createDragonAmuletItem("ice_dragon_amulet", DragonTypes.ICE);
    public static final DragonAmuletItem WATER_DRAGON_AMULET = createDragonAmuletItem("water_dragon_amulet", DragonTypes.WATER);
    public static final DragonAmuletItem AETHER_DRAGON_AMULET = createDragonAmuletItem("aether_dragon_amulet", DragonTypes.AETHER);
    public static final DragonAmuletItem NETHER_DRAGON_AMULET = createDragonAmuletItem("nether_dragon_amulet", DragonTypes.NETHER);
    public static final DragonAmuletItem ENDER_DRAGON_AMULET = createDragonAmuletItem("ender_dragon_amulet", DragonTypes.ENDER);
    public static final DragonAmuletItem SUNLIGHT_DRAGON_AMULET = createDragonAmuletItem("sunlight_dragon_amulet", DragonTypes.SUNLIGHT);
    public static final DragonAmuletItem ENCHANT_DRAGON_AMULET = createDragonAmuletItem("enchant_dragon_amulet", DragonTypes.ENCHANT);
    public static final DragonAmuletItem STORM_DRAGON_AMULET = createDragonAmuletItem("storm_dragon_amulet", DragonTypes.STORM);
    public static final DragonAmuletItem TERRA_DRAGON_AMULET = createDragonAmuletItem("terra_dragon_amulet", DragonTypes.TERRA);
    public static final DragonAmuletItem ZOMBIE_DRAGON_AMULET = createDragonAmuletItem("zombie_dragon_amulet", DragonTypes.ZOMBIE);
    public static final DragonAmuletItem MOONLIGHT_DRAGON_AMULET = createDragonAmuletItem("moonlight_dragon_amulet", DragonTypes.MOONLIGHT);
    public static final DragonAmuletItem SKELETON_DRAGON_AMULET = createDragonAmuletItem("skeleton_dragon_amulet", DragonTypes.SKELETON);
    public static final DragonAmuletItem WITHER_DRAGON_AMULET = createDragonAmuletItem("wither_dragon_amulet", DragonTypes.WITHER);
    //Dragon Essences
    public static final DragonEssenceItem FOREST_DRAGON_ESSENCE = createDragonEssenceItem("forest_dragon_essence", DragonTypes.FOREST);
    public static final DragonEssenceItem FIRE_DRAGON_ESSENCE = createDragonEssenceItem("fire_dragon_essence", DragonTypes.FIRE);
    public static final DragonEssenceItem ICE_DRAGON_ESSENCE = createDragonEssenceItem("ice_dragon_essence", DragonTypes.ICE);
    public static final DragonEssenceItem WATER_DRAGON_ESSENCE = createDragonEssenceItem("water_dragon_essence", DragonTypes.WATER);
    public static final DragonEssenceItem AETHER_DRAGON_ESSENCE = createDragonEssenceItem("aether_dragon_essence", DragonTypes.AETHER);
    public static final DragonEssenceItem NETHER_DRAGON_ESSENCE = createDragonEssenceItem("nether_dragon_essence", DragonTypes.NETHER);
    public static final DragonEssenceItem ENDER_DRAGON_ESSENCE = createDragonEssenceItem("ender_dragon_essence", DragonTypes.ENDER);
    public static final DragonEssenceItem SUNLIGHT_DRAGON_ESSENCE = createDragonEssenceItem("sunlight_dragon_essence", DragonTypes.SUNLIGHT);
    public static final DragonEssenceItem ENCHANT_DRAGON_ESSENCE = createDragonEssenceItem("enchant_dragon_essence", DragonTypes.ENCHANT);
    public static final DragonEssenceItem STORM_DRAGON_ESSENCE = createDragonEssenceItem("storm_dragon_essence", DragonTypes.STORM);
    public static final DragonEssenceItem TERRA_DRAGON_ESSENCE = createDragonEssenceItem("terra_dragon_essence", DragonTypes.TERRA);
    public static final DragonEssenceItem ZOMBIE_DRAGON_ESSENCE = createDragonEssenceItem("zombie_dragon_essence", DragonTypes.ZOMBIE);
    public static final DragonEssenceItem MOONLIGHT_DRAGON_ESSENCE = createDragonEssenceItem("moonlight_dragon_essence", DragonTypes.MOONLIGHT);
    public static final DragonEssenceItem SKELETON_DRAGON_ESSENCE = createDragonEssenceItem("skeleton_dragon_essence", DragonTypes.SKELETON);
    public static final DragonEssenceItem WITHER_DRAGON_ESSENCE = createDragonEssenceItem("wither_dragon_essence", DragonTypes.WITHER);/*
    public static final DragonWhistleItem DRAGON_WHISTLE = createItem("dragon_whistle", new DragonWhistleItem(item()));
    //Blocks
    public static final Item DRAGON_NEST = new CraftableBlockItem(DMBlocks.DRAGON_NEST, DMItemGroups.MAIN);
    public static final Item DRAGON_CORE = new ItemBlock(DMBlocks.DRAGON_CORE).setRegistryName(DMBlocks.DRAGON_CORE.getRegistryName());*/

    static <T extends Item> T createItem(String name, String translationKey, T item) {
        ITEMS.add(item.setTranslationKey(translationKey).setRegistryName(name));
        return item;
    }

    static DragonAmuletItem createDragonAmuletItem(String name, DragonType type) {
        DragonAmuletItem item = new DragonAmuletItem(type);
        type.bindInstance(DragonAmuletItem.class, item);
        ITEMS.add(item.setTranslationKey("dragon_amulet").setRegistryName(name));
        return item;
    }

    static DragonArmorItem createDragonArmorItem(String name, String texture, int protection) {
        DragonArmorItem item = new DragonArmorItem(new ResourceLocation(DragonMountsTags.MOD_ID, texture), protection);
        ITEMS.add(item.setTranslationKey(name).setRegistryName(name));
        return item;
    }

    static DragonScaleAxeItem createDragonScaleAxeItem(String name, DragonType type, Item.ToolMaterial tier, float attackDamageModifier, float attackSpeedModifier) {
        DragonScaleAxeItem item = new DragonScaleAxeItem(tier, type, attackDamageModifier, attackSpeedModifier);
        type.bindInstance(DragonScaleAxeItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static DragonScaleAxeItem createDragonScaleAxeItem(String name, DragonType type, Item.ToolMaterial tier) {
        return createDragonScaleAxeItem(name, type, tier, 10.0F, -2.8F);
    }

    static DragonScaleBowItem createDragonScaleBowItem(String name, DragonType type, Item.ToolMaterial tier) {
        DragonScaleBowItem item = new DragonScaleBowItem(type);
        type.bindInstance(DragonScaleBowItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static DragonEssenceItem createDragonEssenceItem(String name, DragonType type) {
        DragonEssenceItem item = new DragonEssenceItem(type);
        type.bindInstance(DragonEssenceItem.class, item);
        ITEMS.add(item.setTranslationKey("dragon_essence").setRegistryName(name));
        return item;
    }

    static DragonScaleHoeItem createDragonScaleHoeItem(String name, DragonType type, Item.ToolMaterial tier) {
        DragonScaleHoeItem item = new DragonScaleHoeItem(tier, type);
        type.bindInstance(DragonScaleHoeItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static DragonScalePickaxeItem createDragonScalePickaxeItem(String name, DragonType type, Item.ToolMaterial tier) {
        DragonScalePickaxeItem item = new DragonScalePickaxeItem(tier, type);
        type.bindInstance(DragonScalePickaxeItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static DragonScaleArmorSuit createDragonScaleArmors(
            String helmet,
            String chestplate,
            String leggings,
            String boots,
            ItemArmor.ArmorMaterial material,
            DragonType type,
            IDescribableArmorEffect effect
    ) {
        DragonScaleArmorSuit suit = new DragonScaleArmorSuit(material, type, effect);
        type.bindInstance(DragonScaleArmorSuit.class, suit);
        ITEMS.add(suit.helmet.setRegistryName(helmet));
        ITEMS.add(suit.chestplate.setRegistryName(chestplate));
        ITEMS.add(suit.leggings.setRegistryName(leggings));
        ITEMS.add(suit.boots.setRegistryName(boots));
        return suit;
    }

    static DragonScalesItem createDragonScalesItem(String name, DragonType type) {
        DragonScalesItem item = new DragonScalesItem(type);
        type.bindInstance(DragonScalesItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static DragonScaleShieldItem createDragonScaleShieldItem(String name, DragonType type, ItemArmor.ArmorMaterial material) {
        DragonScaleShieldItem item = new DragonScaleShieldItem(type);
        type.bindInstance(DragonScaleShieldItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static DragonScaleShovelItem createDragonScaleShovelItem(String name, DragonType type, Item.ToolMaterial tier) {
        DragonScaleShovelItem item = new DragonScaleShovelItem(tier, type);
        type.bindInstance(DragonScaleShovelItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static DragonScaleSwordItem createDragonScaleSwordItem(String name, DragonType type, Item.ToolMaterial tier) {
        DragonScaleSwordItem item = new DragonScaleSwordItem(tier, type);
        type.bindInstance(DragonScaleSwordItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static DragonSpawnEggItem createDragonSpawnEgg(String name, DragonType type, int background, int highlight) {
        DragonSpawnEggItem item = new DragonSpawnEggItem(type, background, highlight);
        type.bindInstance(DragonSpawnEggItem.class, item);
        ITEMS.add(item.setRegistryName(name));
        return item;
    }

    static HardShearsItem createHardShearsItem(String name, Item.ToolMaterial tier, int durability) {
        HardShearsItem item = new HardShearsItem(tier);
        ITEMS.add(item.setMaxDamage(durability).setTranslationKey(name).setRegistryName(name));
        return item;
    }

    @SuppressWarnings("DataFlowIssue")
    public static void bindRepairMaterials() {
        ItemStack stack = new ItemStack(FOREST_DRAGON_SCALES);
        DMMaterials.FOREST_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.FOREST_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(FIRE_DRAGON_SCALES));
        DMMaterials.FIRE_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.FIRE_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(ICE_DRAGON_SCALES));
        DMMaterials.ICE_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.ICE_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(WATER_DRAGON_SCALES));
        DMMaterials.WATER_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.WATER_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(AETHER_DRAGON_SCALES));
        DMMaterials.AETHER_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.AETHER_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(NETHER_DRAGON_SCALES));
        DMMaterials.NETHER_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.NETHER_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(ENDER_DRAGON_SCALES));
        DMMaterials.ENDER_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.ENDER_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(SUNLIGHT_DRAGON_SCALES));
        DMMaterials.SUNLIGHT_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.SUNLIGHT_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(ENCHANT_DRAGON_SCALES));
        DMMaterials.ENCHANT_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.ENCHANT_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(STORM_DRAGON_SCALES));
        DMMaterials.STORM_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.STORM_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(TERRA_DRAGON_SCALES));
        DMMaterials.TERRA_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.TERRA_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(ZOMBIE_DRAGON_SCALES));
        DMMaterials.ZOMBIE_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.ZOMBIE_DRAGON_SCALE.setRepairItem(stack);
        stack = (new ItemStack(MOONLIGHT_DRAGON_SCALES));
        DMMaterials.MOONLIGHT_DRAGON_SCALE.setRepairItem(stack);
        DMTiers.MOONLIGHT_DRAGON_SCALE.setRepairItem(stack);
    }
}