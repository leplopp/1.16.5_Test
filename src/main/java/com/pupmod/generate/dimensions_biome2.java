package pupmod.generate;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import pupmod.pupmod;

public class dimensions_biome2 extends BiomeGenBase{

	public dimensions_biome2(int id) {
		super(id);
		this.setBiomeName("pinkers construckt");
		this.fillerBlock = pupmod.b;
		this.topBlock = pupmod.b;
		
				
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
