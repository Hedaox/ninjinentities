package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityZarbon2 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityZarbon2(World par1World) {
		super(par1World, 5, MindState.AGGRESSIVE, false, false, new byte[]{3, 6, 1}, new byte[]{8, 8, 3});
		this.experienceValue = 80;
		this.setSize(0.612F,1.836F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				1300.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				130.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/zarbon2.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.BattleArmorChest03, 1);
		}
	}
}
