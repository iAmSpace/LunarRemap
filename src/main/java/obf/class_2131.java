package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_2131
extends class_0094 {
    public class_2131() {
    }

    public class_2131(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1844)class_10362, list, random, 1, 1);
    }

    public static class_2131 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -7, 0, 5, 11, 8, n4);
        return class_2131.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_2131(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 10, 7, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 1, 7, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, class_0462.lllIIIllIIIIlllIlIIllIIll, 1, 1, 7);
        int n = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 2);
        for (int i = 0; i < 6; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n, 1, 6 - i, 1 + i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n, 2, 6 - i, 1 + i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, n, 3, 6 - i, 1 + i, class_20462);
            if (i >= 5) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 1, 5 - i, 1 + i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 2, 5 - i, 1 + i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3, 5 - i, 1 + i, class_20462);
        }
        return true;
    }
}

