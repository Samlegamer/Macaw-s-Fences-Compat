package fr.samlegamer.mcwfencesbop;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import terrablender.core.TerraBlender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mcwfences.kikoz.MacawsFences;

import biomesoplenty.core.BiomesOPlenty;
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
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MFBOPBlocksRegistry.registry();
        LOGGER.info("Macaw's Fences - Biome O' Plenty : Is Charged");
    }
	
    void client(FMLClientSetupEvent event)
	{
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_highley_gate.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.picket_fenceAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.stockade_fenceAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.horse_fenceAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.wired_fenceAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.highley_gateAll.get(), RenderType.cutout());
	}
	
	static class TabsMFBOP extends CreativeModeTab
	{
		public TabsMFBOP(String p_i1853_2_)
		{
			super(p_i1853_2_);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(MFBOPBlocksRegistry.cherry_picket_fence.get());
		}
		
		@Override
		public boolean hasSearchBar()
		{
			return false;
		}
	}
	
	private void require(TerraBlender t, BiomesOPlenty bop, MacawsFences bridges) {}
}