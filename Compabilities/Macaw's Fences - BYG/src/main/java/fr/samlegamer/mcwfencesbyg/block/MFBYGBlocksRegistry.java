package fr.samlegamer.mcwfencesbyg.block;

import java.util.ArrayList;

import com.google.common.base.Supplier;
import com.mcwfences.kikoz.objects.FuelItemBlock;
import com.mcwfences.kikoz.objects.GateFence;
import com.mcwfences.kikoz.objects.WiredFence;
import com.mcwfences.kikoz.objects.WoodenFence;
import fr.samlegamer.mcwfencesbyg.McwFencesBYG;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MFBYGBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwFencesBYG.MODID);    
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwFencesBYG.MODID);
	
	public static final RegistryObject<Block> aspen_picket_fence = createBlock("aspen_picket_fence", () -> new WoodenFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_stockade_fence = createBlock("aspen_stockade_fence", () -> new WoodenFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_horse_fence = createBlock("aspen_horse_fence", () -> new WoodenFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_wired_fence = createBlock("aspen_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_highley_gate = createBlock("aspen_highley_gate", () -> new GateFence(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static RegistryObject<Block> picket_fenceAll, stockade_fenceAll, horse_fenceAll, wired_fenceAll, highley_gateAll;

    public static void registry()
    {
    	ArrayList<String> MATERIAL = new ArrayList<String>();
    	
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
		MATERIAL.add("bulbis");
		MATERIAL.add("imparius");
		MATERIAL.add("sythian");
		
		for(String i : MATERIAL)
		{
			picket_fenceAll = createBlock(""+i+"_picket_fence", () -> new WoodenFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			stockade_fenceAll = createBlock(""+i+"_stockade_fence", () -> new WoodenFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			horse_fenceAll = createBlock(""+i+"_horse_fence", () -> new WoodenFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			wired_fenceAll = createBlock(""+i+"_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			highley_gateAll = createBlock(""+i+"_highley_gate", () -> new GateFence(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
		}
    }
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(McwFencesBYG.TAB_GROUP)));
        return block;
    }
}