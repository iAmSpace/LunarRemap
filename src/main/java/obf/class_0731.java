package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0731
extends class_1437 {
    public class_0731() {
    }

    public class_0731(class_0206 class_02062, int n, Random random, class_2046 class_20462, int n2) {
        super(class_02062, n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    public static class_0731 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 0, 0, 9, 7, 11, n4);
        return class_0731.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0731(class_02062, n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII = this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, class_20462);
            if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
                return true;
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(0, this.lIIIIlIlIIlllllIIllIIlIII - this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll + 7 - 1, 0);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 1, 7, 4, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 1, 6, 8, 4, 10, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 0, 6, 8, 0, 10, Blocks.lIlllIlllIIIIlIIlllIllIII, Blocks.lIlllIlllIIIIlIIlllIllIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 6, 0, 6, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 1, 6, 2, 1, 10, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 1, 6, 8, 1, 10, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 10, 7, 1, 10, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 1, 7, 0, 4, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 0, 3, 5, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 0, 0, 8, 3, 5, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 0, 7, 1, 0, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 5, 7, 1, 5, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 2, 0, 7, 3, 0, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 2, 5, 7, 3, 5, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 4, 1, 8, 4, 1, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 4, 4, 8, 4, 4, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 2, 8, 5, 3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 0, 4, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 0, 4, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 8, 4, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 8, 4, 3, class_20462);
        int n3 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.IllllIIlIIIllIlllIlllIllI, 3);
        int n4 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.IllllIIlIIIllIlllIlllIllI, 2);
        for (n2 = -1; n2 <= 2; ++n2) {
            for (n = 0; n <= 8; ++n) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IllllIIlIIIllIlllIlllIllI, n3, n, 4 + n2, n2, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IllllIIlIIIllIlllIlllIllI, n4, n, 4 + n2, 5 - n2, class_20462);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 0, 2, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 0, 2, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 8, 2, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 8, 2, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 0, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 0, 2, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 8, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 8, 2, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 2, 2, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 3, 2, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 5, 2, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 6, 2, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 2, 1, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIllIIIlIIlIlIIIlII, 0, 2, 2, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 1, 1, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IllllIIlIIIllIlllIlllIllI, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IllllIIlIIIllIlllIlllIllI, 3), 2, 1, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IllllIIlIIIllIlllIlllIllI, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IllllIIlIIIllIlllIlllIllI, 1), 1, 1, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 0, 1, 7, 0, 3, Blocks.llllIlIIIIIIIIIlllIIlIIIl, Blocks.llllIlIIIIIIIIIlllIIlIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIlIIIIIIIIIlllIIlIIIl, 0, 6, 1, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIlIIIIIIIIIlllIIlIIIl, 0, 6, 1, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2, 1, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2, 2, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 2, 3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 2, 1, 0, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIllIlIlIllIIIlIIlIlIIl, 1));
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, 2, 0, -1, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && this.lllIIIllIIIIlllIlIIllIIll(class_13342, 2, -1, -1, class_20462).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 3), 2, 0, -1, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 6, 1, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 6, 2, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 6, 3, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 6, 1, 5, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIllIlIlIllIIIlIIlIlIIl, 1));
        for (n2 = 0; n2 < 5; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, 7, n2, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, n, -1, n2, class_20462);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 2, 2);
        return true;
    }

    @Override
    protected int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n == 0 ? 4 : 0;
    }
}

