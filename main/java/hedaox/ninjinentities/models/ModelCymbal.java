package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelCymbal extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer bone3;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer LLeg;
	private final ModelRenderer RLeg;
	private final ModelRenderer Tail1;
	private final ModelRenderer Tail2;
	private final ModelRenderer Tail3;
	private final ModelRenderer LeftWing;
	private final ModelRenderer RightWing;
	private final ModelRenderer Head;
	private final ModelRenderer EarL;
	private final ModelRenderer EarR;
	private final ModelRenderer bone2;
	private final ModelRenderer Snout;
	private final ModelRenderer HornR;
	private final ModelRenderer HornL;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelCymbal(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;
		textureWidth = 90;
		textureHeight = 90;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -6.0F, 0.0F, -3.0F, 12, 12, 6, 0.0F));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 59, 34, 0.0F, -23.0F, 3.0F, 0, 10, 2, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RArm, -0.0086F, 0.0F, 0.0873F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 42, 15, -5.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LArm, -0.0086F, 0.0F, -0.0873F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 42, 15, 1.0F, -2.0F, -2.0F, 4, 11, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 26, 28, -1.9F, 0.0F, -3.0F, 5, 12, 6, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.mirror = true;
		RLeg.cubeList.add(new ModelBox(RLeg, 26, 28, -3.1F, 0.0F, -3.0F, 5, 12, 6, 0.0F));

		Tail1 = new ModelRenderer(this);
		Tail1.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addChild(Tail1);
		Tail1.cubeList.add(new ModelBox(Tail1, 0, 74, -2.0F, -13.0F, 3.0F, 4, 4, 7, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 13.0F, 10.0F);
		setRotationAngle(Tail2, -0.3491F, 0.0F, 0.0F);
		Body.addChild(Tail2);
		Tail2.cubeList.add(new ModelBox(Tail2, 21, 74, -1.5F, -1.6579F, -0.9397F, 3, 3, 7, 0.0F));

		Tail3 = new ModelRenderer(this);
		Tail3.setRotationPoint(-0.8125F, 15.0625F, 15.5702F);
		setRotationAngle(Tail3, -0.3491F, 0.6109F, 0.0F);
		Body.addChild(Tail3);
		Tail3.cubeList.add(new ModelBox(Tail3, 39, 77, -0.1704F, -1.251F, -0.7723F, 3, 2, 7, 0.0F));

		LeftWing = new ModelRenderer(this);
		LeftWing.setRotationPoint(2.3F, 2.2F, 0.8F);
		setRotationAngle(LeftWing, 0.6716F, 0.607F, -0.4098F);
		Body.addChild(LeftWing);
		LeftWing.cubeList.add(new ModelBox(LeftWing, 66, 0, 1.0F, 0.0F, 0.0F, 0, 16, 11, 0.0F));

		RightWing = new ModelRenderer(this);
		RightWing.setRotationPoint(-2.3F, 2.2F, 0.8F);
		setRotationAngle(RightWing, 0.6716F, -0.607F, 0.4098F);
		Body.addChild(RightWing);
		RightWing.mirror = true;
		RightWing.cubeList.add(new ModelBox(RightWing, 66, 0, -1.0F, 0.0F, 0.0F, 0, 16, 11, 0.0F));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 18, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarL, 0.0F, 0.5236F, 0.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 24, 16, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarR, 0.0F, -0.5236F, 0.0F);
		Head.addChild(EarR);
		EarR.cubeList.add(new ModelBox(EarR, 24, 12, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 36, 52, 0.0F, -10.0F, -4.0F, 0, 2, 9, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 0, 52, 0.0F, -10.0F, 4.0F, 0, 10, 2, 0.0F));

		Snout = new ModelRenderer(this);
		Snout.setRotationPoint(0.0F, -1.0F, -5.0F);
		setRotationAngle(Snout, 0.4363F, 0.0F, 0.0F);
		Head.addChild(Snout);
		Snout.cubeList.add(new ModelBox(Snout, 30, 48, -3.0F, -3.0F, -4.0F, 6, 4, 6, 0.0F));

		HornR = new ModelRenderer(this);
		HornR.setRotationPoint(0.0F, -8.0F, 1.0F);
		setRotationAngle(HornR, 0.4363F, 0.0F, 0.0F);
		Head.addChild(HornR);
		HornR.cubeList.add(new ModelBox(HornR, 58, 48, -3.1875F, -2.5468F, -4.2113F, 2, 2, 10, 0.0F));

		HornL = new ModelRenderer(this);
		HornL.setRotationPoint(0.0F, -8.0F, 1.0F);
		setRotationAngle(HornL, 0.4363F, 0.0F, 0.0F);
		Head.addChild(HornL);
		HornL.mirror = true;
		HornL.cubeList.add(new ModelBox(HornL, 58, 48, 1.1875F, -2.5468F, -4.2113F, 2, 2, 10, 0.0F));
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