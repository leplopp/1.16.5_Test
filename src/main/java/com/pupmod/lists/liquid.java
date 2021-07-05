package com.pupmod.lists;

import com.pupmod.fluids.FluidPink;
import com.pupmod.fluids.FluidPink.Flowing;
import com.pupmod.fluids.FluidPink.Source;
import com.pupmod.fluids.RegistryFluids;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.tags.TagRegistry;
import net.minecraft.tags.TagRegistryManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.Tags.IOptionalNamedTag;

public class liquid {

	   public static final FlowingFluid pink_fluid = (Source) new FluidPink.Source().setRegistryName(RegistryFluids.location("pink_fluid"));
	   public static final FlowingFluid flowing_pink_fluid = (Flowing) new FluidPink.Flowing().setRegistryName(RegistryFluids.location("flowing_pink_fluid"));
	   
	  /* static {
		      for(Fluid fluid : Registry.FLUID) {
		         for(FluidState fluidstate : fluid.getStateDefinition().getPossibleStates()) {
		            Fluid.FLUID_STATE_REGISTRY.add(fluidstate);
		         }
		      }

		   }*/

	   public static class Tag {
		   
		   protected static final TagRegistry<Fluid> HELPER = TagRegistryManager.create(new ResourceLocation("fluid"), ITagCollectionSupplier::getFluids);
		   
		   public static final ITag.INamedTag<Fluid> FLUID_PINK = bind("pink_fluid");

		   public static ITag.INamedTag<Fluid> bind(String p_206956_0_) {
		      return HELPER.bind(p_206956_0_);
		   }
	   }
}
    	
		   
		   /*public static final Tags.IOptionalNamedTag<Fluid> PINK_FLUID = 
    			  FluidTags.createOptional(RegistryFluids.location("pink_fluid"));
      }
} */

/*public static FluidPink.Source pink_fluid = null;
public static FluidPink.Flowing flowing_pink_fluid = null;

public static class Tags {
	
	public static final IOptionalNamedTag<Fluid> PINK_FLUID = FluidTags.createOptional(RegistryFluids.location("pink_fluid"));
	
}*/