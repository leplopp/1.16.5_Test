package com.pupmod.entitys;

import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import sound.soundregistry;

public class ringEntity extends AnimalEntity {

	public ringEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		
		super(type, worldIn);
	}	
	@Override
	 protected void registerGoals() {
	      this.goalSelector.addGoal(0, new SwimGoal(this));
	      this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1D));
	      this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 10.0F));
	      this.goalSelector.addGoal(3, new LookRandomlyGoal(this));	
	      this.goalSelector.addGoal(4, new PanicGoal(this, 20.0D));
	      this.goalSelector.addGoal(5, new BreedGoal(this, 100.0D));
	      this.goalSelector.addGoal(7, new FollowParentGoal(this, 10.25D));
	      this.goalSelector.addGoal(8, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
	   }
	 
	 public static AttributeModifierMap.MutableAttribute setAttributes() {
		   return LivingEntity.createLivingAttributes()
		           
		           .add(Attributes.MAX_HEALTH, 100.0D)
		           .add(Attributes.FOLLOW_RANGE, 400.0D)
		           .add(Attributes.MOVEMENT_SPEED, 0.3D);      
		}
@Override
protected int getExperienceReward(PlayerEntity player) {
	return player.experienceLevel = 100;
}

@Override
protected void playStepSound(BlockPos pos, BlockState state) {
	this.playSound(soundregistry.RINGI_STEP.get(), 100.0F, 100.0F);
}

@Nullable
		@Override
		public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
			return null;
	}    
}