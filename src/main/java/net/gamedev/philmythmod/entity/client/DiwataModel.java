package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.DiwataAnimation;
import net.gamedev.philmythmod.entity.animations.DiwataAnimation;
import net.gamedev.philmythmod.entity.boss.DiwataEntity;
import net.gamedev.philmythmod.entity.boss.DiwataEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
public class DiwataModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Diwata;
	private final ModelPart Head;
	private final ModelPart Torso;
	private final ModelPart rrarm;
	private final ModelPart larm;
	private final ModelPart RLegs;
	private final ModelPart LLegs;
	private final ModelPart RWings;
	private final ModelPart LWings;

	public DiwataModel(ModelPart root) {
		this.Diwata = root.getChild("Diwata");
		this.Head = this.Diwata.getChild("Head");
		this.Torso = this.Diwata.getChild("Torso");
		this.rrarm = this.Torso.getChild("rrarm");
		this.larm = this.Torso.getChild("larm");
		this.RLegs = this.Diwata.getChild("RLegs");
		this.LLegs = this.Diwata.getChild("LLegs");
		this.RWings = this.Diwata.getChild("RWings");
		this.LWings = this.Diwata.getChild("LWings");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Diwata = partdefinition.addOrReplaceChild("Diwata", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition Head = Diwata.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -32.0F, 0.0F, 12.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(72, 72).addBox(-5.5F, -27.0F, 6.0F, 0.5F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 73).addBox(7.0F, -27.0F, 6.0F, 0.5F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 63).addBox(-5.0F, -29.0F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 12).addBox(-5.0F, -32.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 68).addBox(-4.0F, -32.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 45).addBox(-2.0F, -32.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 32).addBox(0.0F, -32.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 71).addBox(1.0F, -32.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(68, 68).addBox(2.0F, -32.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 40).addBox(4.0F, -32.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 71).addBox(-4.0F, -21.0F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 67).addBox(-3.0F, -21.0F, 1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 67).addBox(-2.0F, -21.0F, 1.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 70).addBox(3.0F, -21.0F, 1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 72).addBox(5.0F, -21.0F, 1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 70).addBox(4.0F, -21.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(54, 35).addBox(-4.0F, -30.0F, 11.0F, 10.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 21).addBox(-5.0F, -32.0F, 10.0F, 12.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 12).addBox(-5.0F, -21.0F, 9.0F, 12.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 63).addBox(-4.0F, -17.0F, 9.0F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 17).addBox(-2.0F, -14.0F, 9.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(54, 46).addBox(-1.0F, -11.0F, 9.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 63).addBox(6.0F, -29.0F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Torso = Diwata.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 21).addBox(-4.0F, -33.0F, 3.0F, 10.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition rrarm = Torso.addOrReplaceChild("rrarm", CubeListBuilder.create(), PartPose.offset(18.0F, -21.0F, 2.0F));

		PartDefinition Rshoulders_r1 = rrarm.addOrReplaceChild("Rshoulders_r1", CubeListBuilder.create().texOffs(44, 0).addBox(-12.0F, -12.5F, 1.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition upper_r1 = rrarm.addOrReplaceChild("upper_r1", CubeListBuilder.create().texOffs(58, 17).addBox(-11.0F, -12.0F, 2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition larm = Torso.addOrReplaceChild("larm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -18.0F, 2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Rshoulders_r2 = larm.addOrReplaceChild("Rshoulders_r2", CubeListBuilder.create().texOffs(22, 49).addBox(-12.0F, -12.5F, 1.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition upper_r2 = larm.addOrReplaceChild("upper_r2", CubeListBuilder.create().texOffs(20, 61).addBox(-11.0F, -12.0F, 2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition RLegs = Diwata.addOrReplaceChild("RLegs", CubeListBuilder.create().texOffs(32, 35).addBox(1.0F, -8.0F, 3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(44, 49).addBox(2.0F, 0.0F, 3.0F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 46).addBox(2.0F, 6.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LLegs = Diwata.addOrReplaceChild("LLegs", CubeListBuilder.create().texOffs(0, 40).addBox(1.0F, -8.0F, 12.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 54).addBox(1.0F, 0.0F, 12.0F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 50).addBox(1.0F, 6.0F, 10.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, -9.0F));

		PartDefinition RWings = Diwata.addOrReplaceChild("RWings", CubeListBuilder.create().texOffs(58, 32).addBox(-9.2646F, 4.7715F, -0.5554F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 58).addBox(-7.2646F, 2.7715F, -0.5554F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 0).addBox(-5.2646F, 0.7715F, -0.5554F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 3).addBox(-3.2646F, -1.2285F, -0.5554F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 6).addBox(-1.2646F, -3.2285F, -0.5554F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 64).addBox(0.7354F, -4.2285F, -0.5554F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -23.0F, 11.0F, 0.0038F, -0.0872F, 0.0435F));

		PartDefinition LWings = Diwata.addOrReplaceChild("LWings", CubeListBuilder.create().texOffs(66, 9).addBox(-8.0774F, 5.4193F, 0.0438F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 67).addBox(-6.0774F, 3.9193F, 0.0438F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 68).addBox(-4.0774F, 1.9193F, 0.0438F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 54).addBox(-2.0774F, -1.0807F, 0.0438F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 61).addBox(-0.0774F, -3.0807F, 0.0438F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 66).addBox(1.9226F, -4.0807F, 0.0438F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -24.0F, 12.0F, -3.1223F, -0.2173F, 3.1395F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		// animations
		this.animate(((DiwataEntity) entity).idleAnimationState, DiwataAnimation.idle, ageInTicks, 1f);
		this.animateWalk(DiwataAnimation.idle, limbSwing, 1f, 2f, 2.5f);


	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Diwata.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Diwata;
	}
}