package obf;

import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.login.client.C01PacketEncryptionResponse;
import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.server.S02PacketLoginSuccess;

/*
 * Decompiled with CFR 0.150.
 */
final class class_0057
extends EnumConnectionState {
    class_0057(String string2, int n2, int n3, Object object) {
        this.func_150756_b(0, S00PacketDisconnect.class);
        this.func_150756_b(1, S01PacketEncryptionRequest.class);
        this.func_150756_b(2, S02PacketLoginSuccess.class);
        this.func_150751_a(0, C00PacketLoginStart.class);
        this.func_150751_a(1, C01PacketEncryptionResponse.class);
    }
}

