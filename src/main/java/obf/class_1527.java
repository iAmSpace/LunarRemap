package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1527
extends class_1056 {
    @Override
    public void n_() {
        super.n_();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll - 40, class_0616.lllIIIllIIIIlllIlIIllIIll("multiplayer.stopSleeping", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (n == 1) {
            this.IIIllIIlIIIIIIlIlIIllIIlI();
        } else if (n != 28 && n != 156) {
            super.lllIIIllIIIIlllIlIIllIIll(c, n);
        } else {
            String string = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl().trim();
            if (!string.isEmpty()) {
                this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(string);
            }
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("");
            this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIIIIlIIlllIllIII();
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            this.IIIllIIlIIIIIIlIlIIllIIlI();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_11972);
        }
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
        class_1764 class_17642 = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl;
        class_17642.lllIIIllIIIIlllIlIIllIIll(new class_1233(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII, 3));
    }
}

