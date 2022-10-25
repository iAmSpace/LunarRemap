package net.minecraft.scoreboard;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.scoreboard.IScoreObjectiveCriteria;

import java.util.List;

public class ScoreDummyCriteria
implements IScoreObjectiveCriteria {
    private final String IIIllIIlIIIIIIlIlIIllIIlI;

    public ScoreDummyCriteria(String string) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = string;
        IScoreObjectiveCriteria.field_96643_a.put(string, this);
    }

    @Override
    public String func_96636_a() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(List list) {
        return 0;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return false;
    }
}

