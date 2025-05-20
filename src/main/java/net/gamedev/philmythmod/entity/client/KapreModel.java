package net.gamedev.philmythmod.entity.client;// Made with Blockbench 4.12.4

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.AswangAnimation;
import net.gamedev.philmythmod.entity.animations.KapreAnimation;
import net.gamedev.philmythmod.entity.boss.AswangEntity;
import net.gamedev.philmythmod.entity.boss.KapreEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class KapreModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart kapre;
	private final ModelPart body;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart head;
	private final ModelPart face;
	private final ModelPart cigarette;
	private final ModelPart moss;
	private final ModelPart moss_r;
	private final ModelPart moss_l;
	private final ModelPart moss_f;
	private final ModelPart moss_top;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public KapreModel(ModelPart root) {
		this.kapre = root.getChild("kapre");
		this.body = this.kapre.getChild("body");
		this.right_arm = this.body.getChild("right_arm");
		this.left_arm = this.body.getChild("left_arm");
		this.head = this.kapre.getChild("head");
		this.face = this.head.getChild("face");
		this.cigarette = this.head.getChild("cigarette");
		this.moss = this.head.getChild("moss");
		this.moss_r = this.moss.getChild("moss_r");
		this.moss_l = this.moss.getChild("moss_l");
		this.moss_f = this.moss.getChild("moss_f");
		this.moss_top = this.moss.getChild("moss_top");
		this.left_leg = this.kapre.getChild("left_leg");
		this.right_leg = this.kapre.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition kapre = partdefinition.addOrReplaceChild("kapre", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -51.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body = kapre.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-23.75F, -23.125F, -10.0F, 47.5F, 27.5F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-18.75F, 4.375F, -10.0F, 37.5F, 10.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.25F, 33.125F, 2.5F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(136, 0).addBox(-5.5081F, -22.2283F, -9.7676F, 10.0F, 25.0F, 17.5F, new CubeDeformation(0.0F)), PartPose.offset(-28.2491F, -1.2375F, -0.6477F));

		PartDefinition cube_r1 = right_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 101).addBox(-3.42F, -12.17F, -8.42F, 11.84F, 24.34F, 16.84F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.9919F, 9.7283F, 1.0176F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(58, 142).addBox(-4.2581F, -22.2283F, -9.7676F, 10.0F, 25.0F, 17.5F, new CubeDeformation(0.0F)), PartPose.offset(28.0009F, -1.2375F, -0.6477F));

		PartDefinition cube_r2 = left_arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 121).addBox(-3.42F, -12.17F, -8.42F, 11.84F, 24.34F, 16.84F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-3.2419F, 9.7283F, 1.0176F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = kapre.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-1.25F, 3.125F, 13.75F));

		PartDefinition face = head.addOrReplaceChild("face", CubeListBuilder.create().texOffs(0, 78).addBox(-11.25F, -10.0F, -11.25F, 22.5F, 20.0F, 22.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.125F, -7.5F));

		PartDefinition cigarette = head.addOrReplaceChild("cigarette", CubeListBuilder.create().texOffs(58, 121).addBox(-1.25F, -1.25F, -3.75F, 2.5F, 2.5F, 7.5F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 3.125F, 7.5F));

		PartDefinition moss = head.addOrReplaceChild("moss", CubeListBuilder.create().texOffs(92, 78).addBox(-12.5F, -1.25F, -11.25F, 25.0F, 2.5F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.75F, -8.125F));

		PartDefinition moss_r = moss.addOrReplaceChild("moss_r", CubeListBuilder.create().texOffs(150, 129).addBox(-1.25F, -3.3333F, -11.6667F, 2.5F, 7.5F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(162, 180).addBox(-1.25F, -3.3333F, 5.8333F, 2.5F, 7.5F, 5.0F, new CubeDeformation(-0.001F))
		.texOffs(178, 180).addBox(-1.25F, -3.3333F, -1.6667F, 2.5F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.25F, 4.5833F, 0.4167F));

		PartDefinition moss_l = moss.addOrReplaceChild("moss_l", CubeListBuilder.create().texOffs(172, 43).addBox(-1.25F, -3.3333F, -11.6667F, 2.5F, 7.5F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(172, 56).addBox(-1.25F, -3.3333F, 5.8333F, 2.5F, 7.5F, 5.0F, new CubeDeformation(-0.001F))
		.texOffs(182, 69).addBox(-1.25F, -3.3333F, -1.6667F, 2.5F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(11.25F, 4.5833F, 0.4167F));

		PartDefinition moss_f = moss.addOrReplaceChild("moss_f", CubeListBuilder.create().texOffs(114, 180).addBox(3.8889F, -2.9167F, -2.5F, 2.5F, 7.5F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(130, 180).addBox(-8.6111F, -2.9167F, -2.5F, 2.5F, 7.5F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(58, 132).addBox(-13.6111F, -2.9167F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(182, 79).addBox(-3.6111F, -2.9167F, -2.5F, 2.5F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(182, 89).addBox(6.3889F, -2.9167F, -2.5F, 2.5F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(50, 185).addBox(8.8889F, -2.9167F, -2.5F, 2.5F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(66, 185).addBox(1.3889F, -2.9167F, -2.5F, 2.5F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(82, 185).addBox(-6.1111F, -2.9167F, -2.5F, 2.5F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(146, 180).addBox(-1.1111F, -2.9167F, -2.5F, 2.5F, 7.5F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1111F, 1.6667F, 11.25F));

		PartDefinition moss_top = moss.addOrReplaceChild("moss_top", CubeListBuilder.create().texOffs(116, 48).addBox(2.5F, -1.25F, -10.0F, 7.5F, 2.5F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(114, 142).addBox(-10.0F, -1.25F, -10.0F, 7.5F, 2.5F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, 1.25F));

		PartDefinition left_leg = kapre.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(150, 101).addBox(-7.5F, -19.1667F, -6.25F, 15.0F, 17.5F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(170, 129).addBox(-5.0F, -1.6667F, -3.75F, 10.0F, 7.5F, 7.5F, new CubeDeformation(0.0F))
		.texOffs(114, 165).addBox(-5.0F, 5.8333F, -3.75F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, 64.1667F, 1.25F));

		PartDefinition right_leg = kapre.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 162).addBox(-7.5F, -19.1667F, -6.25F, 15.0F, 17.5F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(170, 145).addBox(-5.0F, -1.6667F, -3.75F, 10.0F, 7.5F, 7.5F, new CubeDeformation(0.0F))
		.texOffs(154, 165).addBox(-5.0F, 5.8333F, -3.75F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 64.1667F, 1.25F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((KapreEntity) entity).idleAnimationState, KapreAnimation.idle, ageInTicks, 1f);
		this.animateWalk(KapreAnimation.walk, limbSwing, 1f, 2f, 2.5f);
		this.animate(((KapreEntity) entity).deathAnimationState, KapreAnimation.death, ageInTicks, 1f);
		this.animate(((KapreEntity) entity).attackAnimationState, KapreAnimation.attack, ageInTicks, 1f);

	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		kapre.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return kapre;
	}
}