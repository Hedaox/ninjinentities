package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelTrunksSsj extends ModelBase {
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
	private final ModelRenderer Hair12;
	private final ModelRenderer Hair13;
	private final ModelRenderer Hair14;
	private final ModelRenderer Strand1;
	private final ModelRenderer Strand2;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelTrunksSsj(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

		scale = _scale;
		
		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));


		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
		setRotationAngle(Hair1, -0.0873F, 0.0F, -0.6981F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 42, 2, -2.5133F, -4.474F, -2.0714F, 3, 6, 3, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(1.0F, -9.0F, 0.0F);
		setRotationAngle(Hair2, -0.0873F, 0.0F, 0.6981F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 42, 2, -0.4867F, -4.474F, -2.0714F, 3, 6, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(1.8F, -9.0F, -1.6F);
		setRotationAngle(Hair3, -0.0873F, 0.0F, 0.8726F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 42, 2, -0.4867F, -3.474F, -2.0714F, 3, 5, 3, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(-1.8F, -9.0F, -1.6F);
		setRotationAngle(Hair4, -0.0873F, 0.0F, -0.8726F);
		Head.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 42, 2, -2.5133F, -3.474F, -2.0714F, 3, 5, 3, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-1.8F, -9.0F, 2.9F);
		setRotationAngle(Hair5, -0.0873F, 0.0F, -0.4363F);
		Head.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 42, 2, -2.5133F, -3.474F, -2.0714F, 3, 5, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(1.8F, -9.0F, 2.9F);
		setRotationAngle(Hair6, -0.0873F, 0.0F, 0.4363F);
		Head.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 42, 2, -0.4867F, -3.474F, -2.0714F, 3, 5, 3, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(-0.2F, -9.0F, 2.9F);
		setRotationAngle(Hair7, -0.4364F, -0.6981F, 0.6981F);
		Head.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 42, 2, 0.5133F, -4.474F, -2.0714F, 2, 6, 2, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(0.2F, -9.0F, 2.9F);
		setRotationAngle(Hair8, -0.4364F, 0.6981F, -0.6981F);
		Head.addChild(Hair8);
		Hair8.cubeList.add(new ModelBox(Hair8, 42, 2, -2.5133F, -4.474F, -2.0714F, 2, 6, 2, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(1.8F, -9.0F, -1.6F);
		setRotationAngle(Hair9, -0.0873F, 0.0F, 0.8726F);
		Head.addChild(Hair9);
		Hair9.cubeList.add(new ModelBox(Hair9, 42, 2, 1.6882F, -3.1308F, -0.0337F, 3, 5, 3, 0.0F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(-1.8F, -9.0F, -1.6F);
		setRotationAngle(Hair10, -0.0873F, 0.0F, -0.8726F);
		Head.addChild(Hair10);
		Hair10.cubeList.add(new ModelBox(Hair10, 42, 2, -4.6882F, -3.1308F, -0.0337F, 3, 5, 3, 0.0F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(-2.8F, -9.0F, 1.1F);
		setRotationAngle(Hair11, -0.0873F, 0.0F, -1.2217F);
		Head.addChild(Hair11);
		Hair11.cubeList.add(new ModelBox(Hair11, 42, 2, -4.6882F, -3.1308F, -0.0337F, 3, 5, 3, 0.0F));

		Hair12 = new ModelRenderer(this);
		Hair12.setRotationPoint(2.8F, -9.0F, 1.1F);
		setRotationAngle(Hair12, -0.0873F, 0.0F, 1.2217F);
		Head.addChild(Hair12);
		Hair12.cubeList.add(new ModelBox(Hair12, 42, 2, 1.6882F, -3.1308F, -0.0337F, 3, 5, 3, 0.0F));

		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(-1.2F, -7.0F, 2.1F);
		setRotationAngle(Hair13, -0.4364F, 0.0F, 0.0872F);
		Head.addChild(Hair13);
		Hair13.cubeList.add(new ModelBox(Hair13, 42, 2, 0.6882F, -3.1308F, -0.0337F, 4, 5, 3, 0.0F));

		Hair14 = new ModelRenderer(this);
		Hair14.setRotationPoint(1.2F, -7.0F, 2.1F);
		setRotationAngle(Hair14, -0.4364F, 0.0F, -0.0872F);
		Head.addChild(Hair14);
		Hair14.cubeList.add(new ModelBox(Hair14, 42, 2, -4.6882F, -3.1308F, -0.0337F, 4, 5, 3, 0.0F));

		Strand1 = new ModelRenderer(this);
		Strand1.setRotationPoint(-4.0F, -8.0F, -2.0F);
		setRotationAngle(Strand1, -0.3491F, 0.0F, 0.7854F);
		Head.addChild(Strand1);
		Strand1.cubeList.add(new ModelBox(Strand1, 38, 2, 1.6436F, -1.6388F, -3.0979F, 1, 5, 1, 0.0F));

		Strand2 = new ModelRenderer(this);
		Strand2.setRotationPoint(4.0F, -8.0F, -2.0F);
		setRotationAngle(Strand2, -0.3491F, 0.0F, -0.7854F);
		Head.addChild(Strand2);
		Strand2.cubeList.add(new ModelBox(Strand2, 38, 2, -2.6436F, -1.6388F, -3.0979F, 1, 5, 1, 0.0F));

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
