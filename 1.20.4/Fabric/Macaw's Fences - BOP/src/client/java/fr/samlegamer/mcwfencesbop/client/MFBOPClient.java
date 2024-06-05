package fr.samlegamer.mcwfencesbop.client;

import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MFBOPClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.dead_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.fir_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.hellbark_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.jacaranda_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.magic_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.mahogany_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.palm_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.redwood_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.umbran_wired_fence, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MFBOPBlocksRegistry.willow_wired_fence, RenderLayer.getCutout());
	}
}