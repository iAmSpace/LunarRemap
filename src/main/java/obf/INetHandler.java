package obf;

import net.minecraft.network.EnumConnectionState;
import net.minecraft.util.IChatComponent;

public interface INetHandler {
    void onDisconnect(IChatComponent var1);

    void onConnectionStateTransition(EnumConnectionState var1, EnumConnectionState var2);

    void onNetworkTick();
}

