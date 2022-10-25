package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0923
extends class_0229 {
    protected class_0945 lllIIIllIIIIlllIlIIllIIll;
    protected String lllIlIIlIIIlIlIIIllIlllIl;
    private String lIllllIIlIIIlIllllllIIIll;
    protected String IlIllllllIIlIIllllIIlIIIl;
    protected String lIlllIlllIIIIlIIlllIllIII;
    protected int IlIIIIIllllllIIlllIllllll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0923(class_0945 class_09452, String string, String string2, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_09452;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.lIllllIIlIIIlIllllllIIIll = string2;
        this.IlIIIIIllllllIIlllIllllll = n;
        this.IlIllllllIIlIIllllIIlIIIl = class_0616.lllIIIllIIIIlllIlIIllIIll("gui.yes", new Object[0]);
        this.lIlllIlllIIIIlIIlllIllIII = class_0616.lllIIIllIIIIlllIlIIllIIll("gui.no", new Object[0]);
    }

    public class_0923(class_0945 class_09452, String string, String string2, String string3, String string4, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_09452;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.lIllllIIlIIIlIllllllIIIll = string2;
        this.IlIllllllIIlIIllllIIlIIIl = string3;
        this.lIlllIlllIIIIlIIlllIllIII = string4;
        this.IlIIIIIllllllIIlllIllllll = n;
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 96, this.IlIllllllIIlIIllllIIlIIIl));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 96, this.lIlllIlllIIIIlIIlllIllIII));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_11972.IIIllIllIIlIlIlIlIllllIIl == 0, this.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIlIIlllIIlIllIIIlllllIl / 2, 70, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIllllIIlIIIlIllllllIIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 90, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        for (class_1197 class_11972 : this.lIlIlIIlIIIIlIIIIIlllIIII) {
            class_11972.IllIIIllIIIIlIlIlIllIIlll = false;
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        if (--this.IIIllIIlIIIIIIlIlIIllIIlI == 0) {
            for (class_1197 class_11972 : this.lIlIlIIlIIIIlIIIIIlllIIII) {
                class_11972.IllIIIllIIIIlIlIlIllIIlll = true;
            }
        }
    }
}

