package com.pupmod.entitys;

import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;
import com.pupmod.items.Registeritems;
import com.pupmod.items.pupEggs;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.entity.CowRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.IPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkHooks;
import sound.soundregistry;

public class PuhEntity extends AnimalEntity {

	public PuhEntity(EntityType<? extends PuhEntity> type, World worldIn) {
		
		super(type, worldIn);
	}	
		
	 protected void registerGoals() {
	      this.goalSelector.addGoal(0, new SwimGoal(this));
	      this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1D));
	      this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 10.0F));
	      this.goalSelector.addGoal(3, new LookRandomlyGoal(this));	
	      this.goalSelector.addGoal(4, new PanicGoal(this, 20.0D));
	      this.goalSelector.addGoal(5, new BreedGoal(this, 100.0D));
	      this.goalSelector.addGoal(6, new TemptGoal(this, 1.25D, Ingredient.of(Items.WHEAT), false));
	      this.goalSelector.addGoal(7, new FollowParentGoal(this, 10.25D));
	      this.goalSelector.addGoal(8, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
	   }
public static AttributeModifierMap.MutableAttribute setAttributes() {
   return LivingEntity.createLivingAttributes()
           
           .add(Attributes.MAX_HEALTH, 10000000000.0D)
           .add(Attributes.FOLLOW_RANGE, 400.0D)
           .add(Attributes.MOVEMENT_SPEED, (double)0.3F);      
}

protected SoundEvent getAmbientSound() {
    return soundregistry.PUH.get();
 }

 protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
    return soundregistry.PUH.get();
 }

 protected SoundEvent getDeathSound() {
    return soundregistry.PUH.get();
 }

 protected void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
    this.playSound(SoundEvents.COW_STEP, 0.15F, 1.0F);
 }
 protected float getSoundVolume() {
     return 0.4F;
  }

@Override
protected int getExperienceReward(PlayerEntity player) {
	return player.experienceLevel = 100;
}

public IPacket<?> createSpawnPacket() {
	return NetworkHooks.getEntitySpawningPacket(this);
}
public ActionResultType mobInteract(PlayerEntity p_230254_1_, Hand p_230254_2_) {
    ItemStack itemstack = p_230254_1_.getItemInHand(p_230254_2_);
    if (itemstack.getItem() == Items.BUCKET && !this.isBaby()) {
       p_230254_1_.playSound(SoundEvents.COW_MILK, 1.0F, 1.0F);
       ItemStack itemstack1 = DrinkHelper.createFilledResult(itemstack, p_230254_1_, Items.MILK_BUCKET.getDefaultInstance());
       p_230254_1_.setItemInHand(p_230254_2_, itemstack1);
       return ActionResultType.sidedSuccess(this.level.isClientSide);
    } else {
       return super.mobInteract(p_230254_1_, p_230254_2_);
    }
}
@Override
protected float getStandingEyeHeight(Pose p_213348_1_, EntitySize p_213348_2_) {
    return this.isBaby() ? p_213348_2_.height * 0.95F : 1.3F;
 }

@Nullable
@Override
public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
	return null;
}

@Override
public void setDropChance(EquipmentSlotType type , float p_184642_2_) {
	super.setDropChance(type, p_184642_2_);
}
public ActionResultType checkAndHandleImportantInteractions(PlayerEntity p_233661_1_, Hand p_233661_2_) {
    ItemStack itemstack = p_233661_1_.getItemInHand(p_233661_2_);
    if (itemstack.getItem() == Items.LEAD && this.canBeLeashed(p_233661_1_)) {
       this.setLeashedTo(p_233661_1_, true);
       itemstack.shrink(1);
       return ActionResultType.sidedSuccess(this.level.isClientSide);
    } else {
       if (itemstack.getItem() == Items.NAME_TAG) {
          ActionResultType actionresulttype = itemstack.interactLivingEntity(p_233661_1_, this, p_233661_2_);
          if (actionresulttype.consumesAction()) {
             return actionresulttype;
          }
       }

       if (itemstack.getItem() instanceof pupEggs) {
          if (this.level instanceof ServerWorld) {
        	  pupEggs spawneggitem = (pupEggs)itemstack.getItem();
             Optional<MobEntity> optional = spawneggitem.spawnOffspringFromSpawnEgg(p_233661_1_, this, (EntityType)this.getType(), (ServerWorld)this.level, this.position(), itemstack);
             optional.ifPresent((p_233658_2_) -> {
                this.onOffspringSpawnedFromEgg(p_233661_1_, p_233658_2_);
             });
             return optional.isPresent() ? ActionResultType.SUCCESS : ActionResultType.PASS;
          } else {
             return ActionResultType.CONSUME;
          }
       } else {
          return ActionResultType.PASS;
       }
    }
 }

}

/*	
	
	this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1000000.0D));
	        this.tasks.addTask(7, new EntityAIWander(this, 30.0D));

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
}*/