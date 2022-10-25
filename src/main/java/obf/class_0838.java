package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0838
extends class_0094 {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;
    private boolean IllIIlllllllIIlIIlIIIIlIl;

    public class_0838() {
    }

    public class_0838(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = random.nextBoolean();
        this.lllIlIIlIIIlIlIIIllIlllIl = random.nextBoolean();
        this.IlIllllllIIlIIllllIIlIIIl = random.nextBoolean();
        this.IllIIlllllllIIlIIlIIIIlIl = random.nextInt(3) > 0;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("leftLow", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("leftHigh", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("rightLow", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("rightHigh", this.IllIIlllllllIIlIIlIIIIlIl);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("leftLow");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("leftHigh");
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("rightLow");
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("rightHigh");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        int n = 3;
        int n2 = 5;
        if (this.lIllllIIlIIIlIllllllIIIll == 1 || this.lIllllIIlIIIlIllllllIIIll == 2) {
            n = 8 - n;
            n2 = 8 - n2;
        }
        this.lllIIIllIIIIlllIlIIllIIll((class_1844)class_10362, list, random, 5, 1);
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1844)class_10362, list, random, n, 1);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1844)class_10362, list, random, n2, 7);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            this.IlIllllllIIlIIllllIIlIIIl((class_1844)class_10362, list, random, n, 1);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            this.IlIllllllIIlIIllllIIlIIIl((class_1844)class_10362, list, random, n2, 7);
        }
    }

    public static class_0838 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -4, -3, 0, 10, 9, 11, n4);
        return class_0838.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0838(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 9, 8, 10, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 4, 3, 0);
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 3, 1, 0, 5, 3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 3, 1, 9, 5, 3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 7, 0, 7, 9, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 5, 7, 9, 7, 9, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 1, 10, 7, 3, 10, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 2, 1, 8, 2, 6, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 5, 4, 4, 9, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 1, 5, 8, 4, 9, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 4, 7, 3, 4, 9, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 3, 5, 3, 3, 6, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 3, 4, 3, 3, 4, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 4, 6, 3, 4, 6, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 1, 7, 7, 1, 8, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 1, 9, 7, 1, 9, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 2, 7, 7, 2, 7, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 5, 7, 4, 5, 9, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 5, 7, 8, 5, 9, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 5, 7, 7, 5, 9, Blocks.llllIlIIIIIIIIIlllIIlIIIl, Blocks.llllIlIIIIIIIIIlllIIlIIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 6, 5, 6, class_20462);
        return true;
    }
}

