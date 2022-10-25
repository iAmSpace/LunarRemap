package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;

import java.util.List;
import java.util.Random;

public class class_0182
extends class_2257 {
    public static boolean llllllIlIllllIlIlIlIIIIlI;

    protected class_0182(class_1855 class_18552) {
        super(class_18552);
        this.lllIIIllIIIIlllIlIIllIIll(1.0f);
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_1525();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        float f = 0.0625f;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 != 0 ? false : super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        if (class_15212.IlIIIlIIIIllIIIllIIIIIIll == null && class_15212.lIlIlIIlIIIIlIIIIIlllIIII == null && !class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_15212.IIIllIllIIlIlIlIlIllllIIl(1);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        double d = (float)n + random.nextFloat();
        double d2 = (float)n2 + 0.8f;
        double d3 = (float)n3 + random.nextFloat();
        double d4 = 0.0;
        double d5 = 0.0;
        double d6 = 0.0;
        class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d, d2, d3, d4, d5, d6);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return -1;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        if (!llllllIlIllllIlIlIlIIIIlI && class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl != 0) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.lllIIIllIIIIlllIlIIllIIll(0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("portal");
    }

    @Override
    public class_1662 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return class_1662.llIIIIllIIIIIIIlIIIlIIIIl;
    }
}

