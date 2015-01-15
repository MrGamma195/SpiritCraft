package com.MrGamma195.SpiritCraft.init;

import com.MrGamma195.SpiritCraft.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;




public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.CrystalPickAxe), new Object[]
                {"XXX",
                " S ",
                " S ",
                'X',ModItems.spiritCrystal,'S',Items.stick
                });


        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.spiritCrystal),new Object[]
                {
                   ModItems.spiritShardR, ModItems.spiritShardB,ModItems.spiritShardW,ModItems.spiritShardG
                });

    }
}
