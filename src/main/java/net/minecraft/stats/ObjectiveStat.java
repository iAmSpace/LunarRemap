package net.minecraft.stats;

import net.minecraft.scoreboard.ScoreDummyCriteria;

public class ObjectiveStat extends ScoreDummyCriteria {
    private final StatBase field_151459_g;

    public ObjectiveStat(StatBase class_03192) {
        super(class_03192.statId);
        this.field_151459_g = class_03192;
    }
}

