package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1188 {
    lllIIIllIIIIlllIlIIllIIll(0, 1, 0, -1, 0),
    lllIlIIlIIIlIlIIIllIlllIl(1, 0, 0, 1, 0),
    IlIllllllIIlIIllllIIlIIIl(2, 3, 0, 0, -1),
    lIlllIlllIIIIlIIlllIllIII(3, 2, 0, 0, 1),
    IlIIIIIllllllIIlllIllllll(4, 5, -1, 0, 0),
    lIllllIIlIIIlIllllllIIIll(5, 4, 1, 0, 0);

    private final int IIIllIIlIIIIIIlIlIIllIIlI;
    private final int IllIIlllllllIIlIIlIIIIlIl;
    private final int IIIllIllIIlIlIlIlIllllIIl;
    private final int IllIIIllIIIIlIlIlIllIIlll;
    private final int lIIIIlIlIIlllllIIllIIlIII;
    private static final class_1188[] llIIlllIllIllllIIIlIIIIII;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1188(int n3, int n4, int n5) {
        void var7_5;
        void var6_4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n3;
        this.IllIIlllllllIIlIIlIIIIlIl = n4;
        this.IIIllIllIIlIlIlIlIllllIIl = n5;
        this.IllIIIllIIIIlIlIlIllIIlll = var6_4;
        this.lIIIIlIlIIlllllIIllIIlIII = var7_5;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public static class_1188 lllIIIllIIIIlllIlIIllIIll(int n) {
        return llIIlllIllIllllIIIlIIIIII[n % llIIlllIllIllllIIIlIIIIII.length];
    }

    static {
        llIIlllIllIllllIIIlIIIIII = new class_1188[6];
        class_1188[] arrclass_1188 = class_1188.values();
        int n = arrclass_1188.length;
        for (int i = 0; i < n; ++i) {
            class_1188 class_11882;
            class_1188.llIIlllIllIllllIIIlIIIIII[class_11882.IIIllIIlIIIIIIlIlIIllIIlI] = class_11882 = arrclass_1188[i];
        }
    }
}

