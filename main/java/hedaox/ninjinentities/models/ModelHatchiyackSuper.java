package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelHatchiyackSuper extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Crown1;
	private final ModelRenderer Crown2_1;
	private final ModelRenderer Crown2;
	private final ModelRenderer Crowngem;
	private final ModelRenderer Body;
	private final ModelRenderer bodyChild_1;
	private final ModelRenderer bodyChild_3;
	private final ModelRenderer bodyChild_2;
	private final ModelRenderer bodyChild;
	private final ModelRenderer RArm;
	private final ModelRenderer bone3;
	private final ModelRenderer rightarmshoulder;
	private final ModelRenderer LArm;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RLeg;
	private final ModelRenderer bone;
	private final ModelRenderer LLeg;
	private final ModelRenderer bone2;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelHatchiyackSuper(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Crown1 = new ModelRenderer(this);
		Crown1.setRotationPoint(0.5F, -0.9F, -4.2F);
		setRotationAngle(Crown1, -0.6981F, 0.0F, 0.0F);
		Head.addChild(Crown1);
		Crown1.cubeList.add(new ModelBox(Crown1, 48, 9, -4.0F, -10.4088F, -3.8767F, 7, 5, 1, 0.5F));

		Crown2_1 = new ModelRenderer(this);
		Crown2_1.setRotationPoint(-1.9F, -0.8F, -1.0F);
		setRotationAngle(Crown2_1, 0.0F, 0.0F, 1.3271F);
		Head.addChild(Crown2_1);
		Crown2_1.cubeList.add(new ModelBox(Crown2_1, 20, 34, -5.9409F, -6.4826F, -4.0F, 1, 3, 1, 0.5F));

		Crown2 = new ModelRenderer(this);
		Crown2.setRotationPoint(3.5F, -7.5F, -1.0F);
		setRotationAngle(Crown2, 0.0F, 0.0F, -1.3273F);
		Head.addChild(Crown2);
		Crown2.cubeList.add(new ModelBox(Crown2, 20, 30, -2.059F, -6.4822F, -4.0F, 1, 3, 1, 0.5F));

		Crowngem = new ModelRenderer(this);
		Crowngem.setRotationPoint(3.5F, -0.9F, -4.7F);
		setRotationAngle(Crowngem, -0.6894F, 0.0F, 0.0F);
		Head.addChild(Crowngem);
		Crowngem.cubeList.add(new ModelBox(Crowngem, 32, 54, -4.5F, -9.5433F, -5.2721F, 2, 3, 1, 0.3F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -5.0F, 0.0F, -2.0F, 10, 5, 5, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 71, -4.0F, 0.0F, -3.0F, 8, 5, 5, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 26, -3.0F, 5.0F, -3.0F, 1, 3, 1, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 16, 2.0F, 5.0F, -3.0F, 1, 3, 1, 0.0F));

		bodyChild_1 = new ModelRenderer(this);
		bodyChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(bodyChild_1);
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 46, 19, -3.5F, 5.0F, -2.0F, 7, 7, 4, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 55, 38, 3.0F, 8.0F, -2.0F, 1, 2, 4, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 54, 0, -4.0F, 8.0F, -2.0F, 1, 2, 4, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 46, 52, -4.0F, 8.0F, -3.0F, 8, 2, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 24, 4, -3.0F, 10.0F, -3.0F, 6, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 52, 30, -2.0F, 11.0F, -3.0F, 4, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 0, 6, -1.0F, 5.0F, -3.0F, 2, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 12, 43, -1.0F, 1.0F, -4.0F, 2, 3, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 24, 2, -3.0F, 5.0F, 2.0F, 6, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 28, 52, -2.0F, 6.0F, 2.0F, 4, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 20, 26, -2.0F, 11.0F, 2.0F, 4, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 24, 0, -3.0F, 10.0F, 2.0F, 6, 1, 1, 0.0F));
		bodyChild_1.cubeList.add(new ModelBox(bodyChild_1, 50, 35, -4.0F, 8.0F, 2.0F, 8, 2, 1, 0.0F));

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
		RArm.cubeList.add(new ModelBox(RArm, 20, 35, -5.0F, -2.0F, -2.0F, 5, 12, 5, 0.0F));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.0F, 22.0F, 0.0F);
		RArm.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 50, 62, -10.3522F, -16.6322F, -0.8067F, 1, 3, 2, 0.0F));
		bone3.cubeList.add(new ModelBox(bone3, 40, 40, -11.1487F, -17.7562F, -3.0406F, 4, 5, 7, 0.0F));
		bone3.cubeList.add(new ModelBox(bone3, 52, 32, -10.6683F, -18.6186F, -0.8988F, 1, 1, 2, 0.0F));
		bone3.cubeList.add(new ModelBox(bone3, 40, 40, -11.3491F, -16.5532F, -0.8048F, 1, 3, 2, 0.0F));

		rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(0.0F, 0.0F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		RArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 32, 0, -8.0F, -2.8398F, -1.9984F, 8, 3, 6, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 30, 19, -7.0F, -3.595F, -1.0654F, 6, 1, 3, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LArm, 0.0231F, 0.0F, -0.0791F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 26, 0.0F, -2.0F, -2.0F, 5, 12, 5, 0.0F));
		LArm.cubeList.add(new ModelBox(LArm, 0, 59, 4.3491F, 5.4468F, -1.1952F, 1, 3, 3, 0.0F));
		LArm.cubeList.add(new ModelBox(LArm, 32, 52, 2.0F, 4.1648F, -2.9576F, 4, 5, 6, 0.0F));
		LArm.cubeList.add(new ModelBox(LArm, 15, 26, 4.6652F, 3.4604F, -1.1031F, 1, 1, 3, 0.0F));
		LArm.cubeList.add(new ModelBox(LArm, 0, 0, 5.346F, 5.5258F, -1.197F, 1, 3, 3, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 26, 10, 0.0815F, -2.7938F, -2.0021F, 8, 3, 6, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 35, 35, 1.0F, -3.4169F, -0.9364F, 6, 1, 3, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 43, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 54, 15, -1.0F, 7.0F, -3.0F, 2, 3, 1, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 8, 59, -3.0F, 4.0F, -1.0F, 1, 3, 2, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(2.0F, 13.0F, 0.0F);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		RLeg.addChild(bone);

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 16, 52, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 60, 0, -1.0F, 7.0F, -3.0F, 2, 3, 1, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 60, 30, 2.0F, 4.0F, -1.0F, 1, 3, 2, 0.0F));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 13.0F, 0.0F);
		setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
		LLeg.addChild(bone2);
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