package cool.muyucloud.satenet.util;

import java.util.UUID;

public class PowerNet {
    public static final PowerNet EMPTY = new PowerNet();

    private int id;
    private int inputRate;
    private int outputRate;
    private int storage;
    private int capacity;
    private UUID owner;

    /**
     * 用于静态成员调用
     * 它从存档中读取记录的下一个可分配的电网ID
     * 它应该在加载存档的时候（即服务端加载时）被执行一次
     * */
    private PowerNet() {
        int resumeNextId = 0;
        /* TODO Read the save and get next power-net id */

        this.id = resumeNextId;
        this.inputRate = 0;
        this.outputRate = 0;
        this.storage = 0;
        this.capacity = 0;
    }

    /**
     * 该方法用世界加载时，将存档数据实例化
     * 它不应该被从外部调用
     * */
    private PowerNet(int id, UUID owner, int inputRate, int outputRate, int storage, int capacity) {
        this.id = id;
        this.owner = owner;
        this.inputRate = inputRate;
        this.outputRate = outputRate;
        this.storage = storage;
        this.capacity = capacity;
    }

    /**
     * 该方法应该用于游戏中创建一个新电网，而不是用于将存档数据实例化
     * */
    public static PowerNet generatePowerNet(UUID owner, int inputRate, int outputRate, int storage, int capacity) {
        ++EMPTY.id;
        return new PowerNet(EMPTY.id - 1, owner, inputRate, outputRate, storage, capacity);
    }

    public int getId() {
        return this.id;
    }

    public int getInputRate() {
        return inputRate;
    }

    public int getOutputRate() {
        return this.outputRate;
    }

    public int getStorage() {
        return this.storage;
    }

    public int getCapacity() {
        return this.capacity;
    }

    /**
     * 这是当一个机器方块接入电网时，或是机器方块对能量的供给出现更改时，电网应该执行的操作
     * 假设接入了一个耗电的机器，那么它在请求能量时，应该调用这个方法来登记当前的耗电速度，整个耗电过程只应该登记一次
     * 输入的值为变化量
    * */
    public void updateByOffset(int inputRate, int outputRate, int storage, int capacity) {
        this.inputRate += inputRate;
        this.outputRate += outputRate;
        this.storage += storage;
        this.capacity += capacity;
    }

    public boolean applyEnergy(int amount) {
        if (this.storage >= amount) {
            this.storage -= amount;
            return true;
        }
        return false;
    }

    public boolean chargeEnergy(int amount) {
        if (this.storage + amount <= this.capacity) {
            this.storage += amount;
            return true;
        }
        return false;
    }
}
