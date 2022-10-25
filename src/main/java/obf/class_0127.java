package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0127 {
    public static int lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        int n;
        if (arrn.length <= 0) {
            return 0;
        }
        int n2 = 0;
        for (n = 0; n < arrn.length; ++n) {
            int n3 = arrn[n];
            n2 += n3;
        }
        n = n2 / arrn.length;
        return n;
    }
}

