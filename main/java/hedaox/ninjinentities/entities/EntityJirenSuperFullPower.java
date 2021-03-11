package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityJirenSuperFullPower extends EntityDBCNinjin {

	public EntityJirenSuperFullPower(World par1World) {
		super(par1World, 85, MindState.AGGRESSIVE, false, true, new byte[]{3, 5}, new byte[]{8, 8}, 255.0F, 0.0F, 0.0F, false, true,200.0F, 50.0F, 50.0F);
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.69F,2.07F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				150000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				15000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/jirenSuperFullPower.png";
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
