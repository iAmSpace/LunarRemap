package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2177
extends class_1634 {
    private class_2013 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0229 IlIllllllIIlIIllllIIlIIIl;
    protected String lllIIIllIIIIlllIlIIllIIll = "Controls";
    private class_1835 lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll = -1;

    public class_2177(class_0229 class_02292, class_2013 class_20132) {
        this.IlIllllllIIlIIllllIIlIIIl = class_02292;
        this.lIlllIlllIIIIlIIlllIllIII = class_20132.lllIlIIlIIIlIlIIIllIlllIl();
    }

    private int lIllllIIlIIIlIllllllIIIll() {
        return this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155;
    }

    @Override
    public void n_() {
        int n = this.lIllllIIlIIIlIllllllIIIll();
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI.length; ++i) {
            this.llIIllIllIlIIlIIllIllllll().add(new class_1419(i, n + i % 2 * 160, this.llIIlllIllIllllIIIlIIIIII() / 6 + 24 * (i >> 1), 70, 20, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i)));
        }
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(200, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 168, class_0950.lllIIIllIIIIlllIlIIllIIll("gui.done")));
        this.lllIIIllIIIIlllIlIIllIIll = class_0950.lllIIIllIIIIlllIlIIllIIll("controls.minimap.title");
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI.length; ++i) {
            ((class_1197)this.llIIllIllIlIIlIIllIllllll().get((int)i)).IllIIlllllllIIlIIlIIIIlIl = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i);
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
            this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        } else {
            this.IlIIIIIllllllIIlllIllllll = class_11972.IIIllIllIIlIlIlIlIllllIIl;
            class_11972.IllIIlllllllIIlIIlIIIIlIl = "> " + this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(class_11972.IIIllIllIIlIlIlIlIllllIIl) + " <";
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.IlIIIIIllllllIIlllIllllll >= 0) {
            this.IlIIIIIllllllIIlllIllllll = -1;
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (this.IlIIIIIllllllIIlllIllllll >= 0) {
            if (n != 1) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, n);
            } else if (this.IlIIIIIllllllIIlllIllllll != 0) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, 0);
            }
            ((class_1197)this.llIIllIllIlIIlIIllIllllll().get((int)this.IlIIIIIllllllIIlllIllllll)).IllIIlllllllIIlIIlIIIIlIl = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll);
            this.IlIIIIIllllllIIlllIllllll = -1;
            class_1335.lllIlIIlIIIlIlIIIllIlllIl();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.IIIllIllIIlIlIlIlIllllIIl();
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI(), this.lllIIIllIIIIlllIlIIllIIll, this.lIIIIlIlIIlllllIIllIIlIII() / 2, 20, 0xFFFFFF);
        int n3 = this.lIllllIIlIIIlIllllllIIIll();
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI.length; ++i) {
            boolean bl = false;
            int n4 = 0;
            while (true) {
                if (n4 < this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI.length) {
                    if (this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI[i].IIIllIllIIlIlIlIlIllllIIl() == 0 || (n4 == i || this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI[i].IIIllIllIIlIlIlIlIllllIIl() != this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI[n4].IIIllIllIIlIlIlIlIllllIIl()) && (this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI[i].IIIllIllIIlIlIlIlIllllIIl() != this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII.gameSettings.llIlllllIIlIIlIIllllIllll[n4].IIIllIllIIlIlIlIlIllllIIl() || this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI[i].equals(this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII.gameSettings.llIlllllIIlIIlIIllllIllll[n4]))) {
                        ++n4;
                        continue;
                    }
                    bl = true;
                    continue;
                }
                if (n4 >= this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII.gameSettings.llIlllllIIlIIlIIllllIllll.length || this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI[i].IIIllIllIIlIlIlIlIllllIIl() != 0 && this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI[i].IIIllIllIIlIlIlIlIllllIIl() == this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII.gameSettings.llIlllllIIlIIlIIllllIllll[n4].IIIllIllIIlIlIlIlIllllIIl() && !this.lIlllIlllIIIIlIIlllIllIII.lllIIIIIIlIlllIIlIlIIIllI[i].equals(this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII.gameSettings.llIlllllIIlIIlIIllllIllll[n4])) break;
                ++n4;
            }
            bl = true;
            ((class_1197)this.llIIllIllIlIIlIIllIllllll().get((int)i)).IllIIlllllllIIlIIlIIIIlIl = this.IlIIIIIllllllIIlllIllllll == i ? "\u00a7f> \u00a7e??? \u00a7f<" : (bl ? "\u00a7c" + this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i) : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i));
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI(), this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(i), n3 + i % 2 * 160 + 70 + 6, this.llIIlllIllIllllIIIlIIIIII() / 6 + 24 * (i >> 1) + 7, -1);
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI(), class_0950.lllIIIllIIIIlllIlIIllIIll("controls.minimap.unbind1"), this.lIIIIlIlIIlllllIIllIIlIII() / 2, this.llIIlllIllIllllIIIlIIIIII() / 6 + 115, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI(), class_0950.lllIIIllIIIIlllIlIIllIIll("controls.minimap.unbind2"), this.lIIIIlIlIIlllllIIllIIlIII() / 2, this.llIIlllIllIllllIIIlIIIIII() / 6 + 129, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

