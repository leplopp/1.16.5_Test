package com.pupmod.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.pupmod.entitys.puppigEntity;

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

public class puppig<T extends puppigEntity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "puppig"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;

	public puppig(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 200).mirror().addBox(-4.0F, -4.0F, -8.0F, 50.0F, 50.0F, 50.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-25.0F, -90.0F, -92.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.0F, -10.0F, -7.0F, 100.0F, 100.0F, 100.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-50.0F, 11.0F, -50.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(200, 200).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, 18.0F, 7.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(200, 200).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 18.0F, 7.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(200, 200).mirror().addBox(-2.0F, 18.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.0F, 0.0F, -5.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(200, 200).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 18.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 400, 300);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		 	this.head.xRot = limbSwing * 0.6662F * 1.4F * limbSwingAmount;
		    this.head.xRot = limbSwing * 0.6662F + (float)Math.PI * 1.4F * limbSwingAmount;
		    this.head.yRot = 0.0F;
		    this.head.yRot = 0.0F;
		    this.head.yRot = limbSwingAmount / (180F / (float)Math.PI);
		    this.body.xRot = limbSwingAmount / (180F / (float)Math.PI);
		    this.body.yRot = this.body.yRot;
		    this.body.xRot = this.body.xRot;
		    this.body.xRot = limbSwing * 0.6662F + (float)Math.PI * 2.0F * limbSwing * 0.5F;
		    this.body.xRot = limbSwing * 0.6662F * 2.0F * netHeadYaw * 0.5F;
		    this.body.zRot = 0.0F;
		    this.body.zRot = 0.0F;
		    this.body.xRot = limbSwing * 0.6662F * 1.4F * limbSwingAmount;
		    this.body.xRot = limbSwing * 0.6662F + (float)Math.PI * 1.4F * limbSwingAmount;
		    this.leg2.yRot = 0.0F;
		    this.leg2.yRot = 0.0F;
		    this.leg2.yRot = limbSwingAmount / (180F / (float)Math.PI);
		    this.leg2.xRot = limbSwingAmount / (180F / (float)Math.PI);
		    this.leg2.yRot = this.head.yRot;
		    this.leg2.xRot = this.head.xRot;
		    this.leg2.xRot = limbSwing * 0.6662F + (float)Math.PI * 2.0F * limbSwing * 0.5F;
		    this.leg2.xRot = limbSwing * 0.6662F * 2.0F * netHeadYaw * 0.5F;
		    this.leg3.zRot = 0.0F;
		    this.leg3.zRot = 0.0F;
		    this.leg3.xRot = limbSwing * 0.6662F * 1.4F * limbSwingAmount;
		    this.leg3.xRot = limbSwing * 0.6662F + (float)Math.PI * 1.4F * limbSwingAmount;
		    this.leg3.yRot = 0.0F;
		    this.leg1.yRot = 0.0F;
		    this.leg1.yRot = limbSwingAmount / (180F / (float)Math.PI);
		    this.leg1.xRot = limbSwingAmount / (180F / (float)Math.PI);
		    this.leg1.yRot = this.head.yRot;
		    this.leg1.xRot = this.head.xRot;
		    this.leg4.xRot = limbSwing * 0.6662F + (float)Math.PI * 2.0F * limbSwing * 0.5F;
		    this.leg4.xRot = limbSwing * 0.6662F * 2.0F * netHeadYaw * 0.5F;
		    this.leg4.zRot = 0.0F;
		    this.leg4.zRot = 0.0F;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		leg1.render(poseStack, buffer, packedLight, packedOverlay);
		leg2.render(poseStack, buffer, packedLight, packedOverlay);
		leg3.render(poseStack, buffer, packedLight, packedOverlay);
		leg4.render(poseStack, buffer, packedLight, packedOverlay);
	}
}