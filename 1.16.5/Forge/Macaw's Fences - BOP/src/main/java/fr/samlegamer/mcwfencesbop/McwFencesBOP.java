package fr.samlegamer.mcwfencesbop;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;

@Mod(McwFencesBOP.MODID)
public class McwFencesBOP
{
	public static final String MODID = "mcwfencesbop";
	public static final TabsMFBOP TAB_GROUP = new TabsMFBOP("tab_mfbop");
    private static final Logger LOGGER = LogManager.getLogger();

    public McwFencesBOP()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        LOGGER.info("Macaw's Fences - Biome O' Plenty : Loading ...");
		MinecraftForge.EVENT_BUS.register(MFBOPBlocksRegistry.class);
        LOGGER.info("Macaw's Fences - Biome O' Plenty : Is Charged");
    }
	
    void client(FMLClientSetupEvent event)
	{
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.cherry_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.cherry_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.cherry_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.cherry_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.cherry_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.cherry_pyramid_gate, RenderType.cutout());
    	
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.dead_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.dead_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.dead_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.dead_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.dead_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.dead_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.fir_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.fir_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.fir_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.fir_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.fir_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.fir_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.hellbark_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.hellbark_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.hellbark_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.hellbark_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.hellbark_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.hellbark_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.jacaranda_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.jacaranda_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.jacaranda_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.jacaranda_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.jacaranda_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.jacaranda_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.magic_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.magic_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.magic_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.magic_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.magic_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.magic_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.mahogany_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.mahogany_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.mahogany_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.mahogany_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.mahogany_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.mahogany_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.palm_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.palm_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.palm_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.palm_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.palm_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.palm_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.redwood_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.redwood_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.redwood_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.redwood_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.redwood_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.redwood_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.umbran_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.umbran_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.umbran_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.umbran_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.umbran_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.umbran_pyramid_gate, RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.willow_picket_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.willow_stockade_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.willow_horse_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.willow_wired_fence, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.willow_highley_gate, RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBOPBlocksRegistry.willow_pyramid_gate, RenderType.cutout());
	}
	
	static class TabsMFBOP extends ItemGroup
	{
		public TabsMFBOP(String p_i1853_2_)
		{
			super(p_i1853_2_);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(MFBOPBlocksRegistry.cherry_picket_fence);
		}
		
		@Override
		public boolean hasSearchBar()
		{
			return false;
		}
	}
}