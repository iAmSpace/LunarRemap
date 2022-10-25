package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2108 {
    private int lllIIIllIIIIlllIlIIllIIll = 0;
    private float lllIlIIlIIIlIlIIIllIlllIl = 0.0f;
    private class_0744 IlIllllllIIlIIllllIIlIIIl = null;

    public class_2108(int n, float f, class_0744 class_07442) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
        this.IlIllllllIIlIIllllIIlIIIl = class_07442;
    }

    public class_0744 lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1931 class_19312, float f) {
        class_0744 class_07442 = class_0524.lllIIIllIIIIlllIlIIllIIll(class_19312, this.lllIIIllIIIIlllIlIIllIIll);
        if (class_07442 != null) {
            class_07442.IlIllllllIIlIIllllIIlIIIl(f);
        }
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(f * this.lllIlIIlIIIlIlIIIllIlllIl);
    }
}

