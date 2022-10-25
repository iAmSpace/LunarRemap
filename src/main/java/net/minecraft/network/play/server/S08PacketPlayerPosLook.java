package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S08PacketPlayerPosLook
extends Packet {
    private double lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private float lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;

    public S08PacketPlayerPosLook() {
    }

    public S08PacketPlayerPosLook(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.IlIllllllIIlIIllllIIlIIIl = d3;
        this.lIlllIlllIIIIlIIlllIllIII = f;
        this.IlIIIIIllllllIIlllIllllll = f2;
        this.lIllllIIlIIIlIllllllIIIll = bl;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readDouble();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readDouble();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readDouble();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readFloat();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readFloat();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readBoolean();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeDouble(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeDouble(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeDouble(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeFloat(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeFloat(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeBoolean(this.lIllllIIlIIIlIllllllIIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
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

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

