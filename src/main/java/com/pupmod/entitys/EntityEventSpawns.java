package com.pupmod.entitys;

import com.pupmod.pupmod;
import net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

//@EventBusSubscriber(modid = pupmod.MODID)
public class EntityEventSpawns {
	/*@SubscribeEvent
	public static void onBiomeLoad(final BiomeLoadingEvent ev) {
		if (ev.getName() == null)
			return; 
		MobSpawnInfoBuilder spawns = ev.getSpawns();
		
		if(ev.getCategory().equals(Biome.Category.DESERT)) {
			spawns.addSpawn(EntityClassification.CREATURE, 
					new SpawnerData(entitycreatortypes.RINGENTITY.get(), 5, 5, 30));
		}
	}*/
}
