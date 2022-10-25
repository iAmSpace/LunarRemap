package net.minecraft.network.play.client;

import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C0FPacketConfirmTransaction
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private short lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;

    public C0FPacketConfirmTransaction() {
    }

    public C0FPacketConfirmTransaction(int n, short s, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = s;
        this.IlIllllllIIlIIllllIIlIIIl = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readByte();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readShort();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readByte() != 0;
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeByte(this.IlIllllllIIlIIllllIIlIIIl ? 1 : 0);
    }

    @Override
    public String serialize() {
        return String.format("id=%d, uid=%d, accepted=%b", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public short lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

