package com.pupmod.items;

import java.util.Set;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TieredItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ToolItem extends TieredItem{

	   private final Set<Block> blocks;
	   protected final float speed;
	   private final float attackDamageBaseline;
	   private final Multimap<Attribute, AttributeModifier> defaultModifiers;

	   public ToolItem(float g, float f, IItemTier item, Set<Block> block, Item.Properties prob) {
	      super(item, prob);
	      this.blocks = block;
	      this.speed = item.getSpeed();
	      this.attackDamageBaseline = g + item.getAttackDamageBonus();
	      Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
	      builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", (double)this.attackDamageBaseline, AttributeModifier.Operation.ADDITION));
	      builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", (double)f, AttributeModifier.Operation.ADDITION));
	      this.defaultModifiers = builder.build();
	   }

	   public float getDestroySpeed(ItemStack item, BlockState state) {
	      if (getToolTypes(item).stream().anyMatch(e -> state.isToolEffective(e))) return speed;
	      return this.blocks.contains(state.getBlock()) ? this.speed : 0.0F;
	   }

	   public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity living) {
		   stack.hurtAndBreak(2, living, (hurt) -> {
			   hurt.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
	      });
	      return true;
	   }

	   public boolean mineBlock(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity) {
	      if (!world.isClientSide && state.getDestroySpeed(world, pos) != 0.0F) {
	    	  stack.hurtAndBreak(1, entity, (hurt) -> {
	    		  hurt.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
	         });
	      }

	      return true;
	   }

	   public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType slot) {
	      return slot == EquipmentSlotType.MAINHAND ? this.defaultModifiers : super.getDefaultAttributeModifiers(slot);
	   }

	   public float getAttackDamage() {
	      return this.attackDamageBaseline;
	   }

}
