package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0620
extends class_1437 {
    private boolean lllIIIllIIIIlllIlIIllIIll;

    public class_0620() {
    }

    public class_0620(class_0206 class_02062, int n, Random random, class_2046 class_20462, int n2) {
        super(class_02062, n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = random.nextBoolean();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Terrace", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("Terrace");
    }

    public static class_0620 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 0, 0, 5, 6, 5, n4);
        return class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) != null ? null : new class_0620(class_02062, n5, random, class_20462, n4);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII = this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, class_20462);
            if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
                return true;
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(0, this.lIIIIlIlIIlllllIIllIIlIII - this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll + 6 - 1, 0);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 0, 4, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 4, 0, 4, 4, 4, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 4, 1, 3, 4, 3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 0, 1, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 0, 2, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 0, 3, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, 1, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, 2, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, 3, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 0, 1, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 0, 2, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 0, 3, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, 1, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, 2, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, 3, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 1, 0, 3, 3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 1, 4, 3, 3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 4, 3, 3, 4, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 0, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 2, 2, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 4, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 1, 1, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 1, 2, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 1, 3, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 2, 3, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 3, 3, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 3, 2, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 3, 1, 0, class_20462);
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, 2, 0, -1, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && this.lllIIIllIIIIlllIlIIllIIll(class_13342, 2, -1, -1, class_20462).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 3), 2, 0, -1, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 1, 3, 3, 3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 0, 5, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 1, 5, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 2, 5, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 3, 5, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 5, 0, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 0, 5, 4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 1, 5, 4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 2, 5, 4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 3, 5, 4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 5, 4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 5, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 5, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 5, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 0, 5, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 0, 5, 2, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 0, 5, 3, class_20462);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            n = this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIIllIllIIIIIlIllllIIIl, 3);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 3, 1, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 3, 2, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 3, 3, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 3, 4, 3, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 2, 3, 1, class_20462);
        for (n = 0; n < 5; ++n) {
            for (int i = 0; i < 5; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, i, 6, n, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, i, -1, n, class_20462);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 2, 1);
        return true;
    }
}

