package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDrum extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer bone3;
	private final ModelRenderer RArm;
	private final ModelRenderer rightarmshoulder;
	private final ModelRenderer LArm;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer bb_main;
	private final ModelRenderer Head;
	private final ModelRenderer HeadChild_2;
	private final ModelRenderer HeadChild_3;
	private final ModelRenderer HeadChild_1;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelDrum(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 90;
		textureHeight = 90;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 13, 13, -6.0F, 0.0F, -3.0F, 12, 12, 6, 0.0F));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 72, 48, 0.0F, -23.0F, 3.0F, 0, 10, 2, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RArm, -0.0086F, 0.0F, 0.0873F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 55, 28, -5.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F));

		rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(0.0F, 0.0F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		RArm.addChild(rightarmshoulder);

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LArm, 0.0086F, 0.0F, -0.0873F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 49, 13, 1.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 13, 47, -3.0F, 0.0F, -3.0F, 5, 12, 6, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 39, 41, -1.9F, 0.0F, -3.0F, 5, 12, 6, 0.0F));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 34.0F, 0.0F);
		Body.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 7, 70, -6.0F, -24.0F, -4.0F, 12, 7, 8, 0.0F));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 13, 31, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));

		HeadChild_2 = new ModelRenderer(this);
		HeadChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_2, 0.0F, 0.5236F, 0.0F);
		Head.addChild(HeadChild_2);

		HeadChild_3 = new ModelRenderer(this);
		HeadChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_3, 0.0F, 0.5236F, 0.0F);
		Head.addChild(HeadChild_3);
		HeadChild_3.cubeList.add(new ModelBox(HeadChild_3, 37, 29, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		HeadChild_1 = new ModelRenderer(this);
		HeadChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_1, 0.0F, -0.5236F, 0.0F);
		Head.addChild(HeadChild_1);
		HeadChild_1.cubeList.add(new ModelBox(HeadChild_1, 37, 29, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 1.0F, -1.0F);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		Head.addChild(bone);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 57, 65, 0.0F, -10.0F, -4.0F, 0, 2, 9, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 72, 47, 0.0F, -10.0F, 4.0F, 0, 10, 2, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
		this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
		this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
		this.RArm.rotateAngleZ = 0.0F;
		this.LArm.rotateAngleZ = 0.0F;
		this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.RLeg.rotateAngleY = 0.0F;
		this.LLeg.rotateAngleY = 0.0F;
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}