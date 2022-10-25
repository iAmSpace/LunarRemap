package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S03PacketTimeUpdate
extends Packet {
    private long lllIIIllIIIIlllIlIIllIIll;
    private long lllIlIIlIIIlIlIIIllIlllIl;

    public S03PacketTimeUpdate() {
    }

    public S03PacketTimeUpdate(long l, long l2, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = l;
        this.lllIlIIlIIIlIlIIIllIlllIl = l2;
        if (!bl) {
            this.lllIlIIlIIIlIlIIIllIlllIl = -this.lllIlIIlIIIlIlIIIllIlllIl;
            if (this.lllIlIIlIIIlIlIIIllIlllIl == 0L) {
                this.lllIlIIlIIIlIlIIIllIlllIl = -1L;
            }
        }
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readLong();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readLong();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeLong(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeLong(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("time=%d,dtime=%d", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public long IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public long lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

