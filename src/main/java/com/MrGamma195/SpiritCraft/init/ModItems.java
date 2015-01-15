package com.MrGamma195.SpiritCraft.init;


import com.MrGamma195.SpiritCraft.items.*;
import com.MrGamma195.SpiritCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{


	public static  ItemSC spiritShard = new ItemSpiritShard();
	public static  ItemSC spiritCrystal = new ItemSpiritCrystal();
	public static  ItemSC spiritShardG = new ItemSpiritShardPrimalG();
	public static  ItemSC spiritShardR = new ItemSpiritShardPrimalR();
	public static  ItemSC spiritShardB = new ItemSpiritShardPrimalB();
	public static  ItemSC spiritShardW = new ItemSpiritShardPrimalW();

	//Tools
	public static Item CrystalPickAxe;
	//Armour

	//Materials
	public static final Item.ToolMaterial toolMaterial = EnumHelper.addToolMaterial("SpiritCrystal",3,500,2.0f,1.5f,20);
	public static final ItemArmor.ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial("SpiritMesh",40,new int[]{2,6,5,2},20);






	public static void init(){


		spiritShard = new ItemSpiritShard();
		spiritCrystal = new ItemSpiritCrystal();
		CrystalPickAxe = new ItemCrsytalPickAxe(toolMaterial);








		}


}
