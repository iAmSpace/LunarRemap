package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0877
extends class_1036 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;

    public class_0877() {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("tf", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("D", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("tf");
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("D");
    }

    public class_0877(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lllIIIllIIIIlllIlIIllIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20462.IlIllllllIIlIIllllIIlIIIl() > 3;
    }

    public static class_2046 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4) {
        class_2046 class_20462 = new class_2046(n, n2, n3, n, n2 + 2, n3);
        if (random.nextInt(4) == 0) {
            class_20462.IlIIIIIllllllIIlllIllllll += 4;
        }
        switch (n4) {
            case 0: {
                class_20462.lllIIIllIIIIlllIlIIllIIll = n - 1;
                class_20462.lIlllIlllIIIIlIIlllIllIII = n + 3;
                class_20462.lIllllIIlIIIlIllllllIIIll = n3 + 4;
                break;
            }
            case 1: {
                class_20462.lllIIIllIIIIlllIlIIllIIll = n - 4;
                class_20462.IlIllllllIIlIIllllIIlIIIl = n3 - 1;
                class_20462.lIllllIIlIIIlIllllllIIIll = n3 + 3;
                break;
            }
            case 2: {
                class_20462.lllIIIllIIIIlllIlIIllIIll = n - 1;
                class_20462.lIlllIlllIIIIlIIlllIllIII = n + 3;
                class_20462.IlIllllllIIlIIllllIIlIIIl = n3 - 4;
                break;
            }
            case 3: {
                class_20462.lIlllIlllIIIIlIIlllIllIII = n + 4;
                class_20462.IlIllllllIIlIIllllIIlIIIl = n3 - 1;
                class_20462.lIllllIIlIIIlIllllllIIIll = n3 + 3;
            }
        }
        return class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) != null ? null : class_20462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        int n = this.IlIllllllIIlIIllllIIlIIIl();
        switch (this.lllIIIllIIIIlllIlIIllIIll) {
            case 0: {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n);
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 1, n);
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 3, n);
                break;
            }
            case 1: {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n);
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n);
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 1, n);
                break;
            }
            case 2: {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n);
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 1, n);
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 3, n);
                break;
            }
            case 3: {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n);
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n);
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 3, n);
            }
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (random.nextBoolean()) {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3 + 1, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n);
            }
            if (random.nextBoolean()) {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3 + 1, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 1, n);
            }
            if (random.nextBoolean()) {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3 + 1, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 3, n);
            }
            if (random.nextBoolean()) {
                class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3 + 1, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n);
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3 - 1, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3 - 1, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll - 2, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll - 2, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        for (int i = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll; i <= this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII; ++i) {
            for (int j = this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl; j <= this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll; ++j) {
                if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, i, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1, j, class_20462).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, i, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1, j, class_20462);
            }
        }
        return true;
    }
}

