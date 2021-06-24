package com.pupmod.generate;

import com.pupmod.blocks.registerblocks;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public abstract class Biomelist {
	
	
	   public static final RegistryKey<Biome> PINKI_BIOME = register("pinki_biome");
	
	   private static RegistryKey<Biome> register(String name) {
		      return RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(name));
		   }

}
