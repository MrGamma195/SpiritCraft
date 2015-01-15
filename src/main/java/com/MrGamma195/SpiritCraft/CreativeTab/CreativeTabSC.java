package com.MrGamma195.SpiritCraft.CreativeTab;

import com.MrGamma195.SpiritCraft.init.ModItems;
import net.minecraft.item.Item;
import com.MrGamma195.SpiritCraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabSC {

	
	public static final CreativeTabs SC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		
		@Override
		public Item getTabIconItem(){
		return ModItems.spiritCrystal;
		}
		
	};
}
