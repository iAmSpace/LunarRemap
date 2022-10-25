package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.RecursiveAction;

public class class_0953
extends RecursiveAction {
    private static final long lllIIIllIIIIlllIlIIllIIll = 1L;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int[] lIlllIlllIIIIlIIlllIllIII;
    private final int[] IlIIIIIllllllIIlllIllllll;

    public class_0953(int[] arrn, int[] arrn2, int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.IlIIIIIllllllIIlllIllllll = arrn2;
        this.lIlllIlllIIIIlIIlllIllIII = arrn;
    }

    @Override
    protected void compute() {
        int n;
        int n2;
        int n3;
        int[] arrn = this.IlIIIIIllllllIIlllIllllll;
        int n4 = this.IlIllllllIIlIIllllIIlIIIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        if (n4 < 8192) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, arrn, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
            return;
        }
        int n5 = this.lllIlIIlIIIlIlIIIllIlllIl + n4 / 2;
        int n6 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n7 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        int n8 = n4 / 8;
        n6 = class_1741.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, arrn, n6, n6 + n8, n6 + 2 * n8);
        n5 = class_1741.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, arrn, n5 - n8, n5, n5 + n8);
        n7 = class_1741.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, arrn, n7 - 2 * n8, n7 - n8, n7);
        n5 = class_1741.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, arrn, n6, n5, n7);
        int n9 = arrn[this.lIlllIlllIIIIlIIlllIllIII[n5]];
        int n10 = n3 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n11 = n2 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        while (true) {
            if (n10 <= n2 && (n = Integer.compare(arrn[this.lIlllIlllIIIIlIIlllIllIII[n10]], n9)) <= 0) {
                if (n == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(this.lIlllIlllIIIIlIIlllIllIII, n3++, n10);
                }
                ++n10;
                continue;
            }
            while (n2 >= n10 && (n = Integer.compare(arrn[this.lIlllIlllIIIIlIIlllIllIII[n2]], n9)) >= 0) {
                if (n == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(this.lIlllIlllIIIIlIIlllIllIII, n2, n11--);
                }
                --n2;
            }
            if (n10 > n2) break;
            class_1741.lIllllIIlIIIlIllllllIIIll(this.lIlllIlllIIIIlIIlllIllIII, n10++, n2--);
        }
        n8 = Math.min(n3 - this.lllIlIIlIIIlIlIIIllIlllIl, n10 - n3);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII, this.lllIlIIlIIIlIlIIIllIlllIl, n10 - n8, n8);
        n8 = Math.min(n11 - n2, this.IlIllllllIIlIIllllIIlIIIl - n11 - 1);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII, n10, this.IlIllllllIIlIIllllIIlIIIl - n8, n8);
        n8 = n10 - n3;
        n = n11 - n2;
        if (n8 > 1 && n > 1) {
            class_0953.invokeAll(new class_0953(this.lIlllIlllIIIIlIIlllIllIII, arrn, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8), new class_0953(this.lIlllIlllIIIIlIIlllIllIII, arrn, this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl));
        } else if (n8 > 1) {
            class_0953.invokeAll(new class_0953(this.lIlllIlllIIIIlIIlllIllIII, arrn, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8));
        } else {
            class_0953.invokeAll(new class_0953(this.lIlllIlllIIIIlIIlllIllIII, arrn, this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl));
        }
    }
}

