// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class gumpalanBig<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "gumpalanbig"), "main");
	private final ModelPart Shape1;

	public gumpalanBig(ModelPart root) {
		this.Shape1 = root.getChild("Shape1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Shape1 = partdefinition.addOrReplaceChild("Shape1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-60.0F, -2.0F, -70.0F, 100.0F, 300.0F, 150.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(10.0F, -274.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Shape1.render(poseStack, buffer, packedLight, packedOverlay);
	}
}