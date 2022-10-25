package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0157
extends class_0094 {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;

    public class_0157() {
    }

    public class_0157(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = random.nextInt(2) == 0;
        this.lllIlIIlIIIlIlIIIllIlllIl = random.nextInt(2) == 0;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Left", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Right", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("Left");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Right");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1844)class_10362, list, random, 1, 1);
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1844)class_10362, list, random, 1, 2);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.IlIllllllIIlIIllllIIlIIIl((class_1844)class_10362, list, random, 1, 2);
        }
    }

    public static class_0157 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -1, 0, 5, 5, 7, n4);
        return class_0157.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0157(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 4, 6, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 1, 1, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, class_0462.lllIIIllIIIIlllIlIIllIIll, 1, 1, 6);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.1f, 1, 2, 1, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.1f, 3, 2, 1, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.1f, 1, 2, 5, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.1f, 3, 2, 5, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0);
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 2, 0, 3, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 2, 4, 3, 4, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        return true;
    }
}

