package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1852 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;

    public class_1852(int n, int n2) {
        this(n, n2, 0);
    }

    public class_1852(int n, int n2, int n3) {
        this(n, n2, n3, false);
    }

    public class_1852(int n, int n2, int n3, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.IlIIIIIllllllIIlllIllllll = bl;
    }

    public class_1852(class_1852 class_18522) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18522.lllIIIllIIIIlllIlIIllIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_18522.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIllllllIIlIIllllIIlIIIl = class_18522.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1852 class_18522) {
        if (this.lllIIIllIIIIlllIlIIllIIll != class_18522.lllIIIllIIIIlllIlIIllIIll) {
            System.err.println("This method should only be called for matching effects!");
        }
        if (class_18522.IlIllllllIIlIIllllIIlIIIl > this.IlIllllllIIlIIllllIIlIIIl) {
            this.IlIllllllIIlIIllllIIlIIIl = class_18522.IlIllllllIIlIIllllIIlIIIl;
            this.lllIlIIlIIIlIlIIIllIlllIl = class_18522.lllIlIIlIIIlIlIIIllIlllIl;
        } else if (class_18522.IlIllllllIIlIIllllIIlIIIl == this.IlIllllllIIlIIllllIIlIIIl && this.lllIlIIlIIIlIlIIIllIlllIl < class_18522.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl = class_18522.lllIlIIlIIIlIlIIIllIlllIl;
        } else if (!class_18522.IlIIIIIllllllIIlllIllllll && this.IlIIIIIllllllIIlllIllllll) {
            this.IlIIIIIllllllIIlllIllllll = class_18522.IlIIIIIllllllIIlllIllllll;
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIlllIlllIIIIlIIlllIllIII = bl;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            if (class_0700.lllIIIllIIIIlllIlIIllIIll[this.lllIIIllIIIIlllIlIIllIIll].lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl)) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_19652);
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl > 0;
    }

    private int IIIllIIlIIIIIIlIlIIllIIlI() {
        return --this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            class_0700.lllIIIllIIIIlllIlIIllIIll[this.lllIIIllIIIIlllIlIIllIIll].lllIIIllIIIIlllIlIIllIIll(class_19652, this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return class_0700.lllIIIllIIIIlllIlIIllIIll[this.lllIIIllIIIIlllIlIIllIIll].IlIllllllIIlIIllllIIlIIIl();
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String toString() {
        String string = "";
        string = this.IlIllllllIIlIIllllIIlIIIl() > 0 ? this.IlIIIIIllllllIIlllIllllll() + " x " + (this.IlIllllllIIlIIllllIIlIIIl() + 1) + ", Duration: " + this.lllIlIIlIIIlIlIIIllIlllIl() : this.IlIIIIIllllllIIlllIllllll() + ", Duration: " + this.lllIlIIlIIIlIlIIIllIlllIl();
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            string = string + ", Splash: true";
        }
        return class_0700.lllIIIllIIIIlllIlIIllIIll[this.lllIIIllIIIIlllIlIIllIIll].IllIIlllllllIIlIIlIIIIlIl() ? "(" + string + ")" : string;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class_1852)) {
            return false;
        }
        class_1852 class_18522 = (class_1852)object;
        return this.lllIIIllIIIIlllIlIIllIIll == class_18522.lllIIIllIIIIlllIlIIllIIll && this.IlIllllllIIlIIllllIIlIIIl == class_18522.IlIllllllIIlIIllllIIlIIIl && this.lllIlIIlIIIlIlIIIllIlllIl == class_18522.lllIlIIlIIIlIlIIIllIlllIl && this.lIlllIlllIIIIlIIlllIllIII == class_18522.lIlllIlllIIIIlIIlllIllIII && this.IlIIIIIllllllIIlllIllllll == class_18522.IlIIIIIllllllIIlllIllllll;
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Id", (byte)this.lllIIIllIIIIlllIlIIllIIll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Amplifier", (byte)this.IlIllllllIIlIIllllIIlIIIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Duration", this.lllIlIIlIIIlIlIIIllIlllIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Ambient", this.lIlllIlllIIIIlIIlllIllIII());
        return class_07752;
    }

    public static class_1852 lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        byte by = class_07752.lIlllIlllIIIIlIIlllIllIII("Id");
        if (by >= 0 && by < class_0700.lllIIIllIIIIlllIlIIllIIll.length && class_0700.lllIIIllIIIIlllIlIIllIIll[by] != null) {
            byte by2 = class_07752.lIlllIlllIIIIlIIlllIllIII("Amplifier");
            int n = class_07752.lIllllIIlIIIlIllllllIIIll("Duration");
            boolean bl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Ambient");
            return new class_1852(by, n, by2, bl);
        }
        return null;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.lIllllIIlIIIlIllllllIIIll = bl;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }
}

