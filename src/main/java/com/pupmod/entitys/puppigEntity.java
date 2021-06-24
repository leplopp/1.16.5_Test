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
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import sound.soundregistry;

public class puppigEntity extends AnimalEntity {

	public puppigEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
		
	}
		
		protected void registerGoals() {
		      this.goalSelector.addGoal(0, new SwimGoal(this));
		      this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 0.8));
		      this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 10.0F));
		      this.goalSelector.addGoal(3, new LookRandomlyGoal(this));	
		      this.goalSelector.addGoal(4, new PanicGoal(this, 20.0D));
		      this.goalSelector.addGoal(5, new BreedGoal(this, 100.0D));
		      this.goalSelector.addGoal(6, new TemptGoal(this, 10.25D, Ingredient.of(Items.WHEAT), false));
		      this.goalSelector.addGoal(7, new FollowParentGoal(this, 100.25D));
		      this.goalSelector.addGoal(8, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		   }

		public static AttributeModifierMap.MutableAttribute setAttributes() {
			   return LivingEntity.createLivingAttributes()
			           
			           .add(Attributes.MAX_HEALTH, 10000000000000.0D)
			           .add(Attributes.FOLLOW_RANGE, 400000.0D)
			           .add(Attributes.MOVEMENT_SPEED, (double)0.2F);      
			}

		 protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
		    return soundregistry.HUNGERAXEL.get();
		 }

		 protected SoundEvent getDeathSound() {
		    return soundregistry.PUH.get();
		 }

		 protected void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
		    this.playSound(SoundEvents.PIG_STEP, 0.15F, 1.0F);
		 }
		 protected float getSoundVolume() {
		     return 0.5F;
		  }

		@Override
		protected int getExperienceReward(PlayerEntity player) {
			return player.experienceLevel = 1000;
		}
	    @Nullable
	@Override
	public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {

		return null;
	}
}
		
/*		
		  	this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1000000.0D));
	        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
	        this.tasks.addTask(7, new EntityAIWander(this, 30.0D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 1000.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.experienceValue = 600;
	}
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1000);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(100000000);
	
	}
	 protected  Item getDropItem()
	    {
			return Items.diamond;
	    }
	 public EnumCreatureAttribute getCreatureAttribute()
	    {
	        return EnumCreatureAttribute.UNDEAD;
	    }

	    protected void dropRareDrop(int p_70600_1_)
	    {
	        switch (this.rand.nextInt(3))
	        {
	            case 0:
	                this.dropItem(Items.diamond, 100000000);
	                break;
	        }
	    }
	    protected int getExperiencePoints(EntityPlayer p_70693_1_)
	    {
	        if (this.isChild())
	        {
	            this.experienceValue = (int) (float)(this.experienceValue * 50000000.0F);
	        }

	        return super.getExperiencePoints(p_70693_1_);

	   
	   }
	    
	    protected String getHurtSound()
	    {
	        return "pupmod:hungeraxel";
	    }

	 
	    protected String getDeathSound()
	    {
	        return "pupmod:hungeraxel";
	    }
	   
	    @Override
	    public void playSound(String name, float volume, float pitch) {
	    	super.playSound("pupmod:hungeraxel", 1.0F, 0.9F);
	    }
	    
	    
	   
}
*/
