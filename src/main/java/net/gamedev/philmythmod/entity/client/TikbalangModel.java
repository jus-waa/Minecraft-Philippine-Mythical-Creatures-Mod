package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.TikbalangAnimation;
import net.gamedev.philmythmod.entity.boss.TikbalangEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
public class TikbalangModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Tikbalang;
	private final ModelPart Head;
	private final ModelPart Hair;
	private final ModelPart Torso;
	private final ModelPart Larm;
	private final ModelPart lowerleft;
	private final ModelPart Rarm;
	private final ModelPart lowerright;
	private final ModelPart LLeg;
	private final ModelPart LLower;
	private final ModelPart Lfoot;
	private final ModelPart Rfoot;
	private final ModelPart FrontTail;
	private final ModelPart BackTail;
	private final ModelPart RLeg;
	private final ModelPart Rlower;

	public TikbalangModel(ModelPart root) {
		this.Tikbalang = root.getChild("Tikbalang");
		this.Head = this.Tikbalang.getChild("Head");
		this.Hair = this.Head.getChild("Hair");
		this.Torso = this.Tikbalang.getChild("Torso");
		this.Larm = this.Torso.getChild("Larm");
		this.lowerleft = this.Larm.getChild("lowerleft");
		this.Rarm = this.Torso.getChild("Rarm");
		this.lowerright = this.Rarm.getChild("lowerright");
		this.LLeg = this.Tikbalang.getChild("LLeg");
		this.LLower = this.LLeg.getChild("LLower");
		this.Lfoot = this.Tikbalang.getChild("Lfoot");
		this.Rfoot = this.Tikbalang.getChild("Rfoot");
		this.FrontTail = this.Tikbalang.getChild("FrontTail");
		this.BackTail = this.Tikbalang.getChild("BackTail");
		this.RLeg = this.Tikbalang.getChild("RLeg");
		this.Rlower = this.RLeg.getChild("Rlower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Tikbalang = partdefinition.addOrReplaceChild("Tikbalang", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition Head = Tikbalang.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 26).addBox(-2.0F, -3.0F, -4.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(54, 8).addBox(-2.0F, -5.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(54, 15).addBox(-2.0F, -6.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(30, 13).addBox(-2.0F, -8.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 23).addBox(-2.0F, -7.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(54, 20).addBox(2.0F, -7.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 62).addBox(2.0F, -8.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, 7.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 59).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 26).addBox(-1.0F, -0.5F, -1.0F, 3.0F, 1.7F, 2.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 20).addBox(-1.0F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 31).addBox(-1.3F, -1.6F, -2.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 23).addBox(-1.7F, -1.5F, -2.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 3.0F, -2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -5.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Hair.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 64).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 59).addBox(3.0F, -3.0F, 0.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 64).addBox(2.0F, -3.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 26).addBox(1.0F, -3.0F, 0.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 61).addBox(0.0F, -3.0F, 0.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 3.0F, -4.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition Torso = Tikbalang.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -3.0F, 9.0F, 11.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-5.0F, 4.0F, -3.0F, 11.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(14, 61).addBox(1.0F, -7.0F, 3.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 62).addBox(-5.0F, -7.0F, 3.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -15.0F, 6.0F));

		PartDefinition Larm = Torso.addOrReplaceChild("Larm", CubeListBuilder.create(), PartPose.offset(9.0F, -1.0F, 0.0F));

		PartDefinition cube_r7 = Larm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 52).addBox(-2.3209F, 0.9544F, -2.0F, 3.5F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition lowerleft = Larm.addOrReplaceChild("lowerleft", CubeListBuilder.create(), PartPose.offset(-20.0F, 34.0F, -6.0F));

		PartDefinition cube_r8 = lowerleft.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 47).addBox(-2.8209F, -2.2456F, -2.0F, 3.7F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.0F, -33.0F, 6.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Rarm = Torso.addOrReplaceChild("Rarm", CubeListBuilder.create().texOffs(30, 54).addBox(-1.2073F, -6.0868F, -3.0F, 3.5F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -2.0F, 1.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition lowerright = Rarm.addOrReplaceChild("lowerright", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7989F, 24.8389F, -20.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r9 = lowerright.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 49).addBox(5.2146F, -3.2611F, -2.0F, 3.7F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -22.0F, 19.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition LLeg = Tikbalang.addOrReplaceChild("LLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = LLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 26).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 8.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0F, -8.0F, 4.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition LLower = LLeg.addOrReplaceChild("LLower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = LLower.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 37).addBox(-3.2F, -4.0F, -3.0F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 5.0F, 4.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r12 = LLower.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 13).addBox(-3.2F, -2.0F, -5.0F, 4.5F, 5.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(5.0F, 1.0F, 6.0F, -0.5219F, -0.0436F, -0.0756F));

		PartDefinition Lfoot = Tikbalang.addOrReplaceChild("Lfoot", CubeListBuilder.create().texOffs(48, 0).addBox(-3.0F, -2.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 13.0F, 4.0F));

		PartDefinition Rfoot = Tikbalang.addOrReplaceChild("Rfoot", CubeListBuilder.create().texOffs(48, 39).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 11.0F, 4.0F));

		PartDefinition FrontTail = Tikbalang.addOrReplaceChild("FrontTail", CubeListBuilder.create().texOffs(34, 64).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(64, 31).addBox(1.0F, -4.0F, -1.0F, 1.0F, 7.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(44, 65).addBox(-2.0F, -4.0F, -1.0F, 1.0F, 7.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(48, 65).addBox(-3.0F, -4.0F, -1.0F, 1.0F, 6.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(52, 65).addBox(2.0F, -4.0F, -1.0F, 1.0F, 6.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(66, 56).addBox(3.0F, -4.0F, -1.0F, 1.0F, 5.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(4, 67).addBox(4.0F, -4.0F, -1.0F, 1.0F, 4.0F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(8, 67).addBox(-4.0F, -4.0F, -1.0F, 1.0F, 4.0F, 0.6F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 10.0F));

		PartDefinition BackTail = Tikbalang.addOrReplaceChild("BackTail", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 1.0F));

		PartDefinition cube_r13 = BackTail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 66).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, -0.2608F, -0.0226F, -0.0843F));

		PartDefinition cube_r14 = BackTail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 66).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.0F, -2.0F, -0.1347F, 0.0048F, -0.1342F));

		PartDefinition cube_r15 = BackTail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 66).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, -2.0F, -0.1329F, 0.0223F, -0.0045F));

		PartDefinition cube_r16 = BackTail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(56, 65).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.1271F, 0.045F, 0.1687F));

		PartDefinition cube_r17 = BackTail.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 49).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.258F, 0.045F, 0.1687F));

		PartDefinition cube_r18 = BackTail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 8).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r19 = BackTail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r20 = BackTail.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(66, 66).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0F, 1.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition RLeg = Tikbalang.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offset(-4.0F, 6.0F, 3.0F));

		PartDefinition cube_r21 = RLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, 0.0F, -5.0F, 4.0F, 8.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -14.0F, 5.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Rlower = RLeg.addOrReplaceChild("Rlower", CubeListBuilder.create(), PartPose.offset(4.0F, 10.0F, -9.0F));

		PartDefinition cube_r22 = Rlower.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 39).addBox(-2.9F, -4.0F, -7.0F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -11.0F, 14.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r23 = Rlower.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(14, 39).addBox(-2.3128F, -0.0019F, -8.4641F, 4.5F, 5.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-3.0F, -15.0F, 16.0F, -0.5232F, 0.0218F, 0.0378F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((TikbalangEntity) entity).idleAnimationState, TikbalangAnimation.idle, ageInTicks, 1f);
		this.animateWalk(TikbalangAnimation.walk, limbSwing, 1f, 2f, 2.5f);
		this.animate(((TikbalangEntity) entity).attackAnimationState, TikbalangAnimation.attack, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.Head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Tikbalang.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Tikbalang;
	}
}