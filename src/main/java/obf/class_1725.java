package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.NoSuchElementException;

class class_1725 {
    int lllIlIIlIIIlIlIIIllIlllIl;
    int IlIllllllIIlIIllllIIlIIIl;
    int lIlllIlllIIIIlIIlllIllIII;
    boolean IlIIIIIllllllIIlllIllllll;
    class_2034 lIllllIIlIIIlIllllllIIIll;
    final /* synthetic */ class_1427 IIIllIIlIIIIIIlIlIIllIIlI;

    private class_1725(class_1427 class_14272) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_14272;
        this.lllIlIIlIIIlIlIIIllIlllIl = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIlIIIllllllIIIIlIlIlI;
        this.IlIllllllIIlIIllllIIlIIIl = -1;
        this.lIlllIlllIIIIlIIlllIllIII = this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlIlIllIIlIlIIllIIIl;
        this.IlIIIIIllllllIIlllIllllll = this.IIIllIIlIIIIIIlIlIIllIIlI.llIIllIllIlIIlIIllIllllll;
    }

    public boolean hasNext() {
        return this.lIlllIlllIIIIlIIlllIllIII != 0;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        --this.lIlllIlllIIIIlIIlllIllIII;
        if (this.IlIIIIIllllllIIlllIllllll) {
            this.IlIIIIIllllllIIlllIllllll = false;
            this.IlIllllllIIlIIllllIIlIIIl = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIlIIIllllllIIIIlIlIlI;
            return this.IlIllllllIIlIIllllIIlIIIl;
        }
        Object[] arrobject = this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll;
        do {
            if (--this.lllIlIIlIIIlIlIIIllIlllIl >= 0) continue;
            this.IlIllllllIIlIIllllIIlIIIl = Integer.MIN_VALUE;
            Object object = this.lIllllIIlIIIlIllllllIIIll.get(-this.lllIlIIlIIIlIlIIIllIlllIl - 1);
            int n = class_1652.lllIlIIlIIIlIlIIIllIlllIl(object.hashCode()) & this.IIIllIIlIIIIIIlIlIIllIIlI.llIIlllIllIllllIIIlIIIIII;
            while (!object.equals(arrobject[n])) {
                n = n + 1 & this.IIIllIIlIIIIIIlIlIIllIIlI.llIIlllIllIllllIIIlIIIIII;
            }
            return n;
        } while (arrobject[this.lllIlIIlIIIlIlIIIllIlllIl] == null);
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl;
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    private final void lllIIIllIIIIlllIlIIllIIll(int n) {
        Object[] arrobject = this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll;
        while (true) {
            Object object;
            int n2 = n;
            n = n2 + 1 & this.IIIllIIlIIIIIIlIlIIllIIlI.llIIlllIllIllllIIIlIIIIII;
            while (true) {
                if ((object = arrobject[n]) == null) {
                    arrobject[n2] = null;
                    this.IIIllIIlIIIIIIlIlIIllIIlI.lIIIIlIlIIlllllIIllIIlIII[n2] = null;
                    return;
                }
                int n3 = class_1652.lllIlIIlIIIlIlIIIllIlllIl(object.hashCode()) & this.IIIllIIlIIIIIIlIlIIllIIlI.llIIlllIllIllllIIIlIIIIII;
                if (n2 <= n ? n2 >= n3 || n3 > n : n2 >= n3 && n3 > n) break;
                n = n + 1 & this.IIIllIIlIIIIIIlIlIIllIIlI.llIIlllIllIllllIIIlIIIIII;
            }
            if (n < n2) {
                if (this.lIllllIIlIIIlIllllllIIIll == null) {
                    this.lIllllIIlIIIlIllllllIIIll = new class_2034(2);
                }
                this.lIllllIIlIIIlIllllllIIIll.add(arrobject[n]);
            }
            arrobject[n2] = object;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIIIIlIlIIlllllIIllIIlIII[n2] = this.IIIllIIlIIIIIIlIlIIllIIlI.lIIIIlIlIIlllllIIllIIlIII[n];
        }
    }

    public void remove() {
        if (this.IlIllllllIIlIIllllIIlIIIl == -1) {
            throw new IllegalStateException();
        }
        if (this.IlIllllllIIlIIllllIIlIIIl == this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIlIIIllllllIIIIlIlIlI) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.llIIllIllIlIIlIIllIllllll = false;
            this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll[this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIlIIIllllllIIIIlIlIlI] = null;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIIIIlIlIIlllllIIllIIlIII[this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIlIIIllllllIIIIlIlIlI] = null;
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl >= 0) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        } else {
            this.IIIllIIlIIIIIIlIlIIllIIlI.remove(this.lIllllIIlIIIlIllllllIIIll.set(-this.lllIlIIlIIIlIlIIIllIlllIl - 1, (Object)null));
            this.IlIllllllIIlIIllllIIlIIIl = -1;
            return;
        }
        --this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlIlIllIIlIlIIllIIIl;
        this.IlIllllllIIlIIllllIIlIIIl = -1;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        int n2 = n;
        while (n2-- != 0 && this.hasNext()) {
            this.lllIlIIlIIIlIlIIIllIlllIl();
        }
        return n - n2 - 1;
    }

    /* synthetic */ class_1725(class_1427 class_14272, class_1547 class_15472) {
        this(class_14272);
    }
}

