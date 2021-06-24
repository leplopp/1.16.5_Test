package com.pupmod.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.pupmod.entitys.gumpalanEntity;
import com.pupmod.entitys.stopEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class stop extends EntityModel<stopEntity>
{
  //fields
    ModelRenderer boden;
    ModelRenderer halter;
    ModelRenderer stamm;
    ModelRenderer schild;
  
  public stop()
  {  
		int textureWidth = 128;
		int textureHeight = 128;
      
      boden.mirror = true;
      boden = new ModelRenderer(this, 0, 0);
      boden.addBox(-6F, 0F, -6F, 12, 5, 12);
      boden.setPos(0F, 19.2F, 0F);
      boden.setTexSize(128, 128);
      boden.mirror = true;
      setRotation(boden, 0F, 0F, 0F);
      boden.mirror = false;
      halter = new ModelRenderer(this, 8, 17);
      halter.addBox(-4F, 0F, -4F, 8, 5, 8);
      halter.setPos(0F, 14.8F, 0F);
      halter.setTexSize(128, 128);
      halter.mirror = true;
      setRotation(halter, 0F, 0F, 0F);
      stamm = new ModelRenderer(this, 0, 17);
      stamm.addBox(0F, 0F, -1F, 2, 30, 2);
      stamm.setPos(-1F, -15F, 0F);
      stamm.setTexSize(128, 128);
      stamm.mirror = true;
      setRotation(stamm, 0F, 0F, 0F);
      schild = new ModelRenderer(this, 48, 0);
      schild.addBox(0F, -6F, -6F, 0, 12, 12);
      schild.setPos(-1F, -15F, 0F);
      schild.setTexSize(128, 128);
      schild.mirror = true;
      setRotation(schild, 0F, 0F, 0F);
  }
  @Override
  public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
	  boden.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);	  
	  halter.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
				alpha);	
	  stamm.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
				alpha);	
	  schild.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
				alpha);	
  } 
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.xRot = x;
    model.yRot = y;
    model.zRot = z;
  }
@Override
public void setupAnim(stopEntity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_,
		float p_225597_5_, float p_225597_6_) {
	}
}