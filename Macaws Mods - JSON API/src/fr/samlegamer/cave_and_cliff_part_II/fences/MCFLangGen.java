package fr.samlegamer.cave_and_cliff_part_II.fences;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.Main;

public class MCFLangGen
{
	public static void initAllEnglish(String Modid, List<String> mat, List<String> matLang)
	{		
		File file = new File(Main.LOCATION + " En_Us_Wood_Roofs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(String i : mat)
				for(String e : matLang)
				{
					buffer.write("\"block."+Modid+"."+i+"_picket_fence\":\""+e+" Picket Fence\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+i+"_stockade_fence\":\""+e+" Stockade Fence\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+i+"_horse_fence\":\""+e+" Horse Fence\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+i+"_wired_fence\":\""+e+" Wired Fence\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+i+"_highley_gate\":\""+e+" Highley Gate\",");
					buffer.newLine();
				}

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