package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelKeflaNinjin extends ModelBase {
	private  ModelRenderer Head;
	private  ModelRenderer Hair1;
	private  ModelRenderer Hair2;
	private  ModelRenderer Hair3;
	private  ModelRenderer Hair4;
	private  ModelRenderer Hair5;
	private  ModelRenderer Hair6;
	private  ModelRenderer Hair7;
	private  ModelRenderer Hair8;
	private  ModelRenderer Hair9;
	private  ModelRenderer Hair10;
	private  ModelRenderer Hair11;
	private  ModelRenderer Hair12;
	private  ModelRenderer Hair13;
	private  ModelRenderer Hair14;
	private  ModelRenderer Hair15;
	private  ModelRenderer Strand1;
	private  ModelRenderer Strand2;
	private  ModelRenderer REarring;
	private  ModelRenderer LEarring;
	private  ModelRenderer Body;
	private  ModelRenderer RArm;
	private  ModelRenderer LArm;
	private  ModelRenderer RLeg;
	private  ModelRenderer LLeg;
	private float scale = 1.0F;
	private int form = 0;

	@SuppressWarnings("unchecked")
	public ModelKeflaNinjin(float _scale, int _form) {
		textureWidth = 64;
		textureHeight = 32;
		
		scale = _scale;
		form = _form;

		if(form == 0)
		{
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

			Hair1 = new ModelRenderer(this);
			Hair1.setRotationPoint(-1.0F, -11.0F, 3.0F);
			setRotationAngle(Hair1, 0.0F, 0.0F, 0.0873F);
			Head.addChild(Hair1);
			Hair1.cubeList.add(new ModelBox(Hair1, 45, 2, 0.0603F, -4.658F, -3.0F, 3, 8, 3, 0.0F));

			Hair2 = new ModelRenderer(this);
			Hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
			setRotationAngle(Hair2, 0.0F, 0.0F, -0.6981F);
			Head.addChild(Hair2);
			Hair2.cubeList.add(new ModelBox(Hair2, 45, 2, -0.9397F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

			Hair3 = new ModelRenderer(this);
			Hair3.setRotationPoint(0.0F, -8.0F, 0.0F);
			setRotationAngle(Hair3, 0.0F, 0.0F, 0.1745F);
			Head.addChild(Hair3);
			Hair3.cubeList.add(new ModelBox(Hair3, 45, 2, 0.0603F, -4.342F, -3.0F, 3, 7, 3, 0.0F));

			Hair4 = new ModelRenderer(this);
			Hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
			setRotationAngle(Hair4, 0.0F, 0.0873F, 0.2618F);
			Head.addChild(Hair4);
			Hair4.cubeList.add(new ModelBox(Hair4, 45, 2, 1.0603F, -4.342F, -3.0F, 2, 7, 3, 0.0F));

			Hair5 = new ModelRenderer(this);
			Hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
			setRotationAngle(Hair5, 2.7925F, 0.0873F, -1.3963F);
			Head.addChild(Hair5);
			Hair5.cubeList.add(new ModelBox(Hair5, 45, 2, -0.2474F, -2.6696F, -2.7223F, 3, 6, 3, 0.0F));

			Hair6 = new ModelRenderer(this);
			Hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
			setRotationAngle(Hair6, -0.3491F, 0.0F, -0.4363F);
			Head.addChild(Hair6);
			Hair6.cubeList.add(new ModelBox(Hair6, 45, 2, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

			Hair7 = new ModelRenderer(this);
			Hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
			setRotationAngle(Hair7, -0.3491F, 0.0F, 0.5236F);
			Head.addChild(Hair7);
			Hair7.cubeList.add(new ModelBox(Hair7, 45, 2, 1.8099F, -6.4417F, -5.0982F, 3, 10, 5, 0.0F));

			Hair8 = new ModelRenderer(this);
			Hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
			setRotationAngle(Hair8, 2.7925F, 0.0873F, -0.4363F);
			Head.addChild(Hair8);
			Hair8.cubeList.add(new ModelBox(Hair8, 45, 2, -0.4847F, -3.7367F, -2.7246F, 3, 7, 3, 0.0F));

			Hair9 = new ModelRenderer(this);
			Hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
			setRotationAngle(Hair9, 2.7925F, 0.0873F, 0.5236F);
			Head.addChild(Hair9);
			Hair9.cubeList.add(new ModelBox(Hair9, 45, 2, 0.3618F, -3.6765F, -2.7815F, 3, 7, 3, 0.0F));

			Hair10 = new ModelRenderer(this);
			Hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
			setRotationAngle(Hair10, -0.5236F, 0.3491F, 0.0F);
			Head.addChild(Hair10);
			Hair10.cubeList.add(new ModelBox(Hair10, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

			Hair11 = new ModelRenderer(this);
			Hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
			setRotationAngle(Hair11, -0.5236F, -0.2618F, 0.0F);
			Head.addChild(Hair11);
			Hair11.cubeList.add(new ModelBox(Hair11, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

			Hair12 = new ModelRenderer(this);
			Hair12.setRotationPoint(-5.0F, 0.0F, 3.0F);
			setRotationAngle(Hair12, -0.5236F, -0.2618F, -0.7854F);
			Head.addChild(Hair12);
			Hair12.cubeList.add(new ModelBox(Hair12, 38, 2, 1.9972F, -4.6289F, -4.1585F, 2, 7, 2, 0.0F));

			Hair13 = new ModelRenderer(this);
			Hair13.setRotationPoint(1.0F, -6.0F, 3.0F);
			setRotationAngle(Hair13, -0.2618F, -0.2618F, 0.7854F);
			Head.addChild(Hair13);
			Hair13.cubeList.add(new ModelBox(Hair13, 38, 2, 0.9972F, -5.6289F, -4.1585F, 2, 7, 2, 0.0F));

			Strand1 = new ModelRenderer(this);
			Strand1.setRotationPoint(-4.0F, -8.0F, -2.0F);
			setRotationAngle(Strand1, -0.3491F, 0.0F, 0.7854F);
			Head.addChild(Strand1);
			Strand1.cubeList.add(new ModelBox(Strand1, 38, 2, 0.583F, -1.6421F, -2.7351F, 2, 6, 2, 0.0F));

			Strand2 = new ModelRenderer(this);
			Strand2.setRotationPoint(1.0F, -5.0F, -2.0F);
			setRotationAngle(Strand2, -0.3491F, 0.0F, -0.7854F);
			Head.addChild(Strand2);
			Strand2.cubeList.add(new ModelBox(Strand2, 38, 2, 1.9972F, -1.6421F, -2.7351F, 2, 6, 2, 0.0F));

			REarring = new ModelRenderer(this);
			REarring.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(REarring, 0.0F, -0.5236F, 0.0F);
			Head.addChild(REarring);
			REarring.cubeList.add(new ModelBox(REarring, 32, 2, -5.0F, -3.0F, 0.0F, 0, 2, 1, 0.0F));

			LEarring = new ModelRenderer(this);
			LEarring.setRotationPoint(0.0F, 0.0F, 0.0F);
			LEarring.mirror = true;
			setRotationAngle(LEarring, 0.0F, 0.5236F, 0.0F);
			Head.addChild(LEarring);
			LEarring.cubeList.add(new ModelBox(LEarring, 32, 2, 5.0F, -3.0F, 0.0F, 0, 2, 1, 0.0F));

			Body = new ModelRenderer(this);
			Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
			Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

			RArm = new ModelRenderer(this);
			RArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
			Body.addChild(RArm);
			RArm.cubeList.add(new ModelBox(RArm, 41, 16, -3.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

			LArm = new ModelRenderer(this);
			LArm.setRotationPoint(7.8F, -3.4F, -3.8F);
			LArm.mirror = true;
			Body.addChild(LArm);
			LArm.cubeList.add(new ModelBox(LArm, 41, 16, 0.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

			RLeg = new ModelRenderer(this);
			RLeg.setRotationPoint(1.8F, 6.6F, -3.8F);
			Body.addChild(RLeg);
			RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

			LLeg = new ModelRenderer(this);
			LLeg.setRotationPoint(5.8F, 6.6F, -3.8F);
			LLeg.mirror = true;
			Body.addChild(LLeg);
			LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		}
		else if(form == 1)
		{
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

			Hair1 = new ModelRenderer(this);
			Hair1.setRotationPoint(-1.0F, -11.0F, 3.0F);
			setRotationAngle(Hair1, 0.0F, 0.0F, 0.2618F);
			Head.addChild(Hair1);
			Hair1.cubeList.add(new ModelBox(Hair1, 45, 2, 0.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

			Hair2 = new ModelRenderer(this);
			Hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
			setRotationAngle(Hair2, 0.0F, 0.0F, -0.2618F);
			Head.addChild(Hair2);
			Hair2.cubeList.add(new ModelBox(Hair2, 45, 2, 0.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

			Hair3 = new ModelRenderer(this);
			Hair3.setRotationPoint(0.0F, -8.0F, 0.0F);
			setRotationAngle(Hair3, 0.0F, 0.0F, 0.1745F);
			Head.addChild(Hair3);
			Hair3.cubeList.add(new ModelBox(Hair3, 45, 2, 0.0603F, -4.342F, -3.0F, 3, 7, 3, 0.0F));

			Hair4 = new ModelRenderer(this);
			Hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
			setRotationAngle(Hair4, 0.0F, 0.0873F, 0.2618F);
			Head.addChild(Hair4);
			Hair4.cubeList.add(new ModelBox(Hair4, 45, 2, 1.0603F, -4.342F, -3.0F, 2, 7, 3, 0.0F));

			Hair5 = new ModelRenderer(this);
			Hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
			setRotationAngle(Hair5, 2.7925F, 0.0873F, -0.6109F);
			Head.addChild(Hair5);
			Hair5.cubeList.add(new ModelBox(Hair5, 45, 2, -0.2474F, -2.6696F, -2.7223F, 3, 6, 3, 0.0F));

			Hair6 = new ModelRenderer(this);
			Hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
			setRotationAngle(Hair6, -0.3491F, 0.0F, -0.4363F);
			Head.addChild(Hair6);
			Hair6.cubeList.add(new ModelBox(Hair6, 45, 2, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

			Hair7 = new ModelRenderer(this);
			Hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
			setRotationAngle(Hair7, -0.3491F, 0.0F, 0.5236F);
			Head.addChild(Hair7);
			Hair7.cubeList.add(new ModelBox(Hair7, 45, 2, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));

			Hair8 = new ModelRenderer(this);
			Hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
			setRotationAngle(Hair8, 2.7925F, 0.0873F, -0.4363F);
			Head.addChild(Hair8);
			Hair8.cubeList.add(new ModelBox(Hair8, 45, 2, -0.4847F, -3.7367F, -2.7246F, 3, 7, 3, 0.0F));

			Hair9 = new ModelRenderer(this);
			Hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
			setRotationAngle(Hair9, 2.7925F, 0.0873F, 0.5236F);
			Head.addChild(Hair9);
			Hair9.cubeList.add(new ModelBox(Hair9, 45, 2, 0.3618F, -3.6765F, -2.7815F, 3, 7, 3, 0.0F));

			Hair10 = new ModelRenderer(this);
			Hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
			setRotationAngle(Hair10, -0.5236F, 0.3491F, 0.0F);
			Head.addChild(Hair10);
			Hair10.cubeList.add(new ModelBox(Hair10, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

			Hair11 = new ModelRenderer(this);
			Hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
			setRotationAngle(Hair11, -0.5236F, -0.2618F, 0.0F);
			Head.addChild(Hair11);
			Hair11.cubeList.add(new ModelBox(Hair11, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

			Hair12 = new ModelRenderer(this);
			Hair12.setRotationPoint(-5.0F, 0.0F, 3.0F);
			setRotationAngle(Hair12, -0.5236F, -0.2618F, -0.7854F);
			Head.addChild(Hair12);
			Hair12.cubeList.add(new ModelBox(Hair12, 38, 2, 1.9972F, -4.6289F, -4.1585F, 2, 7, 2, 0.0F));

			Hair13 = new ModelRenderer(this);
			Hair13.setRotationPoint(1.0F, -6.0F, 3.0F);
			setRotationAngle(Hair13, -0.2618F, -0.2618F, 0.7854F);
			Head.addChild(Hair13);
			Hair13.cubeList.add(new ModelBox(Hair13, 38, 2, 1.9972F, -4.6289F, -4.1585F, 2, 7, 2, 0.0F));

			Hair14 = new ModelRenderer(this);
			Hair14.setRotationPoint(1.0F, -6.0F, 3.0F);
			setRotationAngle(Hair14, -0.2618F, -0.2618F, 1.3963F);
			Head.addChild(Hair14);
			Hair14.cubeList.add(new ModelBox(Hair14, 38, 2, 2.256F, -4.8789F, -3.2255F, 2, 7, 2, 0.0F));

			Hair15 = new ModelRenderer(this);
			Hair15.setRotationPoint(-3.0F, -6.0F, 6.0F);
			setRotationAngle(Hair15, 0.4363F, 0.0F, 1.8326F);
			Head.addChild(Hair15);
			Hair15.cubeList.add(new ModelBox(Hair15, 38, 2, 2.256F, -4.8789F, -3.2255F, 2, 7, 2, 0.0F));

			Strand1 = new ModelRenderer(this);
			Strand1.setRotationPoint(-4.0F, -8.0F, -2.0F);
			setRotationAngle(Strand1, -0.3491F, 0.0F, 0.7854F);
			Head.addChild(Strand1);
			Strand1.cubeList.add(new ModelBox(Strand1, 38, 2, 0.583F, -1.6421F, -2.7351F, 2, 6, 2, 0.0F));

			Strand2 = new ModelRenderer(this);
			Strand2.setRotationPoint(1.0F, -5.0F, -2.0F);
			setRotationAngle(Strand2, -0.3491F, 0.0F, -0.7854F);
			Head.addChild(Strand2);
			Strand2.cubeList.add(new ModelBox(Strand2, 38, 2, 1.9972F, -1.6421F, -2.7351F, 2, 6, 2, 0.0F));

			REarring = new ModelRenderer(this);
			REarring.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(REarring, 0.0F, -0.5236F, 0.0F);
			Head.addChild(REarring);
			REarring.cubeList.add(new ModelBox(REarring, 32, 2, -5.0F, -3.0F, 0.0F, 0, 2, 1, 0.0F));

			LEarring = new ModelRenderer(this);
			LEarring.setRotationPoint(0.0F, 0.0F, 0.0F);
			LEarring.mirror = true;
			setRotationAngle(LEarring, 0.0F, 0.5236F, 0.0F);
			Head.addChild(LEarring);
			LEarring.cubeList.add(new ModelBox(LEarring, 32, 2, 5.0F, -3.0F, 0.0F, 0, 2, 1, 0.0F));

			Body = new ModelRenderer(this);
			Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
			Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

			RArm = new ModelRenderer(this);
			RArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
			Body.addChild(RArm);
			RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

			LArm = new ModelRenderer(this);
			LArm.setRotationPoint(7.8F, -3.4F, -3.8F);
			LArm.mirror = true;
			Body.addChild(LArm);
			LArm.cubeList.add(new ModelBox(LArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

			RLeg = new ModelRenderer(this);
			RLeg.setRotationPoint(1.8F, 6.6F, -3.8F);
			Body.addChild(RLeg);
			RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

			LLeg = new ModelRenderer(this);
			LLeg.setRotationPoint(5.8F, 6.6F, -3.8F);
			LLeg.mirror = true;
			Body.addChild(LLeg);
			LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		}
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
