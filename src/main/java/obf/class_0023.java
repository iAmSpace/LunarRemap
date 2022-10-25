package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0023
extends class_0689 {
    public class_0023(long l, class_0689 class_06892) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                int n5 = arrn[j + 1 + (i + 1) * (n3 + 2)];
                if (this.lllIIIllIIIIlllIlIIllIIll(57) == 0) {
                    if (n5 == class_0672.IlIlIIlIlIllIIlIlIIllIIIl.lIlIllIIllIIIIlllIlIlllIl) {
                        arrn2[j + i * n3] = class_0672.IlIlIIlIlIllIIlIlIIllIIIl.lIlIllIIllIIIIlllIlIlllIl + 128;
                        continue;
                    }
                    arrn2[j + i * n3] = n5;
                    continue;
                }
                arrn2[j + i * n3] = n5;
            }
        }
        return arrn2;
    }
}

