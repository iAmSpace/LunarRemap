package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1485
extends class_0689 {
    public class_1485(long l) {
        super(l);
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int[] arrn = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll((long)(n + j), (long)(n2 + i));
                arrn[j + i * n3] = this.lllIIIllIIIIlllIlIIllIIll(10) == 0 ? 1 : 0;
            }
        }
        if (n > -n3 && n <= 0 && n2 > -n4 && n2 <= 0) {
            arrn[-n + -n2 * n3] = 1;
        }
        return arrn;
    }
}

