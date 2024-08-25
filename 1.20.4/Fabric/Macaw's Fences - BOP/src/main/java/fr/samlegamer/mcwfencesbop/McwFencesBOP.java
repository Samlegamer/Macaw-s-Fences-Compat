package fr.samlegamer.mcwfencesbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class McwFencesBOP implements ModInitializer
{
	public static final String MODID = "mcwfencesbop";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup MFENCESBOP_CT = FabricItemGroup.builder()
            .icon(() -> new ItemStack(MFBOPBlocksRegistry.palm_highley_gate))
            .displayName(Text.literal("Macaw's Fences - BOP"))
            .entries((context, entries) -> {
    			entries.add(MFBOPBlocksRegistry.dead_picket_fence);
    			entries.add(MFBOPBlocksRegistry.dead_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.dead_horse_fence);
    			entries.add(MFBOPBlocksRegistry.dead_wired_fence);
    			entries.add(MFBOPBlocksRegistry.dead_highley_gate);
    			entries.add(MFBOPBlocksRegistry.dead_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.fir_picket_fence);
    			entries.add(MFBOPBlocksRegistry.fir_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.fir_horse_fence);
    			entries.add(MFBOPBlocksRegistry.fir_wired_fence);
    			entries.add(MFBOPBlocksRegistry.fir_highley_gate);
    			entries.add(MFBOPBlocksRegistry.fir_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.hellbark_picket_fence);
    			entries.add(MFBOPBlocksRegistry.hellbark_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.hellbark_horse_fence);
    			entries.add(MFBOPBlocksRegistry.hellbark_wired_fence);
    			entries.add(MFBOPBlocksRegistry.hellbark_highley_gate);
    			entries.add(MFBOPBlocksRegistry.hellbark_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.jacaranda_picket_fence);
    			entries.add(MFBOPBlocksRegistry.jacaranda_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.jacaranda_horse_fence);
    			entries.add(MFBOPBlocksRegistry.jacaranda_wired_fence);
    			entries.add(MFBOPBlocksRegistry.jacaranda_highley_gate);
    			entries.add(MFBOPBlocksRegistry.jacaranda_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.magic_picket_fence);
    			entries.add(MFBOPBlocksRegistry.magic_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.magic_horse_fence);
    			entries.add(MFBOPBlocksRegistry.magic_wired_fence);
    			entries.add(MFBOPBlocksRegistry.magic_highley_gate);
    			entries.add(MFBOPBlocksRegistry.magic_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.mahogany_picket_fence);
    			entries.add(MFBOPBlocksRegistry.mahogany_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.mahogany_horse_fence);
    			entries.add(MFBOPBlocksRegistry.mahogany_wired_fence);
    			entries.add(MFBOPBlocksRegistry.mahogany_highley_gate);
    			entries.add(MFBOPBlocksRegistry.mahogany_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.palm_picket_fence);
    			entries.add(MFBOPBlocksRegistry.palm_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.palm_horse_fence);
    			entries.add(MFBOPBlocksRegistry.palm_wired_fence);
    			entries.add(MFBOPBlocksRegistry.palm_highley_gate);
    			entries.add(MFBOPBlocksRegistry.palm_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.redwood_picket_fence);
    			entries.add(MFBOPBlocksRegistry.redwood_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.redwood_horse_fence);
    			entries.add(MFBOPBlocksRegistry.redwood_wired_fence);
    			entries.add(MFBOPBlocksRegistry.redwood_highley_gate);
    			entries.add(MFBOPBlocksRegistry.redwood_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.umbran_picket_fence);
    			entries.add(MFBOPBlocksRegistry.umbran_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.umbran_horse_fence);
    			entries.add(MFBOPBlocksRegistry.umbran_wired_fence);
    			entries.add(MFBOPBlocksRegistry.umbran_highley_gate);
    			entries.add(MFBOPBlocksRegistry.umbran_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.willow_picket_fence);
    			entries.add(MFBOPBlocksRegistry.willow_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.willow_horse_fence);
    			entries.add(MFBOPBlocksRegistry.willow_wired_fence);
    			entries.add(MFBOPBlocksRegistry.willow_highley_gate);
    			entries.add(MFBOPBlocksRegistry.willow_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.empyreal_picket_fence);
    			entries.add(MFBOPBlocksRegistry.empyreal_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.empyreal_horse_fence);
    			entries.add(MFBOPBlocksRegistry.empyreal_wired_fence);
    			entries.add(MFBOPBlocksRegistry.empyreal_highley_gate);
    			entries.add(MFBOPBlocksRegistry.empyreal_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.maple_picket_fence);
    			entries.add(MFBOPBlocksRegistry.maple_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.maple_horse_fence);
    			entries.add(MFBOPBlocksRegistry.maple_wired_fence);
    			entries.add(MFBOPBlocksRegistry.maple_highley_gate);
    			entries.add(MFBOPBlocksRegistry.maple_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.pine_picket_fence);
    			entries.add(MFBOPBlocksRegistry.pine_stockade_fence);
    			entries.add(MFBOPBlocksRegistry.pine_horse_fence);
    			entries.add(MFBOPBlocksRegistry.pine_wired_fence);
    			entries.add(MFBOPBlocksRegistry.pine_highley_gate);
    			entries.add(MFBOPBlocksRegistry.pine_pyramid_gate);
    			entries.add(MFBOPBlocksRegistry.dead_hedge);
    			entries.add(MFBOPBlocksRegistry.fir_hedge);
    			entries.add(MFBOPBlocksRegistry.hellbark_hedge);
    			entries.add(MFBOPBlocksRegistry.jacaranda_hedge);
    			entries.add(MFBOPBlocksRegistry.magic_hedge);
    			entries.add(MFBOPBlocksRegistry.mahogany_hedge);
    			entries.add(MFBOPBlocksRegistry.palm_hedge);
    			entries.add(MFBOPBlocksRegistry.redwood_hedge);
    			entries.add(MFBOPBlocksRegistry.umbran_hedge);
    			entries.add(MFBOPBlocksRegistry.willow_hedge);
    			entries.add(MFBOPBlocksRegistry.empyreal_hedge);
    			entries.add(MFBOPBlocksRegistry.pine_hedge);
    			entries.add(MFBOPBlocksRegistry.orange_maple_hedge);
    			entries.add(MFBOPBlocksRegistry.red_maple_hedge);
    			entries.add(MFBOPBlocksRegistry.yellow_maple_hedge);
    			entries.add(MFBOPBlocksRegistry.cypress_hedge);
    			entries.add(MFBOPBlocksRegistry.snowblossom_hedge);
    			entries.add(MFBOPBlocksRegistry.flowering_oak_hedge);
    			entries.add(MFBOPBlocksRegistry.rainbow_birch_hedge);
    			entries.add(MFBOPBlocksRegistry.origin_hedge);
            }).build();

    @Override
	public void onInitialize()
	{
    	LOGGER.info("Macaw's Fences - Biomes O' Plenty... Loading...");
        Registry.register(Registries.ITEM_GROUP, Identifier.of(MODID, "mfencesbop_ct"), MFENCESBOP_CT);
		MFBOPBlocksRegistry.registry();
    	LOGGER.info("Macaw's Fences - Biomes O' Plenty... Finish...");
	}
}