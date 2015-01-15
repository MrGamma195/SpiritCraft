package com.MrGamma195.SpiritCraft.items;

import com.MrGamma195.SpiritCraft.CreativeTab.CreativeTabSC;
import com.MrGamma195.SpiritCraft.reference.Names;
import net.minecraft.item.ItemPickaxe;

public class ItemCrsytalPickAxe extends ItemPickaxe
{
    public ItemCrsytalPickAxe(ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(Names.Items.CRYSTAL_PICKAXE);
        setCreativeTab(CreativeTabSC.SC_TAB);
    }

}
