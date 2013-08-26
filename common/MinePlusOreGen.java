package mineplus.common;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MinePlusOreGen implements IWorldGenerator {
	/** Methods For Ore Generation **/
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		/** switches between dimensions **/
		// the case number must match the dimension id !!!!!!!!!!! i don't know why ? it just does
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
/**		case 1:
			generateNether(world, random, chunkX * 16, chunkZ * 16, chunkProvider, chunkX, chunkZ);
		case -1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		case 5:
			generateTutorial(world, random, chunkX * 16, chunkZ * 16);**/
		}
	}

	/** Generate's the Ore's In Surface World **/
	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		// the 4 below is for how rare it will be
		for (int i = 0; i < 15; i++) {
			// this below just tells me if its generating or not
			System.out.println("Generating " + "Copper Ore" + " in overworld");

			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(64);// the 128 is the max height the ore/block will generate
			int zCoord = chunkZ + random.nextInt(16);

			// The 230 on the line below is how many will generate per vein, as an example i think diamond is like 2 or 4
			// and the Block.blockEmerald is what it will spawn
			(new WorldGenMinable(MinePlus.copperOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinable(MinePlus.tinOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinable(MinePlus.limestone.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinable(MinePlus.bluriteOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinable(MinePlus.daeyaltOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinable(MinePlus.silverOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinable(MinePlus.rubyOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinable(MinePlus.sapphireOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinable(MinePlus.emeraldOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	/** 
	private void generateNether(World world, Random random, int chunkX, int chunkZ, IChunkProvider par1IChunkProvider, int par2, int par3) {
		// the 4 below is for how rare it will be
		for (int i = 0; i < 4; i++) {
			// this below just tells me if its generating or not
			System.out.println("Generating Leaf in the End");

			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(256);// the 128 is the max height the ore/block will generate
			int zCoord = chunkZ + random.nextInt(16);

			// The 230 on the line below is how many will generate per vein, as an example i think diamond is like 2 or 4
			// and the Block.blockGold is what it will spawn
			(new WorldGenMinableNether(Block.blockGold.blockID, 20)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	/** 
	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		// the 4 below is for how rare it will be
		for (int i = 0; i < 4; i++) {
			// this below just tells me if its generating or not
			System.out.println("Generating Leaf in the End");
			int xCoord = chunkX + random.nextInt(16);

			int yCoord = random.nextInt(64);// the 128 is the max height the ore/block will generate
			int zCoord = chunkZ + random.nextInt(16);

			// The 230 on the line below is how many will generate per vein, as an example i think diamond is like 2 or 4
			// and the Block.blockDiamond is what it will spawn
			(new WorldGenMinableEnd(Block.blockDiamond.blockID, 20)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	private void generateTutorial(World world, Random random, int chunkX, int chunkZ) {
		// the 4 below is for how rare it will be
		for (int i = 0; i < 4; i++) {
			// this below just tells me if its generating or not
			System.out.println("Generating Leaf in the dimension");

			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(128);// the 128 is the max height the ore/block will generate
			int zCoord = chunkZ + random.nextInt(16);

			// The 230 on the line below is how many will generate per vein, as an example i think diamond is like 2 or 4
			// and the Block.blockIron is what it will spawn
			(new WorldGenMinableTutorial(Block.glowStone.blockID, 20)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}**/
}