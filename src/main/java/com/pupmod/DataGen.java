package com.pupmod;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
	

	 @SubscribeEvent
	    public static void gatherData(GatherDataEvent event) {
	        DataGenerator generator = event.getGenerator();
	        if (event.includeServer()) {
	            generator.addProvider((DataProvider) new Recipes(generator));
	            //generator.addProvider(new LootTables(generator));
	        }
	        if (event.includeClient()) {
	            //generator.addProvider(new BlockStates(generator, event.getExistingFileHelper()));
	            //generator.addProvider(new Items(generator, event.getExistingFileHelper()));
	        }
	 }
}
