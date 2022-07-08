package cool.muyucloud.satenet.block;

import cool.muyucloud.satenet.util.PowerNet;
import net.minecraft.block.AbstractBlock;

public abstract class MachineBlock extends AbstractBlock {
    private int maxConsumeRate;
    private PowerNet powerNet;

    private MachineBlock(Settings settings) {
        super(settings);
    }

    public MachineBlock(Settings settings, int maxConsumeRate) {
        super(settings);
        this.maxConsumeRate = maxConsumeRate;
    }
}
