package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityGokuBlackR extends EntityDBCEvilNinjin {

	public EntityGokuBlackR(World par1World) {
		super(par1World, 3, MindState.AGGRESSIVE, false, true,255.0F, 50.0F, 255.0F);
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.6F,1.8F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				65000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				6500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gokuBlackRose.png";
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit1[16], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[16], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit3[16], 1);
		}
	}
}