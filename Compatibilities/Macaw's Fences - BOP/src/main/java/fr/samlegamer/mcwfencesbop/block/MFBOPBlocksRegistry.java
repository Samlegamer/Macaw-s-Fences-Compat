package fr.samlegamer.mcwfencesbop.block;

import java.util.ArrayList;

import com.google.common.base.Supplier;
import com.mcwfences.kikoz.objects.FuelItemBlock;
import com.mcwfences.kikoz.objects.GateFence;
import com.mcwfences.kikoz.objects.WiredFence;
import com.mcwfences.kikoz.objects.WoodenFence;
import fr.samlegamer.mcwfencesbop.McwFencesBOP;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MFBOPBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwFencesBOP.MODID);    
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwFencesBOP.MODID);
	
	public static final RegistryObject<Block> cherry_picket_fence = createBlock("cherry_picket_fence", () -> new WoodenFence());
	public static final RegistryObject<Block> cherry_stockade_fence = createBlock("cherry_stockade_fence", () -> new WoodenFence());
	public static final RegistryObject<Block> cherry_horse_fence = createBlock("cherry_horse_fence", () -> new WoodenFence());
	public static final RegistryObject<Block> cherry_wired_fence = createBlock("cherry_wired_fence", () -> new WiredFence());
	public static final RegistryObject<Block> cherry_highley_gate = createBlock("cherry_highley_gate", () -> new GateFence(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static RegistryObject<Block> picket_fenceAll, stockade_fenceAll, horse_fenceAll, wired_fenceAll, highley_gateAll;

    public static void registry()
    {
    	ArrayList<String> MATERIAL = new ArrayList<String>();
    	
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

		for(String i : MATERIAL)
		{
			picket_fenceAll = createBlock(""+i+"_picket_fence", () -> new WoodenFence());
			stockade_fenceAll = createBlock(""+i+"_stockade_fence", () -> new WoodenFence());
			horse_fenceAll = createBlock(""+i+"_horse_fence", () -> new WoodenFence());
			wired_fenceAll = createBlock(""+i+"_wired_fence", () -> new WiredFence());
			highley_gateAll = createBlock(""+i+"_highley_gate", () -> new GateFence(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
		}
    }
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(McwFencesBOP.TAB_GROUP)));
        return block;
    }
}