package com.pupmod.items;


import com.pupmod.blocks.registerblocks;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class magic_stick extends Item{
	

	public magic_stick(Properties prob) {
		super(prob);
	}
	

	@Override
	public InteractionResultHolder<ItemStack>  use(Level world, Player player, InteractionHand hand) {
	final ItemStack stack = player.getItemInHand(hand);
	
	world.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.AMBIENT_CAVE, SoundSource.NEUTRAL, 1F, 1F);
	player.playSound(SoundEvents.AMBIENT_CAVE, 1F, 1F );
   
	
	player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 10));
	player.drop(new ItemStack(Items.DIAMOND, 900000), canRepair);
	player.drop(new ItemStack(Items.GOLD_INGOT, 900000), canRepair);
	player.drop(new ItemStack(Items.IRON_INGOT, 900000), canRepair);
	player.drop(new ItemStack(Blocks.COMMAND_BLOCK, 9000), canRepair);
	player.drop(new ItemStack(registerblocks.PINK_BLOCK.get(), 9000), canRepair);
	
        return super.use(world, player, hand) ;
    }
	
}
