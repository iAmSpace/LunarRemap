package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0240
extends class_0689 {
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    private class_0689 lIlllIlllIIIIlIIlllIllIII;

    public class_0240(long l, class_0689 class_06892, class_0689 class_06893) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
        this.lIlllIlllIIIIlIIlllIllIII = class_06893;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] arrn2 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] arrn3 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n5;
                boolean bl;
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                int n6 = arrn[j + 1 + (i + 1) * (n3 + 2)];
                int n7 = arrn2[j + 1 + (i + 1) * (n3 + 2)];
                boolean bl2 = bl = (n7 - 2) % 29 == 0;
                if (n6 > 255) {
                    IlIllllllIIlIIllllIIlIIIl.debug("old! " + n6);
                }
                if (n6 != 0 && n7 >= 2 && (n7 - 2) % 29 == 1 && n6 < 128) {
                    if (class_0672.lIlllIlllIIIIlIIlllIllIII(n6 + 128) != null) {
                        arrn3[j + i * n3] = n6 + 128;
                        continue;
                    }
                    arrn3[j + i * n3] = n6;
                    continue;
                }
                if (this.lllIIIllIIIIlllIlIIllIIll(3) != 0 && !bl) {
                    arrn3[j + i * n3] = n6;
                    continue;
                }
                int n8 = n6;
                if (n6 == class_0672.lllllIlllIIllIlIIlIIIllII.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.llIIIlllIlllIlIllIIIIllIl.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.lIIlIIIIIlIlllIlIIlIlIlll.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.IIIIlIllIlIIlIIlIllIlIlll.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.lllIIIIIIlIlllIIlIlIIIllI.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.llIIlIIllIIllIlIIllIIllII.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.lIlIlIIIIIIlIIllllIlIIllI.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.IlIlIIlIlIllIIlIlIIllIIIl.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.lIlIlIIlIIIIlIIIIIlllIIII.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.IlIlIIlllIllllllllIIIlIlI.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.IIIIlIlIIlIIIIlIlllIlIIII.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.lllIIIIlIlIIlIIlllIIIIIIl.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.IllllIIIIlIIlIIIIlllIIIIl.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.llllIlIIIIIIIIIlllIIlIIIl.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.IlIlIIlIlIllIIlIlIIllIIIl.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = this.lllIIIllIIIIlllIlIIllIIll(3) == 0 ? class_0672.IIIIlIllIlIIlIIlIllIlIlll.lIlIllIIllIIIIlllIlIlllIl : class_0672.lIIlIIIIIlIlllIlIIlIlIlll.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.llIIlIlIlllIIllIlIlllIllI.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.llIIIIllIIIIIIIlIIIlIIIIl.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.IIllIllIIllIIlllIIIlIlllI.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.IlIlllIIIIIIlIIllIIllIlll.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.lIlIIllllIlIIIIllIIIIlIIl.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.IlIlIIlllIIlIllIIIlllllIl.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.llIlIIlllIIIIIllIIlIlIIII.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.IllIIIlllllIlIlllIlllllII.lIlIllIIllIIIIlllIlIlllIl) {
                    n8 = class_0672.llIlllIlIIllIlIIIIllIIlIl.lIlIllIIllIIIIlllIlIlllIl;
                } else if (class_0240.lllIIIllIIIIlllIlIIllIIll(n6, class_0672.lIIIlIIIlIlllIllIIIlIIIlI.lIlIllIIllIIIIlllIlIlllIl)) {
                    n8 = class_0672.lIIIllIIIIIllllIlIlIllIll.lIlIllIIllIIIIlllIlIlllIl;
                } else if (n6 == class_0672.lIlIIllllIlIIIIllIIIIlIIl.lIlIllIIllIIIIlllIlIlllIl && this.lllIIIllIIIIlllIlIIllIIll(3) == 0) {
                    n5 = this.lllIIIllIIIIlllIlIIllIIll(2);
                    n8 = n5 == 0 ? class_0672.IlIlIIlIlIllIIlIlIIllIIIl.lIlIllIIllIIIIlllIlIlllIl : class_0672.lIIlIIIIIlIlllIlIIlIlIlll.lIlIllIIllIIIIlllIlIlllIl;
                }
                if (bl && n8 != n6) {
                    n8 = class_0672.lIlllIlllIIIIlIIlllIllIII(n8 + 128) != null ? (n8 += 128) : n6;
                }
                if (n8 == n6) {
                    arrn3[j + i * n3] = n6;
                    continue;
                }
                n5 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                int n9 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                int n10 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                int n11 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                int n12 = 0;
                if (class_0240.lllIIIllIIIIlllIlIIllIIll(n5, n6)) {
                    ++n12;
                }
                if (class_0240.lllIIIllIIIIlllIlIIllIIll(n9, n6)) {
                    ++n12;
                }
                if (class_0240.lllIIIllIIIIlllIlIIllIIll(n10, n6)) {
                    ++n12;
                }
                if (class_0240.lllIIIllIIIIlllIlIIllIIll(n11, n6)) {
                    ++n12;
                }
                arrn3[j + i * n3] = n12 >= 3 ? n8 : n6;
            }
        }
        return arrn3;
    }
}

