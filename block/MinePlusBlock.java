package mineplus.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mineplus.common.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class MinePlusBlock extends Block {
	public MinePlusBlock(int id, Material material) {
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(ModInfo.ID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
