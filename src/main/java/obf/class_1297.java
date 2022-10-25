package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1297 {
    lllIIIllIIIIlllIlIIllIIll("PERFORM_RESPAWN", 0, 0),
    lllIlIIlIIIlIlIIIllIlllIl("REQUEST_STATS", 1, 1),
    IlIllllllIIlIIllllIIlIIIl("OPEN_INVENTORY_ACHIEVEMENT", 2, 2);

    private final int lIlllIlllIIIIlIIlllIllIII;
    private static final class_1297[] IlIIIIIllllllIIlllIllllll;
    private static final class_1297[] lIllllIIlIIIlIllllllIIIll;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1297(int n2) {
        void var5_-1;
        this.lIlllIlllIIIIlIIlllIllIII = var5_-1;
    }

    public static /* synthetic */ class_1297[] lllIIIllIIIIlllIlIIllIIll() {
        return IlIIIIIllllllIIlllIllllll;
    }

    public static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(class_1297 class_12972) {
        return class_12972.lIlllIlllIIIIlIIlllIllIII;
    }

    static {
        IlIIIIIllllllIIlllIllllll = new class_1297[class_1297.values().length];
        lIllllIIlIIIlIllllllIIIll = new class_1297[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl};
        class_1297[] arrclass_1297 = class_1297.values();
        int n = arrclass_1297.length;
        for (int i = 0; i < n; ++i) {
            class_1297 class_12972;
            class_1297.IlIIIIIllllllIIlllIllllll[class_12972.lIlllIlllIIIIlIIlllIllIII] = class_12972 = arrclass_1297[i];
        }
    }
}

