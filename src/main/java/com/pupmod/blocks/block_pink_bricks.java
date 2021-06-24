package com.pupmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.CraftingResultSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class block_pink_bricks extends Block{

	public block_pink_bricks(Properties prob) {
		super(prob);
	}
	@Override
	public ActionResultType use(BlockState state, World world, BlockPos pos,
			PlayerEntity player, Hand hand, BlockRayTraceResult trace) {
		
		player.jumpFromGround();
		player.noPhysics = true; 
		player.setNoGravity(isPossibleToRespawnInThis());
		hand.compareTo(hand);
		player.drop(new ItemStack(registerblocks.PINK_BRICKS.get(), 1), dynamicShape);
		
		return super.use(state, world, pos, player, hand, trace);
	}
	
	@Override
	public boolean triggerEvent(BlockState state, World world, BlockPos pos, int f,int g) {
		world.disconnect();
		return super.triggerEvent(state, world, pos, f, g);
	}
}
