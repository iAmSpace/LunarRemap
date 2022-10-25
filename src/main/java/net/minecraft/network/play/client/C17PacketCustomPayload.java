package net.minecraft.network.play.client;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;

public class C17PacketCustomPayload
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private byte[] IlIllllllIIlIIllllIIlIIIl;

    public C17PacketCustomPayload() {
    }

    public C17PacketCustomPayload(String string, ByteBuf byteBuf) {
        this(string, byteBuf.array());
    }

    public C17PacketCustomPayload(String string, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.IlIllllllIIlIIllllIIlIIIl = arrby;
        if (arrby != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl = arrby.length;
            if (this.lllIlIIlIIIlIlIIIllIlllIl >= 32767) {
                throw new IllegalArgumentException("Payload may not be larger than 32k");
            }
        }
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(20);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readShort();
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0 && this.lllIlIIlIIIlIlIIIllIlllIl < 32767) {
            this.IlIllllllIIlIIllllIIlIIIl = new byte[this.lllIlIIlIIIlIlIIIllIlllIl];
            class_01812.readBytes(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort((short)this.lllIlIIlIIIlIlIIIllIlllIl);
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            class_01812.writeBytes(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public byte[] lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

