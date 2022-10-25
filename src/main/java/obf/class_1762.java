package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1762
extends class_0323 {
    public class_1762(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.3f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = (float)Math.random() * 0.2f + 0.1f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.3f;
        this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = 1.0f;
        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        this.lllIlIIlIIIlIlIIIllIlllIl(19);
        this.IlIIIIIllllllIIlllIllllll(0.01f, 0.01f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.IIIllIllIIlIlIlIlIllllIIl = 0.0f;
        this.IIIIIIIIlIllIIllIIlllIllI = d4;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5;
        this.llIIIlllIlllIlIllIIIIllIl = d6;
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)this.IIIllIllIIlIlIlIlIllllIIl;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.98f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.98f;
        int n = 60 - this.IIIllIIlIIIIIIlIlIIllIIlI;
        float f = (float)n * 0.001f;
        this.IlIIIIIllllllIIlllIllllll(f, f);
        this.lllIlIIlIIIlIlIIIllIlllIl(19 + n % 4);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI-- <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

