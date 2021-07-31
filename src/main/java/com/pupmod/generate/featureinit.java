package com.pupmod.generate;

import com.google.common.collect.Sets;
import com.pupmod.pupmod;
import com.pupmod.blocks.registerblocks;
import net.minecraft.core.Registry;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;
import net.minecraft.world.level.levelgen.placement.CarvingMaskDecorator;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class featureinit {
	
	/*public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, pupmod.MODID);

	public static void addOres(final BiomeLoadingEvent event) {
		addOre(event, OreFeature.ORE,
				registerblocks.PINK_BLOCK.get().defaultBlockState(), 120, 0, 260, 1);

		addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
				registerblocks.KIRCHNER_BLOCK.get().defaultBlockState(), 120, 0, 260, 1);

		addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
				registerblocks.SCHMUMLER_BLOCK.get().defaultBlockState(), 100, 0, 260, 1);

		addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
				registerblocks.PINK_BLOCK_TROLL.get().defaultBlockState(), 100, 0, 260, 2);


	}

	public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minh,
			int maxh, int amound) {
		HeightProvider heigh;
		event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ConfiguredFeature<FeatureConfiguration, Feature<FC>>

	}*/
	
	/*private static RegistryKey<Biome> makeKey(final BiomeLoadingEvent event, String name) {
		BIOMES.register("pinki_biome", () -> new Biome.Builder()
			
				.precipitation(Biome.RainType.RAIN)
				.biomeCategory(Biome.Category.PLAINS)
				.depth(0.2f)
				.downfall(0.3f)
				.scale(0)
				.temperature(0)
				.specialEffects(new BiomeAmbience.Builder().fogColor(0).waterColor(0).waterFogColor(0).skyColor(0).build())
				.generationSettings(new BiomeGenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS).build())
				.mobSpawnSettings(new MobSpawnInfo.Builder().build())
				.temperatureAdjustment(Biome.TemperatureModifier.FROZEN)
				.build());
		
		return RegistryKey.create(Registry.BIOME_REGISTRY, pupmod.prefix(name));
	}


	/*
	  public static void addBiome(final BiomeLoadingEvent event, BlockState state) {
	  //event.getCategory().compareTo(Category.PLAINS)
	  event.getGeneration().surfaceBuilder(new
	  ConfiguredSurfaceBuilder<ISurfaceBuilderConfig>(builder, ));
	  
	  }
	 */

}
