package com.pupmod.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.pupmod.entitys.NiggiEntity;
import com.pupmod.entitys.PuhEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class puh extends EntityModel<PuhEntity>
{
  //fields
	public ModelRenderer head;
	public ModelRenderer body;
	public ModelRenderer leg1;
	public ModelRenderer leg2;
	public ModelRenderer leg3;
	public ModelRenderer leg4;
	public ModelRenderer horn1;
	public ModelRenderer horn2;
	public ModelRenderer udders;
  
  public puh()
  {
    int textureWidth = 64;
    int textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -4F, -6F, 8, 8, 6);
      head.setPos(0F, 4F, -8F);
      head.setTexSize(64, 32);
      head.mirror = false;
      setRotation(head, -3.141593F, 1.152537F, 0F);
      body = new ModelRenderer(this, 18, 4);
      body.addBox(-6F, -10F, -7F, 12, 18, 10);
      body.setPos(0F, 5F, 2F);
      body.setTexSize(64, 32);
      body.mirror = false;
      setRotation(body, 2.351547F, -1.784573F, 0.4089647F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-3F, 0F, -2F, 4, 12, 4);
      leg1.setPos(-3F, 12F, 7F);
      leg1.setTexSize(64, 32);
      leg1.mirror = false;
      setRotation(leg1, 1.524323F, -1.561502F, 0.8551081F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-1F, 0F, -2F, 4, 12, 4);
      leg2.setPos(3F, 12F, 7F);
      leg2.setTexSize(64, 32);
      leg2.mirror = false;
      setRotation(leg2, 0.7063936F, -2.974289F, -1.784573F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-3F, -3F, -3F, 4, 12, 4);
      leg3.setPos(-3F, 12F, -5F);
      leg3.setTexSize(64, 32);
      leg3.mirror = false;
      setRotation(leg3, 0F, 3.141593F, -0.7063936F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-1F, 0F, -3F, 4, 12, 4);
      leg4.setPos(3F, 12F, -5F);
      leg4.setTexSize(64, 32);
      leg4.mirror = false;
      setRotation(leg4, 1.487144F, 0F, -1.375609F);
      horn1 = new ModelRenderer(this, 22, 0);
      horn1.addBox(-4F, -5F, -4F, 1, 3, 1);
      horn1.setPos(0F, 3F, -7F);
      horn1.setTexSize(64, 32);
      horn1.mirror = false;
      setRotation(horn1, 0F, 0F, 1.858931F);
      horn2 = new ModelRenderer(this, 22, 0);
      horn2.addBox(3F, -5F, -4F, 1, 3, 1);
      horn2.setPos(0F, 3F, -7F);
      horn2.setTexSize(64, 32);
      horn2.mirror = false;
      setRotation(horn2, 1.041001F, 0F, 0F);
      udders = new ModelRenderer(this, 52, 0);
      udders.addBox(-2F, -3F, 0F, 4, 6, 2);
      udders.setPos(0F, 14F, 6F);
      udders.setTexSize(64, 32);
      udders.mirror = false;
      setRotation(udders, 1.570796F, 0F, 0F);
  }
  
  public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		{
			//setupAnim(puh, f, f1, f2, f3, f4);
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
    horn1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
    horn2.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
    udders.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);
		}
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.xRot = x;
    model.yRot = y;
    model.zRot = z;
  }
  
  public void setupAnim(PuhEntity puh, float f, float f1, float f2, float f3,
			float f4) {
	  
	  this.head.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.body.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.leg2.yRot = 0.1F;
	  this.leg1.yRot = 0.4F;
	  this.leg3.yRot = f1 / (180F / (float)Math.PI);
	  this.leg4.xRot = f1 / (180F / (float)Math.PI);
	  this.horn1.yRot = this.leg2.yRot;
	  this.horn2.xRot = this.head.xRot;
	  this.head.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f * 0.5F;
	  this.body.xRot = MathHelper.cos(f * 0.6662F) * 2.0F * f3 * 0.5F;
	  this.body.zRot = 0.0F;
	  this.leg3.zRot = 2.0F * f3 * 0.5F;
	  
  }
}

/*  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
   // super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  
  this.head.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  this.body.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  this.leg2.yRot = 0.0F;
  this.leg1.yRot = 0.0F;
  this.leg3.yRot = f1 / (180F / (float)Math.PI);
  this.leg4.xRot = f1 / (180F / (float)Math.PI);
  this.horn1.yRot = this.leg2.yRot;
  this.horn2.xRot = this.head.xRot;
  this.head.xRot = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f * 0.5F;
  this.body.xRot = MathHelper.cos(f * 0.6662F) * 2.0F * f3 * 0.5F;
  this.body.zRot = 0.0F;
  this.leg3.zRot = 0.0F;
}
*/

