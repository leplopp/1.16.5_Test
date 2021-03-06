package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ExperienceOrbRenderer extends EntityRenderer<ExperienceOrbEntity> {
   private static final ResourceLocation EXPERIENCE_ORB_LOCATION = new ResourceLocation("textures/entity/experience_orb.png");
   private static final RenderType RENDER_TYPE = RenderType.itemEntityTranslucentCull(EXPERIENCE_ORB_LOCATION);

   public ExperienceOrbRenderer(EntityRendererManager p_i46178_1_) {
      super(p_i46178_1_);
      this.shadowRadius = 0.15F;
      this.shadowStrength = 0.75F;
   }

   protected int getBlockLightLevel(ExperienceOrbEntity p_225624_1_, BlockPos p_225624_2_) {
      return MathHelper.clamp(super.getBlockLightLevel(p_225624_1_, p_225624_2_) + 7, 0, 15);
   }

   public void render(ExperienceOrbEntity p_225623_1_, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
      p_225623_4_.pushPose();
      int i = p_225623_1_.getIcon();
      float f = (float)(i % 4 * 16 + 0) / 64.0F;
      float f1 = (float)(i % 4 * 16 + 16) / 64.0F;
      float f2 = (float)(i / 4 * 16 + 0) / 64.0F;
      float f3 = (float)(i / 4 * 16 + 16) / 64.0F;
      float f4 = 1.0F;
      float f5 = 0.5F;
      float f6 = 0.25F;
      float f7 = 255.0F;
      float f8 = ((float)p_225623_1_.tickCount + p_225623_3_) / 2.0F;
      int j = (int)((MathHelper.sin(f8 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      int k = 255;
      int l = (int)((MathHelper.sin(f8 + 4.1887903F) + 1.0F) * 0.1F * 255.0F);
      p_225623_4_.translate(0.0D, (double)0.1F, 0.0D);
      p_225623_4_.mulPose(this.entityRenderDispatcher.cameraOrientation());
      p_225623_4_.mulPose(Vector3f.YP.rotationDegrees(180.0F));
      float f9 = 0.3F;
      p_225623_4_.scale(0.3F, 0.3F, 0.3F);
      IVertexBuilder ivertexbuilder = p_225623_5_.getBuffer(RENDER_TYPE);
      MatrixStack.Entry matrixstack$entry = p_225623_4_.last();
      Matrix4f matrix4f = matrixstack$entry.pose();
      Matrix3f matrix3f = matrixstack$entry.normal();
      vertex(ivertexbuilder, matrix4f, matrix3f, -0.5F, -0.25F, j, 255, l, f, f3, p_225623_6_);
      vertex(ivertexbuilder, matrix4f, matrix3f, 0.5F, -0.25F, j, 255, l, f1, f3, p_225623_6_);
      vertex(ivertexbuilder, matrix4f, matrix3f, 0.5F, 0.75F, j, 255, l, f1, f2, p_225623_6_);
      vertex(ivertexbuilder, matrix4f, matrix3f, -0.5F, 0.75F, j, 255, l, f, f2, p_225623_6_);
      p_225623_4_.popPose();
      super.render(p_225623_1_, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
   }

   private static void vertex(IVertexBuilder p_229102_0_, Matrix4f p_229102_1_, Matrix3f p_229102_2_, float p_229102_3_, float p_229102_4_, int p_229102_5_, int p_229102_6_, int p_229102_7_, float p_229102_8_, float p_229102_9_, int p_229102_10_) {
      p_229102_0_.vertex(p_229102_1_, p_229102_3_, p_229102_4_, 0.0F).color(p_229102_5_, p_229102_6_, p_229102_7_, 128).uv(p_229102_8_, p_229102_9_).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_229102_10_).normal(p_229102_2_, 0.0F, 1.0F, 0.0F).endVertex();
   }

   public ResourceLocation getTextureLocation(ExperienceOrbEntity p_110775_1_) {
      return EXPERIENCE_ORB_LOCATION;
   }
}