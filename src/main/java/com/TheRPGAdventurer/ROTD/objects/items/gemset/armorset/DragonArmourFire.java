package com.TheRPGAdventurer.ROTD.objects.items.gemset.armorset;

import com.TheRPGAdventurer.ROTD.objects.items.EnumItemBreedTypes;
import net.minecraft.inventory.EntityEquipmentSlot;

import static com.TheRPGAdventurer.ROTD.inits.DMArmorEffects.FIRE_EFFECT;

public class DragonArmourFire extends DragonArmourBase {
	public DragonArmourFire(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn, unlocalizedName, EnumItemBreedTypes.FIRE, FIRE_EFFECT);
	}
}
