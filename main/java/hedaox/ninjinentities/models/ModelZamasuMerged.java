package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelZamasuMerged extends ModelBase {
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
	private final ModelRenderer REar;
	private final ModelRenderer LEar;
	private final ModelRenderer REarring;
	private final ModelRenderer LEarring;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelZamasuMerged(float _scale) {
		textureWidth = 64;
		textureHeight = 32;
		
		scale = _scale;

		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(1.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -5.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-1.0F, -11.0F, 3.0F);
		setRotationAngle(Hair1, -0.3491F, 0.0F, 0.2618F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 45, 2, -2.2F, -1.658F, -5.0F, 3, 7, 3, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-3.0F, -9.0F, 1.0F);
		setRotationAngle(Hair2, -0.2618F, 0.0F, 0.4363F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 45, 2, 2.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(-3.0F, -9.0F, 1.0F);
		setRotationAngle(Hair3, -0.4363F, 0.0F, 0.0F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 39, 0, 1.0603F, -5.658F, 0.0F, 4, 7, 4, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(-1.0F, -11.0F, 3.0F);
		setRotationAngle(Hair4, -0.1746F, 0.0F, -0.2618F);
		Head.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 45, 2, -4.9397F, -2.658F, -6.0F, 3, 7, 3, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-1.0F, -11.0F, 3.0F);
		setRotationAngle(Hair5, -0.3491F, 0.0F, -1.7453F);
		Head.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 45, 2, -4.9397F, -6.658F, -3.0F, 3, 7, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(Hair6, -0.6109F, 0.0F, -0.4363F);
		Head.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 45, 2, 1.8099F, -4.1257F, -5.2188F, 3, 7, 3, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(Hair7, -0.3491F, 0.0F, 0.4364F);
		Head.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 45, 2, 4.8099F, -6.1257F, -5.2188F, 3, 7, 3, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(Hair8, 0.0F, 0.0F, 0.4364F);
		Head.addChild(Hair8);
		Hair8.cubeList.add(new ModelBox(Hair8, 39, 4, 2.8099F, -5.1257F, -7.9F, 5, 4, 4, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(-3.0F, -9.0F, 1.0F);
		setRotationAngle(Hair9, -0.4363F, 0.0F, 0.0F);
		Head.addChild(Hair9);
		Hair9.cubeList.add(new ModelBox(Hair9, 38, 2, -1.9397F, -2.658F, 1.0F, 6, 6, 4, 0.0F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(Hair10, -0.6109F, 0.0F, -0.4363F);
		Head.addChild(Hair10);
		Hair10.cubeList.add(new ModelBox(Hair10, 45, 2, -0.1901F, -1.1257F, -4.2188F, 3, 7, 3, 0.0F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(Hair11, -0.3491F, 0.0F, 0.4364F);
		Head.addChild(Hair11);
		Hair11.cubeList.add(new ModelBox(Hair11, 45, 2, 4.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

		Hair12 = new ModelRenderer(this);
		Hair12.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(Hair12, -0.3491F, 0.0F, 0.6109F);
		Head.addChild(Hair12);
		Hair12.cubeList.add(new ModelBox(Hair12, 45, 2, 5.8099F, -4.1257F, -3.2188F, 3, 6, 3, 0.0F));

		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(3.0F, -7.0F, 4.0F);
		setRotationAngle(Hair13, -0.3491F, 0.0F, -0.6109F);
		Head.addChild(Hair13);
		Hair13.cubeList.add(new ModelBox(Hair13, 45, 2, -8.8099F, -4.1257F, -2.2188F, 3, 6, 3, 0.0F));

		Hair14 = new ModelRenderer(this);
		Hair14.setRotationPoint(-3.0F, -9.0F, 1.0F);
		setRotationAngle(Hair14, -0.4363F, 0.0F, 0.0F);
		Head.addChild(Hair14);
		Hair14.cubeList.add(new ModelBox(Hair14, 38, 2, -0.9397F, 0.342F, 2.0F, 6, 6, 4, 0.0F));

		Strand1 = new ModelRenderer(this);
		Strand1.setRotationPoint(-2.0F, -10.0F, -2.0F);
		setRotationAngle(Strand1, -1.1345F, -1.2218F, 1.7453F);
		Head.addChild(Strand1);
		Strand1.cubeList.add(new ModelBox(Strand1, 38, 2, -2.417F, 1.3579F, -1.7351F, 2, 7, 2, 0.0F));

		Strand2 = new ModelRenderer(this);
		Strand2.setRotationPoint(0.0F, -10.0F, -2.0F);
		setRotationAngle(Strand2, -1.1345F, 1.2218F, -1.5708F);
		Head.addChild(Strand2);
		Strand2.cubeList.add(new ModelBox(Strand2, 38, 2, 0.417F, 2.3579F, -0.7351F, 2, 4, 2, 0.0F));

		REar = new ModelRenderer(this);
		REar.setRotationPoint(-5.0F, -4.0F, 0.0F);
		setRotationAngle(REar, 0.1745F, -0.5236F, 0.0F);
		Head.addChild(REar);
		REar.cubeList.add(new ModelBox(REar, 0, 0, -0.2F, -2.0F, -1.0F, 0, 4, 4, 0.0F));

		LEar = new ModelRenderer(this);
		LEar.setRotationPoint(3.0F, -4.0F, 0.0F);
		setRotationAngle(LEar, 0.1745F, 0.5236F, 0.0F);
		LEar.mirror = true;
		Head.addChild(LEar);
		LEar.cubeList.add(new ModelBox(LEar, 0, 0, 0.2F, -2.0F, -1.0F, 0, 4, 4, 0.0F));

		REarring = new ModelRenderer(this);
		REarring.setRotationPoint(-5.0F, -4.0F, 0.0F);
		setRotationAngle(REarring, 0.1745F, -0.5236F, 0.0F);
		Head.addChild(REarring);
		REarring.cubeList.add(new ModelBox(REarring, 50, 10, -0.5F, 1.0F, -1.0F, 0, 2, 2, 0.0F));

		LEarring = new ModelRenderer(this);
		LEarring.setRotationPoint(3.0F, -4.0F, 0.0F);
		setRotationAngle(LEarring, 0.1745F, 0.5236F, 0.0F);
		LEarring.mirror = true;
		Head.addChild(LEarring);
		LEarring.cubeList.add(new ModelBox(LEarring, 50, 10, 0.5F, 1.0F, -1.0F, 0, 2, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 41, 16, 1.0F, -2.0F, -6.0F, 3, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(3.8F, -3.4F, 0.2F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 41, 16, 4.0F, -2.0F, -6.0F, 3, 12, 4, 0.0F));
		
		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, 2.0F, 0.0F, -6.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(5.8F, 6.6F, 0.2F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -6.0F, 4, 12, 4, 0.0F));
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
