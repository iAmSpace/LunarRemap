package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.util.MathHelper;
import obf.*;

import java.util.List;
import java.util.UUID;

public class S0CPacketSpawnPlayer
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private GameProfile lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private byte lIllllIIlIIIlIllllllIIIll;
    private byte IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private class_0788 IIIllIllIIlIlIlIlIllllIIl;
    private List IllIIIllIIIIlIlIlIllIIlll;

    public S0CPacketSpawnPlayer() {
    }

    public S0CPacketSpawnPlayer(class_0814 class_08142) {
        this.lllIIIllIIIIlllIlIIllIIll = class_08142.llllllIlIllllIlIlIlIIIIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08142.lIIlIlllIIlIIIIlIlIIIIlll();
        this.IlIllllllIIlIIllllIIlIIIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.IlIIlllllIIlIlIlllllIllll * 32.0);
        this.lIlllIlllIIIIlIIlllIllIII = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.llIIlIlIlllIIllIlIlllIllI * 32.0);
        this.IlIIIIIllllllIIlllIllllll = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.IllIIIIllIIllIllIlllIlIIl * 32.0);
        this.lIllllIIlIIIlIllllllIIIll = (byte)(class_08142.IIIIlIllIlIIlIIlIllIlIlll * 256.0f / 360.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = (byte)(class_08142.IlIlIIlllIllllllllIIIlIlI * 256.0f / 360.0f);
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        this.IllIIlllllllIIlIIlIIIIlIl = class_08972 == null ? 0 : Item.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll());
        this.IIIllIllIIlIlIlIlIllllIIl = class_08142.lIlIIllllIlIIIIllIIIIlIIl();
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readVarIntFromBuffer();
        UUID uUID = UUID.fromString(class_01812.readStringFromBuffer(36));
        this.lllIlIIlIIIlIlIIIllIlllIl = new GameProfile(uUID, class_01812.readStringFromBuffer(16));
        int n = class_01812.readVarIntFromBuffer();
        for (int i = 0; i < n; ++i) {
            String string = class_01812.readStringFromBuffer(32767);
            String string2 = class_01812.readStringFromBuffer(32767);
            String string3 = class_01812.readStringFromBuffer(32767);
            this.lllIlIIlIIIlIlIIIllIlllIl.getProperties().put(string, new Property(string, string2, string3));
        }
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readInt();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readInt();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readByte();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readByte();
        this.IllIIlllllllIIlIIlIIIIlIl = class_01812.readShort();
        this.IllIIIllIIIIlIlIlIllIIlll = class_0788.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeVarIntToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        UUID uUID = this.lllIlIIlIIIlIlIIIllIlllIl.getId();
        class_01812.writeStringToBuffer(uUID == null ? "" : uUID.toString());
        class_01812.writeStringToBuffer(this.lllIlIIlIIIlIlIIIllIlllIl.getName());
        class_01812.writeVarIntToBuffer(this.lllIlIIlIIIlIlIIIllIlllIl.getProperties().size());
        for (Property property : this.lllIlIIlIIIlIlIIIllIlllIl.getProperties().values()) {
            class_01812.writeStringToBuffer(property.getName());
            class_01812.writeStringToBuffer(property.getValue());
            class_01812.writeStringToBuffer(property.getSignature());
        }
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeInt(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeInt(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
        class_01812.writeByte(this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_01812.writeShort(this.IllIIlllllllIIlIIlIIIIlIl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_01812);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        if (this.IllIIIllIIIIlIlIlIllIIlll == null) {
            this.IllIIIllIIIIlIlIlIllIIlll = this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl();
        }
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    @Override
    public String serialize() {
        return String.format("id=%d, gameProfile='%s', x=%.2f, y=%.2f, z=%.2f, carried=%d", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, (float) this.IlIllllllIIlIIllllIIlIIIl / 32.0f, (float) this.lIlllIlllIIIIlIIlllIllIII / 32.0f, (float) this.IlIIIIIllllllIIlllIllllll / 32.0f, this.IllIIlllllllIIlIIlIIIIlIl);
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public GameProfile IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public byte IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public byte IllIIIllIIIIlIlIlIllIIlll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

