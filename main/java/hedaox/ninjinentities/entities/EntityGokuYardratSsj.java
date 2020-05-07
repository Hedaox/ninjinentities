package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityGokuYardratSsj extends EntityDBCGoodNinjin {

	public int randomSoundDelay = 0;

	public EntityGokuYardratSsj(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, 255.0F, 217.0F, 25.0F);
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				8750.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				875.0D);
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
		return ModVars.MOD_ID + ":textures/entity/gokuYardratSsj.png";
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
		Entity var3 = par1DamageSource.getEntity();
		if ((var3 instanceof EntityPlayer)) {
			List<?> var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(
					this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));
			for (int var5 = 0; var5 < var4.size(); var5++) {
				Entity var6 = (Entity) var4.get(var5);
				if ((var6 instanceof EntityGokuYardratSsj)) {
					EntityGokuYardratSsj var7 = (EntityGokuYardratSsj) var6;
					var7.becomeAngryAt(var3);
				}
			}
			becomeAngryAt(var3);
		}
		return super.attackEntityFrom(par1DamageSource, par2);
	}

	private void becomeAngryAt(Entity par1Entity) {
		this.entityToAttack = par1Entity;
		this.angerLevel = (400 + this.rand.nextInt(400));
		this.randomSoundDelay = this.rand.nextInt(40);
	}

	protected void dropFewItems(boolean par1, int par2) {

	}

	public boolean interact(EntityPlayer par1EntityPlayer) {
		return false;
	}

}
