package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.RecursiveAction;

public class class_2169
extends RecursiveAction {
    private static final long lllIIIllIIIIlllIlIIllIIll = 1L;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final class_1796 lIlllIlllIIIIlIIlllIllIII;
    private final class_2039 IlIIIIIllllllIIlllIllllll;

    public class_2169(int n, int n2, class_1796 class_17962, class_2039 class_20392) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = class_17962;
        this.IlIIIIIllllllIIlllIllllll = class_20392;
    }

    @Override
    protected void compute() {
        int n;
        int n2;
        int n3;
        int n4 = this.IlIllllllIIlIIllllIIlIIIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        if (n4 < 8192) {
            class_0214.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
            return;
        }
        int n5 = this.lllIlIIlIIIlIlIIIllIlllIl + n4 / 2;
        int n6 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n7 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        int n8 = n4 / 8;
        n6 = class_0214.lllIIIllIIIIlllIlIIllIIll(n6, n6 + n8, n6 + 2 * n8, this.lIlllIlllIIIIlIIlllIllIII);
        n5 = class_0214.lllIIIllIIIIlllIlIIllIIll(n5 - n8, n5, n5 + n8, this.lIlllIlllIIIIlIIlllIllIII);
        n7 = class_0214.lllIIIllIIIIlllIlIIllIIll(n7 - 2 * n8, n7 - n8, n7, this.lIlllIlllIIIIlIIlllIllIII);
        n5 = class_0214.lllIIIllIIIIlllIlIIllIIll(n6, n5, n7, this.lIlllIlllIIIIlIIlllIllIII);
        int n9 = n3 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n10 = n2 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        while (true) {
            if (n9 <= n2 && (n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n9, n5)) <= 0) {
                if (n == 0) {
                    if (n3 == n5) {
                        n5 = n9;
                    } else if (n9 == n5) {
                        n5 = n3;
                    }
                    this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n3++, n9);
                }
                ++n9;
                continue;
            }
            while (n2 >= n9 && (n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n2, n5)) >= 0) {
                if (n == 0) {
                    if (n2 == n5) {
                        n5 = n10;
                    } else if (n10 == n5) {
                        n5 = n2;
                    }
                    this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n2, n10--);
                }
                --n2;
            }
            if (n9 > n2) break;
            if (n9 == n5) {
                n5 = n10;
            } else if (n2 == n5) {
                n5 = n2;
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n9++, n2--);
        }
        n8 = Math.min(n3 - this.lllIlIIlIIIlIlIIIllIlllIl, n9 - n3);
        class_0214.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.lllIlIIlIIIlIlIIIllIlllIl, n9 - n8, n8);
        n8 = Math.min(n10 - n2, this.IlIllllllIIlIIllllIIlIIIl - n10 - 1);
        class_0214.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, n9, this.IlIllllllIIlIIllllIIlIIIl - n8, n8);
        n8 = n9 - n3;
        n = n10 - n2;
        if (n8 > 1 && n > 1) {
            class_2169.invokeAll(new class_2169(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll), new class_2169(this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
        } else if (n8 > 1) {
            class_2169.invokeAll(new class_2169(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
        } else {
            class_2169.invokeAll(new class_2169(this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
        }
    }
}

