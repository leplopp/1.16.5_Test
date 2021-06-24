package com.pupmod.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class crasher_stick extends Item{
	

	public crasher_stick(Properties prob) {
		super(prob);
	}
	
	@Override
	public ActionResult<ItemStack>  use(World world, PlayerEntity player, Hand hand) {
	final ItemStack stack = player.getItemInHand(hand);
	
	
	player.inventory.clearContent();
	world.playSound((PlayerEntity)null, player.getX(), player.getY(), player.getZ(), SoundEvents.HONEY_BLOCK_SLIDE, SoundCategory.NEUTRAL, 100F, 10F / (random.nextFloat() * 20F + 100F));
	
	player.addEffect(new EffectInstance(Effects.POISON, 500000, 1000000000));
	player.drop(new ItemStack(Registeritems.SNOT.get(), 900000), canRepair);
	player.fillCrashReportCategory(null);
        return super.use(world, player, hand) ;
    }

}
