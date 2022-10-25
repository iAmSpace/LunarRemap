package net.minecraft.network.status.server;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.network.Packet;
import net.minecraft.util.IChatComponent;
import obf.*;

public class S00PacketServerInfo
extends Packet {
    private static final Gson lllIIIllIIIIlllIlIIllIIll = new GsonBuilder().registerTypeAdapter(class_0496.class, (Object)new class_0750()).registerTypeAdapter(class_0305.class, (Object)new class_0253()).registerTypeAdapter(class_0111.class, (Object)new class_0538()).registerTypeHierarchyAdapter(IChatComponent.class, (Object)new class_2095()).registerTypeHierarchyAdapter(class_1401.class, (Object)new class_2115()).registerTypeAdapterFactory((TypeAdapterFactory)new class_1351()).create();
    private class_0111 lllIlIIlIIIlIlIIIllIlllIl;

    public S00PacketServerInfo() {
    }

    public S00PacketServerInfo(class_0111 class_01112) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01112;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIlIIlIIIlIlIIIllIlllIl = (class_0111)lllIIIllIIIIlllIlIIllIIll.fromJson(class_01812.readStringFromBuffer(32767), class_0111.class);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(lllIIIllIIIIlllIlIIllIIll.toJson((Object)this.lllIlIIlIIIlIlIIIllIlllIl));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0709 class_07092) {
        class_07092.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public class_0111 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public boolean hasPriority() {
        return true;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0709)class_20752);
    }
}

