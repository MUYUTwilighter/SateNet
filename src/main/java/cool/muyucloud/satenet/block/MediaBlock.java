package cool.muyucloud.satenet.block;

import net.minecraft.block.AbstractBlock;

public abstract class MediaBlock extends AbstractBlock {
    private int coverageDistance;

    private MediaBlock(Settings settings) {
        super(settings);
    }

    public MediaBlock(Settings settings, int coverageDistance) {
        super(settings);
        this.coverageDistance = coverageDistance;
    }
}
