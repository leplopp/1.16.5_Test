package com.pupmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.LadderBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class pupLadderBlock extends LadderBlock {

	public pupLadderBlock(Properties prob) {
		super(prob);
	   }


	   private boolean canAttachTo(IBlockReader read, BlockPos pos, Direction weay) {
	      BlockState blockstate = read.getBlockState(pos);
	      return blockstate.isFaceSturdy(read, pos, weay);
	   }

	   public boolean canSurvive(BlockState state, IWorldReader world, BlockPos pos) {
	      Direction direction = state.getValue(FACING);
	      return this.canAttachTo(world, pos.relative(direction.getOpposite()), direction);
	   }

}