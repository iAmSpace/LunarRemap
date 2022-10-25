package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class class_1940
extends class_0492 {
    private class_0101[] lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_1940(Random random, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.lllIIIllIIIIlllIlIIllIIll = new class_0101[n];
        for (int i = 0; i < n; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i] = new class_0101(random);
        }
    }

    public double lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        double d3 = 0.0;
        double d4 = 1.0;
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl; ++i) {
            d3 += this.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll(d * d4, d2 * d4) / d4;
            d4 /= 2.0;
        }
        return d3;
    }

    public double[] lllIIIllIIIIlllIlIIllIIll(double[] arrd, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        return this.lllIIIllIIIIlllIlIIllIIll(arrd, d, d2, n, n2, d3, d4, d5, 0.5);
    }

    public double[] lllIIIllIIIIlllIlIIllIIll(double[] arrd, double d, double d2, int n, int n2, double d3, double d4, double d5, double d6) {
        if (arrd != null && arrd.length >= n * n2) {
            for (int i = 0; i < arrd.length; ++i) {
                arrd[i] = 0.0;
            }
        } else {
            arrd = new double[n * n2];
        }
        double d7 = 1.0;
        double d8 = 1.0;
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll(arrd, d, d2, n, n2, d3 * d8 * d7, d4 * d8 * d7, 0.55 / d7);
            d8 *= d5;
            d7 *= d6;
        }
        return arrd;
    }
}

