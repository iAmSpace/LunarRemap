package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2140
extends class_1382 {
    private class_0744[] IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0744[] IllIIlllllllIIlIIlIIIIlIl;

    public class_2140() {
        this.IlIIIIIllllllIIlllIllllll = 64;
        this.lIllllIIlIIIlIllllllIIIll = 64;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744[3];
        this.IIIllIIlIIIIIIlIlIIllIIlI[0] = new class_0744(this, 0, 16);
        this.IIIllIIlIIIIIIlIlIIllIIlI[0].lllIIIllIIIIlllIlIIllIIll(-10.0f, 3.9f, -0.5f, 20, 3, 3);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1] = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].lllIIIllIIIIlllIlIIllIIll(-2.0f, 6.9f, -0.5f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].lllIIIllIIIIlllIlIIllIIll(0, 22).lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 3, 10, 3);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].lllIIIllIIIIlllIlIIllIIll(24, 22).lllIIIllIIIIlllIlIIllIIll(-4.0f, 1.5f, 0.5f, 11, 2, 2);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].lllIIIllIIIIlllIlIIllIIll(24, 22).lllIIIllIIIIlllIlIIllIIll(-4.0f, 4.0f, 0.5f, 11, 2, 2);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].lllIIIllIIIIlllIlIIllIIll(24, 22).lllIIIllIIIIlllIlIIllIIll(-4.0f, 6.5f, 0.5f, 11, 2, 2);
        this.IIIllIIlIIIIIIlIlIIllIIlI[2] = new class_0744(this, 12, 22);
        this.IIIllIIlIIIIIIlIlIIllIIlI[2].lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 3, 6, 3);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744[3];
        this.IllIIlllllllIIlIIlIIIIlIl[0] = new class_0744(this, 0, 0);
        this.IllIIlllllllIIlIIlIIIIlIl[0].lllIIIllIIIIlllIlIIllIIll(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.IllIIlllllllIIlIIlIIIIlIl[1] = new class_0744(this, 32, 0);
        this.IllIIlllllllIIlIIlIIIIlIl[1].lllIIIllIIIIlllIlIIllIIll(-4.0f, -4.0f, -4.0f, 6, 6, 6);
        this.IllIIlllllllIIlIIlIIIIlIl[1].IlIllllllIIlIIllllIIlIIIl = -8.0f;
        this.IllIIlllllllIIlIIlIIIIlIl[1].lIlllIlllIIIIlIIlllIllIII = 4.0f;
        this.IllIIlllllllIIlIIlIIIIlIl[2] = new class_0744(this, 32, 0);
        this.IllIIlllllllIIlIIlIIIIlIl[2].lllIIIllIIIIlllIlIIllIIll(-4.0f, -4.0f, -4.0f, 6, 6, 6);
        this.IllIIlllllllIIlIIlIIIIlIl[2].IlIllllllIIlIIllllIIlIIIl = 10.0f;
        this.IllIIlllllllIIlIIlIIIIlIl[2].lIlllIlllIIIIlIIlllIllIII = 4.0f;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return 32;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        for (class_0744 class_07442 : this.IllIIlllllllIIlIIlIIIIlIl) {
            class_07442.lllIIIllIIIIlllIlIIllIIll(f6);
        }
        for (class_0744 class_07442 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            class_07442.lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        float f7 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.1f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].lIllllIIlIIIlIllllllIIIll = (0.065f + 0.05f * f7) * (float)Math.PI;
        this.IIIllIIlIIIIIIlIlIIllIIlI[2].lllIIIllIIIIlllIlIIllIIll(-2.0f, 6.9f + MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI[1].lIllllIIlIIIlIllllllIIIll) * 10.0f, -0.5f + MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI[1].lIllllIIlIIIlIllllllIIIll) * 10.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[2].lIllllIIlIIIlIllllllIIIll = (0.265f + 0.1f * f7) * (float)Math.PI;
        this.IllIIlllllllIIlIIlIIIIlIl[0].IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.IllIIlllllllIIlIIlIIIIlIl[0].lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        class_0590 class_05902 = (class_0590)class_19652;
        for (int i = 1; i < 3; ++i) {
            this.IllIIlllllllIIlIIlIIIIlIl[i].IIIllIIlIIIIIIlIlIIllIIlI = (class_05902.lllIIIllIIIIlllIlIIllIIll(i - 1) - class_19652.lllllIllllIIIIllIIlIlIlII) / 57.295776f;
            this.IllIIlllllllIIlIIlIIIIlIl[i].lIllllIIlIIIlIllllllIIIll = class_05902.lllIlIIlIIIlIlIIIllIlllIl(i - 1) / 57.295776f;
        }
    }
}

