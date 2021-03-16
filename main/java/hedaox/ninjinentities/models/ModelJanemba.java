package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelJanemba extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Head2;
	private final ModelRenderer lefteyebrow;
	private final ModelRenderer righteyebrow;
	private final ModelRenderer leftear;
	private final ModelRenderer rightear;
	private final ModelRenderer Body;
	private final ModelRenderer HoleL1;
	private final ModelRenderer HoleR1;
	private final ModelRenderer UpperBody;
	private final ModelRenderer Breasts;
	private final ModelRenderer JunkSide;
	private final ModelRenderer Ass;
	private final ModelRenderer HoleL2;
	private final ModelRenderer HoleL3;
	private final ModelRenderer HoleR2;
	private final ModelRenderer HoleR3;
	private final ModelRenderer Tail1;
	private final ModelRenderer Tail2;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer leg_1;
	private final ModelRenderer rightfoot;
	private final ModelRenderer LLeg;
	private final ModelRenderer leg_2;
	private final ModelRenderer leftfoot;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelJanemba(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -16.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 66, 0, -4.9F, -4.0F, -4.5F, 10, 4, 10, 0.0F));

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Head2);
		Head2.cubeList.add(new ModelBox(Head2, 70, 81, -4.0F, -8.0F, -3.5F, 8, 8, 8, 0.0F));

		lefteyebrow = new ModelRenderer(this);
		lefteyebrow.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(lefteyebrow, 0.0F, -0.5463F, -0.4554F);
		Head.addChild(lefteyebrow);
		lefteyebrow.cubeList.add(new ModelBox(lefteyebrow, 10, 6, 2.1F, -7.9F, -4.1F, 4, 1, 1, 0.0F));

		righteyebrow = new ModelRenderer(this);
		righteyebrow.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(righteyebrow, 0.0F, 0.5463F, 0.4554F);
		Head.addChild(righteyebrow);
		righteyebrow.cubeList.add(new ModelBox(righteyebrow, 12, 3, -6.0F, -8.0F, -4.0F, 4, 1, 1, 0.0F));

		leftear = new ModelRenderer(this);
		leftear.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftear, 0.0F, -0.5463F, -0.4554F);
		Head.addChild(leftear);
		leftear.cubeList.add(new ModelBox(leftear, 12, 0, 4.0F, -4.0F, -1.0F, 5, 3, 0, 0.0F));

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightear, 0.0F, 0.5463F, 0.4554F);
		Head.addChild(rightear);
		rightear.cubeList.add(new ModelBox(rightear, 0, 12, -9.0F, -4.4F, -1.6F, 5, 3, 0, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -11.2F, -8.0F, -10.4F, 22, 18, 22, 0.0F));

		HoleL1 = new ModelRenderer(this);
		HoleL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(HoleL1);
		HoleL1.cubeList.add(new ModelBox(HoleL1, 0, 121, 5.0F, -17.0F, -2.0F, 4, 1, 4, 0.0F));

		HoleR1 = new ModelRenderer(this);
		HoleR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(HoleR1);
		HoleR1.cubeList.add(new ModelBox(HoleR1, 0, 121, -9.0F, -17.0F, -2.0F, 4, 1, 4, 0.0F));

		UpperBody = new ModelRenderer(this);
		UpperBody.setRotationPoint(0.0F, -17.1F, 1.2F);
		Body.addChild(UpperBody);
		UpperBody.cubeList.add(new ModelBox(UpperBody, 0, 40, -9.6F, 1.0F, -8.9F, 19, 8, 17, 0.0F));

		Breasts = new ModelRenderer(this);
		Breasts.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Breasts, -0.4098F, 0.0F, 0.0F);
		Body.addChild(Breasts);
		Breasts.cubeList.add(new ModelBox(Breasts, 55, 40, -9.0F, -11.0F, -12.5F, 18, 6, 7, 0.0F));

		JunkSide = new ModelRenderer(this);
		JunkSide.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(JunkSide, 0.4554F, 0.0F, 0.0F);
		Body.addChild(JunkSide);
		JunkSide.cubeList.add(new ModelBox(JunkSide, 58, 58, -10.6F, 4.5F, -13.5F, 21, 9, 14, 0.0F));

		Ass = new ModelRenderer(this);
		Ass.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Ass);
		Ass.cubeList.add(new ModelBox(Ass, 0, 67, -10.6F, 9.0F, -6.3F, 21, 9, 14, 0.0F));

		HoleL2 = new ModelRenderer(this);
		HoleL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HoleL2, 0.0F, 0.0F, 0.7285F);
		Body.addChild(HoleL2);
		HoleL2.cubeList.add(new ModelBox(HoleL2, 0, 0, 0.0F, -7.0F, -12.0F, 4, 4, 2, 0.0F));

		HoleL3 = new ModelRenderer(this);
		HoleL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HoleL3, 0.0F, 0.0F, 0.7285F);
		Body.addChild(HoleL3);
		HoleL3.cubeList.add(new ModelBox(HoleL3, 0, 6, 5.5F, -1.0F, -12.0F, 4, 4, 2, 0.0F));

		HoleR2 = new ModelRenderer(this);
		HoleR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HoleR2, 0.0F, 0.0F, -0.7285F);
		Body.addChild(HoleR2);
		HoleR2.cubeList.add(new ModelBox(HoleR2, 0, 0, -4.0F, -7.0F, -12.0F, 4, 4, 2, 0.0F));

		HoleR3 = new ModelRenderer(this);
		HoleR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HoleR3, 0.0F, 0.0F, -0.7285F);
		Body.addChild(HoleR3);
		HoleR3.cubeList.add(new ModelBox(HoleR3, 0, 6, -9.5F, -1.0F, -12.0F, 4, 4, 2, 0.0F));


		Tail1 = new ModelRenderer(this);
		Tail1.setRotationPoint(-3.0F, 4.3F, 13.0F);
		setRotationAngle(Tail1, -0.1745F, 0.0F, 0.0F);
		Body.addChild(Tail1);
		Tail1.cubeList.add(new ModelBox(Tail1, 92, 109, 0.0F, 0.0F, -2.0F, 5, 5, 13, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(-3.0F, 5.2F, 21.0F);
		setRotationAngle(Tail2, 0.1745F, 0.0F, 0.0F);
		Body.addChild(Tail2);
		Tail2.cubeList.add(new ModelBox(Tail2, 97, 112, 0.0F, 0.9848F, -0.1736F, 5, 5, 10, 0.0F));
		
		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-9.0F, -16.0F, 0.0F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.4887F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 88, 14, -6.0F, 0.0F, -3.0F, 6, 18, 6, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(10.0F, -16.0F, 0.0F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.4887F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 90, -1.0F, 0.0F, -3.0F, 6, 17, 6, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.0F, 24.0F, 0.0F);
		Body.addChild(RLeg);

		leg_1 = new ModelRenderer(this);
		leg_1.setRotationPoint(-3.3F, -5.8F, 0.0F);
		RLeg.addChild(leg_1);
		leg_1.cubeList.add(new ModelBox(leg_1, 94, 94, -4.1F, 0.0F, -4.4F, 8, 3, 8, 0.0F));

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(-1.3F, -29.8F, 0.0F);
		setRotationAngle(rightfoot, 0.0F, 0.4363F, 0.0F);
		RLeg.addChild(rightfoot);
		rightfoot.cubeList.add(new ModelBox(rightfoot, 95, 43, -4.2289F, 27.0F, -7.5163F, 5, 3, 10, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 24.0F, 0.0F);
		Body.addChild(LLeg);

		leg_2 = new ModelRenderer(this);
		leg_2.setRotationPoint(3.3F, -5.8F, 0.0F);
		LLeg.addChild(leg_2);
		leg_2.mirror = true;
		leg_2.cubeList.add(new ModelBox(leg_2, 94, 94, -3.9F, 0.0F, -4.4F, 8, 3, 8, 0.0F));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(1.3F, -29.8F, 0.0F);
		setRotationAngle(leftfoot, 0.0F, -0.4363F, 0.0F);
		LLeg.addChild(leftfoot);
		leftfoot.mirror = true;
		leftfoot.cubeList.add(new ModelBox(leftfoot, 95, 43, -0.7711F, 27.0F, -7.5163F, 5, 3, 10, 0.0F));
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