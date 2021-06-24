package com.pupmod.render;

import javax.annotation.Nullable;
import com.pupmod.pupmod;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.lllEntity;
import com.pupmod.model.Model1;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class lllRender extends MobRenderer<lllEntity, com.pupmod.model.lll>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/lll.png");
	
	public lllRender(EntityRendererManager render) {
	
		super(render, new com.pupmod.model.lll(), 0.5f);
	}
    @Nullable
	@Override
	public ResourceLocation getTextureLocation(lllEntity entity) {
		return TEXTURE;
	}
}


