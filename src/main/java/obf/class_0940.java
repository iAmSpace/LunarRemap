package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_0940
extends class_1327 {
    private class_1817 lllIIIllIIIIlllIlIIllIIll;
    private class_0991 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;

    public class_0940(class_1817 class_18172) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18172;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll.u_() >= 0) {
            return false;
        }
        if (!this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lIIIIlIlIIlllllIIllIIlIII()) {
            return false;
        }
        List list = this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0991.class, this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(6.0, 2.0, 6.0));
        if (list.isEmpty()) {
            return false;
        }
        for (class_0991 class_09912 : list) {
            if (class_09912.lIllIIlllIIIlIlIIIlllIlIl() <= 0) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl = class_09912;
            break;
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl != null;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lIllIIlllIIIlIlIIIlllIlIl() > 0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(320);
        this.lIlllIlllIIIIlIIlllIllIII = false;
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, 30.0f, 30.0f);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lIllIIlllIIIlIlIIIlllIlIl() == this.IlIllllllIIlIIllllIIlIIIl) {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, 0.5);
            this.lIlllIlllIIIIlIIlllIllIII = true;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII && this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl) < 4.0) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(false);
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
        }
    }
}

