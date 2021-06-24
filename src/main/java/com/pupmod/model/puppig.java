package com.pupmod.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.pupmod.entitys.PuhEntity;
import com.pupmod.entitys.puppigEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.GiantModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class puppig extends EntityModel<puppigEntity>
{	
  //fields
	public ModelRenderer head;
	public ModelRenderer body;
	public ModelRenderer leg1;
	public ModelRenderer leg2;
	public ModelRenderer leg3;
	public ModelRenderer leg4;

  public puppig()
  {
    
      head = new ModelRenderer(this, 0, 200);
      head.addBox(-4F, -4F, -8F, 50, 50, 50);
      head.setPos(-25F, -90F, -92F);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(-5F, -10F, -7F, 100, 100, 100);
      body.setPos(-50F, 11F, -50F);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 200, 200);
      leg1.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg1.setPos(-3F, 18F, 7F);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 200, 200);
      leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg2.setPos(3F, 18F, 7F);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 200, 200);
      leg3.addBox(-2F, 18F, -2F, 4, 6, 4);
      leg3.setPos(-3F, 0F, -5F);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 200, 200);
      leg4.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg4.setPos(3F, 18F, -5F);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
  }
  
  public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		{
    head.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
    body.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
    leg1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
    leg2.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
    leg3.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
    leg4.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
		}
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.xRot = x;
    model.yRot = y;
    model.zRot = z;
  }
  
  public void setupAnim(puppigEntity puppig, float f, float f1, float f2, float f3,
			float f4) { 
    this.head.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.head.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.head.yRot = 0.0F;
    this.head.yRot = 0.0F;
    this.head.yRot = f1 / (180F / (float)Math.PI);
    this.body.xRot = f1 / (180F / (float)Math.PI);
    this.body.yRot = this.body.yRot;
    this.body.xRot = this.body.xRot;
    this.body.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f * 0.5F;
    this.body.xRot = MathHelper.cos(f * 0.6662F) * 2.0F * f3 * 0.5F;
    this.body.zRot = 0.0F;
    this.body.zRot = 0.0F;
    this.body.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.body.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.leg2.yRot = 0.0F;
    this.leg2.yRot = 0.0F;
    this.leg2.yRot = f1 / (180F / (float)Math.PI);
    this.leg2.xRot = f1 / (180F / (float)Math.PI);
    this.leg2.yRot = this.head.yRot;
    this.leg2.xRot = this.head.xRot;
    this.leg2.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f * 0.5F;
    this.leg2.xRot = MathHelper.cos(f * 0.6662F) * 2.0F * f3 * 0.5F;
    this.leg3.zRot = 0.0F;
    this.leg3.zRot = 0.0F;
    this.leg3.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leg3.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.leg3.yRot = 0.0F;
    this.leg1.yRot = 0.0F;
    this.leg1.yRot = f1 / (180F / (float)Math.PI);
    this.leg1.xRot = f1 / (180F / (float)Math.PI);
    this.leg1.yRot = this.head.yRot;
    this.leg1.xRot = this.head.xRot;
    this.leg4.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f * 0.5F;
    this.leg4.xRot = MathHelper.cos(f * 0.6662F) * 2.0F * f3 * 0.5F;
    this.leg4.zRot = 0.0F;
    this.leg4.zRot = 0.0F;
  }
}