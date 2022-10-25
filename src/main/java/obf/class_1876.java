package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_1876
extends class_0608 {
    public class_1876() {
    }

    public class_1876(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1486)class_10362, list, random, 5, 3, true);
        this.lllIIIllIIIIlllIlIIllIIll((class_1486)class_10362, list, random, 5, 11, true);
    }

    public static class_1876 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -5, -3, 0, 13, 14, 13, n4);
        return class_1876.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_1876(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 3, 0, 12, 4, 12, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 0, 12, 13, 12, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 0, 1, 12, 12, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 11, 5, 0, 12, 12, 12, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 5, 11, 4, 12, 12, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 5, 11, 10, 12, 12, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 9, 11, 7, 12, 12, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 5, 0, 4, 12, 1, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 5, 0, 10, 12, 1, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 9, 0, 7, 12, 1, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 11, 2, 10, 12, 10, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        for (n5 = 1; n5 <= 11; n5 += 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n5, 10, 0, n5, 11, 0, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n5, 10, 12, n5, 11, 12, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 10, n5, 0, 11, n5, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 10, n5, 12, 11, n5, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n5, 13, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n5, 13, 12, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, 0, 13, n5, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, 12, 13, n5, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, n5 + 1, 13, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, n5 + 1, 13, 12, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, 0, 13, n5 + 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, 12, 13, n5 + 1, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, 0, 13, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, 0, 13, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, 0, 13, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, 12, 13, 0, class_20462);
        for (n5 = 3; n5 <= 9; n5 += 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 7, n5, 1, 8, n5, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 11, 7, n5, 11, 8, n5, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        }
        n5 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIllIlllIllIlIIIIlIIlIII, 3);
        for (n4 = 0; n4 <= 6; ++n4) {
            n3 = n4 + 4;
            for (n2 = 5; n2 <= 7; ++n2) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n5, n2, 5 + n4, n3, class_20462);
            }
            if (n3 >= 5 && n3 <= 8) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 5, n3, 7, n4 + 4, n3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
            } else if (n3 >= 9 && n3 <= 10) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 8, n3, 7, n4 + 4, n3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
            }
            if (n4 < 1) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 6 + n4, n3, 7, 9 + n4, n3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        for (n4 = 5; n4 <= 7; ++n4) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n5, n4, 12, 11, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 6, 7, 5, 7, 7, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 6, 7, 7, 7, 7, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 13, 12, 7, 13, 12, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 5, 2, 3, 5, 3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 5, 9, 3, 5, 10, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 5, 4, 2, 5, 8, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 5, 2, 10, 5, 3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 5, 9, 10, 5, 10, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 10, 5, 4, 10, 5, 8, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        n4 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIllIlllIllIlIIIIlIIlIII, 0);
        n3 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIllIlllIllIlIIIIlIIlIII, 1);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n3, 4, 5, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n3, 4, 5, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n3, 4, 5, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n3, 4, 5, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n4, 8, 5, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n4, 8, 5, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n4, 8, 5, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIllIlllIllIlIIIIlIIlIII, n4, 8, 5, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 4, 4, 4, 4, 8, Blocks.llIllllIIIIIlIIlIlllIIlll, Blocks.llIllllIIIIIlIIlIlllIIlll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 4, 4, 9, 4, 8, Blocks.llIllllIIIIIlIIlIlllIIlll, Blocks.llIllllIIIIIlIIlIlllIIlll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 5, 4, 4, 5, 8, Blocks.IlllIIIlIIlIIIIllllIllllI, Blocks.IlllIIIlIIlIIIIllllIllllI, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 5, 4, 9, 5, 8, Blocks.IlllIIIlIIlIIIIllllIllllI, Blocks.IlllIIIlIIlIIIIllllIllllI, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 2, 0, 8, 2, 12, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, 4, 12, 2, 8, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 0, 0, 8, 1, 3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 0, 9, 8, 1, 12, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 4, 3, 1, 8, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 0, 4, 12, 1, 8, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        for (n2 = 4; n2 <= 8; ++n2) {
            for (n = 0; n <= 2; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n2, -1, n, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n2, -1, 12 - n, class_20462);
            }
        }
        for (n2 = 0; n2 <= 2; ++n2) {
            for (n = 4; n <= 8; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n2, -1, n, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, 12 - n2, -1, n, class_20462);
            }
        }
        return true;
    }
}

