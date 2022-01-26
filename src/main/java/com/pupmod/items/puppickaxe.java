package com.pupmod.items;

import java.util.Set;
import com.google.common.collect.ImmutableSet;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class puppickaxe extends DiggerItem {

	  public puppickaxe(Tier p_42961_, int p_42962_, float p_42963_, Item.Properties p_42964_) {
	      super((float)p_42962_, p_42963_, p_42961_, BlockTags.MINEABLE_WITH_PICKAXE, p_42964_);
	   }
	   @Override
	   public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
	      return net.minecraftforge.common.ToolActions.DEFAULT_PICKAXE_ACTIONS.contains(toolAction);
	   }
}
