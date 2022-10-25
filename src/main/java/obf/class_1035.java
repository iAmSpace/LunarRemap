package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1035 {
    private static final int lllIIIllIIIIlllIlIIllIIll = 65535;
    private static final Integer[] lllIlIIlIIIlIlIIIllIlllIl = class_1035.lllIlIIlIIIlIlIIIllIlllIl(65535);

    private static Integer[] lllIlIIlIIIlIlIIIllIlllIl(int n) {
        Integer[] arrinteger = new Integer[n];
        for (int i = 0; i < n; ++i) {
            arrinteger[i] = new Integer(i);
        }
        return arrinteger;
    }

    public static Integer lllIIIllIIIIlllIlIIllIIll(int n) {
        return n >= 0 && n < 65535 ? lllIlIIlIIIlIlIIIllIlllIl[n] : new Integer(n);
    }
}

