package com.pupmod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.pupmod.items.Registeritems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.StateContainer;
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

public abstract class pinkFluid extends FlowingFluid {

	@Override
	public Fluid getFlowing() {
		return pupFluids.FLOWING_PINK_FLUID;
		}
	@Override
	public Fluid getSource() {
		return pupFluids.PINK_FLUID;
		}
	@Override
	public Item getBucket() {
		return Registeritems.PINK_LIQUID.get();
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
	   @Nullable
	   @OnlyIn(Dist.CLIENT)
	   public IParticleData getDripParticle() {
	      return ParticleTypes.DRIPPING_WATER;
	   }
	@Override
	protected boolean canConvertToSource() {
		return true;
	}
	  protected void beforeDestroyingBlock(IWorld p_205580_1_, BlockPos p_205580_2_, BlockState p_205580_3_) {
	      TileEntity tileentity = p_205580_3_.hasTileEntity() ? p_205580_1_.getBlockEntity(p_205580_2_) : null;
	      Block.dropResources(p_205580_3_, p_205580_1_, p_205580_2_, tileentity);
	   }

	@Override
	protected int getSlopeFindDistance(IWorldReader read) {
		return 8;
	}

	@Override
	protected int getDropOff(IWorldReader read) {
		return 1;
	}
	@Override
	protected boolean canBeReplacedWith(FluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_,
			Fluid p_215665_4_, Direction p_215665_5_) {
		return false;
	}
	  public boolean isSame(Fluid liq) {
	      return liq == pupFluids.PINK_FLUID || liq == pupFluids.FLOWING_PINK_FLUID;
	   }
	@Override
	public int getTickDelay(IWorldReader p_205569_1_) {
		return 6;
	}

	@Override
	protected float getExplosionResistance() {
		return 1000.0F;
	}
	   public BlockState createLegacyBlock(FluidState p_204527_1_) {
		      return Blocks.WATER.defaultBlockState().setValue(FlowingFluidBlock.LEVEL, Integer.valueOf(getLegacyLevel(p_204527_1_)));
		   }

	   public static class Flowing extends WaterFluid {
		      protected void createFluidStateDefinition(StateContainer.Builder<Fluid, FluidState> p_207184_1_) {
		         super.createFluidStateDefinition(p_207184_1_);
		         p_207184_1_.add(LEVEL);
		      }

		      public int getAmount(FluidState p_207192_1_) {
		         return p_207192_1_.getValue(LEVEL);
		      }

		      public boolean isSource(FluidState p_207193_1_) {
		         return false;
		      }
		   }

		   public static class Source extends WaterFluid {
		      public int getAmount(FluidState p_207192_1_) {
		         return 8;
		      }

		      public boolean isSource(FluidState p_207193_1_) {
		         return true;
		      }
		   }

}
