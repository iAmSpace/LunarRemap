package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0727
extends class_0323 {
    public class_0727(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = 1.0f;
        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        this.lllIlIIlIIIlIlIIIllIlllIl(32);
        this.IlIIIIIllllllIIlllIllllll(0.02f, 0.02f);
        this.IllIIlllllllIIlIIlIIIIlIl *= this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.6f + 0.2f;
        this.IIIIIIIIlIllIIllIIlllIllI = d4 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.llIIIlllIlllIlIllIIIIllIl = d6 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.IIlIIlIlIlIllIIlIlIIIIlll += 0.002;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.85f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.85f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.85f;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI-- <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

