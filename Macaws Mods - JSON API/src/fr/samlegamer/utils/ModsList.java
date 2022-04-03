package fr.samlegamer.utils;

import java.util.ArrayList;
import java.util.List;

public class ModsList
{
	public static void byg(ArrayList<String> MATERIAL, boolean isStem)
	{
		if(!isStem)
		{
			MATERIAL.add("aspen");
			MATERIAL.add("baobab");
			MATERIAL.add("blue_enchanted");
			MATERIAL.add("cherry");
			MATERIAL.add("cika");
			MATERIAL.add("cypress");
			MATERIAL.add("ebony");
			MATERIAL.add("ether");
			MATERIAL.add("fir");
			MATERIAL.add("green_enchanted");
			MATERIAL.add("holly");
			MATERIAL.add("jacaranda");
			MATERIAL.add("lament");
			MATERIAL.add("mahogany");
			MATERIAL.add("mangrove");
			MATERIAL.add("maple");
			MATERIAL.add("nightshade");
			MATERIAL.add("palm");
			MATERIAL.add("pine");
			MATERIAL.add("rainbow_eucalyptus");
			MATERIAL.add("redwood");
			MATERIAL.add("skyris");
			MATERIAL.add("willow");
			MATERIAL.add("witch_hazel");
			MATERIAL.add("zelkova");
		}
		
		if(isStem)
		{
			MATERIAL.add("bulbis");
			MATERIAL.add("imparius");
			MATERIAL.add("sythian");
		}
	}
	
	public static void bop(List<String> MATERIAL)
	{
		MATERIAL.add("cherry");
		MATERIAL.add("dead");
		MATERIAL.add("fir");
		MATERIAL.add("hellbark");
		MATERIAL.add("jacaranda");
		MATERIAL.add("magic");
		MATERIAL.add("mahogany");
		MATERIAL.add("palm");
		MATERIAL.add("redwood");
		MATERIAL.add("umbran");
		MATERIAL.add("willow");
	}
	
	public static void bopLang(List<String> MAJ_MAT)
	{
		MAJ_MAT.add("Cherry");
		MAJ_MAT.add("Dead");
		MAJ_MAT.add("Fir");
		MAJ_MAT.add("Hellbark");
		MAJ_MAT.add("Jacaranda");
		MAJ_MAT.add("Magic");
		MAJ_MAT.add("Mahogany");
		MAJ_MAT.add("Palm");
		MAJ_MAT.add("Redwood");
		MAJ_MAT.add("Umbran");
		MAJ_MAT.add("Willow");
	}

	
	public static void shroomed(ArrayList<String> MATERIAL)
	{
		MATERIAL.add("blue_hard_mushroom");
		MATERIAL.add("hard_mushroom");
		MATERIAL.add("orange_hard_mushroom");
		MATERIAL.add("purple_hard_mushroom");
	}
}