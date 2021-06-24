package com.pupmod.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.pupmod.entitys.gumpalanBigEntity;
import com.pupmod.entitys.puppigEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelBakery;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.model.ModelLoader;

public class gumpalanBig extends EntityModel<gumpalanBigEntity>
{
  //fields
    ModelRenderer Shape1;
  
  public gumpalanBig()
  {
      this.texWidth = 512;
      this.texHeight = 512;
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 100, 300, 150);
      Shape1.setPos(10F, -274F, 0F);
      Shape1.setTexSize(512, 512);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
	  
	  Shape1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
				alpha);	  
  }
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.xRot = x;
    model.yRot = y;
    model.zRot = z;
  }
  
@Override
public void setupAnim(gumpalanBigEntity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_,
		float p_225597_5_, float p_225597_6_) {	
	}
}