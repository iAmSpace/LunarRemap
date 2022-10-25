package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1472
extends class_1634 {
    private final class_0229 lIlllIlllIIIIlIIlllIllIII;
    protected final class_1203 lllIIIllIIIIlllIlIIllIIll;
    protected String lllIlIIlIIIlIlIIIllIlllIl = "Select Mobs";
    private class_0803 IlIIIIIllllllIIlllIllllll;
    private class_1197 lIllllIIlIIIlIllllllIIIll;
    private class_1197 IIIllIIlIIIIIIlIlIIllIIlI;
    private String IllIIlllllllIIlIIlIIIIlIl = null;
    protected String IlIllllllIIlIIllllIIlIIIl = null;

    public class_1472(class_0229 class_02292, class_1203 class_12032) {
        this.lIlllIlllIIIIlIIlllIllIII = class_02292;
        this.lllIIIllIIIIlllIlIIllIIll = class_12032;
    }

    @Override
    public void n_() {
        boolean bl;
        boolean bl2 = false;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.mobs.title");
        this.IlIIIIIllllllIIlllIllllll = new class_0803(this);
        this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(7, 8);
        this.lIllllIIlIIIlIllllllIIIll = new class_1197(-1, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 154, this.llIIlllIllIllllIIIlIIIIII() - 28, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.mobs.enable"));
        this.llIIllIllIlIIlIIllIllllll().add(this.lIllllIIlIIIlIllllllIIIll);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1197(-2, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 50, this.llIIlllIllIllllIIIlIIIIII() - 28, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.mobs.disable"));
        this.llIIllIllIlIIlIIllIllllll().add(this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(65336, this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 4 + 50, this.llIIlllIllIllllIIIlIIIIII() - 28, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("gui.done")));
        this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll = bl = this.IlIllllllIIlIIllllIIlIIIl != null;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll = bl;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -1) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, true);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -2) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, false);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 65336) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        class_1667 class_16672 = class_1667.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        if (class_16672 != null) {
            return class_16672.lIIlIlllIllIlIlllIIIIIIII;
        }
        class_0562 class_05622 = class_0812.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        if (class_05622 != null) {
            return class_05622.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return false;
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        for (class_1667 class_16672 : class_1667.values()) {
            if (!class_16672.llllIlIIIIIIIIIlllIIlIIIl.equals(string)) continue;
            class_16672.lIIlIlllIllIlIlllIIIIIIII = bl;
        }
        for (class_0562 class_05622 : class_0812.lllIIIllIIIIlllIlIIllIIll) {
            if (!class_05622.lllIIIllIIIIlllIlIIllIIll.equals(string)) continue;
            class_05622.lllIlIIlIIIlIlIIIllIlllIl = bl;
        }
    }

    protected void lIllllIIlIIIlIllllllIIIll() {
        class_1667 class_16672 = class_1667.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        if (class_16672 != null) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, !class_16672.lIIlIlllIllIlIlllIIIIIIII);
        } else {
            class_0562 class_05622 = class_0812.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            if (class_05622 != null) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, !class_05622.lllIlIIlIIIlIlIIIllIlllIl);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.IIIllIllIIlIlIlIlIllllIIl();
        this.IllIIlllllllIIlIIlIIIIlIl = null;
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI(), this.lllIlIIlIIIlIlIIIllIlllIl, this.lIIIIlIlIIlllllIIllIIlIII() / 2, 20, 0xFFFFFF);
        boolean bl = this.IlIllllllIIlIIllllIIlIIIl != null;
        this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll = bl && !this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll = bl && this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, n, n2);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        if (string != null) {
            int n3 = n + 12;
            int n4 = n2 - 12;
            int n5 = this.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll(string);
            class_1472.lllIIIllIIIIlllIlIIllIIll((float)(n3 - 3), (float)(n4 - 3), (float)(n3 + n5 + 3), (float)(n4 + 8 + 3), -1073741824, -1073741824);
            this.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll(string, (float)n3, (float)n4, -1);
        }
    }

    static String lllIIIllIIIIlllIlIIllIIll(class_1472 class_14722, String string) {
        class_14722.IllIIlllllllIIlIIlIIIIlIl = string;
        return class_14722.IllIIlllllllIIlIIlIIIIlIl;
    }
}

