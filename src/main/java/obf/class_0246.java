package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0246
extends class_0094 {
    public class_0246() {
    }

    public class_0246(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        if (this.lIllllIIlIIIlIllllllIIIll != 2 && this.lIllllIIlIIIlIllllllIIIll != 3) {
            this.IlIllllllIIlIIllllIIlIIIl((class_1844)class_10362, list, random, 1, 1);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1844)class_10362, list, random, 1, 1);
        }
    }

    public static class_0246 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -1, 0, 5, 5, 5, n4);
        return class_0246.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0246(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 4, 4, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 1, 1, 0);
        if (this.lIllllIIlIIIlIllllllIIIll != 2 && this.lIllllIIlIIIlIllllllIIIll != 3) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 1, 4, 3, 3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 1, 0, 3, 3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        return true;
    }
}

