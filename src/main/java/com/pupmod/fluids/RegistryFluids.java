package com.pupmod.fluids;

import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryFluids {
	
	@SubscribeEvent
	public static void RegisterFluids(final RegistryEvent.Register<Fluid> event) {
		event.getRegistry().registerAll(	);
		
		
	}
}
