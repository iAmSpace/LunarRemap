package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_1509
extends class_1036 {
    public class_1509() {
    }

    public class_1509(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }

    public static class_2046 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4) {
        class_2046 class_20462 = new class_2046(n, n2 - 5, n3, n, n2 + 2, n3);
        switch (n4) {
            case 0: {
                class_20462.lIlllIlllIIIIlIIlllIllIII = n + 2;
                class_20462.lIllllIIlIIIlIllllllIIIll = n3 + 8;
                break;
            }
            case 1: {
                class_20462.lllIIIllIIIIlllIlIIllIIll = n - 8;
                class_20462.lIllllIIlIIIlIllllllIIIll = n3 + 2;
                break;
            }
            case 2: {
                class_20462.lIlllIlllIIIIlIIlllIllIII = n + 2;
                class_20462.IlIllllllIIlIIllllIIlIIIl = n3 - 8;
                break;
            }
            case 3: {
                class_20462.lIlllIlllIIIIlIIlllIllIII = n + 8;
                class_20462.lIllllIIlIIIlIllllllIIIll = n3 + 2;
            }
        }
        return class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) != null ? null : class_20462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        int n = this.IlIllllllIIlIIllllIIlIIIl();
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n);
                break;
            }
            case 1: {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, 1, n);
                break;
            }
            case 2: {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n);
                break;
            }
            case 3: {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, 3, n);
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 0, 2, 7, 1, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 7, 2, 2, 8, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        for (int i = 0; i < 5; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5 - i - (i < 4 ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        return true;
    }
}

