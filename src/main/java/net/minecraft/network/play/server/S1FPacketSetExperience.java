package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S1FPacketSetExperience
extends Packet {
    private float lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    public S1FPacketSetExperience() {
    }

    public S1FPacketSetExperience(float f, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = f;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readFloat();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readShort();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readShort();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeFloat(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeShort(this.lllIlIIlIIIlIlIIIllIlllIl);
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

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

