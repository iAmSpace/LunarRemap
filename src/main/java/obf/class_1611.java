package obf;

import net.minecraft.stats.IStatType;
import net.minecraft.stats.StatBase;

/*
 * Decompiled with CFR 0.150.
 */
final class class_1611
implements IStatType {
    class_1611() {
    }

    @Override
    public String format(int p_75843_1_) {
        double d = (double) p_75843_1_ / 100.0;
        double d2 = d / 1000.0;
        return d2 > 0.5 ? StatBase.lllIIlIIIllllllIIIIlIlIlI().format(d2) + " km" : (d > 0.5 ? StatBase.lllIIlIIIllllllIIIIlIlIlI().format(d) + " m" : p_75843_1_ + " cm");
    }
}

