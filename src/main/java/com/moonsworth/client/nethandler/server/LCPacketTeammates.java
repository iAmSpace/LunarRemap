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

public class LCPacketTeammates
extends LCPacket {
    private UUID leader;
    private long lastMs;
    private Map<UUID, Map<String, Double>> players;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.buf().writeBoolean(this.leader != null);
        if (this.leader != null) {
            b.writeUUID(this.leader);
        }
        b.buf().writeLong(this.lastMs);
        b.writeVarInt(this.players.values().size());
        for (Map.Entry<UUID, Map<String, Double>> entry : this.players.entrySet()) {
            b.writeUUID(entry.getKey());
            b.writeVarInt(entry.getValue().values().size());
            for (Map.Entry<String, Double> entry1 : entry.getValue().entrySet()) {
                b.writeString(entry1.getKey());
                b.buf().writeDouble(entry1.getValue());
            }
        }
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        boolean hasLeader = b.buf().readBoolean();
        if (hasLeader) {
            this.leader = b.readUUID();
        }
        this.lastMs = b.buf().readLong();
        int playersSize = b.readVarInt();
        this.players = new HashMap<UUID, Map<String, Double>>();
        for (int i = 0; i < playersSize; ++i) {
            UUID uuid = b.readUUID();
            int posMapSize = b.readVarInt();
            HashMap<String, Double> posMap = new HashMap<String, Double>();
            for (int j = 0; j < posMapSize; ++j) {
                String key = b.readString();
                double val = b.buf().readDouble();
                posMap.put(key, val);
            }
            this.players.put(uuid, posMap);
        }
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleTeammates(this);
    }

    public UUID getLeader() {
        return this.leader;
    }

    public long getLastMs() {
        return this.lastMs;
    }

    public Map<UUID, Map<String, Double>> getPlayers() {
        return this.players;
    }

    @ConstructorProperties(value={"leader", "lastMs", "players"})
    public LCPacketTeammates(UUID leader, long lastMs, Map<UUID, Map<String, Double>> players) {
        this.leader = leader;
        this.lastMs = lastMs;
        this.players = players;
    }

    public LCPacketTeammates() {
    }
}

