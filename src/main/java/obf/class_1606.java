package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1606
extends class_0323 {
    float lllIIIllIIIIlllIlIIllIIll;

    public class_1606(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        this(class_13342, d, d2, d3, d4, d5, d6, 2.0f);
    }

    public class_1606(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.01f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.01f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.01f;
        this.IIlIIlIlIlIllIIlIlIIIIlll += 0.1;
        this.IllIIlllllllIIlIIlIIIIlIl *= 0.75f;
        this.IllIIlllllllIIlIIlIIIIlIl *= f;
        this.lllIIIllIIIIlllIlIIllIIll = this.IllIIlllllllIIlIIlIIIIlIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 16;
        this.IlIIIlIllIIIllIIIIlIIlIll = false;
        this.lllIlIIlIIIlIlIIIllIlllIl(80);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.lIllllIIlIIIlIllllllIIIll + f) / (float)this.IIIllIIlIIIIIIlIlIIllIIlI * 32.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll * f7;
        super.lllIIIllIIIIlllIlIIllIIll(class_08682, f, f2, f3, f4, f5, f6);
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        if (this.lIllllIIlIIIlIllllllIIIll++ >= this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        if (this.llIIlIlIlllIIllIlIlllIllI == this.llIllllIlIllIIIlIllIIlIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= 1.1;
            this.llIIIlllIlllIlIllIIIIllIl *= 1.1;
        }
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.86f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.86f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.86f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
    }
}

