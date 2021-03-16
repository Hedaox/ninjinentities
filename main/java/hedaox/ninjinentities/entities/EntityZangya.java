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

public class EntityZangya extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityZangya(World par1World) {
		super(par1World, 10, MindState.AGGRESSIVE, false, true, new byte[]{1, 6}, new byte[]{7, 7});
		this.experienceValue = 80;
		this.setSize(0.51F,1.53F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				9000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				800.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/zangya.png";
	}
}
