package com.pupmod;

import java.util.Locale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pupmod.blocks.registerblocks;
import com.pupmod.entitys.entitycreatortypes;
import com.pupmod.generate.featureinit;
import com.pupmod.items.Registeritems;
import com.pupmod.items.pupEggs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import sound.soundregistry;

@Mod("pupmod")
@Mod.EventBusSubscriber(modid = pupmod.MODID, bus = Bus.MOD)
public class pupmod {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "pupmod";
	
	public static final CreativeModeTab PUP_TAB = new CreativeModeTab("puptab") {
		public ItemStack makeIcon() {return new ItemStack(registerblocks.PINK_BLOCK.get());}};
			
	public static final CreativeModeTab PUP_TAB_ITEMS = new CreativeModeTab("puptab_item") {
		public ItemStack makeIcon() {return new ItemStack(Registeritems.BLACK_TEA.get());}};
		
	public pupmod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		
		soundregistry.SoundInit();
		entitycreatortypes.ENTITIE_TYPES.register(bus);
		
		Registeritems.ITEMS.register(bus);
		registerblocks.BLOCKS.register(bus);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(modSetup::init);	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(clientSetup::init);
        //MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, featureinit::addOres);
        
		//MinecraftForge.EVENT_BUS.register(BiomeINIT.BIOMES);
		//pupFluids.FLOWING_PINK_FLUID.getRegistryType();
		//pupFluids.PINK_FLUID.getRegistryType();
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		registerblocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(
					new BlockItem(block, new Item.Properties().tab(PUP_TAB)).setRegistryName(block.getRegistryName()));
		});	}
			
	/*@SubscribeEvent
	
	public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		pupEggs.initSpawnEggs();
	}*/
	
	/*@SubscribeEvent
	public static void RegisterFluids(final RegistryEvent.Register<Fluid> event) {
		event.getRegistry().registerAll(	);
	}*/
	
	public static ResourceLocation prefix(String name){return new ResourceLocation(MODID.toLowerCase(Locale.ROOT), name);}
/*
	@SubscribeEvent
	public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(Biomelist.Pinki = new pinkiBiome());
	}
	*/
}