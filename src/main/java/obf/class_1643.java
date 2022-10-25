package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1643
extends class_0764 {
    private final class_0847 lllIlIIlIIIlIlIIIllIlllIl = new class_0847(250L);
    private final class_0847 IlIllllllIIlIIllllIIlIIIl = new class_0847(250L);

    public class_1643() {
        super("Dab", new class_0847(1000L));
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, float f) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, class_1931 class_19312, float f) {
        float f2 = 1.0f;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlIlIllIIlIlIIllIIIl() > this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll()) {
            f2 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl();
        } else if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() <= this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl()) {
            if (!this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            }
            f2 = 1.0f - this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl();
        }
        class_19312.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians(-90.0f * f2);
        class_19312.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = (float)Math.toRadians(-35.0f * f2);
        class_19312.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians(15.0f * f2);
        class_19312.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = (float)Math.toRadians(15.0f * f2);
        class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-110.0f * f2);
        float f3 = class_21742.IlIlIIlllIllllllllIIIlIlI;
        float f4 = class_21742.lllllIllllIIIIllIIlIlIlII - class_21742.IIIIlIllIlIIlIIlIllIlIlll;
        class_19312.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians(-f3 * f2) + (float)Math.toRadians(45.0f * f2 + f3);
        class_19312.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = (float)Math.toRadians(f4 * f2) + (float)Math.toRadians(35.0f * f2 - f4);
        class_19312.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians(-f3 * f2) + (float)Math.toRadians(45.0f * f2 + f3);
        class_19312.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = (float)Math.toRadians(f4 * f2) + (float)Math.toRadians(35.0f * f2 - f4);
    }
}

