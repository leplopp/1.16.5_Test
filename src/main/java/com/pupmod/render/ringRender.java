package com.pupmod.render;

import javax.annotation.Nullable;
import com.pupmod.pupmod;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.lllEntity;
import com.pupmod.entitys.ringEntity;
import com.pupmod.model.Model1;
import com.pupmod.model.ringentitymodel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ringRender extends MobRenderer<ringEntity, ringentitymodel<ringEntity>>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/ringentity.png");
	
	public ringRender(EntityRendererManager render) {
	
		super(render, new ringentitymodel<>(), 0.5f);
	}
    @Nullable
	@Override
	public ResourceLocation getTextureLocation(ringEntity entity) {
		return TEXTURE;
	}
}


