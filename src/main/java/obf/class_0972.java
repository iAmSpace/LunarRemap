package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0972
extends class_0323 {
    public class_0972(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.IIIIIIIIlIllIIllIIlllIllI = d4 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.llIIIlllIlllIlIllIIIIllIl = d6 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.lIIIIlIlIIlllllIIllIIlIII = this.llIIlllIllIllllIIIlIIIIII = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.3f + 0.7f;
        this.IllIIIllIIIIlIlIlIllIIlll = this.llIIlllIllIllllIIIlIIIIII;
        this.IllIIlllllllIIlIIlIIIIlIl = this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IlllIIlllllllIIllIlIllllI.nextFloat() * 6.0f + 1.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(16.0 / ((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.8 + 0.2)) + 2;
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
        this.IIlIIlIlIlIllIIlIlIIIIlll += 0.004;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.9f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.9f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.9f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
    }
}

