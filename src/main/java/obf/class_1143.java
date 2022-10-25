package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1143
extends class_0764 {
    private final class_0894 lllIlIIlIIIlIlIIIllIlllIl = new class_0894(250L);
    private final class_0894 IlIllllllIIlIIllllIIlIIIl = new class_0894(250L);
    private final class_1746 lIlllIlllIIIIlIIlllIllIII = new class_1746(500L);

    public class_1143() {
        super("Wave", new class_0894(2000L));
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, float f) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, class_1931 class_19312, float f) {
        float f2 = 1.0f;
        float f3 = 0.5f;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlIlIllIIlIlIIllIIIl() > this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll()) {
            f2 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl();
        } else if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() <= this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl()) {
            if (!this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            }
            f2 = 1.0f - this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl();
        } else {
            if (!this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII()) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(125.0f);
                this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl();
            }
            f3 = this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl();
        }
        class_19312.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians(-150.0f * f2);
        class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(40.0f * f3 - 20.0f);
    }
}

