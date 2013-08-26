package mineplus.common;

import java.io.File;
import java.util.Iterator;

import mineplus.block.MinePlusBlock;
import mineplus.block.MinePlusBlockGrinder;
import mineplus.item.MinePlusItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MinePlus {
	@Instance(ModInfo.ID)
	public static MinePlus instance = new MinePlus();
	@SidedProxy(clientSide = "mineplus.common.ClientProxy", serverSide = "mineplus.common.ServerProxy")
	public static ServerProxy proxy;

	public static final String modid = "MinePlus";
	private GuiHandlerGrinder guiHandlerGrinder = new GuiHandlerGrinder();

	public static Block redSandstone;
	public static Block copperOre;
	public static Block tinOre;
	public static Block limestone;
	public static Block bluriteOre;
	public static Block daeyaltOre;
	public static Block silverOre;
	public static Block rubyOre;
	public static Block sapphireOre;
	public static Block emeraldOre;
	public static Block opalOre;
	public static Block tapazOre;
	public static Block graniteOre;
	public static Block rubiumOre;
	public static Block mithrilOre;
	public static Block lunarOre;
	public static Block adamaniteOre;
	public static Block runiteOre;

	public static Block grinder;
	public static Block grinderActive;

	public static Item bronzeIngot;
	public static Item bluriteIngot;
	public static Item silverIngot;
	public static Item steelIngot;
	public static Item mithrilIngot;
	public static Item lunarIngot;
	public static Item adamantIngot;
	public static Item runeiteIngot;
	public static Item rubyGem;
	public static Item sapphireGem;
	public static Item emeraldGem;
	public static Item coalDust;
	public static Item ironDust;
	public static Item goldDust;
	public static Item diamondDust;
	public static Item copperDust;
	public static Item tinDust;
	public static Item bluriteDust;
	public static Item daeyaltDust;
	public static Item silverDust;
	public static Item mithrilDust;
	public static Item adamaniteDust;
	public static Item runiteDust;

	@EventHandler
	public void load(FMLInitializationEvent event) {
		MinePlusIds.initConfiguration(event);

		copperOre = new MinePlusBlock(MinePlusIds.copperOreID, Material.rock).setUnlocalizedName("copperOre");
		tinOre = new MinePlusBlock(MinePlusIds.tinOreID, Material.rock).setUnlocalizedName("tinOre");
		limestone = new MinePlusBlock(MinePlusIds.limestoneID, Material.rock).setUnlocalizedName("limestone");
		bluriteOre = new MinePlusBlock(MinePlusIds.bluriteID, Material.rock).setUnlocalizedName("bluriteOre");
		daeyaltOre = new MinePlusBlock(MinePlusIds.daeyaltOreID, Material.rock).setUnlocalizedName("daeyaltOre");
		silverOre = new MinePlusBlock(MinePlusIds.silverOreID, Material.rock).setUnlocalizedName("silverOre");
		rubyOre = new MinePlusBlock(MinePlusIds.rubyOreID, Material.rock).setUnlocalizedName("rubyOre");
		sapphireOre = new MinePlusBlock(MinePlusIds.sapphireOreID, Material.rock).setUnlocalizedName("sapphireOre");
		emeraldOre = new MinePlusBlock(MinePlusIds.emeraldOreID, Material.rock).setUnlocalizedName("emeraldOre");
		opalOre = new MinePlusBlock(MinePlusIds.opalOreID, Material.rock).setUnlocalizedName("opalOre");
		tapazOre = new MinePlusBlock(MinePlusIds.tapazOreID, Material.rock).setUnlocalizedName("tapazOre");
		graniteOre = new MinePlusBlock(MinePlusIds.graniteOreID, Material.rock).setUnlocalizedName("graniteOre");
		rubiumOre = new MinePlusBlock(MinePlusIds.rubiumOreID, Material.rock).setUnlocalizedName("rubiumOre");
		mithrilOre = new MinePlusBlock(MinePlusIds.mithrilOreID, Material.rock).setUnlocalizedName("mithrilOre");
		lunarOre = new MinePlusBlock(MinePlusIds.lunarOreID, Material.rock).setUnlocalizedName("lunarOre");
		adamaniteOre = new MinePlusBlock(MinePlusIds.adamaniteOreID, Material.rock).setUnlocalizedName("adamaniteOre");
		runiteOre = new MinePlusBlock(MinePlusIds.runiteOreID, Material.rock).setUnlocalizedName("runiteOre");

		grinder = new MinePlusBlockGrinder(MinePlusIds.grinderID, false);
		grinderActive = new MinePlusBlockGrinder(MinePlusIds.grinderActiveID, true);

		bronzeIngot = new MinePlusItem(MinePlusIds.bronzeIngotID).setUnlocalizedName("bronzeIngot");
		bluriteIngot = new MinePlusItem(MinePlusIds.bluriteIngotID).setUnlocalizedName("bluriteIngot");
		silverIngot = new MinePlusItem(MinePlusIds.silverIngotID).setUnlocalizedName("silverIngot");
		steelIngot = new MinePlusItem(MinePlusIds.steelIngotID).setUnlocalizedName("steelIngot");
		mithrilIngot = new MinePlusItem(MinePlusIds.mithrilIngotID).setUnlocalizedName("mithrilIngot");
		lunarIngot = new MinePlusItem(MinePlusIds.lunarIngotID).setUnlocalizedName("lunarIngot");
		adamantIngot = new MinePlusItem(MinePlusIds.adamantIngotID).setUnlocalizedName("adamantIngot");
		runeiteIngot = new MinePlusItem(MinePlusIds.runiteIngotID).setUnlocalizedName("runeiteIngot");
		rubyGem = new MinePlusItem(MinePlusIds.rubyGemID).setUnlocalizedName("rubyGem");
		sapphireGem = new MinePlusItem(MinePlusIds.sapphireGemID).setUnlocalizedName("sapphireGem");
		emeraldGem = new MinePlusItem(MinePlusIds.emeraldGemID).setUnlocalizedName("emeraldGem");
		coalDust = new MinePlusItem(MinePlusIds.coalDustID).setUnlocalizedName("coalDust");
		ironDust = new MinePlusItem(MinePlusIds.ironDustID).setUnlocalizedName("ironDust");
		goldDust = new MinePlusItem(MinePlusIds.goldDustID).setUnlocalizedName("goldDust");
		diamondDust = new MinePlusItem(MinePlusIds.diamondDustID).setUnlocalizedName("diamondDust");
		copperDust = new MinePlusItem(MinePlusIds.copperDustID).setUnlocalizedName("copperDust");
		tinDust = new MinePlusItem(MinePlusIds.tinDustID).setUnlocalizedName("tinDust");
		bluriteDust = new MinePlusItem(MinePlusIds.bluriteDustID).setUnlocalizedName("bluriteDust");
		daeyaltDust = new MinePlusItem(MinePlusIds.daeyaltDustID).setUnlocalizedName("daeyaltDust");
		silverDust = new MinePlusItem(MinePlusIds.silverDustID).setUnlocalizedName("silverDust");
		mithrilDust = new MinePlusItem(MinePlusIds.mithrilDustID).setUnlocalizedName("mithrilDust");
		adamaniteDust = new MinePlusItem(MinePlusIds.adamaniteDustID).setUnlocalizedName("adamaniteDust");
		runiteDust = new MinePlusItem(MinePlusIds.runiteDustID).setUnlocalizedName("runiteDust");

		GameRegistry.registerBlock(copperOre, modid + copperOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tinOre, modid + tinOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(limestone, modid + limestone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(bluriteOre, modid + bluriteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(daeyaltOre, modid + daeyaltOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(silverOre, modid + silverOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(rubyOre, modid + rubyOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sapphireOre, modid + sapphireOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(emeraldOre, modid + emeraldOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(opalOre, modid + opalOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tapazOre, modid + tapazOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(graniteOre, modid + graniteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(rubiumOre, modid + rubiumOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mithrilOre, modid + mithrilOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lunarOre, modid + lunarOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(adamaniteOre, modid + adamaniteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(runiteOre, modid + runiteOre.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(bronzeIngot, modid + bronzeIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bluriteIngot, modid + bluriteIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverIngot, modid + silverIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelIngot, modid + steelIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyGem, modid + rubyGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireGem, modid + sapphireGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldGem, modid + emeraldGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalDust, modid + coalDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ironDust, modid + ironDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(goldDust, modid + goldDust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(diamondDust, modid + diamondDust.getUnlocalizedName().substring(5));

		GameRegistry.registerBlock(grinder, modid + grinder.getUnlocalizedName().substring(5));

		GameRegistry.registerTileEntity(TileEntityGrinder.class, "tileEntityGrinder");

		// RenderingRegistry.registerBlockHandler(2105, Render.INSTANCE);
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandlerGrinder());

		// GameRegistry.addShapelessRecipe(new ItemStack(bluriteDust), new Object[] { new ItemStack(Item.diamond), new ItemStack(Block.stone), new
		// ItemStack(Item.dyePowder, 1, 15) });

		// FurnaceRecipes.smelting().addSmelting(Item.beefCooked.itemID, 0, new ItemStack(Item.diamond), 0.1F);

		LanguageRegistry.addName(copperOre, "Copper Ore");
		LanguageRegistry.addName(tinOre, "Tin Ore");
		LanguageRegistry.addName(limestone, "Limestone");
		LanguageRegistry.addName(bluriteOre, "Blurite Ore");
		LanguageRegistry.addName(daeyaltOre, "Daeyalt Ore");
		LanguageRegistry.addName(silverOre, "Silver Ore");
		LanguageRegistry.addName(rubyOre, "Ruby Ore");
		LanguageRegistry.addName(sapphireOre, "Sapphire Ore");
		LanguageRegistry.addName(emeraldOre, "Emerald Ore");
		LanguageRegistry.addName(opalOre, "Opal Ore");
		LanguageRegistry.addName(tapazOre, "Tapaz Ore");
		LanguageRegistry.addName(graniteOre, "Granite Ore");
		LanguageRegistry.addName(rubiumOre, "Rubium Ore");
		LanguageRegistry.addName(mithrilOre, "Mithril Ore");
		LanguageRegistry.addName(lunarOre, "Lunar Ore");
		LanguageRegistry.addName(adamaniteOre, "Adamanite Ore");
		LanguageRegistry.addName(runiteOre, "Runite Ore");

		LanguageRegistry.addName(bronzeIngot, "Copper Ingot");
		LanguageRegistry.addName(bluriteIngot, "Tin Ingot");
		LanguageRegistry.addName(steelIngot, "Steel Ingot");
		LanguageRegistry.addName(rubyGem, "Ruby");
		LanguageRegistry.addName(sapphireGem, "Sapphire");
		LanguageRegistry.addName(emeraldGem, "Emerald");
		LanguageRegistry.addName(coalDust, "Coal Dust");
		LanguageRegistry.addName(ironDust, "Iron Dust");
		LanguageRegistry.addName(goldDust, "Gold Dust");
		LanguageRegistry.addName(diamondDust, "Diamond Dust");

		LanguageRegistry.addName(grinder, "Grinder");

		proxy.registerRenderThings();
	}
}