package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;


public class ManananggalModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart wings2;
	private final ModelPart Hitbox;
	private final ModelPart Manananggal;
	private final ModelPart Head;
	private final ModelPart Torso;
	private final ModelPart RArms;
	private final ModelPart LArms;
	private final ModelPart wings;
	private final ModelPart wings3;

	public ManananggalModel(ModelPart root) {
		this.wings2 = root.getChild("wings2");
		this.Hitbox = root.getChild("Hitbox");
		this.Manananggal = root.getChild("Manananggal");
		this.Head = this.Manananggal.getChild("Head");
		this.Torso = this.Manananggal.getChild("Torso");
		this.RArms = this.Torso.getChild("RArms");
		this.LArms = this.Torso.getChild("LArms");
		this.wings = this.Manananggal.getChild("wings");
		this.wings3 = this.Manananggal.getChild("wings3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wings2 = partdefinition.addOrReplaceChild("wings2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.3494F, 3.9939F, -3.1416F, -0.2182F, 2.7925F));

		PartDefinition wings_r1 = wings2.addOrReplaceChild("wings_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.3757F, -1.7942F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5977F, -3.7183F, -2.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition wings_r2 = wings2.addOrReplaceChild("wings_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-18.3757F, -0.7942F, 0.0F, 20.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.5977F, -9.7183F, -2.0F, 0.0F, 0.0F, -1.6144F));

		PartDefinition wings_r3 = wings2.addOrReplaceChild("wings_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-11.3757F, -0.7942F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r4 = wings2.addOrReplaceChild("wings_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-10.3757F, -0.7942F, 0.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 3.2817F, -2.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r5 = wings2.addOrReplaceChild("wings_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-27.0F, 0.0F, -1.0F, 27.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, -12.7183F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition wings_r6 = wings2.addOrReplaceChild("wings_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 7.0F, -1.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r7 = wings2.addOrReplaceChild("wings_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 2.0F, -1.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r8 = wings2.addOrReplaceChild("wings_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 9.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -2.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r9 = wings2.addOrReplaceChild("wings_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 8.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -1.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r10 = wings2.addOrReplaceChild("wings_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 5.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r11 = wings2.addOrReplaceChild("wings_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 1.0F, -1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r12 = wings2.addOrReplaceChild("wings_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -2.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r13 = wings2.addOrReplaceChild("wings_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r14 = wings2.addOrReplaceChild("wings_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 1.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r15 = wings2.addOrReplaceChild("wings_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r16 = wings2.addOrReplaceChild("wings_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 1.0F, -1.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-26.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r17 = wings2.addOrReplaceChild("wings_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 1.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r18 = wings2.addOrReplaceChild("wings_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, 1.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r19 = wings2.addOrReplaceChild("wings_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 1.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -9.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r20 = wings2.addOrReplaceChild("wings_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 2.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -8.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r21 = wings2.addOrReplaceChild("wings_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 2.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -7.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r22 = wings2.addOrReplaceChild("wings_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -6.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r23 = wings2.addOrReplaceChild("wings_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 2.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -5.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r24 = wings2.addOrReplaceChild("wings_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 2.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -4.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r25 = wings2.addOrReplaceChild("wings_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 2.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -3.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r26 = wings2.addOrReplaceChild("wings_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 2.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -2.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r27 = wings2.addOrReplaceChild("wings_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 2.0F, -1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -1.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r28 = wings2.addOrReplaceChild("wings_r28", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, 2.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r29 = wings2.addOrReplaceChild("wings_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, 2.0F, -1.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 0.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r30 = wings2.addOrReplaceChild("wings_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, 2.0F, -1.0F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r31 = wings2.addOrReplaceChild("wings_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, 2.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r32 = wings2.addOrReplaceChild("wings_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-17.0F, 2.0F, -1.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r33 = wings2.addOrReplaceChild("wings_r33", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r34 = wings2.addOrReplaceChild("wings_r34", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -13.0F, -1.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r35 = wings2.addOrReplaceChild("wings_r35", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -3.0F, -1.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4023F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r36 = wings2.addOrReplaceChild("wings_r36", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -9.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5977F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r37 = wings2.addOrReplaceChild("wings_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -8.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4023F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r38 = wings2.addOrReplaceChild("wings_r38", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -11.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r39 = wings2.addOrReplaceChild("wings_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r40 = wings2.addOrReplaceChild("wings_r40", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r41 = wings2.addOrReplaceChild("wings_r41", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 6.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.5977F, 6.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r42 = wings2.addOrReplaceChild("wings_r42", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 5.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r43 = wings2.addOrReplaceChild("wings_r43", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, 1.0F, -1.0F, 19.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5977F, -7.7183F, -1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Hitbox = partdefinition.addOrReplaceChild("Hitbox", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 32.0F, 7.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition Manananggal = partdefinition.addOrReplaceChild("Manananggal", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -10.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Head = Manananggal.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -11.0863F, -1.0599F, 12.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.3494F, 0.9939F));

		PartDefinition Torso = Manananggal.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -25.0F, -3.0F, 12.0F, 12.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -13.0F, -2.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -11.0F, -1.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -10.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -10.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -9.0F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -7.0F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -9.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -9.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -8.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -10.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.0F, -6.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -3.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -7.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 22.6506F, 1.9939F));

		PartDefinition RArms = Torso.addOrReplaceChild("RArms", CubeListBuilder.create().texOffs(0, 0).addBox(-4.9743F, 0.3916F, -3.0F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -25.0F, 2.0F));

		PartDefinition RLowerArm_r1 = RArms.addOrReplaceChild("RLowerArm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9743F, 0.3916F, 2.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 10.0F, -5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition LArms = Torso.addOrReplaceChild("LArms", CubeListBuilder.create().texOffs(0, 0).addBox(0.0257F, -0.6084F, -3.0F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -24.0F, 2.0F));

		PartDefinition RLowerArm_r2 = LArms.addOrReplaceChild("RLowerArm_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9743F, 0.3916F, 2.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 9.0F, -5.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition wings = Manananggal.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 6.6506F, -1.0061F, 0.0F, 0.0F, 0.3491F));

		PartDefinition wings_r44 = wings.addOrReplaceChild("wings_r44", CubeListBuilder.create().texOffs(0, 0).addBox(-5.3757F, -1.7942F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5977F, -3.7183F, -2.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition wings_r45 = wings.addOrReplaceChild("wings_r45", CubeListBuilder.create().texOffs(0, 0).addBox(-18.3757F, -0.7942F, 0.0F, 20.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.5977F, -9.7183F, -2.0F, 0.0F, 0.0F, -1.6144F));

		PartDefinition wings_r46 = wings.addOrReplaceChild("wings_r46", CubeListBuilder.create().texOffs(0, 0).addBox(-11.3757F, -0.7942F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 4.2817F, -2.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r47 = wings.addOrReplaceChild("wings_r47", CubeListBuilder.create().texOffs(0, 0).addBox(-10.3757F, -0.7942F, 0.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 3.2817F, -2.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r48 = wings.addOrReplaceChild("wings_r48", CubeListBuilder.create().texOffs(0, 0).addBox(-27.0F, 0.0F, -1.0F, 27.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, -12.7183F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition wings_r49 = wings.addOrReplaceChild("wings_r49", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 7.0F, -1.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.5977F, -0.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r50 = wings.addOrReplaceChild("wings_r50", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 2.0F, -1.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.5977F, 2.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r51 = wings.addOrReplaceChild("wings_r51", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 9.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -2.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r52 = wings.addOrReplaceChild("wings_r52", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 8.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -1.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r53 = wings.addOrReplaceChild("wings_r53", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 5.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.5977F, -0.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r54 = wings.addOrReplaceChild("wings_r54", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 1.0F, -1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 3.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r55 = wings.addOrReplaceChild("wings_r55", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -2.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r56 = wings.addOrReplaceChild("wings_r56", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r57 = wings.addOrReplaceChild("wings_r57", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 1.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, 1.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r58 = wings.addOrReplaceChild("wings_r58", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.5977F, 1.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r59 = wings.addOrReplaceChild("wings_r59", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 1.0F, -1.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-26.5977F, 2.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r60 = wings.addOrReplaceChild("wings_r60", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 1.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.5977F, 3.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r61 = wings.addOrReplaceChild("wings_r61", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, 1.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r62 = wings.addOrReplaceChild("wings_r62", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 1.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -9.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r63 = wings.addOrReplaceChild("wings_r63", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 2.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -8.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r64 = wings.addOrReplaceChild("wings_r64", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 2.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -7.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r65 = wings.addOrReplaceChild("wings_r65", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -6.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r66 = wings.addOrReplaceChild("wings_r66", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 2.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -5.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r67 = wings.addOrReplaceChild("wings_r67", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 2.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -4.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r68 = wings.addOrReplaceChild("wings_r68", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 2.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -3.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r69 = wings.addOrReplaceChild("wings_r69", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 2.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -2.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r70 = wings.addOrReplaceChild("wings_r70", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 2.0F, -1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -1.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r71 = wings.addOrReplaceChild("wings_r71", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, 2.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -0.7183F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r72 = wings.addOrReplaceChild("wings_r72", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, 2.0F, -1.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 0.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r73 = wings.addOrReplaceChild("wings_r73", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, 2.0F, -1.0F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 1.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r74 = wings.addOrReplaceChild("wings_r74", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, 2.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 2.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r75 = wings.addOrReplaceChild("wings_r75", CubeListBuilder.create().texOffs(0, 0).addBox(-17.0F, 2.0F, -1.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 3.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r76 = wings.addOrReplaceChild("wings_r76", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r77 = wings.addOrReplaceChild("wings_r77", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -13.0F, -1.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, 3.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r78 = wings.addOrReplaceChild("wings_r78", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -3.0F, -1.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4023F, 8.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r79 = wings.addOrReplaceChild("wings_r79", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -9.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5977F, 8.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r80 = wings.addOrReplaceChild("wings_r80", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -8.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4023F, 8.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r81 = wings.addOrReplaceChild("wings_r81", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -11.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5977F, 9.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r82 = wings.addOrReplaceChild("wings_r82", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5977F, 9.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r83 = wings.addOrReplaceChild("wings_r83", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5977F, 9.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r84 = wings.addOrReplaceChild("wings_r84", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 6.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.5977F, 6.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r85 = wings.addOrReplaceChild("wings_r85", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 5.2817F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r86 = wings.addOrReplaceChild("wings_r86", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, 1.0F, -1.0F, 19.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5977F, -7.7183F, -1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition wings3 = Manananggal.addOrReplaceChild("wings3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.6506F, -3.0061F, 0.0F, 3.1416F, -0.3491F));

		PartDefinition wings_r87 = wings3.addOrReplaceChild("wings_r87", CubeListBuilder.create().texOffs(0, 0).addBox(-5.3757F, -1.7942F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5977F, -3.7183F, -2.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition wings_r88 = wings3.addOrReplaceChild("wings_r88", CubeListBuilder.create().texOffs(0, 0).addBox(-18.3757F, -0.7942F, 0.0F, 20.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.5977F, -9.7183F, -2.0F, 0.0F, 0.0F, -1.6144F));

		PartDefinition wings_r89 = wings3.addOrReplaceChild("wings_r89", CubeListBuilder.create().texOffs(0, 0).addBox(-11.3757F, -0.7942F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 4.2817F, -1.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r90 = wings3.addOrReplaceChild("wings_r90", CubeListBuilder.create().texOffs(0, 0).addBox(-10.3757F, -0.7942F, 0.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-42.5977F, 3.2817F, -2.0F, 0.0F, 0.0F, -1.1345F));

		PartDefinition wings_r91 = wings3.addOrReplaceChild("wings_r91", CubeListBuilder.create().texOffs(0, 0).addBox(-27.0F, 0.0F, -1.0F, 27.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, -12.7183F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition wings_r92 = wings3.addOrReplaceChild("wings_r92", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 7.0F, -1.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r93 = wings3.addOrReplaceChild("wings_r93", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 2.0F, -1.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r94 = wings3.addOrReplaceChild("wings_r94", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 9.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -2.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r95 = wings3.addOrReplaceChild("wings_r95", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 8.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, -1.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r96 = wings3.addOrReplaceChild("wings_r96", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 5.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r97 = wings3.addOrReplaceChild("wings_r97", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 1.0F, -1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r98 = wings3.addOrReplaceChild("wings_r98", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -2.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r99 = wings3.addOrReplaceChild("wings_r99", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r100 = wings3.addOrReplaceChild("wings_r100", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 1.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r101 = wings3.addOrReplaceChild("wings_r101", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 2.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r102 = wings3.addOrReplaceChild("wings_r102", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 1.0F, -1.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-26.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r103 = wings3.addOrReplaceChild("wings_r103", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 1.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r104 = wings3.addOrReplaceChild("wings_r104", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, 1.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r105 = wings3.addOrReplaceChild("wings_r105", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 1.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -9.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r106 = wings3.addOrReplaceChild("wings_r106", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 2.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -8.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r107 = wings3.addOrReplaceChild("wings_r107", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 2.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -7.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r108 = wings3.addOrReplaceChild("wings_r108", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -6.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r109 = wings3.addOrReplaceChild("wings_r109", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 2.0F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -5.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r110 = wings3.addOrReplaceChild("wings_r110", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 2.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -4.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r111 = wings3.addOrReplaceChild("wings_r111", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 2.0F, -1.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -3.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r112 = wings3.addOrReplaceChild("wings_r112", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 2.0F, -1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -2.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r113 = wings3.addOrReplaceChild("wings_r113", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 2.0F, -1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -1.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r114 = wings3.addOrReplaceChild("wings_r114", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, 2.0F, -1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, -0.7183F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r115 = wings3.addOrReplaceChild("wings_r115", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, 2.0F, -1.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 0.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r116 = wings3.addOrReplaceChild("wings_r116", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, 2.0F, -1.0F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 1.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r117 = wings3.addOrReplaceChild("wings_r117", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, 2.0F, -1.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 2.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r118 = wings3.addOrReplaceChild("wings_r118", CubeListBuilder.create().texOffs(0, 0).addBox(-17.0F, 2.0F, -1.0F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r119 = wings3.addOrReplaceChild("wings_r119", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 4.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r120 = wings3.addOrReplaceChild("wings_r120", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -13.0F, -1.0F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5977F, 3.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r121 = wings3.addOrReplaceChild("wings_r121", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -3.0F, -1.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4023F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r122 = wings3.addOrReplaceChild("wings_r122", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -9.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5977F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r123 = wings3.addOrReplaceChild("wings_r123", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -8.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4023F, 8.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r124 = wings3.addOrReplaceChild("wings_r124", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -11.0F, -1.0F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r125 = wings3.addOrReplaceChild("wings_r125", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r126 = wings3.addOrReplaceChild("wings_r126", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5977F, 9.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r127 = wings3.addOrReplaceChild("wings_r127", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -1.0F, 6.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.5977F, 6.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r128 = wings3.addOrReplaceChild("wings_r128", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, 2.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5977F, 5.2817F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition wings_r129 = wings3.addOrReplaceChild("wings_r129", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, 1.0F, -1.0F, 19.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5977F, -7.7183F, -1.0F, 0.0F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wings2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hitbox.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Manananggal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Manananggal;
	}
}