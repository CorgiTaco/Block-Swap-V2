package dev.corgitaco.blockswap.data;

import dev.corgitaco.dataanchor.data.registry.TrackedDataKey;
import dev.corgitaco.dataanchor.data.type.chunk.ChunkTrackedData;
import dev.corgitaco.dataanchor.data.type.chunk.ProtoChunkTrackedData;
import net.minecraft.world.level.chunk.ProtoChunk;

public class BlockSwapProtoChunkData extends ProtoChunkTrackedData {
    public BlockSwapProtoChunkData(TrackedDataKey<? extends ChunkTrackedData> trackedDataKey, ProtoChunk chunk) {
        super(trackedDataKey, chunk);
    }
}
