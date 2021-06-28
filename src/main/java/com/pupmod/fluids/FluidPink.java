package com.pupmod.fluids;

import com.pupmod.blocks.registerblocks;
import com.pupmod.items.Registeritems;
import com.pupmod.lists.liquid;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.fluids.FluidAttributes;

public abstract class FluidPink extends FlowingFluid{

	@Override
	public Fluid getFlowing() {
		return liquid.flowing_pink_fluid;
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
		return 100.0f;
	}

	@Override
	protected BlockState createLegacyBlock(FluidState state) {
		return registerblocks.PINK_FLUID.get().defaultBlockState().setValue(FlowingFluidBlock.LEVEL, Integer.valueOf(getLegacyLevel(state)));
	}
	
	@Override
	public boolean isSame(Fluid fluidIn) {
		return fluidIn == liquid.pink_fluid || fluidIn == liquid.flowing_pink_fluid;
	}
	/* @Override
	protected FluidAttributes createAttributes() {
		FluidAttributes.builder(RegistryFluids.class.)
		
	}*/

}
