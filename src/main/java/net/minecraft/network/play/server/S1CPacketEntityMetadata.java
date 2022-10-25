package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.network.Packet;
import obf.*;

import java.util.List;

public class S1CPacketEntityMetadata
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private List lllIlIIlIIIlIlIIIllIlllIl;

    public S1CPacketEntityMetadata() {
    }

    public S1CPacketEntityMetadata(int n, class_0788 class_07882, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl ? class_07882.IlIllllllIIlIIllllIIlIIIl() : class_07882.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_0788.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_0788.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, class_01812);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

