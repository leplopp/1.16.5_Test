package com.pupmod.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import com.pupmod.pupmod;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.entitycreatortypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.inventory.container.DispenserContainer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.spawner.AbstractSpawner;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

public class pupEggs extends SpawnEggItem /*extends Item*/{

	protected static final List<pupEggs> UNADDED_EGGS = new ArrayList<>();
	
	protected static DefaultDispenseItemBehavior behavior = new DefaultDispenseItemBehavior() {
		
		protected ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
			Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
			EntityType<?> eType = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());

			eType.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), SpawnReason.DISPENSER,
					direction != Direction.UP, false);
			stack.shrink(1);
			return stack;
		}
	};
	
	private final Lazy<? extends EntityType<?>> entityTypeSupplier;

	public pupEggs(final RegistryObject<? extends EntityType<?>> entity, final int p_i48465_2_, final int p_i48465_3_, final Properties p_i48465_4_) {
		super(null, p_i48465_2_, p_i48465_3_, p_i48465_4_);
		this.entityTypeSupplier = Lazy.of(entity::get);
		UNADDED_EGGS.add(this);
	}

	public static void initSpawnEggs() {
		final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class,
				null, "field_195987_b");

		for (final SpawnEggItem item : UNADDED_EGGS) {
			EGGS.put(item.getType(null), item);
			DispenserBlock.registerBehavior(item, behavior);
		}

		UNADDED_EGGS.clear();
	}
	
/*
		public static void initUnaddedEggs() {
			final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class, null, "field_195987_b");
			DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior() {
				public ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
					Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
					EntityType<?> entitytype = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());
					entitytype.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), SpawnReason.DISPENSER, direction != Direction.UP, false);
					stack.shrink(1);
					return stack;
				}
			};
			for (final SpawnEggItem egg : UNADDED_EGGS) {
				EGGS.put(egg.getType(null), egg);
				DispenserBlock.registerBehavior(egg, defaultDispenseItemBehavior);
				// ItemColors for each spawn egg don't need to be registered because this method is called before ItemColors is created
			}
			UNADDED_EGGS.clear();
		}
*/
		@Override
		public EntityType<?> getType(CompoundNBT p_208076_1_) {
			return this.entityTypeSupplier.get();
		}
	
	/*
	    public ActionResultType onItemUse(ItemUseContext context) {
	        World world = context.getLevel();
	        if (world.isClientSide) {
	            return ActionResultType.SUCCESS;
	        } else {
	            ItemStack itemstack = context.getItemInHand();
	            BlockPos blockpos = context.getClickedPos();
	            Direction direction = context.getClickedFace();
	            BlockState blockstate = world.getBlockState(blockpos);
	            TileEntity tileentity = world.getBlockEntity(blockpos);
	            if (tileentity instanceof MobSpawnerTileEntity) {
	                AbstractSpawner abstractspawner = ((MobSpawnerTileEntity) tileentity).getSpawner();
	                abstractspawner.setEntityId(entitycreatortypes.NIGGI.get());
	                tileentity.setChanged();
	                world.sendBlockUpdated(blockpos, blockstate, blockstate, Constants.BlockFlags.BLOCK_UPDATE + Constants.BlockFlags.NOTIFY_NEIGHBORS);
	                itemstack.shrink(1);
	                return ActionResultType.SUCCESS;
	            }

	            BlockPos blockpos1;
	            if (blockstate.getCollisionShape(world, blockpos).isEmpty()) {
	                blockpos1 = blockpos;
	            } else {
	                blockpos1 = blockpos.relative(direction);
	            }

	            if (entitycreatortypes.NIGGI.get().spawn((ServerWorld) world, itemstack, context.getPlayer(), blockpos1, SpawnReason.SPAWN_EGG, true, !Objects.equals(blockpos, blockpos1) && direction == Direction.UP) != null) {
	                itemstack.shrink(1);
	            }

	            return ActionResultType.SUCCESS;
	        }
	    }*/

}
