package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1797
implements Comparable {
    private final class_1585 lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll = 1.0f;

    public class_1797(class_1585 class_15852, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15852;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_15852.lllIIIllIIIIlllIlIIllIIll();
        this.IlIllllllIIlIIllllIIlIIIl = class_15852.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlllIlllIIIIlIIlllIllIII = n;
        this.IlIIIIIllllllIIlllIllllll = class_1654.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, n) > class_1654.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, n);
    }

    public class_1585 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll ? class_1654.lllIIIllIIIIlllIlIIllIIll((int)((float)this.IlIllllllIIlIIllllIIlIIIl * this.lIllllIIlIIIlIllllllIIIll), this.lIlllIlllIIIIlIIlllIllIII) : class_1654.lllIIIllIIIIlllIlIIllIIll((int)((float)this.lllIlIIlIIIlIlIIIllIlllIl * this.lIllllIIlIIIlIllllllIIIll), this.lIlllIlllIIIIlIIlllIllIII);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll ? class_1654.lllIIIllIIIIlllIlIIllIIll((int)((float)this.lllIlIIlIIIlIlIIIllIlllIl * this.lIllllIIlIIIlIllllllIIIll), this.lIlllIlllIIIIlIIlllIllIII) : class_1654.lllIIIllIIIIlllIlIIllIIll((int)((float)this.IlIllllllIIlIIllllIIlIIIl * this.lIllllIIlIIIlIllllllIIIll), this.lIlllIlllIIIIlIIlllIllIII);
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        this.IlIIIIIllllllIIlllIllllll = !this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl > n && this.IlIllllllIIlIIllllIIlIIIl > n) {
            this.lIllllIIlIIIlIllllllIIIll = (float)n / (float)Math.min(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    public String toString() {
        return "Holder{width=" + this.lllIlIIlIIIlIlIIIllIlllIl + ", height=" + this.IlIllllllIIlIIllllIIlIIIl + '}';
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1797 class_17972) {
        int n;
        if (this.IlIllllllIIlIIllllIIlIIIl() == class_17972.IlIllllllIIlIIllllIIlIIIl()) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl() == class_17972.lllIlIIlIIIlIlIIIllIlllIl()) {
                if (this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI() == null) {
                    return class_17972.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI() == null ? 0 : -1;
                }
                return this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI().compareTo(class_17972.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI());
            }
            n = this.lllIlIIlIIIlIlIIIllIlllIl() < class_17972.lllIlIIlIIIlIlIIIllIlllIl() ? 1 : -1;
        } else {
            n = this.IlIllllllIIlIIllllIIlIIIl() < class_17972.IlIllllllIIlIIllllIIlIIIl() ? 1 : -1;
        }
        return n;
    }

    public int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1797)object);
    }
}

