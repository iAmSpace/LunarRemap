package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2001
extends class_0764 {
    private final class_1088 lllIlIIlIIIlIlIIIllIlllIl = new class_1088(600L);
    private final class_0847 IlIllllllIIlIIllllIIlIIIl = new class_0847(600L);

    public class_2001() {
        super("T-Pose", new class_0847(5000L));
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, class_1931 class_19312, float f) {
        class_19312.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll *= this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl();
        class_19312.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll *= this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl();
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI()) {
            class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(90.0f * this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl());
            class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-90.0f * this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl());
        } else if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() <= this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl()) {
            if (!this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            }
            class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = Math.max((float)Math.toRadians(90.0f - 90.0f * this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl()), class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl);
            class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = Math.min((float)Math.toRadians(-90.0f + 90.0f * this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl()), class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl);
        } else {
            class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(90.0);
            class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = (float)Math.toRadians(-90.0);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, float f) {
    }
}

