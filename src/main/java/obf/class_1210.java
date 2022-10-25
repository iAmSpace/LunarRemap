package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1210 {
    lllIIIllIIIIlllIlIIllIIll("FULL", 0, 0, "options.chat.visibility.full"),
    lllIlIIlIIIlIlIIIllIlllIl("HIDDEN", 1, 1, "options.chat.visibility.hidden");

    private static final class_1210[] IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;
    private final String IlIIIIIllllllIIlllIllllll;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1210(int n, String string3) {
        void var6_4;
        void var5_3;
        this.lIlllIlllIIIIlIIlllIllIII = var5_3;
        this.IlIIIIIllllllIIlllIllllll = var6_4;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public static class_1210 lllIIIllIIIIlllIlIIllIIll(int n) {
        return IlIllllllIIlIIllllIIlIIIl[n % IlIllllllIIlIIllllIIlIIIl.length];
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    static {
        IlIllllllIIlIIllllIIlIIIl = new class_1210[class_1210.values().length];
        class_1210[] arrclass_1210 = class_1210.values();
        int n = arrclass_1210.length;
        for (int i = 0; i < n; ++i) {
            class_1210 class_12102;
            class_1210.IlIllllllIIlIIllllIIlIIIl[class_12102.lIlllIlllIIIIlIIlllIllIII] = class_12102 = arrclass_1210[i];
        }
    }
}

