package com.pupmod.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.pupmod.entitys.stopEntity;
import com.pupmod.entitys.gumpalanEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ding extends EntityModel<stopEntity>{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
  
  public ding()
  {
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 10, 10, 10);
      Shape1.setPos(-5F, 9F, -5F);
      Shape1.setTexSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 40, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 9, 2);
      Shape2.setPos(-1F, 15F, -1F);
      Shape2.setTexSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
  }
  @Override
  public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
	  Shape1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);	  
	  Shape2.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
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