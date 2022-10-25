package obf;

import net.minecraft.stats.IStatType;
import net.minecraft.stats.StatBase;

/*
 * Decompiled with CFR 0.150.
 */
final class class_0310
implements IStatType {
    class_0310() {
    }

    @Override
    public String format(int p_75843_1_) {
        double d = (double) p_75843_1_ / 20.0;
        double d2 = d / 60.0;
        double d3 = d2 / 60.0;
        double d4 = d3 / 24.0;
        double d5 = d4 / 365.0;
        return d5 > 0.5 ? StatBase.lllIIlIIIllllllIIIIlIlIlI().format(d5) + " y" : (d4 > 0.5 ? StatBase.lllIIlIIIllllllIIIIlIlIlI().format(d4) + " d" : (d3 > 0.5 ? StatBase.lllIIlIIIllllllIIIIlIlIlI().format(d3) + " h" : (d2 > 0.5 ? StatBase.lllIIlIIIllllllIIIIlIlIlI().format(d2) + " m" : d + " s")));
    }
}

