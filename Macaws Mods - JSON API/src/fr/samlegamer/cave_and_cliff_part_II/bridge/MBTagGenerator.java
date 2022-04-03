package fr.samlegamer.cave_and_cliff_part_II.bridge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MBTagGenerator
{
	public static void AxeDataGen(String LOCATION, String Modid, ArrayList<String> Mat)
	{		
		File file = new File(LOCATION + "MineableAxeData.json");
		
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
					buffer.write("    \""+Modid+":"+i+"_log_bridge_middle\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":rope_"+i+"_bridge\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_bridge_pier\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_log_bridge_stair\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_rope_bridge_stair\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_rail_bridge\",\r\n"+ "");
					buffer.newLine();
				}
				
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
}