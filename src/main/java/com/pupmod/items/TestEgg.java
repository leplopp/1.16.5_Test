package com.pupmod.items;

import java.util.Objects;
import com.pupmod.pupmod;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.entitycreatortypes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
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

public class TestEgg extends Item{

	public TestEgg(Properties prob) {
		super(prob);}
	
	    public ActionResultType onItemUse(ItemUseContext context) {
	        World world = context.getLevel();
	        if (world.isClientSide) {
	            return ActionResultType.SUCCESS;} else {
	            ItemStack itemstack = context.getItemInHand();
	            BlockPos blockpos = context.getClickedPos();
	            Direction direction = context.getClickedFace();
	            BlockState blockstate = world.getBlockState(blockpos);
	            TileEntity tileentity = world.getBlockEntity(blockpos);
	            if (tileentity instanceof MobSpawnerTileEntity) {
	                AbstractSpawner abstractspawner = ((MobSpawnerTileEntity) tileentity).getSpawner();
	                abstractspawner.setEntityId(entitycreatortypes.TEST_MODEL.get());
	                tileentity.setChanged();
	                world.sendBlockUpdated(blockpos, blockstate, blockstate, Constants.BlockFlags.BLOCK_UPDATE + Constants.BlockFlags.NOTIFY_NEIGHBORS);
	                itemstack.shrink(1);
	                return ActionResultType.SUCCESS;}
	            BlockPos blockpos1;
	            if (blockstate.getCollisionShape(world, blockpos).isEmpty()) {
	                blockpos1 = blockpos;} else {
	                blockpos1 = blockpos.relative(direction);}
	            if (entitycreatortypes.TEST_MODEL.get().spawn((ServerWorld) world, itemstack, context.getPlayer(), blockpos1, SpawnReason.SPAWN_EGG, true, !Objects.equals(blockpos, blockpos1) && direction == Direction.UP) != null) {
	                itemstack.shrink(1);}
	            return ActionResultType.SUCCESS;}
	        }
}