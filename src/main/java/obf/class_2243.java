package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_2243 {
    lllIIIllIIIIlllIlIIllIIll("NOT_SET", 0, -1, ""),
    lllIlIIlIIIlIlIIIllIlllIl("SURVIVAL", 1, 0, "survival"),
    IlIllllllIIlIIllllIIlIIIl("CREATIVE", 2, 1, "creative"),
    lIlllIlllIIIIlIIlllIllIII("ADVENTURE", 3, 2, "adventure");

    int IlIIIIIllllllIIlllIllllll;
    String lIllllIIlIIIlIllllllIIIll;
    private static final class_2243[] IIIllIIlIIIIIIlIlIIllIIlI;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_2243(int n, String string3) {
        void var6_4;
        void var5_3;
        this.IlIIIIIllllllIIlllIllllll = var5_3;
        this.lIllllIIlIIIlIllllllIIIll = var6_4;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0372 class_03722) {
        if (this == IlIllllllIIlIIllllIIlIIIl) {
            class_03722.IlIllllllIIlIIllllIIlIIIl = true;
            class_03722.lIlllIlllIIIIlIIlllIllIII = true;
            class_03722.lllIIIllIIIIlllIlIIllIIll = true;
        } else {
            class_03722.IlIllllllIIlIIllllIIlIIIl = false;
            class_03722.lIlllIlllIIIIlIIlllIllIII = false;
            class_03722.lllIIIllIIIIlllIlIIllIIll = false;
            class_03722.lllIlIIlIIIlIlIIIllIlllIl = false;
        }
        class_03722.IlIIIIIllllllIIlllIllllll = !this.IlIllllllIIlIIllllIIlIIIl();
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this == lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this == IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this == lllIlIIlIIIlIlIIIllIlllIl || this == lIlllIlllIIIIlIIlllIllIII;
    }

    public static class_2243 lllIIIllIIIIlllIlIIllIIll(int n) {
        for (class_2243 class_22432 : class_2243.values()) {
            if (class_22432.IlIIIIIllllllIIlllIllllll != n) continue;
            return class_22432;
        }
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    public static class_2243 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (class_2243 class_22432 : class_2243.values()) {
            if (!class_22432.lIllllIIlIIIlIllllllIIIll.equals(string)) continue;
            return class_22432;
        }
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    static {
        IIIllIIlIIIIIIlIlIIllIIlI = new class_2243[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl, lIlllIlllIIIIlIIlllIllIII};
    }
}

