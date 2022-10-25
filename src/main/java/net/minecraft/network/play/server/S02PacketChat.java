package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import net.minecraft.util.IChatComponent;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S02PacketChat
extends Packet {
    private IChatComponent lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl = true;

    public S02PacketChat() {
    }

    public S02PacketChat(IChatComponent class_22552) {
        this(class_22552, true);
    }

    public S02PacketChat(IChatComponent class_22552, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = class_22552;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_2095.lllIIIllIIIIlllIlIIllIIll(class_01812.readStringFromBuffer(32767));
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(class_2095.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("message='%s'", this.lllIIIllIIIIlllIlIIllIIll);
    }

    public IChatComponent IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

