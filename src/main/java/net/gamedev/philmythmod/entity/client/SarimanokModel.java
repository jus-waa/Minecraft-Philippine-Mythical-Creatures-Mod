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
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart Sarimanok;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart feather;
	private final ModelPart feet;
	private final ModelPart Right_Foot;
	private final ModelPart Left_foot;

	public SarimanokModel(ModelPart root) {
		this.Sarimanok = root.getChild("Sarimanok");
		this.body = this.Sarimanok.getChild("body");
		this.head = this.Sarimanok.getChild("head");
		this.feather = this.Sarimanok.getChild("feather");
		this.feet = this.Sarimanok.getChild("feet");
		this.Right_Foot = this.feet.getChild("Right_Foot");
		this.Left_foot = this.feet.getChild("Left_foot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Sarimanok = partdefinition.addOrReplaceChild("Sarimanok", CubeListBuilder.create(), PartPose.offset(0.0F, 22.5F, -1.75F));

		PartDefinition body = Sarimanok.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(28, 3).addBox(-1.0F, -5.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(14, 18).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(6, 24).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = Sarimanok.addOrReplaceChild("head", CubeListBuilder.create().texOffs(27, 15).addBox(-0.5F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 22).addBox(-0.5F, -12.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(18, 27).addBox(-0.5F, -13.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 11).addBox(-0.25F, -9.0F, -3.0F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 9).addBox(-1.0F, -10.0F, -2.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition feather = Sarimanok.addOrReplaceChild("feather", CubeListBuilder.create().texOffs(12, 27).addBox(-1.0F, -2.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-1.0F, -3.0F, 5.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 22).addBox(-1.0F, -4.0F, 6.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 0).addBox(-1.0F, -5.0F, 7.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 5).addBox(-1.0F, -4.0F, 8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 18).addBox(-1.0F, -3.0F, 8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 7).addBox(-1.0F, -2.0F, 8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 14).addBox(-1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 27).addBox(-1.0F, 1.0F, 8.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 9).addBox(-1.0F, 2.0F, 9.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-1.0F, 3.0F, 7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition feet = Sarimanok.addOrReplaceChild("feet", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Right_Foot = feet.addOrReplaceChild("Right_Foot", CubeListBuilder.create().texOffs(28, 21).addBox(0.5F, -1.0F, 2.0F, 0.5F, 2.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Right_Foot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 24).addBox(0.5F, -2.0F, -1.0F, 0.5F, 2.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Left_foot = feet.addOrReplaceChild("Left_foot", CubeListBuilder.create().texOffs(18, 29).addBox(0.0F, -1.0F, 2.0F, 0.5F, 2.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Left_foot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 27).addBox(1.0F, -2.0F, -1.0F, 0.5F, 2.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 1.0F, -1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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
		Sarimanok.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Sarimanok;
	}
}