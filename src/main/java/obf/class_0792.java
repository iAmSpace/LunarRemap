package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0792
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_0744 IllIIlllllllIIlIIlIIIIlIl;
    public class_0744 IIIllIllIIlIlIlIlIllllIIl;
    public class_0744 IllIIIllIIIIlIlIlIllIIlll;
    public class_0744 lIIIIlIlIIlllllIIllIIlIII;

    public class_0792() {
        float f = 4.0f;
        float f2 = 0.0f;
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, 0, 0).lllIlIIlIIIlIlIIIllIlllIl(64, 64);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 - 0.5f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f, 0.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 32, 0).lllIlIIlIIIlIlIIIllIlllIl(64, 64);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 12, 2, 2, f2 - 0.5f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f + 9.0f - 7.0f, 0.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 32, 0).lllIlIIlIIIlIlIIIllIlllIl(64, 64);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 12, 2, 2, f2 - 0.5f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f + 9.0f - 7.0f, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 0, 16).lllIlIIlIIIlIlIIIllIlllIl(64, 64);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-5.0f, -10.0f, -5.0f, 10, 10, 10, f2 - 0.5f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f + 9.0f, 0.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 0, 36).lllIlIIlIIIlIlIIIllIlllIl(64, 64);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-6.0f, -12.0f, -6.0f, 12, 12, 12, f2 - 0.5f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f + 20.0f, 0.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f * 0.25f;
        float f7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI);
        float f8 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI);
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = 1.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = -1.0f;
        this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f + this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI;
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = (float)Math.PI + this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl = f8 * 5.0f;
        this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll = -f7 * 5.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl = -f8 * 5.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IlIIIIIllllllIIlllIllllll = f7 * 5.0f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
    }
}

