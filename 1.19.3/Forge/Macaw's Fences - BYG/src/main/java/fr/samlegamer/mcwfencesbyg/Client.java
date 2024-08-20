package fr.samlegamer.mcwfencesbyg;

import fr.samlegamer.mcwfencesbyg.block.MFBYGBlocksRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwFencesBYG.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block e)
    {
    	/*
    	 * Thanks Potion Studios
    	 * https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/master/Forge/src/main/java/net/potionstudios/biomeswevegone/forge/client/BiomesWeveGoneClientForge.java#L83
    	 * only the parameters have been recovered to match the original leaves
    	 */
        e.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getAverageFoliageColor(view, pos) : FoliageColor.get(0.5D, 1.0D), 
        		MFBYGBlocksRegistry.mahogany_hedge.get(), 
        		MFBYGBlocksRegistry.maple_hedge.get());
    }
    
	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item e)
    {
    	/*
    	 * Thanks Potion Studios
    	 * https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/master/Forge/src/main/java/net/potionstudios/biomeswevegone/forge/client/BiomesWeveGoneClientForge.java#L95
    	 * only the parameters have been recovered to match the original leaves
    	 */
        e.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return e.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, MFBYGBlocksRegistry.mahogany_hedge.get(), MFBYGBlocksRegistry.maple_hedge.get());
    }
}