package com.pupmod;

import java.util.Locale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.google.common.collect.Sets;
import com.pupmod.blocks.pinkFluid;
import com.pupmod.blocks.pupFluids;
import com.pupmod.blocks.registerblocks;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.PuhEntity;
import com.pupmod.entitys.entitycreatortypes;
import com.pupmod.entitys.gumpalanBigEntity;
import com.pupmod.entitys.gumpalanEntity;
import com.pupmod.entitys.lllEntity;
import com.pupmod.entitys.puppigEntity;
import com.pupmod.entitys.testEntity;
import com.pupmod.generate.BiomeINIT;
import com.pupmod.generate.Biomelist;
import com.pupmod.generate.defaultbiome;
import com.pupmod.generate.featureinit;
import com.pupmod.generate.pinkiBiome;
import com.pupmod.items.Registeritems;
import com.pupmod.items.pupEggs;
import com.pupmod.render.PuppigRender;
import com.pupmod.render.RenderNiggi;
import com.pupmod.render.gumpalanBigRender;
import com.pupmod.render.gumpalanRender;
import com.pupmod.render.lllRender;
import com.pupmod.render.puhRender;
import com.pupmod.render.testRender;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import sound.soundregistry;

@Mod("pupmod")
@Mod.EventBusSubscriber(modid = pupmod.MODID, bus = Bus.MOD)
public class pupmod {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "pupmod";
	
	public static final ItemGroup PUP_TAB = new ItemGroup("puptab") {
		public ItemStack makeIcon() {return new ItemStack(registerblocks.PINK_BLOCK.get());}};
			
	public static final ItemGroup PUP_TAB_ITEMS = new ItemGroup("puptab_item") {
		public ItemStack makeIcon() {return new ItemStack(Registeritems.BLACK_TEA.get());}};
		
	public pupmod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		
		soundregistry.SoundInit();
		//entitycreatortypes.EntityInit();
		entitycreatortypes.ENTITIE_TYPES.register(bus);
		Registeritems.ITEMS.register(bus);
		registerblocks.BLOCKS.register(bus);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(modSetup::init);	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(clientSetup::init);
		//pupFluids.FLOWING_PINK_FLUID.getRegistryType();
		//pupFluids.PINK_FLUID.getRegistryType();
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, featureinit::addOres);
		
		//MinecraftForge.EVENT_BUS.register(BiomeINIT.BIOMES);

		 
	}
	
	//public void commonSetup(final FMLCommonSetupEvent event) {
		 
		 /*
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.NIGGI.get(), NiggiEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.TEST_MODEL.get(), testEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.PUH.get(), PuhEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.PUPPIG.get(), puppigEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.GUMPALAN_BIG.get(), gumpalanBigEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.GUMPALAN.get(), gumpalanEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.LLL.get(), lllEntity.setAttributes().build());});
		  */
	
		@SubscribeEvent
	    public static void onRenderTypeSetup(FMLClientSetupEvent event) {event.enqueueWork(() -> {

	        });
	  
		}
	    
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		registerblocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(
					new BlockItem(block, new Item.Properties().tab(PUP_TAB)).setRegistryName(block.getRegistryName()));
		});	}
			
	@SubscribeEvent
	public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		pupEggs.initSpawnEggs();
	}
	
	public static ResourceLocation location(String name){return new ResourceLocation(MODID, name);}
	
	public static ResourceLocation prefix(String name){return new ResourceLocation(MODID.toLowerCase(Locale.ROOT), name);}
/*
	@SubscribeEvent
	public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(Biomelist.Pinki = new pinkiBiome());
	}
	*/
}