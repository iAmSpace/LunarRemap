package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.RecursiveAction;

public class class_1452
extends RecursiveAction {
    private static final long lllIIIllIIIIlllIlIIllIIll = 1L;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final Object[] lIlllIlllIIIIlIIlllIllIII;
    private final Object[] IlIIIIIllllllIIlllIllllll;

    public class_1452(Object[] arrobject, Object[] arrobject2, int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = arrobject;
        this.IlIIIIIllllllIIlllIllllll = arrobject2;
    }

    @Override
    protected void compute() {
        int n;
        int n2;
        int n3;
        Object[] arrobject = this.lIlllIlllIIIIlIIlllIllIII;
        Object[] arrobject2 = this.IlIIIIIllllllIIlllIllllll;
        int n4 = this.IlIllllllIIlIIllllIIlIIIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        if (n4 < 8192) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
            return;
        }
        int n5 = this.lllIlIIlIIIlIlIIIllIlllIl + n4 / 2;
        int n6 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n7 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        int n8 = n4 / 8;
        n6 = class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, n6, n6 + n8, n6 + 2 * n8);
        n5 = class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, n5 - n8, n5, n5 + n8);
        n7 = class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, n7 - 2 * n8, n7 - n8, n7);
        n5 = class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, n6, n5, n7);
        Object object = arrobject[n5];
        Object object2 = arrobject2[n5];
        int n9 = n3 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n10 = n2 = this.IlIllllllIIlIIllllIIlIIIl - 1;
        while (true) {
            int n11;
            if (n9 <= n2 && (n = (n11 = ((Comparable)arrobject[n9]).compareTo(object)) == 0 ? ((Comparable)arrobject2[n9]).compareTo(object2) : n11) <= 0) {
                if (n == 0) {
                    class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, arrobject2, n3++, n9);
                }
                ++n9;
                continue;
            }
            while (n2 >= n9 && (n = (n11 = ((Comparable)arrobject[n2]).compareTo(object)) == 0 ? ((Comparable)arrobject2[n2]).compareTo(object2) : n11) >= 0) {
                if (n == 0) {
                    class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, arrobject2, n2, n10--);
                }
                --n2;
            }
            if (n9 > n2) break;
            class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, arrobject2, n9++, n2--);
        }
        n8 = Math.min(n3 - this.lllIlIIlIIIlIlIIIllIlllIl, n9 - n3);
        class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, arrobject2, this.lllIlIIlIIIlIlIIIllIlllIl, n9 - n8, n8);
        n8 = Math.min(n10 - n2, this.IlIllllllIIlIIllllIIlIIIl - n10 - 1);
        class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, arrobject2, n9, this.IlIllllllIIlIIllllIIlIIIl - n8, n8);
        n8 = n9 - n3;
        n = n10 - n2;
        if (n8 > 1 && n > 1) {
            class_1452.invokeAll(new class_1452(arrobject, arrobject2, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8), new class_1452(arrobject, arrobject2, this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl));
        } else if (n8 > 1) {
            class_1452.invokeAll(new class_1452(arrobject, arrobject2, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl + n8));
        } else {
            class_1452.invokeAll(new class_1452(arrobject, arrobject2, this.IlIllllllIIlIIllllIIlIIIl - n, this.IlIllllllIIlIIllllIIlIIIl));
        }
    }
}

