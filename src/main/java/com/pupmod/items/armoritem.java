package com.pupmod.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class armoritem extends ArmorItem{

	public armoritem(IArmorMaterial material, EquipmentSlotType type, Properties prob) {
		super(material, type, prob);
	}
	
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.DIG_SPEED, 4, 1));
		player.addEffect(new EffectInstance(Effects.JUMP, 4));
		player.addEffect(new EffectInstance(Effects.INVISIBILITY, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.HEAL, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.WATER_BREATHING, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.REGENERATION, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.ABSORPTION, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.CONDUIT_POWER, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.LUCK, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.SATURATION, 999999999, 999999999));
		player.addEffect(new EffectInstance(Effects.HARM, 999999999, 999999999));
		//player.drop(new ItemStack(Registeritems.PINK_BRICK.get(), 1), canRepair);
		player.causeFallDamage(999999999, 999999999);
		super.onArmorTick(stack, world, player);
	}


}
