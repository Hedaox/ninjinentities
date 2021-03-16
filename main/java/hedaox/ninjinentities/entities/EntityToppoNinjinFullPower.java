package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityToppoNinjinFullPower extends EntityDBCNinjin {

	public EntityToppoNinjinFullPower(World par1World) {
		super(par1World, 80, MindState.AGGRESSIVE, false, true, new byte[]{1, 3, 6, 5}, new byte[]{4, 4, 4, 3},255.0F, 50.0F, 50.0F, false, true,200.0F, 50.0F, 50.0F);
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.78F,2.34F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				100000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				10000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/toppoFullPower.png";
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[38], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit3[38], 1);
		}
	}
}
