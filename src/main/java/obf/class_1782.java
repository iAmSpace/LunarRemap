package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1782
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_0744 IllIIlllllllIIlIIlIIIIlIl;
    public class_0744 IIIllIllIIlIlIlIlIllllIIl;
    public class_0744 IllIIIllIIIIlIlIlIllIIlll;
    public class_0744 lIIIIlIlIIlllllIIllIIlIII;
    public class_0744 llIIlllIllIllllIIIlIIIIII;

    public class_1782(float f) {
        this(f, 0.0f, 64, 64);
    }

    public class_1782(float f, float f2, int n, int n2) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f2, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0, 0).lllIIIllIIIIlllIlIIllIIll(-4.0f, -10.0f, -4.0f, 8, 10, 8, f);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(0.0f, f2 - 2.0f, 0.0f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(24, 0).lllIIIllIIIIlllIlIIllIIll(-1.0f, -1.0f, -6.0f, 2, 4, 2, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f2, 0.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(16, 20).lllIIIllIIIIlllIlIIllIIll(-4.0f, 0.0f, -3.0f, 8, 12, 6, f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, 38).lllIIIllIIIIlllIlIIllIIll(-4.0f, 0.0f, -3.0f, 8, 18, 6, f + 0.5f);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f2 + 2.0f, 0.0f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(44, 22).lllIIIllIIIIlllIlIIllIIll(-8.0f, -2.0f, -2.0f, 4, 8, 4, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(44, 22).lllIIIllIIIIlllIlIIllIIll(4.0f, -2.0f, -2.0f, 4, 8, 4, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(40, 38).lllIIIllIIIIlllIlIIllIIll(-4.0f, 2.0f, -2.0f, 8, 4, 4, f);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 0, 22).lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-2.0f, 12.0f + f2, 0.0f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 0, 22).lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIllIIlIlIlIlIllllIIl = true;
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(2.0f, 12.0f + f2, 0.0f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
        this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII = 3.0f;
        this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll = -1.0f;
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = -0.75f;
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.4f * f2 * 0.5f;
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.4f * f2 * 0.5f;
        this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
    }
}

