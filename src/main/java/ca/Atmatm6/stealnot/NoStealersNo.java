package ca.Atmatm6.stealnot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, version = Reference.VERSIUN, name = Reference.NAMECON)
public class NoStealersNo
{
    public static Logger stealog = LogManager.getLogger(Reference.NAMECON);
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitializationEvent)
    {
        stealog.log(Level.INFO , Reference.STEALINGLOG + "Pre Initialization Mode.");
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        stealog.log(Level.INFO, Reference.STEALINGLOG + "Initialization Mode.");
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        stealog.log(Level.INFO, Reference.STEALINGLOG + "Post Initialization Mode");
    }
}
