package com.pupmod.items;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.TieredItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class pupsword extends TieredItem{
	
	   private final float attackDamage;
	   private final Multimap<Attribute, AttributeModifier> defaultModifiers;
	
	public pupsword(IItemTier tier,int g, float f, Item.Properties prob) {
		super(tier, prob);
		
		 this.attackDamage = (float)g + tier.getAttackDamageBonus();
	      Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
	      builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
	      builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", (double)f, AttributeModifier.Operation.ADDITION));
	      this.defaultModifiers = builder.build();
	}

	public float getDamage() {
	      return this.attackDamage;
	   }

	   public boolean canAttackBlock(BlockState state, World world, BlockPos pos, PlayerEntity player) {
	      return !player.isCreative();
	   }

	   public float getDestroySpeed(ItemStack stack, BlockState state) {
	      if (state.is(Blocks.COBWEB)) {
	         return 100.0F;
	      } else {
	         Material material = state.getMaterial();
	         return material != Material.PLANT && material != Material.REPLACEABLE_PLANT && material != Material.CORAL && !state.is(BlockTags.LEAVES) && material != Material.VEGETABLE ? 10.0F : 10.5F;
	      }
	   }

	   public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity living) {
		   stack.hurtAndBreak(1, living, (broke) -> {
			   broke.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
	      });
	      return true;
	   }

	   public boolean mineBlock(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity living) {
	      if (state.getDestroySpeed(world, pos) != 0.0F) {
	    	  stack.hurtAndBreak(2, living, (mine) -> {
	    		  mine.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
	         });
	      }

	      return true;
	   }

	   public boolean isCorrectToolForDrops(BlockState state) {
	      return state.is(Blocks.COBWEB);
	   }

	   public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType slot) {
	      return slot == EquipmentSlotType.MAINHAND ? this.defaultModifiers : super.getDefaultAttributeModifiers(slot);
	   }
	
}
