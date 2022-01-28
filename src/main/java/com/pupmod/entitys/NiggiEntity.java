package com.pupmod.entitys;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.EatBlockGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.memory.WalkTarget;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import sound.soundregistry;

public class NiggiEntity extends Monster  {
	public NiggiEntity(EntityType<? extends Monster> entityType, Level worldIn) {		
		super(entityType, worldIn);
	}	
	@Override
	   protected void registerGoals() {
		      this.goalSelector.addGoal(0, new FloatGoal(this));
		     // this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 2D));
		      this.goalSelector.addGoal(7, new FollowMobGoal(this, 50D, 100, 100));
		      this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
		      this.goalSelector.addGoal(1, new EatBlockGoal(this));
		      this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 8.0F));	
		      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Player.class, true));
		      this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));

		   }
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 100.0D)
                .add(Attributes.MAX_HEALTH, 20000.0f)
                .add(Attributes.FOLLOW_RANGE, 400.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.4D)
                ;      
    }
    protected void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
        this.playSound(soundregistry.NIGGISOUND.get(), 0.15F, 1.0F);
     }
    public MobType getMobType() {
        return MobType.UNDEAD;
     }
    
    @Override
    public int getMaxSpawnClusterSize() {
    	return 40;
    }

    public static boolean getRandom(Random p_175510_0_) {
        int i = p_175510_0_.nextInt(100);
           return p_175510_0_.nextInt(1000) == 0 ;
        }
     
    
    @Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_213386_1_, DifficultyInstance p_213386_2_, MobSpawnType p_213386_3_, @Nullable SpawnGroupData p_213386_4_, @Nullable CompoundTag p_213386_5_) {
    	p_213386_4_= super.finalizeSpawn(p_213386_1_, p_213386_2_, p_213386_3_, p_213386_4_, p_213386_5_);
    	NiggiEntity.getRandom(p_213386_1_.getRandom());
		return p_213386_4_;
    
    }
    protected float getStandingEyeHeight(Pose p_213348_1_, EntityDimensions p_213348_2_) {
        return 0.95F * p_213348_2_.height;
     }
    
    @Override
    protected int getExperienceReward(Player player) {
    	return 1000000;
    }
    
    public boolean canHoldItem(ItemStack p_34332_) {
        return p_34332_.is(Items.EGG) && this.isBaby() && this.isPassenger() ? false : super.canHoldItem(p_34332_);
     }

     public boolean wantsToPickUp(ItemStack p_182400_) {
        return p_182400_.is(Items.GLOW_INK_SAC) ? false : super.wantsToPickUp(p_182400_);
     }
} 