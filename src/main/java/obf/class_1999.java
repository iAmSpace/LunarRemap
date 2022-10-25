package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1999 {
    lllIIIllIIIIlllIlIIllIIll(0, "options.difficulty.peaceful"),
    lllIlIIlIIIlIlIIIllIlllIl(1, "options.difficulty.easy"),
    IlIllllllIIlIIllllIIlIIIl(2, "options.difficulty.normal"),
    lIlllIlllIIIIlIIlllIllIII(3, "options.difficulty.hard");

    private static final class_1999[] IlIIIIIllllllIIlllIllllll;
    private final int lIllllIIlIIIlIllllllIIIll;
    private final String IIIllIIlIIIIIIlIlIIllIIlI;

    /*
     * WARNING - void declaration
     */
    private class_1999() {
        void var4_2;
        void var3_1;
        this.lIllllIIlIIIlIllllllIIIll = var3_1;
        this.IIIllIIlIIIIIIlIlIIllIIlI = var4_2;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public static class_1999 lllIIIllIIIIlllIlIIllIIll(int n) {
        return IlIIIIIllllllIIlllIllllll[n % IlIIIIIllllllIIlllIllllll.length];
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static {
        IlIIIIIllllllIIlllIllllll = new class_1999[class_1999.values().length];
        class_1999[] arrclass_1999 = class_1999.values();
        int n = arrclass_1999.length;
        for (int i = 0; i < n; ++i) {
            class_1999 class_19992;
            class_1999.IlIIIIIllllllIIlllIllllll[class_19992.lIllllIIlIIIlIllllllIIIll] = class_19992 = arrclass_1999[i];
        }
    }
}

