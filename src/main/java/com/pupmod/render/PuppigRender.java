package com.pupmod.render;

import javax.annotation.Nullable;

import com.pupmod.pupmod;
import com.pupmod.entitys.PuhEntity;
import com.pupmod.entitys.puppigEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class PuppigRender extends MobRenderer<puppigEntity, com.pupmod.model.puppig>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/puppig.png");
	
	
	
	public PuppigRender(EntityRendererManager render) {
	
		super(render, new com.pupmod.model.puppig(), 6f);
	}


    @Nullable
	@Override
	public ResourceLocation getTextureLocation(puppigEntity entity) {
		return TEXTURE;
	}

}

