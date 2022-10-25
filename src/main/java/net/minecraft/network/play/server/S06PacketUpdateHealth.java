package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S06PacketUpdateHealth
extends Packet {
    private float lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;

    public S06PacketUpdateHealth() {
    }

    public S06PacketUpdateHealth(float f, int n, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll = f;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = f2;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readFloat();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readShort();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readFloat();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeFloat(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeFloat(this.IlIllllllIIlIIllllIIlIIIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public float IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public float IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

