package com.pupmod.blocks;

import java.util.Random;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class MianSlope extends StairsBlock {
	
	private int num;
	
	public MianSlope(BlockState state, Properties prob, int dropnum) {
		super(state, prob);
		this.num = dropnum; 
	}


	public int quantityDropped(Random random) {
		return this.num;
	}


}
