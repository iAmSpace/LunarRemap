package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0293
extends class_1437 {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0293() {
    }

    public class_0293(class_0206 class_02062, int n, Random random, class_2046 class_20462, int n2) {
        super(class_02062, n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = random.nextBoolean();
        this.lllIlIIlIIIlIlIIIllIlllIl = random.nextInt(3);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("T", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("C", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("T");
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("C");
    }

    public static class_0293 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 0, 0, 4, 6, 5, n4);
        return class_0293.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0293(class_02062, n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII = this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, class_20462);
            if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
                return true;
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(0, this.lIIIIlIlIIlllllIIllIIlIII - this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll + 6 - 1, 0);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 1, 3, 5, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 3, 0, 4, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 1, 2, 0, 3, Blocks.lIlllIlllIIIIlIIlllIllIII, Blocks.lIlllIlllIIIIlIIlllIllIII, false);
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 4, 1, 2, 4, 3, Blocks.log, Blocks.log, false);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 5, 1, 2, 5, 3, Blocks.log, Blocks.log, false);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 1, 4, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 2, 4, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 1, 4, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 2, 4, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 0, 4, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 0, 4, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 0, 4, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 3, 4, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 3, 4, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.log, 0, 3, 4, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 0, 0, 3, 0, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 0, 3, 3, 0, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 4, 0, 3, 4, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 4, 3, 3, 4, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 1, 0, 3, 3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 1, 3, 3, 3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 0, 2, 3, 0, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 4, 2, 3, 4, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 0, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 3, 2, 2, class_20462);
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, this.lllIlIIlIIIlIlIIIllIlllIl, 1, 3, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIllIIIlIIlIlIIIlII, 0, this.lllIlIIlIIIlIlIIIllIlllIl, 2, 3, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 1, 1, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 1, 2, 0, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 1, 1, 0, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIllIlIlIllIIIlIIlIlIIl, 1));
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, 1, 0, -1, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && this.lllIIIllIIIIlllIlIIllIIll(class_13342, 1, -1, -1, class_20462).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 3), 1, 0, -1, class_20462);
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, j, 6, i, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, j, -1, i, class_20462);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 2, 1);
        return true;
    }
}

