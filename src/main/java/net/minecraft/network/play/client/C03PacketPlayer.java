package net.minecraft.network.play.client;

import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C03PacketPlayer
extends Packet {
    protected double lllIIIllIIIIlllIlIIllIIll;
    protected double lllIlIIlIIIlIlIIIllIlllIl;
    protected double IlIllllllIIlIIllllIIlIIIl;
    protected double lIlllIlllIIIIlIIlllIllIII;
    protected float IlIIIIIllllllIIlllIllllll;
    protected float lIllllIIlIIIlIllllllIIIll;
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI;
    protected boolean IllIIlllllllIIlIIlIIIIlIl;
    protected boolean IIIllIllIIlIlIlIlIllllIIl;

    public C03PacketPlayer() {
    }

    public C03PacketPlayer(boolean bl) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readUnsignedByte() != 0;
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeByte(this.IIIllIIlIIIIIIlIlIIllIIlI ? 1 : 0);
    }

    public double IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public double lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public double IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public double lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl = bl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

