package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWhis extends EntityDBCNinjin {

	public EntityWhis(World par1World) {
		super(par1World, 50, MindState.NEUTRAL, true, true, new byte[]{6}, new byte[]{3});
		this.experienceValue = 80;
		this.setSize(0.6F,1.98F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				250000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				25000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return "jinryuudragonbc:npcs/whis.png";
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit1[40], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[40], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit3[40], 1);
		}
	}
}
