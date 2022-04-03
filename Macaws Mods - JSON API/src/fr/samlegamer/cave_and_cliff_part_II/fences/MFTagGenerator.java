package fr.samlegamer.cave_and_cliff_part_II.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MFTagGenerator
{
	public static void AxeDataGen(String LOCATION, String Modid, List<String> Mat)
	{		
		File file = new File(LOCATION + "MineableAxeData(Macaw's Fences).json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : Mat)
				{
					buffer.write("\""+Modid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_wired_fence\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"");
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}

	public static void FencesDataGen(String LOCATION, String Modid, List<String> Mat)
	{		
		File blk = new File(LOCATION + "FencesBlockData(Macaw's Fences).json");
		File itm = new File(LOCATION + "FencesItemData(Macaw's Fences).json");

		if(!blk.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(blk);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : Mat)
				{
					buffer.write("\""+Modid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_wired_fence\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"");
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				blk.createNewFile();
				System.out.println("Le fichier " + blk + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		if(!itm.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(itm);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : Mat)
				{
					buffer.write("\""+Modid+":"+i+"_picket_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_stockade_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_horse_fence\",");
					buffer.newLine();
					buffer.write("\""+Modid+":"+i+"_wired_fence\",");
					buffer.newLine();
				}
				
				buffer.write("\"\"");
				buffer.newLine();
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				itm.createNewFile();
				System.out.println("Le fichier " + itm + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}
}