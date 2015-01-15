package com.MrGamma195.SpiritCraft;


import com.MrGamma195.SpiritCraft.init.ModBlocks;
import com.MrGamma195.SpiritCraft.init.ModItems;
import com.MrGamma195.SpiritCraft.init.Recipes;
import com.MrGamma195.SpiritCraft.proxy.IProxy;
import com.MrGamma195.SpiritCraft.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION,
        guiFactory = Reference.GUI_FACTORY_CLASS)

public class SpiritCraft
{

    @Mod.Instance(Reference.MOD_ID)
    public static SpiritCraft instance;

    @SidedProxy(clientSide = Reference.Client_Proxy_Class, serverSide = Reference.Server_Proxy_Class)
    public static IProxy proxy;

    @Mod.EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event)
    {
        if (Reference.FINGERPRINT.equals("@FINGERPRINT@"))
        {

        }
        else
        {

        }
    }




    //preInit loading
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {


        ModItems.init();
        ModBlocks.init();




    }

    //init loading
    @Mod.EventHandler
    public void inint(FMLInitializationEvent event) {
        Recipes.init();
        CraftingHandler.init();


    }

    //postInit loading
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}