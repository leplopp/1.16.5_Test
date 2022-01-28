package com.pupmod.render;

import com.pupmod.pupmod;
import com.pupmod.entitys.gumpalanBigEntity;
import com.pupmod.model.gumpalanBig;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class gumpalanBigRender<Type extends gumpalanBigEntity> extends MobRenderer<Type, gumpalanBig<Type>>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/gumpalanbig.png");	
	
	public gumpalanBigRender(Context render) {
		super(render, new gumpalanBig<>(render.bakeLayer(gumpalanBig.LAYER_LOCATION)), 10f);
	}

	@Override
	public ResourceLocation getTextureLocation(gumpalanBigEntity entity) {
		return TEXTURE;
	}
}

