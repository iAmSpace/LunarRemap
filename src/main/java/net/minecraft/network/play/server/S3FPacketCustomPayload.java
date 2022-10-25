package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

public class S3FPacketCustomPayload
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll;
    private byte[] lllIlIIlIIIlIlIIIllIlllIl;

    public S3FPacketCustomPayload() {
    }

    public S3FPacketCustomPayload(String string, ByteBuf byteBuf) {
        this(string, byteBuf.array());
    }

    public S3FPacketCustomPayload(String string, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = arrby;
        if (arrby.length >= 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }

    private static native void lllIIIllIIIIlllIlIIllIIll(String var0, byte[] var1);

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(20);
        this.lllIlIIlIIIlIlIIIllIlllIl = new byte[class_01812.readUnsignedShort()];
        class_01812.readBytes(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort(this.lllIlIIlIIIlIlIIIllIlllIl.length);
        class_01812.writeBytes(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        try {
            S3FPacketCustomPayload.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            // empty catch block
        }
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
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

