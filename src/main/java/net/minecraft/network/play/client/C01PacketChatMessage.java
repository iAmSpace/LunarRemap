package net.minecraft.network.play.client;

import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C01PacketChatMessage
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll;

    public C01PacketChatMessage() {
    }

    public C01PacketChatMessage(String string) {
        if (string.length() > 100) {
            string = string.substring(0, 100);
        }
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(100);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("message='%s'", this.lllIIIllIIIIlllIlIIllIIll);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

