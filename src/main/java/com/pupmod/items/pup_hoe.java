package com.pupmod.items;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class pup_hoe extends ToolItem {

	private static final Set<Block> DIGGABLES = ImmutableSet.of(Blocks.NETHER_WART_BLOCK, Blocks.WARPED_WART_BLOCK,
			Blocks.HAY_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.TARGET, Blocks.SHROOMLIGHT, Blocks.SPONGE,
			Blocks.WET_SPONGE, Blocks.JUNGLE_LEAVES, Blocks.OAK_LEAVES, Blocks.SPRUCE_LEAVES, Blocks.DARK_OAK_LEAVES,
			Blocks.ACACIA_LEAVES, Blocks.BIRCH_LEAVES);
	protected static final Map<Block, BlockState> TILLABLES = Maps.newHashMap(ImmutableMap.of(Blocks.GRASS_BLOCK,
			Blocks.FARMLAND.defaultBlockState(), Blocks.GRASS_PATH, Blocks.FARMLAND.defaultBlockState(), Blocks.DIRT,
			Blocks.FARMLAND.defaultBlockState(), Blocks.COARSE_DIRT, Blocks.DIRT.defaultBlockState()));

	public pup_hoe(float g, float f, IItemTier item, Properties prob) {
		super(g, f, item, DIGGABLES, prob.addToolType(ToolType.HOE, item.getLevel()));
	}

	public ActionResultType useOn(ItemUseContext con) {
		World world = con.getLevel();
		BlockPos blockpos = con.getClickedPos();
		int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(con);
		if (hook != 0)
			return hook > 0 ? ActionResultType.SUCCESS : ActionResultType.FAIL;
		if (con.getClickedFace() != Direction.DOWN && world.isEmptyBlock(blockpos.above())) {
			BlockState blockstate = world.getBlockState(blockpos).getToolModifiedState(world, blockpos, con.getPlayer(),
					con.getItemInHand(), ToolType.HOE);
			if (blockstate != null) {
				PlayerEntity playerentity = con.getPlayer();
				world.playSound(playerentity, blockpos, SoundEvents.HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!world.isClientSide) {
					world.setBlock(blockpos, blockstate, 11);
					if (playerentity != null) {
						con.getItemInHand().hurtAndBreak(1, playerentity, (player) -> {
							player.broadcastBreakEvent(con.getHand());
						});
					}
				}

				return ActionResultType.sidedSuccess(world.isClientSide);
			}
		}

		return ActionResultType.PASS;
	}

	@javax.annotation.Nullable
	public static BlockState getHoeTillingState(BlockState originalState) {
		return TILLABLES.get(originalState.getBlock());
	}

}
