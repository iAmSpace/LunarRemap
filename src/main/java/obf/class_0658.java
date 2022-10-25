package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0658
extends class_1634 {
    private class_2013 lllIlIIlIIIlIlIIIllIlllIl;
    private static class_1002[] IlIllllllIIlIIllllIIlIIIl;
    private final class_1835 lIlllIlllIIIIlIIlllIllIII;
    protected String lllIIIllIIIIlllIlIIllIIll = "Minimap Options";

    public class_0658(class_2013 class_20132) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20132;
        this.lIlllIlllIIIIlIIlllIllIII = class_20132.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void n_() {
        IlIllllllIIlIIllllIIlIIIl = new class_1002[]{class_1002.lllIIIllIIIIlllIlIIllIIll, class_1002.lllIlIIlIIIlIlIIIllIlllIl, class_1002.lIIIIlIlIIlllllIIllIIlIII, class_1002.llIIlllIllIllllIIIlIIIIII, class_1002.lIllllIIlIIIlIllllllIIIll, class_1002.IIIllIIlIIIIIIlIlIIllIIlI, class_1002.IllIIlllllllIIlIIlIIIIlIl, class_1002.IlIllllllIIlIIllllIIlIIIl};
        int n = 0;
        this.lllIIIllIIIIlllIlIIllIIll = class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.title");
        for (int i = 0; i < IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            class_1002 class_10022 = IlIllllllIIlIIllllIIlIIIl[i];
            class_1419 class_14192 = new class_1419(class_10022.lIlllIlllIIIIlIIlllIllIII(), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155 + n % 2 * 160, this.llIIlllIllIllllIIIlIIIIII() / 6 + 24 * (n >> 1), class_10022, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_10022));
            this.llIIllIllIlIIlIIllIllllll().add(class_14192);
            if (class_10022.equals((Object)class_1002.IlIllllllIIlIIllllIIlIIIl)) {
                class_14192.IllIIIllIIIIlIlIlIllIIlll = this.lIlllIlllIIIIlIIlllIllIII.llIIlIlIlllIIllIlIlllIllI != false && this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll() != null;
            }
            ++n;
        }
        class_1419 class_14193 = new class_1419(101, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155, this.llIIlllIllIllllIIIlIIIIII() / 6 + 120 - 6, 150, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.radar"));
        class_14193.IllIIIllIIIIlIlIlIllIIlll = this.lIlllIlllIIIIlIIlllIllIII.IlIIlllllIIlIlIlllllIllll != false && this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll() != null;
        this.llIIllIllIlIIlIIllIllllll().add(class_14193);
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(103, this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 5, this.llIIlllIllIllllIIIlIIIIII() / 6 + 120 - 6, 150, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.detailsperformance")));
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(102, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155, this.llIIlllIllIllllIIIlIIIIII() / 6 + 144 - 6, 150, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("options.controls")));
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(100, this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 5, this.llIIlllIllIllllIIIlIIIIII() / 6 + 144 - 6, 150, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.waypoints")));
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(200, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 168, class_0950.lllIIIllIIIIlllIlIIllIIll("menu.returnToGame")));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 100 && class_11972 instanceof class_1419) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(((class_1419)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_1002.lllIIIllIIIIlllIlIIllIIll(class_11972.IIIllIllIIlIlIlIlIllllIIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 103) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(new class_0704(this, this.lllIlIIlIIIlIlIIIllIlllIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 102) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(new class_2177(this, this.lllIlIIlIIIlIlIIIllIlllIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 101) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(new class_1033(this, this.lllIlIIlIIIlIlIIIllIlllIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 100) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(new class_1400(this, this.lllIlIIlIIIlIlIIIllIlllIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll((class_0229)null);
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

