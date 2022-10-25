package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1565 {
    private int[] lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1565(int[] arrn, int n, int n2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.lllIIIllIIIIlllIlIIllIIll = arrn;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = bl;
        this.IlIIIIIllllllIIlllIllllll = bl2;
        this.lIllllIIlIIIlIllllllIIIll = bl3;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl4;
    }

    public int[] lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1565 class_15652) {
        if (class_15652 != null) {
            if (class_15652.IlIIIIIllllllIIlllIllllll == this.IlIIIIIllllllIIlllIllllll && class_15652.IIIllIIlIIIIIIlIlIIllIIlI == this.IIIllIIlIIIIIIlIlIIllIIlI && class_15652.lIllllIIlIIIlIllllllIIIll == this.lIllllIIlIIIlIllllllIIIll && class_15652.lIlllIlllIIIIlIIlllIllIII == this.lIlllIlllIIIIlIIlllIllIII) {
                int n = this.lllIlIIlIIIlIlIIIllIlllIl + class_15652.lllIlIIlIIIlIlIIIllIlllIl;
                int[] arrn = new int[n];
                System.arraycopy(this.lllIIIllIIIIlllIlIIllIIll, 0, arrn, 0, this.lllIlIIlIIIlIlIIIllIlllIl);
                System.arraycopy(class_15652.lllIIIllIIIIlllIlIIllIIll, 0, arrn, this.lllIlIIlIIIlIlIIIllIlllIl, class_15652.lllIlIIlIIIlIlIIIllIlllIl);
                this.lllIIIllIIIIlllIlIIllIIll = arrn;
                this.lllIlIIlIIIlIlIIIllIlllIl = n;
                this.IlIllllllIIlIIllllIIlIIIl += class_15652.IlIllllllIIlIIllllIIlIIIl;
            } else {
                throw new IllegalArgumentException("Incompatible vertex states");
            }
        }
    }
}

