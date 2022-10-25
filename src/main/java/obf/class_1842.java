package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1842
extends class_0764 {
    private final class_0847 lllIlIIlIIIlIlIIIllIlllIl = new class_0847(250L);
    private final class_0847 IlIllllllIIlIIllllIIlIIIl = new class_0847(250L);

    public class_1842() {
        super("Hands Up", new class_0894(2000L));
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
        class_19312.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians(-180.0f * f2);
        class_19312.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = (float)Math.toRadians(-180.0f * f2);
        class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-15.0f * f2);
        class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(15.0f * f2);
    }
}

