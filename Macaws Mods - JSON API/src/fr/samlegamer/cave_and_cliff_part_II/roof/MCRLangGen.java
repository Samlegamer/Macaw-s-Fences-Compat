package fr.samlegamer.cave_and_cliff_part_II.roof;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.samlegamer.Main;

public class MCRLangGen
{
	public static void initAllEnglish(String Modid, String mat, String matLang)
	{		
		File file = new File(Main.LOCATION + mat + " En_Us_Wood_Roofs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
								
				buffer.write("\"block."+Modid+"."+mat+"_roof\":\""+matLang+" Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_attic_roof\":\""+matLang+" Attic Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_cube_roof\":\""+matLang+" Cube Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_top_roof\":\""+matLang+" Top Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_lower_roof\":\""+matLang+" Lower Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_steep_roof\":\""+matLang+" Steep Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_upper_lower_roof\":\""+matLang+" Upper Lower Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_upper_steep_roof\":\""+matLang+" Upper Steep Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_planks_roof\":\""+matLang+" Planks Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_planks_attic_roof\":\""+matLang+" Planks Attic Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_planks_cube_roof\":\""+matLang+" Planks Cube Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_planks_top_roof\":\""+matLang+" Planks Top Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_planks_lower_roof\":\""+matLang+" Planks Lower Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_planks_steep_roof\":\""+matLang+" Planks Steep Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_planks_upper_lower_roof\":\""+matLang+" Planks Upper Lower Roof\",");
				buffer.newLine();
				buffer.write("\"block."+Modid+"."+mat+"_planks_upper_steep_roof\":\""+matLang+" Planks Upper Steep Roof\",");
				buffer.newLine();				

				buffer.write("//Finish");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Main.LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}