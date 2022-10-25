package net.minecraft.network.play.client;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;
import org.apache.commons.lang3.StringUtils;

public class C14PacketTabComplete
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll;

    public C14PacketTabComplete() {
    }

    public C14PacketTabComplete(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(32767);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(StringUtils.substring((String)this.lllIIIllIIIIlllIlIIllIIll, (int)0, (int)32767));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public String serialize() {
        return String.format("message='%s'", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

