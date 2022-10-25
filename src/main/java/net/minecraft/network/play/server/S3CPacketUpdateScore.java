package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S3CPacketUpdateScore
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll = "";
    private String lllIlIIlIIIlIlIIIllIlllIl = "";
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public S3CPacketUpdateScore() {
    }

    public S3CPacketUpdateScore(class_0678 class_06782, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06782.lIlllIlllIIIIlIIlllIllIII();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06782.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIllllllIIlIIllllIIlIIIl = class_06782.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlllIlllIIIIlIIlllIllIII = n;
    }

    public S3CPacketUpdateScore(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = "";
        this.IlIllllllIIlIIllllIIlIIIl = 0;
        this.lIlllIlllIIIIlIIlllIllIII = 1;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(16);
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readByte();
        if (this.lIlllIlllIIIIlIIlllIllIII != 1) {
            this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readStringFromBuffer(16);
            this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
        if (this.lIlllIlllIIIIlIIlllIllIII != 1) {
            class_01812.writeStringToBuffer(this.lllIlIIlIIIlIlIIIllIlllIl);
            class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

