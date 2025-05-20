package net.gamedev.philmythmod.entity.client;// Made with Blockbench 4.12.4

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.gamedev.philmythmod.entity.animations.ManananggalAnimation;
import net.gamedev.philmythmod.entity.boss.ManananggalEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
public class ManananggalModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart Manananggal;
	private final ModelPart Head;
	private final ModelPart Torso;
	private final ModelPart RArms;
	private final ModelPart LArms;
	private final ModelPart wings;
	private final ModelPart wings2;

	public ManananggalModel(ModelPart root) {
		this.Manananggal = root.getChild("Manananggal");
		this.Head = this.Manananggal.getChild("Head");
		this.Torso = this.Manananggal.getChild("Torso");
		this.RArms = this.Torso.getChild("RArms");
		this.LArms = this.Torso.getChild("LArms");
		this.wings = this.Manananggal.getChild("wings");
		this.wings2 = this.Manananggal.getChild("wings2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Manananggal = partdefinition.addOrReplaceChild("Manananggal", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -18.0F, 0.0F, 0.0F, 2.9234F, 0.0F));

		PartDefinition Head = Manananggal.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -13.0863F, -1.0599F, 12.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.3494F, 0.9939F));

		PartDefinition Torso = Manananggal.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 23).addBox(-3.0F, -25.0F, -3.0F, 12.0F, 12.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(44, 37).addBox(-2.0F, -13.0F, -2.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(64, 49).addBox(-1.0F, -11.0F, -1.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(94, 69).addBox(4.0F, -10.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 91).addBox(0.0F, -10.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(92, 49).addBox(2.0F, -9.0F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(92, 91).addBox(3.0F, -7.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 56).addBox(0.0F, -9.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 96).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 10).addBox(-1.0F, -7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(98, 14).addBox(3.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 98).addBox(4.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(98, 47).addBox(4.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(54, 98).addBox(4.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 98).addBox(3.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 98).addBox(4.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 62).addBox(-1.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 96).addBox(0.0F, -9.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 97).addBox(3.0F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 97).addBox(4.0F, -8.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 97).addBox(3.0F, -10.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 7).addBox(5.0F, -6.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 97).addBox(4.0F, -3.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(94, 79).addBox(4.0F, -7.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 22.6506F, 1.9939F));

		PartDefinition RArms = Torso.addOrReplaceChild("RArms", CubeListBuilder.create().texOffs(42, 47).addBox(-4.9743F, 0.3916F, -3.0F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -25.0F, 2.0F));

		PartDefinition RLowerArm_r1 = RArms.addOrReplaceChild("RLowerArm_r1", CubeListBuilder.create().texOffs(22, 63).addBox(-1.9743F, 0.3916F, 2.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 10.0F, -5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition LArms = Torso.addOrReplaceChild("LArms", CubeListBuilder.create().texOffs(0, 49).addBox(0.0257F, -0.6084F, -3.0F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -24.0F, 2.0F));

		PartDefinition RLowerArm_r2 = LArms.addOrReplaceChild("RLowerArm_r2", CubeListBuilder.create().texOffs(44, 63).addBox(-1.9743F, 0.3916F, 2.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 9.0F, -5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wings = Manananggal.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 6.6506F, -1.0061F, 0.0F, 0.0F, 0.3491F));

		PartDefinition wings_r1 = wings.addOrReplaceChild("wings_r1", CubeListBuilder.create().texOffs(22, 51).addBox(-5.3757F, -1.7942F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5977F, -3.7183F, -2.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition wings_r2 = wings.addOrReplaceChild("wings_r2", CubeListBuilder.create().texOffs(44, 31).addBox(-18.3757F, -0.7942F, 0.0F, 20.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.5977F, -9.7183F, -2.0F, 0.0F, 0.0F, -1.6144F));

		PartDefinition wings_r3 = wings.addOrReplaceChild("wings_r3", CubeListBuilder.create().texOffs(94, 83).addBox(-11.3757F, -0.7942F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 4.2817F, -2.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r4 = wings.addOrReplaceChild("wings_r4", CubeListBuilder.create().texOffs(14, 77).addBox(-10.3757F, -0.7942F, 0.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 3.2817F, -2.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r5 = wings.addOrReplaceChild("wings_r5", CubeListBuilder.create().texOffs(44, 23).addBox(-27.0F, 0.0F, -1.0F, 27.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, -12.7183F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition wings_r6 = wings.addOrReplaceChild("wings_r6", CubeListBuilder.create().texOffs(84, 64).addBox(-10.0F, 7.0F, -1.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.5977F, -0.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r7 = wings.addOrReplaceChild("wings_r7", CubeListBuilder.create().texOffs(8, 83).addBox(-9.0F, 2.0F, -1.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.5977F, 2.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r8 = wings.addOrReplaceChild("wings_r8", CubeListBuilder.create().texOffs(32, 98).addBox(-6.0F, 9.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -2.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r9 = wings.addOrReplaceChild("wings_r9", CubeListBuilder.create().texOffs(84, 4).addBox(-6.0F, 8.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -1.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r10 = wings.addOrReplaceChild("wings_r10", CubeListBuilder.create().texOffs(44, 88).addBox(-7.0F, 5.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.5977F, -0.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r11 = wings.addOrReplaceChild("wings_r11", CubeListBuilder.create().texOffs(56, 83).addBox(-7.0F, 1.0F, -1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 3.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r12 = wings.addOrReplaceChild("wings_r12", CubeListBuilder.create().texOffs(80, 64).addBox(-7.0F, -2.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r13 = wings.addOrReplaceChild("wings_r13", CubeListBuilder.create().texOffs(48, 96).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r14 = wings.addOrReplaceChild("wings_r14", CubeListBuilder.create().texOffs(80, 93).addBox(-2.0F, 1.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, 1.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r15 = wings.addOrReplaceChild("wings_r15", CubeListBuilder.create().texOffs(96, 0).addBox(-2.0F, 2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.5977F, 1.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r16 = wings.addOrReplaceChild("wings_r16", CubeListBuilder.create().texOffs(42, 77).addBox(-10.0F, 1.0F, -1.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-26.5977F, 2.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r17 = wings.addOrReplaceChild("wings_r17", CubeListBuilder.create().texOffs(80, 18).addBox(-12.0F, 1.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.5977F, 3.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r18 = wings.addOrReplaceChild("wings_r18", CubeListBuilder.create().texOffs(46, 18).addBox(-15.0F, 1.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r19 = wings.addOrReplaceChild("wings_r19", CubeListBuilder.create().texOffs(94, 73).addBox(-4.0F, 1.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -9.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r20 = wings.addOrReplaceChild("wings_r20", CubeListBuilder.create().texOffs(92, 54).addBox(-5.0F, 2.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -8.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r21 = wings.addOrReplaceChild("wings_r21", CubeListBuilder.create().texOffs(88, 35).addBox(-6.0F, 2.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -7.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r22 = wings.addOrReplaceChild("wings_r22", CubeListBuilder.create().texOffs(88, 31).addBox(-7.0F, 2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -6.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r23 = wings.addOrReplaceChild("wings_r23", CubeListBuilder.create().texOffs(82, 14).addBox(-8.0F, 2.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -5.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r24 = wings.addOrReplaceChild("wings_r24", CubeListBuilder.create().texOffs(22, 61).addBox(-9.0F, 2.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -4.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r25 = wings.addOrReplaceChild("wings_r25", CubeListBuilder.create().texOffs(22, 49).addBox(-10.0F, 2.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -3.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r26 = wings.addOrReplaceChild("wings_r26", CubeListBuilder.create().texOffs(80, 43).addBox(-11.0F, 2.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -2.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r27 = wings.addOrReplaceChild("wings_r27", CubeListBuilder.create().texOffs(80, 39).addBox(-12.0F, 2.0F, -1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -1.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r28 = wings.addOrReplaceChild("wings_r28", CubeListBuilder.create().texOffs(80, 16).addBox(-13.0F, 2.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -0.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r29 = wings.addOrReplaceChild("wings_r29", CubeListBuilder.create().texOffs(64, 60).addBox(-14.0F, 2.0F, -1.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 0.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r30 = wings.addOrReplaceChild("wings_r30", CubeListBuilder.create().texOffs(64, 56).addBox(-15.0F, 2.0F, -1.0F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 1.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r31 = wings.addOrReplaceChild("wings_r31", CubeListBuilder.create().texOffs(46, 16).addBox(-16.0F, 2.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 2.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r32 = wings.addOrReplaceChild("wings_r32", CubeListBuilder.create().texOffs(46, 12).addBox(-17.0F, 2.0F, -1.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 3.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r33 = wings.addOrReplaceChild("wings_r33", CubeListBuilder.create().texOffs(46, 6).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r34 = wings.addOrReplaceChild("wings_r34", CubeListBuilder.create().texOffs(70, 82).addBox(-7.0F, -13.0F, -1.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, 3.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r35 = wings.addOrReplaceChild("wings_r35", CubeListBuilder.create().texOffs(42, 83).addBox(-16.0F, -3.0F, -1.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4023F, 8.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r36 = wings.addOrReplaceChild("wings_r36", CubeListBuilder.create().texOffs(40, 90).addBox(-11.0F, -9.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5977F, 8.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r37 = wings.addOrReplaceChild("wings_r37", CubeListBuilder.create().texOffs(32, 90).addBox(-12.0F, -8.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4023F, 8.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r38 = wings.addOrReplaceChild("wings_r38", CubeListBuilder.create().texOffs(14, 65).addBox(-12.0F, -11.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5977F, 9.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r39 = wings.addOrReplaceChild("wings_r39", CubeListBuilder.create().texOffs(20, 83).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5977F, 9.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r40 = wings.addOrReplaceChild("wings_r40", CubeListBuilder.create().texOffs(0, 83).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5977F, 9.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r41 = wings.addOrReplaceChild("wings_r41", CubeListBuilder.create().texOffs(0, 65).addBox(-7.0F, -15.0F, -1.0F, 6.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.5977F, 6.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r42 = wings.addOrReplaceChild("wings_r42", CubeListBuilder.create().texOffs(46, 4).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 5.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r43 = wings.addOrReplaceChild("wings_r43", CubeListBuilder.create().texOffs(0, 45).addBox(-16.0F, 1.0F, -1.0F, 19.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5977F, -7.7183F, -1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition wings2 = Manananggal.addOrReplaceChild("wings2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.6506F, -3.0061F, 0.0F, 3.1416F, -0.3491F));

		PartDefinition wings_r44 = wings2.addOrReplaceChild("wings_r44", CubeListBuilder.create().texOffs(22, 57).addBox(-5.3757F, -1.7942F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5977F, -3.7183F, -2.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition wings_r45 = wings2.addOrReplaceChild("wings_r45", CubeListBuilder.create().texOffs(44, 34).addBox(-18.3757F, -0.7942F, 0.0F, 20.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.5977F, -9.7183F, -2.0F, 0.0F, 0.0F, -1.6144F));

		PartDefinition wings_r46 = wings2.addOrReplaceChild("wings_r46", CubeListBuilder.create().texOffs(70, 95).addBox(-11.3757F, -0.7942F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r47 = wings2.addOrReplaceChild("wings_r47", CubeListBuilder.create().texOffs(14, 80).addBox(-10.3757F, -0.7942F, 0.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 3.2817F, -2.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r48 = wings2.addOrReplaceChild("wings_r48", CubeListBuilder.create().texOffs(44, 27).addBox(-27.0F, 0.0F, -1.0F, 27.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, -12.7183F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition wings_r49 = wings2.addOrReplaceChild("wings_r49", CubeListBuilder.create().texOffs(84, 73).addBox(-10.0F, 7.0F, -1.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r50 = wings2.addOrReplaceChild("wings_r50", CubeListBuilder.create().texOffs(14, 83).addBox(-9.0F, 2.0F, -1.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r51 = wings2.addOrReplaceChild("wings_r51", CubeListBuilder.create().texOffs(74, 97).addBox(-6.0F, 9.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -2.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r52 = wings2.addOrReplaceChild("wings_r52", CubeListBuilder.create().texOffs(94, 85).addBox(-6.0F, 8.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -1.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r53 = wings2.addOrReplaceChild("wings_r53", CubeListBuilder.create().texOffs(28, 90).addBox(-7.0F, 5.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r54 = wings2.addOrReplaceChild("wings_r54", CubeListBuilder.create().texOffs(60, 83).addBox(-7.0F, 1.0F, -1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r55 = wings2.addOrReplaceChild("wings_r55", CubeListBuilder.create().texOffs(66, 82).addBox(-7.0F, -2.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r56 = wings2.addOrReplaceChild("wings_r56", CubeListBuilder.create().texOffs(96, 4).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r57 = wings2.addOrReplaceChild("wings_r57", CubeListBuilder.create().texOffs(94, 64).addBox(-2.0F, 1.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r58 = wings2.addOrReplaceChild("wings_r58", CubeListBuilder.create().texOffs(96, 2).addBox(-2.0F, 2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r59 = wings2.addOrReplaceChild("wings_r59", CubeListBuilder.create().texOffs(42, 80).addBox(-10.0F, 1.0F, -1.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-26.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r60 = wings2.addOrReplaceChild("wings_r60", CubeListBuilder.create().texOffs(80, 37).addBox(-12.0F, 1.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r61 = wings2.addOrReplaceChild("wings_r61", CubeListBuilder.create().texOffs(64, 47).addBox(-15.0F, 1.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r62 = wings2.addOrReplaceChild("wings_r62", CubeListBuilder.create().texOffs(94, 76).addBox(-4.0F, 1.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -9.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r63 = wings2.addOrReplaceChild("wings_r63", CubeListBuilder.create().texOffs(94, 60).addBox(-5.0F, 2.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -8.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r64 = wings2.addOrReplaceChild("wings_r64", CubeListBuilder.create().texOffs(80, 91).addBox(-6.0F, 2.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -7.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r65 = wings2.addOrReplaceChild("wings_r65", CubeListBuilder.create().texOffs(88, 33).addBox(-7.0F, 2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -6.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r66 = wings2.addOrReplaceChild("wings_r66", CubeListBuilder.create().texOffs(28, 88).addBox(-8.0F, 2.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -5.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r67 = wings2.addOrReplaceChild("wings_r67", CubeListBuilder.create().texOffs(82, 12).addBox(-9.0F, 2.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -4.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r68 = wings2.addOrReplaceChild("wings_r68", CubeListBuilder.create().texOffs(22, 55).addBox(-10.0F, 2.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -3.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r69 = wings2.addOrReplaceChild("wings_r69", CubeListBuilder.create().texOffs(80, 45).addBox(-11.0F, 2.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -2.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r70 = wings2.addOrReplaceChild("wings_r70", CubeListBuilder.create().texOffs(80, 41).addBox(-12.0F, 2.0F, -1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -1.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r71 = wings2.addOrReplaceChild("wings_r71", CubeListBuilder.create().texOffs(80, 20).addBox(-13.0F, 2.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r72 = wings2.addOrReplaceChild("wings_r72", CubeListBuilder.create().texOffs(66, 62).addBox(-14.0F, 2.0F, -1.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 0.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r73 = wings2.addOrReplaceChild("wings_r73", CubeListBuilder.create().texOffs(64, 58).addBox(-15.0F, 2.0F, -1.0F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r74 = wings2.addOrReplaceChild("wings_r74", CubeListBuilder.create().texOffs(46, 20).addBox(-16.0F, 2.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r75 = wings2.addOrReplaceChild("wings_r75", CubeListBuilder.create().texOffs(46, 14).addBox(-17.0F, 2.0F, -1.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r76 = wings2.addOrReplaceChild("wings_r76", CubeListBuilder.create().texOffs(46, 10).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r77 = wings2.addOrReplaceChild("wings_r77", CubeListBuilder.create().texOffs(82, 82).addBox(-7.0F, -13.0F, -1.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r78 = wings2.addOrReplaceChild("wings_r78", CubeListBuilder.create().texOffs(28, 83).addBox(-16.0F, -3.0F, -1.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4023F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r79 = wings2.addOrReplaceChild("wings_r79", CubeListBuilder.create().texOffs(88, 93).addBox(-11.0F, -9.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5977F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r80 = wings2.addOrReplaceChild("wings_r80", CubeListBuilder.create().texOffs(48, 88).addBox(-12.0F, -8.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4023F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r81 = wings2.addOrReplaceChild("wings_r81", CubeListBuilder.create().texOffs(88, 0).addBox(-12.0F, -11.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r82 = wings2.addOrReplaceChild("wings_r82", CubeListBuilder.create().texOffs(24, 83).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r83 = wings2.addOrReplaceChild("wings_r83", CubeListBuilder.create().texOffs(4, 83).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r84 = wings2.addOrReplaceChild("wings_r84", CubeListBuilder.create().texOffs(66, 64).addBox(-7.0F, -15.0F, -1.0F, 6.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.5977F, 6.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r85 = wings2.addOrReplaceChild("wings_r85", CubeListBuilder.create().texOffs(46, 8).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 5.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r86 = wings2.addOrReplaceChild("wings_r86", CubeListBuilder.create().texOffs(46, 0).addBox(-16.0F, 1.0F, -1.0F, 19.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5977F, -7.7183F, -1.0F, 0.0F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((ManananggalEntity) entity).idleAnimationState, ManananggalAnimation.idle, ageInTicks, 1f);
		this.animateWalk(ManananggalAnimation.idle, limbSwing, 1f, 2f, 2.5f);
		this.animate(((ManananggalEntity) entity).deathAnimationState, ManananggalAnimation.death, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.Head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Manananggal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Manananggal;
	}
}