package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2036
extends class_0323 {
    private float lllIIIllIIIIlllIlIIllIIll;

    public class_2036(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.IIIIIIIIlIllIIllIIlllIllI = this.IIIIIIIIlIllIIllIIlllIllI * (double)0.01f + d4;
        this.IIlIIlIlIlIllIIlIlIIIIlll = this.IIlIIlIlIlIllIIlIlIIIIlll * (double)0.01f + d5;
        this.llIIIlllIlllIlIllIIIIllIl = this.llIIIlllIlllIlIllIIIIllIl * (double)0.01f + d6;
        double d7 = d + (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.05f);
        d7 = d2 + (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.05f);
        d7 = d3 + (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.05f);
        this.lllIIIllIIIIlllIlIIllIIll = this.IllIIlllllllIIlIIlIIIIlIl;
        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = 1.0f;
        this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.IlIIIlIllIIIllIIIIlIIlIll = true;
        this.lllIlIIlIIIlIlIIIllIlllIl(48);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.lIllllIIlIIIlIllllllIIIll + f) / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll * (1.0f - f7 * f7 * 0.5f);
        super.lllIIIllIIIIlllIlIIllIIll(class_08682, f, f2, f3, f4, f5, f6);
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
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        float f2 = ((float)this.lIllllIIlIIIlIllllllIIIll + f) / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = super.lllIlIIlIIIlIlIIIllIlllIl(f);
        return f3 * f2 + (1.0f - f2);
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
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.96f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.96f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.96f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
    }
}

