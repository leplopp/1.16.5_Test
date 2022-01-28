package com.pupmod.generate;

import com.pupmod.generate.biomes.pupBiomes;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.biome.VanillaBiomes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public class BiomeINIT extends Biomelist{
	
	private static final Int2ObjectMap<ResourceKey<Biome>> TO_NAME = new Int2ObjectArrayMap<>();
	  private static Biome register(int p_127328_, ResourceKey<Biome> p_127329_, Biome p_127330_) {
	      TO_NAME.put(p_127328_, p_127329_);
	      return BuiltinRegistries.registerMapping(BuiltinRegistries.BIOME, p_127328_, p_127329_, p_127330_);
	   }

	   public static ResourceKey<Biome> byId(int p_127326_) {
	      return ((net.minecraftforge.registries.ForgeRegistry<Biome>)net.minecraftforge.registries.ForgeRegistries.BIOMES).getKey(p_127326_);
	   }

	   static {
		   register(200, Biomelist.PINK_BIOME, pupBiomes.pinkbiome(0.125F, 0.05F, 1.2F, false, false, null));
	   }

}
