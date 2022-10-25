package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0500
extends class_1382 {
    private class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0744 IllIIlllllllIIlIIlIIIIlIl;
    private class_0744 IIIllIllIIlIlIlIlIllllIIl;
    private class_0744 IllIIIllIIIIlIlIlIllIIlll;
    private class_0744 lIIIIlIlIIlllllIIllIIlIII;
    private class_0744 llIIlllIllIllllIIIlIIIIII;

    public class_0500() {
        this.IlIIIIIllllllIIlllIllllll = 64;
        this.lIllllIIlIIIlIllllllIIIll = 64;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        class_0744 class_07442 = new class_0744(this, 24, 0);
        class_07442.lllIIIllIIIIlllIlIIllIIll(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_07442);
        class_0744 class_07443 = new class_0744(this, 24, 0);
        class_07443.IIIllIllIIlIlIlIlIllllIIl = true;
        class_07443.lllIIIllIIIIlllIlIIllIIll(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_07443);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 0, 16);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, 34).lllIIIllIIIIlllIlIIllIIll(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, 42, 0);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 24, 16);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-12.0f, 1.0f, 1.5f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 42, 0);
        this.IllIIIllIIIIlIlIlIllIIlll.IIIllIllIIlIlIlIlIllllIIl = true;
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this, 24, 16);
        this.llIIlllIllIllllIIIlIIIIII.IIIllIllIIlIlIlIlIllllIIl = true;
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(12.0f, 1.0f, 1.5f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII);
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return 36;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        class_0453 class_04532 = (class_0453)class_15212;
        if (class_04532.IlIIIIIllllllIIlllIllllll()) {
            float f7 = 57.295776f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = (float)Math.PI - f4 / 57.295776f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl = (float)Math.PI;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, -2.0f, 0.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-3.0f, 0.0f, 3.0f);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(3.0f, 0.0f, 3.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = (float)Math.PI;
            this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = -0.15707964f;
            this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI = -1.2566371f;
            this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = -1.7278761f;
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll;
            this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = -this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI;
            this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI = -this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI;
        } else {
            float f8 = 57.295776f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = 0.7853982f + MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.1f) * 0.15f;
            this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
            this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 1.3f) * (float)Math.PI * 0.25f;
            this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = -this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI;
            this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI * 0.5f;
            this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI = -this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI * 0.5f;
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
    }
}

