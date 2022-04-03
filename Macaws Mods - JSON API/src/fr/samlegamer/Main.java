package fr.samlegamer;

import java.util.ArrayList;
import java.util.List;
import fr.samlegamer.cave_and_cliff_part_II.fences.MCFLangGen;
import fr.samlegamer.cave_and_cliff_part_II.fences.MCFRecipesGen;
import fr.samlegamer.cave_and_cliff_part_II.fences.MFTagGenerator;
import fr.samlegamer.mods.MacawsFences;
import fr.samlegamer.utils.ModsList;

public class Main
{
	public static final String LOCATION = "C://Users/ExampleDude/Documents/Jsons API/";  //Path
	public static final String CompatModid = "CompatExample"; //The modid of compat, No :
	public static final String TextureLocationFormodid = "example:block"; //modid:block for textures location (ex : assets/quark/textures/block = quark:block)
	public static final String ModidExtended = "example";
	
	public static final String WALL = "";	// !ONLY FOR STONE! this is wall texture in the bridge
	public static final String FLOOR = "";		// !ONLY FOR STONE! this is floor texture in the bridge
	public static final String MATERIAL_NAME = "";
	
	public static final List<String> MATERIAL = new ArrayList<String>();
	public static final List<String> MAJ_MAT = new ArrayList<String>();

	public static final String ClassMod = "MyBlocksInit"; // Blocks Class Registries (ex : IafBlockRegistry)
	
	public static void main(String[] args)
	{
		ModsList.bop(MATERIAL);
		ModsList.bopLang(MAJ_MAT);

		MCFLangGen.initAllEnglish(CompatModid, MATERIAL, MAJ_MAT);
		MacawsFences.InitFolders(LOCATION);
		MCFRecipesGen.init(LOCATION);
		MFTagGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
		MFTagGenerator.FencesDataGen(LOCATION, CompatModid, MATERIAL);
		MCFLangGen.initAllEnglish(CompatModid, MATERIAL, MAJ_MAT);
		
		for(String i : MATERIAL)
		{
			MacawsFences.HighleyGate.createBlockstate(LOCATION, CompatModid, i);
			MacawsFences.HighleyGate.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsFences.HighleyGate.createModelItem(LOCATION, CompatModid, i);

			MacawsFences.HorseFence.createBlockstate(LOCATION, CompatModid, i);
			MacawsFences.HorseFence.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsFences.HorseFence.createModelItem(LOCATION, CompatModid, i);

			MacawsFences.Inventory.createModelBlock(LOCATION, TextureLocationFormodid, i, false);

			MacawsFences.PicketFence.createBlockstate(LOCATION, CompatModid, i);
			MacawsFences.PicketFence.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsFences.PicketFence.createModelItem(LOCATION, CompatModid, i);

			MacawsFences.StockadeFence.createBlockstate(LOCATION, CompatModid, i);
			MacawsFences.StockadeFence.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsFences.StockadeFence.createModelItem(LOCATION, CompatModid, i);

			MacawsFences.WiredFence.createBlockstate(LOCATION, CompatModid, i);
			MacawsFences.WiredFence.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsFences.WiredFence.createModelItem(LOCATION, CompatModid, i);
			
			MCFRecipesGen.HighleyGate.loot_tables(LOCATION, CompatModid, i);
			MCFRecipesGen.HorseFence.loot_tables(LOCATION, CompatModid, i);
			MCFRecipesGen.PicketFence.loot_tables(LOCATION, CompatModid, i);
			MCFRecipesGen.StockadeFence.loot_tables(LOCATION, CompatModid, i);
			MCFRecipesGen.WiredFence.loot_tables(LOCATION, CompatModid, i);
			
			MCFRecipesGen.HighleyGate.recipe(LOCATION, ModidExtended, CompatModid, i, false);
			MCFRecipesGen.HorseFence.recipe(LOCATION, ModidExtended, CompatModid, i, false);
			MCFRecipesGen.PicketFence.recipe(LOCATION, ModidExtended, CompatModid, i, false);
			MCFRecipesGen.StockadeFence.recipe(LOCATION, ModidExtended, CompatModid, i, false);
			MCFRecipesGen.WiredFence.recipe(LOCATION, ModidExtended, CompatModid, i, false);
		}
	}
}