package hedaox.ninjinentities.event;

import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import java.util.Arrays;

public class EventAttackManager {
    /**
     * Event is launch everytime an entity is hurt. Is use for putting player in KO State if entity is a trainer (Goku, Piccolo, Trunks etc...)
     *
     *
     * @author Hedaox
     */
    @SubscribeEvent
    public void checkHurtEvent(LivingHurtEvent event) {
        try {
            //is Server side ?
            if(!event.entity.worldObj.isRemote) {
                //Fight against a trainer
                if (event.entity instanceof EntityPlayer) {
                    Entity entityKiller;
                    EntityPlayer loadedPlayer = (EntityPlayer) event.entity;

                    entityKiller = event.entityLiving.func_94060_bK();
                    //Trainer beat player
                    if (entityKiller instanceof EntityDBCNinjin && JRMCoreH.getInt(loadedPlayer, "jrmcBdy") < 10) {
                        if (((EntityDBCNinjin) entityKiller).isTrainer) {
                            //Put Player Health at 10HP
                            JRMCoreH.setInt(10, loadedPlayer, "jrmcBdy");

                            //Put Player in KO State
                            NBTTagCompound nbt = JRMCoreH.nbt(loadedPlayer, "pres");
                            byte st = nbt.getByte("jrmcState");
                            byte st2 = nbt.getByte("jrmcState2");
                            byte rc = nbt.getByte("jrmcRace");
                            byte rls = JRMCoreH.getByte(loadedPlayer, "jrmcRelease");
                            int curStam = JRMCoreH.getInt(loadedPlayer, "jrmcStamina");
                            String StE = nbt.getString("jrmcStatusEff");
                            nbt.setInteger("jrmcHar4va", 5);
                            JRMCoreH.setByte(rc == 4 ? 4 : st < 4 ? st : 0, loadedPlayer, "jrmcState");
                            JRMCoreH.setByte(0, loadedPlayer, "jrmcState2");
                            JRMCoreH.setByte(0, loadedPlayer, "jrmcRelease");
                            JRMCoreH.setInt(0, loadedPlayer, "jrmcStamina");
                            StE = JRMCoreH.StusEfcts(19, StE, nbt, false);
                            StE = JRMCoreH.StusEfcts(13, StE, nbt, false);

                            // Make all Trainers disappear

                            for (Object entity : entityKiller.worldObj.getEntitiesWithinAABB(EntityDBCNinjin.class, AxisAlignedBB.getBoundingBox(entityKiller.posX - 100, entityKiller.posY - 100, entityKiller.posZ - 100, entityKiller.posX + 100, entityKiller.posY + 100, entityKiller.posZ + 100))) {

                                ((EntityDBCNinjin) entity).setDead();
                            }

                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("exception occured : " + e + " at "
                    + Arrays.toString(e.getStackTrace()));
        }
    }
}
