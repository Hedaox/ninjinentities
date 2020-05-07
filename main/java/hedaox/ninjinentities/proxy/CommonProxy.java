package hedaox.ninjinentities.proxy;

import hedaox.ninjinentities.event.EventAttackManager;
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
       
    }

    public void init(FMLInitializationEvent $e)
    {
        
    }

    public void postInit(FMLPostInitializationEvent $e)
    {

    }
}


