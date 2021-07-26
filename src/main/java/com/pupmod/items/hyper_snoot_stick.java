package com.pupmod.items;

import net.minecraft.client.renderer.EffectInstance;
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
import net.minecraft.world.level.Level;

public class hyper_snoot_stick extends Item{
	

	public hyper_snoot_stick(Properties prob) {
		super(prob);
	}
	
	@Override
	public InteractionResultHolder<ItemStack>  use(Level world, Player player, InteractionHand hand) {
	final ItemStack stack = player.getItemInHand(hand);
	
	world.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.SLIME_BLOCK_HIT, SoundSource.NEUTRAL, 5F, 5F);
	player.playSound(SoundEvents.SLIME_BLOCK_HIT, 5F, 5F / 5F + 5F);
	player.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 10000));
	player.drop(new ItemStack(Registeritems.SNOT.get(), 900), canRepair);
	player.drop(new ItemStack(Registeritems.BLOOD.get(), 3), canRepair);
	
        return super.use(world, player, hand) ;
    }
}