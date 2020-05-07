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

public class EntityRaditz extends EntityDBCEvilNinjin {

	public int randomSoundDelay = 0;

	public EntityRaditz(World par1World) {
		super(par1World, 5, MindState.NEUTRAL, false, false);
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

	protected boolean canDespawn() {
		return true;
	}

	public void onUpdate() {
		if ((this.randomSoundDelay > 0) && (--this.randomSoundDelay == 0)) {
		}
		super.onUpdate();
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/raditz.png";
	}

	public boolean getCanSpawnHere() {
		return (this.worldObj.checkNoEntityCollision(this.boundingBox))
				&& (this.worldObj.getCollidingBoundingBoxes(this,
						this.boundingBox).isEmpty())
				&& (!this.worldObj.isAnyLiquid(this.boundingBox));
	}

	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setShort("Anger", (short) this.angerLevel);
	}

	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);
		this.angerLevel = par1NBTTagCompound.getShort("Anger");
	}

	protected Entity findPlayerToAttack() {
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
		if (isEntityInvulnerable()) {
			return false;
		}
		Entity j = par1DamageSource.getEntity();
		if ((j instanceof EntityPlayer)) {
			List<?> k = this.worldObj.getEntitiesWithinAABBExcludingEntity(
					this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));
			for (int var5 = 0; var5 < k.size(); var5++) {
				Entity var6 = (Entity) k.get(var5);
				if ((var6 instanceof EntityRaditz)) {
					EntityRaditz var7 = (EntityRaditz) var6;
					var7.becomeAngryAt(j);
				}
			}
			becomeAngryAt(j);
		}
		return super.attackEntityFrom(par1DamageSource, par2);
	}

	private void becomeAngryAt(Entity par1Entity) {
		this.entityToAttack = par1Entity;
		this.angerLevel = (400 + this.rand.nextInt(400));
		this.randomSoundDelay = this.rand.nextInt(40);
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

	public boolean interact(EntityPlayer par1EntityPlayer) {
		return false;
	}

}
