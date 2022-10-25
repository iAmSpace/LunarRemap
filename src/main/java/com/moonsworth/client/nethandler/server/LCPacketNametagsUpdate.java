/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.server;

import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.ILCNetHandlerClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class LCPacketNametagsUpdate
extends LCPacket {
    private Map<UUID, List<String>> playersMap;

    public LCPacketNametagsUpdate() {
    }

    public LCPacketNametagsUpdate(Map<UUID, List<String>> playersMap) {
        this.playersMap = playersMap;
    }

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeVarInt(this.playersMap == null ? -1 : this.playersMap.size());
        if (this.playersMap != null) {
            for (Map.Entry<UUID, List<String>> entry : this.playersMap.entrySet()) {
                UUID uuid = entry.getKey();
                List<String> tags = entry.getValue();
                b.writeUUID(uuid);
                b.writeVarInt(tags.size());
                for (String s : tags) {
                    b.writeString(s);
                }
            }
        }
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        int playersMapSize = b.readVarInt();
        if (playersMapSize == -1) {
            this.playersMap = null;
            return;
        }
        this.playersMap = new HashMap<UUID, List<String>>();
        for (int i = 0; i < playersMapSize; ++i) {
            UUID uuid = b.readUUID();
            int tagsSize = b.readVarInt();
            ArrayList<String> tags = new ArrayList<String>();
            for (int j = 0; j < tagsSize; ++j) {
                tags.add(b.readString());
            }
            this.playersMap.put(uuid, tags);
        }
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleNametagsUpdate(this);
    }

    public Map<UUID, List<String>> getPlayersMap() {
        return this.playersMap;
    }
}

