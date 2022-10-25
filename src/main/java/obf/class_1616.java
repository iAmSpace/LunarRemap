package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1616
extends class_0923 {
    private final String lIllllIIlIIIlIllllllIIIll;
    private final String IIIllIIlIIIIIIlIlIIllIIlI;
    private final String IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl = true;

    public class_1616(class_0945 class_09452, String string, int n, boolean bl) {
        super(class_09452, class_0616.lllIIIllIIIIlllIlIIllIIll(bl ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), string, n);
        this.IlIllllllIIlIIllllIIlIIIl = class_0616.lllIIIllIIIIlllIlIIllIIll(bl ? "chat.link.open" : "gui.yes", new Object[0]);
        this.lIlllIlllIIIIlIIlllIllIII = class_0616.lllIIIllIIIIlllIlIIllIIll(bl ? "gui.cancel" : "gui.no", new Object[0]);
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_0616.lllIIIllIIIIlllIlIIllIIll("chat.copy", new Object[0]);
        this.lIllllIIlIIIlIllllllIIIll = class_0616.lllIIIllIIIIlllIlIIllIIll("chat.link.warning", new Object[0]);
        this.IllIIlllllllIIlIIlIIIIlIl = string;
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 154, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 96, 100, 20, this.IlIllllllIIlIIllllIIlIIIl));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 50, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 96, 100, 20, this.IIIllIIlIIIIIIlIlIIllIIlI));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 54, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 96, 100, 20, this.lIlllIlllIIIIlIIlllIllIII));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
            this.lIllllIIlIIIlIllllllIIIll();
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_11972.IIIllIllIIlIlIlIlIllllIIl == 0, this.IlIIIIIllllllIIlllIllllll);
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        class_1616.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIllllIIlIIIlIllllllIIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 110, 0xFFCCCC);
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.IIIllIllIIlIlIlIlIllllIIl = false;
    }
}

