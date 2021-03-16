package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelHirudegarnBottom extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Bone;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail2;
	private final ModelRenderer bodyChildChild;
	private final ModelRenderer Portal;
	private final ModelRenderer RLeg;
	private final ModelRenderer RLeg2;
	private final ModelRenderer LLeg;
	private final ModelRenderer LeftLeg3;

	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelHirudegarnBottom(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 256;
		textureHeight = 256;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 15.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 102, 29, -7.0F, -34.0F, -4.0F, 14, 5, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 98, 106, -6.0F, -29.0F, -4.0F, 12, 7, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 137, -2.0F, -23.0F, -4.0F, 4, 3, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 58, 131, -3.0F, -20.0F, -4.0F, 6, 3, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 120, -9.0F, -26.0F, -5.0F, 7, 7, 10, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 117, 42, 2.0F, -26.0F, -5.0F, 7, 7, 10, 0.0F));

		Bone = new ModelRenderer(this);
		Bone.setRotationPoint(2.0F, -48.0F, -4.0F);
		Body.addChild(Bone);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -15.0F, 0.0F);
		setRotationAngle(Tail, -0.3491F, 0.0F, 0.0F);
		Body.addChild(Tail);
		Tail.cubeList.add(new ModelBox(Tail, 210, 54, -3.0F, -10.0611F, 1.3468F, 6, 5, 17, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, -17.0F, 0.0F);
		setRotationAngle(Tail2, 0.5236F, 0.0F, 0.0F);
		Body.addChild(Tail2);
		Tail2.cubeList.add(new ModelBox(Tail2, 204, 0, -3.0F, 7.5096F, 14.4904F, 6, 5, 20, 0.0F));

		bodyChildChild = new ModelRenderer(this);
		bodyChildChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail2.addChild(bodyChildChild);
		bodyChildChild.cubeList.add(new ModelBox(bodyChildChild, 227, 56, -2.0F, 8.6436F, 34.8564F, 4, 3, 6, 0.0F));

		Portal = new ModelRenderer(this);
		Portal.setRotationPoint(0.0F, 9.0F, 0.0F);
		Body.addChild(Portal);
		Portal.cubeList.add(new ModelBox(Portal, 44, 221, -26.0F, -44.0F, -15.0F, 50, 1, 30, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-7.0F, -18.0F, -1.0F);
		setRotationAngle(RLeg, -0.1309F, 0.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 97, 121, -3.0F, -1.388F, -2.3382F, 6, 15, 6, 0.0F));

		RLeg2 = new ModelRenderer(this);
		RLeg2.setRotationPoint(-6.0F, 27.4131F, 6.6975F);
		setRotationAngle(RLeg2, 0.1745F, 0.0F, 0.0F);
		RLeg.addChild(RLeg2);
		RLeg2.cubeList.add(new ModelBox(RLeg2, 129, 60, 3.0F, -16.2611F, -6.6831F, 6, 15, 6, 0.0F));
		RLeg2.cubeList.add(new ModelBox(RLeg2, 140, 120, 2.0F, -1.9051F, -8.8096F, 3, 1, 8, 0.0F));
		RLeg2.cubeList.add(new ModelBox(RLeg2, 26, 71, 5.0F, -2.8182F, -6.8171F, 2, 2, 7, 0.0F));
		RLeg2.cubeList.add(new ModelBox(RLeg2, 141, 121, 7.0F, -1.9051F, -8.8096F, 3, 1, 7, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(7.0F, -18.0F, 0.0F);
		setRotationAngle(LLeg, -0.1309F, 0.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 97, 121, -3.0F, -1.2575F, -3.3296F, 6, 15, 6, 0.0F));

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setRotationPoint(-6.0F, 27.5436F, 5.7061F);
		setRotationAngle(LeftLeg3, 0.1745F, 0.0F, 0.0F);
		LLeg.addChild(LeftLeg3);
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 129, 60, 3.0F, -16.2611F, -6.6831F, 6, 15, 6, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 140, 120, 2.0F, -1.9051F, -8.8096F, 3, 1, 8, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 26, 71, 5.0F, -2.8182F, -6.8171F, 2, 2, 7, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 141, 121, 7.0F, -1.9051F, -8.8096F, 3, 1, 7, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		//Head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
		/*this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
		this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
		this.RArm.rotateAngleZ = 0.0F;
		this.LArm.rotateAngleZ = 0.0F;*/
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