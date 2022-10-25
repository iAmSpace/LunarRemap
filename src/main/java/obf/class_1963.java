package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1963
extends class_1327 {
    class_0339 lllIIIllIIIIlllIlIIllIIll;
    class_1965 lllIlIIlIIIlIlIIIllIlllIl;
    float IlIllllllIIlIIllllIIlIIIl;

    public class_1963(class_0339 class_03392, float f) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
        this.IlIllllllIIlIIllllIIlIIIl = f;
        this.lllIIIllIIIIlllIlIIllIIll(5);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            return false;
        }
        double d = this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl);
        return d >= 4.0 && d <= 16.0 ? (!this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI ? false : this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(5) == 0) : false;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        double d = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll - this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll;
        double d2 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl - this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl;
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2);
        this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI += d / (double)f * 0.5 * (double)0.8f + this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI * (double)0.2f;
        this.lllIIIllIIIIlllIlIIllIIll.llIIIlllIlllIlIllIIIIllIl += d2 / (double)f * 0.5 * (double)0.8f + this.lllIIIllIIIIlllIlIIllIIll.llIIIlllIlllIlIllIIIIllIl * (double)0.2f;
        this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll = this.IlIllllllIIlIIllllIIlIIIl;
    }
}

