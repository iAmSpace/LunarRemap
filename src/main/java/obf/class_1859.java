package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_1859
extends class_0608 {
    public class_1859() {
    }

    public class_1859(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    protected class_1859(Random random, int n, int n2) {
        super(0);
        this.lIllllIIlIIIlIllllllIIIll = random.nextInt(4);
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: 
            case 2: {
                this.IlIIIIIllllllIIlllIllllll = new class_2046(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
                break;
            }
            default: {
                this.IlIIIIIllllllIIlllIllllll = new class_2046(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1486)class_10362, list, random, 8, 3, false);
        this.lllIlIIlIIIlIlIIIllIlllIl((class_1486)class_10362, list, random, 3, 8, false);
        this.IlIllllllIIlIIllllIIlIIIl((class_1486)class_10362, list, random, 3, 8, false);
    }

    public static class_1859 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -8, -3, 0, 19, 10, 19, n4);
        return class_1859.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_1859(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 3, 0, 11, 4, 18, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 3, 7, 18, 4, 11, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 5, 0, 10, 7, 18, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 8, 18, 7, 10, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 5, 0, 7, 5, 7, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 5, 11, 7, 5, 18, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 11, 5, 0, 11, 5, 7, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 11, 5, 11, 11, 5, 18, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 7, 7, 5, 7, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 11, 5, 7, 18, 5, 7, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 11, 7, 5, 11, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 11, 5, 11, 18, 5, 11, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 2, 0, 11, 2, 5, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 2, 13, 11, 2, 18, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 0, 0, 11, 1, 3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 0, 15, 11, 1, 18, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        for (n2 = 7; n2 <= 11; ++n2) {
            for (n = 0; n <= 2; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n2, -1, n, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n2, -1, 18 - n, class_20462);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, 7, 5, 2, 11, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 13, 2, 7, 18, 2, 11, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 7, 3, 1, 11, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 15, 0, 7, 18, 1, 11, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        for (n2 = 0; n2 <= 2; ++n2) {
            for (n = 7; n <= 11; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n2, -1, n, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, 18 - n2, -1, n, class_20462);
            }
        }
        return true;
    }
}

