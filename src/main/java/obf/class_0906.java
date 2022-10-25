package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0906
extends class_1327 {
    private class_1817 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1817 IlIllllllIIlIIllllIIlIIIl;
    private class_1334 lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    class_0938 lllIIIllIIIIlllIlIIllIIll;

    public class_0906(class_1817 class_18172) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_18172;
        this.lIlllIlllIIIIlIIlllIllIII = class_18172.lIlIllIIlIIlIIlIIlIIlIIll;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.u_() != 0) {
            return false;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIlIIlIIIIllllIllllI().nextInt(500) != 0) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll = this.lIlllIlllIIIIlIIlllIllIII.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl), 0);
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            return false;
        }
        if (!this.IllIIlllllllIIlIIlIIIIlIl()) {
            return false;
        }
        class_1521 class_15212 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_1817.class, this.lllIlIIlIIIlIlIIIllIlllIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(8.0, 3.0, 8.0), (class_1521)this.lllIlIIlIIIlIlIIIllIlllIl);
        if (class_15212 == null) {
            return false;
        }
        this.IlIllllllIIlIIllllIIlIIIl = (class_1817)class_15212;
        return this.IlIllllllIIlIIllllIIlIIIl.u_() == 0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIIIIIllllllIIlllIllllll = 300;
        this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl(true);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll = null;
        this.IlIllllllIIlIIllllIIlIIIl = null;
        this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl(false);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll >= 0 && this.IllIIlllllllIIlIIlIIIIlIl() && this.lllIlIIlIIIlIlIIIllIlllIl.u_() == 0;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        --this.IlIIIIIllllllIIlllIllllll;
        this.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 10.0f, 30.0f);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl) > 2.25) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 0.25);
        } else if (this.IlIIIIIllllllIIlllIllllll == 0 && this.IlIllllllIIlIIllllIIlIIIl.IIlIlIIIIlIlllIIlIIlIIIII()) {
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIlIIlIIIIllllIllllI().nextInt(35) == 0) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIlIIlIIIlIlIIIllIlllIl, (byte)12);
        }
    }

    private boolean IllIIlllllllIIlIIlIIIIlIl() {
        if (!this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl()) {
            return false;
        }
        int n = (int)((double)this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl() * 0.35);
        return this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll() < n;
    }

    private void IIIllIllIIlIlIlIlIllllIIl() {
        class_1817 class_18172 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl);
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(6000);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(6000);
        class_18172.lllIlIIlIIIlIlIIIllIlllIl(-24000);
        class_18172.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll, this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI, this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl, 0.0f, 0.0f);
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_18172);
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((class_1521)class_18172, (byte)12);
    }
}

