package net.minecraft.network.status.server;

import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_0709;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S01PacketPong
extends Packet {
    private long lllIIIllIIIIlllIlIIllIIll;

    public S01PacketPong() {
    }

    public S01PacketPong(long l) {
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

    public void lllIIIllIIIIlllIlIIllIIll(class_0709 class_07092) {
        class_07092.lllIIIllIIIIlllIlIIllIIll(this);
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
        this.lllIIIllIIIIlllIlIIllIIll((class_0709)class_20752);
    }
}

