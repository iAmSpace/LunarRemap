package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1377
extends class_0551 {
    class_2094 lllIIIllIIIIlllIlIIllIIll;
    class_1965 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIIIIIllllllIIlllIllllll;

    public class_1377(class_2094 class_20942) {
        super(class_20942, false);
        this.lllIIIllIIIIlllIlIIllIIll = class_20942;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (!this.lllIIIllIIIIlllIlIIllIIll.lllIIIIlIIllIIIlIllIlllII()) {
            return false;
        }
        class_1965 class_19652 = this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIllIlIIIIIlIIlllIlI();
        if (class_19652 == null) {
            return false;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_19652.lllIlIIllllIIllIIIIllIlIl();
        int n = class_19652.IllIIIIIllIlIIllIllllllIl();
        return n != this.IlIIIIIllllllIIlllIllllll && this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, false) && this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, class_19652);
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_1965 class_19652 = this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIllIlIIIIIlIIlllIlI();
        if (class_19652 != null) {
            this.IlIIIIIllllllIIlllIllllll = class_19652.IllIIIIIllIlIIllIllllllIl();
        }
        super.IlIIIIIllllllIIlllIllllll();
    }
}

