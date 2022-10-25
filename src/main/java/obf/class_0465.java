package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0465
extends class_0764 {
    private static final int lIlllIlllIIIIlIIlllIllIII = 15;
    private static final long IlIIIIIllllllIIlllIllllll = 250L;
    private class_1088 lIllllIIlIIIlIllllllIIIll = new class_1088(375L);
    private class_1746 IIIllIIlIIIIIIlIlIIllIIlI = new class_1746(375L);
    private class_1746 IllIIlllllllIIlIIlIIIIlIl = new class_1746(250L);
    boolean lllIlIIlIIIlIlIIIllIlllIl = false;
    boolean IlIllllllIIlIIllllIIlIIIl = false;
    private class_0601 IIIllIllIIlIlIlIlIllllIIl;

    public class_0465() {
        super("Floss", new class_0894(7500L));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.IIIllIllIIlIlIlIlIllllIIl = class_0601.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, float f) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, class_1931 class_19312, float f) {
        if (!this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII()) {
            if ((double)this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl() >= 0.5) {
                this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl();
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl();
            }
        } else if (this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll()) {
            this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl();
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl();
            this.IIIllIllIIlIlIlIlIllllIIl = this.lIlllIlllIIIIlIIlllIllIII();
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll()) {
            this.lllIlIIlIIIlIlIIIllIlllIl = !this.lllIlIIlIIIlIlIIIllIlllIl;
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
        float f2 = this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl();
        float f3 = this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl();
        class_19312.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians((float)(this.IIIllIllIIlIlIlIlIllllIIl == class_0601.IlIllllllIIlIIllllIIlIIIl ? 45 : -45) * f3);
        class_19312.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians((float)(this.IIIllIllIIlIlIlIlIllllIIl == class_0601.lIlllIlllIIIIlIIlllIllIII ? 45 : -45) * f3);
        float f4 = 150.0f;
        float f5 = f4 / 2.0f;
        switch (this.IIIllIllIIlIlIlIlIllllIIl) {
            case lllIIIllIIIIlllIlIIllIIll: {
                class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(f4 * f2 - f5);
                class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(f4 * f2 - f5);
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(f5 - f5 * f3);
                class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(f5 - f5 * f3);
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-f4 * f2 + f5);
                class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-f4 * f2 + f5);
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(f5 * f3 - f5);
                class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(f5 * f3 - f5);
            }
        }
        f3 = this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl();
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            class_19312.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-15.0f * f3);
            class_19312.IlIlllIIIIIIlIIllIIllIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(15.0f * f3);
            class_19312.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(15.0f * f3);
            class_19312.llIIllIllIlIIlIIllIllllll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(15.0f * f3);
            class_19312.llIIllIllIlIIlIIllIllllll.IlIlllIIIIIIlIIllIIllIlll = 0.2f * f3;
            class_19312.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll = 0.2f * f3;
        } else {
            class_19312.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(15.0f * f3);
            class_19312.IlIlllIIIIIIlIIllIIllIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-15.0f * f3);
            class_19312.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-15.0f * f3);
            class_19312.llIIllIllIlIIlIIllIllllll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-15.0f * f3);
            class_19312.llIIllIllIlIIlIIllIllllll.IlIlllIIIIIIlIIllIIllIlll = -0.2f * f3;
            class_19312.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll = -0.2f * f3;
        }
    }

    private class_0601 lIlllIlllIIIIlIIlllIllIII() {
        switch (this.IIIllIllIIlIlIlIlIllllIIl) {
            default: {
                return class_0601.IlIllllllIIlIIllllIIlIIIl;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                return class_0601.lllIlIIlIIIlIlIIIllIlllIl;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                return class_0601.lIlllIlllIIIIlIIlllIllIII;
            }
            case lIlllIlllIIIIlIIlllIllIII: 
        }
        return class_0601.lllIIIllIIIIlllIlIIllIIll;
    }
}

