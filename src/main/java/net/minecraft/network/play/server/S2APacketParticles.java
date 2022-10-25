package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S2APacketParticles
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;
    private float lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;
    private float IIIllIIlIIIIIIlIlIIllIIlI;
    private float IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;

    public S2APacketParticles() {
    }

    public S2APacketParticles(String string, float f, float f2, float f3, float f4, float f5, float f6, float f7, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
        this.IlIllllllIIlIIllllIIlIIIl = f2;
        this.lIlllIlllIIIIlIIlllIllIII = f3;
        this.IlIIIIIllllllIIlllIllllll = f4;
        this.lIllllIIlIIIlIllllllIIIll = f5;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f6;
        this.IllIIlllllllIIlIIlIIIIlIl = f7;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(64);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readFloat();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readFloat();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readFloat();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readFloat();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readFloat();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readFloat();
        this.IllIIlllllllIIlIIlIIIIlIl = class_01812.readFloat();
        this.IIIllIllIIlIlIlIlIllllIIl = class_01812.readInt();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeFloat(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeFloat(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeFloat(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeFloat(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeFloat(this.lIllllIIlIIIlIllllllIIIll);
        class_01812.writeFloat(this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_01812.writeFloat(this.IllIIlllllllIIlIIlIIIIlIl);
        class_01812.writeInt(this.IIIllIllIIlIlIlIlIllllIIl);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
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

    public float IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public float IllIIIllIIIIlIlIlIllIIlll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

