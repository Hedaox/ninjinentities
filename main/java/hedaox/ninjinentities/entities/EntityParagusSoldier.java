package hedaox.ninjinentities.entities;

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

public class EntityParagusSoldier extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityParagusSoldier(World par1World) {
		super(par1World, 10, MindState.AGGRESSIVE, false, false, new byte[]{6}, new byte[]{3});
		this.experienceValue = 80;
		this.setSize(0.54F,1.62F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				800.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				80.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/paragusSoldier.png";
	}
}
