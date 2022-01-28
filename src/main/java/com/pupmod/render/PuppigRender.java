package com.pupmod.render;

import com.pupmod.pupmod;
import com.pupmod.entitys.puppigEntity;
import com.pupmod.model.puppig;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

public class PuppigRender<Type extends puppigEntity> extends MobRenderer<Type, puppig<Type>>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/puppig.png");	
	
	public PuppigRender(Context render) {
		super(render, new puppig<>(render.bakeLayer(puppig.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(puppigEntity entity) {
		return TEXTURE;
	}
}
