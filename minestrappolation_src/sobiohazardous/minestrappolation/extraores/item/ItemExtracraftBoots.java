package sobiohazardous.minestrappolation.extraores.item;

import sobiohazardous.minestrappolation.extraores.ExtraOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemExtracraftBoots extends ItemArmor implements IArmorTextureProvider
{
	private String texture;
	public ItemExtracraftBoots(int par1, String texture, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) 
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.texture = "extraores:" + texture;
	}
	
	public String getArmorTextureFile(ItemStack par1)
	{
		if(par1.itemID==ExtraOres.meuroditeHelmet.itemID||par1.itemID==ExtraOres.meuroditeChest.itemID||par1.itemID==ExtraOres.meuroditeBoots.itemID)
		{
			return "/armor/zirconium_1.png";
		}
		if(par1.itemID==ExtraOres.meuroditePants.itemID)
		{
			return "/armor/zirconium_2.png";
		}
		if(par1.itemID==ExtraOres.TitaniumHelmet.itemID||par1.itemID==ExtraOres.TitaniumChest.itemID||par1.itemID==ExtraOres.TitaniumBoots.itemID)
		{
			return "/armor/titanium_1.png";
		}
		if(par1.itemID==ExtraOres.TitaniumPants.itemID)
		{
			return "/armor/titanium_2.png";
		}
		if(par1.itemID==ExtraOres.ToriteHelmet.itemID||par1.itemID==ExtraOres.ToriteChest.itemID||par1.itemID==ExtraOres.ToriteBoots.itemID)
		{
			return "/armor/torite_1.png";
		}
		if(par1.itemID==ExtraOres.ToritePants.itemID)
		{
			return "/armor/torite_2.png";
		}
		if(par1.itemID==ExtraOres.BlaziumHelmet.itemID||par1.itemID==ExtraOres.BlaziumChest.itemID||par1.itemID==ExtraOres.BlaziumBoots.itemID)
		{
			return "/armor/fire_1.png";
		}
		if(par1.itemID==ExtraOres.BlaziumPants.itemID)
		{
			return "/armor/fire_2.png";
		}
		if(par1.itemID==ExtraOres.TinHelmet.itemID||par1.itemID==ExtraOres.TinChest.itemID||par1.itemID==ExtraOres.TinBoots.itemID)
		{
			return "/armor/tin_1.png";
		}
		if(par1.itemID==ExtraOres.TinPants.itemID)
		{
			return "/armor/tin_2.png";
		}
		if(par1.itemID==ExtraOres.BronzeHelmet.itemID||par1.itemID==ExtraOres.BronzeChest.itemID||par1.itemID==ExtraOres.BronzeBoots.itemID)
		{
			return "/armor/bronze_1.png";
		}
		if(par1.itemID==ExtraOres.BronzePants.itemID)
		{
			return "/armor/bronze_2.png";
		}
		if(par1.itemID==ExtraOres.SteelHelmet.itemID||par1.itemID==ExtraOres.SteelChest.itemID||par1.itemID==ExtraOres.SteelBoots.itemID)
		{
			return "/armor/steel_1.png";
		}
		if(par1.itemID==ExtraOres.SteelPants.itemID)
		{
			return "/armor/steel_2.png";
		}
		
		if(par1.itemID==ExtraOres.BPMeuroditeHelmet.itemID||par1.itemID==ExtraOres.BPMeuroditeChest.itemID||par1.itemID==ExtraOres.BPMeuroditeBoots.itemID)
		{
			return "/armor/zirconium_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPMeuroditePants.itemID)
		{
			return "/armor/zirconium_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPTitaniumHelmet.itemID||par1.itemID==ExtraOres.BPTitaniumChest.itemID||par1.itemID==ExtraOres.BPTitaniumBoots.itemID)
		{
			return "/armor/titanium_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPTitaniumPants.itemID)
		{
			return "/armor/titanium_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPToriteHelmet.itemID||par1.itemID==ExtraOres.BPToriteChest.itemID||par1.itemID==ExtraOres.BPToriteBoots.itemID)
		{
			return "/armor/torite_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPToritePants.itemID)
		{
			return "/armor/torite_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPBlaziumHelmet.itemID||par1.itemID==ExtraOres.BPBlaziumChest.itemID||par1.itemID==ExtraOres.BPBlaziumBoots.itemID)
		{
			return "/armor/fire_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPBlaziumPants.itemID)
		{
			return "/armor/fire_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPTinHelmet.itemID||par1.itemID==ExtraOres.BPTinChest.itemID||par1.itemID==ExtraOres.BPTinBoots.itemID)
		{
			return "/armor/tin_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPTinPants.itemID)
		{
			return "/armor/tin_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPSteelHelmet.itemID||par1.itemID==ExtraOres.BPSteelChest.itemID||par1.itemID==ExtraOres.BPSteelBoots.itemID)
		{
			return "/armor/steel_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPSteelPants.itemID)
		{
			return "/armor/steel_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPClothHelmet.itemID||par1.itemID==ExtraOres.BPClothChest.itemID||par1.itemID==ExtraOres.BPClothBoots.itemID)
		{
			return "/armor/cloth_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPClothPants.itemID)
		{
			return "/armor/cloth_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPChainHelmet.itemID||par1.itemID==ExtraOres.BPChainChest.itemID||par1.itemID==ExtraOres.BPChainBoots.itemID)
		{
			return "/armor/chain_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPChainPants.itemID)
		{
			return "/armor/chain_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPIronHelmet.itemID||par1.itemID==ExtraOres.BPIronChest.itemID||par1.itemID==ExtraOres.BPIronBoots.itemID)
		{
			return "/armor/iron_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPIronPants.itemID)
		{
			return "/armor/iron_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPGoldHelmet.itemID||par1.itemID==ExtraOres.BPGoldChest.itemID||par1.itemID==ExtraOres.BPGoldBoots.itemID)
		{
			return "/armor/gold_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPGoldPants.itemID)
		{
			return "/armor/gold_plated_2.png";
		}
		if(par1.itemID==ExtraOres.BPDiamondHelmet.itemID||par1.itemID==ExtraOres.BPDiamondChest.itemID||par1.itemID==ExtraOres.BPDiamondBoots.itemID)
		{
			return "/armor/diamond_plated_1.png";
		}
		if(par1.itemID==ExtraOres.BPDiamondPants.itemID)
		{
			return "/armor/diamond_plated_2.png";
		}
		return "/armor/zirconium_1.png";
	}
	
	public void registerIcons(IconRegister par1IconRegister)
	{
	         this.itemIcon = par1IconRegister.registerIcon(texture);
	}


}