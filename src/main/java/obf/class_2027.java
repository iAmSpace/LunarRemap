package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class class_2027
extends class_0229 {
    private final class_0229 lllIIIllIIIIlllIlIIllIIll;
    private final class_1092 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0598 IlIllllllIIlIIllllIIlIIIl;
    private class_0598 lIlllIlllIIIIlIIlllIllIII;
    private class_1197 IlIIIIIllllllIIlllIllllll;

    public class_2027(class_0229 class_02292, class_1092 class_10922) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_10922;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96 + 18, class_0616.lllIIIllIIIIlllIlIIllIIll("addServer.add", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120 + 18, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        this.IlIIIIIllllllIIlllIllllll = new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 72, class_0616.lllIIIllIIIIlllIlIIllIIll("addServer.resourcePack", new Object[0]) + ": " + this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII());
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIIIIIllllllIIlllIllllll);
        this.lIlllIlllIIIIlIIlllIllIII = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 66, 200, 20);
        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll);
        this.IlIllllllIIlIIllllIIlIIIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 106, 200, 20);
        this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll(128);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl);
        ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IllIIIllIIIIlIlIlIllIIlll = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 0 && this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().split(":").length > 0 && this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl().length() > 0;
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_1612.values()[(this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().ordinal() + 1) % class_1612.values().length]);
                this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("addServer.resourcePack", new Object[0]) + ": " + this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(false, 0);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true, 0);
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (n == 15) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(!this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll());
            this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(!this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll());
        }
        if (n == 28 || n == 156) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(0));
        }
        ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IllIIIllIIIIlIlIlIllIIlll = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 0 && this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().split(":").length > 0 && this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl().length() > 0;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("addServer.title", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 17, 0xFFFFFF);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("addServer.enterName", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 53, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("addServer.enterIp", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 94, 0xA0A0A0);
        this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll();
        this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll();
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

