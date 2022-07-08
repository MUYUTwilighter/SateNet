package cool.muyucloud.satenet.block;

public abstract class BatteryBlock extends MachineBlock {
    private int maxSupplyRate;
    private int capacity;

    public BatteryBlock(Settings settings, int maxConsumeRate, int maxSupplyRate) {
        super(settings, maxConsumeRate);
        this.maxSupplyRate = maxSupplyRate;
    }

    public int getMaxSupplyRate() {
        return this.maxSupplyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public enum BatteryMode {
        INPUT(false, true),
        OUTPUT(true, false),
        NONE(false, false);

        private boolean consumeEnergy;
        private boolean supplyEnergy;

        BatteryMode(boolean consumeEnergy, boolean supplyEnergy) {
            this.consumeEnergy = consumeEnergy;
            this.supplyEnergy = supplyEnergy;
        }
    }
}
