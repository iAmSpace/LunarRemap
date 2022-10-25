package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0327
extends class_0323 {
    private class_1521 lllIIIllIIIIlllIlIIllIIll;
    private int IIIlIllllIIIlllllIllIlIII;
    private int IIIIIllIlIllIlIlIIlIllIIl;
    private String lIIllIlIIlIIlllllIlIIllIl;

    public class_0327(class_1334 class_13342, class_1521 class_15212) {
        this(class_13342, class_15212, "crit");
    }

    public class_0327(class_1334 class_13342, class_1521 class_15212, String string) {
        super(class_13342, class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)(class_15212.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f), class_15212.IllIIIIllIIllIllIlllIlIIl, class_15212.IIIIIIIIlIllIIllIIlllIllI, class_15212.IIlIIlIlIlIllIIlIlIIIIlll, class_15212.llIIIlllIlllIlIllIIIIllIl);
        this.lllIIIllIIIIlllIlIIllIIll = class_15212;
        this.IIIIIllIlIllIlIlIIlIllIIl = 3;
        this.lIIllIlIIlIIlllllIlIIllIl = string;
        this.s_();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    @Override
    public void s_() {
        for (int i = 0; i < 16; ++i) {
            double d;
            double d2;
            double d3 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f;
            if (!(d3 * d3 + (d2 = (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f)) * d2 + (d = (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f)) * d <= 1.0)) continue;
            double d4 = this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll + d3 * (double)this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII / 4.0;
            double d5 = this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)(this.lllIIIllIIIIlllIlIIllIIll.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f) + d2 * (double)this.lllIIIllIIIIlllIlIIllIIll.lllIIIIlIlIIlIIlllIIIIIIl / 4.0;
            double d6 = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl + d * (double)this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII / 4.0;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIllIlIIlIIlllllIlIIllIl, d4, d5, d6, d3, d2 + 0.2, d);
        }
        ++this.IIIlIllllIIIlllllIllIlIII;
        if (this.IIIlIllllIIIlllllIllIlIII >= this.IIIIIllIlIllIlIlIIlIllIIl) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 3;
    }
}

