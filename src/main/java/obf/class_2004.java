package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.RecursiveAction;

public class class_2004
extends RecursiveAction {
    private static final long lllIIIllIIIIlllIlIIllIIll = 1L;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int[] lIlllIlllIIIIlIIlllIllIII;
    private final class_1796 IlIIIIIllllllIIlllIllllll;

    public class_2004(int[] arrn, int n, int n2, class_1796 class_17962) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = arrn;
        this.IlIIIIIllllllIIlllIllllll = class_17962;
    }

    @Override
    protected void compute() {
        int n;
        int n2;
        int n3;
        int[] arrn = this.lIlllIlllIIIIlIIlllIllIII;
        int n4 = this.IlIllllllIIlIIllllIIlIIIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        if (n4 < 8192) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll);
            return;
        }
        int n5 = this.lllIlIIlIIIlIlIIIllIlllIl + n4 / 2;
        int n6 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n7 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        int n8 = n4 / 8;
        n6 = class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n6, n6 + n8, n6 + 2 * n8, this.IlIIIIIllllllIIlllIllllll);
        n5 = class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n5 - n8, n5, n5 + n8, this.IlIIIIIllllllIIlllIllllll);
        n7 = class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n7 - 2 * n8, n7 - n8, n7, this.IlIIIIIllllllIIlllIllllll);
        n5 = class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n6, n5, n7, this.IlIIIIIllllllIIlllIllllll);
        int n9 = arrn[n5];
        int n10 = n3 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n11 = n2 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        while (true) {
            if (n10 <= n2 && (n = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(arrn[n10], n9)) <= 0) {
                if (n == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n3++, n10);
                }
                ++n10;
                continue;
            }
            while (n2 >= n10 && (n = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(arrn[n2], n9)) >= 0) {
                if (n == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n2, n11--);
                }
                --n2;
            }
            if (n10 > n2) break;
            class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n10++, n2--);
        }
        n8 = Math.min(n3 - this.lllIlIIlIIIlIlIIIllIlllIl, n10 - n3);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, this.lllIlIIlIIIlIlIIIllIlllIl, n10 - n8, n8);
        n8 = Math.min(n11 - n2, this.IlIllllllIIlIIllllIIlIIIl - n11 - 1);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n10, this.IlIllllllIIlIIllllIIlIIIl - n8, n8);
        n8 = n10 - n3;
        n = n11 - n2;
        if (n8 > 1 && n > 1) {
            class_2004.invokeAll(new class_2004(arrn, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8, this.IlIIIIIllllllIIlllIllllll), new class_2004(arrn, this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll));
        } else if (n8 > 1) {
            class_2004.invokeAll(new class_2004(arrn, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8, this.IlIIIIIllllllIIlllIllllll));
        } else {
            class_2004.invokeAll(new class_2004(arrn, this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll));
        }
    }
}

