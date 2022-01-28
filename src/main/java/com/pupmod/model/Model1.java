package com.pupmod.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.pupmod.entitys.NiggiEntity;

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
import net.minecraft.world.entity.Entity;

public class Model1<T extends NiggiEntity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("pupmod", "niggi"), "main");
	private final ModelPart bein1;
	private final ModelPart bein2;
	private final ModelPart koeper1;
	private final ModelPart arm1;
	private final ModelPart arm2;
	private final ModelPart kleinerkopf;

	public Model1(ModelPart root) {
		this.bein1 = root.getChild("bein1");
		this.bein2 = root.getChild("bein2");
		this.koeper1 = root.getChild("koeper1");
		this.arm1 = root.getChild("arm1");
		this.arm2 = root.getChild("arm2");
		this.kleinerkopf = root.getChild("kleinerkopf");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bein1 = partdefinition.addOrReplaceChild("bein1", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(1.2944F, 0.0F, 3.9147F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 24.0F, -5.0F, 0.0F, -0.0744F, -3.1416F));

		PartDefinition bein2 = partdefinition.addOrReplaceChild("bein2", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-1.4306F, -0.1298F, 3.8648F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 8.0F, -5.0F, 0.0F, 0.1115F, -0.1301F));

		PartDefinition koeper1 = partdefinition.addOrReplaceChild("koeper1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, 0.0F, 4.0F, 13.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-6.0F, -9.0F, -6.0F));

		PartDefinition arm1 = partdefinition.addOrReplaceChild("arm1", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(0.2944F, -2.0F, 3.9147F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, 4.0F, -5.0F, 0.0F, -0.0744F, -3.1416F));

		PartDefinition arm2 = partdefinition.addOrReplaceChild("arm2", CubeListBuilder.create().texOffs(50, 15).mirror().addBox(1.2944F, -2.0F, 3.9147F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 4.0F, -5.0F, 0.0F, -0.0744F, -3.1416F));

		PartDefinition kleinerkopf = partdefinition.addOrReplaceChild("kleinerkopf", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-2.0F, 0.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -11.0F, -6.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.bein1.xRot = limbSwing *  1.4F * limbSwingAmount;
		this.bein2.xRot = limbSwing * 0.6662F + (float) Math.PI * 1.4F * limbSwingAmount;
		this.bein1.yRot = 0.0F;
		this.bein2.yRot = 0.0F;
		this.kleinerkopf.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.kleinerkopf.xRot = headPitch / (180F / (float) Math.PI * 10);
		this.koeper1.yRot = this.koeper1.yRot;
		this.koeper1.xRot = this.koeper1.xRot;
		this.arm1.xRot = limbSwing * 0.6662F + (float) Math.PI * 2.0F * limbSwing * 0.5F;
		this.arm2.xRot = limbSwing * 0.6662F * 2.0F * netHeadYaw * 0.5F;
		this.arm1.zRot = 0.0F;
		this.arm2.zRot = 0.0F;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bein1.render(poseStack, buffer, packedLight, packedOverlay);
		bein2.render(poseStack, buffer, packedLight, packedOverlay);
		koeper1.render(poseStack, buffer, packedLight, packedOverlay);
		arm1.render(poseStack, buffer, packedLight, packedOverlay);
		arm2.render(poseStack, buffer, packedLight, packedOverlay);
		kleinerkopf.render(poseStack, buffer, packedLight, packedOverlay);
	}
}