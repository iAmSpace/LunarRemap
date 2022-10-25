package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class class_0440
extends class_0229 {
    private final class_0229 lllIIIllIIIIlllIlIIllIIll;
    private final class_1092 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0598 IlIllllllIIlIIllllIIlIIIl;

    public class_0440(class_0229 class_02292, class_1092 class_10922) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_10922;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96 + 12, class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.select", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120 + 12, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        this.IlIllllllIIlIIllllIIlIIIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 116, 200, 20);
        this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll(128);
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.gameSettings.lIlIlIIllIlIIIIIlIIlllIlI);
        ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IllIIIllIIIIlIlIlIllIIlll = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 0 && this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().split(":").length > 0;
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.lllllIlllIIllIlIIlIIIllII.gameSettings.lIlIlIIllIlIIIIIlIIlllIlI = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(false, 0);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true, 0);
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(c, n)) {
            ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IllIIIllIIIIlIlIlIllIIlll = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 0 && this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().split(":").length > 0;
        } else if (n == 28 || n == 156) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(0));
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.direct", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("addServer.enterIp", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 100, 0xA0A0A0);
        this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll();
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

