package fr.samlegamer.mods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.samlegamer.utils.APIWriter;

public class MacawsFences
{//+ nameMaterial + (isStemTexture ? "_stem" : "_log") +
	public static void InitFolders(String location)
	{
		File folderBlockstates = new File(location + "blockstates/");
		File folderModels = new File(location + "models/");
		File folderBlock = new File(location + "models/block/");
		File folderItem = new File(location + "models/item/");
		File folderhighley_gate = new File(location + "models/block/highley_gate/");
		File folderhorse = new File(location + "models/block/horse/");
		File folderinventory = new File(location + "models/block/inventory/");
		File foldermodern_wall = new File(location + "models/block/modern_wall/");
		File folderpicket = new File(location + "models/block/picket/");
		File folderstockade = new File(location + "models/block/stockade/");
		File folderwired = new File(location + "models/block/wired/");
		
		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists()
		|| !folderItem.exists() || !folderhighley_gate.exists() 
		|| !folderhorse.exists() || !folderinventory.exists() || !foldermodern_wall.exists()
		|| !folderpicket.exists() || !folderstockade.exists() || !folderwired.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderItem.mkdir();
			folderhighley_gate.mkdir();
			folderhorse.mkdir();
			folderinventory.mkdir();
			foldermodern_wall.mkdir();
			folderpicket.mkdir();
			folderstockade.mkdir();
			folderwired.mkdir();
		}
	}
	
	public static class HighleyGate
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_highley_gate" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"variants\": {\r\n"
						+ "    \"facing=east,in_wall=false,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 270,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=east,in_wall=false,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 270,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=east,in_wall=true,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 270,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=east,in_wall=true,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 270,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=north,in_wall=false,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 180,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=north,in_wall=false,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 180,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=north,in_wall=true,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 180,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=north,in_wall=true,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 180,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=south,in_wall=false,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=south,in_wall=false,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=south,in_wall=true,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=south,in_wall=true,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=west,in_wall=false,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 90,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=west,in_wall=false,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 90,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=west,in_wall=true,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 90,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=west,in_wall=true,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 90,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    }\r\n"
						+ "  }\r\n"
						+ "}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
		File p1 = new File(location + "/models/block/highley_gate/" + nameMaterial + "_highley_gate" + ".json");
		File p2 = new File(location + "/models/block/highley_gate/" + nameMaterial + "_highley_gate_open" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/highley_gate\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!p2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p2);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/highley_gate_open\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
				
				buffer.close();
				writer.close();
				p2.createNewFile();
				System.out.println("Le fichier " + p2 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_highley_gate" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/inventory/"+mat+"_highley_gate\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	}
	
	public static class HorseFence
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/"+material+"_horse_fence" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "    {\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/horse/"+material+"_log_fence_post\"\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"north\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/horse/"+material+"_horse_fence_side\",\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"east\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/horse/"+material+"_horse_fence_side\",\r\n"
						+ "        \"y\": 90,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"south\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/horse/"+material+"_horse_fence_side\",\r\n"
						+ "        \"y\": 180,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"west\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/horse/"+material+"_horse_fence_side\",\r\n"
						+ "        \"y\": 270,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File p1 = new File(location + "/models/block/horse/" + nameMaterial + "_horse_fence_side" + ".json");
			File p2 = new File(location + "/models/block/horse/" + nameMaterial + "_log_fence_post" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/horse_fence_side\",\r\n"
						+ "\"textures\":{\"texture\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
						+ "\"1_texture\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!p2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p2);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/log_fence_post\",\r\n"
						+ "\"textures\":{\"5\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
				
				buffer.close();
				writer.close();
				p2.createNewFile();
				System.out.println("Le fichier " + p2 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_horse_fence" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\""+modid+":block/inventory/"+mat+"_horse_fence\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		}
	}
	
	public static class PicketFence
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/"+material+"_picket_fence" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "    {\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/horse/"+material+"_log_fence_post\"\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"north\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/picket/"+material+"_picket_fence_side\",\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"east\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/picket/"+material+"_picket_fence_side\",\r\n"
						+ "        \"y\": 90,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"south\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/picket/"+material+"_picket_fence_side\",\r\n"
						+ "        \"y\": 180,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"west\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/picket/"+material+"_picket_fence_side\",\r\n"
						+ "        \"y\": 270,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File p1 = new File(location + "/models/block/picket/" + nameMaterial + "_picket_fence_side" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/picket_fence_side\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_picket_fence" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/inventory/"+mat+"_picket_fence\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		}
	}

	public static class StockadeFence
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/"+material+"_stockade_fence" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "    {\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/horse/"+material+"_log_fence_post\"\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"north\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/stockade/"+material+"_stockade_fence_side\",\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"east\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/stockade/"+material+"_stockade_fence_side\",\r\n"
						+ "        \"y\": 90,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"south\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/stockade/"+material+"_stockade_fence_side\",\r\n"
						+ "        \"y\": 180,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"west\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/stockade/"+material+"_stockade_fence_side\",\r\n"
						+ "        \"y\": 270,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File p1 = new File(location + "/models/block/stockade/" + nameMaterial + "_stockade_fence_side" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/stockade_fence_side\",\r\n"
						+ "\"textures\":{\"4\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
						+ "\"5\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_stockade_fence" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/inventory/"+mat+"_stockade_fence\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		}
	}
	
	public static class WiredFence
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/"+material+"_wired_fence" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "      {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"north\": \"false\",\r\n"
						+ "		\"east\": \"false\",\r\n"
						+ "		\"west\": \"false\",\r\n"
						+ "		\"south\": \"false\"\r\n"
						+ "		\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_post\"\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"north\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_post\"\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"east\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_post\",\r\n"
						+ "        \"y\": 90\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"south\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_post\"\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"west\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_post\",\r\n"
						+ "        \"y\": 90\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"north\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_side\",\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"east\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_side\",\r\n"
						+ "        \"y\": 90,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"south\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_side\",\r\n"
						+ "        \"y\": 180,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": {\r\n"
						+ "        \"west\": \"true\"\r\n"
						+ "      },\r\n"
						+ "      \"apply\": {\r\n"
						+ "        \"model\": \""+modid+":block/wired/"+material+"_wired_fence_side\",\r\n"
						+ "        \"y\": 270,\r\n"
						+ "        \"uvlock\": false\r\n"
						+ "      }\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{//PAS FINI ICI
			File p1 = new File(location + "/models/block/wired/" + nameMaterial + "_wired_fence_post" + ".json");
			File p2 = new File(location + "/models/block/wired/" + nameMaterial + "_wired_fence_side" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/wired_fence_post\",\r\n"
						+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"_top\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!p2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p2);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwfences:block/parent/wired_fence_side\",\r\n"
						+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"_top\",\r\n"
						+ "\"4\": \"mcwfences:block/wire_fence\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
						+ "\"1_texture\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
				
				buffer.close();
				writer.close();
				p2.createNewFile();
				System.out.println("Le fichier " + p2 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_wired_fence" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/inventory/"+mat+"_wired_fence\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		}
	}
	
	public static class Inventory
	{
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File p1 = new File(location + "/models/block/inventory/" + nameMaterial + "_highley_gate" + ".json");
			File p2 = new File(location + "/models/block/inventory/" + nameMaterial + "_horse_fence" + ".json");
			File p3 = new File(location + "/models/block/inventory/" + nameMaterial + "_picket_fence" + ".json");
			File p4 = new File(location + "/models/block/inventory/" + nameMaterial + "_stockade_fence" + ".json");
			File p5 = new File(location + "/models/block/inventory/" + nameMaterial + "_wired_fence" + ".json");

			APIWriter.write(location, p1, "{\"parent\":\"mcwfences:block/parent/inventory/highley_gate\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
						+ "\"1_texture\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
			
			APIWriter.write(location, p2, "{\"parent\":\"mcwfences:block/parent/inventory/horse_fence\",\r\n"
					+ "\"textures\":{\"1_texture\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
					+ "\"1_1_texture\": \""+TextureLocationFormodid+"/stripped_"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "\"wall\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
			
			APIWriter.write(location, p3, "{\"parent\": \"mcwfences:block/parent/inventory/picket_fence\",\r\n"
					+ "\"textures\":{\"5\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\"}}");
			
			APIWriter.write(location, p4, "{\"parent\": \"mcwfences:block/parent/inventory/stockade_fence\",\r\n"
					+ "\"textures\":{\"5\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
					+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\"}}");

			APIWriter.write(location, p5, "{\"parent\": \"mcwfences:block/parent/inventory/wired_fence\",\r\n"
					+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"_top\",\r\n"
					+ "\"4\": \"mcwfences:block/wire_fence\",\r\n"
					+ "\"1_texture\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");

		
		}
	}
}