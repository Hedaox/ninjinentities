package hedaox.ninjinentities.command;

import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class CommandSummonNinjin implements ICommand {

    private final List aliases;

    private List<String> listOfAllEntitiesNames = new ArrayList<String>();

    protected String fullEntityName;
    protected Entity summonedEntity;

    public CommandSummonNinjin()
    {
        aliases = new ArrayList();
        aliases.add("summonninjin");
        aliases.add("sumnj");

        for (Object entityName : EntityList.stringToClassMapping.keySet()) {
            if(entityName instanceof String && ((String) entityName).contains(ModVars.MOD_ID))
            {
                listOfAllEntitiesNames.add((String) entityName);
            }
        }
    }

    @Override
    public String getCommandName() {
        return "summonninjin";
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return "summonninjin <text>";
    }

    @Override
    public List getCommandAliases() {
        return this.aliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] argString) {
        World world = sender.getEntityWorld();
        if(argString.length == 0)
        {
            sender.addChatMessage(new ChatComponentText("Invalid argument"));
            return;
        }

        sender.addChatMessage(new ChatComponentText("Summoning: " + argString[0]));

        fullEntityName = argString[0];
        if (EntityList.stringToClassMapping.containsKey(fullEntityName))
        {
            summonedEntity = EntityList.createEntityByName(fullEntityName, world);
            summonedEntity.setPosition(sender.getPlayerCoordinates().posX, sender.getPlayerCoordinates().posY, sender.getPlayerCoordinates().posZ);
            world.spawnEntityInWorld(summonedEntity);
        }
        else
        {
            sender.addChatMessage(new ChatComponentText("Entity not found"));
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        if (sender instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) sender;
            if (player.canCommandSenderUseCommand(3,"")) {
                return true;
            } else
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<?> addTabCompletionOptions(ICommandSender sender, String[] strArray) {
        List<String> strListComp = new ArrayList<String>();
        List<String> currentCom = listOfAllEntitiesNames;

        if (strArray.length == 1) {
            for (String strCom: currentCom) {
                if(strCom.length() > strArray[0].length() && strArray[0].startsWith(strCom.substring(0, strArray[0].length())))
                {
                    strListComp.add(strCom);
                }
            }
        }

        return strListComp;
    }

    @Override
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
