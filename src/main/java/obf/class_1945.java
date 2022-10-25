package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1945
extends class_1382 {
    class_0744[] IIIllIIlIIIIIIlIlIIllIIlI = new class_0744[8];
    class_0744 IllIIlllllllIIlIIlIIIIlIl;

    public class_1945() {
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
            int n = 0;
            int n2 = i;
            if (i == 2) {
                n = 24;
                n2 = 10;
            } else if (i == 3) {
                n = 24;
                n2 = 19;
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI[i] = new class_0744(this, n, n2);
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].lllIIIllIIIIlllIlIIllIIll(-4.0f, 16 + i, -4.0f, 8, 1, 8);
        }
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 0, 16);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        class_0882 class_08822 = (class_0882)class_19652;
        float f4 = class_08822.IlIllllllIIlIIllllIIlIIIl + (class_08822.lllIlIIlIIIlIlIIIllIlllIl - class_08822.IlIllllllIIlIIllllIIlIIIl) * f3;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].lIlllIlllIIIIlIIlllIllIII = (float)(-(4 - i)) * f4 * 1.7f;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }
}

