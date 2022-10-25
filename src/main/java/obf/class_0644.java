package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class class_0644
extends class_0229 {
    private class_0229 lllIIIllIIIIlllIlIIllIIll;
    private class_0598 lllIlIIlIIIlIlIIIllIlllIl;
    private final String IlIllllllIIlIIllllIIlIIIl;

    public class_0644(class_0229 class_02292, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96 + 12, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.renameButton", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120 + 12, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        class_2055 class_20552 = this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll();
        class_0770 class_07702 = class_20552.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl);
        String string = class_07702.lIIIIlIlIIlllllIIllIIlIII();
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 60, 200, 20);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(string);
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                class_2055 class_20552 = this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll();
                class_20552.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().trim());
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        boolean bl = ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IllIIIllIIIIlIlIlIllIIlll = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl().trim().length() > 0;
        if (n == 28 || n == 156) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(0));
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.renameTitle", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.enterName", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 47, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

