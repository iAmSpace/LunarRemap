package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_1289
extends class_0608 {
    private boolean lllIlIIlIIIlIlIIIllIlllIl;

    public class_1289() {
    }

    public class_1289(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIlIIlIIIlIlIIIllIlllIl = random.nextInt(3) == 0;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Chest");
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Chest", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1486)class_10362, list, random, 0, 1, true);
    }

    public static class_1289 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, 0, 0, 5, 7, 5, n4);
        return class_1289.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_1289(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 1, 4, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, 0, 4, 5, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, 0, 0, 5, 4, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 3, 1, 0, 4, 1, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 3, 3, 0, 4, 3, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.lllIlIIllllIllIIIlIlIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 2, 0, 4, 5, 0, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 2, 4, 4, 5, 4, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 3, 4, 1, 4, 4, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 3, 4, 3, 4, 4, Blocks.lllIlIIllllIllIIIlIlIIIll, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            int n3;
            n2 = this.lllIIIllIIIIlllIlIIllIIll(2);
            n = this.lllIIIllIIIIlllIlIIllIIll(1, 3);
            if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 = this.lllIlIIlIIIlIlIIIllIlllIl(1, 3))) {
                this.lllIlIIlIIIlIlIIIllIlllIl = false;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 1, 2, 3, lllIIIllIIIIlllIlIIllIIll, 2 + random.nextInt(4));
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 6, 0, 4, 6, 4, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        for (n2 = 0; n2 <= 4; ++n2) {
            for (n = 0; n <= 4; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.llIllIllIllIlIlIllIlIIIIl, 0, n2, -1, n, class_20462);
            }
        }
        return true;
    }
}

