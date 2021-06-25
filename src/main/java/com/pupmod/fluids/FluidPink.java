package com.pupmod.fluids;

import com.pupmod.items.Registeritems;
import com.pupmod.lists.liquid;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public abstract class FluidPink extends FlowingFluid{

	@Override
	public Fluid getFlowing() {
		return liquid.FLOWING_PINK_FLUID;
	}

	@Override
	public Fluid getSource() {
		return liquid.pink_fluid;
	}

	@Override
	protected boolean canConvertToSource() {
		return true;
	}

	@Override
	protected void beforeDestroyingBlock(IWorld p_205580_1_, BlockPos p_205580_2_, BlockState p_205580_3_) {
		
	}

	@Override
	protected int getSlopeFindDistance(IWorldReader p_185698_1_) {
		return 8;
	}

	@Override
	protected int getDropOff(IWorldReader p_204528_1_) {
		return 16;
	}

	@Override
	public Item getBucket() {
		return Registeritems.PINK_LIQUID.get();
	}

	@Override
	protected boolean canBeReplacedWith(FluidState state, IBlockReader read, BlockPos pos,Fluid fluid, Direction rule) {
		return rule == Direction.DOWN && !fluid.is(liquid.Tags.PINK_FLUID);
	}

	@Override
	public int getTickDelay(IWorldReader p_205569_1_) {
		return 60;
	}

	@Override
	protected float getExplosionResistance() {
		return 100;
	}

	@Override
	protected BlockState createLegacyBlock(FluidState p_204527_1_) {
		return null;
	}


}
