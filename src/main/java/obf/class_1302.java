package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1302
extends class_0689 {
    private final class_0436 IlIllllllIIlIIllllIIlIIIl;

    public class_1302(long l, class_0689 class_06892, class_0436 class_04362) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
        this.IlIllllllIIlIIllllIIlIIIl = class_04362;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        switch (class_1258.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl.ordinal()]) {
            default: {
                return this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n4);
            }
            case 2: {
                return this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3, n4);
            }
            case 3: 
        }
        return this.IlIIIIIllllllIIlllIllllll(n, n2, n3, n4);
    }

    private int[] IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        int n5 = n - 1;
        int n6 = n2 - 1;
        int n7 = 1 + n3 + 1;
        int n8 = 1 + n4 + 1;
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n5, n6, n7, n8);
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                int n9 = arrn[j + 1 + (i + 1) * n7];
                if (n9 == 1) {
                    boolean bl;
                    int n10 = arrn[j + 1 + (i + 1 - 1) * n7];
                    int n11 = arrn[j + 1 + 1 + (i + 1) * n7];
                    int n12 = arrn[j + 1 - 1 + (i + 1) * n7];
                    int n13 = arrn[j + 1 + (i + 1 + 1) * n7];
                    boolean bl2 = n10 == 3 || n11 == 3 || n12 == 3 || n13 == 3;
                    boolean bl3 = bl = n10 == 4 || n11 == 4 || n12 == 4 || n13 == 4;
                    if (bl2 || bl) {
                        n9 = 2;
                    }
                }
                arrn2[j + i * n3] = n9;
            }
        }
        return arrn2;
    }

    private int[] lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3, int n4) {
        int n5 = n - 1;
        int n6 = n2 - 1;
        int n7 = 1 + n3 + 1;
        int n8 = 1 + n4 + 1;
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n5, n6, n7, n8);
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n9 = arrn[j + 1 + (i + 1) * n7];
                if (n9 == 4) {
                    boolean bl;
                    int n10 = arrn[j + 1 + (i + 1 - 1) * n7];
                    int n11 = arrn[j + 1 + 1 + (i + 1) * n7];
                    int n12 = arrn[j + 1 - 1 + (i + 1) * n7];
                    int n13 = arrn[j + 1 + (i + 1 + 1) * n7];
                    boolean bl2 = n10 == 2 || n11 == 2 || n12 == 2 || n13 == 2;
                    boolean bl3 = bl = n10 == 1 || n11 == 1 || n12 == 1 || n13 == 1;
                    if (bl || bl2) {
                        n9 = 3;
                    }
                }
                arrn2[j + i * n3] = n9;
            }
        }
        return arrn2;
    }

    private int[] IlIIIIIllllllIIlllIllllll(int n, int n2, int n3, int n4) {
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                int n5 = arrn[j + i * n3];
                if (n5 != 0 && this.lllIIIllIIIIlllIlIIllIIll(13) == 0) {
                    n5 |= 1 + this.lllIIIllIIIIlllIlIIllIIll(15) << 8 & 0xF00;
                }
                arrn2[j + i * n3] = n5;
            }
        }
        return arrn2;
    }
}

