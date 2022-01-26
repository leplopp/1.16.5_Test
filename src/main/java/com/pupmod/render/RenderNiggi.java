package com.pupmod.render;

import javax.annotation.Nullable;
import com.electronwill.nightconfig.core.io.CharsWrapper.Builder;
import com.pupmod.pupmod;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.model.Model1;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderNiggi<Type extends NiggiEntity> extends MobRenderer<Type, Model1<Type>>{

	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/1.png");	
	
	public RenderNiggi(Context render) {
		super(render, new Model1<>(render.bakeLayer(Model1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NiggiEntity entity) {
		return TEXTURE;
	}
}
