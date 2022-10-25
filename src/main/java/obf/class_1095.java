package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;

import java.util.Map;

public class class_1095
extends class_0703 {
    private Map lllIIIllIIIIlllIlIIllIIll;

    public class_1095() {
    }

    public class_1095(Map map) {
        this.lllIIIllIIIIlllIlIIllIIll = map;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        int n = class_01812.lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll = Maps.newHashMap();
        for (int i = 0; i < n; ++i) {
            StatBase class_03192 = StatList.lllIIIllIIIIlllIlIIllIIll(class_01812.IlIllllllIIlIIllllIIlIIIl(32767));
            int n2 = class_01812.lllIIIllIIIIlllIlIIllIIll();
            if (class_03192 == null) continue;
            this.lllIIIllIIIIlllIlIIllIIll.put(class_03192, n2);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.size());
        for (Map.Entry entry : this.lllIIIllIIIIlllIlIIllIIll.entrySet()) {
            class_01812.lllIIIllIIIIlllIlIIllIIll(((StatBase)entry.getKey()).statId);
            class_01812.lllIlIIlIIIlIlIIIllIlllIl((Integer)entry.getValue());
        }
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return String.format("count=%d", this.lllIIIllIIIIlllIlIIllIIll.size());
    }

    public Map IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

