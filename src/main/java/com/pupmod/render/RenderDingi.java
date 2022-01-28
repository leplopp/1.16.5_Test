package com.pupmod.render;

import com.pupmod.pupmod;
import com.pupmod.entitys.dingiEntity;
import com.pupmod.model.ding;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderDingi<Type extends dingiEntity> extends MobRenderer<Type, ding<Type>>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/lll.png");	
	
	public RenderDingi(Context render) {
		super(render, new ding<>(render.bakeLayer(ding.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(dingiEntity entity) {
		return TEXTURE;
	}
}
