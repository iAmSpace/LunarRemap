package net.minecraft.network.play.client;

import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C07PacketPlayerDigging
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public C07PacketPlayerDigging() {
    }

    public C07PacketPlayerDigging(int n, int n2, int n3, int n4, int n5) {
        this.IlIIIIIllllllIIlllIllllll = n;
        this.lllIIIllIIIIlllIlIIllIIll = n2;
        this.lllIlIIlIIIlIlIIIllIlllIl = n3;
        this.IlIllllllIIlIIllllIIlIIIl = n4;
        this.lIlllIlllIIIIlIIlllIllIII = n5;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.IlIIIIIllllllIIlllIllllll = class_01812.readUnsignedByte();
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readUnsignedByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readUnsignedByte();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeByte(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

