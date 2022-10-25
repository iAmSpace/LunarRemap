package obf;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2265
extends class_0323 {
    public class_2265(class_1334 class_13342, double d, double d2, double d3, Item class_06112) {
        this(class_13342, d, d2, d3, class_06112, 0);
    }

    public class_2265(class_1334 class_13342, double d, double d2, double d3, Item class_06112, int n) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_06112.IlIllllllIIlIIllllIIlIIIl(n));
        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = 1.0f;
        this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
        this.IIIllIllIIlIlIlIlIllllIIl = Blocks.IIIlIllllIIIlllllIllIlIII.IIIIlIllIlIIlIIlIllIlIlll;
        this.IllIIlllllllIIlIIlIIIIlIl /= 2.0f;
    }

    public class_2265(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6, Item class_06112, int n) {
        this(class_13342, d, d2, d3, class_06112, n);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.1f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.1f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.1f;
        this.IIIIIIIIlIllIIllIIlllIllI += d4;
        this.IIlIIlIlIlIllIIlIlIIIIlll += d5;
        this.llIIIlllIlllIlIllIIIIllIl += d6;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 2;
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

