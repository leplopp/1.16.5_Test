package pupmod.generate;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import pupmod.pupmod;

public class dimension_Biome3 extends BiomeGenBase{

	public dimension_Biome3(int id) {
		super(id);
		this.setBiomeName("libes LAND IEIE");
		this.fillerBlock = Blocks.quartz_block;
		this.topBlock = pupmod.a;
		
				
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
