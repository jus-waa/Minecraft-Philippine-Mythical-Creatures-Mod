package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.NunoAnimation;
import net.gamedev.philmythmod.entity.boss.NunoEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
public class NunoModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart nunosapunso;
	private final ModelPart head;
	private final ModelPart hat;
	private final ModelPart beard;
	private final ModelPart body;
	private final ModelPart armLeft;
	private final ModelPart armRight;
	private final ModelPart legRight;
	private final ModelPart legLeft;

	public NunoModel(ModelPart root) {
		this.nunosapunso = root.getChild("nunosapunso");
		this.head = this.nunosapunso.getChild("head");
		this.hat = this.head.getChild("hat");
		this.beard = this.head.getChild("beard");
		this.body = this.nunosapunso.getChild("body");
		this.armLeft = this.body.getChild("armLeft");
		this.armRight = this.body.getChild("armRight");
		this.legRight = this.nunosapunso.getChild("legRight");
		this.legLeft = this.nunosapunso.getChild("legLeft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition nunosapunso = partdefinition.addOrReplaceChild("nunosapunso", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition head = nunosapunso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, -3.0F, -2.0F, 7.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 2.0F));

		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -3.0F, 9.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-3.0F, -3.0F, -2.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(26, 20).addBox(-2.0F, -5.0F, -1.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 39).addBox(-1.0F, -7.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 40).addBox(0.0F, -8.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition beard = head.addOrReplaceChild("beard", CubeListBuilder.create().texOffs(20, 35).addBox(0.0F, -14.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 26).addBox(-1.0F, -13.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 0).addBox(-3.0F, -12.0F, -2.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 4).addBox(-2.0F, -10.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(-1.0F, -8.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, -1.0F));

		PartDefinition body = nunosapunso.addOrReplaceChild("body", CubeListBuilder.create().texOffs(26, 10).addBox(-3.0F, -12.0F, 0.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 34).addBox(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 1.0F));

		PartDefinition armLeft = body.addOrReplaceChild("armLeft", CubeListBuilder.create(), PartPose.offset(8.0F, -12.0F, 2.0F));

		PartDefinition cube_r1 = armLeft.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-3.0F, 6.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = armLeft.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 27).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition armRight = body.addOrReplaceChild("armRight", CubeListBuilder.create(), PartPose.offset(-3.0F, -12.0F, 2.0F));

		PartDefinition cube_r3 = armRight.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 35).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 6.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = armRight.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 34).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legRight = nunosapunso.addOrReplaceChild("legRight", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(10, 40).addBox(-2.0F, 3.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -4.0F, 3.0F));

		PartDefinition legLeft = nunosapunso.addOrReplaceChild("legLeft", CubeListBuilder.create().texOffs(26, 26).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 8).addBox(-1.0F, 3.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -4.0F, 3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((NunoEntity) entity).idleAnimationState, NunoAnimation.idle, ageInTicks, 1f);
		this.animateWalk(NunoAnimation.walk, limbSwing, 1f, 2f, 2.5f);
		this.animate(((NunoEntity) entity).attackAnimationState, NunoAnimation.attack, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		nunosapunso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return nunosapunso;
	}
}