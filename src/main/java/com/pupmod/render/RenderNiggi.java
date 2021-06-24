package com.pupmod.render;

import javax.annotation.Nullable;
import com.electronwill.nightconfig.core.io.CharsWrapper.Builder;
import com.pupmod.pupmod;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.model.Model1;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.ResourceLocation;

public class RenderNiggi extends MobRenderer<NiggiEntity, Model1<NiggiEntity>>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/1.png");	
	
	public RenderNiggi(EntityRendererManager render) {
		super(render, new Model1<>(), 0.5f);
	}
    @Nullable
	@Override
	public ResourceLocation getTextureLocation(NiggiEntity entity) {
		return TEXTURE;
	}
}
