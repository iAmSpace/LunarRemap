package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1051
extends class_1168 {
    public class_1051(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(1.4f, 0.9f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, new Byte(0));
    }

    @Override
    public void s_() {
        super.s_();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIIllllIlIIIIllIIIIlIIl);
        }
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(16.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.8f);
    }

    @Override
    protected class_1521 IllIIlllllllIIlIIlIIIIlIl() {
        float f = this.lllIlIIlIIIlIlIIIllIlllIl(1.0f);
        if (f < 0.5f) {
            double d = 16.0;
            return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, d);
        }
        return null;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.spider.say";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.spider.say";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.spider.death";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.spider.step", 0.15f, 1.0f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
        float f2 = this.lllIlIIlIIIlIlIIIllIlllIl(1.0f);
        if (f2 > 0.5f && this.IlllIIlllllllIIllIlIllllI.nextInt(100) == 0) {
            this.IlIllllllIIlIIllllIIlIIIl = null;
        } else if (f > 2.0f && f < 6.0f && this.IlllIIlllllllIIllIlIllllI.nextInt(10) == 0) {
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                double d = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
                double d2 = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
                float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2);
                this.IIIIIIIIlIllIIllIIlllIllI = d / (double)f3 * 0.5 * (double)0.8f + this.IIIIIIIIlIllIIllIIlllIllI * (double)0.2f;
                this.llIIIlllIlllIlIllIIIIllIl = d2 / (double)f3 * 0.5 * (double)0.8f + this.llIIIlllIlllIlIllIIIIllIl * (double)0.2f;
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.4f;
            }
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_15212, f);
        }
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.llIIIlllIlllIlIllIIIIllIl;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(bl, n);
        if (bl && (this.IlllIIlllllllIIllIlIllllI.nextInt(3) == 0 || this.IlllIIlllllllIIllIlIllllI.nextInt(1 + n) > 0)) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.lllIlIIllllIIllIIIIllIlIl, 1);
        }
    }

    @Override
    public boolean h_() {
        return this.lllIIIlIllIlllIlIIllIllIl();
    }

    @Override
    public void IlIIIlIIlllllIIIllIlIlIll() {
    }

    @Override
    public class_0529 IIlllllIIlIIlIlIIlIIlIlII() {
        return class_0529.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1852 class_18522) {
        return class_18522.lllIIIllIIIIlllIlIIllIIll() == class_0700.IlIIIlIIIIllIIIllIIIIIIll.IlIlIIlllIllllllllIIIlIlI ? false : super.lllIlIIlIIIlIlIIIllIlllIl(class_18522);
    }

    public boolean lllIIIlIllIlllIlIIllIllIl() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 1) != 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        by = bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, by);
    }

    @Override
    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        int n;
        class_2025 class_20253 = super.lllIIIllIIIIlllIlIIllIIll(class_20252);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(100) == 0) {
            class_0630 class_06302 = new class_0630(this.lIlIllIIlIIlIIlIIlIIlIIll);
            class_06302.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, 0.0f);
            class_06302.lllIIIllIIIIlllIlIIllIIll((class_2025)null);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_06302);
            class_06302.lllIIIllIIIIlllIlIIllIIll((class_1521)this);
        }
        if (class_20253 == null) {
            class_20253 = new class_1839();
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII && this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() < 0.1f * this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl)) {
                ((class_1839)class_20253).lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII);
            }
        }
        if (class_20253 instanceof class_1839 && (n = ((class_1839)class_20253).lllIIIllIIIIlllIlIIllIIll) > 0 && class_0700.lllIIIllIIIIlllIlIIllIIll[n] != null) {
            this.lllIIIllIIIIlllIlIIllIIll(new class_1852(n, Integer.MAX_VALUE));
        }
        return class_20253;
    }
}

