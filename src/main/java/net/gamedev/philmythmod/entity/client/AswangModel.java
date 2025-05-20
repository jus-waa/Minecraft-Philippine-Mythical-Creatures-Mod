package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.AswangAnimation;
import net.gamedev.philmythmod.entity.animations.MangkukulamAnimation;
import net.gamedev.philmythmod.entity.boss.AswangEntity;
import net.gamedev.philmythmod.entity.boss.MangkukulamEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class AswangModel<T extends Entity> extends HierarchicalModel<T>   {
	private final ModelPart Aswang;
	private final ModelPart head;
	private final ModelPart tongue;
	private final ModelPart body;
	private final ModelPart bodyUpper;
	private final ModelPart legLeft;
	private final ModelPart lowerLeftLeg;
	private final ModelPart legRight;
	private final ModelPart lowerRightLeg;
	private final ModelPart armLeft;
	private final ModelPart lowerLeftArm;
	private final ModelPart armRight;
	private final ModelPart lowerRightArm;

	public AswangModel(ModelPart root) {
		this.Aswang = root.getChild("Aswang");
		this.head = this.Aswang.getChild("head");
		this.tongue = this.head.getChild("tongue");
		this.body = this.Aswang.getChild("body");
		this.bodyUpper = this.body.getChild("bodyUpper");
		this.legLeft = this.body.getChild("legLeft");
		this.lowerLeftLeg = this.legLeft.getChild("lowerLeftLeg");
		this.legRight = this.body.getChild("legRight");
		this.lowerRightLeg = this.legRight.getChild("lowerRightLeg");
		this.armLeft = this.body.getChild("armLeft");
		this.lowerLeftArm = this.armLeft.getChild("lowerLeftArm");
		this.armRight = this.body.getChild("armRight");
		this.lowerRightArm = this.armRight.getChild("lowerRightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hitbox = partdefinition.addOrReplaceChild("hitbox", CubeListBuilder.create().texOffs(0, 2).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Aswang = partdefinition.addOrReplaceChild("Aswang", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 24.0F, -5.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head = Aswang.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 3.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-3.0F, -9.0F, -4.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tongue = head.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(34, 21).addBox(0.0F, -4.0F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 39).addBox(0.0F, -4.0F, 4.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition cube_r1 = tongue.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 51).addBox(-1.0F, -2.0F, -1.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.0F, 2.0F, 6.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition body = Aswang.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bodyUpper = body.addOrReplaceChild("bodyUpper", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.0F, -2.0F, 10.0F, 7.0F, 7.0F, new CubeDeformation(-0.5F))
		.texOffs(30, 25).addBox(-3.0F, 3.0F, -1.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, -10.0F));

		PartDefinition cube_r2 = bodyUpper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 0).addBox(-3.0F, -4.0F, -3.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.0F, 4.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bodyUpper.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0F, -2.0F, -1.0F, 8.0F, 2.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition legLeft = body.addOrReplaceChild("legLeft", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -10.0F, -7.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = legLeft.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 11).addBox(-1.0F, -4.0F, -3.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition lowerLeftLeg = legLeft.addOrReplaceChild("lowerLeftLeg", CubeListBuilder.create().texOffs(24, 45).addBox(-2.0F, 5.0F, 1.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = lowerLeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 11).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legRight = body.addOrReplaceChild("legRight", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -10.0F, -7.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r6 = legRight.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 11).addBox(-1.0F, -4.0F, -3.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition lowerRightLeg = legRight.addOrReplaceChild("lowerRightLeg", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 5.0F, 1.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = lowerRightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 50).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition armLeft = body.addOrReplaceChild("armLeft", CubeListBuilder.create().texOffs(0, 39).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(46, 19).addBox(-2.0F, 2.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -17.0F, -8.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerLeftArm = armLeft.addOrReplaceChild("lowerLeftArm", CubeListBuilder.create(), PartPose.offset(4.0F, 17.0F, 8.0F));

		PartDefinition cube_r8 = lowerLeftArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 39).addBox(-1.0F, -1.0F, -0.8F, 2.0F, 8.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-5.0F, -12.0F, -8.0F, 0.8724F, -0.0072F, 0.0254F));

		PartDefinition armRight = body.addOrReplaceChild("armRight", CubeListBuilder.create().texOffs(42, 35).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 51).addBox(-2.0F, 2.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -17.0F, -8.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition lowerRightArm = armRight.addOrReplaceChild("lowerRightArm", CubeListBuilder.create(), PartPose.offset(4.0F, 17.0F, 8.0F));

		PartDefinition cube_r9 = lowerRightArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 42).addBox(-1.0F, -1.0F, -0.8F, 2.0F, 8.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-5.0F, -12.0F, -8.0F, 0.8724F, -0.0072F, 0.0254F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((AswangEntity) entity).idleAnimationState, AswangAnimation.idle, ageInTicks, 1f);
		this.animateWalk(AswangAnimation.walk, limbSwing, 1f, 2f, 2.5f);
		this.animate(((AswangEntity) entity).attackAnimationState, AswangAnimation.attack, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Aswang.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Aswang;
	}
}