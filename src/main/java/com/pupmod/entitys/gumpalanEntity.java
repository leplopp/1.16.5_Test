package com.pupmod.entitys;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
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
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkHooks;

public class gumpalanEntity extends AnimalEntity {

public gumpalanEntity(EntityType<? extends AnimalEntity> type, World worldIn) {		
		super(type, worldIn);
	}	
	 protected void registerGoals() {
	      this.goalSelector.addGoal(0, new SwimGoal(this));
	      this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1D));
	      this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 10.0F));
	      this.goalSelector.addGoal(3, new LookRandomlyGoal(this));	
	      this.goalSelector.addGoal(4, new PanicGoal(this, 20.0D));
	      this.goalSelector.addGoal(7, new FollowParentGoal(this, 10.25D));
	   }
public static AttributeModifierMap.MutableAttribute setAttributes() {
   return LivingEntity.createLivingAttributes()
           
           .add(Attributes.MAX_HEALTH, 30.0D)
           .add(Attributes.FOLLOW_RANGE, 400.0D)
           .add(Attributes.MOVEMENT_SPEED, 1.0D);      
}
@Override
protected int getExperienceReward(PlayerEntity player) {
	return player.experienceLevel = 10000;
}
@Nullable
		@Override
		public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
			return null;
		}  
		
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}
}