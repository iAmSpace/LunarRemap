package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1111
extends class_0323 {
    private class_1855 lllIIIllIIIIlllIlIIllIIll;
    private int IIIlIllllIIIlllllIllIlIII;

    public class_1111(class_1334 class_13342, double d, double d2, double d3, class_1855 class_18552) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        if (class_18552 == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            this.IllIIIllIIIIlIlIlIllIIlll = 0.0f;
            this.lIIIIlIlIIlllllIIllIIlIII = 0.0f;
            this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        } else {
            this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
            this.lIIIIlIlIIlllllIIllIIlIII = 0.0f;
            this.llIIlllIllIllllIIIlIIIIII = 0.0f;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(113);
        this.IlIIIIIllllllIIlllIllllll(0.01f, 0.01f);
        this.IIIllIllIIlIlIlIlIllllIIl = 0.06f;
        this.lllIIIllIIIIlllIlIIllIIll = class_18552;
        this.IIIlIllllIIIlllllIllIlIII = 40;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        return this.lllIIIllIIIIlllIlIIllIIll == class_1855.IllIIlllllllIIlIIlIIIIlIl ? super.lllIIIllIIIIlllIlIIllIIll(f) : 257;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return this.lllIIIllIIIIlllIlIIllIIll == class_1855.IllIIlllllllIIlIIlIIIIlIl ? super.lllIlIIlIIIlIlIIIllIlllIl(f) : 1.0f;
    }

    @Override
    public void s_() {
        double d;
        class_1855 class_18552;
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        if (this.lllIIIllIIIIlllIlIIllIIll == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            this.IllIIIllIIIIlIlIlIllIIlll = 0.2f;
            this.lIIIIlIlIIlllllIIllIIlIII = 0.3f;
            this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        } else {
            this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
            this.lIIIIlIlIIlllllIIllIIlIII = 16.0f / (float)(40 - this.IIIlIllllIIIlllllIllIlIII + 16);
            this.llIIlllIllIllllIIIlIIIIII = 4.0f / (float)(40 - this.IIIlIllllIIIlllllIllIlIII + 8);
        }
        this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)this.IIIllIllIIlIlIlIlIllllIIl;
        if (this.IIIlIllllIIIlllllIllIlIII-- > 0) {
            this.IIIIIIIIlIllIIllIIlllIllI *= 0.02;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.02;
            this.llIIIlllIlllIlIllIIIIllIl *= 0.02;
            this.lllIlIIlIIIlIlIIIllIlllIl(113);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl(112);
        }
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.98f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.98f;
        if (this.IIIllIIlIIIIIIlIlIIllIIlI-- <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            if (this.lllIIIllIIIIlllIlIIllIIll == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                this.IIIIlIIlIIIllIIIIllIIIlII();
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("splash", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, 0.0, 0.0, 0.0);
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl(114);
            }
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
        if (((class_18552 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).lIllllIIlIIIlIllllllIIIll()).lllIIIllIIIIlllIlIIllIIll() || class_18552.lllIlIIlIIIlIlIIIllIlllIl()) && this.llIIlIlIlllIIllIlIlllIllI < (d = (double)((float)(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI) + 1) - class_0816.IllIIlllllllIIlIIlIIIIlIl(this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)))))) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

