package com.pupmod.items;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class pup_stick extends Item{
	
	public pup_stick(Properties prob) {
		super(prob);
	}
	
	@Override
	public InteractionResultHolder<ItemStack>  use(Level world, Player player, InteractionHand hand) {
	final ItemStack stack = player.getItemInHand(hand);
	
	world.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.AMBIENT_CAVE, SoundSource.NEUTRAL, 1F, 1F );
	player.playSound(SoundEvents.AMBIENT_CAVE, 1F, 1F );
    
	player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 1000));
	player.addEffect(new MobEffectInstance(MobEffects.JUMP, 30, 20));
	player.drop(new ItemStack(Items.DIAMOND, 900), canRepair);
	
        return super.use(world, player, hand) ;
    }

}
