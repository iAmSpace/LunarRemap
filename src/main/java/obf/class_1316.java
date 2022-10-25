package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1316
extends class_0689 {
    private class_0672[] IlIllllllIIlIIllllIIlIIIl = new class_0672[]{class_0672.lllllIlllIIllIlIIlIIIllII, class_0672.lllllIlllIIllIlIIlIIIllII, class_0672.lllllIlllIIllIlIIlIIIllII, class_0672.IllIIIlllllIlIlllIlllllII, class_0672.IllIIIlllllIlIlllIlllllII, class_0672.IlIlIIlIlIllIIlIlIIllIIIl};
    private class_0672[] lIlllIlllIIIIlIIlllIllIII = new class_0672[]{class_0672.lIIlIIIIIlIlllIlIIlIlIlll, class_0672.lIlIlIIIIIIlIIllllIlIIllI, class_0672.IlIlIIlllIIlIllIIIlllllIl, class_0672.IlIlIIlIlIllIIlIlIIllIIIl, class_0672.lllIIIIIIlIlllIIlIlIIIllI, class_0672.IlIIIlIIIIllIIIllIIIIIIll};
    private class_0672[] IlIIIIIllllllIIlllIllllll = new class_0672[]{class_0672.lIIlIIIIIlIlllIlIIlIlIlll, class_0672.IlIlIIlllIIlIllIIIlllllIl, class_0672.lIlIlIIlIIIIlIIIIIlllIIII, class_0672.IlIlIIlIlIllIIlIlIIllIIIl};
    private class_0672[] lIllllIIlIIIlIllllllIIIll = new class_0672[]{class_0672.IlIIlllllIIlIlIlllllIllll, class_0672.IlIIlllllIIlIlIlllllIllll, class_0672.IlIIlllllIIlIlIlllllIllll, class_0672.IllllIIIIlIIlIIIIlllIIIIl};

    public class_1316(long l, class_0689 class_06892, class_1074 class_10742) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
        if (class_10742 == class_1074.lIllllIIlIIIlIllllllIIIll) {
            this.IlIllllllIIlIIllllIIlIIIl = new class_0672[]{class_0672.lllllIlllIIllIlIIlIIIllII, class_0672.lIIlIIIIIlIlllIlIIlIlIlll, class_0672.IlIlIIlllIIlIllIIIlllllIl, class_0672.IlIIIlIIIIllIIIllIIIIIIll, class_0672.IlIlIIlIlIllIIlIlIIllIIIl, class_0672.lIlIlIIlIIIIlIIIIIlllIIII};
        }
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                int n5 = arrn[j + i * n3];
                int n6 = (n5 & 0xF00) >> 8;
                if (class_1316.lllIlIIlIIIlIlIIIllIlllIl(n5 &= 0xFFFFF0FF)) {
                    arrn2[j + i * n3] = n5;
                    continue;
                }
                if (n5 == class_0672.IllIIIIllIIllIllIlllIlIIl.lIlIllIIllIIIIlllIlIlllIl) {
                    arrn2[j + i * n3] = n5;
                    continue;
                }
                if (n5 == 1) {
                    if (n6 > 0) {
                        if (this.lllIIIllIIIIlllIlIIllIIll(3) == 0) {
                            arrn2[j + i * n3] = class_0672.lIIlIlllIllIlIlllIIIIIIII.lIlIllIIllIIIIlllIlIlllIl;
                            continue;
                        }
                        arrn2[j + i * n3] = class_0672.lIIIlIIIlIlllIllIIIlIIIlI.lIlIllIIllIIIIlllIlIlllIl;
                        continue;
                    }
                    arrn2[j + i * n3] = this.IlIllllllIIlIIllllIIlIIIl[this.lllIIIllIIIIlllIlIIllIIll((int)this.IlIllllllIIlIIllllIIlIIIl.length)].lIlIllIIllIIIIlllIlIlllIl;
                    continue;
                }
                if (n5 == 2) {
                    if (n6 > 0) {
                        arrn2[j + i * n3] = class_0672.llIIIIllIIIIIIIlIIIlIIIIl.lIlIllIIllIIIIlllIlIlllIl;
                        continue;
                    }
                    arrn2[j + i * n3] = this.lIlllIlllIIIIlIIlllIllIII[this.lllIIIllIIIIlllIlIIllIIll((int)this.lIlllIlllIIIIlIIlllIllIII.length)].lIlIllIIllIIIIlllIlIlllIl;
                    continue;
                }
                if (n5 == 3) {
                    if (n6 > 0) {
                        arrn2[j + i * n3] = class_0672.IIIIlIlIIlIIIIlIlllIlIIII.lIlIllIIllIIIIlllIlIlllIl;
                        continue;
                    }
                    arrn2[j + i * n3] = this.IlIIIIIllllllIIlllIllllll[this.lllIIIllIIIIlllIlIIllIIll((int)this.IlIIIIIllllllIIlllIllllll.length)].lIlIllIIllIIIIlllIlIlllIl;
                    continue;
                }
                arrn2[j + i * n3] = n5 == 4 ? this.lIllllIIlIIIlIllllllIIIll[this.lllIIIllIIIIlllIlIIllIIll((int)this.lIllllIIlIIIlIllllllIIIll.length)].lIlIllIIllIIIIlllIlIlllIl : class_0672.IllIIIIllIIllIllIlllIlIIl.lIlIllIIllIIIIlllIlIlllIl;
            }
        }
        return arrn2;
    }
}

