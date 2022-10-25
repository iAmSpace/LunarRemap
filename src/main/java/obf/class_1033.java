package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1033
extends class_1634 {
    private class_2013 lllIlIIlIIIlIlIIIllIlllIl;
    private static final class_1002[] IlIllllllIIlIIllllIIlIIIl = new class_1002[]{class_1002.lIIlIIIIIlIlllIlIIlIlIlll, class_1002.llIIlIlIlllIIllIlIlllIllI, class_1002.lIlIlIIlIIIIlIIIIIlllIIII, class_1002.IIlllIlIlllIllIIIlllIIlIl, class_1002.IlIIIlIIIIllIIIllIIIIIIll, class_1002.llIllllIlIllIIIlIllIIlIlI, class_1002.lIlIllIIlIIlIIlIIlIIlIIll, class_1002.llIIlIllIllllIlIIIIlIIlll, class_1002.IlIIlllllIIlIlIlllllIllll, class_1002.lIlllIlllIlIIIIlllIlIlIIl};
    private final class_0229 lIlllIlllIIIIlIIlllIllIII;
    private final class_1203 IlIIIIIllllllIIlllIllllll;
    protected String lllIIIllIIIIlllIlIIllIIll = "Radar Options";

    public class_1033(class_0229 class_02292, class_2013 class_20132) {
        this.lIlllIlllIIIIlIIlllIllIII = class_02292;
        this.IlIIIIIllllllIIlllIllllll = class_20132.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void n_() {
        class_1419 class_14192;
        int n = 0;
        this.lllIIIllIIIIlllIlIIllIIll = class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.radar.title");
        for (int i = 0; i < IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            class_1002 class_10022 = IlIllllllIIlIIllllIIlIIIl[i];
            class_14192 = new class_1419(class_10022.lIlllIlllIIIIlIIlllIllIII(), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155 + n % 2 * 160, this.llIIlllIllIllllIIIlIIIIII() / 6 + 24 * (n >> 1), class_10022, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_10022));
            this.llIIllIllIlIIlIIllIllllll().add(class_14192);
            ++n;
        }
        for (class_1002 class_10022 : this.llIIllIllIlIIlIIllIllllll()) {
            if (!(class_10022 instanceof class_1419)) continue;
            class_14192 = (class_1419)((Object)class_10022);
            if (!class_14192.lllIIIllIIIIlllIlIIllIIll().equals((Object)class_1002.lIIlIIIIIlIlllIlIIlIlIlll)) {
                class_14192.IllIIIllIIIIlIlIlIllIIlll = this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl;
            }
            if (class_14192.lllIIIllIIIIlllIlIIllIIll().equals((Object)class_1002.lIlIllIIlIIlIIlIIlIIlIIll) || class_14192.lllIIIllIIIIlllIlIIllIIll().equals((Object)class_1002.llIllllIlIllIIIlIllIIlIlI)) {
                class_14192.IllIIIllIIIIlIlIlIllIIlll = class_14192.IllIIIllIIIIlIlIlIllIIlll && this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII;
                continue;
            }
            if (!class_14192.lllIIIllIIIIlllIlIIllIIll().equals((Object)class_1002.llIIlIllIllllIlIIIIlIIlll)) continue;
            class_14192.IllIIIllIIIIlIlIlIllIIlll = class_14192.IllIIIllIIIIlIlIlIllIIlll && (this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll || this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl);
        }
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(101, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155, this.llIIlllIllIllllIIIlIIIIII() / 6 + 144 - 6, 150, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.radar.selectmobs")));
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(200, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 168, class_0950.lllIIIllIIIIlllIlIIllIIll("gui.done")));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 100 && class_11972 instanceof class_1419) {
                this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(((class_1419)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_1002.lllIIIllIIIIlllIlIIllIIll(class_11972.IIIllIllIIlIlIlIlIllllIIl));
                for (Object e : this.llIIllIllIlIIlIIllIllllll()) {
                    class_1197 class_11973;
                    if (e instanceof class_1419) {
                        class_11973 = (class_1419)e;
                        if (!((class_1419)class_11973).lllIIIllIIIIlllIlIIllIIll().equals((Object)class_1002.lIIlIIIIIlIlllIlIIlIlIlll)) {
                            ((class_1419)class_11973).IllIIIllIIIIlIlIlIllIIlll = this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl;
                        }
                        if (((class_1419)class_11973).lllIIIllIIIIlllIlIIllIIll() == class_1002.lIlIllIIlIIlIIlIIlIIlIIll || ((class_1419)class_11973).lllIIIllIIIIlllIlIIllIIll() == class_1002.llIllllIlIllIIIlIllIIlIlI) {
                            ((class_1419)class_11973).IllIIIllIIIIlIlIlIllIIlll = ((class_1419)class_11973).IllIIIllIIIIlIlIlIllIIlll && this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII;
                            continue;
                        }
                        if (!((class_1419)class_11973).lllIIIllIIIIlllIlIIllIIll().equals((Object)class_1002.llIIlIllIllllIlIIIIlIIlll)) continue;
                        ((class_1419)class_11973).IllIIIllIIIIlIlIlIllIIlll = ((class_1419)class_11973).IllIIIllIIIIlIlIlIllIIlll && (this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll || this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl);
                        continue;
                    }
                    if (!(e instanceof class_1197)) continue;
                    class_11973 = (class_1197)e;
                    if (class_11973.IIIllIllIIlIlIlIlIllllIIl != 101) continue;
                    class_11973.IllIIIllIIIIlIlIlIllIIlll = this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl;
                }
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 101) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(new class_1472(this, this.IlIIIIIllllllIIlllIllllll));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.IIIllIllIIlIlIlIlIllllIIl();
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI(), this.lllIIIllIIIIlllIlIIllIIll, this.lIIIIlIlIIlllllIIllIIlIII() / 2, 20, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

