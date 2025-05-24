package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.AswangAnimation;
import net.gamedev.philmythmod.entity.boss.AswangEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
public class AlbularyoModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart albularyo;
	private final ModelPart head;
	private final ModelPart nose;
	private final ModelPart body;
	private final ModelPart arms;
	private final ModelPart mirrored;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public AlbularyoModel(ModelPart root) {
		this.albularyo = root.getChild("albularyo");
		this.head = this.albularyo.getChild("head");
		this.nose = this.head.getChild("nose");
		this.body = this.albularyo.getChild("body");
		this.arms = this.body.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.right_leg = this.albularyo.getChild("right_leg");
		this.left_leg = this.albularyo.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition albularyo = partdefinition.addOrReplaceChild("albularyo", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 2.0F));

		PartDefinition head = albularyo.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, -2.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition body = albularyo.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 20).addBox(-4.0F, -24.0F, -5.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition arms = body.addOrReplaceChild("arms", CubeListBuilder.create().texOffs(40, 38).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(44, 22).addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.05F, -3.05F, -0.7505F, 0.0F, 0.0F));

		PartDefinition mirrored = arms.addOrReplaceChild("mirrored", CubeListBuilder.create().texOffs(44, 22).mirror().addBox(4.0F, -23.05F, -3.05F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 21.05F, 1.05F));

		PartDefinition right_leg = albularyo.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, 0.0F, -4.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition left_leg = albularyo.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, -2.0F));

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
		albularyo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return albularyo;
	}
}