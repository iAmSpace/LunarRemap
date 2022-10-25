/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.client;

import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.server.LCPacketCooldown;
import com.moonsworth.client.nethandler.server.LCPacketGhost;
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

public interface ILCNetHandlerClient
extends ILCNetHandler {
    public void handleGhost(LCPacketGhost var1);

    public void handleCooldown(LCPacketCooldown var1);

    public void handleNotification(LCPacketNotification var1);

    public void handleStaffModState(LCPacketStaffModState var1);

    public void handleNametagsUpdate(LCPacketNametagsUpdate var1);

    public void handleTeammates(LCPacketTeammates var1);

    public void handleOverrideNametags(LCPacketNametagsOverride var1);

    public void handleAddHologram(LCPacketHologram var1);

    public void handleUpdateHologram(LCPacketHologramUpdate var1);

    public void handleRemoveHologram(LCPacketHologramRemove var1);

    public void handleTitle(LCPacketTitle var1);

    public void handleServerRule(LCPacketServerRule var1);

    public void handleVoice(LCPacketVoice var1);

    public void handleVoiceChannels(LCPacketVoiceChannel var1);

    public void handleVoiceChannelUpdate(LCPacketVoiceChannelUpdate var1);

    public void handleVoiceChannelDelete(LCPacketVoiceChannelRemove var1);

    public void handleUpdateWorld(LCPacketUpdateWorld var1);

    public void handleServerUpdate(LCPacketServerUpdate var1);

    public void handleWorldBorder(LCPacketWorldBorder var1);

    public void handleWorldBorderUpdate(LCPacketWorldBorderUpdate var1);

    public void handleWorldBorderRemove(LCPacketWorldBorderRemove var1);
}

