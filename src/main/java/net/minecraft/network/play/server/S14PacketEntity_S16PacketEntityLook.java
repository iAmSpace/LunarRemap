package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S14PacketEntity_S16PacketEntityLook
extends S14PacketEntity {
    public S14PacketEntity_S16PacketEntityLook() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
    }

    public S14PacketEntity_S16PacketEntityLook(int n, byte by, byte by2) {
        super(n);
        this.IlIIIIIllllllIIlllIllllll = by;
        this.lIllllIIlIIIlIllllllIIIll = by2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        super.readPacketData(class_01812);
        this.IlIIIIIllllllIIlllIllllll = class_01812.readByte();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readByte();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        super.writePacketData(class_01812);
        class_01812.writeByte(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public String serialize() {
        return super.serialize() + String.format(", yRot=%d, xRot=%d", this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

