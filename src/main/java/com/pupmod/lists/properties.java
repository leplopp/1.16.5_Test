package com.pupmod.lists;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class properties {
	
	public static net.minecraft.world.level.block.state.BlockBehaviour.Properties Propertieone() {

		  return  BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
				.strength(3f, 5).sound(SoundType.STONE).requiresCorrectToolForDrops();
	}
	

}
