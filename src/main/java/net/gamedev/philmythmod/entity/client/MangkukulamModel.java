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

public class MangkukulamModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart mangkukulam;
	private final ModelPart head;
	private final ModelPart nose;
	private final ModelPart headwear;
	private final ModelPart hat2;
	private final ModelPart hat3;
	private final ModelPart hat4;
	private final ModelPart backhair;
	private final ModelPart hair;
	private final ModelPart mole;
	private final ModelPart body;
	private final ModelPart bodywear;
	private final ModelPart arms;
	private final ModelPart mirrored;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public MangkukulamModel(ModelPart root) {
		this.mangkukulam = root.getChild("mangkukulam");
		this.head = this.mangkukulam.getChild("head");
		this.nose = this.mangkukulam.getChild("nose");
		this.headwear = this.mangkukulam.getChild("headwear");
		this.hat2 = this.headwear.getChild("hat2");
		this.hat3 = this.hat2.getChild("hat3");
		this.hat4 = this.hat3.getChild("hat4");
		this.backhair = this.mangkukulam.getChild("backhair");
		this.hair = this.mangkukulam.getChild("hair");
		this.mole = this.mangkukulam.getChild("mole");
		this.body = this.mangkukulam.getChild("body");
		this.bodywear = this.mangkukulam.getChild("bodywear");
		this.arms = this.mangkukulam.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.left_leg = this.mangkukulam.getChild("left_leg");
		this.right_leg = this.mangkukulam.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mangkukulam = partdefinition.addOrReplaceChild("mangkukulam", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = mangkukulam.addOrReplaceChild("head", CubeListBuilder.create().texOffs(28, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition nose = mangkukulam.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(60, 11).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -26.0F, 0.0F));

		PartDefinition headwear = mangkukulam.addOrReplaceChild("headwear", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -34.05F, -5.0F));

		PartDefinition hat2 = headwear.addOrReplaceChild("hat2", CubeListBuilder.create().texOffs(28, 38).addBox(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -4.0F, 2.0F, -0.0524F, 0.0F, 0.0262F));

		PartDefinition hat3 = hat2.addOrReplaceChild("hat3", CubeListBuilder.create().texOffs(52, 18).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -4.0F, 2.0F, -0.1047F, 0.0F, 0.0524F));

		PartDefinition hat4 = hat3.addOrReplaceChild("hat4", CubeListBuilder.create().texOffs(64, 64).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(1.75F, -2.0F, 2.0F, -0.2094F, 0.0F, 0.1047F));

		PartDefinition backhair = mangkukulam.addOrReplaceChild("backhair", CubeListBuilder.create().texOffs(24, 56).addBox(3.0F, -6.6667F, -1.1667F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(56, 26).addBox(2.0F, -7.6667F, -1.1667F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(56, 37).addBox(-4.0F, -7.6667F, -1.1667F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(16, 56).addBox(0.0F, -7.6667F, -1.1667F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(20, 56).addBox(-2.0F, -7.6667F, -1.1667F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(60, 0).addBox(-5.0F, -6.6667F, -1.1667F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -26.3333F, 6.1667F, 0.1745F, 0.0F, 0.0F));

		PartDefinition hair = mangkukulam.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(60, 48).addBox(-0.5F, -4.0F, -1.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(60, 58).addBox(-0.5F, -5.0F, 0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(64, 0).addBox(-0.5F, -6.0F, 2.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(64, 26).addBox(-9.5F, -4.0F, -1.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(64, 36).addBox(-9.5F, -5.0F, 0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(64, 46).addBox(-9.5F, -6.0F, 2.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(60, 26).addBox(-9.5F, -8.0F, 4.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F))
		.texOffs(60, 37).addBox(-0.5F, -8.0F, 4.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.5F, -29.0F, -4.5F, -0.5672F, 0.0F, 0.0F));

		PartDefinition mole = mangkukulam.addOrReplaceChild("mole", CubeListBuilder.create().texOffs(28, 65).addBox(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, -28.0F, 0.0F));

		PartDefinition body = mangkukulam.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition bodywear = mangkukulam.addOrReplaceChild("bodywear", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition arms = mangkukulam.addOrReplaceChild("arms", CubeListBuilder.create().texOffs(28, 18).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 26).addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.05F, -1.05F, -0.7505F, 0.0F, 0.0F));

		PartDefinition mirrored = arms.addOrReplaceChild("mirrored", CubeListBuilder.create().texOffs(0, 56).addBox(4.0F, -23.05F, -3.05F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.05F, 1.05F));

		PartDefinition left_leg = mangkukulam.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(28, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 56).addBox(-1.0F, 10.0F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition right_leg = mangkukulam.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(44, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 60).addBox(-2.0F, 10.0F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((MangkukulamEntity) entity).idleAnimationState, MangkukulamAnimation.idle, ageInTicks, 1f);
		this.animateWalk(MangkukulamAnimation.walk, limbSwing, 1f, 2f, 2.5f);
		this.animate(((MangkukulamEntity) entity).deathAnimationState, MangkukulamAnimation.death, ageInTicks, 1f);
		this.animate(((MangkukulamEntity) entity).attackAnimationState, MangkukulamAnimation.attack, ageInTicks, 1f);

	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mangkukulam.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return mangkukulam;
	}
}