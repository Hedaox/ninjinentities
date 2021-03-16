package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelNeiz extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer EyeBrowsL;
	private final ModelRenderer EyeBrowsR;
	private final ModelRenderer EarR;
	private final ModelRenderer EarL;
	private final ModelRenderer ScouterScreen;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelNeiz(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 2, -4.0F, -6.0F, -4.0F, 8, 6, 8, 0.0F));

		EyeBrowsL = new ModelRenderer(this);
		EyeBrowsL.setRotationPoint(0.5625F, -4.125F, -5.0F);
		setRotationAngle(EyeBrowsL, 0.0F, 0.0F, -0.1745F);
		Head.addChild(EyeBrowsL);
		EyeBrowsL.mirror = true;
		EyeBrowsL.cubeList.add(new ModelBox(EyeBrowsL, 24, 7, 0.0F, -2.0F, 0.8125F, 3, 2, 1, 0.0F));

		EyeBrowsR = new ModelRenderer(this);
		EyeBrowsR.setRotationPoint(-0.5625F, -4.125F, -5.0F);
		setRotationAngle(EyeBrowsR, 0.0F, 0.0F, 0.1745F);
		Head.addChild(EyeBrowsR);
		EyeBrowsR.cubeList.add(new ModelBox(EyeBrowsR, 24, 7, -3.0F, -2.0F, 0.8125F, 3, 2, 1, 0.0F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(-4.0F, -3.0F, -3.0F);
		setRotationAngle(EarR, 0.0F, -0.6109F, 0.0F);
		Head.addChild(EarR);
		EarR.cubeList.add(new ModelBox(EarR, 0, 2, 0.0F, -4.0F, 0.0F, 0, 4, 4, 0.0F));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(5.0F, -4.0F, -3.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 0, 0, -1.0F, -2.0F, 0.0F, 1, 3, 2, 0.0F));

		ScouterScreen = new ModelRenderer(this);
		ScouterScreen.setRotationPoint(4.375F, -3.375F, -3.0F);
		setRotationAngle(ScouterScreen, 0.0F, -1.5708F, 0.0F);
		Head.addChild(ScouterScreen);
		ScouterScreen.cubeList.add(new ModelBox(ScouterScreen, 26, 2, -1.8125F, -1.6476F, -0.1283F, 2, 2, 3, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 28, 28, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 46, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 16, 40, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 27, 11, -1.0F, -3.0F, -2.0F, 7, 4, 5, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 32, 44, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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