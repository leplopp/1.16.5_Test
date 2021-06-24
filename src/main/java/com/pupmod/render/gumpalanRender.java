package com.pupmod.render;

import javax.annotation.Nullable;
import com.pupmod.pupmod;
import com.pupmod.entitys.gumpalanEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class gumpalanRender extends MobRenderer<gumpalanEntity, com.pupmod.model.gumpalan>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/gumpalan.png");

	public gumpalanRender(EntityRendererManager render) {
		super(render, new com.pupmod.model.gumpalan(), 2.0f);
	}
    @Nullable
	@Override
	public ResourceLocation getTextureLocation(gumpalanEntity entity) {
		return TEXTURE;
	}
}
