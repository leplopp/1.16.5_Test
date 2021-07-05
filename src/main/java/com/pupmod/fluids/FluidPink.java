package com.pupmod.fluids;

import java.util.Random;

import javax.annotation.Nullable;
import com.pupmod.blocks.registerblocks;
import com.pupmod.items.Registeritems;
import com.pupmod.lists.liquid;
import com.pupmod.lists.liquid.Tag;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
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
	   @OnlyIn(Dist.CLIENT)
	   public void animateTick(World p_204522_1_, BlockPos p_204522_2_, FluidState p_204522_3_, Random p_204522_4_) {
	      if (!p_204522_3_.isSource() && !p_204522_3_.getValue(FALLING)) {
	         if (p_204522_4_.nextInt(64) == 0) {
	            p_204522_1_.playLocalSound((double)p_204522_2_.getX() + 0.5D, (double)p_204522_2_.getY() + 0.5D, (double)p_204522_2_.getZ() + 0.5D, SoundEvents.WATER_AMBIENT, SoundCategory.BLOCKS, p_204522_4_.nextFloat() * 0.25F + 0.75F, p_204522_4_.nextFloat() + 0.5F, false);
	         }
	      } else if (p_204522_4_.nextInt(10) == 0) {
	         p_204522_1_.addParticle(ParticleTypes.UNDERWATER, (double)p_204522_2_.getX() + p_204522_4_.nextDouble(), (double)p_204522_2_.getY() + p_204522_4_.nextDouble(), (double)p_204522_2_.getZ() + p_204522_4_.nextDouble(), 0.0D, 0.0D, 0.0D);
	      }

	   }
	@Override
	protected void beforeDestroyingBlock(IWorld p_205580_1_, BlockPos p_205580_2_, BlockState p_205580_3_) {
	    TileEntity tileentity = p_205580_3_.hasTileEntity() ? p_205580_1_.getBlockEntity(p_205580_2_) : null;
	      Block.dropResources(p_205580_3_, p_205580_1_, p_205580_2_, tileentity);
	}

	@Override
	protected int getSlopeFindDistance(IWorldReader p_185698_1_) {
		return 8;
	}
	   @OnlyIn(Dist.CLIENT)
	   public IParticleData getDripParticle() {
	      return ParticleTypes.DRIPPING_WATER;
	   }
	@Override
	protected int getDropOff(IWorldReader p_204528_1_) {
		return 1;
	}

	@Override
	public Item getBucket() {
		return Registeritems.PINK_LIQUID.get();
	}

	@Override
	protected boolean canBeReplacedWith(FluidState state, IBlockReader read, BlockPos pos,Fluid fluid, Direction rule) {
		return rule == Direction.UP && !fluid.is(Tag.FLUID_PINK);
	}

	@Override
	public int getTickDelay(IWorldReader p_205569_1_) {
		return 8;
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
	
	 @Override
	protected FluidAttributes createAttributes() {
		 return  FluidAttributes.builder(RegistryFluids.location("blocks/pink_fluid_still"), RegistryFluids.location("blocks/pink_fluid_flowing"))
				 .translationKey("block.pupmod.pink_fluid")
				 .build(this);
}
	 public static class Flowing extends FluidPink{

		 @Override
		protected void createFluidStateDefinition(
				net.minecraft.state.StateContainer.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		
		}

			@Override
			public int getAmount(FluidState state) {
				return state.getValue(FluidPink.LEVEL);
			}
		 
		@Override
		public boolean isSource(FluidState state) {
			return false;
		}

		 
	 }
	 
	 public static class Source extends FluidPink{

			@Override
			public int getAmount(FluidState state) {
				return 8;
			}
		@Override
		public boolean isSource(FluidState state) {
			return true;
		}

		 
	 }

}
