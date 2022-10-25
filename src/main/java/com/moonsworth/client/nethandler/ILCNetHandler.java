/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler;

import com.moonsworth.client.nethandler.client.LCPacketEmoteBroadcast;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointAdd;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointRemove;

public interface ILCNetHandler {
    public void handleAddWaypoint(LCPacketWaypointAdd var1);

    public void handleRemoveWaypoint(LCPacketWaypointRemove var1);

    public void handleEmote(LCPacketEmoteBroadcast var1);
}

