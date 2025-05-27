package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;


import net.gamedev.philmythmod.entity.animations.SarimanokAnimation;
import net.gamedev.philmythmod.entity.boss.SarimanokEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
public class SarimanokModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart sarimanok;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart armRight;
	private final ModelPart armLeft;
	private final ModelPart legRight;
	private final ModelPart legLeft;
	private final ModelPart tail;

	public SarimanokModel(ModelPart root) {
		this.sarimanok = root.getChild("sarimanok");
		this.head = this.sarimanok.getChild("head");
		this.body = this.sarimanok.getChild("body");
		this.armRight = this.sarimanok.getChild("armRight");
		this.armLeft = this.sarimanok.getChild("armLeft");
		this.legRight = this.sarimanok.getChild("legRight");
		this.legLeft = this.sarimanok.getChild("legLeft");
		this.tail = this.sarimanok.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition sarimanok = partdefinition.addOrReplaceChild("sarimanok", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = sarimanok.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 29).addBox(-4.0F, -4.1F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(58, 18).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(52, 72).addBox(-1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 51).addBox(-1.0F, -6.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(87, 14).addBox(-1.0F, 0.0F, -8.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(51, 84).addBox(-1.0F, 1.0F, -9.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(58, 27).addBox(-1.0F, 3.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 88).addBox(-1.0F, 4.0F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 83).addBox(-1.0F, -8.0F, 2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(42, 83).addBox(-1.0F, -8.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, -6.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 88).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 3.0F, -5.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 88).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition body = sarimanok.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -20.1F, -10.0F, 12.0F, 12.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(24, 46).addBox(-5.0F, -17.0F, -12.0F, 10.0F, 8.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(78, 18).addBox(1.0F, -8.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(78, 48).addBox(-4.0F, -8.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 46).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.0F, -10.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition armRight = sarimanok.addOrReplaceChild("armRight", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -2.0F, -9.0F, 2.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(76, 76).addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(58, 0).addBox(0.0F, 1.0F, 1.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(52, 77).addBox(0.0F, 7.0F, 2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(78, 0).addBox(0.0F, 6.0F, 4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(36, 74).addBox(0.0F, 4.0F, 3.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(58, 68).addBox(0.0F, 3.0F, 1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(88, 11).addBox(0.0F, 8.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -17.0F, 0.0F));

		PartDefinition armLeft = sarimanok.addOrReplaceChild("armLeft", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, -2.0F, -9.0F, 2.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(74, 40).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(56, 29).addBox(-1.0F, 1.0F, 1.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(76, 27).addBox(-1.0F, 7.0F, 2.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(76, 68).addBox(-1.0F, 6.0F, 4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(8, 71).addBox(-1.0F, 4.0F, 3.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(16, 87).addBox(-1.0F, 8.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -17.0F, 0.0F));

		PartDefinition legRight = sarimanok.addOrReplaceChild("legRight", CubeListBuilder.create().texOffs(32, 75).addBox(-0.5F, -0.75F, -0.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 64).addBox(-1.5F, 4.25F, -1.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(70, 88).addBox(-1.5F, 4.25F, -3.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 89).addBox(0.5F, 4.25F, -3.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -5.25F, -1.75F));

		PartDefinition legLeft = sarimanok.addOrReplaceChild("legLeft", CubeListBuilder.create().texOffs(18, 62).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 60).addBox(-1.5F, 4.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 68).addBox(-1.5F, 4.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 85).addBox(0.5F, 4.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -5.0F, -1.0F));

		PartDefinition tail = sarimanok.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 75).addBox(-1.0F, -9.0F, -2.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 71).addBox(-1.0F, -11.0F, 0.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 51).addBox(-1.0F, -13.0F, 2.0F, 2.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(36, 56).addBox(-1.0F, -10.0F, 5.0F, 2.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 56).addBox(-2.0F, -12.0F, 8.0F, 4.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(68, 77).addBox(1.0F, -8.0F, 3.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 80).addBox(-3.0F, -8.0F, 3.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 84).addBox(1.0F, -8.0F, 5.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 84).addBox(-3.0F, -8.0F, 5.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 40).addBox(-3.0F, -8.0F, 10.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 55).addBox(-3.0F, -13.0F, 10.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 8).addBox(-3.0F, -13.0F, 11.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 35).addBox(-3.0F, 0.0F, 10.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 11).addBox(-3.0F, 2.0F, 10.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(58, 60).addBox(-3.0F, -4.0F, 10.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(80, 11).addBox(1.0F, -4.0F, 1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 80).addBox(-3.0F, -4.0F, 1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, 9.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((SarimanokEntity) entity).idleAnimationState, SarimanokAnimation.idle, ageInTicks, 1f);
		this.animateWalk(SarimanokAnimation.walk, limbSwing, 1f, 2f, 2.5f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		sarimanok.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return sarimanok;
	}
}