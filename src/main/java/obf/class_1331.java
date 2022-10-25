package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1331
extends class_0323 {
    private Block lllIIIllIIIIlllIlIIllIIll;

    public class_1331(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6, Block class_05492, int n) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
        this.lllIIIllIIIIlllIlIIllIIll(class_05492.lllIIIllIIIIlllIlIIllIIll(0, n));
        this.IIIllIllIIlIlIlIlIllllIIl = class_05492.IIIIlIllIlIIlIIlIllIlIlll;
        this.llIIlllIllIllllIIIlIIIIII = 0.6f;
        this.lIIIIlIlIIlllllIIllIIlIII = 0.6f;
        this.IllIIIllIIIIlIlIlIllIIlll = 0.6f;
        this.IllIIlllllllIIlIIlIIIIlIl /= 2.0f;
    }

    public class_1331 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.lllIIIllIIIIlllIlIIllIIll == Blocks.IlIllllllIIlIIllllIIlIIIl) {
            return this;
        }
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII((class_1843)this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3);
        this.IllIIIllIIIIlIlIlIllIIlll *= (float)(n4 >> 16 & 0xFF) / 255.0f;
        this.lIIIIlIlIIlllllIIllIIlIII *= (float)(n4 >> 8 & 0xFF) / 255.0f;
        this.llIIlllIllIllllIIIlIIIIII *= (float)(n4 & 0xFF) / 255.0f;
        return this;
    }

    public class_1331 lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllIIIllIIIIlllIlIIllIIll == Blocks.IlIllllllIIlIIllllIIlIIIl) {
            return this;
        }
        int n2 = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n);
        this.IllIIIllIIIIlIlIlIllIIlll *= (float)(n2 >> 16 & 0xFF) / 255.0f;
        this.lIIIIlIlIIlllllIIllIIlIII *= (float)(n2 >> 8 & 0xFF) / 255.0f;
        this.llIIlllIllIllllIIIlIIIIII *= (float)(n2 & 0xFF) / 255.0f;
        return this;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII / 4.0f) / 16.0f;
        float f8 = f7 + 0.015609375f;
        float f9 = ((float)this.IlIllllllIIlIIllllIIlIIIl + this.IlIIIIIllllllIIlllIllllll / 4.0f) / 16.0f;
        float f10 = f9 + 0.015609375f;
        float f11 = 0.1f * this.IllIIlllllllIIlIIlIIIIlIl;
        if (this.lllIIlIIIllllllIIIIlIlIlI != null) {
            f7 = this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII / 4.0f * 16.0f);
            f8 = this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll((this.lIlllIlllIIIIlIIlllIllIII + 1.0f) / 4.0f * 16.0f);
            f9 = this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll / 4.0f * 16.0f);
            f10 = this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl((this.IlIIIIIllllllIIlllIllllll + 1.0f) / 4.0f * 16.0f);
        }
        float f12 = (float)(this.llIIlIllIllllIlIIIIlIIlll + (this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll) * (double)f - IlIlllIIIIIIlIIllIIllIlll);
        float f13 = (float)(this.llIllllIlIllIIIlIllIIlIlI + (this.llIIlIlIlllIIllIlIlllIllI - this.llIllllIlIllIIIlIllIIlIlI) * (double)f - IlIlIIlIlIllIIlIlIIllIIIl);
        float f14 = (float)(this.lIlllIlllIlIIIIlllIlIlIIl + (this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl) * (double)f - lllllIlllIIllIlIIlIIIllII);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11, f7, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11, f7, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11, f8, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11, f8, f10);
    }
}

