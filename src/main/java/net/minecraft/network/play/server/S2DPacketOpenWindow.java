package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S2DPacketOpenWindow
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;

    public S2DPacketOpenWindow() {
    }

    public S2DPacketOpenWindow(int n, int n2, String string, int n3, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.IlIIIIIllllllIIlllIllllll = bl;
    }

    public S2DPacketOpenWindow(int n, int n2, String string, int n3, boolean bl, int n4) {
        this(n, n2, string, n3, bl);
        this.lIllllIIlIIIlIllllllIIIll = n4;
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readUnsignedByte();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readUnsignedByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readStringFromBuffer(32);
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readUnsignedByte();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readBoolean();
        if (this.lllIlIIlIIIlIlIIIllIlllIl == 11) {
            this.lIllllIIlIIIlIllllllIIIll = class_01812.readInt();
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeStringToBuffer(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeBoolean(this.IlIIIIIllllllIIlllIllllll);
        if (this.lllIlIIlIIIlIlIIIllIlllIl == 11) {
            class_01812.writeInt(this.lIllllIIlIIIlIllllllIIIll);
        }
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

