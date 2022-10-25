package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1777
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1777() {
        this(0, 35, 64, 64);
    }

    public class_1777(int n, int n2, int n3, int n4) {
        this.IlIIIIIllllllIIlllIllllll = n3;
        this.lIllllIIlIIIlIllllllIIIll = n4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, n, n2);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
    }
}

