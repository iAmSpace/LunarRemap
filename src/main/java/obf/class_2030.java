package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2030
extends class_0323 {
    public class_2030(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2 - 0.125, d3, d4, d5, d6);
        this.IllIIIllIIIIlIlIlIllIIlll = 0.4f;
        this.lIIIIlIlIIlllllIIllIIlIII = 0.4f;
        this.llIIlllIllIllllIIIlIIIIII = 0.7f;
        this.lllIlIIlIIIlIlIIIllIlllIl(0);
        this.IlIIIIIllllllIIlllIllllll(0.01f, 0.01f);
        this.IllIIlllllllIIlIIlIIIIlIl *= this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.6f + 0.2f;
        this.IIIIIIIIlIllIIllIIlllIllI = d4 * 0.0;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5 * 0.0;
        this.llIIIlllIlllIlIllIIIIllIl = d6 * 0.0;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI-- <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

