package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2229
extends class_0323 {
    public class_2229(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.3f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = (float)Math.random() * 0.2f + 0.1f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.3f;
        this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = 1.0f;
        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        this.lllIlIIlIIIlIlIIIllIlllIl(19 + this.IlllIIlllllllIIllIlIllllI.nextInt(4));
        this.IlIIIIIllllllIIlllIllllll(0.01f, 0.01f);
        this.IIIllIllIIlIlIlIlIllllIIl = 0.06f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void s_() {
        double d;
        class_1855 class_18552;
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)this.IIIllIllIIlIlIlIlIllllIIl;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.98f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.98f;
        if (this.IIIllIIlIIIIIIlIlIIllIIlI-- <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            if (Math.random() < 0.5) {
                this.IIIIlIIlIIIllIIIIllIIIlII();
            }
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
        if (((class_18552 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).lIllllIIlIIIlIllllllIIIll()).lllIIIllIIIIlllIlIIllIIll() || class_18552.lllIlIIlIIIlIlIIIllIlllIl()) && this.llIIlIlIlllIIllIlIlllIllI < (d = (double)((float)(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI) + 1) - class_0816.IllIIlllllllIIlIIlIIIIlIl(this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)))))) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

