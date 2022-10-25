package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1558
extends class_0689 {
    public class_1558(long l, class_0689 class_06892) {
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
                class_0672 class_06722 = class_0672.lIlllIlllIIIIlIIlllIllIII(n9);
                if (n9 == class_0672.IllIIIIllIIllIllIlllIlIIl.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 != class_0672.IlIlllIIIIIIlIIllIIllIlll.lIlIllIIllIIIIlllIlIlllIl && n7 != class_0672.IlIlllIIIIIIlIIllIIllIlll.lIlIllIIllIIIIlllIlIlllIl && n6 != class_0672.IlIlllIIIIIIlIIllIIllIlll.lIlIllIIllIIIIlllIlIlllIl && n5 != class_0672.IlIlllIIIIIIlIIllIIllIlll.lIlIllIIllIIIIlllIlIlllIl) {
                        arrn2[j + i * n3] = n9;
                        continue;
                    }
                    arrn2[j + i * n3] = class_0672.IIIIIIIIlIllIIllIIlllIllI.lIlIllIIllIIIIlllIlIlllIl;
                    continue;
                }
                if (class_06722 != null && class_06722.llIIlllIllIllllIIIlIIIIII() == class_1061.class) {
                    n8 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (this.IlIllllllIIlIIllllIIlIIIl(n8) && this.IlIllllllIIlIIllllIIlIIIl(n7) && this.IlIllllllIIlIIllllIIlIIIl(n6) && this.IlIllllllIIlIIllllIIlIIIl(n5)) {
                        if (!(class_1558.lllIlIIlIIIlIlIIIllIlllIl(n8) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n7) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n6) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n5))) {
                            arrn2[j + i * n3] = n9;
                            continue;
                        }
                        arrn2[j + i * n3] = class_0672.IIlIIlIlIlIllIIlIlIIIIlll.lIlIllIIllIIIIlllIlIlllIl;
                        continue;
                    }
                    arrn2[j + i * n3] = class_0672.llllllIlIllllIlIlIlIIIIlI.lIlIllIIllIIIIlllIlIlllIl;
                    continue;
                }
                if (n9 != class_0672.IlIlIIlllIIlIllIIIlllllIl.lIlIllIIllIIIIlllIlIlllIl && n9 != class_0672.llIlIIlllIIIIIllIIlIlIIII.lIlIllIIllIIIIlllIlIlllIl && n9 != class_0672.llllIIIIlIIIlIIIIIIlIllll.lIlIllIIllIIIIlllIlIlllIl) {
                    if (class_06722 != null && class_06722.IllIIIllIIIIlIlIlIllIIlll()) {
                        this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, j, i, n3, n9, class_0672.IIIIlIIlIIIllIIIIllIIIlII.lIlIllIIllIIIIlllIlIlllIl);
                        continue;
                    }
                    if (n9 != class_0672.lIIIllIIIIIllllIlIlIllIll.lIlIllIIllIIIIlllIlIlllIl && n9 != class_0672.lIIIlIIIlIlllIllIIIlIIIlI.lIlIllIIllIIIIlllIlIlllIl) {
                        if (n9 != class_0672.IlIlllIIIIIIlIIllIIllIlll.lIlIllIIllIIIIlllIlIlllIl && n9 != class_0672.lIlIIllllIlIIIIllIIIIlIIl.lIlIllIIllIIIIlllIlIlllIl && n9 != class_0672.IIlllIlIlllIllIIIlllIIlIl.lIlIllIIllIIIIlllIlIlllIl && n9 != class_0672.IlIIIlIIIIllIIIllIIIIIIll.lIlIllIIllIIIIlllIlIlllIl) {
                            n8 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                            n7 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                            n6 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                            n5 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                            if (!(class_1558.lllIlIIlIIIlIlIIIllIlllIl(n8) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n7) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n6) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n5))) {
                                arrn2[j + i * n3] = n9;
                                continue;
                            }
                            arrn2[j + i * n3] = class_0672.IIlIIlIlIlIllIIlIlIIIIlll.lIlIllIIllIIIIlllIlIlllIl;
                            continue;
                        }
                        arrn2[j + i * n3] = n9;
                        continue;
                    }
                    n8 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (!(class_1558.lllIlIIlIIIlIlIIIllIlllIl(n8) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n7) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n6) || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n5))) {
                        if (this.lIlllIlllIIIIlIIlllIllIII(n8) && this.lIlllIlllIIIIlIIlllIllIII(n7) && this.lIlllIlllIIIIlIIlllIllIII(n6) && this.lIlllIlllIIIIlIIlllIllIII(n5)) {
                            arrn2[j + i * n3] = n9;
                            continue;
                        }
                        arrn2[j + i * n3] = class_0672.lllllIlllIIllIlIIlIIIllII.lIlIllIIllIIIIlllIlIlllIl;
                        continue;
                    }
                    arrn2[j + i * n3] = n9;
                    continue;
                }
                this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, j, i, n3, n9, class_0672.llIlllIIllIlllIlIlIlIIIll.lIlIllIIllIIIIlllIlIlllIl);
            }
        }
        return arrn2;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5) {
        if (class_1558.lllIlIIlIIIlIlIIIllIlllIl(n4)) {
            arrn2[n + n2 * n3] = n4;
        } else {
            int n6 = arrn[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
            int n7 = arrn[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
            int n8 = arrn[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
            int n9 = arrn[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
            arrn2[n + n2 * n3] = !class_1558.lllIlIIlIIIlIlIIIllIlllIl(n6) && !class_1558.lllIlIIlIIIlIlIIIllIlllIl(n7) && !class_1558.lllIlIIlIIIlIlIIIllIlllIl(n8) && !class_1558.lllIlIIlIIIlIlIIIllIlllIl(n9) ? n4 : n5;
        }
    }

    private boolean IlIllllllIIlIIllllIIlIIIl(int n) {
        return class_0672.lIlllIlllIIIIlIIlllIllIII(n) != null && class_0672.lIlllIlllIIIIlIIlllIllIII(n).llIIlllIllIllllIIIlIIIIII() == class_1061.class ? true : n == class_0672.llllllIlIllllIlIlIlIIIIlI.lIlIllIIllIIIIlllIlIlllIl || n == class_0672.llIIIIllIIIIIIIlIIIlIIIIl.lIlIllIIllIIIIlllIlIlllIl || n == class_0672.IIllIllIIllIIlllIIIlIlllI.lIlIllIIllIIIIlllIlIlllIl || n == class_0672.lIIlIIIIIlIlllIlIIlIlIlll.lIlIllIIllIIIIlllIlIlllIl || n == class_0672.lIlIlIIlIIIIlIIIIIlllIIII.lIlIllIIllIIIIlllIlIlllIl || class_1558.lllIlIIlIIIlIlIIIllIlllIl(n);
    }

    private boolean lIlllIlllIIIIlIIlllIllIII(int n) {
        return class_0672.lIlllIlllIIIIlIIlllIllIII(n) != null && class_0672.lIlllIlllIIIIlIIlllIllIII(n) instanceof class_1754;
    }
}

