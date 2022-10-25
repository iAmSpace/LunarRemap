package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraft.util.IJsonSerializable;

import java.util.Map;

public class class_1707 {
    protected final Map lllIIIllIIIIlllIlIIllIIll = Maps.newConcurrentMap();

    public boolean lllIIIllIIIIlllIlIIllIIll(Achievement class_07472) {
        return this.lllIIIllIIIIlllIlIIllIIll((StatBase)class_07472) > 0;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Achievement class_07472) {
        return class_07472.parentAchievement == null || this.lllIIIllIIIIlllIlIIllIIll(class_07472.parentAchievement);
    }

    public int IlIllllllIIlIIllllIIlIIIl(Achievement class_07472) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_07472)) {
            return 0;
        }
        int n = 0;
        Achievement class_07473 = class_07472.parentAchievement;
        while (class_07473 != null && !this.lllIIIllIIIIlllIlIIllIIll(class_07473)) {
            class_07473 = class_07473.parentAchievement;
            ++n;
        }
        return n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, StatBase class_03192, int n) {
        if (!class_03192.lIlllIlllIIIIlIIlllIllIII() || this.lllIlIIlIIIlIlIIIllIlllIl((Achievement)class_03192)) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_08142, class_03192, this.lllIIIllIIIIlllIlIIllIIll(class_03192) + n);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142, StatBase class_03192, int n) {
        class_1142 class_11422 = (class_1142)this.lllIIIllIIIIlllIlIIllIIll.get(class_03192);
        if (class_11422 == null) {
            class_11422 = new class_1142();
            this.lllIIIllIIIIlllIlIIllIIll.put(class_03192, class_11422);
        }
        class_11422.lllIIIllIIIIlllIlIIllIIll(n);
    }

    public int lllIIIllIIIIlllIlIIllIIll(StatBase class_03192) {
        class_1142 class_11422 = (class_1142)this.lllIIIllIIIIlllIlIIllIIll.get(class_03192);
        return class_11422 == null ? 0 : class_11422.lllIIIllIIIIlllIlIIllIIll();
    }

    public IJsonSerializable lllIlIIlIIIlIlIIIllIlllIl(StatBase class_03192) {
        class_1142 class_11422 = (class_1142)this.lllIIIllIIIIlllIlIIllIIll.get(class_03192);
        return class_11422 != null ? class_11422.lllIlIIlIIIlIlIIIllIlllIl() : null;
    }

    public IJsonSerializable lllIIIllIIIIlllIlIIllIIll(StatBase class_03192, IJsonSerializable class_04022) {
        class_1142 class_11422 = (class_1142)this.lllIIIllIIIIlllIlIIllIIll.get(class_03192);
        if (class_11422 == null) {
            class_11422 = new class_1142();
            this.lllIIIllIIIIlllIlIIllIIll.put(class_03192, class_11422);
        }
        class_11422.lllIIIllIIIIlllIlIIllIIll(class_04022);
        return class_04022;
    }
}

