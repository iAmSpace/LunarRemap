package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2105
extends class_0339
implements class_1310 {
    public float lllIIIllIIIIlllIlIIllIIll;
    public float lllIlIIlIIIlIlIIIllIlllIl;
    public float IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_2105(class_1334 class_13342) {
        super(class_13342);
        int n = 1 << this.IlllIIlllllllIIllIlIllllI.nextInt(3);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        this.lIlllIlllIIIIlIIlllIllIII = this.IlllIIlllllllIIllIlIllllI.nextInt(20) + 10;
        this.lllIIIllIIIIlllIlIIllIIll(n);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, new Byte(1));
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, new Byte((byte)n));
        this.IlIIIIIllllllIIlllIllllll(0.6f * (float)n, 0.6f * (float)n);
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(n * n);
        this.IllIIIllIIIIlIlIlIllIIlll(this.IIllllIIlIlIlIlllIIIllIIl());
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
    }

    public int IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Size", this.IlIIIlIIIIllIIIllIIIIIIll() - 1);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        int n = class_07752.lIllllIIlIIIlIllllllIIIll("Size");
        if (n < 0) {
            n = 0;
        }
        this.lllIIIllIIIIlllIlIIllIIll(n + 1);
    }

    protected String IlIIIIIllllllIIlllIllllll() {
        return "slime";
    }

    protected String IlIlIIlllIIlIllIIIlllllIl() {
        return "mob.slime." + (this.IlIIIlIIIIllIIIllIIIIIIll() > 1 ? "big" : "small");
    }

    @Override
    public void s_() {
        int n;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lllIIIllIIIIlllIlIIllIIll && this.IlIIIlIIIIllIIIllIIIIIIll() > 0) {
            this.IllllIIIIlIIlIIIIlllIIIIl = true;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl += (this.lllIIIllIIIIlllIlIIllIIll - this.lllIlIIlIIIlIlIIIllIlllIl) * 0.5f;
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl = this.llllllIlIllllIlIlIlIIIIlI;
        super.s_();
        if (this.llllllIlIllllIlIlIlIIIIlI && !bl) {
            n = this.IlIIIlIIIIllIIIllIIIIIIll();
            for (int i = 0; i < n * 8; ++i) {
                float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * (float)Math.PI * 2.0f;
                float f2 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.5f + 0.5f;
                float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * (float)n * 0.5f * f2;
                float f4 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * (float)n * 0.5f * f2;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll(), this.IlIIlllllIIlIlIlllllIllll + (double)f3, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, this.IllIIIIllIIllIllIlllIlIIl + (double)f4, 0.0, 0.0, 0.0);
            }
            if (this.lIlIlIIlIIIIlIIIIIlllIIII()) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl(), this.IIlIlIIIIlIlllIlIlIIIIIlI(), ((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            }
            this.lllIIIllIIIIlllIlIIllIIll = -0.5f;
        } else if (!this.llllllIlIllllIlIlIlIIIIlI && bl) {
            this.lllIIIllIIIIlllIlIIllIIll = 1.0f;
        }
        this.IlIlllIIIIIIlIIllIIllIlll();
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            n = this.IlIIIlIIIIllIIIllIIIIIIll();
            this.IlIIIIIllllllIIlllIllllll(0.6f * (float)n, 0.6f * (float)n);
        }
    }

    @Override
    protected void llIIlIlIlllIIllIlIlllIllI() {
        this.IllIlllIIIlllllIllIIlIlIl();
        class_0814 class_08142 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, 16.0);
        if (class_08142 != null) {
            this.lllIIIllIIIIlllIlIIllIIll(class_08142, 10.0f, 20.0f);
        }
        if (this.llllllIlIllllIlIlIlIIIIlI && this.lIlllIlllIIIIlIIlllIllIII-- <= 0) {
            this.lIlllIlllIIIIlIIlllIllIII = this.IllIIlllllllIIlIIlIIIIlIl();
            if (class_08142 != null) {
                this.lIlllIlllIIIIlIIlllIllIII /= 3;
            }
            this.llIllIlllIllIlIIIIlIIlIII = true;
            if (this.IIlllIlIlllIllIIIlllIIlIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl(), this.IIlIlIIIIlIlllIlIlIIIIIlI(), ((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f) * 0.8f);
            }
            this.IlllIIIlIIlIIIIllllIllllI = 1.0f - this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f;
            this.llIlIIIlllIIIllIllllIIIll = 1 * this.IlIIIlIIIIllIIIllIIIIIIll();
        } else {
            this.llIllIlllIllIlIIIIlIIlIII = false;
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                this.llIlIIIlllIIIllIllllIIIll = 0.0f;
                this.IlllIIIlIIlIIIIllllIllllI = 0.0f;
            }
        }
    }

    protected void IlIlllIIIIIIlIIllIIllIlll() {
        this.lllIIIllIIIIlllIlIIllIIll *= 0.6f;
    }

    protected int IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlllIIlllllllIIllIlIllllI.nextInt(20) + 10;
    }

    protected class_2105 lIllllIIlIIIlIllllllIIIll() {
        return new class_2105(this.lIlIllIIlIIlIIlIIlIIlIIll);
    }

    @Override
    public void IIIIlIIlIIIllIIIIllIIIlII() {
        int n = this.IlIIIlIIIIllIIIllIIIIIIll();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && n > 1 && this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            int n2 = 2 + this.IlllIIlllllllIIllIlIllllI.nextInt(3);
            for (int i = 0; i < n2; ++i) {
                float f = ((float)(i % 2) - 0.5f) * (float)n / 4.0f;
                float f2 = ((float)(i / 2) - 0.5f) * (float)n / 4.0f;
                class_2105 class_21052 = this.lIllllIIlIIIlIllllllIIIll();
                class_21052.lllIIIllIIIIlllIlIIllIIll(n / 2);
                class_21052.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll + (double)f, this.llIIlIlIlllIIllIlIlllIllI + 0.5, this.IllIIIIllIIllIllIlllIlIIl + (double)f2, this.IlllIIlllllllIIllIlIllllI.nextFloat() * 360.0f, 0.0f);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_21052);
            }
        }
        super.IIIIlIIlIIIllIIIIllIIIlII();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl()) {
            int n = this.IlIIIlIIIIllIIIllIIIIIIll();
            if (this.IlIlllIIIIIIlIIllIIllIlll(class_08142) && this.IlIIIIIllllllIIlllIllllll((class_1521)class_08142) < 0.6 * (double)n * 0.6 * (double)n && class_08142.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this), (float)this.lllllIlllIIllIlIIlIIIllII())) {
                this.lllIIIllIIIIlllIlIIllIIll("mob.attack", 1.0f, (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f);
            }
        }
    }

    protected boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.IlIIIlIIIIllIIIllIIIIIIll() > 1;
    }

    protected int lllllIlllIIllIlIIlIIIllII() {
        return this.IlIIIlIIIIllIIIllIIIIIIll();
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.slime." + (this.IlIIIlIIIIllIIIllIIIIIIll() > 1 ? "big" : "small");
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.slime." + (this.IlIIIlIIIIllIIIllIIIIIIll() > 1 ? "big" : "small");
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return this.IlIIIlIIIIllIIIllIIIIIIll() == 1 ? Items.lIIlllIIlIlIlIIIlIlllIIll : Item.lllIIIllIIIIlllIlIIllIIll(0);
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        class_0723 class_07232 = this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIlIIIIlllIlIlIIl().IlIIIlIIIIllIIIllIIIIIIll() == class_1074.IlIllllllIIlIIllllIIlIIIl && this.IlllIIlllllllIIllIlIllllI.nextInt(4) != 1) {
            return false;
        }
        if (this.IlIIIlIIIIllIIIllIIIIIIll() == 1 || this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lllIIIllIIIIlllIlIIllIIll) {
            class_0672 class_06722 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
            if (class_06722 == class_0672.IlIIIlIIIIllIIIllIIIIIIll && this.llIIlIlIlllIIllIlIlllIllI > 50.0 && this.llIIlIlIlllIIllIlIlllIllI < 70.0 && this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.5f && this.IlllIIlllllllIIllIlIllllI.nextFloat() < this.lIlIllIIlIIlIIlIIlIIlIIll.llIIllIllIlIIlIIllIllllll() && this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIllIIIIlIlIlIllIIlll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)) <= this.IlllIIlllllllIIllIlIllllI.nextInt(8)) {
                return super.lllIIlIIIllllllIIIIlIlIlI();
            }
            if (this.IlllIIlllllllIIllIlIllllI.nextInt(10) == 0 && class_07232.lllIIIllIIIIlllIlIIllIIll(987234911L).nextInt(10) == 0 && this.llIIlIlIlllIIllIlIlllIllI < 40.0) {
                return super.lllIIlIIIllllllIIIIlIlIlI();
            }
        }
        return false;
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 0.4f * (float)this.IlIIIlIIIIllIIIllIIIIIIll();
    }

    @Override
    public int IIIlllIlIIllIIlIlIllIlIIl() {
        return 0;
    }

    protected boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IlIIIlIIIIllIIIllIIIIIIll() > 0;
    }

    protected boolean lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IlIIIlIIIIllIIIllIIIIIIll() > 2;
    }
}

