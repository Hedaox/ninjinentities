package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBojack extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer EarR;
	private final ModelRenderer EarL;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Hair8;
	private final ModelRenderer Hair9;
	private final ModelRenderer Hair12;
	private final ModelRenderer Hair13;
	private final ModelRenderer Hair14;
	private final ModelRenderer Hair15;
	private final ModelRenderer BandanaStripR;
	private final ModelRenderer BandanaStripL;
	private final ModelRenderer Body;
	private final ModelRenderer bb_main;
	private final ModelRenderer RArm;
	private final ModelRenderer bone;
	private final ModelRenderer LArm;
	private final ModelRenderer bone2;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelBojack(float _scaleX, float _scaleY, float _scaleZ) {

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
		Head.addChild(EarR);
		EarR.mirror = true;
		EarR.cubeList.add(new ModelBox(EarR, 61, 27, -4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarL, 0.0F, 0.5236F, 0.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 61, 27, 4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-2.0F, 0.0F, 5.5F);
		setRotationAngle(Hair2, 0.2618F, 0.0F, 0.6109F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 0, 18, -3.7208F, -2.448F, -2.2857F, 8, 4, 2, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(2.0F, 0.0F, 5.5F);
		setRotationAngle(Hair3, 0.2618F, 0.0F, -0.6109F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 0, 18, -4.2792F, -2.448F, -2.2857F, 8, 4, 2, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(2.0F, -1.0F, 5.5F);
		setRotationAngle(Hair8, 0.349F, 0.0F, 0.0F);
		Head.addChild(Hair8);
		Hair8.cubeList.add(new ModelBox(Hair8, 0, 16, -6.0F, -3.0F, -2.5F, 8, 7, 3, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(2.0F, 5.0F, 6.5F);
		setRotationAngle(Hair9, 0.0873F, 0.0F, 0.0F);
		Head.addChild(Hair9);
		Hair9.cubeList.add(new ModelBox(Hair9, 0, 16, -6.0F, -3.0F, -2.5F, 8, 7, 3, 0.0F));

		Hair12 = new ModelRenderer(this);
		Hair12.setRotationPoint(-2.0F, 0.0F, 6.5F);
		setRotationAngle(Hair12, 0.0873F, 0.0F, 0.6109F);
		Head.addChild(Hair12);
		Hair12.cubeList.add(new ModelBox(Hair12, 0, 18, -2.0F, 0.0F, -2.5F, 8, 4, 2, 0.0F));

		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(2.0F, 0.0F, 6.5F);
		setRotationAngle(Hair13, 0.0873F, 0.0F, -0.6109F);
		Head.addChild(Hair13);
		Hair13.cubeList.add(new ModelBox(Hair13, 0, 18, -6.0F, 0.0F, -2.5F, 8, 4, 2, 0.0F));

		Hair14 = new ModelRenderer(this);
		Hair14.setRotationPoint(2.0F, 5.0F, 7.5F);
		setRotationAngle(Hair14, 0.0873F, 0.0F, -0.6109F);
		Head.addChild(Hair14);
		Hair14.cubeList.add(new ModelBox(Hair14, 0, 17, -6.0F, 0.0F, -3.5F, 8, 4, 3, 0.0F));

		Hair15 = new ModelRenderer(this);
		Hair15.setRotationPoint(-2.0F, 5.0F, 7.5F);
		setRotationAngle(Hair15, 0.0873F, 0.0F, 0.6109F);
		Head.addChild(Hair15);
		Hair15.cubeList.add(new ModelBox(Hair15, 0, 17, -2.0F, 0.0F, -3.5F, 8, 4, 3, 0.0F));

		BandanaStripR = new ModelRenderer(this);
		BandanaStripR.setRotationPoint(0.0F, -4.0F, 4.0F);
		setRotationAngle(BandanaStripR, 0.0F, 0.0F, -0.3491F);
		Head.addChild(BandanaStripR);
		BandanaStripR.cubeList.add(new ModelBox(BandanaStripR, 8, 11, -7.0F, -2.0F, 0.0F, 7, 2, 0, 0.0F));

		BandanaStripL = new ModelRenderer(this);
		BandanaStripL.setRotationPoint(0.0F, -4.0F, 4.0F);
		setRotationAngle(BandanaStripL, 0.0F, 0.0F, 0.3491F);
		Head.addChild(BandanaStripL);
		BandanaStripL.mirror = true;
		BandanaStripL.cubeList.add(new ModelBox(BandanaStripL, 8, 11, 0.0F, -2.0F, 0.0F, 7, 2, 0, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 40, 0, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(-0.2F, 18.6F, 0.2F);
		Body.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 32, -4.5F, -13.6F, -2.4F, 9, 10, 5, 0.0F));

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