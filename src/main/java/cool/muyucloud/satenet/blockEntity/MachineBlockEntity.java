package cool.muyucloud.satenet.blockEntity;

import cool.muyucloud.satenet.util.PowerNet;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.util.math.BlockPos;

public class MachineBlockEntity extends FurnaceBlockEntity {
    private int maxEnergyConsume;
    private int tmpEnergyConsume;
    private PowerNet powerNet;

    public MachineBlockEntity(BlockPos pos, BlockState state, int maxEnergyConsume, int tmpEnergyConsume, PowerNet powerNet) {
        super(pos, state);
        this.maxEnergyConsume = maxEnergyConsume;
        this.tmpEnergyConsume = tmpEnergyConsume;
        this.powerNet = powerNet;
    }


}
