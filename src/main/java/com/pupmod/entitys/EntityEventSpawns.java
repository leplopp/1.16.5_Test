package com.pupmod.entitys;

import com.pupmod.pupmod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = pupmod.MODID)
public class EntityEventSpawns {

	@SubscribeEvent
	public void onBiomeLoadspawn(final BiomeLoadingEvent ev) {
		if (ev.getName() == null)
			return; 
		MobSpawnInfoBuilder spawns = ev.getSpawns();
		
		if(ev.getCategory().equals(Biome.Category.DESERT)) {
			spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(entitycreatortypes.RINGENTITY.get(), 10, 5, 30));
		}
	}

}
  