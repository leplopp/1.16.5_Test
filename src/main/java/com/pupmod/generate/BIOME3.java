package pupmod.generate;

import net.minecraft.world.biome.BiomeGenBase;
import pupmod.pupmod;

public class BIOME3 extends BiomeGenBase{
	
	public BIOME3(int id) {
		super(id);
		this.setBiomeName("SCHUMEL BIOM");
		this.setHeight(height_Shores);
		
		this.fillerBlock = pupmod.a;
		this.topBlock = pupmod.a;
		this.theBiomeDecorator.generateLakes = true;
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

