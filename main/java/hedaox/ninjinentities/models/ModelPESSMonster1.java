package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelPESSMonster1 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer HornL;
	private final ModelRenderer HornR;
	private final ModelRenderer Hair;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Hair4;
	private final ModelRenderer Hair5;
	private final ModelRenderer Hair6;
	private final ModelRenderer Hair7;
	private final ModelRenderer Body;
	private final ModelRenderer bodyChild_1;
	private final ModelRenderer bodyChild_3;
	private final ModelRenderer bodyChild_2;
	private final ModelRenderer bodyChild;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelPESSMonster1(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		HornL = new ModelRenderer(this);
		HornL.setRotationPoint(-1.0F, 25.0F, -2.0F);
		setRotationAngle(HornL, 0.0F, 0.0F, 0.1745F);
		Head.addChild(HornL);
		HornL.cubeList.add(new ModelBox(HornL, 0, 0, -1.9848F, -36.8264F, 0.0F, 1, 4, 1, 0.0F));

		HornR = new ModelRenderer(this);
		HornR.setRotationPoint(1.0F, 25.0F, -2.0F);
		setRotationAngle(HornR, 0.0F, 0.0F, -0.1745F);
		Head.addChild(HornR);
		HornR.mirror = true;
		HornR.cubeList.add(new ModelBox(HornR, 0, 0, 0.9848F, -36.8264F, 0.0F, 1, 4, 1, 0.0F));

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 1.0F, 7.0F);
		setRotationAngle(Hair, 0.3491F, 0.0F, 0.0F);
		Head.addChild(Hair);

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(0.0F, -2.0F, -1.0F);
		Hair.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 108, 19, -4.0F, -4.786F, -0.76F, 8, 11, 2, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-3.0625F, -0.6875F, -1.0F);
		setRotationAngle(Hair2, 0.0F, 0.0F, 0.5236F);
		Hair.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 114, 24, -4.0F, -4.786F, -0.76F, 5, 5, 2, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(3.0625F, -0.6875F, -1.0F);
		setRotationAngle(Hair3, 0.0F, 0.0F, -0.5236F);
		Hair.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 114, 23, -1.0F, -4.786F, -0.76F, 5, 5, 2, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(-1.75F, -3.25F, -1.0F);
		setRotationAngle(Hair4, 0.0F, 0.0F, -1.9199F);
		Hair.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 104, 27, -9.1875F, -4.8447F, -0.76F, 10, 5, 2, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(1.75F, -3.25F, -1.0F);
		setRotationAngle(Hair5, 0.0F, 0.0F, 1.9199F);
		Hair.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 104, 26, -0.9786F, -4.8447F, -0.76F, 10, 5, 2, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(0.0F, -2.342F, -0.9397F);
		setRotationAngle(Hair6, 0.1745F, 0.0F, 0.0F);
		Hair.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 114, 21, -3.0F, -4.0F, 0.0F, 6, 11, 1, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(0.0F, -6.5924F, -0.9224F);
		setRotationAngle(Hair7, 0.1745F, 0.0F, 0.0F);
		Hair.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 110, 26, -4.0F, -1.0F, 0.0F, 8, 8, 1, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 64, 0, -5.0F, 0.0F, -2.0F, 10, 5, 5, 0.0F));

		bodyChild_1 = new ModelRenderer(this);
		bodyChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(bodyChild_1);
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 16, 16, -3.5F, 5.0F, -2.0F, 7, 7, 4, 0.0F));

		bodyChild_3 = new ModelRenderer(this);
		bodyChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_3, 0.5236F, 0.0F, 0.0F);
		Body.addChild(bodyChild_3);

		bodyChild_2 = new ModelRenderer(this);
		bodyChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_2, -0.3491F, 0.0F, 0.0F);
		Body.addChild(bodyChild_2);

		bodyChild = new ModelRenderer(this);
		bodyChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild, -0.1745F, 0.0F, 0.0F);
		Body.addChild(bodyChild);

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RArm, -0.0231F, 0.0F, 0.0791F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 5, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LArm, 0.0231F, 0.0F, -0.0791F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 5, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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