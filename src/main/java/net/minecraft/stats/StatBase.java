package net.minecraft.stats;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.util.IChatComponent;
import obf.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class StatBase {
    public final String statId;
    private final IChatComponent statName;
    public boolean isIndependent;
    private final IStatType type;
    private final IScoreObjectiveCriteria field_150957_c;
    private Class lIlllIlllIIIIlIIlllIllIII;
    private static NumberFormat lIIIIlIlIIlllllIIllIIlIII = NumberFormat.getIntegerInstance(Locale.US);
    public static IStatType IIIllIIlIIIIIIlIlIIllIIlI = new class_0899();
    private static DecimalFormat llIIlllIllIllllIIIlIIIIII = new DecimalFormat("########0.00");
    public static IStatType IllIIlllllllIIlIIlIIIIlIl = new class_0310();
    public static IStatType IIIllIllIIlIlIlIlIllllIIl = new class_1611();
    public static IStatType IllIIIllIIIIlIlIlIllIIlll = new class_1621();

    public StatBase(String string, IChatComponent class_22552, IStatType class_18692) {
        this.statId = string;
        this.statName = class_22552;
        this.type = class_18692;
        this.field_150957_c = new ObjectiveStat(this);
        IScoreObjectiveCriteria.field_96643_a.put(this.field_150957_c.func_96636_a(), this.field_150957_c);
    }

    public StatBase(String string, IChatComponent class_22552) {
        this(string, class_22552, IIIllIIlIIIIIIlIlIIllIIlI);
    }

    public StatBase IIIllIllIIlIlIlIlIllllIIl() {
        this.isIndependent = true;
        return this;
    }

    public StatBase IllIIlllllllIIlIIlIIIIlIl() {
        if (StatList.oneShotStats.containsKey(this.statId)) {
            throw new RuntimeException("Duplicate stat id: \"" + ((StatBase) StatList.oneShotStats.get((Object)this.statId)).statName + "\" and \"" + this.statName + "\" at id " + this.statId);
        }
        StatList.allStats.add(this);
        StatList.oneShotStats.put(this.statId, this);
        return this;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }

    public String lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.type.format(n);
    }

    public IChatComponent IlIIIIIllllllIIlllIllllll() {
        IChatComponent class_22552 = this.statName.IIIllIllIIlIlIlIlIllllIIl();
        class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.IllIIlllllllIIlIIlIIIIlIl);
        class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0015(class_0248.lllIlIIlIIIlIlIIIllIlllIl, new class_0722(this.statId)));
        return class_22552;
    }

    public IChatComponent IllIIIllIIIIlIlIlIllIIlll() {
        IChatComponent class_22552 = this.IlIIIIIllllllIIlllIllllll();
        IChatComponent class_22553 = new class_0722("[").lllIIIllIIIIlllIlIIllIIll(class_22552).lllIIIllIIIIlllIlIIllIIll("]");
        class_22553.lllIIIllIIIIlllIlIIllIIll(class_22552.lllIlIIlIIIlIlIIIllIlllIl());
        return class_22553;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            StatBase class_03192 = (StatBase)object;
            return this.statId.equals(class_03192.statId);
        }
        return false;
    }

    public int hashCode() {
        return this.statId.hashCode();
    }

    public String toString() {
        return "Stat{id=" + this.statId + ", nameId=" + this.statName + ", awardLocallyOnly=" + this.isIndependent + ", formatter=" + this.type + ", objectiveCriteria=" + this.field_150957_c + '}';
    }

    public IScoreObjectiveCriteria lIIIIlIlIIlllllIIllIIlIII() {
        return this.field_150957_c;
    }

    public Class llIIlllIllIllllIIIlIIIIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public StatBase lllIlIIlIIIlIlIIIllIlllIl(Class class_) {
        this.lIlllIlllIIIIlIIlllIllIII = class_;
        return this;
    }

    static /* synthetic */ NumberFormat llIIllIllIlIIlIIllIllllll() {
        return lIIIIlIlIIlllllIIllIIlIII;
    }

    static /* synthetic */ DecimalFormat lllIIlIIIllllllIIIIlIlIlI() {
        return llIIlllIllIllllIIIlIIIIII;
    }
}

