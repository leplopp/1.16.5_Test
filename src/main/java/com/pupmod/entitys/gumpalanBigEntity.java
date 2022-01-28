package com.pupmod.entitys;

import com.pupmod.blocks.registerblocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
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
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class gumpalanBigEntity extends Animal {

public gumpalanBigEntity(EntityType<? extends Animal> type, Level worldIn) {
		
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
	 protected  Item getDropItem()
	    {
	        Object a = registerblocks.PINK_BLOCK;
			return Items.DIAMOND;
	    }
	 
	   protected void dropRareDrop(int i)
	    {
	        switch (this.random.nextInt(3))
	        {
	            case 0:
	                this.dropRareDrop(7000);
	                break;
	        }
	    }
	 
	    @Override
	    protected int getExperienceReward(Player player) {
	    	return player.experienceLevel = 1000;
	    }
	        public MobType getMobType() {
	            return MobType.UNDEAD;
	         }
	    	@Override
	    	public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
	    		return null;
	    	}
}