package fr.samlegamer.mcwfencesbop.block;

import com.mcwfences.kikoz.objects.FuelItemBlock;
import com.mcwfences.kikoz.objects.WiredFence;
import fr.samlegamer.mcwfencesbop.McwFencesBOP;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = McwFencesBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MFBOPBlocksRegistry
{
	public static Block cherry_picket_fence, cherry_stockade_fence, cherry_horse_fence, cherry_wired_fence, cherry_highley_gate, cherry_pyramid_gate;
	public static Block dead_picket_fence, dead_stockade_fence, dead_horse_fence, dead_wired_fence, dead_highley_gate, dead_pyramid_gate;
	public static Block fir_picket_fence, fir_stockade_fence, fir_horse_fence, fir_wired_fence, fir_highley_gate, fir_pyramid_gate;
	public static Block hellbark_picket_fence, hellbark_stockade_fence, hellbark_horse_fence, hellbark_wired_fence, hellbark_highley_gate, hellbark_pyramid_gate;
	public static Block jacaranda_picket_fence, jacaranda_stockade_fence, jacaranda_horse_fence, jacaranda_wired_fence, jacaranda_highley_gate, jacaranda_pyramid_gate;
	public static Block magic_picket_fence, magic_stockade_fence, magic_horse_fence, magic_wired_fence, magic_highley_gate, magic_pyramid_gate;
	public static Block mahogany_picket_fence, mahogany_stockade_fence, mahogany_horse_fence, mahogany_wired_fence, mahogany_highley_gate, mahogany_pyramid_gate;
	public static Block palm_picket_fence, palm_stockade_fence, palm_horse_fence, palm_wired_fence, palm_highley_gate, palm_pyramid_gate;
	public static Block redwood_picket_fence, redwood_stockade_fence, redwood_horse_fence, redwood_wired_fence, redwood_highley_gate, redwood_pyramid_gate;
	public static Block umbran_picket_fence, umbran_stockade_fence, umbran_horse_fence, umbran_wired_fence, umbran_highley_gate, umbran_pyramid_gate;
	public static Block willow_picket_fence, willow_stockade_fence, willow_horse_fence, willow_wired_fence, willow_highley_gate, willow_pyramid_gate;
	
	@SubscribeEvent
	public static void registry(final RegistryEvent.Register<Block> event)
	{
		cherry_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "cherry_picket_fence");
		cherry_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "cherry_stockade_fence");
		cherry_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "cherry_horse_fence");
		cherry_wired_fence = registerBlock(new WiredFence(null), "cherry_wired_fence");
		cherry_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "cherry_highley_gate");
		cherry_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "cherry_pyramid_gate");
		
		dead_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "dead_picket_fence");
		dead_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "dead_stockade_fence");
		dead_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "dead_horse_fence");
		dead_wired_fence = registerBlock(new WiredFence(null), "dead_wired_fence");
		dead_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "dead_highley_gate");
		dead_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "dead_pyramid_gate");

		fir_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "fir_picket_fence");
		fir_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "fir_stockade_fence");
		fir_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "fir_horse_fence");
		fir_wired_fence = registerBlock(new WiredFence(null), "fir_wired_fence");
		fir_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "fir_highley_gate");
		fir_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "fir_pyramid_gate");

		hellbark_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "hellbark_picket_fence");
		hellbark_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "hellbark_stockade_fence");
		hellbark_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "hellbark_horse_fence");
		hellbark_wired_fence = registerBlock(new WiredFence(null), "hellbark_wired_fence");
		hellbark_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "hellbark_highley_gate");
		hellbark_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "hellbark_pyramid_gate");

		jacaranda_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "jacaranda_picket_fence");
		jacaranda_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "jacaranda_stockade_fence");
		jacaranda_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "jacaranda_horse_fence");
		jacaranda_wired_fence = registerBlock(new WiredFence(null), "jacaranda_wired_fence");
		jacaranda_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "jacaranda_highley_gate");
		jacaranda_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "jacaranda_pyramid_gate");

		magic_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "magic_picket_fence");
		magic_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "magic_stockade_fence");
		magic_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "magic_horse_fence");
		magic_wired_fence = registerBlock(new WiredFence(null), "magic_wired_fence");
		magic_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "magic_highley_gate");
		magic_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "magic_pyramid_gate");

		mahogany_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "mahogany_picket_fence");
		mahogany_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "mahogany_stockade_fence");
		mahogany_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "mahogany_horse_fence");
		mahogany_wired_fence = registerBlock(new WiredFence(null), "mahogany_wired_fence");
		mahogany_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "mahogany_highley_gate");
		mahogany_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "mahogany_pyramid_gate");

		palm_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "palm_picket_fence");
		palm_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "palm_stockade_fence");
		palm_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "palm_horse_fence");
		palm_wired_fence = registerBlock(new WiredFence(null), "palm_wired_fence");
		palm_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "palm_highley_gate");
		palm_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "palm_pyramid_gate");

		redwood_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "redwood_picket_fence");
		redwood_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "redwood_stockade_fence");
		redwood_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "redwood_horse_fence");
		redwood_wired_fence = registerBlock(new WiredFence(null), "redwood_wired_fence");
		redwood_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "redwood_highley_gate");
		redwood_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "redwood_pyramid_gate");

		umbran_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "umbran_picket_fence");
		umbran_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "umbran_stockade_fence");
		umbran_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "umbran_horse_fence");
		umbran_wired_fence = registerBlock(new WiredFence(null), "umbran_wired_fence");
		umbran_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "umbran_highley_gate");
		umbran_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "umbran_pyramid_gate");

		willow_picket_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "willow_picket_fence");
		willow_stockade_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "willow_stockade_fence");
		willow_horse_fence = registerBlock(new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), "willow_horse_fence");
		willow_wired_fence = registerBlock(new WiredFence(null), "willow_wired_fence");
		willow_highley_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "willow_highley_gate");
		willow_pyramid_gate = registerBlock(new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), "willow_pyramid_gate");
	}
	
	public static Block registerBlock(Block block, String name)
    {
		FuelItemBlock itemBlock = new FuelItemBlock(block, new Item.Properties().tab(McwFencesBOP.TAB_GROUP));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
}