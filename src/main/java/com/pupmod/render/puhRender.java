package com.pupmod.render;

import com.pupmod.pupmod;
import com.pupmod.entitys.PuhEntity;
import com.pupmod.model.puh;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

public class puhRender<Type extends PuhEntity> extends MobRenderer<Type, puh<Type>>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/puh.png");	
	
	public puhRender(Context render) {
		super(render, new puh<>(render.bakeLayer(puh.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PuhEntity entity) {
		return TEXTURE;
	}
}