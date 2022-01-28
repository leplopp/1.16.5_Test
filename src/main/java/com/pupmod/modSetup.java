package com.pupmod;

import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.PuhEntity;
import com.pupmod.entitys.dingiEntity;
import com.pupmod.entitys.entitycreatortypes;
import com.pupmod.entitys.gumpalanBigEntity;
import com.pupmod.entitys.puppigEntity;
import com.pupmod.entitys.ringEntity;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = pupmod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class modSetup {

	public static void init(final EntityAttributeCreationEvent event) { 
		event.put(entitycreatortypes.NIGGI.get(), NiggiEntity.createAttributes().build());
		event.put(entitycreatortypes.DINGI.get(), dingiEntity.createAttributes().build());
		event.put(entitycreatortypes.GUMPALAN_BIG.get(), gumpalanBigEntity.createAttributes().build());
		event.put(entitycreatortypes.PUH.get(), PuhEntity.createAttributes().build());
		event.put(entitycreatortypes.RINGENTITY.get(), ringEntity.createAttributes().build());
		event.put(entitycreatortypes.PUPPIG.get(), puppigEntity.createAttributes().build());
		
		
		
	
	 }
}
