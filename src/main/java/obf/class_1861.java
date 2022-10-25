package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1861
extends class_1382 {
    class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    class_0744[] IllIIlllllllIIlIIlIIIIlIl = new class_0744[8];

    public class_1861() {
        int n = -16;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-6.0f, -8.0f, -6.0f, 12, 16, 12);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII += (float)(24 + n);
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.length; ++i) {
            this.IllIIlllllllIIlIIlIIIIlIl[i] = new class_0744(this, 48, 0);
            double d = (double)i * Math.PI * 2.0 / (double)this.IllIIlllllllIIlIIlIIIIlIl.length;
            float f = (float)Math.cos(d) * 5.0f;
            float f2 = (float)Math.sin(d) * 5.0f;
            this.IllIIlllllllIIlIIlIIIIlIl[i].lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.IllIIlllllllIIlIIlIIIIlIl[i].IlIllllllIIlIIllllIIlIIIl = f;
            this.IllIIlllllllIIlIIlIIIIlIl[i].IlIIIIIllllllIIlllIllllll = f2;
            this.IllIIlllllllIIlIIlIIIIlIl[i].lIlllIlllIIIIlIIlllIllIII = 31 + n;
            d = (double)i * Math.PI * -2.0 / (double)this.IllIIlllllllIIlIIlIIIIlIl.length + 1.5707963267948966;
            this.IllIIlllllllIIlIIlIIIIlIl[i].IIIllIIlIIIIIIlIlIIllIIlI = (float)d;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        for (class_0744 class_07442 : this.IllIIlllllllIIlIIlIIIIlIl) {
            class_07442.lIllllIIlIIIlIllllllIIIll = f3;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.length; ++i) {
            this.IllIIlllllllIIlIIlIIIIlIl[i].lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }
}

