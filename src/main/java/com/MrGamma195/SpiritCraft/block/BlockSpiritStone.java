package com.MrGamma195.SpiritCraft.block;

import com.MrGamma195.SpiritCraft.reference.Names;
import net.minecraft.block.material.Material;

public class BlockSpiritStone extends BlockSC{
    public BlockSpiritStone(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.SPIRIT_STONE);
        this.setHardness(1.5f);
    }
}
