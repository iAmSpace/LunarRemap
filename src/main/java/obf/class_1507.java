package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1507
implements class_2102 {
    private final class_2102 lllIIIllIIIIlllIlIIllIIll;
    private final boolean lllIlIIlIIIlIlIIIllIlllIl;
    private final boolean IlIllllllIIlIIllllIIlIIIl;

    public class_1507(class_2102 class_21022, boolean bl, boolean bl2) {
        this.lllIIIllIIIIlllIlIIllIIll = class_21022;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
        this.IlIllllllIIlIIllllIIlIIIl = bl2;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public float IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl ? this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() : this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl ? this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl() : this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(double d) {
        float f = this.lIlllIlllIIIIlIIlllIllIII() - this.IlIllllllIIlIIllllIIlIIIl();
        return this.IlIllllllIIlIIllllIIlIIIl() + f * ((float)d / 16.0f);
    }

    @Override
    public float IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl ? this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll() : this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public float lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl ? this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll() : this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(double d) {
        float f = this.lIllllIIlIIIlIllllllIIIll() - this.IlIIIIIllllllIIlllIllllll();
        return this.IlIIIIIllllllIIlllIllllll() + f * ((float)d / 16.0f);
    }

    @Override
    public String IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI();
    }
}

