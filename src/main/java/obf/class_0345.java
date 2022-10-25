package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0345
extends class_0323 {
    public class_0345(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        float f;
        this.IllIIIllIIIIlIlIlIllIIlll = f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.1f + 0.2f;
        this.lIIIIlIlIIlllllIIllIIlIII = f;
        this.llIIlllIllIllllIIIlIIIIII = f;
        this.lllIlIIlIIIlIlIIIllIlllIl(0);
        this.IlIIIIIllllllIIlllIllllll(0.02f, 0.02f);
        this.IllIIlllllllIIlIIlIIIIlIl *= this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.6f + 0.5f;
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.02f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.02f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.02f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(20.0 / (Math.random() * 0.8 + 0.2));
        this.IlIIIlIllIIIllIIIIlIIlIll = true;
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= 0.99;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.99;
        this.llIIIlllIlllIlIllIIIIllIl *= 0.99;
        if (this.IIIllIIlIIIIIIlIlIIllIIlI-- <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

