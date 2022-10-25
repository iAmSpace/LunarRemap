package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;
import net.minecraft.scoreboard.ScoreDummyCriteria;

import java.util.List;

public class class_1277
extends ScoreDummyCriteria {
    public class_1277(String string) {
        super(string);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(List list) {
        float f = 0.0f;
        for (class_0814 class_08142 : list) {
            f += class_08142.lllIIIlllIlllIIlIllllIIlI() + class_08142.lllIlllllIllIlIIlIlIIIlll();
        }
        if (list.size() > 0) {
            f /= (float)list.size();
        }
        return MathHelper.lIllllIIlIIIlIllllllIIIll(f);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return true;
    }
}

