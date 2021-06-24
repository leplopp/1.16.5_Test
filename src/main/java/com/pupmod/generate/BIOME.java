package com.pupmod.generate;

import net.minecraft.world.biome.BiomeGenBase;
import pupmod.pupmod;

public class BIOME extends BiomeGenBase {

	public BIOME(int id) {
		super(id);
		this.setBiomeName("Kirchers Liblings BIOM");
		this.setHeight(height_LowPlains);
		
		this.fillerBlock = pupmod.b;
		this.topBlock = pupmod.b;
		this.theBiomeDecorator.generateLakes = false;
		this.setDisableRain();

		
	}
	
	@Override
	public int getSkyColorByTemp(float p_76731_1_) {
		return 0xFF00C9;
	}
	
	@Override
	public int getWaterColorMultiplier() {
		return 0xFF00C9;
	}

}