package com.pupmod.items;


import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ItemTier implements IItemTier{
	
	PUP(5, 1000000000, 10000000000000.0F, 90000000000000000000000000000.0F, 5, () -> {
        return Ingredient.of(Registeritems.PINK_BRICK.get());  });

	   private final int level;
	   private final int uses;
	   private final float speed;
	   private final float damage;
	   private final int enchantmentValue;
	   private final LazyValue<Ingredient> repairIngredient;
	
	ItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.level = harvestLevelIn;
        this.uses = maxUsesIn;
        this.speed = efficiencyIn;
        this.damage = attackDamageIn;
        this.enchantmentValue = enchantabilityIn;
        this.repairIngredient = new LazyValue<Ingredient>(repairMaterialIn);
    }

	@Override
	public int getUses() {
		return this.uses;
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.damage;
	}

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}
	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

}
