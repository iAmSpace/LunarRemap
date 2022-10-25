package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0076
extends class_0229 {
    private static class_1785 lllIIIllIIIIlllIlIIllIIll = new class_1785();
    private final class_0697 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0326 IlIllllllIIlIIllllIIlIIIl = class_0326.IlIIIIIllllllIIlllIllllll();
    private String lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll;
    private class_1849 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1197 IllIIlllllllIIlIIlIIIIlIl;
    private class_1197 IIIllIllIIlIlIlIlIllllIIl;
    private class_1197 IllIIIllIIIIlIlIlIllIIlll;

    public class_0076(class_0697 class_06972, String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06972;
        this.lllIIIllIIIIlllIlIIllIIll(string);
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl.toString();
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = class_0326.lllIIIllIIIIlllIlIIllIIll(string);
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlllIlllIIIIlIIlllIllIII = class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.title", new Object[0]);
        this.IlIIIIIllllllIIlllIllllll = class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.tile", new Object[0]);
        this.lIllllIIlIIIlIllllllIIIll = class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.height", new Object[0]);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1849(this);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 154, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 100, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)");
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIlllllllIIlIIlIIIIlIl);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1197(3, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 50, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 100, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)");
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIIllIllIIlIlIlIlIllllIIl);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1197(4, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.flat.removeLayer", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIIllIIIIlIlIlIllIIlll);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(5, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.presets", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        this.IIIllIllIIlIlIlIlIllllIIl.lIIIIlIlIIlllllIIllIIlIII = false;
        this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII = false;
        this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII();
        this.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        int n = this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl().size() - this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll - 1;
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll = this.lIllllIIlIIIlIllllllIIIll();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 5) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1164(this));
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 4 && this.IIIllIllIIlIlIlIlIllllIIl()) {
            this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl().remove(n);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll = Math.min(this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll, this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl().size() - 1);
        }
        this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII();
        this.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        boolean bl;
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIIllIIIIlIlIlIllIIlll = bl = this.IIIllIllIIlIlIlIlIllllIIl();
        this.IIIllIllIIlIlIlIlIllllIIl.IllIIIllIIIIlIlIlIllIIlll = bl;
        this.IIIllIllIIlIlIlIlIllllIIl.IllIIIllIIIIlIlIlIllIIlll = false;
        this.IllIIlllllllIIlIIlIIIIlIl.IllIIIllIIIIlIlIlIllIIlll = false;
    }

    private boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll > -1 && this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll < this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl().size();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIlllIlllIIIIlIIlllIllIII, this.IlIlIIlllIIlIllIIIlllllIl / 2, 8, 0xFFFFFF);
        int n3 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 92 - 16;
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIIIIllllllIIlllIllllll, n3, 32, 0xFFFFFF);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIllllIIlIIIlIllllllIIIll, n3 + 2 + 213 - this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll), 32, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    static /* synthetic */ class_1785 IllIIlllllllIIlIIlIIIIlIl() {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    static /* synthetic */ class_0326 lllIIIllIIIIlllIlIIllIIll(class_0076 class_00762) {
        return class_00762.IlIllllllIIlIIllllIIlIIIl;
    }
}

