package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_1535
extends class_0094 {
    private int lllIIIllIIIIlllIlIIllIIll;

    public class_1535() {
    }

    public class_1535(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = n2 != 2 && n2 != 0 ? class_20462.lllIlIIlIIIlIlIIIllIlllIl() : class_20462.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Steps", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("Steps");
    }

    public static class_2046 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4) {
        boolean bl = true;
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -1, 0, 5, 5, 4, n4);
        class_1036 class_10362 = class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462);
        if (class_10362 == null) {
            return null;
        }
        if (class_10362.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl == class_20462.lllIlIIlIIIlIlIIIllIlllIl) {
            for (int i = 3; i >= 1; --i) {
                class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -1, 0, 5, 5, i - 1, n4);
                if (class_10362.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_20462)) continue;
                return class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -1, 0, 5, 5, i, n4);
            }
        }
        return null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 0, 0, i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 1, 0, i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 2, 0, i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3, 0, i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 4, 0, i, class_20462);
            for (int j = 1; j <= 3; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 0, j, i, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 1, j, i, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2, j, i, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 3, j, i, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 4, j, i, class_20462);
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 0, 4, i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 1, 4, i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 2, 4, i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3, 4, i, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 4, 4, i, class_20462);
        }
        return true;
    }
}

