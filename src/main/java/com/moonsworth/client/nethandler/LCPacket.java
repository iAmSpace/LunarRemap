/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.client.LCPacketClientVoice;
import com.moonsworth.client.nethandler.client.LCPacketEmoteBroadcast;
import com.moonsworth.client.nethandler.client.LCPacketVoiceChannelSwitch;
import com.moonsworth.client.nethandler.client.LCPacketVoiceMute;
import com.moonsworth.client.nethandler.server.LCPacketCooldown;
import com.moonsworth.client.nethandler.server.LCPacketHologram;
import com.moonsworth.client.nethandler.server.LCPacketHologramRemove;
import com.moonsworth.client.nethandler.server.LCPacketHologramUpdate;
import com.moonsworth.client.nethandler.server.LCPacketNametagsOverride;
import com.moonsworth.client.nethandler.server.LCPacketNametagsUpdate;
import com.moonsworth.client.nethandler.server.LCPacketNotification;
import com.moonsworth.client.nethandler.server.LCPacketServerRule;
import com.moonsworth.client.nethandler.server.LCPacketServerUpdate;
import com.moonsworth.client.nethandler.server.LCPacketStaffModState;
import com.moonsworth.client.nethandler.server.LCPacketTeammates;
import com.moonsworth.client.nethandler.server.LCPacketTitle;
import com.moonsworth.client.nethandler.server.LCPacketUpdateWorld;
import com.moonsworth.client.nethandler.server.LCPacketVoice;
import com.moonsworth.client.nethandler.server.LCPacketVoiceChannel;
import com.moonsworth.client.nethandler.server.LCPacketVoiceChannelRemove;
import com.moonsworth.client.nethandler.server.LCPacketVoiceChannelUpdate;
import com.moonsworth.client.nethandler.server.LCPacketWorldBorder;
import com.moonsworth.client.nethandler.server.LCPacketWorldBorderRemove;
import com.moonsworth.client.nethandler.server.LCPacketWorldBorderUpdate;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointAdd;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointRemove;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;

public abstract class LCPacket {
    private static final BiMap<Class, Integer> REGISTRY = HashBiMap.create();
    private Object attachment;

    public static LCPacket handle(byte[] data) {
        return LCPacket.handle(data, null);
    }

    public static LCPacket handle(byte[] data, Object attachment) {
        ByteBufWrapper wrappedBuffer = new ByteBufWrapper(Unpooled.wrappedBuffer(data));
        int packetId = wrappedBuffer.readVarInt();
        Class packetClass = (Class)REGISTRY.inverse().get(packetId);
        if (packetClass != null) {
            try {
                LCPacket packet = (LCPacket)packetClass.newInstance();
                packet.attach(attachment);
                packet.read(wrappedBuffer);
                return packet;
            }
            catch (IOException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] getPacketData(LCPacket packet) {
        ByteBufWrapper wrappedBuffer = new ByteBufWrapper(Unpooled.buffer());
        wrappedBuffer.writeVarInt((Integer)REGISTRY.get(packet.getClass()));
        try {
            packet.write(wrappedBuffer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return wrappedBuffer.buf().array();
    }

    public static ByteBuf getPacketBuf(LCPacket packet) {
        ByteBufWrapper wrappedBuffer = new ByteBufWrapper(Unpooled.buffer());
        wrappedBuffer.writeVarInt((Integer)REGISTRY.get(packet.getClass()));
        try {
            packet.write(wrappedBuffer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return wrappedBuffer.buf();
    }

    private static void addPacket(int id, Class clazz) {
        if (REGISTRY.containsKey(clazz)) {
            throw new IllegalArgumentException("Duplicate packet class (" + clazz.getSimpleName() + "), already used by " + REGISTRY.get(clazz));
        }
        if (REGISTRY.containsValue(id)) {
            throw new IllegalArgumentException("Duplicate packet ID (" + id + "), already used by " + ((Class)REGISTRY.inverse().get(id)).getSimpleName());
        }
        REGISTRY.put(clazz, id);
    }

    public abstract void write(ByteBufWrapper var1) throws IOException;

    public abstract void read(ByteBufWrapper var1) throws IOException;

    public abstract void process(ILCNetHandler var1);

    protected void writeBlob(ByteBufWrapper b, byte[] bytes) {
        b.buf().writeShort(bytes.length);
        b.buf().writeBytes(bytes);
    }

    protected byte[] readBlob(ByteBufWrapper b) {
        short key = b.buf().readShort();
        if (key >= 0) {
            byte[] blob = new byte[key];
            b.buf().readBytes(blob);
            return blob;
        }
        System.out.println("Key was smaller than nothing!  Weird key!");
        return null;
    }

    public <T> void attach(T obj) {
        this.attachment = obj;
    }

    public <T> T getAttachment() {
        return (T)this.attachment;
    }

    static {
        LCPacket.addPacket(0, LCPacketClientVoice.class);
        LCPacket.addPacket(1, LCPacketVoiceChannelSwitch.class);
        LCPacket.addPacket(2, LCPacketVoiceMute.class);
        LCPacket.addPacket(26, LCPacketEmoteBroadcast.class);
        LCPacket.addPacket(3, LCPacketCooldown.class);
        LCPacket.addPacket(4, LCPacketHologram.class);
        LCPacket.addPacket(6, LCPacketHologramRemove.class);
        LCPacket.addPacket(5, LCPacketHologramUpdate.class);
        LCPacket.addPacket(7, LCPacketNametagsOverride.class);
        LCPacket.addPacket(8, LCPacketNametagsUpdate.class);
        LCPacket.addPacket(9, LCPacketNotification.class);
        LCPacket.addPacket(10, LCPacketServerRule.class);
        LCPacket.addPacket(11, LCPacketServerUpdate.class);
        LCPacket.addPacket(12, LCPacketStaffModState.class);
        LCPacket.addPacket(13, LCPacketTeammates.class);
        LCPacket.addPacket(14, LCPacketTitle.class);
        LCPacket.addPacket(15, LCPacketUpdateWorld.class);
        LCPacket.addPacket(16, LCPacketVoice.class);
        LCPacket.addPacket(17, LCPacketVoiceChannel.class);
        LCPacket.addPacket(18, LCPacketVoiceChannelRemove.class);
        LCPacket.addPacket(19, LCPacketVoiceChannelUpdate.class);
        LCPacket.addPacket(20, LCPacketWorldBorder.class);
        LCPacket.addPacket(21, LCPacketWorldBorderRemove.class);
        LCPacket.addPacket(22, LCPacketWorldBorderUpdate.class);
        LCPacket.addPacket(23, LCPacketWaypointAdd.class);
        LCPacket.addPacket(24, LCPacketWaypointRemove.class);
    }
}

