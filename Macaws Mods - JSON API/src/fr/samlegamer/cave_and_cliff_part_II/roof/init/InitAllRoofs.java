package fr.samlegamer.cave_and_cliff_part_II.roof.init;

import java.util.ArrayList;

import fr.samlegamer.cave_and_cliff_part_II.roof.MCRRecipesGen;
import fr.samlegamer.cave_and_cliff_part_II.roof.MRTagGenerator;
import fr.samlegamer.cave_and_cliff_part_II.roof.MacawsRoofs;

public class InitAllRoofs
{
	public static void init(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, ArrayList<String> MATERIAL, boolean isStem)
	{
		MRTagGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
		MCRRecipesGen.init(LOCATION);
		MacawsRoofs.init(LOCATION);

		for(String i : MATERIAL)
		{
			MacawsRoofs.Log_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);
			
			MacawsRoofs.Planks_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Cube_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Cube_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Cube_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Cube_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperLog_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			//MacawsRoofNewJsonApi.UpperLog_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperLog_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperLog_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperLog_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperLog_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperPlanks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			//MacawsRoofNewJsonApi.UpperPlanks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperPlanks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperPlanks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperPlanks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperPlanks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			
			MCRRecipesGen.AtticLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.AtticLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);
			
			MCRRecipesGen.AtticPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.AtticPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.CubeLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.CubeLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.CubePlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.CubePlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.LowerLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.LowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.LowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.LowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.RoofLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.RoofLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.RoofPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.RoofPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.SteepLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.SteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.SteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.SteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.TopLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.TopLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.TopPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.TopPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.UpperLowerLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperLowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.UpperLowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperLowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.UpperSteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperSteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.UpperSteepLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperSteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);
		}
	}
}
