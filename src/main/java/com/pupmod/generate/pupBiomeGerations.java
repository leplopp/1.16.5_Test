package com.pupmod.generate;

import java.util.Objects;
import com.pupmod.generate.biomes.pupBiomes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;
import static net.minecraftforge.common.BiomeDictionary.Type.*;

public class pupBiomeGerations {
	
	 public static void generateBiomes() {
	        addBiome(pupBiomes.PINK_LAND.get(), BiomeManager.BiomeType.WARM, 200, HOT, DEAD, DRY);
	    }

	    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
	        ResourceKey<Biome> key =  ResourceKey.create(ForgeRegistries.Keys.BIOMES,
	                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

	        BiomeDictionary.addTypes(key, types);
	        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
	    }

}
