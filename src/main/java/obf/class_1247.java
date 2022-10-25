package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1247
extends class_0339 {
    public class_1247(class_1334 class_13342) {
        super(class_13342);
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(double d, boolean bl) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        if (this.llIlllIlIIllIlIIIIllIIlIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(f, f2, 0.02f);
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.8f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.8f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.8f;
        } else if (this.lIIlIlllIllIlIlllIIIIIIII()) {
            this.lllIIIllIIIIlllIlIIllIIll(f, f2, 0.02f);
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIIIIIlIllIIllIIlllIllI *= 0.5;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.5;
            this.llIIIlllIlllIlIllIIIIllIl *= 0.5;
        } else {
            float f3 = 0.91f;
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                f3 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_((int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IlIIlllllIIlIlIlllllIllll), (int)(MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) - 1), (int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IllIIIIllIIllIllIlllIlIIl)).llllIIIIlIIIlIIIIIIlIllll * 0.91f;
            }
            float f4 = 0.16277136f / (f3 * f3 * f3);
            this.lllIIIllIIIIlllIlIIllIIll(f, f2, this.llllllIlIllllIlIlIlIIIIlI ? 0.1f * f4 : 0.02f);
            f3 = 0.91f;
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                f3 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_((int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IlIIlllllIIlIlIlllllIllll), (int)(MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) - 1), (int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IllIIIIllIIllIllIlllIlIIl)).llllIIIIlIIIlIIIIIIlIllll * 0.91f;
            }
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)f3;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)f3;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)f3;
        }
        this.IIIIlllIIlIllllllIllIIlll = this.IIIIIIlIIIIIIIIIIlIlIlIlI;
        double d = this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll;
        double d2 = this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl;
        float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2) * 4.0f;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        this.IIIIIIlIIIIIIIIIIlIlIlIlI += (f5 - this.IIIIIIlIIIIIIIIIIlIlIlIlI) * 0.4f;
        this.IllIlllIIIlllllIllIIlIlIl += this.IIIIIIlIIIIIIIIIIlIlIlIlI;
    }

    @Override
    public boolean h_() {
        return false;
    }
}

