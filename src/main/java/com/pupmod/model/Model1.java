package com.pupmod.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.pupmod.entitys.NiggiEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.GiantEntity;
import net.minecraft.util.math.MathHelper;

public class Model1<T extends NiggiEntity>  extends EntityModel<NiggiEntity> {
	// fields
	public ModelRenderer bein1;
	public ModelRenderer bein2;
	public ModelRenderer koeper1;
	public ModelRenderer arm1;
	public ModelRenderer arm2;
	public ModelRenderer kleinerkopf;

	public Model1() {
		int textureWidth = 64;
		int textureHeight = 32;

		bein1 = new ModelRenderer(this, 42, 0);
		bein1.addBox(0F, 0F, 0F, 2, 17, 2);
		bein1.setPos(-3F, 24F, -5F);
		bein1.setTexSize(64, 32);
		// bein1.setRotationPoint(-3F, 24F, -5F);
		// bein1.setTextureSize(64, 32);
		bein1.mirror = true;
		setRotation(bein1, 0F, -0.0743572F, -3.141593F);
		bein2 = new ModelRenderer(this, 34, 0);
		bein2.addBox(0F, 0F, 0F, 2, 16, 2);
		bein2.setPos(5F, 8F, -5F);
		bein2.setTexSize(64, 32);
		bein2.mirror = true;
		setRotation(bein2, 0F, 0.1115358F, -0.1301251F);
		koeper1 = new ModelRenderer(this, 0, 0);
		koeper1.addBox(0F, 0F, 0F, 13, 17, 4);
		koeper1.setPos(-6F, -9F, -6F);
		koeper1.setTexSize(64, 32);
		koeper1.mirror = true;
		setRotation(koeper1, 0F, 0F, 0F);
		arm1 = new ModelRenderer(this, 50, 0);
		arm1.addBox(0F, 0F, 0F, 2, 13, 2);
		arm1.setPos(8F, 4F, -5F);
		arm1.setTexSize(64, 32);
		arm1.mirror = true;
		setRotation(arm1, 0F, -0.0743572F, -3.141593F);
		arm2 = new ModelRenderer(this, 50, 15);
		arm2.addBox(0F, 0F, 0F, 2, 13, 2);
		arm2.setPos(-6F, 4F, -5F);
		arm2.setTexSize(64, 32);
		arm2.mirror = true;
		setRotation(arm2, 0F, -0.0743572F, -3.141593F);
		kleinerkopf = new ModelRenderer(this, 0, 21);
		kleinerkopf.addBox(0F, 0F, 0F, 2, 2, 2);
		kleinerkopf.setPos(0F, -11F, -6F);
		kleinerkopf.setTexSize(64, 32);
		kleinerkopf.mirror = true;
		setRotation(kleinerkopf, 0F, 0F, 0F);
	}

	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		{

			bein1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
					alpha);
			bein2.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
					alpha);
			koeper1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
					alpha);
			arm1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
					alpha);
			arm2.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
					alpha);
			kleinerkopf.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
					alpha);

		}

	}
	@Override
	public void setupAnim(NiggiEntity niggi, float f, float f1, float f2, float f3,
			float f4) {

		this.bein1.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.bein2.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.bein1.yRot = 0.0F;
		this.bein2.yRot = 0.0F;
		this.kleinerkopf.yRot = f1 / (180F / (float) Math.PI);
		this.kleinerkopf.xRot = f1 / (180F / (float) Math.PI);
		this.koeper1.yRot = this.koeper1.yRot;
		this.koeper1.xRot = this.koeper1.xRot;
		this.arm1.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 2.0F * f * 0.5F;
		this.arm2.xRot = MathHelper.cos(f * 0.6662F) * 2.0F * f3 * 0.5F;
		this.arm1.zRot = 0.0F;
		this.arm2.zRot = 0.0F;

		
	}
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.xRot = x;
		model.yRot = y;
		model.zRot = z;
	}

/*
 * 
 * 1.7.10 renderanim
 * 
 * 
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		this.bein1.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.bein2.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.bein1.yRot = 0.0F;
		this.bein2.yRot = 0.0F;
		this.kleinerkopf.yRot = f1 / (180F / (float) Math.PI);
		this.kleinerkopf.xRot = f1 / (180F / (float) Math.PI);
		this.koeper1.yRot = this.koeper1.yRot;
		this.koeper1.xRot = this.koeper1.xRot;
		this.arm1.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 2.0F * f * 0.5F;
		this.arm2.xRot = MathHelper.cos(f * 0.6662F) * 2.0F * f3 * 0.5F;
		this.arm1.zRot = 0.0F;
		this.arm2.zRot = 0.0F;
	}
*/

}
