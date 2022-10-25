package net.minecraft.network.login.server;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_0774;
import obf.INetHandler;

import java.util.UUID;

public class S02PacketLoginSuccess
extends Packet {
    private GameProfile lllIIIllIIIIlllIlIIllIIll;

    public S02PacketLoginSuccess() {
    }

    public S02PacketLoginSuccess(GameProfile gameProfile) {
        this.lllIIIllIIIIlllIlIIllIIll = gameProfile;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        String string = class_01812.readStringFromBuffer(36);
        String string2 = class_01812.readStringFromBuffer(16);
        UUID uUID = UUID.fromString(string);
        this.lllIIIllIIIIlllIlIIllIIll = new GameProfile(uUID, string2);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        UUID uUID = this.lllIIIllIIIIlllIlIIllIIll.getId();
        class_01812.writeStringToBuffer(uUID == null ? "" : uUID.toString());
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll.getName());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0774 class_07742) {
        class_07742.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public boolean hasPriority() {
        return true;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0774)class_20752);
    }
}

