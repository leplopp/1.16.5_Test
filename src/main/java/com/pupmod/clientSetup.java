package com.pupmod;

import com.pupmod.blocks.registerblocks;
import com.pupmod.entitys.entitycreatortypes;
import com.pupmod.items.Registeritems;
import com.pupmod.render.PuppigRender;
import com.pupmod.render.RenderNiggi;
import com.pupmod.render.gumpalanBigRender;
import com.pupmod.render.gumpalanRender;
import com.pupmod.render.lllRender;
import com.pupmod.render.puhRender;
import com.pupmod.render.ringRender;
import com.pupmod.render.stopRender;
import com.pupmod.render.testRender;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = pupmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class clientSetup {
	
	public static void init(final FMLClientSetupEvent event) { 
		RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.NIGGI.get(), RenderNiggi::new);
        RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.TEST_MODEL.get(), testRender::new);
        RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.PUH.get(), puhRender::new);
        RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.PUPPIG.get(), PuppigRender::new);
        RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.GUMPALAN_BIG.get(), gumpalanBigRender::new);
        RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.GUMPALAN.get(), gumpalanRender::new);
        RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.LLL.get(), lllRender::new);
        RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.RINGENTITY.get(), ringRender::new);
        //RenderingRegistry.registerEntityRenderingHandler(entitycreatortypes.STOPI.get(), stopRender::new);
        
        
        RenderTypeLookup.setRenderLayer(registerblocks.KIRCHNER_BLOCK.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(registerblocks.KIRCHNER_BLOCK_NORMAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(registerblocks.PINK_BLOCK_TROLL.get(), RenderType.translucent());

	}

	@SubscribeEvent
    public static void onItemColor(ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, i) -> 0xC01394, Registeritems.NIGGI_EGG.get());
        event.getItemColors().register((stack, i) -> 0xEA779C, Registeritems.TEST_EGG.get());
        event.getItemColors().register((stack, i) -> 0x8A1499, Registeritems.PUH_EGG.get());
        event.getItemColors().register((stack, i) -> 0x4B088A, Registeritems.PUPPIG_EGG.get());
        event.getItemColors().register((stack, i) -> 0xA901DB, Registeritems.GUMPALAN_BIG_EGG.get());
        event.getItemColors().register((stack, i) -> 0x2F0B3A, Registeritems.GUMPALAN_EGG.get());
        event.getItemColors().register((stack, i) -> 0x151515, Registeritems.LLL_EGG.get());
        event.getItemColors().register((stack, i) -> 0x101085, Registeritems.RING_EGG.get());
       // event.getItemColors().register((stack, i) -> 0x8A0808, Registeritems.STOP_EGG.get());
    }
}
