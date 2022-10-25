package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_0414
extends class_0894 {
    private class_0847 IIIllIllIIlIlIlIlIllllIIl;
    private class_0847 IllIIIllIIIIlIlIlIllIIlll;
    final /* synthetic */ class_1727 IllIIlllllllIIlIIlIIIIlIl;

    private class_0414(class_1727 class_17272, long l) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_17272;
        super((long)((float)l * 1.0f));
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0847(Math.min((long)Math.min((float)l * 0.2f, 3000.0f), 1500L));
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0847(Math.min((long)((float)l * 0.4f), 5000L));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        if (!this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII()) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll();
    }

    float lIlIllIIlIIlIIlIIlIIlIIll() {
        if (!this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII()) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI()) {
            return Math.max(1.0f * this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl(), 0.15f);
        }
        if (this.lIIIIlIlIIlllllIIllIIlIII() <= this.IllIIIllIIIIlIlIlIllIIlll.IlIlIIlIlIllIIlIlIIllIIIl()) {
            if (!this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII()) {
                this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl();
            }
            return 1.0f - 0.85f * this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl();
        }
        return 1.0f;
    }

    /* synthetic */ class_0414(class_1727 class_17272, long l, class_1583 class_15832) {
        this(class_17272, l);
    }
}

