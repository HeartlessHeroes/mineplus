package mineplus.common;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class MinePlusIds {
	public static int bronzeIngotID;
	public static int bluriteIngotID;
	public static int silverIngotID;
	public static int steelIngotID;
	public static int mithrilIngotID;
	public static int lunarIngotID;
	public static int adamantIngotID;
	public static int runiteIngotID;
	public static int rubyGemID;
	public static int sapphireGemID;
	public static int emeraldGemID;
	public static int coalDustID;
	public static int ironDustID;
	public static int goldDustID;
	public static int diamondDustID;
	public static int copperDustID;
	public static int tinDustID;
	public static int bluriteDustID;
	public static int daeyaltDustID;
	public static int silverDustID;
	public static int mithrilDustID;
	public static int adamaniteDustID;
	public static int runiteDustID;

	public static int adamaniteOreID;
	public static int bluriteID;
	public static int copperOreID;
	public static int daeyaltOreID;
	public static int emeraldOreID;
	public static int graniteOreID;
	public static int limestoneID;
	public static int lunarOreID;
	public static int mithrilOreID;
	public static int opalOreID;
	public static int rubiumOreID;
	public static int rubyOreID;
	public static int runiteOreID;
	public static int sapphireOreID;
	public static int silverOreID;
	public static int tapazOreID;
	public static int tinOreID;

	public static int grinderID;
	public static int grinderActiveID;

	public static void initConfiguration(FMLInitializationEvent event){
		Configuration config = new Configuration(new File("config/mineplus.cfg"));	
		config.load();
		
		bronzeIngotID = config.get("Items", "Bronze Ingot", 5000).getInt();
		bluriteIngotID = config.get("Items", "Blurite Ingot", 5001).getInt();
		silverIngotID = config.get("Items", "Silver Ingot", 5002).getInt();
		steelIngotID = config.get("Items", "Steel Ingot", 5003).getInt();
		mithrilIngotID = config.get("Items", "Mithril Ingot", 5004).getInt();
		lunarIngotID = config.get("Items", "Lunar Ingot", 5005).getInt();
		adamantIngotID = config.get("Items", "Adamant Ingot", 5006).getInt();
		runiteIngotID = config.get("Items", "Runite Ingot", 5007).getInt();
		rubyGemID = config.get("Items", "Ruby", 5008).getInt();
		sapphireGemID = config.get("Items", "Sapphire", 5009).getInt();
		emeraldGemID = config.get("Items", "Emerald", 5010).getInt();
		coalDustID = config.get("Items", "Coal Dust", 5011).getInt();
		ironDustID = config.get("Items", "Iron Dust", 5012).getInt();
		goldDustID = config.get("Items", "Gold Dust", 5013).getInt();
		diamondDustID = config.get("Items", "Diamond Dust", 5014).getInt();
		copperDustID = config.get("Items", "Copper Dust", 5015).getInt();
		tinDustID = config.get("Items", "Tin Dust", 5016).getInt();
		bluriteDustID = config.get("Items", "Bluerite Dust", 5017).getInt();
		daeyaltDustID = config.get("Items", "Daeyalt", 5018).getInt();
		silverDustID = config.get("Items", "Silver Dust", 5019).getInt();
		mithrilDustID = config.get("Items", "Mithril", 5020).getInt();
		adamaniteDustID = config.get("Items", "Adamanite Dust", 5021).getInt();
		runiteDustID = config.get("Items", "Runite Dust", 5022).getInt();

		adamaniteOreID = config.get("Blocks", "Adamanite Ore", 500).getInt();
		bluriteID = config.get("Blocks", "Blurite Ore", 501).getInt();
		copperOreID = config.get("Blocks", "Copper Ore", 502).getInt();
		daeyaltOreID = config.get("Blocks", "Daeyalt Ore", 503).getInt();
		emeraldOreID = config.get("Blocks", "Emerald Ore", 504).getInt();
		graniteOreID = config.get("Blocks", "Granite Ore", 505).getInt();
		limestoneID = config.get("Blocks", "Limestone", 506).getInt();
		lunarOreID = config.get("Blocks", "Lunar Ore", 507).getInt();
		mithrilOreID = config.get("Blocks", "Mithril Ore", 508).getInt();
		opalOreID = config.get("Blocks", "Opal Ore", 509).getInt();
		rubiumOreID = config.get("Blocks", "Rubium Ore", 510).getInt();
		rubyOreID = config.get("Blocks", "Ruby Ore", 511).getInt();
		runiteOreID = config.get("Blocks", "Runite Ore", 512).getInt();
		sapphireOreID = config.get("Blocks", "Sapphire Ore", 513).getInt();
		silverOreID = config.get("Blocks", "Silver Ore", 514).getInt();
		tapazOreID = config.get("Blocks", "Tapaz Ore", 515).getInt();
		tinOreID = config.get("Blocks", "Tin Ore", 516).getInt();

		grinderID = config.get("Machines", "Grinder", 517).getInt();
		grinderActiveID = config.get("Machines", "Grinder Active", 518).getInt();

		config.save();
	}

}
