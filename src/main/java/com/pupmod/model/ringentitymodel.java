package com.pupmod.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.lllEntity;
import com.pupmod.entitys.ringEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class ringentitymodel<T extends ringEntity>  extends EntityModel<ringEntity> {
	private final ModelRenderer ring_base;
	private final ModelRenderer Base_Z_r1;
	private final ModelRenderer Base_Z_side_r1;
	private final ModelRenderer Base_Z_r2;
	private final ModelRenderer Base_Z_top_r1;
	private final ModelRenderer Base_Z_r3;
	private final ModelRenderer Base_Z_r4;
	private final ModelRenderer Base_Z_bottom_r1;

	public ringentitymodel() {
		int textureWidth = 128;
		int textureHeight = 128;

		ring_base = new ModelRenderer(this);
		ring_base.setPos(0.0F, 9F, 0.0F);
		ring_base.setTexSize(42, 13).addBox(-4.0F, -3.6097F, -14.5293F, 8.0F, 8.0F, 5.0F, 0.0F, false);

		Base_Z_r1 = new ModelRenderer(this);
		Base_Z_r1.setPos(0.0F, -10.6F, 9.7F);
		ring_base.addChild(Base_Z_r1);
		setRotationAngle(Base_Z_r1, 2.3562F, 0.0F, 0.0F);
		Base_Z_r1.setTexSize(0, 42).addBox(-4.0F, -18.565F, -15.6066F, 8.0F, 8.0F, 5.0F, 0.0F, false);

		Base_Z_side_r1 = new ModelRenderer(this);
		Base_Z_side_r1.setPos(0.0F, -18.6F, 9.7F);
		ring_base.addChild(Base_Z_side_r1);
		setRotationAngle(Base_Z_side_r1, 3.1416F, 0.0F, 0.0F);
		Base_Z_side_r1.setTexSize(26, 34).addBox(-4.0F, -23.0291F, -5.0292F, 8.0F, 8.0F, 5.0F, 0.0F, false);

		Base_Z_r2 = new ModelRenderer(this);
		Base_Z_r2.setPos(0.0F, -24.2F, 4.0F);
		ring_base.addChild(Base_Z_r2);
		setRotationAngle(Base_Z_r2, -2.3562F, 0.0F, 0.0F);
		Base_Z_r2.setTexSize(0, 29).addBox(-4.0F, -18.6261F, 5.6065F, 8.0F, 8.0F, 5.0F, 0.0F, false);

		Base_Z_top_r1 = new ModelRenderer(this);
		Base_Z_top_r1.setPos(0.0F, -24.2F, -4.0F);
		ring_base.addChild(Base_Z_top_r1);
		setRotationAngle(Base_Z_top_r1, -1.5708F, 0.0F, 0.0F);
		Base_Z_top_r1.setTexSize(26, 0).addBox(-4.0F, -8.1195F, 10.0F, 8.0F, 8.0F, 5.0F, 0.0F, false);

		Base_Z_r3 = new ModelRenderer(this);
		Base_Z_r3.setPos(0.0F, -18.6F, -9.7F);
		ring_base.addChild(Base_Z_r3);
		setRotationAngle(Base_Z_r3, -0.7854F, 0.0F, 0.0F);
		Base_Z_r3.setTexSize(21, 21).addBox(-4.0F, 2.5262F, 5.748F, 8.0F, 8.0F, 5.0F, 0.0F, false);

		Base_Z_r4 = new ModelRenderer(this);
		Base_Z_r4.setPos(0.0F, -5.0F, -4.0F);
		ring_base.addChild(Base_Z_r4);
		setRotationAngle(Base_Z_r4, 0.7854F, 0.0F, 0.0F);
		Base_Z_r4.setTexSize(0, 13).addBox(-4.0F, 2.6773F, -15.5359F, 8.0F, 8.0F, 5.0F, 0.0F, false);

		Base_Z_bottom_r1 = new ModelRenderer(this);
		Base_Z_bottom_r1.setPos(0.0F, 0.0F, 0.0F);
		ring_base.addChild(Base_Z_bottom_r1);
		setRotationAngle(Base_Z_bottom_r1, 1.5708F, 0.0F, 0.0F);
		Base_Z_bottom_r1.setTexSize(0, 0).addBox(-4.0F, -3.9001F, -15.0F, 8.0F, 8.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(ringEntity ring, float f, float f1, float f2, float f3,float f4) {
	this.ring_base.xRot =  f * 0.2F ;	
	}
	
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
			ring_base.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}