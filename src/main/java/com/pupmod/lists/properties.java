package com.pupmod.lists;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class properties {
	
	public static Properties Propertieone() {

		  return  AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(1)
				.harvestTool(ToolType.PICKAXE).strength(3f, 5).sound(SoundType.STONE).requiresCorrectToolForDrops();
	}
	

}
