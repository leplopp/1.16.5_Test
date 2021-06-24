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


public class snoot_stick extends Item{
	

	public snoot_stick(Properties prob) {
		super(prob);
}	
	
	public ActionResult<ItemStack>  use(World world, PlayerEntity player, Hand hand) {
		final ItemStack stack = player.getItemInHand(hand);
		
		world.playSound((PlayerEntity)null, player.getX(), player.getY(), player.getZ(), SoundEvents.HONEY_BLOCK_PLACE, SoundCategory.NEUTRAL, 1F, 1F / (random.nextFloat() * 2F + 1F));

		player.addEffect(new EffectInstance(Effects.POISON, 5, 10));
		player.drop(new ItemStack(Registeritems.SNOT.get(), 9), canRepair);
		
	        return super.use(world, player, hand) ;
	    }

}
