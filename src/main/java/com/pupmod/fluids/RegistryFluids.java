package com.pupmod.fluids;

import com.pupmod.pupmod;
import com.pupmod.lists.liquid;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryFluids {
	
/*	
	@SubscribeEvent
	public static void RegisterFluids(final RegistryEvent.Register<Fluid> event) {
		event.getRegistry().registerAll
				(	
				
				liquid.flowing_pink_fluid = (Flowing) new FluidPink.Flowing().setRegistryName(location("flowing_pink_fluid")),
				liquid.pink_fluid = (Source) new FluidPink.Source().setRegistryName(location("pink_fluid"))
						
				);

	}*/
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(pupmod.MODID, name);
	}
}
