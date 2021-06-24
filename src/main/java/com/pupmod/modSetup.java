package com.pupmod;

import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.PuhEntity;
import com.pupmod.entitys.entitycreatortypes;
import com.pupmod.entitys.gumpalanBigEntity;
import com.pupmod.entitys.gumpalanEntity;
import com.pupmod.entitys.lllEntity;
import com.pupmod.entitys.puppigEntity;
import com.pupmod.entitys.ringEntity;
import com.pupmod.entitys.stopEntity;
import com.pupmod.entitys.testEntity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = pupmod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class modSetup {

	@SuppressWarnings("deprecation")
	public static void init(final FMLCommonSetupEvent event) {
		
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.NIGGI.get(), NiggiEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.TEST_MODEL.get(), testEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.PUH.get(), PuhEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.PUPPIG.get(), puppigEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.GUMPALAN_BIG.get(), gumpalanBigEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.GUMPALAN.get(), gumpalanEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.LLL.get(), lllEntity.setAttributes().build());});
		DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.RINGENTITY.get(), ringEntity.setAttributes().build());});
		//DeferredWorkQueue.runLater(() -> {GlobalEntityTypeAttributes.put(entitycreatortypes.STOPI.get(), stopEntity.setAttributes().build());});
		
		/*  event.enqueueWork(() -> {
              GlobalEntityTypeAttributes.put(entitycreatortypes.NIGGI.get(), NiggiEntity.setAttributes().build());
              GlobalEntityTypeAttributes.put(entitycreatortypes.TEST_MODEL.get(), testEntity.setAttributes().build());
              GlobalEntityTypeAttributes.put(entitycreatortypes.PUH.get(), PuhEntity.setAttributes().build());
              GlobalEntityTypeAttributes.put(entitycreatortypes.PUPPIG.get(), puppigEntity.setAttributes().build());
              GlobalEntityTypeAttributes.put(entitycreatortypes.GUMPALAN_BIG.get(), gumpalanBigEntity.setAttributes().build());
              GlobalEntityTypeAttributes.put(entitycreatortypes.GUMPALAN.get(), gumpalanEntity.setAttributes().build());
              GlobalEntityTypeAttributes.put(entitycreatortypes.LLL.get(), lllEntity.setAttributes().build());
             // GlobalEntityTypeAttributes.put(entitycreatortypes.STOP.get(), stopEntity.prepareAttributes().build());
		  });*/
	 }
}
