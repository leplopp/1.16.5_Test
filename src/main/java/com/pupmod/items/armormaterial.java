package com.pupmod.items;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.sound.SoundEvent.SoundSourceEvent;

public enum armormaterial implements ArmorMaterial{
	
	PUP("pup", 5000000, new int[]{999999999, 999999999, 999999999, 999999999}, 5, SoundEvents.ARMOR_EQUIP_NETHERITE, 99999999999999999999.0F, 9999999999999999999999.0F, () -> {
	      return Ingredient.of(Registeritems.PINK_BRICK.get());
	   });

	   private static final int[] HEALTH_PER_SLOT = new int[]{999999999, 999999999, 999999999, 999999999};
	   private final String name;
	   private final int durabilityMultiplier;
	   private final int[] slotProtections;
	   private final int enchantmentValue;
	   private final SoundSourceEvent sound;
	   private final float toughness;
	   private final float knockbackResistance;
	   private final LazyLoadedValue<Ingredient> repairIngredient;

	   private armormaterial(String name, int d, int[] s, int f, SoundEvent event, float h, float j, Supplier<Ingredient> item) {
	      this.name = name;
	      this.durabilityMultiplier = d;
	      this.slotProtections = s;
	      this.enchantmentValue = f;
	      this.sound = event;
	      this.toughness = h;
	      this.knockbackResistance = j;
	      this.repairIngredient = new LazyLoadedValue<>(item);
	   }

	   public int getDurabilityForSlot(EquipmentSlot eq) {
	      return HEALTH_PER_SLOT[eq.getIndex()] * this.durabilityMultiplier;
	   }

	   public int getDefenseForSlot(EquipmentSlotType eq) {
	      return this.slotProtections[eq.getIndex()];
	   }

	   public int getEnchantmentValue() {
	      return this.enchantmentValue;
	   }

	   public SoundEvent getEquipSound() {
	      return this.sound;
	   }

	   public Ingredient getRepairIngredient() {
	      return this.repairIngredient.get();
	   }

	   @OnlyIn(Dist.CLIENT)
	   public String getName() {
	      return this.name;
	   }

	   public float getToughness() {
	      return this.toughness;
	   }

	   public float getKnockbackResistance() {
	      return this.knockbackResistance;
	   }


}
