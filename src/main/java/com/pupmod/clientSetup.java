package com.pupmod;

import com.pupmod.blocks.registerblocks;
import com.pupmod.entitys.entitycreatortypes;
import com.pupmod.generate.pupBiomeGerations;
import com.pupmod.model.Model1;
import com.pupmod.model.ding;
import com.pupmod.model.gumpalanBig;
import com.pupmod.model.puh;
import com.pupmod.model.puppig;
import com.pupmod.model.ringentitymodel;
import com.pupmod.render.PuppigRender;
import com.pupmod.render.RenderDingi;
import com.pupmod.render.RenderNiggi;
import com.pupmod.render.gumpalanBigRender;
import com.pupmod.render.puhRender;
import com.pupmod.render.ringRender;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = pupmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class clientSetup {
	
	@SubscribeEvent
	public static void Registerlayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Model1.LAYER_LOCATION, Model1::createBodyLayer);
		event.registerLayerDefinition(ding.LAYER_LOCATION, ding::createBodyLayer);
		event.registerLayerDefinition(gumpalanBig.LAYER_LOCATION, gumpalanBig::createBodyLayer);
		event.registerLayerDefinition(puh.LAYER_LOCATION, puh::createBodyLayer);
		event.registerLayerDefinition(ringentitymodel.LAYER_LOCATION, ringentitymodel::createBodyLayer);
		event.registerLayerDefinition(puppig.LAYER_LOCATION, puppig::createBodyLayer);
		
	}
	
	@SubscribeEvent
	public static void RegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(entitycreatortypes.NIGGI.get(), RenderNiggi::new);
		event.registerEntityRenderer(entitycreatortypes.DINGI.get(), RenderDingi::new);
		event.registerEntityRenderer(entitycreatortypes.GUMPALAN_BIG.get(), gumpalanBigRender::new);
		event.registerEntityRenderer(entitycreatortypes.PUH.get(), puhRender::new);
		event.registerEntityRenderer(entitycreatortypes.RINGENTITY.get(), ringRender::new);
		event.registerEntityRenderer(entitycreatortypes.PUPPIG.get(), PuppigRender::new);
	}
	
	public static void init(final FMLClientSetupEvent event) { 
		
        ItemBlockRenderTypes.setRenderLayer(registerblocks.KIRCHNER_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(registerblocks.KIRCHNER_BLOCK_NORMAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(registerblocks.PINK_BLOCK_TROLL.get(), RenderType.translucent());
       // ItemBlockRenderTypes.setRenderLayer(registerblocks.CORNEROBJ_GLASS.get(), RenderType.cutout());
        pupBiomeGerations.generateBiomes();
	}
}
