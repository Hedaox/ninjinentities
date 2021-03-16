package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelEbifurya extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Hair;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Hair4;
	private final ModelRenderer Hair5;
	private final ModelRenderer EarL;
	private final ModelRenderer EarR;
	private final ModelRenderer PonyTail;
	private final ModelRenderer PT1;
	private final ModelRenderer PT2;
	private final ModelRenderer PT3;
	private final ModelRenderer PT4;
	private final ModelRenderer PT5;
	private final ModelRenderer PT6;
	private final ModelRenderer PT7;
	private final ModelRenderer PT8;
	private final ModelRenderer Body;
	private final ModelRenderer Armor;
	private final ModelRenderer bodyChild_1;
	private final ModelRenderer bodyChild_3;
	private final ModelRenderer bodyChild_2;
	private final ModelRenderer bodyChild;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelEbifurya(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, 1.0F, -3.0F);
		Head.addChild(Hair);

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 43, 16, -1.0F, -5.0152F, 7.8263F, 2, 2, 0, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 47, 47, -1.0F, -11.8264F, 6.9848F, 2, 7, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 24, 22, -1.0F, -12.8264F, -1.0152F, 2, 4, 8, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 42, 13, -1.0F, -10.8264F, -1.0152F, 2, 2, 9, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Hair.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 49, 20, -1.0F, -10.8264F, 5.9848F, 2, 6, 2, 0.0F));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarL, 0.0F, 0.5236F, 0.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 0, 52, 4.0F, -7.0F, -1.0F, 0, 6, 6, 0.0F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarR, 0.0F, -0.5236F, 0.0F);
		Head.addChild(EarR);
		EarR.cubeList.add(new ModelBox(EarR, 0, 52, -4.0F, -7.0F, -1.0F, 0, 6, 6, 0.0F));

		PonyTail = new ModelRenderer(this);
		PonyTail.setRotationPoint(0.0F, 23.3125F, 0.4375F);
		Head.addChild(PonyTail);

		PT1 = new ModelRenderer(this);
		PT1.setRotationPoint(0.0F, -24.7582F, 4.5047F);
		setRotationAngle(PT1, 0.1745F, 0.0F, 0.0F);
		PonyTail.addChild(PT1);
		PT1.cubeList.add(new ModelBox(PT1, 43, 18, -1.0F, -0.5F, -0.5F, 2, 9, 1, 0.0F));

		PT2 = new ModelRenderer(this);
		PT2.setRotationPoint(0.125F, -24.7582F, 4.5047F);
		setRotationAngle(PT2, 0.1745F, 0.0F, -0.2618F);
		PonyTail.addChild(PT2);
		PT2.cubeList.add(new ModelBox(PT2, 43, 18, -1.0F, -0.5F, -0.5F, 2, 8, 1, 0.0F));

		PT3 = new ModelRenderer(this);
		PT3.setRotationPoint(-0.125F, -24.7582F, 4.5047F);
		setRotationAngle(PT3, 0.1745F, 0.0F, 0.2618F);
		PonyTail.addChild(PT3);
		PT3.cubeList.add(new ModelBox(PT3, 43, 18, -1.0F, -0.5F, -0.5F, 2, 6, 1, 0.0F));

		PT4 = new ModelRenderer(this);
		PT4.setRotationPoint(0.0F, -24.7582F, 4.5047F);
		setRotationAngle(PT4, 0.3491F, 0.0F, 0.0F);
		PonyTail.addChild(PT4);
		PT4.cubeList.add(new ModelBox(PT4, 43, 18, -1.0F, -0.5F, -0.5F, 2, 7, 1, 0.0F));

		PT5 = new ModelRenderer(this);
		PT5.setRotationPoint(0.0F, -24.7582F, 4.5047F);
		setRotationAngle(PT5, 0.0F, 0.0F, 0.1745F);
		PonyTail.addChild(PT5);
		PT5.cubeList.add(new ModelBox(PT5, 43, 18, -1.0F, -0.5F, -0.5F, 2, 8, 1, 0.0F));

		PT6 = new ModelRenderer(this);
		PT6.setRotationPoint(0.125F, -24.7582F, 4.5047F);
		setRotationAngle(PT6, 0.1745F, 0.0F, -0.5236F);
		PonyTail.addChild(PT6);
		PT6.cubeList.add(new ModelBox(PT6, 43, 18, -1.0F, -0.5F, -0.5F, 2, 6, 1, 0.0F));

		PT7 = new ModelRenderer(this);
		PT7.setRotationPoint(-0.125F, -24.7582F, 4.5047F);
		setRotationAngle(PT7, 0.1745F, 0.0F, 0.5236F);
		PonyTail.addChild(PT7);
		PT7.cubeList.add(new ModelBox(PT7, 43, 18, -1.0F, -0.5F, -0.5F, 2, 5, 1, 0.0F));

		PT8 = new ModelRenderer(this);
		PT8.setRotationPoint(0.0F, -24.7582F, 4.5047F);
		setRotationAngle(PT8, 0.5236F, 0.0F, 0.0F);
		PonyTail.addChild(PT8);
		PT8.cubeList.add(new ModelBox(PT8, 43, 18, -1.0F, -0.5F, -0.5F, 2, 4, 1, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		Armor = new ModelRenderer(this);
		Armor.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Armor);

		bodyChild_1 = new ModelRenderer(this);
		bodyChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Armor.addChild(bodyChild_1);

		bodyChild_3 = new ModelRenderer(this);
		bodyChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_3, 0.5236F, 0.0F, 0.0F);
		Armor.addChild(bodyChild_3);

		bodyChild_2 = new ModelRenderer(this);
		bodyChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_2, -0.3491F, 0.0F, 0.0F);
		Armor.addChild(bodyChild_2);

		bodyChild = new ModelRenderer(this);
		bodyChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild, -0.1745F, 0.0F, 0.0F);
		Armor.addChild(bodyChild);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.1745F);
		Armor.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 24, 0, 4.0F, -3.0F, -2.0F, 1, 3, 1, 0.0F));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 4.0F);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.1745F);
		Armor.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 16, 4.0F, -3.0F, -3.0F, 1, 3, 1, 0.0F));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.1745F);
		Armor.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 3, 3, -5.0F, -3.0F, -2.0F, 1, 3, 1, 0.0F));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -5.0F, -3.0F, 2.0F, 1, 3, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 0, 37, -3.0031F, -2.079F, -2.0018F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 32, 0, -0.9938F, -2.158F, -1.9964F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 18, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 34, 34, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
