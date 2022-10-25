package net.minecraft.scoreboard;/*
 * Decompiled with CFR 0.150.
 */
import obf.class_1277;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IScoreObjectiveCriteria {
    public static final Map field_96643_a = new HashMap();
    public static final IScoreObjectiveCriteria lllIlIIlIIIlIlIIIllIlllIl = new ScoreDummyCriteria("dummy");
    public static final IScoreObjectiveCriteria IlIllllllIIlIIllllIIlIIIl = new ScoreDummyCriteria("deathCount");
    public static final IScoreObjectiveCriteria lIlllIlllIIIIlIIlllIllIII = new ScoreDummyCriteria("playerKillCount");
    public static final IScoreObjectiveCriteria IlIIIIIllllllIIlllIllllll = new ScoreDummyCriteria("totalKillCount");
    public static final IScoreObjectiveCriteria lIllllIIlIIIlIllllllIIIll = new class_1277("health");

    public String func_96636_a();

    public int lllIIIllIIIIlllIlIIllIIll(List var1);

    public boolean lllIlIIlIIIlIlIIIllIlllIl();
}

