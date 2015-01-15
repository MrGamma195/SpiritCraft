package com.MrGamma195.SpiritCraft.init;

import com.MrGamma195.SpiritCraft.block.BlockSC;
import com.MrGamma195.SpiritCraft.block.BlockSpiritStone;
import com.MrGamma195.SpiritCraft.reference.Names;
import com.MrGamma195.SpiritCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockSC spiritStone = new BlockSpiritStone();
    public static void init(){
        GameRegistry.registerBlock(spiritStone, Names.Blocks.SPIRIT_STONE);
    }

}
