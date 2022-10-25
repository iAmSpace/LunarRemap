package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0704
extends class_1634 {
    private class_2013 lllIlIIlIIIlIlIIIllIlllIl;
    private static final class_1002[] IlIllllllIIlIIllllIIlIIIl = new class_1002[]{class_1002.lIlllIlllIIIIlIIlllIllIII, class_1002.IlIIIIIllllllIIlllIllllll, class_1002.lllIIlIIIllllllIIIIlIlIlI, class_1002.IlIlllIIIIIIlIIllIIllIlll, class_1002.IlIlIIlIlIllIIlIlIIllIIIl, class_1002.llIIllIllIlIIlIIllIllllll, class_1002.IlIlIIlllIIlIllIIIlllllIl, class_1002.lllllIlllIIllIlIIlIIIllII};
    private class_0229 lIlllIlllIIIIlIIlllIllIII;
    protected String lllIIIllIIIIlllIlIIllIIll = "Details / Performance";
    private class_1835 IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll = -1;

    public class_0704(class_0229 class_02292, class_2013 class_20132) {
        this.lIlllIlllIIIIlIIlllIllIII = class_02292;
        this.IlIIIIIllllllIIlllIllllll = class_20132.lllIlIIlIIIlIlIIIllIlllIl();
    }

    private int lIllllIIlIIIlIllllllIIIll() {
        return this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 155;
    }

    @Override
    public void n_() {
        this.lllIIIllIIIIlllIlIIllIIll = class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.detailsperformance");
        int n = this.lIllllIIlIIIlIllllllIIIll();
        int n2 = 0;
        for (int i = 0; i < IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            class_1002 class_10022 = IlIllllllIIlIIllllIIlIIIl[i];
            String string = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_10022);
            if ((class_10022 == class_1002.lllIIlIIIllllllIIIIlIlIlI || class_10022 == class_1002.IlIlllIIIIIIlIIllIIllIlll || class_10022 == class_1002.IlIlIIlIlIllIIlIlIIllIIIl) && !this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl && this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(class_10022)) {
                string = "\u00a7c" + string;
            }
            class_1419 class_14192 = new class_1419(class_10022.lIlllIlllIIIIlIIlllIllIII(), n + n2 % 2 * 160, this.llIIlllIllIllllIIIlIIIIII() / 6 + 24 * (n2 >> 1), class_10022, string);
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_14192);
            ++n2;
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(200, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 100, this.llIIlllIllIllllIIIlIIIIII() / 6 + 168, class_0950.lllIIIllIIIIlllIlIIllIIll("gui.done")));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 100 && class_11972 instanceof class_1419) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(((class_1419)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
            String string = "";
            if ((class_11972.IIIllIllIIlIlIlIlIllllIIl == class_1002.lllIIlIIIllllllIIIIlIlIlI.ordinal() || class_11972.IIIllIllIIlIlIlIlIllllIIl == class_1002.IlIlllIIIIIIlIIllIIllIlll.ordinal() || class_11972.IIIllIllIIlIlIlIlIllllIIl == class_1002.IlIlIIlIlIllIIlIlIIllIIIl.ordinal()) && !this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl && this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(class_1002.lllIIIllIIIIlllIlIIllIIll(class_11972.IIIllIllIIlIlIlIlIllllIIl))) {
                string = "\u00a7c";
            }
            class_11972.IllIIlllllllIIlIIlIIIIlIl = string + this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_1002.lllIIIllIIIIlllIlIIllIIll(class_11972.IIIllIllIIlIlIlIlIllllIIl));
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
            this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
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

