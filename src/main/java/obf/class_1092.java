package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1092 {
    public String lllIIIllIIIIlllIlIIllIIll;
    public String lllIlIIlIIIlIlIIIllIlllIl;
    public String IlIllllllIIlIIllllIIlIIIl;
    public String lIlllIlllIIIIlIIlllIllIII;
    public int IlIIIIIllllllIIlllIllllll;
    public String lIllllIIlIIIlIllllllIIIll;
    public long IIIllIIlIIIIIIlIlIIllIIlI;
    public int IllIIlllllllIIlIIlIIIIlIl = 5;
    public String IIIllIllIIlIlIlIlIllllIIl = "1.7.10";
    public boolean IllIIIllIIIIlIlIlIllIIlll;
    public String lIIIIlIlIIlllllIIllIIlIII;
    private class_1612 IlIlIIlIlIllIIlIlIIllIIIl = class_1612.IlIllllllIIlIIllllIIlIIIl;
    private String lllllIlllIIllIlIIlIIIllII;
    private boolean IlIlIIlllIIlIllIIIlllllIl;
    public boolean llIIlllIllIllllIIIlIIIIII = false;
    public boolean llIIllIllIlIIlIIllIllllll = false;
    public boolean lllIIlIIIllllllIIIIlIlIlI = false;
    public String IlIlllIIIIIIlIIllIIllIlll = null;

    public class_1092(boolean bl, String string, String string2) {
        this(string, string2);
        this.llIIlllIllIllllIIIlIIIIII = bl;
    }

    public class_1092(String string, String string2) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
    }

    public class_1092(String string, String string2, boolean bl) {
        this(string, string2);
        this.IlIlIIlllIIlIllIIIlllllIl = bl;
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll() {
        class_0775 class_07752 = new class_0775();
        class_07752.lllIIIllIIIIlllIlIIllIIll("name", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("ip", this.lllIlIIlIIIlIlIIIllIlllIl);
        if (this.lllllIlllIIllIlIIlIIIllII != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("icon", this.lllllIlllIIllIlIIlIIIllII);
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl == class_1612.lllIIIllIIIIlllIlIIllIIll) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("acceptTextures", true);
        } else if (this.IlIlIIlIlIllIIlIlIIllIIIl == class_1612.lllIlIIlIIIlIlIIIllIlllIl) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("acceptTextures", false);
        }
        return class_07752;
    }

    public class_1612 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1612 class_16122) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_16122;
    }

    public static class_1092 lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_1092 class_10922 = new class_1092(class_07752.IllIIIllIIIIlIlIlIllIIlll("name"), class_07752.IllIIIllIIIIlIlIlIllIIlll("ip"));
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("icon", 8)) {
            class_10922.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("icon"));
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("acceptTextures", 1)) {
            if (class_07752.lllIIlIIIllllllIIIIlIlIlI("acceptTextures")) {
                class_10922.lllIIIllIIIIlllIlIIllIIll(class_1612.lllIIIllIIIIlllIlIIllIIll);
            } else {
                class_10922.lllIIIllIIIIlllIlIIllIIll(class_1612.lllIlIIlIIIlIlIIIllIlllIl);
            }
        } else {
            class_10922.lllIIIllIIIIlllIlIIllIIll(class_1612.IlIllllllIIlIIllllIIlIIIl);
        }
        return class_10922;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllllIlllIIllIlIIlIIIllII = string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1092 class_10922) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_10922.lllIlIIlIIIlIlIIIllIlllIl;
        this.lllIIIllIIIIlllIlIIllIIll = class_10922.lllIIIllIIIIlllIlIIllIIll;
        this.lllIIIllIIIIlllIlIIllIIll(class_10922.lllIlIIlIIIlIlIIIllIlllIl());
        this.lllllIlllIIllIlIIlIIIllII = class_10922.lllllIlllIIllIlIIlIIIllII;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }
}

