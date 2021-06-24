package com.pupmod.items;


import com.pupmod.blocks.registerblocks;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class magic_stick extends Item{
	

	public magic_stick(Properties prob) {
		super(prob);
	}
	
	@Override
	public ActionResult<ItemStack>  use(World world, PlayerEntity player, Hand hand) {
	final ItemStack stack = player.getItemInHand(hand);
	
	world.playSound((PlayerEntity)null, player.getX(), player.getY(), player.getZ(), SoundEvents.AMBIENT_CAVE, SoundCategory.NEUTRAL, 1F, 1F / (random.nextFloat() * 0.4F + 0.8F));
	player.playSound(SoundEvents.AMBIENT_CAVE, 1F, 1F / (random.nextFloat() * 0.4F + 0.8F));
   
	
	player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 100, 10));
	player.drop(new ItemStack(Items.DIAMOND, 900000), canRepair);
	player.drop(new ItemStack(Items.GOLD_INGOT, 900000), canRepair);
	player.drop(new ItemStack(Items.IRON_INGOT, 900000), canRepair);
	player.drop(new ItemStack(Blocks.COMMAND_BLOCK, 9000), canRepair);
	player.drop(new ItemStack(registerblocks.PINK_BLOCK.get(), 9000), canRepair);
	
        return super.use(world, player, hand) ;
    }
	
}
