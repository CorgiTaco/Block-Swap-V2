package dev.corgitaco.blockswap;

import com.mojang.logging.LogUtils;
import dev.corgitaco.blockswap.data.BlockSwapData;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

public class BlockSwap {

    /** The mod id for  examplemod. */
    public static final String MOD_ID = "examplemod";

    /** The logger for examplemod. */
    public static final Logger LOGGER = LogUtils.getLogger();

    /**
     * Initializes the mod.
     */
    public static void init() {
        BlockSwapData.init();
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
