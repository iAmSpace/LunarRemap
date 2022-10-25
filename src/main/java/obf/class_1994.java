package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1994
extends class_1634 {
    private static final class_1002[] lllIlIIlIIIlIlIIIllIlllIl = new class_1002[]{class_1002.IllIIIIllIIllIllIlllIlIIl, class_1002.IIIIIIIIlIllIIllIIlllIllI};
    private final class_0229 IlIllllllIIlIIllllIIlIIIl;
    private final class_1835 lIlllIlllIIIIlIIlllIllIII;
    protected String lllIIIllIIIIlllIlIIllIIll = "Radar Options";

    public class_1994(class_0229 class_02292, class_1835 class_18352) {
        this.IlIllllllIIlIIllllIIlIIIl = class_02292;
        this.lIlllIlllIIIIlIIlllIllIII = class_18352;
    }

    @Override
    public void n_() {
        int n = 0;
        this.lllIIIllIIIIlllIlIIllIIll = class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.waypoints.title");
        for (int i = 0; i < lllIlIIlIIIlIlIIIllIlllIl.length; ++i) {
            class_1002 class_10022 = lllIlIIlIIIlIlIIIllIlllIl[i];
            if (class_10022.lllIIIllIIIIlllIlIIllIIll()) {
                float f = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(class_10022);
                if (f < 0.0f) {
                    f = 10001.0f;
                }
                f = (f - 50.0f) / 9951.0f;
                this.llIIllIllIlIIlIIllIllllll().add(new class_0444(class_10022.lIlllIlllIIIIlIIlllIllIII(), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155 + n % 2 * 160, this.llIIlllIllIllllIIIlIIIIII() / 6 + 24 * (n >> 1), class_10022, f, this.lIlllIlllIIIIlIIlllIllIII));
            } else {
                class_1419 class_14192 = new class_1419(class_10022.lIlllIlllIIIIlIIlllIllIII(), this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155 + n % 2 * 160, this.llIIlllIllIllllIIIlIIIIII() / 6 + 24 * (n >> 1), class_10022, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_10022));
                this.llIIllIllIlIIlIIllIllllll().add(class_14192);
            }
            ++n;
        }
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(200, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 168, class_0950.lllIIIllIIIIlllIlIIllIIll("gui.done")));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 100 && class_11972 instanceof class_1419) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(((class_1419)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_1002.lllIIIllIIIIlllIlIIllIIll(class_11972.IIIllIllIIlIlIlIlIllllIIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.IIIllIllIIlIlIlIlIllllIIl();
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.lIIIIlIlIIlllllIIllIIlIII() / 2, 20, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

