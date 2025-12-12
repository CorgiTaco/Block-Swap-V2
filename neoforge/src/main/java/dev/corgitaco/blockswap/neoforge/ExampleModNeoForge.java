package dev.corgitaco.blockswap.neoforge;

import dev.corgitaco.blockswap.BlockSwap;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/**
 * Main class for the mod on the NeoForge platform.
 */
@Mod(BlockSwap.MOD_ID)
public class ExampleModNeoForge {
    public ExampleModNeoForge(IEventBus eventBus) {
        BlockSwap.init();
    }
}
