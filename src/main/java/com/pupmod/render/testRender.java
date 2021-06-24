package com.pupmod.render;

import javax.annotation.Nullable;

import com.pupmod.pupmod;
import com.pupmod.entitys.testEntity;
import com.pupmod.model.testModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class testRender extends MobRenderer<testEntity, testModel> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(pupmod.MODID, "textures/entity/test.png");

    public testRender(EntityRendererManager manager) {
        super(manager, new testModel(), 0.5f);
    }

    @Nullable
    @Override
    public ResourceLocation getTextureLocation(testEntity entity) {
        return TEXTURE;
    }

}
