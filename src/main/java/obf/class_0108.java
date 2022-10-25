package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0108 {
    private class_1965 lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;

    public class_0108(class_1965 class_19652) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19652;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        double d = this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll - this.lllIIIllIIIIlllIlIIllIIll.llIIlIllIllllIlIIIIlIIlll;
        double d2 = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl - this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl;
        if (d * d + d2 * d2 > 2.500000277905201E-7) {
            this.lllIIIllIIIIlllIlIIllIIll.lllllIllllIIIIllIIlIlIlII = this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll;
            this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllllIllllIIIIllIIlIlIlII, this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl, 75.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl = 0;
        } else {
            float f = 75.0f;
            if (Math.abs(this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl - this.IlIllllllIIlIIllllIIlIIIl) > 15.0f) {
                this.lllIlIIlIIIlIlIIIllIlllIl = 0;
                this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl;
            } else {
                ++this.lllIlIIlIIIlIlIIIllIlllIl;
                boolean bl = true;
                if (this.lllIlIIlIIIlIlIIIllIlllIl > 10) {
                    f = Math.max(1.0f - (float)(this.lllIlIIlIIIlIlIIIllIlllIl - 10) / 10.0f, 0.0f) * 75.0f;
                }
            }
            this.lllIIIllIIIIlllIlIIllIIll.lllllIllllIIIIllIIlIlIlII = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl, this.lllIIIllIIIIlllIlIIllIIll.lllllIllllIIIIllIIlIlIlII, f);
        }
    }

    private float lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        float f4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(f - f2);
        if (f4 < -f3) {
            f4 = -f3;
        }
        if (f4 >= f3) {
            f4 = f3;
        }
        return f - f4;
    }
}

