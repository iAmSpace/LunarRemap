package com.moonsworth.lunar.client.events.type;

import com.moonsworth.lunar.client.events.Event;

public class PluginMessageEvent
extends Event {
    private final String channel;
    private final byte[] payload;

    public PluginMessageEvent(String channel, byte[] payload) {
        this.channel = channel;
        this.payload = payload;
    }

    public String getChannel() {
        return this.channel;
    }

    public byte[] getPayload() {
        return this.payload;
    }
}

