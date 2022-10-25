package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S01PacketJoinGame
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private class_2243 IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private class_1999 IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private class_1074 IIIllIIlIIIIIIlIlIIllIIlI;

    public S01PacketJoinGame() {
    }

    public S01PacketJoinGame(int n, class_2243 class_22432, boolean bl, int n2, class_1999 class_19992, int n3, class_1074 class_10742) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        this.IlIIIIIllllllIIlllIllllll = class_19992;
        this.IlIllllllIIlIIllllIIlIIIl = class_22432;
        this.lIllllIIlIIIlIllllllIIIll = n3;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_10742;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        short s = class_01812.readUnsignedByte();
        this.lllIlIIlIIIlIlIIIllIlllIl = (s & 8) == 8;
        int n = s & 0xFFFFFFF7;
        this.IlIllllllIIlIIllllIIlIIIl = class_2243.lllIIIllIIIIlllIlIIllIIll(n);
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readByte();
        this.IlIIIIIllllllIIlllIllllll = class_1999.lllIIIllIIIIlllIlIIllIIll(class_01812.readUnsignedByte());
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readUnsignedByte();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_1074.lllIIIllIIIIlllIlIIllIIll(class_01812.readStringFromBuffer(16));
        if (this.IIIllIIlIIIIIIlIlIIllIIlI == null) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_1074.lllIlIIlIIIlIlIIIllIlllIl;
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        int n = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            n |= 8;
        }
        class_01812.writeByte(n);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeByte(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll());
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
        class_01812.writeStringToBuffer(this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("eid=%d, gameType=%d, hardcore=%b, dimension=%d, difficulty=%s, maxplayers=%d", new Object[]{this.lllIIIllIIIIlllIlIIllIIll, this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(), this.lllIlIIlIIIlIlIIIllIlllIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll});
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_2243 IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public class_1999 IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public class_1074 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

