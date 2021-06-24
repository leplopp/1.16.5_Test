package com.pupmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.LadderBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class kirchLadderBlock extends LadderBlock {

	public kirchLadderBlock(Properties prob) {
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