package com.pupmod.render;

import javax.annotation.Nullable;
import com.pupmod.pupmod;
import com.pupmod.entitys.gumpalanEntity;
import com.pupmod.entitys.stopEntity;
import com.pupmod.model.stop;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class stopRender extends MobRenderer<stopEntity, stop>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/stop.png");

	public stopRender(EntityRendererManager render) {
		super(render, new stop(), 1.0f);
	}
    @Nullable
	@Override
	public ResourceLocation getTextureLocation(stopEntity entity) {
		return TEXTURE;
	}
}


