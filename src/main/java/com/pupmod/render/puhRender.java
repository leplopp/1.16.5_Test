package com.pupmod.render;

import javax.annotation.Nullable;

import com.pupmod.pupmod;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.PuhEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class puhRender extends MobRenderer<PuhEntity, com.pupmod.model.puh>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/puh.png");
	
	
	
	public puhRender(EntityRendererManager render) {
	
		super(render, new com.pupmod.model.puh(), 1.0f);
	}


    @Nullable
	@Override
	public ResourceLocation getTextureLocation(PuhEntity entity) {
		return TEXTURE;
	}
}
