package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_1070
implements class_1456 {
    private class_1456 lllIlIIlIIIlIlIIIllIlllIl = null;
    private boolean IlIllllllIIlIIllllIIlIIIl = false;
    final /* synthetic */ class_1595 lllIIIllIIIIlllIlIIllIIll;

    private class_1070(class_1595 class_15952) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15952;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        if (!this.IlIllllllIIlIIllllIIlIIIl) {
            this.IlIllllllIIlIIllllIIlIIIl = true;
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
            class_0868.IlIIIIIllllllIIlllIllllll = class_1595.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            this.IlIllllllIIlIIllllIIlIIIl = false;
            class_0868.IlIIIIIllllllIIlllIllllll = class_1595.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll);
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1456 class_14562) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_14562;
    }

    class_1070(class_1595 class_15952, class_0377 class_03772) {
        this(class_15952);
    }
}

