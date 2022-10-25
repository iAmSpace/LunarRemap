package net.minecraft.network.play.client;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class C02PacketUseEntity
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private class_2158 lllIlIIlIIIlIlIIIllIlllIl;

    public C02PacketUseEntity() {
    }

    public C02PacketUseEntity(class_1521 class_15212, class_2158 class_21582) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212.llllllIlIllllIlIlIlIIIIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_21582;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_2158.lllIIIllIIIIlllIlIIllIIll()[class_01812.readByte() % class_2158.lllIIIllIIIIlllIlIIllIIll().length];
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(class_2158.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public class_1521 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return class_13342.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public class_2158 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

