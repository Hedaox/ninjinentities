package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityKettle extends EntityDBCNinjin {

	public EntityKettle(World par1World) {
		super(par1World, 80, MindState.NEUTRAL, false, true, new byte[]{1, 6, 3}, new byte[]{7, 2, 2});
		this.experienceValue = 80;
		this.setSize(0.63F,1.8F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				23000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2300.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/kettle.png";
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[38], 1);
		}
	}
}
