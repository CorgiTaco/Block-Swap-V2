package dev.corgitaco.blockswap;

import com.mojang.serialization.Codec;
import dev.corgitaco.blockswap.levelswapcondition.LevelSwapCondition;
import dev.corgitaco.blockswap.stateselector.BlockStateSelector;
import dev.corgitaco.blockswap.swapaction.BlockAction;
import dev.corgitaco.dataanchor.registry.RegistryHelper;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

import java.util.function.Supplier;

public class BlockSwapRegistry {


    public static final ResourceKey<Registry<Codec<? extends LevelSwapCondition>>> LEVEL_SWAP_CONDITION_KEY = ResourceKey.createRegistryKey(BlockSwap.id("level_swap_condition"));
    public static final Supplier<Registry<Codec<? extends LevelSwapCondition>>> LEVEL_SWAP_CONDITION = RegistryHelper.INSTANCE.createSimpleBuiltin(LEVEL_SWAP_CONDITION_KEY);

    public static final ResourceKey<Registry<Codec<? extends BlockStateSelector>>> BLOCK_STATE_SELECTOR_KEY = ResourceKey.createRegistryKey(BlockSwap.id("block_state_selector"));
    public static final Supplier<Registry<Codec<? extends BlockStateSelector>>> BLOCK_STATE_SELECTOR = RegistryHelper.INSTANCE.createSimpleBuiltin(BLOCK_STATE_SELECTOR_KEY);

    public static final ResourceKey<Registry<Codec<? extends BlockAction>>> BLOCK_ACTION_KEY = ResourceKey.createRegistryKey(BlockSwap.id("block_action"));
    public static final Supplier<Registry<Codec<? extends BlockAction>>> BLOCK_ACTION_SELECTOR = RegistryHelper.INSTANCE.createSimpleBuiltin(BLOCK_ACTION_KEY);
}
