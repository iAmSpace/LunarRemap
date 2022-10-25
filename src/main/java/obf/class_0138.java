package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0138
extends class_0608 {
    public class_0138() {
    }

    public class_0138(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1486)class_10362, list, random, 1, 0, true);
        this.lllIlIIlIIIlIlIIIllIlllIl((class_1486)class_10362, list, random, 0, 1, true);
        this.IlIllllllIIlIIllllIIlIIIl((class_1486)class_10362, list, random, 0, 1, true);
    }

    public static class_0138 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, 0, 0, 5, 7, 5, n4);
        return class_0138.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0138(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 1, 4, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, 0, 4, 5, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, 0, 0, 5, 0, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 2, 0, 4, 5, 0, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, 4, 0, 5, 4, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 2, 4, 4, 5, 4, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 6, 0, 4, 6, 4, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 4; ++j) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, i, -1, j, class_20462);
            }
        }
        return true;
    }
}

