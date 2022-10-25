package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1824
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1824() {
        this(0, 0, 32, 32);
    }

    public class_1824(int n, int n2, int n3, int n4) {
        this.IlIIIIIllllllIIlllIllllll = n3;
        this.lIllllIIlIIIlIllllllIIIll = n4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, n, n2);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-3.0f, -6.0f, -3.0f, 6, 8, 6, 0.0f);
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

