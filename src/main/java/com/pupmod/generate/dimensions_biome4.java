package pupmod.generate;

import net.minecraft.world.biome.BiomeGenBase;
import pupmod.pupmod;

public class dimensions_biome4 extends BiomeGenBase{

	public dimensions_biome4(int id) {
		super(id);
		this.setBiomeName("pinkers construckt");
		this.fillerBlock = pupmod.b;
		this.topBlock = pupmod.c;
		
				
	}
	
	@Override
	public int getSkyColorByTemp(float temp) {
		return 0xF061EC;
	}
	
	@Override
	public int getWaterColorMultiplier() {
		return 0xF061EC;
	}
}

