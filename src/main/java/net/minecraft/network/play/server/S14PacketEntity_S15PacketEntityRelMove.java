package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S14PacketEntity_S15PacketEntityRelMove
extends S14PacketEntity {
    public S14PacketEntity_S15PacketEntityRelMove() {
    }

    public S14PacketEntity_S15PacketEntityRelMove(int n, byte by, byte by2, byte by3) {
        super(n);
        this.lllIlIIlIIIlIlIIIllIlllIl = by;
        this.IlIllllllIIlIIllllIIlIIIl = by2;
        this.lIlllIlllIIIIlIIlllIllIII = by3;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        super.readPacketData(class_01812);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readByte();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readByte();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        super.writePacketData(class_01812);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeByte(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public String serialize() {
        return super.serialize() + String.format(", xa=%d, ya=%d, za=%d", this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

