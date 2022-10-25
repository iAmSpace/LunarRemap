package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_1090
extends class_0094 {
    private boolean lllIIIllIIIIlllIlIIllIIll;

    public class_1090() {
    }

    public class_1090(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Mob", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("Mob");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        if (class_10362 != null) {
            ((class_1844)class_10362).lllIlIIlIIIlIlIIIllIlllIl = this;
        }
    }

    public static class_1090 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -4, -1, 0, 11, 8, 16, n4);
        return class_1090.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_1090(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 10, 7, 15, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, class_0462.IlIllllllIIlIIllllIIlIIIl, 4, 1, 0);
        int n3 = 6;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, n3, 1, 1, n3, 14, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, n3, 1, 9, n3, 14, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, n3, 1, 8, n3, 2, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, n3, 14, 8, n3, 14, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 1, 2, 1, 4, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 8, 1, 1, 9, 1, 4, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 1, 1, 1, 3, Blocks.lIIIIlIlIIlllllIIllIIlIII, Blocks.lIIIIlIlIIlllllIIllIIlIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 1, 1, 9, 1, 3, Blocks.lIIIIlIlIIlllllIIllIIlIII, Blocks.lIIIIlIlIIlllllIIllIIlIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 8, 7, 1, 12, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 9, 6, 1, 11, Blocks.lIIIIlIlIIlllllIIllIIlIII, Blocks.lIIIIlIlIIlllllIIllIIlIII, false);
        for (n2 = 3; n2 < 14; n2 += 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 3, n2, 0, 4, n2, Blocks.IIIIIlllIIllllIlllIlllIIl, Blocks.IIIIIlllIIllllIlllIlllIIl, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 10, 3, n2, 10, 4, n2, Blocks.IIIIIlllIIllllIlllIlllIIl, Blocks.IIIIIlllIIllllIlllIlllIIl, false);
        }
        for (n2 = 2; n2 < 9; n2 += 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n2, 3, 15, n2, 4, 15, Blocks.IIIIIlllIIllllIlllIlllIIl, Blocks.IIIIIlllIIllllIlllIlllIIl, false);
        }
        n2 = this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIIIIlIllIllIlIlIIllllll, 3);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 5, 6, 1, 7, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 2, 6, 6, 2, 7, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 3, 7, 6, 3, 7, false, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        for (n = 4; n <= 6; ++n) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIIIlIllIllIlIlIIllllll, n2, n, 1, 4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIIIlIllIllIlIlIIllllll, n2, n, 2, 5, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIIIlIllIllIlIlIIllllll, n2, n, 3, 6, class_20462);
        }
        n = 2;
        int n4 = 0;
        int n5 = 3;
        int n6 = 1;
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                n = 0;
                n4 = 2;
                break;
            }
            case 1: {
                n = 1;
                n4 = 3;
                n5 = 0;
                n6 = 2;
            }
            default: {
                break;
            }
            case 3: {
                n = 3;
                n4 = 1;
                n5 = 0;
                n6 = 2;
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n + (random.nextFloat() > 0.9f ? 4 : 0), 4, 3, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n + (random.nextFloat() > 0.9f ? 4 : 0), 5, 3, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n + (random.nextFloat() > 0.9f ? 4 : 0), 6, 3, 8, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n4 + (random.nextFloat() > 0.9f ? 4 : 0), 4, 3, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n4 + (random.nextFloat() > 0.9f ? 4 : 0), 5, 3, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n4 + (random.nextFloat() > 0.9f ? 4 : 0), 6, 3, 12, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 11, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 9, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 10, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIlllllIIIIIllIllIIIIllI, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 11, class_20462);
        if (!this.lllIIIllIIIIlllIlIIllIIll) {
            int n7;
            int n8 = this.lllIIIllIIIIlllIlIIllIIll(3);
            int n9 = this.lllIIIllIIIIlllIlIIllIIll(5, 6);
            if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n9, n8, n7 = this.lllIlIIlIIIlIlIIIllIlllIl(5, 6))) {
                this.lllIIIllIIIIlllIlIIllIIll = true;
                class_13342.lllIIIllIIIIlllIlIIllIIll(n9, n8, n7, Blocks.IIlIllIIlllllIIlIIllllIIl, 0, 2);
                class_0933 class_09332 = (class_0933)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n9, n8, n7);
                if (class_09332 != null) {
                    class_09332.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll("Silverfish");
                }
            }
        }
        return true;
    }
}

