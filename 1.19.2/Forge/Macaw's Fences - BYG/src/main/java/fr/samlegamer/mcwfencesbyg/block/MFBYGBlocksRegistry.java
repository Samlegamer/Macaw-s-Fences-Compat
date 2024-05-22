package fr.samlegamer.mcwfencesbyg.block;

import java.util.ArrayList;
import java.util.List;
import com.google.common.base.Supplier;
import com.mcwfences.kikoz.objects.FuelItemBlock;
import com.mcwfences.kikoz.objects.WiredFence;
import fr.samlegamer.mcwfencesbyg.McwFencesBYG;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
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
	
	public static final RegistryObject<Block> aspen_picket_fence = createBlock("aspen_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_stockade_fence = createBlock("aspen_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_horse_fence = createBlock("aspen_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_wired_fence = createBlock("aspen_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_highley_gate = createBlock("aspen_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_pyramid_gate = createBlock("aspen_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(1.5F, 2.5F).sound(SoundType.WOOD)));

    public static RegistryObject<Block> picket_fenceAll, stockade_fenceAll, horse_fenceAll, wired_fenceAll, highley_gateAll, pyramid_gateAll;

    public static List<String> MATERIAL = new ArrayList<>();

    
    public static void registry()
    {
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
		MATERIAL.add("white_mangrove");
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
			picket_fenceAll = createBlock(""+i+"_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			stockade_fenceAll = createBlock(""+i+"_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			horse_fenceAll = createBlock(""+i+"_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			wired_fenceAll = createBlock(""+i+"_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			highley_gateAll = createBlock(""+i+"_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			pyramid_gateAll = createBlock(""+i+"_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
		}
    }
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(McwFencesBYG.TAB_GROUP)));
        return block;
    }

}