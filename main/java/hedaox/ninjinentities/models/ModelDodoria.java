package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDodoria extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer headChild_19;
	private final ModelRenderer headChild_14;
	private final ModelRenderer headChild_18;
	private final ModelRenderer headChild_11;
	private final ModelRenderer headChild_12;
	private final ModelRenderer headChild_17;
	private final ModelRenderer headChild_20;
	private final ModelRenderer headChild_13;
	private final ModelRenderer headChild_15;
	private final ModelRenderer headChild_16;
	private final ModelRenderer Body;
	private final ModelRenderer rightarmshoulder;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelDodoria(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		headChild_19 = new ModelRenderer(this);
		headChild_19.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_19, -0.4014F, 0.0F, 0.0F);
		Head.addChild(headChild_19);
		headChild_19.cubeList.add(new ModelBox(headChild_19, 12, 32, -5.0F, -5.0F, -3.0F, 1, 3, 2, 0.0F));

		headChild_14 = new ModelRenderer(this);
		headChild_14.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headChild_14);
		headChild_14.cubeList.add(new ModelBox(headChild_14, 18, 32, -2.0F, -10.0F, -2.0F, 1, 3, 1, 0.0F));

		headChild_18 = new ModelRenderer(this);
		headChild_18.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headChild_18);
		headChild_18.cubeList.add(new ModelBox(headChild_18, 18, 32, -4.0F, -10.0F, -1.0F, 1, 3, 1, 0.0F));

		headChild_11 = new ModelRenderer(this);
		headChild_11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headChild_11);
		headChild_11.cubeList.add(new ModelBox(headChild_11, 18, 32, 0.0F, -10.0F, 0.0F, 1, 3, 1, 0.0F));

		headChild_12 = new ModelRenderer(this);
		headChild_12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headChild_12);
		headChild_12.cubeList.add(new ModelBox(headChild_12, 18, 32, 3.0F, -10.0F, 1.0F, 1, 3, 1, 0.0F));

		headChild_17 = new ModelRenderer(this);
		headChild_17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headChild_17);
		headChild_17.cubeList.add(new ModelBox(headChild_17, 18, 32, -1.0F, -10.0F, -4.0F, 1, 3, 1, 0.0F));

		headChild_20 = new ModelRenderer(this);
		headChild_20.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(headChild_20, -0.4014F, 0.0F, 0.0F);
		Head.addChild(headChild_20);
		headChild_20.cubeList.add(new ModelBox(headChild_20, 12, 32, 4.0F, -5.0F, -3.0F, 1, 3, 2, 0.0F));

		headChild_13 = new ModelRenderer(this);
		headChild_13.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headChild_13);
		headChild_13.cubeList.add(new ModelBox(headChild_13, 18, 32, 2.0F, -10.0F, -3.0F, 1, 3, 1, 0.0F));

		headChild_15 = new ModelRenderer(this);
		headChild_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headChild_15);
		headChild_15.cubeList.add(new ModelBox(headChild_15, 18, 32, -3.0F, -10.0F, 2.0F, 1, 3, 1, 0.0F));

		headChild_16 = new ModelRenderer(this);
		headChild_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headChild_16);
		headChild_16.cubeList.add(new ModelBox(headChild_16, 18, 32, 1.0F, -10.0F, 3.0F, 1, 3, 1, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 1.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.1F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.995F, -1.9002F, -2.0F, 4, 12, 4, 0.0F));

		rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
		RArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 40, 32, -6.995F, -2.9002F, -3.0F, 7, 4, 6, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.1F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, -0.005F, -1.9002F, -2.0F, 4, 12, 4, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.mirror = true;
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 40, 32, -0.005F, -2.9002F, -3.0F, 7, 4, 6, 0.0F));

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