package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDore extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer HeadGear;
	private final ModelRenderer Body;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Hair4;
	private final ModelRenderer Hair5;
	private final ModelRenderer Hair6;
	private final ModelRenderer Hair7;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelDore(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		HeadGear = new ModelRenderer(this);
		HeadGear.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(HeadGear);
		HeadGear.cubeList.add(new ModelBox(HeadGear, 32, 44, -4.0F, -8.0F, -4.0F, 8, 7, 8, 0.5F));

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
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 46, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 16, 40, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 48, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(1.0F, 0.0F, 3.0F);
		setRotationAngle(Hair1, 0.3491F, 0.0F, 0.0F);
		Body.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 5, 18, -5.0F, -1.1496F, -0.4111F, 8, 11, 2, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(3.1875F, 0.9375F, 3.0F);
		setRotationAngle(Hair2, 0.3491F, -0.2618F, 0.7854F);
		Body.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 7, 24, -3.0F, -1.1496F, -0.4111F, 6, 3, 2, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(3.1875F, 5.9375F, 5.0F);
		setRotationAngle(Hair3, 0.3491F, -0.2618F, 0.7854F);
		Body.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 7, 22, -3.0F, -1.1496F, -0.4111F, 6, 7, 2, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(-3.1875F, 0.9375F, 3.0F);
		setRotationAngle(Hair4, 0.3491F, 0.2618F, -0.7854F);
		Body.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 7, 24, -3.0F, -1.1496F, -0.4111F, 6, 3, 2, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-3.1875F, 5.9375F, 5.0F);
		setRotationAngle(Hair5, 0.3491F, 0.2618F, -0.7854F);
		Body.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 7, 21, -3.0F, -1.1496F, -0.4111F, 6, 7, 2, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(-0.1875F, 0.9375F, 4.0F);
		setRotationAngle(Hair6, 0.0F, 0.6109F, -1.5708F);
		Body.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 5, 21, -3.0F, -2.1496F, -2.4111F, 6, 6, 4, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(-0.1875F, 5.9375F, 6.0F);
		setRotationAngle(Hair7, 0.0F, 0.6109F, -1.5708F);
		Body.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 6, 22, -3.0F, -2.1496F, -1.4111F, 6, 6, 3, 0.0F));
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