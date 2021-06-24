package com.pupmod.items;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum armormaterial implements IArmorMaterial{
	
	PUP("pup", 5000000, new int[]{999999999, 999999999, 999999999, 999999999}, 5, SoundEvents.ARMOR_EQUIP_NETHERITE, 99999999999999999999.0F, 9999999999999999999999.0F, () -> {
	      return Ingredient.of(Registeritems.PINK_BRICK.get());
	   });

	   private static final int[] HEALTH_PER_SLOT = new int[]{999999999, 999999999, 999999999, 999999999};
	   private final String name;
	   private final int durabilityMultiplier;
	   private final int[] slotProtections;
	   private final int enchantmentValue;
	   private final SoundEvent sound;
	   private final float toughness;
	   private final float knockbackResistance;
	   private final LazyValue<Ingredient> repairIngredient;

	   private armormaterial(String name, int d, int[] s, int f, SoundEvent event, float h, float j, Supplier<Ingredient> item) {
	      this.name = name;
	      this.durabilityMultiplier = d;
	      this.slotProtections = s;
	      this.enchantmentValue = f;
	      this.sound = event;
	      this.toughness = h;
	      this.knockbackResistance = j;
	      this.repairIngredient = new LazyValue<>(item);
	   }

	   public int getDurabilityForSlot(EquipmentSlotType eq) {
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
