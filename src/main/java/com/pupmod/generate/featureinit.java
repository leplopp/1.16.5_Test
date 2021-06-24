package com.pupmod.generate;

import com.google.common.collect.Sets;
import com.pupmod.pupmod;
import com.pupmod.blocks.registerblocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.biome.BiomeGenerationSettings.Builder;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.LakesFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class featureinit {
	
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, pupmod.MODID);

	public static void addOres(final BiomeLoadingEvent event) {
		addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
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
		event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreFeatureConfig(rule, state, veinSize))
						.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minh, 0, maxh))).squared()
						.chance(amound));

	}
	
	private static RegistryKey<Biome> makeKey(final BiomeLoadingEvent event, String name) {
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
