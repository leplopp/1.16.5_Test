package com.pupmod.entitys;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import sound.soundregistry;

public class puppigEntity extends Animal {

public puppigEntity(EntityType<? extends Animal> type, Level worldIn) {
		
		super(type, worldIn);
	}	

protected void registerGoals() {
    this.goalSelector.addGoal(0, new FloatGoal(this));
  // this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 5D));
    this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 1000.0F));
   // this.goalSelector.addGoal(3, new LookRandomlyGoal(this));	
    this.goalSelector.addGoal(4, new PanicGoal(this, 20.0D));
    this.goalSelector.addGoal(5, new BreedGoal(this, 100.0D));
    this.goalSelector.addGoal(7, new FollowParentGoal(this, 10.25D));
    this.goalSelector.addGoal(8, new WaterAvoidingRandomStrollGoal(this, 1.0D));
 }

	        //this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	        //this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1000000.0D));

public static AttributeSupplier.Builder createAttributes() {
    return Animal.createLivingAttributes()
	           
	           .add(Attributes.MAX_HEALTH, 1.0D)
	           .add(Attributes.FOLLOW_RANGE, 400.0D)
	           .add(Attributes.MOVEMENT_SPEED, (double)1.0F);      
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
		protected int getExperienceReward(Player player) {
			return player.experienceLevel = 1000;
		}

		@Override
		public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
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
