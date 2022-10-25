package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0464
extends class_0323 {
    float lllIIIllIIIIlllIlIIllIIll;

    public class_0464(class_1334 class_13342, double d, double d2, double d3, float f, float f2, float f3) {
        this(class_13342, d, d2, d3, 1.0f, f, f2, f3);
    }

    public class_0464(class_1334 class_13342, double d, double d2, double d3, float f, float f2, float f3, float f4) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.1f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.1f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.1f;
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        float f5 = (float)Math.random() * 0.4f + 0.6f;
        this.IllIIIllIIIIlIlIlIllIIlll = ((float)(Math.random() * (double)0.2f) + 0.8f) * f2 * f5;
        this.lIIIIlIlIIlllllIIllIIlIII = ((float)(Math.random() * (double)0.2f) + 0.8f) * f3 * f5;
        this.llIIlllIllIllllIIIlIIIIII = ((float)(Math.random() * (double)0.2f) + 0.8f) * f4 * f5;
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
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        if (this.llIIlIlIlllIIllIlIlllIllI == this.llIllllIlIllIIIlIllIIlIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= 1.1;
            this.llIIIlllIlllIlIllIIIIllIl *= 1.1;
        }
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.96f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.96f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.96f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
    }
}

