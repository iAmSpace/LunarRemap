package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;

import java.util.List;
import java.util.Random;

abstract class class_0608
extends class_1036 {
    protected static final class_0425[] lllIIIllIIIIlllIlIIllIIll = new class_0425[]{new class_0425(Items.diamond, 0, 1, 3, 5), new class_0425(Items.iron_ingot, 0, 1, 5, 5), new class_0425(Items.lIIIIlIlIIlllllIIllIIlIII, 0, 1, 3, 15), new class_0425(Items.llIIlIlIlllIIllIlIlllIllI, 0, 1, 1, 5), new class_0425(Items.IlllIIlllllllIIllIlIllllI, 0, 1, 1, 5), new class_0425(Items.flint_and_steel, 0, 1, 1, 5), new class_0425(Items.IlllIIIlIIlIIIIllllIllllI, 0, 3, 7, 5), new class_0425(Items.saddle, 0, 1, 1, 10), new class_0425(Items.lIlIlIIllIlIIIIIlIIlllIlI, 0, 1, 1, 8), new class_0425(Items.IlIllIIIIllllIIllIllIIIIl, 0, 1, 1, 5), new class_0425(Items.llllIllllllIllIIIlIlIIllI, 0, 1, 1, 3)};

    public class_0608() {
    }

    protected class_0608(int n) {
        super(n);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    private int lllIIIllIIIIlllIlIIllIIll(List list) {
        boolean bl = false;
        int n = 0;
        for (class_1618 class_16182 : list) {
            if (class_16182.lIlllIlllIIIIlIIlllIllIII > 0 && class_16182.IlIllllllIIlIIllllIIlIIIl < class_16182.lIlllIlllIIIIlIIlllIllIII) {
                bl = true;
            }
            n += class_16182.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return bl ? n : -1;
    }

    private class_0608 lllIIIllIIIIlllIlIIllIIll(class_1486 class_14862, List list, List list2, Random random, int n, int n2, int n3, int n4, int n5) {
        int n6 = this.lllIIIllIIIIlllIlIIllIIll(list);
        boolean bl = n6 > 0 && n5 <= 30;
        int n7 = 0;
        block0: while (n7 < 5 && bl) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (class_1618 class_16182 : list) {
                if ((n8 -= class_16182.lllIlIIlIIIlIlIIIllIlllIl) >= 0) continue;
                if (!class_16182.lllIIIllIIIIlllIlIIllIIll(n5) || class_16182 == class_14862.lllIlIIlIIIlIlIIIllIlllIl && !class_16182.IlIIIIIllllllIIlllIllllll) continue block0;
                class_0608 class_06082 = class_0415.lllIIIllIIIIlllIlIIllIIll(class_16182, list2, random, n, n2, n3, n4, n5);
                if (class_06082 == null) continue;
                ++class_16182.IlIllllllIIlIIllllIIlIIIl;
                class_14862.lllIlIIlIIIlIlIIIllIlllIl = class_16182;
                if (!class_16182.lllIIIllIIIIlllIlIIllIIll()) {
                    list.remove(class_16182);
                }
                return class_06082;
            }
        }
        return class_0622.lllIIIllIIIIlllIlIIllIIll(list2, random, n, n2, n3, n4, n5);
    }

    private class_1036 lllIIIllIIIIlllIlIIllIIll(class_1486 class_14862, List list, Random random, int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (Math.abs(n - class_14862.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll) <= 112 && Math.abs(n3 - class_14862.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl) <= 112) {
            class_0608 class_06082;
            List list2 = class_14862.IlIllllllIIlIIllllIIlIIIl;
            if (bl) {
                list2 = class_14862.lIlllIlllIIIIlIIlllIllIII;
            }
            if ((class_06082 = this.lllIIIllIIIIlllIlIIllIIll(class_14862, list2, list, random, n, n2, n3, n4, n5 + 1)) != null) {
                list.add(class_06082);
                class_14862.IllIIlllllllIIlIIlIIIIlIl.add(class_06082);
            }
            return class_06082;
        }
        return class_0622.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
    }

    protected class_1036 lllIIIllIIIIlllIlIIllIIll(class_1486 class_14862, List list, Random random, int n, int n2, boolean bl) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 1: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 2: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 3: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
        }
        return null;
    }

    protected class_1036 lllIlIIlIIIlIlIIIllIlllIl(class_1486 class_14862, List list, Random random, int n, int n2, boolean bl) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 1, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 1: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 2: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 1, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 3: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
        }
        return null;
    }

    protected class_1036 IlIllllllIIlIIllllIIlIIIl(class_1486 class_14862, List list, Random random, int n, int n2, boolean bl) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 3, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 1: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 2: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 3, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
            case 3: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_14862, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl(), bl);
            }
        }
        return null;
    }

    protected static boolean lllIIIllIIIIlllIlIIllIIll(class_2046 class_20462) {
        return class_20462 != null && class_20462.lllIlIIlIIIlIlIIIllIlllIl > 10;
    }
}

