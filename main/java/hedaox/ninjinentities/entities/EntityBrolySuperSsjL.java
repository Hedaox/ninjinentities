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

public class EntityBrolySuperSsjL extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBrolySuperSsjL(World par1World) {
		super(par1World, 100, MindState.AGGRESSIVE, true, true, new byte[]{1, 3, 5, 6}, new byte[]{6, 6, 6, 6},50.0F, 255.0F, 50.0F);
		this.experienceValue = 80;
		this.setSize(0.75F,2.25F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				160000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				16000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/brolySuperSsjL.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.BattleArmorBoots06, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.BattleArmorLegs06, 1);
		}
	}
}
