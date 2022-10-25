package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2056
extends class_0323 {
    private float lllIIIllIIIIlllIlIIllIIll;
    private double IIIlIllllIIIlllllIllIlIII;
    private double IIIIIllIlIllIlIlIIlIllIIl;
    private double lIIllIlIIlIIlllllIlIIllIl;

    public class_2056(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.IIIIIIIIlIllIIllIIlllIllI = d4;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5;
        this.llIIIlllIlllIlIllIIIIllIl = d6;
        this.IIIlIllllIIIlllllIllIlIII = this.IlIIlllllIIlIlIlllllIllll = d;
        this.IIIIIllIlIllIlIlIIlIllIIl = this.llIIlIlIlllIIllIlIlllIllI = d2;
        this.lIIllIlIIlIIlllllIlIIllIl = this.IllIIIIllIIllIllIlllIlIIl = d3;
        float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.6f + 0.4f;
        this.lllIIIllIIIIlllIlIIllIIll = this.IllIIlllllllIIlIIlIIIIlIl = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.5f + 0.2f;
        this.lIIIIlIlIIlllllIIllIIlIII = this.llIIlllIllIllllIIIlIIIIII = 1.0f * f;
        this.IllIIIllIIIIlIlIlIllIIlll = this.llIIlllIllIllllIIIlIIIIII;
        this.lIIIIlIlIIlllllIIllIIlIII *= 0.9f;
        this.IllIIIllIIIIlIlIlIllIIlll *= 0.9f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(Math.random() * 10.0) + 30;
        this.IlIIIlIllIIIllIIIIlIIlIll = true;
        this.lllIlIIlIIIlIlIIIllIlllIl((int)(Math.random() * 26.0 + 1.0 + 224.0));
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
        f3 *= f3;
        f3 *= f3;
        return f2 * (1.0f - f3) + f3;
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        float f = (float)this.lIllllIIlIIIlIllllllIIIll / (float)this.IIIllIIlIIIIIIlIlIIllIIlI;
        f = 1.0f - f;
        float f2 = 1.0f - f;
        f2 *= f2;
        f2 *= f2;
        this.IlIIlllllIIlIlIlllllIllll = this.IIIlIllllIIIlllllIllIlIII + this.IIIIIIIIlIllIIllIIlllIllI * (double)f;
        this.llIIlIlIlllIIllIlIlllIllI = this.IIIIIllIlIllIlIlIIlIllIIl + this.IIlIIlIlIlIllIIlIlIIIIlll * (double)f - (double)(f2 * 1.2f);
        this.IllIIIIllIIllIllIlllIlIIl = this.lIIllIlIIlIIlllllIlIIllIl + this.llIIIlllIlllIlIllIIIIllIl * (double)f;
        if (this.lIllllIIlIIIlIllllllIIIll++ >= this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

