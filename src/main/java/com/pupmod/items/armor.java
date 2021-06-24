package com.pupmod.items;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class armor extends ArmorItem{

	public armor(IArmorMaterial material, EquipmentSlotType type, Properties prob) {
		super(material, type, prob);
	}
	
}
/*
	public armor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int armorType) {
		super(p_i45325_1_, 0, armorType);
		
		switch(armorType)	{
		case 1: setUnlocalizedName("pup_1"); break;
		case 3: setUnlocalizedName("pup_2"); break;
		case 2: setUnlocalizedName("pup_3"); break;
		case 0: setUnlocalizedName("pup_4"); break;
		}
		
		setCreativeTab(pupmod.modi);
		}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(slot == 0 || slot == 1 || slot == 3)	{
			return "pupmod:textures/armor/pup1_layer.png";
		} else if(slot == 2)	{
			return "pupmod:textures/armor/pup2_layer.png";
		} else {
			return null;
		}
		
		
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 400));
		player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 4, 1));
		player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 4));
		player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 400));
		player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 400));
		player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 400));
		player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 400));
		player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 400));
		player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 400, 400));
		player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 400));
		super.onArmorTick(world, player, itemStack);
	}
}
	
	*/