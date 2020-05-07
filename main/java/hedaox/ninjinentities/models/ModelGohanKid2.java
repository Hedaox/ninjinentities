package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelGohanKid2 extends ModelBase {
	private final ModelRenderer Head;
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
	private final ModelRenderer Hair11;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelGohanKid2(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

		scale = _scale;
		
		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-3.0F, -9.0F, 0.0F);
		setRotationAngle(Hair1, -0.0873F, 0.0F, -2.4434F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 42, 2, -1.5133F, -4.474F, -2.0714F, 2, 6, 3, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(3.0F, -9.0F, 0.0F);
		setRotationAngle(Hair2, 0.0872F, 0.0F, 2.3562F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 42, 2, -0.4867F, -4.474F, -1.6714F, 2, 6, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(3.4F, -9.0F, -1.6F);
		setRotationAngle(Hair3, 0.5236F, -0.3491F, 2.1816F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 42, 2, -0.4867F, -3.474F, -2.0714F, 2, 5, 3, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(-3.4F, -9.0F, -1.6F);
		setRotationAngle(Hair4, 0.4363F, 0.3491F, -2.3561F);
		Head.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 42, 2, -1.5133F, -4.474F, -2.0714F, 2, 7, 3, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-2.8F, -9.0F, 2.9F);
		setRotationAngle(Hair5, -0.0873F, 0.0F, -2.3561F);
		Head.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 42, 2, -1.5133F, -4.474F, -2.0714F, 2, 6, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(2.8F, -9.0F, 2.9F);
		setRotationAngle(Hair6, -0.0873F, 0.0F, 2.3561F);
		Head.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 42, 2, -0.4867F, -4.474F, -2.0714F, 2, 6, 3, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(2.8F, -9.0F, 2.9F);
		setRotationAngle(Hair7, -0.611F, -0.6108F, 3.0543F);
		Head.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 42, 2, -0.4867F, -4.474F, -2.0714F, 3, 6, 2, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(-2.8F, -9.0F, 2.9F);
		setRotationAngle(Hair8, -0.611F, 0.5236F, -3.0543F);
		Head.addChild(Hair8);
		Hair8.cubeList.add(new ModelBox(Hair8, 42, 2, -2.5133F, -4.474F, -2.0714F, 3, 6, 2, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(-0.4F, -5.0F, -0.6F);
		setRotationAngle(Hair9, -0.6109F, 0.0F, 0.0F);
		Head.addChild(Hair9);
		Hair9.cubeList.add(new ModelBox(Hair9, 42, 2, -2.9133F, -2.474F, -5.0714F, 3, 4, 1, 0.0F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(2.6F, -5.0F, -0.6F);
		setRotationAngle(Hair10, -0.6109F, 0.0F, 0.0F);
		Head.addChild(Hair10);
		Hair10.cubeList.add(new ModelBox(Hair10, 42, 2, -2.5133F, -2.474F, -5.0714F, 3, 4, 1, 0.0F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(2.6F, -5.0F, -0.6F);
		Head.addChild(Hair11);
		Hair11.cubeList.add(new ModelBox(Hair11, 42, 2, -4.0133F, -5.674F, -2.0714F, 3, 2, 6, 0.0F));
		
		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
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
