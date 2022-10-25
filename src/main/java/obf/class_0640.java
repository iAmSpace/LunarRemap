package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0640
extends class_0323 {
    protected class_0640(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3);
        this.IIIllIIlIIIIIIlIlIIllIIlI = 4;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 0.25f;
        float f8 = f7 + 0.25f;
        float f9 = 0.125f;
        float f10 = f9 + 0.25f;
        float f11 = 7.1f * MathHelper.lllIIIllIIIIlllIlIIllIIll(((float)this.lIllllIIlIIIlIllllllIIIll + f - 1.0f) * 0.25f * (float)Math.PI);
        this.llIIllIllIlIIlIIllIllllll = 0.6f - ((float)this.lIllllIIlIIIlIllllllIIIll + f - 1.0f) * 0.25f * 0.5f;
        float f12 = (float)(this.llIIlIllIllllIlIIIIlIIlll + (this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll) * (double)f - IlIlllIIIIIIlIIllIIllIlll);
        float f13 = (float)(this.llIllllIlIllIIIlIllIIlIlI + (this.llIIlIlIlllIIllIlIlllIllI - this.llIllllIlIllIIIlIllIIlIlI) * (double)f - IlIlIIlIlIllIIlIlIIllIIIl);
        float f14 = (float)(this.lIlllIlllIlIIIIlllIlIlIIl + (this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl) * (double)f - lllllIlllIIllIlIIlIIIllII);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11, f8, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11, f8, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11, f7, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11, f7, f10);
    }
}

