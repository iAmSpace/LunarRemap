package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1425
extends class_0323 {
    float lllIIIllIIIIlllIlIIllIIll;

    public class_1425(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        float f = 2.5f;
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
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(8.0 / (Math.random() * 0.8 + 0.3));
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
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.96f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.96f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.96f;
        class_0814 class_08142 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, 2.0);
        if (class_08142 != null && this.llIIlIlIlllIIllIlIlllIllI > class_08142.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) {
            this.llIIlIlIlllIIllIlIlllIllI += (class_08142.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl - this.llIIlIlIlllIIllIlIlllIllI) * 0.2;
            this.IIlIIlIlIlIllIIlIlIIIIlll += (class_08142.IIlIIlIlIlIllIIlIlIIIIlll - this.IIlIIlIlIlIllIIlIlIIIIlll) * 0.2;
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        }
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
    }
}

