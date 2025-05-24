package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.BerberokaAnimation;
import net.gamedev.philmythmod.entity.boss.BerberokaEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class BerberokaModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Berberoka;
	private final ModelPart Head;
	private final ModelPart Teeth;
	private final ModelPart spikes;
	private final ModelPart ears;
	private final ModelPart Torso;
	private final ModelPart LArm;
	private final ModelPart armL;
	private final ModelPart RArm;
	private final ModelPart armR;
	private final ModelPart tail;
	private final ModelPart LLegs;
	private final ModelPart bone2;
	private final ModelPart RLegs;
	private final ModelPart bone;

	public BerberokaModel(ModelPart root) {
		this.Berberoka = root.getChild("Berberoka");
		this.Head = this.Berberoka.getChild("Head");
		this.Teeth = this.Head.getChild("Teeth");
		this.spikes = this.Head.getChild("spikes");
		this.ears = this.Head.getChild("ears");
		this.Torso = this.Berberoka.getChild("Torso");
		this.LArm = this.Torso.getChild("LArm");
		this.armL = this.LArm.getChild("armL");
		this.RArm = this.Torso.getChild("RArm");
		this.armR = this.RArm.getChild("armR");
		this.tail = this.Torso.getChild("tail");
		this.LLegs = this.Berberoka.getChild("LLegs");
		this.bone2 = this.LLegs.getChild("bone2");
		this.RLegs = this.Berberoka.getChild("RLegs");
		this.bone = this.RLegs.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Berberoka = partdefinition.addOrReplaceChild("Berberoka", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, 4.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Head = Berberoka.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 19).addBox(-7.0F, -12.0F, -1.0F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(52, 33).addBox(-6.0F, 0.0F, 10.0F, 11.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(52, 40).addBox(-6.0F, -4.0F, 12.0F, 11.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(80, 42).addBox(-2.0F, -5.0F, 12.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(40, 112).addBox(-2.0F, -8.0F, 12.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 96).addBox(-7.0F, -12.0F, 12.0F, 13.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.7373F, -12.0F, -6.3244F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(106, 73).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -9.0F, 12.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(104, 86).addBox(0.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -9.0F, 12.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Teeth = Head.addOrReplaceChild("Teeth", CubeListBuilder.create().texOffs(78, 76).addBox(6.0F, 7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 40).addBox(4.0F, 7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 76).addBox(-2.0F, 7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 76).addBox(0.0F, 7.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 76).addBox(0.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 76).addBox(2.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 76).addBox(7.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 100).addBox(-3.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 100).addBox(4.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -9.0F, 20.0F));

		PartDefinition spikes = Head.addOrReplaceChild("spikes", CubeListBuilder.create().texOffs(48, 115).addBox(1.0F, -6.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(106, 69).addBox(0.0F, -5.0F, 1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(104, 76).addBox(0.0F, -5.0F, -6.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(96, 107).addBox(-4.0F, -5.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 108).addBox(4.0F, -5.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(108, 13).addBox(1.0F, -6.0F, -7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(32, 105).addBox(0.0F, -3.0F, -11.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 109).addBox(0.0F, 3.0F, -10.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 115).addBox(-3.0F, -6.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 116).addBox(5.0F, -6.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -8.0F, 8.0F));

		PartDefinition cube_r3 = spikes.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(116, 60).addBox(0.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 39).addBox(-8.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.0F, -10.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r4 = spikes.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(72, 109).addBox(0.0F, -5.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 105).addBox(-8.0F, -5.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -3.0F, -7.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r5 = spikes.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 115).addBox(0.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -7.0F, -7.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r6 = spikes.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(106, 113).addBox(0.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -6.0F, -6.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r7 = spikes.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(114, 104).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 42).addBox(-8.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -6.0F, 2.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r8 = spikes.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 108).addBox(0.0F, -5.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 27).addBox(0.0F, -3.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -10.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r9 = spikes.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(78, 14).addBox(0.0F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 5.0F, -9.0F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r10 = spikes.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 101).addBox(0.0F, -5.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0F, -9.0F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r11 = spikes.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(114, 97).addBox(0.0F, -5.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0F, 4.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition ears = Head.addOrReplaceChild("ears", CubeListBuilder.create().texOffs(16, 101).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 105).addBox(13.0F, -1.0F, -2.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -9.0F, 5.0F));

		PartDefinition lears_r1 = ears.addOrReplaceChild("lears_r1", CubeListBuilder.create().texOffs(84, 109).addBox(0.0F, 0.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition rears_r1 = ears.addOrReplaceChild("rears_r1", CubeListBuilder.create().texOffs(78, 109).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Torso = Berberoka.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -18.3486F, -5.0152F, 19.0F, 7.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(106, 64).addBox(-2.0F, -16.3486F, -6.0152F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 27).addBox(0.0F, -15.3486F, -8.0152F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 109).addBox(0.0F, -14.3486F, -9.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 45).addBox(-7.0F, -11.3486F, -4.0152F, 15.0F, 13.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(76, 78).addBox(-6.0F, -9.3486F, 4.9848F, 13.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 45).addBox(-7.0F, -11.3486F, -4.0152F, 15.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(112, 113).addBox(-1.0F, -9.3486F, -5.0152F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 31).addBox(0.0F, -8.3486F, -7.0152F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 116).addBox(0.0F, -7.3486F, -8.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2627F, 6.0F, -5.3244F, -0.0873F, 0.0F, 0.0F));

		PartDefinition LArm = Torso.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(52, 19).addBox(0.0F, 0.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(96, 42).addBox(1.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(104, 81).addBox(1.0F, 1.0F, -5.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 97).addBox(7.0F, 1.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 82).addBox(1.0F, 6.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -18.3486F, -0.0152F, 0.3054F, 0.0F, 0.0F));

		PartDefinition armL = LArm.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(24, 82).addBox(-2.0F, -1.9235F, -1.774F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(48, 110).addBox(2.0F, 5.0765F, 2.226F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 33).addBox(-2.0F, 5.0765F, 2.226F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 110).addBox(2.0F, 5.0765F, -1.774F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 14.9924F, -0.8257F, 0.48F, 0.0F, 0.0F));

		PartDefinition digitalis_r1 = armL.addOrReplaceChild("digitalis_r1", CubeListBuilder.create().texOffs(98, 111).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 111).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.0765F, 1.226F, 0.0F, 0.0F, 0.3054F));

		PartDefinition RArm = Torso.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(62, 0).addBox(-8.0F, -3.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(96, 49).addBox(-7.0F, -4.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(62, 14).addBox(-8.0F, -2.0F, -5.0F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 100).addBox(-9.0F, -2.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(84, 14).addBox(-7.0F, 3.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.3486F, -0.0152F, 0.3054F, 0.0F, 0.0F));

		PartDefinition armR = RArm.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(84, 28).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(108, 107).addBox(1.0F, 6.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 112).addBox(-3.0F, 6.0F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 112).addBox(-3.0F, 6.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 11.9924F, -0.8257F, 0.48F, 0.0F, 0.0F));

		PartDefinition digitalis_r2 = armR.addOrReplaceChild("digitalis_r2", CubeListBuilder.create().texOffs(16, 112).addBox(0.0F, 0.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 112).addBox(0.0F, 0.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 9.0F, 1.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition tail = Torso.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3486F, 3.9848F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(116, 56).addBox(0.0F, 3.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 23).addBox(-1.0F, 4.0F, -5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -13.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 89).addBox(-3.0F, 0.0F, -4.0F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -10.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 114).addBox(0.0F, -0.0746F, -3.3132F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.0F, -20.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 101).addBox(-1.0F, -0.0746F, -5.3132F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, -16.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(96, 56).addBox(-2.0F, -0.0746F, -5.3132F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, -13.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 116).addBox(0.0F, 3.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, -17.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(28, 96).addBox(-2.0F, 1.0F, -7.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -13.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 35).addBox(0.0F, 4.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(108, 19).addBox(-1.0F, 5.0F, -5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -18.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 65).addBox(-3.0F, 1.0F, -7.0F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -13.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(98, 89).addBox(-3.0F, 0.0F, -2.0F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -8.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition LLegs = Berberoka.addOrReplaceChild("LLegs", CubeListBuilder.create(), PartPose.offset(4.7373F, 6.0F, -5.3244F));

		PartDefinition lthigh_r1 = LLegs.addOrReplaceChild("lthigh_r1", CubeListBuilder.create().texOffs(0, 67).addBox(-3.0F, 1.2352F, -0.9389F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6577F, -2.8887F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bone2 = LLegs.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(64, 102).addBox(-3.0F, 1.3423F, -1.8887F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(80, 102).addBox(1.0F, 1.3423F, -1.8887F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(48, 78).addBox(-3.0F, -0.6577F, -5.8887F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 5.0F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(74, 89).addBox(-5.0F, -1.9763F, -2.2164F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.6577F, -2.8887F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RLegs = Berberoka.addOrReplaceChild("RLegs", CubeListBuilder.create(), PartPose.offset(-4.2627F, 6.0F, -5.3244F));

		PartDefinition rthigh_r1 = RLegs.addOrReplaceChild("rthigh_r1", CubeListBuilder.create().texOffs(24, 67).addBox(-3.0F, 0.39F, -2.7515F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bone = RLegs.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(108, 39).addBox(-3.0F, 8.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(114, 86).addBox(1.0F, 8.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(78, 65).addBox(-3.0F, 6.0F, -7.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 6.0F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(94, 0).addBox(-5.0F, -1.9763F, -2.2164F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.0F, -4.0F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((BerberokaEntity) entity).idleAnimationState, BerberokaAnimation.idle, ageInTicks, 1f);
		this.animateWalk(BerberokaAnimation.walk, limbSwing, 1f, 2f, 2.5f);
		this.animate(((BerberokaEntity) entity).attackAnimationState, BerberokaAnimation.attack, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.Head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Berberoka.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Berberoka;
	}
}