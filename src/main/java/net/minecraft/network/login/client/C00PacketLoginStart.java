package net.minecraft.network.login.client;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.INetHandlerLoginServer;
import obf.INetHandler;

import java.util.UUID;

public class C00PacketLoginStart
extends Packet {
    private GameProfile lllIIIllIIIIlllIlIIllIIll;

    public C00PacketLoginStart() {
    }

    public C00PacketLoginStart(GameProfile gameProfile) {
        this.lllIIIllIIIIlllIlIIllIIll = gameProfile;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = new GameProfile((UUID)null, class_01812.readStringFromBuffer(16));
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll.getName());
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerLoginServer class_16472) {
        class_16472.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public GameProfile IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerLoginServer)class_20752);
    }
}

