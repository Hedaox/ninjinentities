package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelJanembaSuper extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer earleft;
	private final ModelRenderer earright;
	private final ModelRenderer HornL1;
	private final ModelRenderer HornL2;
	private final ModelRenderer HornL3;
	private final ModelRenderer HornR1;
	private final ModelRenderer HornR2;
	private final ModelRenderer HornR3;
	private final ModelRenderer Body;
	private final ModelRenderer tail;
	private final ModelRenderer neckguardleft;
	private final ModelRenderer neckguardright;
	private final ModelRenderer Tail2;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelJanembaSuper(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		earleft = new ModelRenderer(this);
		earleft.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earleft, 0.0F, -0.7695F, -0.4554F);
		Head.addChild(earleft);
		earleft.cubeList.add(new ModelBox(earleft, 44, 27, 1.6084F, -3.5F, -4.5365F, 6, 3, 0, 0.0F));

		earright = new ModelRenderer(this);
		earright.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(earright, 0.0F, 0.7695F, 0.4554F);
		Head.addChild(earright);
		earright.cubeList.add(new ModelBox(earright, 39, 18, -7.5084F, -3.5F, -4.5365F, 6, 3, 0, 0.0F));

		HornL1 = new ModelRenderer(this);
		HornL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HornL1, -0.4098F, 0.0948F, 0.403F);
		Head.addChild(HornL1);
		HornL1.cubeList.add(new ModelBox(HornL1, 0, 16, -1.9F, -10.4F, -6.0F, 3, 5, 2, 0.0F));

		HornL2 = new ModelRenderer(this);
		HornL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HornL2, -0.5918F, 0.182F, 0.4098F);
		Head.addChild(HornL2);
		HornL2.cubeList.add(new ModelBox(HornL2, 0, 0, -1.6F, -12.3F, -7.6F, 2, 4, 2, 0.0F));

		HornL3 = new ModelRenderer(this);
		HornL3.setRotationPoint(6.1375F, -13.4875F, 2.025F);
		setRotationAngle(HornL3, -0.5084F, 0.2276F, 0.9183F);
		Head.addChild(HornL3);
		HornL3.cubeList.add(new ModelBox(HornL3, 50, 50, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F));

		HornR1 = new ModelRenderer(this);
		HornR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HornR1, -0.4098F, -0.0948F, -0.403F);
		Head.addChild(HornR1);
		HornR1.cubeList.add(new ModelBox(HornR1, 0, 16, -1.1F, -10.4F, -6.0F, 3, 5, 2, 0.0F));

		HornR2 = new ModelRenderer(this);
		HornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HornR2, -0.5918F, -0.182F, -0.4098F);
		Head.addChild(HornR2);
		HornR2.cubeList.add(new ModelBox(HornR2, 0, 0, -0.4F, -12.3F, -7.6F, 2, 4, 2, 0.0F));

		HornR3 = new ModelRenderer(this);
		HornR3.setRotationPoint(-6.1375F, -13.4875F, 2.025F);
		setRotationAngle(HornR3, -0.5084F, -0.2276F, -0.9183F);
		Head.addChild(HornR3);
		HornR3.cubeList.add(new ModelBox(HornR3, 50, 50, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 24, 26, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail, -0.3491F, 0.0F, 0.0F);
		Body.addChild(tail);
		tail.cubeList.add(new ModelBox(tail, 0, 16, -2.0F, 7.0F, 3.0F, 3, 3, 11, 0.0F));

		neckguardleft = new ModelRenderer(this);
		neckguardleft.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(neckguardleft, 0.0F, 0.0F, 0.5918F);
		Body.addChild(neckguardleft);
		neckguardleft.cubeList.add(new ModelBox(neckguardleft, 44, 16, 3.0F, -4.5F, -3.6F, 2, 4, 7, 0.0F));

		neckguardright = new ModelRenderer(this);
		neckguardright.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(neckguardright, 0.0F, 0.0F, -0.5918F);
		Body.addChild(neckguardright);
		neckguardright.cubeList.add(new ModelBox(neckguardright, 41, 35, -4.9F, -4.5F, -3.6F, 2, 4, 7, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(-3.0F, 15.2F, 17.0F);
		setRotationAngle(Tail2, 0.1745F, 0.0F, 0.0F);
		Body.addChild(Tail2);
		Tail2.cubeList.add(new ModelBox(Tail2, 23, 7, 1.0F, -4.4717F, -7.8214F, 3, 2, 9, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.1F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 28, 42, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.1F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 38, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 30, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 12, 42, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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