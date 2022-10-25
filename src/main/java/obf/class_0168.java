package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0168 {
    private class_2120[] lllIIIllIIIIlllIlIIllIIll = new class_2120[1024];
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_2120 lllIIIllIIIIlllIlIIllIIll(class_2120 class_21202) {
        if (class_21202.lIlllIlllIIIIlIIlllIllIII >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl == this.lllIIIllIIIIlllIlIIllIIll.length) {
            class_2120[] arrclass_2120 = new class_2120[this.lllIlIIlIIIlIlIIIllIlllIl << 1];
            System.arraycopy(this.lllIIIllIIIIlllIlIIllIIll, 0, arrclass_2120, 0, this.lllIlIIlIIIlIlIIIllIlllIl);
            this.lllIIIllIIIIlllIlIIllIIll = arrclass_2120;
        }
        this.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl] = class_21202;
        class_21202.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl;
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl++);
        return class_21202;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
    }

    public class_2120 lllIlIIlIIIlIlIIIllIlllIl() {
        class_2120 class_21202 = this.lllIIIllIIIIlllIlIIllIIll[0];
        this.lllIIIllIIIIlllIlIIllIIll[0] = this.lllIIIllIIIIlllIlIIllIIll[--this.lllIlIIlIIIlIlIIIllIlllIl];
        this.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl] = null;
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl(0);
        }
        class_21202.lIlllIlllIIIIlIIlllIllIII = -1;
        return class_21202;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2120 class_21202, float f) {
        float f2 = class_21202.IIIllIIlIIIIIIlIlIIllIIlI;
        class_21202.IIIllIIlIIIIIIlIlIIllIIlI = f;
        if (f < f2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_21202.lIlllIlllIIIIlIIlllIllIII);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_21202.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n) {
        class_2120 class_21202 = this.lllIIIllIIIIlllIlIIllIIll[n];
        float f = class_21202.IIIllIIlIIIIIIlIlIIllIIlI;
        while (n > 0) {
            int n2 = n - 1 >> 1;
            class_2120 class_21203 = this.lllIIIllIIIIlllIlIIllIIll[n2];
            if (f >= class_21203.IIIllIIlIIIIIIlIlIIllIIlI) break;
            this.lllIIIllIIIIlllIlIIllIIll[n] = class_21203;
            class_21203.lIlllIlllIIIIlIIlllIllIII = n;
            n = n2;
        }
        this.lllIIIllIIIIlllIlIIllIIll[n] = class_21202;
        class_21202.lIlllIlllIIIIlIIlllIllIII = n;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        class_2120 class_21202 = this.lllIIIllIIIIlllIlIIllIIll[n];
        float f = class_21202.IIIllIIlIIIIIIlIlIIllIIlI;
        while (true) {
            float f2;
            class_2120 class_21203;
            int n2 = 1 + (n << 1);
            int n3 = n2 + 1;
            if (n2 >= this.lllIlIIlIIIlIlIIIllIlllIl) break;
            class_2120 class_21204 = this.lllIIIllIIIIlllIlIIllIIll[n2];
            float f3 = class_21204.IIIllIIlIIIIIIlIlIIllIIlI;
            if (n3 >= this.lllIlIIlIIIlIlIIIllIlllIl) {
                class_21203 = null;
                f2 = Float.POSITIVE_INFINITY;
            } else {
                class_21203 = this.lllIIIllIIIIlllIlIIllIIll[n3];
                f2 = class_21203.IIIllIIlIIIIIIlIlIIllIIlI;
            }
            if (f3 < f2) {
                if (f3 >= f) break;
                this.lllIIIllIIIIlllIlIIllIIll[n] = class_21204;
                class_21204.lIlllIlllIIIIlIIlllIllIII = n;
                n = n2;
                continue;
            }
            if (f2 >= f) break;
            this.lllIIIllIIIIlllIlIIllIIll[n] = class_21203;
            class_21203.lIlllIlllIIIIlIIlllIllIII = n;
            n = n3;
        }
        this.lllIIIllIIIIlllIlIIllIIll[n] = class_21202;
        class_21202.lIlllIlllIIIIlIIlllIllIII = n;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl == 0;
    }
}

