package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1601 {
    lllIIIllIIIIlllIlIIllIIll("FILE", 0, "file"),
    lllIlIIlIIIlIlIIIllIlllIl("SOUND_EVENT", 1, "event");

    private final String IlIllllllIIlIIllllIIlIIIl;
    private static final class_1601[] lIlllIlllIIIIlIIlllIllIII;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1601(String string2) {
        void var5_-1;
        this.IlIllllllIIlIIllllIIlIIIl = var5_-1;
    }

    public static class_1601 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (class_1601 class_16012 : class_1601.values()) {
            if (!class_16012.IlIllllllIIlIIllllIIlIIIl.equals(string)) continue;
            return class_16012;
        }
        return null;
    }

    static {
        lIlllIlllIIIIlIIlllIllIII = new class_1601[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl};
    }
}

