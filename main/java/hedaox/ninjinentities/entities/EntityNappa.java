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

public class EntityNappa extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityNappa(World par1World) {
		super(par1World, 3, MindState.AGGRESSIVE, false, false, new byte[]{3, 5}, new byte[]{7, 7});
		this.experienceValue = 80;
		this.setSize(0.675F,1.98F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				350.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				35.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/nappa.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int j = this.rand.nextInt(2 + par2);
		for (int k = 0; k < j; k++) {
			dropItem(ItemsDBC.BattleArmorChest02, 1);
		}
		j = this.rand.nextInt(2 + par2);
		for (int k = 0; k < j; k++) {
			dropItem(ItemsDBC.BattleArmorLegs02, 1);
		}
		j = this.rand.nextInt(2 + par2);
		for (int k = 0; k < j; k++) {
			dropItem(ItemsDBC.BattleArmorBoots02, 1);
		}
		j = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
		for (int k = 0; k < j; k++) {
			dropItem(ItemsDBC.BattleArmorHelmet03, 1);
		}
	}
}
