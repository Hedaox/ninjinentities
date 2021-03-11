package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.List;

public class EntityRaditz extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityRaditz(World par1World) {
		super(par1World, 5, MindState.NEUTRAL, false, false, new byte[]{3, 1}, new byte[]{3, 3});
		this.experienceValue = 80;
		this.setSize(0.63F,1.89F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				300.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				30.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/raditz.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int j = this.rand.nextInt(2 + par2);
		for (int k = 0; k < j; k++) {
			dropItem(ItemsDBC.BattleArmorChest03, 1);
		}
		j = this.rand.nextInt(2 + par2);
		for (int k = 0; k < j; k++) {
			dropItem(ItemsDBC.BattleArmorLegs03, 1);
		}
		j = this.rand.nextInt(2 + par2);
		for (int k = 0; k < j; k++) {
			dropItem(ItemsDBC.BattleArmorBoots03, 1);
		}
		j = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
		for (int k = 0; k < j; k++) {
			dropItem(ItemsDBC.BattleArmorHelmet04, 1);
		}
	}
}
