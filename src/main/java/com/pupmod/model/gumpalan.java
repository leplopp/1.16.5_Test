package com.pupmod.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.pupmod.entitys.gumpalanBigEntity;
import com.pupmod.entitys.gumpalanEntity;
import net.minecraft.client.model.CowModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.MobRenderer;

public class gumpalan extends EntityModel<gumpalanEntity>{
  //fields
	 protected final ModelPart Shape1;
  
  public gumpalan()
  {
      this.texWidth = 512;
      this.texHeight = 512; 
      Shape1 = new ModelPart(this, 0, 0);
      Shape1.addBox(0F, -76F, 0F, 100, 100, 100);
      Shape1.setPos(0F, 0F, 0F);
      Shape1.setTexSize(512, 512);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  @Override
  public void renderToBuffer(PoseStack matrixStack, VertexConsumer iVertexBuilder, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
    Shape1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
			alpha);	  
  }
  private void setRotation(model model, float x, float y, float z)
  {
    model.xRot = x;
    model.yRot = y;
    model.zRot = z;
  }
@Override
public void setupAnim(gumpalanEntity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_,
		float p_225597_5_, float p_225597_6_) {	
	

	}

}