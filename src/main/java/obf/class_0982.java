package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0982
extends class_0689 {
    public class_0982(long l, class_0689 class_06892) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n5;
                int n6;
                int n7;
                int n8;
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                int n9 = arrn[j + 1 + (i + 1) * (n3 + 2)];
                if (this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, j, i, n3, n9, class_0672.IlIlIIlllIIlIllIIIlllllIl.lIlIllIIllIIIIlllIlIlllIl, class_0672.llllIIIIlIIIlIIIIIIlIllll.lIlIllIIllIIIIlllIlIlllIl) || this.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, j, i, n3, n9, class_0672.lIIIlIIIlIlllIllIIIlIIIlI.lIlIllIIllIIIIlllIlIlllIl, class_0672.lIIIllIIIIIllllIlIlIllIll.lIlIllIIllIIIIlllIlIlllIl) || this.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, j, i, n3, n9, class_0672.lIIlIlllIllIlIlllIIIIIIII.lIlIllIIllIIIIlllIlIlllIl, class_0672.lIIIllIIIIIllllIlIlIllIll.lIlIllIIllIIIIlllIlIlllIl) || this.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, j, i, n3, n9, class_0672.IIIIlIlIIlIIIIlIlllIlIIII.lIlIllIIllIIIIlllIlIlllIl, class_0672.lIlIlIIlIIIIlIIIIIlllIIII.lIlIllIIllIIIIlllIlIlllIl)) continue;
                if (n9 == class_0672.lllllIlllIIllIlIIlIIIllII.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 != class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl && n7 != class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl && n6 != class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl && n5 != class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl) {
                        arrn2[j + i * n3] = n9;
                        continue;
                    }
                    arrn2[j + i * n3] = class_0672.llIlIIlllIIIIIllIIlIlIIII.lIlIllIIllIIIIlllIlIlllIl;
                    continue;
                }
                if (n9 == class_0672.IlIIIlIIIIllIIIllIIIIIIll.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 != class_0672.lllllIlllIIllIlIIlIIIllII.lIlIllIIllIIIIlllIlIlllIl && n7 != class_0672.lllllIlllIIllIlIIlIIIllII.lIlIllIIllIIIIlllIlIlllIl && n6 != class_0672.lllllIlllIIllIlIIlIIIllII.lIlIllIIllIIIIlllIlIlllIl && n5 != class_0672.lllllIlllIIllIlIIlIIIllII.lIlIllIIllIIIIlllIlIlllIl && n8 != class_0672.IllllIIIIlIIlIIIIlllIIIIl.lIlIllIIllIIIIlllIlIlllIl && n7 != class_0672.IllllIIIIlIIlIIIIlllIIIIl.lIlIllIIllIIIIlllIlIlllIl && n6 != class_0672.IllllIIIIlIIlIIIIlllIIIIl.lIlIllIIllIIIIlllIlIlllIl && n5 != class_0672.IllllIIIIlIIlIIIIlllIIIIl.lIlIllIIllIIIIlllIlIlllIl && n8 != class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl && n7 != class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl && n6 != class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl && n5 != class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl) {
                        if (n8 != class_0672.llIIIIllIIIIIIIlIIIlIIIIl.lIlIllIIllIIIIlllIlIlllIl && n5 != class_0672.llIIIIllIIIIIIIlIIIlIIIIl.lIlIllIIllIIIIlllIlIlllIl && n7 != class_0672.llIIIIllIIIIIIIlIIIlIIIIl.lIlIllIIllIIIIlllIlIlllIl && n6 != class_0672.llIIIIllIIIIIIIlIIIlIIIIl.lIlIllIIllIIIIlllIlIlllIl) {
                            arrn2[j + i * n3] = n9;
                            continue;
                        }
                        arrn2[j + i * n3] = class_0672.llllllIlIllllIlIlIlIIIIlI.lIlIllIIllIIIIlllIlIlllIl;
                        continue;
                    }
                    arrn2[j + i * n3] = class_0672.IlIlIIlIlIllIIlIlIIllIIIl.lIlIllIIllIIIIlllIlIlllIl;
                    continue;
                }
                arrn2[j + i * n3] = n9;
            }
        }
        return arrn2;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (!class_0982.lllIIIllIIIIlllIlIIllIIll(n4, n5)) {
            return false;
        }
        int n7 = arrn[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
        int n8 = arrn[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
        int n9 = arrn[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
        int n10 = arrn[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
        arrn2[n + n2 * n3] = this.lllIlIIlIIIlIlIIIllIlllIl(n7, n5) && this.lllIlIIlIIIlIlIIIllIlllIl(n8, n5) && this.lllIlIIlIIIlIlIIIllIlllIl(n9, n5) && this.lllIlIIlIIIlIlIIIllIlllIl(n10, n5) ? n4 : n6;
        return true;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n4 != n5) {
            return false;
        }
        int n7 = arrn[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
        int n8 = arrn[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
        int n9 = arrn[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
        int n10 = arrn[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
        arrn2[n + n2 * n3] = class_0982.lllIIIllIIIIlllIlIIllIIll(n7, n5) && class_0982.lllIIIllIIIIlllIlIIllIIll(n8, n5) && class_0982.lllIIIllIIIIlllIlIIllIIll(n9, n5) && class_0982.lllIIIllIIIIlllIlIIllIIll(n10, n5) ? n4 : n6;
        return true;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (class_0982.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            return true;
        }
        if (class_0672.lIlllIlllIIIIlIIlllIllIII(n) != null && class_0672.lIlllIlllIIIIlIIlllIllIII(n2) != null) {
            class_1052 class_10522;
            class_1052 class_10523 = class_0672.lIlllIlllIIIIlIIlllIllIII(n).llIIllIllIlIIlIIllIllllll();
            return class_10523 == (class_10522 = class_0672.lIlllIlllIIIIlIIlllIllIII(n2).llIIllIllIlIIlIIllIllllll()) || class_10523 == class_1052.IlIllllllIIlIIllllIIlIIIl || class_10522 == class_1052.IlIllllllIIlIIllllIIlIIIl;
        }
        return false;
    }
}

