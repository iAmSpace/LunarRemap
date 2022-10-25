package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import java.util.List;
import java.util.Random;

public class class_1455
extends class_0094 {
    private static final class_0425[] lllIlIIlIIIlIlIIIllIlllIl = new class_0425[]{new class_0425(Items.iron_ingot, 0, 1, 5, 10), new class_0425(Items.lIIIIlIlIIlllllIIllIIlIII, 0, 1, 3, 5), new class_0425(Items.lIIIlIIllIllIIlIIlIIIllII, 0, 4, 9, 5), new class_0425(Items.IllIIlllllllIIlIIlIIIIlIl, 0, 3, 8, 10), new class_0425(Items.bread, 0, 1, 3, 15), new class_0425(Items.IlIIIIIllllllIIlllIllllll, 0, 1, 3, 15), new class_0425(Items.lllIlIIlIIIlIlIIIllIlllIl, 0, 1, 1, 1)};
    protected int lllIIIllIIIIlllIlIIllIIll;

    public class_1455() {
    }

    public class_1455(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = random.nextInt(5);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Type", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("Type");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1844)class_10362, list, random, 4, 1);
        this.lllIlIIlIIIlIlIIIllIlllIl((class_1844)class_10362, list, random, 1, 4);
        this.IlIllllllIIlIIllllIIlIIIl((class_1844)class_10362, list, random, 1, 4);
    }

    public static class_1455 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -4, -1, 0, 11, 7, 11, n4);
        return class_1455.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_1455(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 10, 6, 10, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 4, 1, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 10, 6, 3, 10, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 4, 0, 3, 6, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 10, 1, 4, 10, 3, 6, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        switch (this.lllIIIllIIIIlllIlIIllIIll) {
            case 0: {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 5, 1, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 5, 2, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 5, 3, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 4, 3, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 6, 3, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 5, 3, 4, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 5, 3, 6, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 4, 1, 4, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 4, 1, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 4, 1, 6, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 6, 1, 4, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 6, 1, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 6, 1, 6, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 5, 1, 4, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 5, 1, 6, class_20462);
                break;
            }
            case 1: {
                for (int i = 0; i < 5; ++i) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3, 1, 3 + i, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 7, 1, 3 + i, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3 + i, 1, 3, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3 + i, 1, 7, class_20462);
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 5, 1, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 5, 2, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 5, 3, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIllIllIIlIlIlIlIllllIIl, 0, 5, 4, 5, class_20462);
                break;
            }
            case 2: {
                int n;
                for (n = 1; n <= 9; ++n) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 1, 3, n, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 9, 3, n, class_20462);
                }
                for (n = 1; n <= 9; ++n) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, n, 3, 1, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, n, 3, 9, class_20462);
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 5, 1, 4, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 5, 1, 6, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 5, 3, 4, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 5, 3, 6, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, 1, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 6, 1, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, 3, 5, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 6, 3, 5, class_20462);
                for (n = 1; n <= 3; ++n) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, n, 4, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 6, n, 4, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 4, n, 6, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 6, n, 6, class_20462);
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 5, 3, 5, class_20462);
                for (n = 2; n <= 8; ++n) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 2, 3, n, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 3, 3, n, class_20462);
                    if (n <= 3 || n >= 7) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 4, 3, n, class_20462);
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 5, 3, n, class_20462);
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 6, 3, n, class_20462);
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 7, 3, n, class_20462);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 8, 3, n, class_20462);
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIIllIllIIIIIlIllllIIIl, 4), 9, 1, 3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIIllIllIIIIIlIllllIIIl, 4), 9, 2, 3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIIllIllIIIIIlIllllIIIl, 4), 9, 3, 3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 3, 4, 8, class_0425.lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl, Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random)), 1 + random.nextInt(4));
            }
        }
        return true;
    }
}

