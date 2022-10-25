package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S19PacketEntityHeadLook
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private byte lllIlIIlIIIlIlIIIllIlllIl;

    public S19PacketEntityHeadLook() {
    }

    public S19PacketEntityHeadLook(class_1521 class_15212, byte by) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212.llllllIlIllllIlIlIlIIIIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl = by;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readByte();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("id=%d, rot=%d", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public class_1521 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return class_13342.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public byte IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

