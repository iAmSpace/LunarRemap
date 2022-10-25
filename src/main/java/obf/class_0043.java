package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0043
extends class_0323 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int IIIlIllllIIIlllllIllIlIII = 8;

    public class_0043(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    @Override
    public void s_() {
        for (int i = 0; i < 6; ++i) {
            double d = this.IlIIlllllIIlIlIlllllIllll + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - this.IlllIIlllllllIIllIlIllllI.nextDouble()) * 4.0;
            double d2 = this.llIIlIlIlllIIllIlIlllIllI + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - this.IlllIIlllllllIIllIlIllllI.nextDouble()) * 4.0;
            double d3 = this.IllIIIIllIIllIllIlllIlIIl + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - this.IlllIIlllllllIIllIlIllllI.nextDouble()) * 4.0;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("largeexplode", d, d2, d3, (double)((float)this.lllIIIllIIIIlllIlIIllIIll / (float)this.IIIlIllllIIIlllllIllIlIII), 0.0, 0.0);
        }
        ++this.lllIIIllIIIIlllIlIIllIIll;
        if (this.lllIIIllIIIIlllIlIIllIIll == this.IIIlIllllIIIlllllIllIlIII) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 1;
    }
}

