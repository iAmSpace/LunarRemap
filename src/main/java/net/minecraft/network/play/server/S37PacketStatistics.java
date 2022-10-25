package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

import java.util.Iterator;
import java.util.Map;

public class S37PacketStatistics
extends Packet {
    private Map field_148976_a;

    public S37PacketStatistics() {
    }

    public S37PacketStatistics(Map map) {
        this.field_148976_a = map;
    }

    public void processPacket(INetHandlerPlayClient class_05962) {
        class_05962.handleStatistics(this);
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        int n = class_01812.readVarIntFromBuffer();
        this.field_148976_a = Maps.newHashMap();
        for (int i = 0; i < n; ++i) {
            StatBase class_03192 = StatList.func_151177_a(class_01812.readStringFromBuffer(32767));
            int n2 = class_01812.readVarIntFromBuffer();
            if (class_03192 == null) continue;
            this.field_148976_a.put(class_03192, n2);
        }
    }

    @Override
    public void writePacketData(PacketBuffer p_148840_1_) {
        p_148840_1_.writeVarIntToBuffer(this.field_148976_a.size());
        Iterator iterator = this.field_148976_a.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry)iterator.next();
            p_148840_1_.writeStringToBuffer(((StatBase)entry.getKey()).statId);
            p_148840_1_.writeVarIntToBuffer((Integer) entry.getValue());
        }
    }

    @Override
    public String serialize() {
        return String.format("count=%d", this.field_148976_a.size());
    }

    public Map func_148974_c() {
        return this.field_148976_a;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.processPacket((INetHandlerPlayClient)class_20752);
    }
}

