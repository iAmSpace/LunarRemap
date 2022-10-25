package net.minecraft.network.status.client;

import obf.PacketBuffer;
import obf.class_0367;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C00PacketServerQuery
extends Packet {
    @Override
    public void readPacketData(PacketBuffer class_01812) {
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0367 class_03672) {
        class_03672.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public boolean hasPriority() {
        return true;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0367)class_20752);
    }
}

