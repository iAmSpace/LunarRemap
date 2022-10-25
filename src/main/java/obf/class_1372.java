package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1372
extends class_0323 {
    float lllIIIllIIIIlllIlIIllIIll;

    public class_1372(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        this(class_13342, d, d2, d3, d4, d5, d6, 1.0f);
    }

    public class_1372(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.1f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.1f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.1f;
        this.IIIIIIIIlIllIIllIIlllIllI += d4;
        this.IIlIIlIlIlIllIIlIlIIIIlll += d5;
        this.llIIIlllIlllIlIllIIIIllIl += d6;
        this.lIIIIlIlIIlllllIIllIIlIII = this.llIIlllIllIllllIIIlIIIIII = 1.0f - (float)(Math.random() * (double)0.3f);
        this.IllIIIllIIIIlIlIlIllIIlll = this.llIIlllIllIllllIIIlIIIIII;
        this.IllIIlllllllIIlIIlIIIIlIl *= 0.75f;
        this.IllIIlllllllIIlIIlIIIIlIl *= f;
        this.lllIIIllIIIIlllIlIIllIIll = this.IllIIlllllllIIlIIlIIIIlIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)((float)this.IIIllIIlIIIIIIlIlIIllIIlI * f);
        this.IlIIIlIllIIIllIIIIlIIlIll = false;
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
        this.lllIlIIlIIIlIlIIIllIlllIl(7 - this.lIllllIIlIIIlIllllllIIIll * 8 / this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.03;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.99f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.99f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.99f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
    }
}

