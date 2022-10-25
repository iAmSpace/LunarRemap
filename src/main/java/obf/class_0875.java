package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0875 {
    public class_1724[] lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;

    public class_0875(class_1724[] arrclass_1724) {
        this.lllIIIllIIIIlllIlIIllIIll = arrclass_1724;
        this.lllIlIIlIIIlIlIIIllIlllIl = arrclass_1724.length;
    }

    public class_0875(class_1724[] arrclass_1724, int n, int n2, int n3, int n4, float f, float f2) {
        this(arrclass_1724);
        float f3 = 0.0f / f;
        float f4 = 0.0f / f2;
        arrclass_1724[0] = arrclass_1724[0].lllIIIllIIIIlllIlIIllIIll((float)n3 / f - f3, (float)n2 / f2 + f4);
        arrclass_1724[1] = arrclass_1724[1].lllIIIllIIIIlllIlIIllIIll((float)n / f + f3, (float)n2 / f2 + f4);
        arrclass_1724[2] = arrclass_1724[2].lllIIIllIIIIlllIlIIllIIll((float)n / f + f3, (float)n4 / f2 - f4);
        arrclass_1724[3] = arrclass_1724[3].lllIIIllIIIIlllIlIIllIIll((float)n3 / f - f3, (float)n4 / f2 - f4);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        class_1724[] arrclass_1724 = new class_1724[this.lllIIIllIIIIlllIlIIllIIll.length];
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            arrclass_1724[i] = this.lllIIIllIIIIlllIlIIllIIll[this.lllIIIllIIIIlllIlIIllIIll.length - i - 1];
        }
        this.lllIIIllIIIIlllIlIIllIIll = arrclass_1724;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f) {
        class_0864 class_08642 = this.lllIIIllIIIIlllIlIIllIIll[1].lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll[0].lllIIIllIIIIlllIlIIllIIll);
        class_0864 class_08643 = this.lllIIIllIIIIlllIlIIllIIll[1].lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll[2].lllIIIllIIIIlllIlIIllIIll);
        class_0864 class_08644 = class_08643.IlIllllllIIlIIllllIIlIIIl(class_08642).lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            class_08682.IlIllllllIIlIIllllIIlIIIl(-((float)class_08644.lllIIIllIIIIlllIlIIllIIll), -((float)class_08644.lllIlIIlIIIlIlIIIllIlllIl), -((float)class_08644.IlIllllllIIlIIllllIIlIIIl));
        } else {
            class_08682.IlIllllllIIlIIllllIIlIIIl((float)class_08644.lllIIIllIIIIlllIlIIllIIll, (float)class_08644.lllIlIIlIIIlIlIIIllIlllIl, (float)class_08644.IlIllllllIIlIIllllIIlIIIl);
        }
        for (int i = 0; i < 4; ++i) {
            class_1724 class_17242 = this.lllIIIllIIIIlllIlIIllIIll[i];
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)class_17242.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll * f, (float)class_17242.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl * f, (float)class_17242.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl * f, class_17242.lllIlIIlIIIlIlIIIllIlllIl, class_17242.IlIllllllIIlIIllllIIlIIIl);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }
}

