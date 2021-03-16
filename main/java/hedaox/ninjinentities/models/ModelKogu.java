package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelKogu extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer EarR;
	private final ModelRenderer EarL;
	private final ModelRenderer HeadBand;
	private final ModelRenderer HeadBand2;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Hair4;
	private final ModelRenderer Hair5;
	private final ModelRenderer Hair6;
	private final ModelRenderer Hair7;
	private final ModelRenderer Hair8;
	private final ModelRenderer Hair9;
	private final ModelRenderer Hair10;
	private final ModelRenderer Body;
	private final ModelRenderer bb_main;
	private final ModelRenderer RArm;
	private final ModelRenderer bone;
	private final ModelRenderer LArm;
	private final ModelRenderer bone2;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer Sword;
	private final ModelRenderer Blade;
	private final ModelRenderer Grip;
	private final ModelRenderer Guard;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelKogu(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 30, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarR, 0.0F, -0.5236F, 0.0F);
		EarR.mirror = true;
		Head.addChild(EarR);
		EarR.cubeList.add(new ModelBox(EarR, 26, 23, -4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarL, 0.0F, 0.5236F, 0.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 26, 23, 4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

		HeadBand = new ModelRenderer(this);
		HeadBand.setRotationPoint(-5.0F, -2.0F, -3.0F);
		setRotationAngle(HeadBand, 0.0F, -0.3491F, 0.3491F);
		Head.addChild(HeadBand);
		HeadBand.cubeList.add(new ModelBox(HeadBand, 0, 0, -0.1406F, -5.4111F, 0.0512F, 0, 5, 2, 0.0F));

		HeadBand2 = new ModelRenderer(this);
		HeadBand2.setRotationPoint(-4.0F, -1.0F, -2.0F);
		setRotationAngle(HeadBand2, 0.0873F, -0.6109F, 0.1745F);
		Head.addChild(HeadBand2);
		HeadBand2.cubeList.add(new ModelBox(HeadBand2, 0, 0, -0.1244F, -5.8508F, 0.1619F, 0, 4, 2, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-1.1493F, -7.2362F, -2.6078F);
		setRotationAngle(Hair1, 1.0472F, 0.5236F, -0.5236F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 12, 3, -1.8507F, -4.0F, 0.0F, 2, 6, 2, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-2.1493F, -6.2362F, 0.3922F);
		setRotationAngle(Hair2, 0.8727F, 1.2217F, 0.0F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 12, 3, -2.8507F, -4.0F, 0.0F, 3, 5, 2, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(-2.1493F, -6.2362F, 2.3922F);
		setRotationAngle(Hair3, 0.8727F, 1.9199F, 0.0F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 12, 3, -1.4396F, -3.8854F, 0.0962F, 2, 4, 1, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(-0.1493F, -6.2362F, 2.3922F);
		setRotationAngle(Hair4, 0.8727F, 2.9671F, 0.0F);
		Head.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 12, 3, -1.8507F, -4.0F, 0.0F, 3, 4, 1, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(0.8507F, -7.1737F, -3.2953F);
		setRotationAngle(Hair5, 1.3963F, -0.2618F, 0.0F);
		Head.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 12, 3, -1.8507F, -2.0F, 0.0F, 2, 4, 2, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(2.8507F, -7.2362F, -2.6078F);
		setRotationAngle(Hair6, 1.3963F, -0.7854F, 0.0F);
		Head.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 12, 3, -1.8507F, -3.0F, 0.0F, 2, 6, 1, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(-0.1493F, -6.2362F, -0.6078F);
		setRotationAngle(Hair7, -0.2618F, 0.5236F, -0.6109F);
		Head.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 12, 3, -2.8507F, -5.0F, 0.0F, 3, 5, 2, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(2.1493F, -6.2362F, 2.3922F);
		setRotationAngle(Hair8, 0.8727F, -1.9199F, 0.0F);
		Head.addChild(Hair8);
		Hair8.cubeList.add(new ModelBox(Hair8, 12, 3, -2.1493F, -4.0F, 0.0F, 2, 4, 1, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(2.1493F, -6.2362F, 0.3922F);
		setRotationAngle(Hair9, 0.8727F, -1.2217F, 0.0F);
		Head.addChild(Hair9);
		Hair9.cubeList.add(new ModelBox(Hair9, 12, 3, -2.1493F, -4.0F, 0.0F, 3, 5, 2, 0.0F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(0.1493F, -6.2362F, -0.6078F);
		setRotationAngle(Hair10, -0.2618F, -0.5236F, 0.6109F);
		Head.addChild(Hair10);
		Hair10.cubeList.add(new ModelBox(Hair10, 12, 3, -1.1493F, -5.0F, 0.0F, 2, 5, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 40, 0, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(-0.2F, 18.6F, 0.2F);
		Body.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 75, -4.5F, -23.6F, -2.4F, 9, 10, 5, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 54, 54, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.0F, 22.0F, 0.0F);
		RArm.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 40, 16, -9.0F, -25.0F, -3.0F, 5, 4, 6, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 56, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, 22.0F, 0.0F);
		LArm.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 46, 4.0F, -25.0F, -3.0F, 5, 4, 6, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 22, 47, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 38, 47, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Sword = new ModelRenderer(this);
		Sword.setRotationPoint(-4.2F, 4.6F, -3.8F);
		setRotationAngle(Sword, -0.4363F, -0.3491F, 0.0F);
		Body.addChild(Sword);

		Blade = new ModelRenderer(this);
		Blade.setRotationPoint(0.0F, 1.0F, 0.0F);
		Sword.addChild(Blade);
		Blade.cubeList.add(new ModelBox(Blade, 33, 26, 0.0F, -1.0F, 0.0F, 0, 1, 18, 0.0F));

		Grip = new ModelRenderer(this);
		Grip.setRotationPoint(1.0F, 1.0F, -6.0F);
		Sword.addChild(Grip);
		Grip.cubeList.add(new ModelBox(Grip, 41, 36, -1.5F, -1.0F, -1.0F, 1, 1, 7, 0.0F));

		Guard = new ModelRenderer(this);
		Guard.setRotationPoint(2.0F, 2.0F, 0.0F);
		Sword.addChild(Guard);
		Guard.cubeList.add(new ModelBox(Guard, 57, 32, -4.0F, -3.5F, 0.0F, 4, 4, 0, 0.0F));
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