package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.BabaylanAnimation;
import net.gamedev.philmythmod.entity.boss.BabaylanEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
public class BabaylanModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Babaylan;
	private final ModelPart Head;
	private final ModelPart Torso;
	private final ModelPart rarm;
	private final ModelPart bone2;
	private final ModelPart larm;
	private final ModelPart bone;
	private final ModelPart RLegs;
	private final ModelPart LLegs;

	public BabaylanModel(ModelPart root) {
		this.Babaylan = root.getChild("Babaylan");
		this.Head = this.Babaylan.getChild("Head");
		this.Torso = this.Babaylan.getChild("Torso");
		this.rarm = this.Torso.getChild("rarm");
		this.bone2 = this.rarm.getChild("bone2");
		this.larm = this.Torso.getChild("larm");
		this.bone = this.larm.getChild("bone");
		this.RLegs = this.Torso.getChild("RLegs");
		this.LLegs = this.Torso.getChild("LLegs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Babaylan = partdefinition.addOrReplaceChild("Babaylan", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 9.0F));

		PartDefinition Head = Babaylan.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-6.4384F, -11.4978F, -3.0278F, 12.0F, 12.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(66, 8).addBox(5.5616F, -13.4978F, 0.9722F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 68).addBox(-8.4384F, -13.4978F, 0.9722F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(70, 46).addBox(-9.4384F, -15.4978F, 1.9722F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 50).addBox(6.5616F, -15.4978F, 1.9722F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 41).addBox(-8.4384F, -6.4978F, 2.9722F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 59).addBox(-7.4384F, -3.4978F, 2.9722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 59).addBox(-9.4384F, -6.4978F, 2.9722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 61).addBox(5.5616F, -3.4978F, 2.9722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 45).addBox(5.5616F, -6.4978F, 2.9722F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 46).addBox(7.5616F, -6.4978F, 2.9722F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 68).addBox(-6.4384F, -7.4978F, -4.0278F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 54).addBox(-5.4384F, 0.5022F, -2.0278F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 54).addBox(3.5616F, 0.5022F, -2.0278F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 30).addBox(-6.4384F, -10.4978F, -4.0278F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 14).addBox(-5.4384F, -8.4978F, 7.9722F, 10.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 22).addBox(-6.4384F, -10.4978F, 6.9722F, 12.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 25).addBox(-6.4384F, 0.5022F, 5.9722F, 12.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 0).addBox(-5.4384F, 4.5022F, 5.9722F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 14).addBox(-3.4384F, 7.5022F, 5.9722F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 46).addBox(-2.4384F, 10.5022F, 5.9722F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 68).addBox(4.5616F, -7.4978F, -4.0278F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -29.0F, -6.0F));

		PartDefinition Torso = Babaylan.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 22).addBox(-5.0F, -29.0F, 2.0F, 10.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, -8.0F));

		PartDefinition rarm = Torso.addOrReplaceChild("rarm", CubeListBuilder.create().texOffs(32, 36).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(40, 63).addBox(-2.0F, 6.0F, -3.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -29.0F, 5.0F));

		PartDefinition bone2 = rarm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(58, 34).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 2.0F));

		PartDefinition larm = Torso.addOrReplaceChild("larm", CubeListBuilder.create().texOffs(0, 41).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(58, 63).addBox(-2.0F, 6.0F, -3.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -29.0F, 5.0F));

		PartDefinition bone = larm.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(22, 63).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 2.0F));

		PartDefinition RLegs = Torso.addOrReplaceChild("RLegs", CubeListBuilder.create().texOffs(44, 0).addBox(-3.0F, 0.0F, -3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(26, 49).addBox(-3.0F, 8.0F, -3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(44, 18).addBox(-3.0F, 14.0F, -5.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -16.0F, 5.0F));

		PartDefinition LLegs = Torso.addOrReplaceChild("LLegs", CubeListBuilder.create().texOffs(48, 49).addBox(-3.0F, 0.0F, -3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 54).addBox(-3.0F, 8.0F, -3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(66, 4).addBox(-3.0F, 14.0F, -5.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -16.0F, 5.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((BabaylanEntity) entity).idleAnimationState, BabaylanAnimation.idle, ageInTicks, 1f);
		this.animateWalk(BabaylanAnimation.walk, limbSwing, 1f, 2f, 2.5f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.Head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Babaylan.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Babaylan;
	}
}