package com.pupmod.render;

import javax.annotation.Nullable;

import com.pupmod.pupmod;
import com.pupmod.entitys.PuhEntity;
import com.pupmod.entitys.gumpalanBigEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class gumpalanBigRender extends MobRenderer<gumpalanBigEntity, com.pupmod.model.gumpalanBig>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/klotz2.png");
	
	
	
	public gumpalanBigRender(EntityRendererManager render) {
	
		super(render, new com.pupmod.model.gumpalanBig(), 5.0f);
	}


    @Nullable
	@Override
	public ResourceLocation getTextureLocation(gumpalanBigEntity entity) {
		return TEXTURE;
	}
}

