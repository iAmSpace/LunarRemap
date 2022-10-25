package obf;

import net.minecraft.stats.IStatType;
import net.minecraft.stats.StatBase;

/*
 * Decompiled with CFR 0.150.
 */
final class class_1621
implements IStatType {
    class_1621() {
    }

    @Override
    public String format(int p_75843_1_) {
        return StatBase.lllIIlIIIllllllIIIIlIlIlI().format((double) p_75843_1_ * 0.1);
    }
}

