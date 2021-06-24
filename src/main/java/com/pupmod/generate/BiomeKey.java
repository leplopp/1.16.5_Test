package com.pupmod.generate;

import com.pupmod.pupmod;
import com.pupmod.blocks.registerblocks;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeKey {

	/*public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, pupmod.MODID);

	public static final RegistryKey<Biome> PINKI_BIOME = makeKey("pinki_biome");

	private static RegistryKey<Biome> makeKey(String name) {
		BIOMES.register(name, () -> new Biome.Builder()
				.precipitation(Biome.RainType.RAIN)
				.biomeCategory(Biome.Category.PLAINS)
				.depth(0)
				.downfall(0)
				.scale(0)
				.temperature(0)
				.specialEffects(new BiomeAmbience.Builder().fogColor(0).waterColor(0).waterFogColor(0).skyColor(0).build())
				.generationSettings(new BiomeGenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS).build())
				.mobSpawnSettings(new MobSpawnInfo.Builder().build())
				.temperatureAdjustment(Biome.TemperatureModifier.FROZEN)
				.build());
		return RegistryKey.create(Registry.BIOME_REGISTRY, pupmod.prefix(name));
	}

	public static final BiomeDictionary.Type PUP = BiomeDictionary.Type.getType("PUP");

	public static void addBiomeTypes() {

		BiomeDictionary.addTypes(PINKI_BIOME, PUP, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.PLAINS);
	}
*/
}
