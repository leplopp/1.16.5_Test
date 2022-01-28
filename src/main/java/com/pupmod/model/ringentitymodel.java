package com.pupmod.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.pupmod.entitys.ringEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

public class ringentitymodel<T extends ringEntity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ringentitymodel"), "main");
	private final ModelPart ring_base;

	public ringentitymodel(ModelPart root) {
		this.ring_base = root.getChild("ring_base");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ring_base = partdefinition.addOrReplaceChild("ring_base", CubeListBuilder.create().texOffs(42, 13).addBox(-4.0F, -3.6097F, -14.5293F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Base_Z_r1 = ring_base.addOrReplaceChild("Base_Z_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-4.0F, -18.565F, -15.6066F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.6F, 9.7F, 2.3562F, 0.0F, 0.0F));

		PartDefinition Base_Z_side_r1 = ring_base.addOrReplaceChild("Base_Z_side_r1", CubeListBuilder.create().texOffs(26, 34).addBox(-4.0F, -23.0291F, -5.0292F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.6F, 9.7F, 3.1416F, 0.0F, 0.0F));

		PartDefinition Base_Z_r2 = ring_base.addOrReplaceChild("Base_Z_r2", CubeListBuilder.create().texOffs(0, 29).addBox(-4.0F, -18.6261F, 5.6065F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.2F, 4.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Base_Z_top_r1 = ring_base.addOrReplaceChild("Base_Z_top_r1", CubeListBuilder.create().texOffs(26, 0).addBox(-4.0F, -8.1195F, 10.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.2F, -4.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Base_Z_r3 = ring_base.addOrReplaceChild("Base_Z_r3", CubeListBuilder.create().texOffs(21, 21).addBox(-4.0F, 2.5262F, 5.748F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.6F, -9.7F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Base_Z_r4 = ring_base.addOrReplaceChild("Base_Z_r4", CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, 2.6773F, -15.5359F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -4.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Base_Z_bottom_r1 = ring_base.addOrReplaceChild("Base_Z_bottom_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.9001F, -15.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.ring_base.xRot =  limbSwing * 0.2F ;	
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		ring_base.render(poseStack, buffer, packedLight, packedOverlay);
	}
}