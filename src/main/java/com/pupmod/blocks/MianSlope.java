package com.pupmod.blocks;

import java.util.Random;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MianSlope extends StairBlock {
	
	private int num;
	
	public MianSlope(BlockState state, Properties prob, int dropnum) {
		super(state, prob);
		this.num = dropnum; 
	}


	public int quantityDropped(Random random) {
		return this.num;
	}


}
