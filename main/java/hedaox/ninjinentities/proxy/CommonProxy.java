package hedaox.ninjinentities.proxy;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import hedaox.ninjinentities.event.EventAttackManager;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.network.MessageSendStringSoundToPlay;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

/**
 * Do Things on server and client side at the same time
 * 
 * @author Hedaox
 */
public class CommonProxy {
	
	EventAttackManager EAHandler = new EventAttackManager();
	
    
    public static SimpleNetworkWrapper network;
    
    public void preInit(FMLPreInitializationEvent $e) 
    {
        MinecraftForge.EVENT_BUS.register(EAHandler);

        network = NetworkRegistry.INSTANCE.newSimpleChannel(ModVars.MOD_ID + " Channel 1");

        //Client To Server
        network.registerMessage(MessageSendStringSoundToPlay.MyMessageHandler.class, MessageSendStringSoundToPlay.class, 0, Side.SERVER);
       
    }

    public void init(FMLInitializationEvent $e)
    {
        
    }

    public void postInit(FMLPostInitializationEvent $e)
    {

    }
}


