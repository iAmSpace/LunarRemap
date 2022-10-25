package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2196
extends class_0323 {
    private float lllIIIllIIIIlllIlIIllIIll;
    private double IIIlIllllIIIlllllIllIlIII;
    private double IIIIIllIlIllIlIlIIlIllIIl;
    private double lIIllIlIIlIIlllllIlIIllIl;

    public class_2196(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.IIIIIIIIlIllIIllIIlllIllI = d4;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5;
        this.llIIIlllIlllIlIllIIIIllIl = d6;
        this.IIIlIllllIIIlllllIllIlIII = this.IlIIlllllIIlIlIlllllIllll = d;
        this.IIIIIllIlIllIlIlIIlIllIIl = this.llIIlIlIlllIIllIlIlllIllI = d2;
        this.lIIllIlIIlIIlllllIlIIllIl = this.IllIIIIllIIllIllIlllIlIIl = d3;
        float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.6f + 0.4f;
        this.lllIIIllIIIIlllIlIIllIIll = this.IllIIlllllllIIlIIlIIIIlIl = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f + 0.5f;
        this.lIIIIlIlIIlllllIIllIIlIII = this.llIIlllIllIllllIIIlIIIIII = 1.0f * f;
        this.IllIIIllIIIIlIlIlIllIIlll = this.llIIlllIllIllllIIIlIIIIII;
        this.lIIIIlIlIIlllllIIllIIlIII *= 0.3f;
        this.IllIIIllIIIIlIlIlIllIIlll *= 0.9f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(Math.random() * 10.0) + 40;
        this.IlIIIlIllIIIllIIIIlIIlIll = true;
        this.lllIlIIlIIIlIlIIIllIlllIl((int)(Math.random() * 8.0));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.lIllllIIlIIIlIllllllIIIll + f) / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        f7 = 1.0f - f7;
        f7 *= f7;
        f7 = 1.0f - f7;
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll * f7;
        super.lllIIIllIIIIlllIlIIllIIll(class_08682, f, f2, f3, f4, f5, f6);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        int n = super.lllIIIllIIIIlllIlIIllIIll(f);
        float f2 = (float)this.lIllllIIlIIIlIllllllIIIll / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        f2 *= f2;
        f2 *= f2;
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n3 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n2 | n3 << 16;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        float f2 = super.lllIlIIlIIIlIlIIIllIlllIl(f);
        float f3 = (float)this.lIllllIIlIIIlIllllllIIIll / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        f3 = f3 * f3 * f3 * f3;
        return f2 * (1.0f - f3) + f3;
    }

    @Override
    public void s_() {
        float f;
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        float f2 = f = (float)this.lIllllIIlIIIlIllllllIIIll / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        f = -f + f * f * 2.0f;
        f = 1.0f - f;
        this.IlIIlllllIIlIlIlllllIllll = this.IIIlIllllIIIlllllIllIlIII + this.IIIIIIIIlIllIIllIIlllIllI * (double)f;
        this.llIIlIlIlllIIllIlIlllIllI = this.IIIIIllIlIllIlIlIIlIllIIl + this.IIlIIlIlIlIllIIlIlIIIIlll * (double)f + (double)(1.0f - f2);
        this.IllIIIIllIIllIllIlllIlIIl = this.lIIllIlIIlIIlllllIlIIllIl + this.llIIIlllIlllIlIllIIIIllIl * (double)f;
        if (this.lIllllIIlIIIlIllllllIIIll++ >= this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

