package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0614 {
    private static int[] lllIIIllIIIIlllIlIIllIIll = new int[65536];

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        lllIIIllIIIIlllIlIIllIIll = arrn;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        int n = (int)((1.0 - d) * 255.0);
        int n2 = (int)((1.0 - (d2 *= d)) * 255.0);
        return lllIIIllIIIIlllIlIIllIIll[n2 << 8 | n];
    }
}

