package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0485
extends class_0608 {
    public class_0485() {
    }

    public class_0485(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1486)class_10362, list, random, 1, 0, true);
    }

    public static class_0485 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -7, 0, 5, 14, 10, n4);
        return class_0485.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0485(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIllIlllIllIlIIIIlIIlIII, 2);
        for (int i = 0; i <= 9; ++i) {
            int n2 = Math.max(1, 7 - i);
            int n3 = Math.min(Math.max(n2 + 5, 14 - i), 13);
            int n4 = i;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, i, 4, n2, i, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, n2 + 1, i, 3, n3 - 1, i, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            if (i <= 6) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n, 1, n2 + 1, i, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n, 2, n2 + 1, i, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n, 3, n2 + 1, i, class_20462);
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, n3, i, 4, n3, i, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, n2 + 1, i, 0, n3 - 1, i, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, n2 + 1, i, 4, n3 - 1, i, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
            if ((i & 1) == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, n2 + 2, i, 0, n2 + 3, i, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, n2 + 2, i, 4, n2 + 3, i, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
            }
            for (int j = 0; j <= 4; ++j) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, j, -1, n4, class_20462);
            }
        }
        return true;
    }
}

