package com.pupmod.generate;

import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;

public class defaultbiome {
	
    public static void addDefaultUndergroundVariety(BiomeGenerationSettings.Builder build) {
    	build.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, featureinit.ORE_PINK);
    }

}
