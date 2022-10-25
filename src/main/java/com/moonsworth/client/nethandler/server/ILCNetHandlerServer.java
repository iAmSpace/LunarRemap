/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.server;

import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.client.LCPacketClientVoice;
import com.moonsworth.client.nethandler.client.LCPacketVoiceChannelSwitch;
import com.moonsworth.client.nethandler.client.LCPacketVoiceMute;

public interface ILCNetHandlerServer
extends ILCNetHandler {
    public void handleVoice(LCPacketClientVoice var1);

    public void handleVoiceChannelSwitch(LCPacketVoiceChannelSwitch var1);

    public void handleVoiceMute(LCPacketVoiceMute var1);
}

