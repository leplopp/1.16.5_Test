package com.pupmod.generate.biomes;

import java.util.Random;

import com.mojang.serialization.Codec;
import com.pupmod.pupmod;
import com.pupmod.blocks.registerblocks;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;

public class pupSurfaceConfigs {
	
	public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> PINK_SURFACE_BUILDER =
			register("pink_surface", SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderBaseConfiguration(
                    registerblocks.PINK_BLOCK.get().defaultBlockState(),
                    registerblocks.PINK_STONE.get().defaultBlockState(),
                    registerblocks.PINK_STONE.get().defaultBlockState())));

    private static <T extends SurfaceBuilderBaseConfiguration> ConfiguredSurfaceBuilder<T> register(String name,
                                                                                                    ConfiguredSurfaceBuilder<T> surfaceBuilder) {
        return Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER,
                new ResourceLocation(pupmod.MODID, name), surfaceBuilder);
    }
}
