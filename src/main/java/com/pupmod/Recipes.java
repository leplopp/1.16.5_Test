package com.pupmod;

import java.util.function.Consumer;

import com.pupmod.blocks.registerblocks;
import com.pupmod.items.Registeritems;

import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;

public class Recipes extends RecipeProvider {

	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);

	}
	   @Override
	    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
		   //ShapedRecipeBuilder.shaped(registerblocks.PINK_BRICKS.get(), 1).pattern("XXX").pattern("XXX").pattern("XXX").unlockedBy("S", has(Registeritems.BLACK_TEA.get())).save(consumer);
		   //ShapedRecipeBuilder.shaped(registerblocks.BLOOD_BLOCK.get(), 1).pattern("XXX").pattern("XXX").pattern("XXX").unlockedBy("X", has(Registeritems.BLOOD.get())).save(consumer);
		   ShapedRecipeBuilder.shaped(registerblocks.PINK_BRICKS.get(), 1)
           .pattern("xxx")
           .pattern("xxx")
           .pattern("xxx")
           .define('x', registerblocks.PINK_BLOCK.get())
           .group("pupmod")
           .unlockedBy("pink_block", InventoryChangeTrigger.Instance.hasItems(registerblocks.PINK_BLOCK.get()))
           .save(consumer);

	   }

}
//.define('x', (ITag<Item>) registerblocks.PINK_BLOCK.get())