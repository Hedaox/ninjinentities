package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSalza extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Hair4;
	private final ModelRenderer Hair5;
	private final ModelRenderer Hair6;
	private final ModelRenderer Hair7;
	private final ModelRenderer Body;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelSalza(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-3.0F, -6.0F, 0.0F);
		setRotationAngle(Hair1, 0.0F, 0.0F, 0.7854F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 0, 51, -3.1768F, -2.7348F, -4.375F, 3, 4, 9, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(0.75F, -8.0625F, 0.0F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 1, 19, -4.0F, -1.7348F, -4.4375F, 6, 3, 9, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(2.75F, -8.0625F, 0.0F);
		setRotationAngle(Hair3, 0.0F, 0.0F, 0.6981F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 0, 51, -0.75F, -2.7348F, -4.4375F, 3, 4, 9, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(0.75F, -9.0625F, 0.0F);
		setRotationAngle(Hair4, 0.0F, 0.0F, 0.6981F);
		Head.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 0, 52, -0.75F, -2.7348F, -4.1875F, 3, 3, 9, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-1.25F, -9.0625F, 0.0F);
		setRotationAngle(Hair5, 0.0F, 0.0F, 0.6981F);
		Head.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 0, 52, -0.75F, -2.7348F, -4.375F, 3, 3, 9, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(0.75F, -4.0625F, -1.0F);
		setRotationAngle(Hair6, -0.1745F, 0.0F, 0.0873F);
		Head.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 0, 49, -0.75F, -5.7348F, -4.4375F, 3, 6, 0, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(0.0F, -5.5F, 3.9375F);
		setRotationAngle(Hair7, -0.0873F, 0.0F, 0.0F);
		Head.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 9, 0, -3.0F, -4.5F, -0.5F, 6, 7, 1, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 28, 28, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(5.0F, 2.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		Body.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 27, 11, -1.0F, -3.0F, -2.0F, 7, 4, 5, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.1F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 46, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.1F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 16, 40, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

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