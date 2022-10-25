package obf;

import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.status.client.C01PacketPing;
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.server.S01PacketPong;

/*
 * Decompiled with CFR 0.150.
 */
final class class_0497
extends EnumConnectionState {
    class_0497(String string2, int n2, int n3, Object object) {
        this.func_150751_a(0, C00PacketServerQuery.class);
        this.func_150756_b(0, S00PacketServerInfo.class);
        this.func_150751_a(1, C01PacketPing.class);
        this.func_150756_b(1, S01PacketPong.class);
    }
}

