/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.obj;

public enum ServerRule {
    VOICE_ENABLED("voiceEnabled", Boolean.class),
    MINIMAP_STATUS("minimapStatus", String.class),
    SERVER_HANDLES_WAYPOINTS("serverHandlesWaypoints", Boolean.class),
    COMPETITIVE_GAMEMODE("competitiveGame", Boolean.class);

    String rule;
    Class value;

    private ServerRule(String rule, Class clazz) {
        this.rule = rule;
        this.value = clazz;
    }

    public static ServerRule getRule(String s) {
        ServerRule rule = null;
        for (ServerRule sr : ServerRule.values()) {
            if (!sr.getRule().equals(s)) continue;
            rule = sr;
        }
        return rule;
    }

    public String getRule() {
        return this.rule;
    }

    public Class getValue() {
        return this.value;
    }
}

