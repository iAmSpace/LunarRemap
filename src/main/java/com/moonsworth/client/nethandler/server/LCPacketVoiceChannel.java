/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.server;

import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.ILCNetHandlerClient;
import java.beans.ConstructorProperties;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LCPacketVoiceChannel
extends LCPacket {
    private UUID uuid;
    private String name;
    private Map<UUID, String> players;
    private Map<UUID, String> listening;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeUUID(this.uuid);
        b.writeString(this.name);
        this.writeMap(b, this.players);
        this.writeMap(b, this.listening);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.uuid = b.readUUID();
        this.name = b.readString();
        this.players = this.readMap(b);
        this.listening = this.readMap(b);
    }

    private void writeMap(ByteBufWrapper b, Map<UUID, String> players) {
        b.writeVarInt(players.size());
        for (Map.Entry<UUID, String> player : players.entrySet()) {
            b.writeUUID(player.getKey());
            b.writeString(player.getValue());
        }
    }

    private Map<UUID, String> readMap(ByteBufWrapper b) {
        int size = b.readVarInt();
        HashMap<UUID, String> players = new HashMap<UUID, String>();
        for (int i = 0; i < size; ++i) {
            UUID uuid = b.readUUID();
            String name = b.readString();
            players.put(uuid, name);
        }
        return players;
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleVoiceChannels(this);
    }

    @ConstructorProperties(value={"uuid", "name", "players", "listening"})
    public LCPacketVoiceChannel(UUID uuid, String name, Map<UUID, String> players, Map<UUID, String> listening) {
        this.uuid = uuid;
        this.name = name;
        this.players = players;
        this.listening = listening;
    }

    public LCPacketVoiceChannel() {
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public Map<UUID, String> getPlayers() {
        return this.players;
    }

    public Map<UUID, String> getListening() {
        return this.listening;
    }
}

