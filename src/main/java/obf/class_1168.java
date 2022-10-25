package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1168
extends class_1252
implements class_1310 {
    public class_1168(class_1334 class_13342) {
        super(class_13342);
        this.IIIllIIlIIIIIIlIlIIllIIlI = 5;
    }

    @Override
    public void d_() {
        this.lIlIlllIllllIIlllIlllIIIl();
        float f = this.lllIlIIlIIIlIlIIIllIlllIl(1.0f);
        if (f > 0.5f) {
            this.lIIlIlllIIlIIIIlIlIIIIlll += 2;
        }
        super.d_();
    }

    @Override
    public void s_() {
        super.s_();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lllIIIllIIIIlllIlIIllIIll) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    protected String IIIIlIlIIlIIIIlIlllIlIIII() {
        return "game.hostile.swim";
    }

    @Override
    protected String lIIIlIIIlIlllIllIIIlIIIlI() {
        return "game.hostile.swim.splash";
    }

    @Override
    protected class_1521 IllIIlllllllIIlIIlIIIIlIl() {
        class_0814 class_08142 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, 16.0);
        return class_08142 != null && this.IlIlllIIIIIIlIIllIIllIlll(class_08142) ? class_08142 : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (super.lllIIIllIIIIlllIlIIllIIll(class_00582, f)) {
            class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
            if (this.lIlIlIIlIIIIlIIIIIlllIIII != class_15212 && this.IlIIIlIIIIllIIIllIIIIIIll != class_15212) {
                if (class_15212 != this) {
                    this.IlIllllllIIlIIllllIIlIIIl = class_15212;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "game.hostile.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "game.hostile.die";
    }

    @Override
    protected String lllllIlllIIllIlIIlIIIllII(int n) {
        return n > 4 ? "game.hostile.hurt.fall.big" : "game.hostile.hurt.fall.small";
    }

    @Override
    public boolean llIIllIllIlIIlIIllIllllll(class_1521 class_15212) {
        boolean bl;
        float f = (float)this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll).IlIIIIIllllllIIlllIllllll();
        int n = 0;
        if (class_15212 instanceof class_1965) {
            f += class_1250.lllIIIllIIIIlllIlIIllIIll((class_1965)this, (class_1965)class_15212);
            n += class_1250.lllIlIIlIIIlIlIIIllIlllIl((class_1965)this, (class_1965)class_15212);
        }
        if (bl = class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this), f)) {
            int n2;
            if (n > 0) {
                class_15212.IllIIlllllllIIlIIlIIIIlIl(-MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f) * (float)n * 0.5f, 0.1, MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f) * (float)n * 0.5f);
                this.IIIIIIIIlIllIIllIIlllIllI *= 0.6;
                this.llIIIlllIlllIlIllIIIIllIl *= 0.6;
            }
            if ((n2 = class_1250.lllIIIllIIIIlllIlIIllIIll(this)) > 0) {
                class_15212.IlIIIIIllllllIIlllIllllll(n2 * 4);
            }
            if (class_15212 instanceof class_1965) {
                class_1250.lllIIIllIIIIlllIlIIllIIll((class_1965)class_15212, (class_1521)this);
            }
            class_1250.lllIlIIlIIIlIlIIIllIlllIl((class_1965)this, class_15212);
        }
        return bl;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
        if (this.lIlIIlllllIlllllIlIIIllll <= 0 && f < 2.0f && class_15212.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll > this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl && class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl < this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll) {
            this.lIlIIlllllIlllllIlIIIllll = 20;
            this.llIIllIllIlIIlIIllIllllll(class_15212);
        }
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return 0.5f - this.lIlIllIIlIIlIIlIIlIIlIIll.llIIlllIllIllllIIIlIIIIII(n, n2, n3);
    }

    protected boolean t_() {
        int n;
        int n2;
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIIIllIIIIlllIlIIllIIll, n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)) > this.IlllIIlllllllIIllIlIllllI.nextInt(32)) {
            return false;
        }
        int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIllIIIIlIlIlIllIIlll(n3, n2, n);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl()) {
            int n5 = this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIlllllllIIlIIlIIIIlIl;
            this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIlllllllIIlIIlIIIIlIl = 10;
            n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIllIIIIlIlIlIllIIlll(n3, n2, n);
            this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIlllllllIIlIIlIIIIlIl = n5;
        }
        return n4 <= this.IlllIIlllllllIIllIlIllllI.nextInt(8);
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lllIIIllIIIIlllIlIIllIIll && this.t_() && super.lllIIlIIIllllllIIIIlIlIlI();
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lIlIllllIlIIIIIllIIIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(class_1152.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    protected boolean lllIlIIllllIllIIIlIlIIIll() {
        return true;
    }
}

