package com.pupmod.generate;

import java.util.Optional;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Supplier;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.pupmod.blocks.registerblocks;

import net.minecraft.block.BlockState;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Builder;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.biome.BiomeRegistry;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.client.ExtendedServerListData;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class pinkiBiome extends ForgeRegistryEntry.UncheckedRegistryEntry<Biome> {

	
	
	
	
	
	
	
	
	
	/*

	protected void pinkiBiome() {
		super((new Biome.Builder())
				.generationSettings(new ConfiguredSurfaceBuilder<ISurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, registerblocks.PINK_BLOCK.get().defaultBlockState())))
		
		;
	}
	*/	

}
