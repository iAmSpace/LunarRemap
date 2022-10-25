package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0849
extends class_0229
implements class_1832 {
    private String lllIIIllIIIIlllIlIIllIIll = "";
    private String lllIlIIlIIIlIlIIIllIlllIl = "";
    private int IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.lllIIIllIIIIlllIlIIllIIll(string);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lIlllIlllIIIIlIIlllIllIII("Working...");
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.lllIIIllIIIIlllIlIIllIIll(0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lIlllIlllIIIIlIIlllIllIII = true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        } else {
            this.llIIlIllIllllIlIIIIlIIlll();
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 70, 0xFFFFFF);
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl + " " + this.IlIllllllIIlIIllllIIlIIIl + "%", this.IlIlIIlllIIlIllIIIlllllIl / 2, 90, 0xFFFFFF);
            super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        }
    }
}

