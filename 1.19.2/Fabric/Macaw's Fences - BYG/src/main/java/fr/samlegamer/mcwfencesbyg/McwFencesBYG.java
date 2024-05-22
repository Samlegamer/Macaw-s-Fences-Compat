package fr.samlegamer.mcwfencesbyg;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbyg.block.MFBYGBlocksRegistry;

public class McwFencesBYG implements ModInitializer
{
	public static final String MODID = "z_mcwfencesbyg";
    private static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(MODID, "tab_mfbyg"), () -> new ItemStack(MFBYGBlocksRegistry.aspen_picket_fence));

	@Override
	public void onInitialize()
	{
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Loading ...");
    	MFBYGBlocksRegistry.registry();
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Is Charged");
	}
}