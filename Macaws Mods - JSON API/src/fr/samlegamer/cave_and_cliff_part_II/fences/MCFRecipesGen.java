package fr.samlegamer.cave_and_cliff_part_II.fences;

import java.io.File;

import fr.samlegamer.utils.APIWriter;

public class MCFRecipesGen
{//+ material + (isStemTexture ? "_stem" : "_log") +
	public static void init(String location)
	{
		File folderData = new File(location + "data/");
		File folderRecipes = new File(location + "data/recipes/");
		File folderLoot_Tables = new File(location + "data/loot_tables/");
		File folderBlocks = new File(location + "data/loot_tables/blocks/");

		if(!folderData.exists() || !folderRecipes.exists() || !folderLoot_Tables.exists() || !folderBlocks.exists())
		{
			folderData.mkdir();
			folderRecipes.mkdir();
			folderLoot_Tables.mkdir();
			folderBlocks.mkdir();
		}
	}
	
	public static class HighleyGate
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_highley_gate" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "  \"type\": \"minecraft:block\",\r\n"
					+ "  \"pools\": [\r\n"
					+ "    {\r\n"
					+ "      \"rolls\": 1,\r\n"
					+ "      \"entries\": [\r\n"
					+ "        {\r\n"
					+ "          \"type\": \"minecraft:item\",\r\n"
					+ "          \"name\": \""+ModidCompat+":"+material+"_highley_gate\"\r\n"
					+ "        }\r\n"
					+ "      ],\r\n"
					+ "      \"conditions\": [\r\n"
					+ "        {\r\n"
					+ "          \"condition\": \"minecraft:survives_explosion\"\r\n"
					+ "        }\r\n"
					+ "      ]\r\n"
					+ "    }\r\n"
					+ "  ]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_highley_gate" + ".json");
			
			APIWriter.write(location, file,"{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "		\"ABA\",\r\n"
					+ "		\"ABA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "        \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:stick\"\r\n"
					+ "        },    \r\n"
					+ "        \r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_highley_gate\",\r\n"
					+ "        \"count\": 1\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class HorseFence
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_horse_fence" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "  \"type\": \"minecraft:block\",\r\n"
					+ "  \"pools\": [\r\n"
					+ "    {\r\n"
					+ "      \"rolls\": 1,\r\n"
					+ "      \"entries\": [\r\n"
					+ "        {\r\n"
					+ "          \"type\": \"minecraft:item\",\r\n"
					+ "          \"name\": \""+ModidCompat+":"+material+"_horse_fence\"\r\n"
					+ "        }\r\n"
					+ "      ],\r\n"
					+ "      \"conditions\": [\r\n"
					+ "        {\r\n"
					+ "          \"condition\": \"minecraft:survives_explosion\"\r\n"
					+ "        }\r\n"
					+ "      ]\r\n"
					+ "    }\r\n"
					+ "  ]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_horse_fence" + ".json");
			
			APIWriter.write(location, file,"{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "		\"ABA\",\r\n"
					+ "		\"ABA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:stick\"\r\n"
					+ "        },    \r\n"
					+ "        \r\n"
					+ "        \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_horse_fence\",\r\n"
					+ "        \"count\": 3\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class PicketFence
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_picket_fence" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "  \"type\": \"minecraft:block\",\r\n"
					+ "  \"pools\": [\r\n"
					+ "    {\r\n"
					+ "      \"rolls\": 1,\r\n"
					+ "      \"entries\": [\r\n"
					+ "        {\r\n"
					+ "          \"type\": \"minecraft:item\",\r\n"
					+ "          \"name\": \""+ModidCompat+":"+material+"_picket_fence\"\r\n"
					+ "        }\r\n"
					+ "      ],\r\n"
					+ "      \"conditions\": [\r\n"
					+ "        {\r\n"
					+ "          \"condition\": \"minecraft:survives_explosion\"\r\n"
					+ "        }\r\n"
					+ "      ]\r\n"
					+ "    }\r\n"
					+ "  ]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_picket_fence" + ".json");
			
			APIWriter.write(location, file,"{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "		\"CBC\",\r\n"
					+ "		\"CAC\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "        \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:stick\"\r\n"
					+ "        },  \r\n"
					+ "\r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_planks\"\r\n"
					+ "        },   		\r\n"
					+ "        \r\n"
					+ "        \"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_picket_fence\",\r\n"
					+ "        \"count\": 3\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class StockadeFence
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_stockade_fence" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "  \"type\": \"minecraft:block\",\r\n"
					+ "  \"pools\": [\r\n"
					+ "    {\r\n"
					+ "      \"rolls\": 1,\r\n"
					+ "      \"entries\": [\r\n"
					+ "        {\r\n"
					+ "          \"type\": \"minecraft:item\",\r\n"
					+ "          \"name\": \""+ModidCompat+":"+material+"_stockade_fence\"\r\n"
					+ "        }\r\n"
					+ "      ],\r\n"
					+ "      \"conditions\": [\r\n"
					+ "        {\r\n"
					+ "          \"condition\": \"minecraft:survives_explosion\"\r\n"
					+ "        }\r\n"
					+ "      ]\r\n"
					+ "    }\r\n"
					+ "  ]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_stockade_fence" + ".json");
			
			APIWriter.write(location, file,"{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "		\"ABA\",\r\n"
					+ "		\"ABA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "        \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        },    \r\n"
					+ "        \r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+material+"_planks\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+material+"_stockade_fence\",\r\n"
					+ "        \"count\": 3\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}

	public static class WiredFence
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_wired_fence" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
					+ "  \"type\": \"minecraft:block\",\r\n"
					+ "  \"pools\": [\r\n"
					+ "    {\r\n"
					+ "      \"rolls\": 1,\r\n"
					+ "      \"entries\": [\r\n"
					+ "        {\r\n"
					+ "          \"type\": \"minecraft:item\",\r\n"
					+ "          \"name\": \""+ModidCompat+":"+material+"_wired_fence\"\r\n"
					+ "        }\r\n"
					+ "      ],\r\n"
					+ "      \"conditions\": [\r\n"
					+ "        {\r\n"
					+ "          \"condition\": \"minecraft:survives_explosion\"\r\n"
					+ "        }\r\n"
					+ "      ]\r\n"
					+ "    }\r\n"
					+ "  ]\r\n"
					+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_wired_fence" + ".json");
			
			APIWriter.write(location, file,"{\r\n"
					+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
					+ "    \r\n"
					+ "    \"pattern\":\r\n"
					+ "    [\r\n"
					+ "		\"ACA\",\r\n"
					+ "		\"ABA\"\r\n"
					+ "    ],\r\n"
					+ "    \r\n"
					+ "    \"key\":\r\n"
					+ "    { \r\n"
					+ "        \"A\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:stick\"\r\n"
					+ "        },    \r\n"
					+ "        \r\n"
					+ "        \"B\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
					+ "        },   		\r\n"
					+ "        \r\n"
					+ "        \"C\":\r\n"
					+ "        {\r\n"
					+ "            \"item\": \"minecraft:iron_bars\"\r\n"
					+ "        }\r\n"
					+ "    },\r\n"
					+ "    \r\n"
					+ "    \"result\":\r\n"
					+ "    {\r\n"
					+ "        \"item\":  \""+ModidCompat+":"+ material +"_wired_fence\",\r\n"
					+ "        \"count\": 3\r\n"
					+ "    }\r\n"
					+ "}");					
		}
	}
}