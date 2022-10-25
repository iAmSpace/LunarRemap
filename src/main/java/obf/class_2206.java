package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_2206
extends class_0094 {
    public class_2206() {
    }

    public class_2206(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1844)class_10362, list, random, 1, 1);
    }

    public static class_2206 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -1, 0, 9, 5, 11, n4);
        return class_2206.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_2206(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 8, 4, 10, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 1, 1, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 10, 3, 3, 10, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 1, 4, 3, 1, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 3, 4, 3, 3, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 7, 4, 3, 7, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 9, 4, 3, 9, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 4, 4, 3, 6, Blocks.IIIIIlllIIllllIlllIlllIIl, Blocks.IIIIIlllIIllllIlllIlllIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 1, 5, 7, 3, 5, Blocks.IIIIIlllIIllllIlllIlllIIl, Blocks.IIIIIlllIIllllIlllIlllIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, 4, 3, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, 4, 3, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllIlllIIIIlIIIllIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIIIIllIlllIIIIlIIIllIl, 3), 4, 1, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllIlllIIIIlIIIllIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIIIIllIlllIIIIlIIIllIl, 3) + 8, 4, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllIlllIIIIlIIIllIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIIIIllIlllIIIIlIIIllIl, 3), 4, 1, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllIlllIIIIlIIIllIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIIIIllIlllIIIIlIIIllIl, 3) + 8, 4, 2, 8, class_20462);
        return true;
    }
}

