package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_2010 {
    lllIIIllIIIIlllIlIIllIIll("green"),
    lllIlIIlIIIlIlIIIllIlllIl("red"),
    IlIllllllIIlIIllllIIlIIIl("yellow"),
    lIlllIlllIIIIlIIlllIllIII("unknown");

    private String IlIIIIIllllllIIlllIllllll;

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_2010() {
        void var3_1;
        this.IlIIIIIllllllIIlllIllllll = var3_1;
    }

    public static class_2010 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (class_2010 class_20102 : class_2010.values()) {
            if (!class_20102.lllIIIllIIIIlllIlIIllIIll().toLowerCase().equals(string.toLowerCase())) continue;
            return class_20102;
        }
        return null;
    }
}

