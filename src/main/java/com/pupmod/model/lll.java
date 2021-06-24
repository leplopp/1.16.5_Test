package com.pupmod.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.pupmod.entitys.gumpalanBigEntity;
import com.pupmod.entitys.lllEntity;
import net.minecraft.client.renderer.entity.EnderDragonRenderer.EnderDragonModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class lll extends EntityModel<lllEntity>{
	//fields
	public ModelRenderer Shape1;

	public lll()
	{
	      this.texWidth = 64;
	      this.texHeight = 64;
		Shape1 = new ModelRenderer(this, 64, 32);
		Shape1.setPos(0F, 0F, 0F);
		Shape1.addBox(0, 0, 0F, 9, 25, 25);
		Shape1.xRot = 0F;
		Shape1.yRot = 0F;
		Shape1.zRot = 0F;
	}
	
	  @Override
	  public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int packedLightIn, int packedOverlayIn,
				float red, float green, float blue, float alpha) {
	    Shape1.render(matrixStack, iVertexBuilder, packedLightIn, packedOverlayIn, red, green, blue,
				alpha);	  
	  }
	@Override
	public void setupAnim(lllEntity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_,
			float p_225597_5_, float p_225597_6_) {	}
}
