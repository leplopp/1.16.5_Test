package com.pupmod.render;

import com.pupmod.pupmod;
import com.pupmod.entitys.ringEntity;
import com.pupmod.model.ringentitymodel;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

public class ringRender<Type extends ringEntity> extends MobRenderer<Type, ringentitymodel<Type>>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/ringentity.png");	
	
	public ringRender(Context render) {
		super(render, new ringentitymodel<>(render.bakeLayer(ringentitymodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ringEntity entity) {
		return TEXTURE;
	}
}
