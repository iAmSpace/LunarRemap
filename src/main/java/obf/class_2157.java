package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2157
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this).lllIIIllIIIIlllIlIIllIIll(0, 0).lllIIIllIIIIlllIlIIllIIll(-6.0f, -5.0f, 0.0f, 6, 10, 0);
    public class_0744 IllIIlllllllIIlIIlIIIIlIl = new class_0744(this).lllIIIllIIIIlllIlIIllIIll(16, 0).lllIIIllIIIIlllIlIIllIIll(0.0f, -5.0f, 0.0f, 6, 10, 0);
    public class_0744 IIIllIllIIlIlIlIlIllllIIl = new class_0744(this).lllIIIllIIIIlllIlIIllIIll(0, 10).lllIIIllIIIIlllIlIIllIIll(0.0f, -4.0f, -0.99f, 5, 8, 1);
    public class_0744 IllIIIllIIIIlIlIlIllIIlll = new class_0744(this).lllIIIllIIIIlllIlIIllIIll(12, 10).lllIIIllIIIIlllIlIIllIIll(0.0f, -4.0f, -0.01f, 5, 8, 1);
    public class_0744 lIIIIlIlIIlllllIIllIIlIII = new class_0744(this).lllIIIllIIIIlllIlIIllIIll(24, 10).lllIIIllIIIIlllIlIIllIIll(0.0f, -4.0f, 0.0f, 5, 8, 0);
    public class_0744 llIIlllIllIllllIIIlIIIIII = new class_0744(this).lllIIIllIIIIlllIlIIllIIll(24, 10).lllIIIllIIIIlllIlIIllIIll(0.0f, -4.0f, 0.0f, 5, 8, 0);
    public class_0744 llIIllIllIlIIlIIllIllllll = new class_0744(this).lllIIIllIIIIlllIlIIllIIll(12, 0).lllIIIllIIIIlllIlIIllIIll(-1.0f, -5.0f, 0.0f, 2, 10, 0);

    public class_2157() {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, -1.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 1.0f);
        this.llIIllIllIlIIlIIllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = 1.5707964f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        float f7 = (MathHelper.lllIIIllIIIIlllIlIIllIIll(f * 0.02f) * 0.1f + 1.25f) * f4;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = (float)Math.PI + f7;
        this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = -f7;
        this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI = f7;
        this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = -f7;
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = f7 - f7 * 2.0f * f2;
        this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI = f7 - f7 * 2.0f * f3;
        this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIIIllIIIIlllIlIIllIIll(f7);
        this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIIIllIIIIlllIlIIllIIll(f7);
        this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIIIllIIIIlllIlIIllIIll(f7);
        this.llIIlllIllIllllIIIlIIIIII.IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIIIllIIIIlllIlIIllIIll(f7);
    }
}

