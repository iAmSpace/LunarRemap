package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.RecursiveAction;

public class class_1659
extends RecursiveAction {
    private static final long lllIIIllIIIIlllIlIIllIIll = 1L;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int[] lIlllIlllIIIIlIIlllIllIII;
    private final int[] IlIIIIIllllllIIlllIllllll;

    public class_1659(int[] arrn, int[] arrn2, int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = arrn;
        this.IlIIIIIllllllIIlllIllllll = arrn2;
    }

    @Override
    protected void compute() {
        int n;
        int n2;
        int n3;
        int[] arrn = this.lIlllIlllIIIIlIIlllIllIII;
        int[] arrn2 = this.IlIIIIIllllllIIlllIllllll;
        int n4 = this.IlIllllllIIlIIllllIIlIIIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        if (n4 < 8192) {
            class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
            return;
        }
        int n5 = this.lllIlIIlIIIlIlIIIllIlllIl + n4 / 2;
        int n6 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n7 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        int n8 = n4 / 8;
        n6 = class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, n6, n6 + n8, n6 + 2 * n8);
        n5 = class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, n5 - n8, n5, n5 + n8);
        n7 = class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, n7 - 2 * n8, n7 - n8, n7);
        n5 = class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, n6, n5, n7);
        int n9 = arrn[n5];
        int n10 = arrn2[n5];
        int n11 = n3 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n12 = n2 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        while (true) {
            int n13;
            if (n11 <= n2 && (n = (n13 = Integer.compare(arrn[n11], n9)) == 0 ? Integer.compare(arrn2[n11], n10) : n13) <= 0) {
                if (n == 0) {
                    class_1741.IllIIlllllllIIlIIlIIIIlIl(arrn, arrn2, n3++, n11);
                }
                ++n11;
                continue;
            }
            while (n2 >= n11 && (n = (n13 = Integer.compare(arrn[n2], n9)) == 0 ? Integer.compare(arrn2[n2], n10) : n13) >= 0) {
                if (n == 0) {
                    class_1741.IllIIlllllllIIlIIlIIIIlIl(arrn, arrn2, n2, n12--);
                }
                --n2;
            }
            if (n11 > n2) break;
            class_1741.IllIIlllllllIIlIIlIIIIlIl(arrn, arrn2, n11++, n2--);
        }
        n8 = Math.min(n3 - this.lllIlIIlIIIlIlIIIllIlllIl, n11 - n3);
        class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, arrn2, this.lllIlIIlIIIlIlIIIllIlllIl, n11 - n8, n8);
        n8 = Math.min(n12 - n2, this.IlIllllllIIlIIllllIIlIIIl - n12 - 1);
        class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, arrn2, n11, this.IlIllllllIIlIIllllIIlIIIl - n8, n8);
        n8 = n11 - n3;
        n = n12 - n2;
        if (n8 > 1 && n > 1) {
            class_1659.invokeAll(new class_1659(arrn, arrn2, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8), new class_1659(arrn, arrn2, this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl));
        } else if (n8 > 1) {
            class_1659.invokeAll(new class_1659(arrn, arrn2, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8));
        } else {
            class_1659.invokeAll(new class_1659(arrn, arrn2, this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl));
        }
    }
}

