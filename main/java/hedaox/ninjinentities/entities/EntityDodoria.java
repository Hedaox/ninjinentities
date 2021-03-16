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

public class EntityDodoria extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityDodoria(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{3, 6}, new byte[]{8, 8});
		this.experienceValue = 80;
		this.setSize(0.68F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				1000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				120.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/dodoria.png";
	}
}
