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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class crasher_stick extends Item{
	

	public crasher_stick(Properties prob) {
		super(prob);
	}
	
	@Override
	public InteractionResultHolder<ItemStack>  use(Level world, Player player, InteractionHand hand) {
	final ItemStack stack = player.getItemInHand(hand);
	
	
	player.getInventory().clearContent();
	world.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.HONEY_BLOCK_SLIDE, SoundSource.NEUTRAL, 100F, 10F / 20F + 100F);
	
	player.addEffect(new MobEffectInstance(MobEffects.POISON, 500000, 1000000000));
	player.drop(new ItemStack(Registeritems.SNOT.get(), 900000), canRepair);
	player.fillCrashReportCategory(null);
        return super.use(world, player, hand) ;
    }

}
