package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1985
extends class_0323 {
    private float lllIIIllIIIIlllIlIIllIIll;

    public class_1985(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.8f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.8f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.8f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.4f + 0.05f;
        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = 1.0f;
        this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
        this.IllIIlllllllIIlIIlIIIIlIl *= this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f + 0.2f;
        this.lllIIIllIIIIlllIlIIllIIll = this.IllIIlllllllIIlIIlIIIIlIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.IlIIIlIllIIIllIIIIlIIlIll = false;
        this.lllIlIIlIIIlIlIIIllIlllIl(49);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        float f2 = ((float)this.lIllllIIlIIIlIllllllIIIll + f) / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        int n = super.lllIIIllIIIIlllIlIIllIIll(f);
        int n2 = 240;
        int n3 = n >> 16 & 0xFF;
        return n2 | n3 << 16;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return 1.0f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.lIllllIIlIIIlIllllllIIIll + f) / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll * (1.0f - f7 * f7);
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
        float f = (float)this.lIllllIIlIIIlIllllllIIIll / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (this.IlllIIlllllllIIllIlIllllI.nextFloat() > f) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("smoke", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        }
        this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.03;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.999f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.999f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.999f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
    }
}

