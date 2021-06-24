package com.pupmod.items;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class pup_spade extends ToolItem {

	private static final Set<Block> DIGGABLES = Sets.newHashSet(Blocks.CLAY, Blocks.DIRT, Blocks.COARSE_DIRT,
			Blocks.PODZOL, Blocks.FARMLAND, Blocks.GRASS_BLOCK, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND,
			Blocks.RED_SAND, Blocks.SNOW_BLOCK, Blocks.SNOW, Blocks.SOUL_SAND, Blocks.GRASS_PATH,
			Blocks.WHITE_CONCRETE_POWDER, Blocks.ORANGE_CONCRETE_POWDER, Blocks.MAGENTA_CONCRETE_POWDER,
			Blocks.LIGHT_BLUE_CONCRETE_POWDER, Blocks.YELLOW_CONCRETE_POWDER, Blocks.LIME_CONCRETE_POWDER,
			Blocks.PINK_CONCRETE_POWDER, Blocks.GRAY_CONCRETE_POWDER, Blocks.LIGHT_GRAY_CONCRETE_POWDER,
			Blocks.CYAN_CONCRETE_POWDER, Blocks.PURPLE_CONCRETE_POWDER, Blocks.BLUE_CONCRETE_POWDER,
			Blocks.BROWN_CONCRETE_POWDER, Blocks.GREEN_CONCRETE_POWDER, Blocks.RED_CONCRETE_POWDER,
			Blocks.BLACK_CONCRETE_POWDER, Blocks.SOUL_SOIL);

	protected static final Map<Block, BlockState> FLATTENABLES = Maps
			.newHashMap(ImmutableMap.of(Blocks.GRASS_BLOCK, Blocks.GRASS_PATH.defaultBlockState()));

	public pup_spade(float g, float f, IItemTier item, Properties prob) {
		super(g, f, item, DIGGABLES, prob.addToolType(ToolType.SHOVEL, item.getLevel()));
	}

	public boolean isCorrectToolForDrops(BlockState state) {
		return state.is(Blocks.SNOW) || state.is(Blocks.SNOW_BLOCK);
	}

	public ActionResultType useOn(ItemUseContext con) {
		World world = con.getLevel();
		BlockPos blockpos = con.getClickedPos();
		BlockState blockstate = world.getBlockState(blockpos);
		if (con.getClickedFace() == Direction.DOWN) {
			return ActionResultType.PASS;
		} else {
			PlayerEntity playerentity = con.getPlayer();
			BlockState blockstate1 = blockstate.getToolModifiedState(world, blockpos, playerentity,
					con.getItemInHand(), net.minecraftforge.common.ToolType.SHOVEL);
			BlockState blockstate2 = null;
			if (blockstate1 != null && world.isEmptyBlock(blockpos.above())) {
				world.playSound(playerentity, blockpos, SoundEvents.SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
				blockstate2 = blockstate1;
			} else if (blockstate.getBlock() instanceof CampfireBlock && blockstate.getValue(CampfireBlock.LIT)) {
				if (!world.isClientSide()) {
					world.levelEvent((PlayerEntity) null, 10090, blockpos, 0);   // <- geändert hier msmasdlkmasdjasl
				}

				CampfireBlock.dowse(world, blockpos, blockstate);
				blockstate2 = blockstate.setValue(CampfireBlock.LIT, Boolean.valueOf(false));
			}

			if (blockstate2 != null) {
				if (!world.isClientSide) {
					world.setBlock(blockpos, blockstate2, 11);
					if (playerentity != null) {
						con.getItemInHand().hurtAndBreak(1, playerentity, (end) -> {
							end.broadcastBreakEvent(con.getHand());
						});
					}
				}

				return ActionResultType.sidedSuccess(world.isClientSide);
			} else {
				return ActionResultType.PASS;
			}
		}
	}

	@javax.annotation.Nullable
	public static BlockState getShovelPathingState(BlockState originalState) {
		return FLATTENABLES.get(originalState.getBlock());
	}
}