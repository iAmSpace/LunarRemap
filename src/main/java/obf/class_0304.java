package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0304
extends class_1327 {
    private class_0991 lllIIIllIIIIlllIlIIllIIll;
    private class_1817 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    public class_0304(class_0991 class_09912) {
        this.lllIIIllIIIIlllIlIIllIIll = class_09912;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (!this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lIIIIlIlIIlllllIIllIIlIII()) {
            return false;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(8000) != 0) {
            return false;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = (class_1817)this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1817.class, this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(6.0, 2.0, 6.0), (class_1521)this.lllIIIllIIIIlllIlIIllIIll);
        return this.lllIlIIlIIIlIlIIIllIlllIl != null;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl > 0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIllllllIIlIIllllIIlIIIl = 400;
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(false);
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, 30.0f, 30.0f);
        --this.IlIllllllIIlIIllllIIlIIIl;
    }
}

