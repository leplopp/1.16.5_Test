package com.pupmod.items;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.feature.NoiseEffect;

public class armoritem extends ArmorItem{

	public armoritem(ArmorMaterial material, EquipmentSlot type, Properties prob) {
		super(material, type, prob);
	}
	
	
	@Override
	public void onArmorTick(ItemStack stack, Level world, Player player) {
		player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 4, 1));
		player.addEffect(new MobEffectInstance(MobEffects.JUMP, 4));
		player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.HEAL, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.LUCK, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 999999999, 999999999));
		player.addEffect(new MobEffectInstance(MobEffects.HARM, 999999999, 999999999));
		//player.drop(new ItemStack(Registeritems.PINK_BRICK.get(), 1), canRepair);
		player.causeFallDamage(999999999, 999999999, null);
		super.onArmorTick(stack, world, player);
	}


}
