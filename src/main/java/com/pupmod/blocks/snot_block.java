package com.pupmod.blocks;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BreakableBlock;
import net.minecraft.block.HoneyBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class snot_block extends BreakableBlock{

	protected static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
	public snot_block(Properties prob) {
		super(prob);
	}

	 private static boolean doesEntityDoSnotBlockSlideEffects(Entity entity) {
	      return entity instanceof LivingEntity || entity instanceof AbstractMinecartEntity || entity instanceof TNTEntity || entity instanceof BoatEntity;
	   }
	 
	  public void fallOn(World world, BlockPos pos, Entity entity, float F) {
		  entity.playSound(SoundEvents.HONEY_BLOCK_SLIDE, 1.0F, 1.0F);
	      if (!world.isClientSide) {
	    	  world.broadcastEntityEvent(entity, (byte)54);
	      }

	      if (entity.causeFallDamage(F, 0.2F)) {
	    	  entity.playSound(this.soundType.getFallSound(), this.soundType.getVolume() * 0.5F, this.soundType.getPitch() * 0.75F);
	      }

	   }
	

	 public void entityInside(BlockState state, World world, BlockPos pos, Entity entity) {
	      if (this.isSlidingDown(pos, entity)) {
	    	 this.maybeDoSlideAchievement(entity, pos);
	         this.doSlideMovement(entity);
	         this.maybeDoSlideEffects(world, entity);
	      }

	      super.entityInside(state, world, pos, entity);
	   }

	   private boolean isSlidingDown(BlockPos pos, Entity entity) {
	      if (entity.isOnGround()) {
	         return false;
	      } else if (entity.getY() > (double)pos.getY() + 0.9375D - 1.0E-7D) {
	         return false;
	      } else if (entity.getDeltaMovement().y >= -0.08D) {
	         return false;
	      } else {
	         double d0 = Math.abs((double)pos.getX() + 0.5D - entity.getX());
	         double d1 = Math.abs((double)pos.getZ() + 0.5D - entity.getZ());
	         double d2 = 0.4375D + (double)(entity.getBbWidth() / 2.0F);
	         return d0 + 1.0E-7D > d2 || d1 + 1.0E-7D > d2;
	      }
	   }
	   
	   private void maybeDoSlideAchievement(Entity entity, BlockPos pos) {
		      if (entity instanceof ServerPlayerEntity && entity.level.getGameTime() % 20L == 0L) {
		         CriteriaTriggers.HONEY_BLOCK_SLIDE.trigger((ServerPlayerEntity)entity, entity.level.getBlockState(pos));
		      }

		   }
	   
	   private void doSlideMovement(Entity entity) {
		      Vector3d vector3d = entity.getDeltaMovement();
		      if (vector3d.y < -0.13D) {
		         double d0 = -0.05D / vector3d.y;
		         entity.setDeltaMovement(new Vector3d(vector3d.x * d0, -0.05D, vector3d.z * d0));
		      } else {
		    	  entity.setDeltaMovement(new Vector3d(vector3d.x, -0.05D, vector3d.z));
		      }

		      entity.fallDistance = 0.0F;
		   }
	   
		 private void maybeDoSlideEffects(World world, Entity entity) {
		      if (doesEntityDoSnotBlockSlideEffects(entity)) {
		         if (world.random.nextInt(5) == 0) {
		        	 entity.playSound(SoundEvents.HONEY_BLOCK_SLIDE, 1.0F, 1.0F);
		         }

		         if (!world.isClientSide && world.random.nextInt(5) == 0) {
		        	 world.broadcastEntityEvent(entity, (byte)53);
		         }
		      }

		   }

	@OnlyIn(Dist.CLIENT)
	   public static void showSlideParticles(Entity entity) {
	      showParticles(entity, 5);
	   }
	@OnlyIn(Dist.CLIENT)
	   public static void showJumpParticles(Entity entity) {
	      showParticles(entity, 10);
	   }
	@OnlyIn(Dist.CLIENT)
	   private static void showParticles(Entity entity, int q) {
	      if (entity.level.isClientSide) {
	         BlockState blockstate = registerblocks.SNOT_BLOCK.get().defaultBlockState();

	         for(int i = 0; i < q; ++i) {
	        	 entity.level.addParticle(new BlockParticleData(ParticleTypes.BLOCK, blockstate), entity.getX(), entity.getY(), entity.getZ(), 0.0D, 0.0D, 0.0D);
	         }

	      }
	   }
	
}
