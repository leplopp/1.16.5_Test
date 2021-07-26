package com.pupmod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.world.WorldEvent;

public class block_pink_bricks extends Block{

	public block_pink_bricks(Properties prob) {
		super(prob);
	}
	
	
	@Override
	public ActionResultType use(BlockState state, Level world, BlockPos pos,
			PlayerEntity player, Hand hand, BlockRayTraceResult trace) {
		
		player.jumpFromGround();
		player.noPhysics = true; 
		player.setNoGravity(isPossibleToRespawnInThis());
		hand.compareTo(hand);
		player.drop(new ItemStack(registerblocks.PINK_BRICKS.get(), 1), dynamicShape);
		
		return super.use(state, world, pos, player, hand, trace);
		FurnaceBlock
	}
	

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int f,int g) {
		world.disconnect();
		return super.triggerEvent(state, world, pos, f, g);
	}
}
