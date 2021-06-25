package com.pupmod.lists;

import java.util.function.Supplier;
import com.pupmod.fluids.FluidPink;
import com.pupmod.fluids.RegistryFluids;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagRegistry;
import net.minecraft.tags.TagRegistryManager;
import net.minecraft.util.ResourceLocation;


public class liquid {

	public static final FluidPink pink_fluid = null;
	public static final FluidPink flowing_pink_fluid = null;
	
	public static class     Tags {
		 
	protected static final TagRegistry<Fluid> HELPER = TagRegistryManager.create(new ResourceLocation("fluids"), ITagCollectionSupplier::getFluids);
	
	   public static final ITag.INamedTag<Fluid> PINK_FLUID = bind(RegistryFluids.class.getTypeName());
				
				   public static ITag.INamedTag<Fluid> bind(String p_206956_0_) {
		      return HELPER.bind(p_206956_0_);
		   }
	}
	
}
