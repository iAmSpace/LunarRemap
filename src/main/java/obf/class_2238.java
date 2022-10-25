package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2238
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_0744 IllIIlllllllIIlIIlIIIIlIl;
    public class_0744 IIIllIllIIlIlIlIlIllllIIl;
    public class_0744 IllIIIllIIIIlIlIlIllIIlll;
    public class_0744 lIIIIlIlIIlllllIIllIIlIII;
    public class_0744 llIIlllIllIllllIIIlIIIIII;
    public class_0744 llIIllIllIlIIlIIllIllllll;
    public class_0744 lllIIlIIIllllllIIIIlIlIlI;
    public class_0744 IlIlllIIIIIIlIIllIIllIlll;
    public class_0744 IlIlIIlIlIllIIlIlIIllIIIl;
    public class_0744 lllllIlllIIllIlIIlIIIllII;

    public class_2238() {
        float f = 0.0f;
        int n = 15;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 32, 4);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-4.0f, -4.0f, -8.0f, 8, 8, 8, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, n, -3.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 0, 0);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-3.0f, -3.0f, -3.0f, 6, 6, 6, f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, n, 0.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, 0, 12);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-5.0f, -4.0f, -6.0f, 10, 8, 12, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, n, 9.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 18, 0);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-4.0f, n, 2.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 18, 0);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(4.0f, n, 2.0f);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this, 18, 0);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-4.0f, n, 1.0f);
        this.llIIllIllIlIIlIIllIllllll = new class_0744(this, 18, 0);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(4.0f, n, 1.0f);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0744(this, 18, 0);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-4.0f, n, 0.0f);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_0744(this, 18, 0);
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(4.0f, n, 0.0f);
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_0744(this, 18, 0);
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(-4.0f, n, -1.0f);
        this.lllllIlllIIllIlIIlIIIllII = new class_0744(this, 18, 0);
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(4.0f, n, -1.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f6);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(f6);
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(f6);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
        float f7 = 0.7853982f;
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = -f7;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = f7;
        this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl = -f7 * 0.74f;
        this.llIIllIllIlIIlIIllIllllll.IllIIlllllllIIlIIlIIIIlIl = f7 * 0.74f;
        this.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl = -f7 * 0.74f;
        this.IlIlllIIIIIIlIIllIIllIlll.IllIIlllllllIIlIIlIIIIlIl = f7 * 0.74f;
        this.IlIlIIlIlIllIIlIlIIllIIIl.IllIIlllllllIIlIIlIIIIlIl = -f7;
        this.lllllIlllIIllIlIIlIIIllII.IllIIlllllllIIlIIlIIIIlIl = f7;
        float f8 = -0.0f;
        float f9 = 0.3926991f;
        this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = f9 * 2.0f + f8;
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = -f9 * 2.0f - f8;
        this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI = f9 * 1.0f + f8;
        this.llIIllIllIlIIlIIllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = -f9 * 1.0f - f8;
        this.lllIIlIIIllllllIIIIlIlIlI.IIIllIIlIIIIIIlIlIIllIIlI = -f9 * 1.0f + f8;
        this.IlIlllIIIIIIlIIllIIllIlll.IIIllIIlIIIIIIlIlIIllIIlI = f9 * 1.0f - f8;
        this.IlIlIIlIlIllIIlIlIIllIIIl.IIIllIIlIIIIIIlIlIIllIIlI = -f9 * 2.0f + f8;
        this.lllllIlllIIllIlIIlIIIllII.IIIllIIlIIIIIIlIlIIllIIlI = f9 * 2.0f - f8;
        float f10 = -(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f * 2.0f + 0.0f) * 0.4f) * f2;
        float f11 = -(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f2;
        float f12 = -(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f2;
        float f13 = -(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f2;
        float f14 = Math.abs(MathHelper.lllIIIllIIIIlllIlIIllIIll(f * 0.6662f + 0.0f) * 0.4f) * f2;
        float f15 = Math.abs(MathHelper.lllIIIllIIIIlllIlIIllIIll(f * 0.6662f + (float)Math.PI) * 0.4f) * f2;
        float f16 = Math.abs(MathHelper.lllIIIllIIIIlllIlIIllIIll(f * 0.6662f + 1.5707964f) * 0.4f) * f2;
        float f17 = Math.abs(MathHelper.lllIIIllIIIIlllIlIIllIIll(f * 0.6662f + 4.712389f) * 0.4f) * f2;
        this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI += f10;
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI += -f10;
        this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI += f11;
        this.llIIllIllIlIIlIIllIllllll.IIIllIIlIIIIIIlIlIIllIIlI += -f11;
        this.lllIIlIIIllllllIIIIlIlIlI.IIIllIIlIIIIIIlIlIIllIIlI += f12;
        this.IlIlllIIIIIIlIIllIIllIlll.IIIllIIlIIIIIIlIlIIllIIlI += -f12;
        this.IlIlIIlIlIllIIlIlIIllIIIl.IIIllIIlIIIIIIlIlIIllIIlI += f13;
        this.lllllIlllIIllIlIIlIIIllII.IIIllIIlIIIIIIlIlIIllIIlI += -f13;
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl += f14;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl += -f14;
        this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl += f15;
        this.llIIllIllIlIIlIIllIllllll.IllIIlllllllIIlIIlIIIIlIl += -f15;
        this.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl += f16;
        this.IlIlllIIIIIIlIIllIIllIlll.IllIIlllllllIIlIIlIIIIlIl += -f16;
        this.IlIlIIlIlIllIIlIlIIllIIIl.IllIIlllllllIIlIIlIIIIlIl += f17;
        this.lllllIlllIIllIlIIlIIIllII.IllIIlllllllIIlIIlIIIIlIl += -f17;
    }
}

