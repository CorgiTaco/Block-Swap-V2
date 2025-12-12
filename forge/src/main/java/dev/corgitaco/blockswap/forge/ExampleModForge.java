package dev.corgitaco.blockswap.forge;

import dev.corgitaco.blockswap.BlockSwap;
import net.minecraftforge.fml.common.Mod;

/**
 * Main class for the mod on the Forge platform.
 */
@Mod(BlockSwap.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        BlockSwap.init();
    }
}
