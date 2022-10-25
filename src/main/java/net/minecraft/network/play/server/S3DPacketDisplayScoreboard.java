package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S3DPacketDisplayScoreboard
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private String lllIlIIlIIIlIlIIIllIlllIl;

    public S3DPacketDisplayScoreboard() {
    }

    public S3DPacketDisplayScoreboard(int n, class_0693 class_06932) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06932 == null ? "" : class_06932.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readByte();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readStringFromBuffer(16);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeStringToBuffer(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

