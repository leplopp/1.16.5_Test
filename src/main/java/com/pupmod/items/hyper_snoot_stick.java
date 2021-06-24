package com.pupmod.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.Item.Properties;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class hyper_snoot_stick extends Item{
	

	public hyper_snoot_stick(Properties prob) {
		super(prob);
	}
	
	@Override
	public ActionResult<ItemStack>  use(World world, PlayerEntity player, Hand hand) {
	final ItemStack stack = player.getItemInHand(hand);
	
	world.playSound((PlayerEntity)null, player.getX(), player.getY(), player.getZ(), SoundEvents.SLIME_BLOCK_HIT, SoundCategory.NEUTRAL, 5F, 5F / (random.nextFloat() * 5F + 5F));
	player.playSound(SoundEvents.SLIME_BLOCK_HIT, 5F, 5F / (random.nextFloat() * 5F + 5F));
	player.addEffect(new EffectInstance(Effects.POISON, 100, 10000));
	player.drop(new ItemStack(Registeritems.SNOT.get(), 900), canRepair);
	player.drop(new ItemStack(Registeritems.BLOOD.get(), 3), canRepair);
	
        return super.use(world, player, hand) ;
    }
}