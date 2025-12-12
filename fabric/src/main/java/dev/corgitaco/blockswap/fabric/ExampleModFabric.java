package dev.corgitaco.blockswap.fabric;

import dev.corgitaco.blockswap.BlockSwap;
import net.fabricmc.api.ModInitializer;

/**
 * This class is the entrypoint for the mod on the Fabric platform.
 */
public class ExampleModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        BlockSwap.init();
    }
}
