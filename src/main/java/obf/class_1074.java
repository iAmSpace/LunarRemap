package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1074 {
    public static final class_1074[] lllIIIllIIIIlllIlIIllIIll = new class_1074[16];
    public static final class_1074 lllIlIIlIIIlIlIIIllIlllIl = new class_1074(0, "default", 1).IIIllIllIIlIlIlIlIllllIIl();
    public static final class_1074 IlIllllllIIlIIllllIIlIIIl = new class_1074(1, "flat");
    public static final class_1074 lIlllIlllIIIIlIIlllIllIII = new class_1074(2, "largeBiomes");
    public static final class_1074 IlIIIIIllllllIIlllIllllll = new class_1074(3, "amplified").IllIIIllIIIIlIlIlIllIIlll();
    public static final class_1074 lIllllIIlIIIlIllllllIIIll = new class_1074(8, "default_1_1", 0).lllIIIllIIIIlllIlIIllIIll(false);
    private final int IIIllIIlIIIIIIlIlIIllIIlI;
    private final String IllIIlllllllIIlIIlIIIIlIl;
    private final int IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    private boolean llIIlllIllIllllIIIlIIIIII;

    private class_1074(int n, String string) {
        this(n, string, 0);
    }

    private class_1074(int n, String string, int n2) {
        this.IllIIlllllllIIlIIlIIIIlIl = string;
        this.IIIllIllIIlIlIlIlIllllIIl = n2;
        this.IllIIIllIIIIlIlIlIllIIlll = true;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        class_1074.lllIIIllIIIIlllIlIIllIIll[n] = this;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return "generator." + this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl() + ".info";
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public class_1074 lllIIIllIIIIlllIlIIllIIll(int n) {
        return this == lllIlIIlIIIlIlIIIllIlllIl && n == 0 ? lIllllIIlIIIlIllllllIIIll : this;
    }

    private class_1074 lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IllIIIllIIIIlIlIlIllIIlll = bl;
        return this;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    private class_1074 IIIllIllIIlIlIlIlIllllIIl() {
        this.lIIIIlIlIIlllllIIllIIlIII = true;
        return this;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public static class_1074 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (int i = 0; i < lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (lllIIIllIIIIlllIlIIllIIll[i] == null || !class_1074.lllIIIllIIIIlllIlIIllIIll[i].IllIIlllllllIIlIIlIIIIlIl.equalsIgnoreCase(string)) continue;
            return lllIIIllIIIIlllIlIIllIIll[i];
        }
        return null;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    private class_1074 IllIIIllIIIIlIlIlIllIIlll() {
        this.llIIlllIllIllllIIIlIIIIII = true;
        return this;
    }
}

