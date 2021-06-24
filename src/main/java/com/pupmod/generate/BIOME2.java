package pupmod.generate;

import net.minecraft.world.biome.BiomeGenBase;
import pupmod.pupmod;

public class BIOME2 extends BiomeGenBase{
	
	public BIOME2(int id) {
		super(id);
		this.setBiomeName("SCHUMEL BIOM");
		this.setHeight(height_Shores);
		
		this.fillerBlock = pupmod.c;
		this.topBlock = pupmod.c;
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


