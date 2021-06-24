package pupmod.generate;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import pupmod.pupmod;

public class dimension_Biome extends BiomeGenBase{

	public dimension_Biome(int id) {
		super(id);
		this.setBiomeName("popel Biom!!!!");
		this.fillerBlock = pupmod.e;
		this.topBlock = pupmod.d;
		
				
	}
	
	@Override
	public int getSkyColorByTemp(float temp) {
		return 0x759E06;
	}
	
	@Override
	public int getWaterColorMultiplier() {
		return 0x759E06;
	}
}
