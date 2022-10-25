package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S34PacketMaps
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private byte[] lllIlIIlIIIlIlIIIllIlllIl;

    public S34PacketMaps() {
    }

    public S34PacketMaps(int n, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = arrby;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readVarIntFromBuffer();
        this.lllIlIIlIIIlIlIIIllIlllIl = new byte[class_01812.readUnsignedShort()];
        class_01812.readBytes(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeVarIntToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort(this.lllIlIIlIIIlIlIIIllIlllIl.length);
        class_01812.writeBytes(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("id=%d, length=%d", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl.length);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public byte[] lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

