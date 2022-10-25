package net.minecraft.network.status.client;

import obf.PacketBuffer;
import obf.class_0367;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C01PacketPing
extends Packet {
    private long lllIIIllIIIIlllIlIIllIIll;

    public C01PacketPing() {
    }

    public C01PacketPing(long l) {
        this.lllIIIllIIIIlllIlIIllIIll = l;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readLong();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeLong(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0367 class_03672) {
        class_03672.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public boolean hasPriority() {
        return true;
    }

    public long IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0367)class_20752);
    }
}

