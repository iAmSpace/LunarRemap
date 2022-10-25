package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1973
extends class_0492 {
    private class_0729[] lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_1973(Random random, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.lllIIIllIIIIlllIlIIllIIll = new class_0729[n];
        for (int i = 0; i < n; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i] = new class_0729(random);
        }
    }

    public double[] lllIIIllIIIIlllIlIIllIIll(double[] arrd, int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3) {
        if (arrd == null) {
            arrd = new double[n4 * n5 * n6];
        } else {
            for (int i = 0; i < arrd.length; ++i) {
                arrd[i] = 0.0;
            }
        }
        double d4 = 1.0;
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl; ++i) {
            double d5 = (double)n * d4 * d;
            double d6 = (double)n2 * d4 * d2;
            double d7 = (double)n3 * d4 * d3;
            long l = MathHelper.lIlllIlllIIIIlIIlllIllIII(d5);
            long l2 = MathHelper.lIlllIlllIIIIlIIlllIllIII(d7);
            d5 -= (double)l;
            d7 -= (double)l2;
            this.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll(arrd, d5 += (double)(l %= 0x1000000L), d6, d7 += (double)(l2 %= 0x1000000L), n4, n5, n6, d * d4, d2 * d4, d3 * d4, d4);
            d4 /= 2.0;
        }
        return arrd;
    }

    public double[] lllIIIllIIIIlllIlIIllIIll(double[] arrd, int n, int n2, int n3, int n4, double d, double d2, double d3) {
        return this.lllIIIllIIIIlllIlIIllIIll(arrd, n, 10, n2, n3, 1, n4, d, 1.0, d2);
    }
}

