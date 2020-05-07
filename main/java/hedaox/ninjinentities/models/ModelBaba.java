package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBaba extends ModelBase {
	private final ModelRenderer Tete;
	private final ModelRenderer Couronne_Chapeau;
	private final ModelRenderer Chapeau_1;
	private final ModelRenderer Chapeau_2;
	private final ModelRenderer Chapeau_3;
	private final ModelRenderer Corps;
	private final ModelRenderer Boule_Principale;
	private final ModelRenderer Boule_Cote_1;
	private final ModelRenderer Boule_Cote_2;
	private final ModelRenderer Boule_Cote_3;
	private final ModelRenderer Boucle_Cote_4;
	private final ModelRenderer Boule_Cote_5;
	private final ModelRenderer Gros_cul;
	private final ModelRenderer Main;
	private final ModelRenderer Bras_Gauche;
	private final ModelRenderer Bras_Droit;
	private final ModelRenderer Bras_Devant;
	private final ModelRenderer Epaule_Droite;
	private final ModelRenderer Epaule_Droite_2;
	private final ModelRenderer Epaule_Gauche;
	private final ModelRenderer Epaule_Gauche_2;
	private final ModelRenderer Dos;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelBaba(float _scaleX, float _scaleY, float _scaleZ) {
		textureWidth = 128;
		textureHeight = 64;

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		Tete = new ModelRenderer(this);
		Tete.setRotationPoint(0.0F, 7.0F, 1.0F);
		Tete.cubeList.add(new ModelBox(Tete, 33, 33, -3.0F, -6.0F, -3.0F, 6, 6, 6, 0.0F));

		Couronne_Chapeau = new ModelRenderer(this);
		Couronne_Chapeau.setRotationPoint(11.0F, -7.0F, -1.0F);
		Tete.addChild(Couronne_Chapeau);
		Couronne_Chapeau.cubeList.add(new ModelBox(Couronne_Chapeau, 73, 1, -18.0F, 0.0F, -6.0F, 14, 1, 14, 0.0F));

		Chapeau_1 = new ModelRenderer(this);
		Chapeau_1.setRotationPoint(0.0F, -7.0F, -1.0F);
		Tete.addChild(Chapeau_1);
		Chapeau_1.cubeList.add(new ModelBox(Chapeau_1, 0, 22, -3.0F, -3.5F, -2.0F, 6, 4, 6, 0.0F));

		Chapeau_2 = new ModelRenderer(this);
		Chapeau_2.setRotationPoint(0.0F, -7.0F, -1.0F);
		Tete.addChild(Chapeau_2);
		Chapeau_2.cubeList.add(new ModelBox(Chapeau_2, 84, 24, -2.0F, -7.5F, -1.0F, 4, 4, 4, 0.0F));

		Chapeau_3 = new ModelRenderer(this);
		Chapeau_3.setRotationPoint(0.0F, -7.0F, -1.0F);
		Tete.addChild(Chapeau_3);
		Chapeau_3.cubeList.add(new ModelBox(Chapeau_3, 101, 28, -1.0F, -9.5F, 0.0F, 2, 2, 2, 0.0F));

		Corps = new ModelRenderer(this);
		Corps.setRotationPoint(0.0F, 24.0F, 0.0F);

		Boule_Principale = new ModelRenderer(this);
		Boule_Principale.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Boule_Principale);
		Boule_Principale.cubeList.add(new ModelBox(Boule_Principale, 0, 44, -5.0F, 11.0F, -4.0F, 10, 10, 10, 0.0F));

		Boule_Cote_1 = new ModelRenderer(this);
		Boule_Cote_1.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Boule_Cote_1);
		Boule_Cote_1.cubeList.add(new ModelBox(Boule_Cote_1, 98, 48, 4.5F, 12.0F, -3.0F, 1, 8, 8, 0.0F));

		Boule_Cote_2 = new ModelRenderer(this);
		Boule_Cote_2.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Boule_Cote_2);
		Boule_Cote_2.cubeList.add(new ModelBox(Boule_Cote_2, 59, 48, -5.5F, 12.0F, -3.0F, 1, 8, 8, 0.0F));

		Boule_Cote_3 = new ModelRenderer(this);
		Boule_Cote_3.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Boule_Cote_3);
		Boule_Cote_3.cubeList.add(new ModelBox(Boule_Cote_3, 41, 55, -4.0F, 12.0F, -4.5F, 8, 8, 1, 0.0F));

		Boucle_Cote_4 = new ModelRenderer(this);
		Boucle_Cote_4.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Boucle_Cote_4);
		Boucle_Cote_4.cubeList.add(new ModelBox(Boucle_Cote_4, 78, 55, -4.0F, 12.0F, 5.5F, 8, 8, 1, 0.0F));

		Boule_Cote_5 = new ModelRenderer(this);
		Boule_Cote_5.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Boule_Cote_5);
		Boule_Cote_5.cubeList.add(new ModelBox(Boule_Cote_5, 71, 46, -4.0F, 20.5F, -3.0F, 8, 1, 8, 0.0F));

		Gros_cul = new ModelRenderer(this);
		Gros_cul.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Gros_cul);
		Gros_cul.cubeList.add(new ModelBox(Gros_cul, 0, 33, -4.0F, 8.5F, -3.0F, 8, 3, 8, 0.0F));

		Main = new ModelRenderer(this);
		Main.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Main);
		Main.cubeList.add(new ModelBox(Main, 0, 18, -1.0F, 6.5F, -4.0F, 2, 2, 1, 0.0F));

		Bras_Gauche = new ModelRenderer(this);
		Bras_Gauche.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Bras_Gauche);
		Bras_Gauche.cubeList.add(new ModelBox(Bras_Gauche, 58, 25, 3.0F, 6.5F, -2.0F, 2, 2, 6, 0.0F));

		Bras_Droit = new ModelRenderer(this);
		Bras_Droit.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Bras_Droit);
		Bras_Droit.cubeList.add(new ModelBox(Bras_Droit, 58, 33, -5.0F, 6.5F, -2.0F, 2, 2, 6, 0.0F));

		Bras_Devant = new ModelRenderer(this);
		Bras_Devant.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Bras_Devant);
		Bras_Devant.cubeList.add(new ModelBox(Bras_Devant, 58, 42, -5.0F, 6.5F, -3.0F, 10, 2, 1, 0.0F));

		Epaule_Droite = new ModelRenderer(this);
		Epaule_Droite.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Epaule_Droite);
		Epaule_Droite.cubeList.add(new ModelBox(Epaule_Droite, 75, 34, -5.0F, 4.5F, 2.0F, 2, 2, 2, 0.0F));

		Epaule_Droite_2 = new ModelRenderer(this);
		Epaule_Droite_2.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Epaule_Droite_2);
		Epaule_Droite_2.cubeList.add(new ModelBox(Epaule_Droite_2, 75, 39, -5.0F, 5.5F, 1.0F, 2, 1, 1, 0.0F));

		Epaule_Gauche = new ModelRenderer(this);
		Epaule_Gauche.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Epaule_Gauche);
		Epaule_Gauche.cubeList.add(new ModelBox(Epaule_Gauche, 75, 26, 3.0F, 4.5F, 2.0F, 2, 2, 2, 0.0F));

		Epaule_Gauche_2 = new ModelRenderer(this);
		Epaule_Gauche_2.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Epaule_Gauche_2);
		Epaule_Gauche_2.cubeList.add(new ModelBox(Epaule_Gauche_2, 75, 31, 3.0F, 5.5F, 1.0F, 2, 1, 1, 0.0F));

		Dos = new ModelRenderer(this);
		Dos.setRotationPoint(0.0F, -24.0F, 0.0F);
		Corps.addChild(Dos);
		Dos.cubeList.add(new ModelBox(Dos, 27, 24, -3.0F, 6.5F, -2.0F, 6, 2, 6, 0.0F));
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Tete.render(f5);
		Corps.render(f5);
		GL11.glPopMatrix();
        this.Tete.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.Tete.rotateAngleX = f4 / (180F / (float)Math.PI);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
