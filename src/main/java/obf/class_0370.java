package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0370
extends class_0608 {
    private boolean lllIlIIlIIIlIlIIIllIlllIl;

    public class_0370() {
    }

    public class_0370(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Mob");
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Mob", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public static class_0370 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -2, 0, 0, 7, 8, 9, n4);
        return class_0370.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0370(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, 0, 6, 7, 7, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 0, 5, 1, 7, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 2, 1, 5, 2, 7, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 3, 2, 5, 3, 7, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 4, 3, 5, 4, 7, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 2, 0, 1, 4, 2, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 2, 0, 5, 4, 2, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 5, 2, 1, 5, 3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 5, 2, 5, 5, 3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 3, 0, 5, 8, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 6, 5, 3, 6, 5, 8, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 5, 8, 5, 5, 8, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, 1, 6, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIlIIllllIllIIIlIlIIIll, 0, 5, 6, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 6, 3, 0, 6, 8, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 6, 6, 3, 6, 6, 8, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 6, 8, 5, 7, 8, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 8, 8, 4, 8, 8, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        if (!this.lllIlIIlIIIlIlIIIllIlllIl) {
            int n3;
            n2 = this.lllIIIllIIIIlllIlIIllIIll(5);
            n = this.lllIIIllIIIIlllIlIIllIIll(3, 5);
            if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 = this.lllIlIIlIIIlIlIIIllIlllIl(3, 5))) {
                this.lllIlIIlIIIlIlIIIllIlllIl = true;
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IIlIllIIlllllIIlIIllllIIl, 0, 2);
                class_0933 class_09332 = (class_0933)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
                if (class_09332 != null) {
                    class_09332.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll("Blaze");
                }
            }
        }
        for (n2 = 0; n2 <= 6; ++n2) {
            for (n = 0; n <= 6; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n2, -1, n, class_20462);
            }
        }
        return true;
    }
}

