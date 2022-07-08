package cool.muyucloud.satenet.blockEntity;

import cool.muyucloud.satenet.util.PowerNet;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public abstract class MachineBlockEntity extends BlockEntity {
    private int tmpEnergyConsume;
    private PowerNet powerNet;

    public MachineBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int tmpEnergyConsume, PowerNet powerNet) {
        super(type, pos, state);
        this.tmpEnergyConsume = tmpEnergyConsume;
        this.powerNet = powerNet;
    }

    public int getTmpEnergyConsume() {
        return this.tmpEnergyConsume;
    }

    public PowerNet getPowerNet() {
        return this.powerNet;
    }
}
