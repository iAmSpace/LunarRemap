package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S13PacketDestroyEntities
extends Packet {
    private int[] lllIIIllIIIIlllIlIIllIIll;

    public S13PacketDestroyEntities() {
    }

    public S13PacketDestroyEntities(int ... arrn) {
        this.lllIIIllIIIIlllIlIIllIIll = arrn;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = new int[class_01812.readByte()];
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i] = class_01812.readInt();
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll.length);
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll[i]);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.lllIIIllIIIIlllIlIIllIIll[i]);
        }
        return String.format("entities=%d[%s]", this.lllIIIllIIIIlllIlIIllIIll.length, stringBuilder);
    }

    public int[] IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

