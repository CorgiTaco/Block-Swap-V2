package dev.corgitaco.blockswap.data;

import dev.corgitaco.blockswap.BlockSwap;
import dev.corgitaco.dataanchor.data.registry.TrackedDataKey;
import dev.corgitaco.dataanchor.data.registry.TrackedDataRegistries;
import dev.corgitaco.dataanchor.data.type.chunk.ProtoChunkTrackedData;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.ProtoChunk;

public class BlockSwapData {

    public static final TrackedDataKey<BlockSwapLevelChunkData> LEVEL_CHUNK_DATA_KEY = TrackedDataRegistries.CHUNK.register(BlockSwap.id("block_swap_level_chunk_data"), BlockSwapLevelChunkData.class, (key, chunkAccess) -> {
        if (chunkAccess instanceof LevelChunk levelChunk) {
            return new BlockSwapLevelChunkData(key, levelChunk);
        } else {
            return null;
        }
    });

    public static final TrackedDataKey<BlockSwapProtoChunkData> PROTO_CHUNK_DATA_KEY = TrackedDataRegistries.CHUNK.register(BlockSwap.id("block_swap_proto_chunk_data"), BlockSwapProtoChunkData.class, (key, chunkAccess) -> {
        if (chunkAccess instanceof ProtoChunk protoChunkData) {
            return new BlockSwapProtoChunkData(key, protoChunkData);
        } else {
            return null;
        }
    });

    public static void init() {}
}
