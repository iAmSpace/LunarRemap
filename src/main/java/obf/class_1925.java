package obf;

import optifine.Config;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1925 {
    private class_0524[] lllIIIllIIIIlllIlIIllIIll = new class_0524[0];
    private boolean lllIlIIlIIIlIlIIIllIlllIl = false;

    public void lllIIIllIIIIlllIlIIllIIll(class_1931 class_19312, class_2174 class_21742, float f, float f2) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
                class_0524 class_05242 = this.lllIIIllIIIIlllIlIIllIIll[i];
                class_05242.lllIIIllIIIIlllIlIIllIIll(class_19312, class_21742, f, f2);
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
    }

    public class_0524[] lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0524 class_05242) {
        this.lllIIIllIIIIlllIlIIllIIll = (class_0524[]) Config.lllIIIllIIIIlllIlIIllIIll((Object[])this.lllIIIllIIIIlllIlIIllIIll, (Object)class_05242);
    }
}

