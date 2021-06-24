package com.pupmod.blocks;

import com.pupmod.pupmod;

import net.minecraft.entity.EntityType;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.LavaFluid;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class pupFluids {

	private static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, pupmod.MODID);
	
	public static void EntityInit() {
		FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());}
	
	  //public static final FlowingFluid FLOWING_PINK_FLUID = FLUIDS.register("wlowing_pink_fluid", () -> );
			  
			  (FlowingFluid) register("flowing_pink_liquid", new pinkFluid.Flowing());
	  public static final FlowingFluid PINK_FLUID = (FlowingFluid) register("pink_liquid", new pinkFluid.Source());

	   private static <T extends Fluid> T register(String p_215710_0_, T p_215710_1_) {
	      return Registry.register(Registry.FLUID, p_215710_0_, p_215710_1_);
	   }

	   static {
	      for(Fluid fluid : Registry.FLUID) {
	         for(FluidState fluidstate : fluid.getStateDefinition().getPossibleStates()) {
	            Fluid.FLUID_STATE_REGISTRY.add(fluidstate);
	         }
	      }

	   }
	}
