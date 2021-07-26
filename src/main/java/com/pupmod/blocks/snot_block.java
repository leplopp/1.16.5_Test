package com.pupmod.blocks;

import com.mojang.math.Vector3d;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class snot_block extends Block{

	protected static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
	public snot_block(Properties prob) {
		super(prob);
	}

	 private static boolean doesEntityDoSnotBlockSlideEffects(Entity entity) {
	      return entity instanceof LivingEntity || entity instanceof Minecart || entity instanceof PrimedTnt || entity instanceof Boat;
	   }
	 
	  public void fallOn(Level world, BlockPos pos, Entity entity, float F) {
		  entity.playSound(SoundEvents.HONEY_BLOCK_SLIDE, 1.0F, 1.0F);
	      if (!world.isClientSide) {
	    	  world.broadcastEntityEvent(entity, (byte)54);
	      }

	      if (entity.causeFallDamage(F, 0.2F, null)) {
	    	  entity.playSound(this.soundType.getFallSound(), this.soundType.getVolume() * 0.5F, this.soundType.getPitch() * 0.75F);
	      }

	   }
	

	 public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity) {
	      if (this.isSlidingDown(pos, entity)) {
	    	 this.maybeDoSlideAchievement(entity, pos);
	        // this.doSlideMovement(entity);
	         //this.maybeDoSlideEffects(world, entity);
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
		      if (entity instanceof ServerPlayer && entity.level.getGameTime() % 20L == 0L) {
		         CriteriaTriggers.HONEY_BLOCK_SLIDE.trigger((ServerPlayer)entity, entity.level.getBlockState(pos));
		      }

		   }
	   
	   
		 private void maybeDoSlideEffects(Level world, Entity entity) {
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
	        	// entity.level.addParticle(new (ParticleTypes.BLOCK, blockstate), entity.getX(), entity.getY(), entity.getZ(), 0.0D, 0.0D, 0.0D);
	         }

	      }
	   }
	
}
