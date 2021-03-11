package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;

import java.util.List;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityGokuKid1 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGokuKid1(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(0.36F,1.08F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				170.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				17.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gokuKid1.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit1[34], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.GiFighter2Leg, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.KameBoots1, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemPP, 1);
		}
	}
}
