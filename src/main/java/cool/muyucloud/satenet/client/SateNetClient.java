package cool.muyucloud.satenet.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class SateNetClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hello world from client");
    }
}
