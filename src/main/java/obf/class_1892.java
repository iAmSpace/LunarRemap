package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1892
extends class_0323 {
    private int lllIIIllIIIIlllIlIIllIIll = 160;
    private boolean IIIlIllllIIIlllllIllIlIII;
    private boolean IIIIIllIlIllIlIlIIlIllIIl;
    private final class_1462 lIIllIlIIlIIlllllIlIIllIl;
    private float lIIlllIIlIlIlIIIlIlllIIll;
    private float IlIIlIIlllllIlIIlIlIlIlIl;
    private float lIlIIIllIIllIIlIllllllIll;
    private boolean lIlIIlllllIlllllIlIIIllll;

    public class_1892(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6, class_1462 class_14622) {
        super(class_13342, d, d2, d3);
        this.IIIIIIIIlIllIIllIIlllIllI = d4;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5;
        this.llIIIlllIlllIlIllIIIIllIl = d6;
        this.lIIllIlIIlIIlllllIlIIllIl = class_14622;
        this.IllIIlllllllIIlIIlIIIIlIl *= 0.75f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 48 + this.IlllIIlllllllIIllIlIllllI.nextInt(12);
        this.IlIIIlIllIIIllIIIIlIIlIll = false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIIlIllllIIIlllllIllIlIII = bl;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.IIIIIllIlIllIlIlIIlIllIIl = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        float f = (float)((n & 0xFF0000) >> 16) / 255.0f;
        float f2 = (float)((n & 0xFF00) >> 8) / 255.0f;
        float f3 = (float)((n & 0xFF) >> 0) / 255.0f;
        float f4 = 1.0f;
        this.lllIlIIlIIIlIlIIIllIlllIl(f * f4, f2 * f4, f3 * f4);
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.lIIlllIIlIlIlIIIlIlllIIll = (float)((n & 0xFF0000) >> 16) / 255.0f;
        this.IlIIlIIlllllIlIIlIlIlIlIl = (float)((n & 0xFF00) >> 8) / 255.0f;
        this.lIlIIIllIIllIIlIllllllIll = (float)((n & 0xFF) >> 0) / 255.0f;
        this.lIlIIlllllIlllllIlIIIllll = true;
    }

    @Override
    public class_1974 IllIIIllIIIIlIlIlIllIIlll() {
        return null;
    }

    @Override
    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!this.IIIIIllIlIllIlIlIIlIllIIl || this.lIllllIIlIIIlIllllllIIIll < this.IIIllIIlIIIIIIlIlIIllIIlI / 3 || (this.lIllllIIlIIIlIllllllIIIll + this.IIIllIIlIIIIIIlIlIIllIIlI) / 3 % 2 == 0) {
            super.lllIIIllIIIIlllIlIIllIIll(class_08682, f, f2, f3, f4, f5, f6);
        }
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        if (this.lIllllIIlIIIlIllllllIIIll++ >= this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        if (this.lIllllIIlIIIlIllllllIIIll > this.IIIllIIlIIIIIIlIlIIllIIlI / 2) {
            this.IlIIIIIllllllIIlllIllllll(1.0f - ((float)this.lIllllIIlIIIlIllllllIIIll - (float)(this.IIIllIIlIIIIIIlIlIIllIIlI / 2)) / (float)this.IIIllIIlIIIIIIlIlIIllIIlI);
            if (this.lIlIIlllllIlllllIlIIIllll) {
                this.IllIIIllIIIIlIlIlIllIIlll += (this.lIIlllIIlIlIlIIIlIlllIIll - this.IllIIIllIIIIlIlIlIllIIlll) * 0.2f;
                this.lIIIIlIlIIlllllIIllIIlIII += (this.IlIIlIIlllllIlIIlIlIlIlIl - this.lIIIIlIlIIlllllIIllIIlIII) * 0.2f;
                this.llIIlllIllIllllIIIlIIIIII += (this.lIlIIIllIIllIIlIllllllIll - this.llIIlllIllIllllIIIlIIIIII) * 0.2f;
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll + (7 - this.lIllllIIlIIIlIllllllIIIll * 8 / this.IIIllIIlIIIIIIlIlIIllIIlI));
        this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.004;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.91f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.91f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.91f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
        if (this.IIIlIllllIIIlllllIllIlIII && this.lIllllIIlIIIlIllllllIIIll < this.IIIllIIlIIIIIIlIlIIllIIlI / 2 && (this.lIllllIIlIIIlIllllllIIIll + this.IIIllIIlIIIIIIlIlIIllIIlI) % 2 == 0) {
            class_1892 class_18922 = new class_1892(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, 0.0, 0.0, 0.0, this.lIIllIlIIlIIlllllIlIIllIl);
            class_18922.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII);
            class_18922.lIllllIIlIIIlIllllllIIIll = class_18922.IIIllIIlIIIIIIlIlIIllIIlI / 2;
            if (this.lIlIIlllllIlllllIlIIIllll) {
                class_18922.lIlIIlllllIlllllIlIIIllll = true;
                class_18922.lIIlllIIlIlIlIIIlIlllIIll = this.lIIlllIIlIlIlIIIlIlllIIll;
                class_18922.IlIIlIIlllllIlIIlIlIlIlIl = this.IlIIlIIlllllIlIIlIlIlIlIl;
                class_18922.lIlIIIllIIllIIlIllllllIll = this.lIlIIIllIIllIIlIllllllIll;
            }
            class_18922.IIIIIllIlIllIlIlIIlIllIIl = this.IIIIIllIlIllIlIlIIlIllIIl;
            this.lIIllIlIIlIIlllllIlIIllIl.lllIIIllIIIIlllIlIIllIIll(class_18922);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        return 0xF000F0;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return 1.0f;
    }
}

