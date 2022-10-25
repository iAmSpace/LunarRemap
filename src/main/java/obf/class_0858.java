package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0858
extends class_1860 {
    private int lllIIIllIIIIlllIlIIllIIll = -1;

    public class_0858(class_1334 class_13342) {
        super(class_13342);
    }

    public class_0858(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3);
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 3;
    }

    @Override
    public Block lIlllIlllIIIIlIIlllIllIII() {
        return Blocks.tnt;
    }

    @Override
    public void s_() {
        double d;
        super.s_();
        if (this.lllIIIllIIIIlllIlIIllIIll > 0) {
            --this.lllIIIllIIIIlllIlIIllIIll;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("smoke", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + 0.5, this.IllIIIIllIIllIllIlllIlIIl, 0.0, 0.0, 0.0);
        } else if (this.lllIIIllIIIIlllIlIIllIIll == 0) {
            this.IlIllllllIIlIIllllIIlIIIl(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
        }
        if (this.lIlIIllllIlIIIIllIIIIlIIl && (d = this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl) >= (double)0.01f) {
            this.IlIllllllIIlIIllllIIlIIIl(d);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        double d = this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl;
        if (!class_00582.IlIllllllIIlIIllllIIlIIIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.tnt, 1), 0.0f);
        }
        if (class_00582.IlIlllIIIIIIlIIllIIllIlll() || class_00582.IlIllllllIIlIIllllIIlIIIl() || d >= (double)0.01f) {
            this.IlIllllllIIlIIllllIIlIIIl(d);
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl(double d) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            double d2 = Math.sqrt(d);
            if (d2 > 5.0) {
                d2 = 5.0;
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, (float)(4.0 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 1.5 * d2), true);
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
        if (f >= 3.0f) {
            float f2 = f / 10.0f;
            this.IlIllllllIIlIIllllIIlIIIl((double)(f2 * f2));
        }
        super.lIllllIIlIIIlIllllllIIIll(f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, boolean bl) {
        if (bl && this.lllIIIllIIIIlllIlIIllIIll < 0) {
            this.IlIIIIIllllllIIlllIllllll();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 10) {
            this.IlIIIIIllllllIIlllIllllll();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll = 80;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)10);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, "game.tnt.primed", 1.0f, 1.0f);
        }
    }

    public int llIIlIllIllllIlIIIIlIIlll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return this.lllIIIllIIIIlllIlIIllIIll > -1;
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(class_1013 class_10132, class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        return this.llIllllIlIllIIIlIllIIlIlI() && (class_0609.IlIllllllIIlIIllllIIlIIIl(class_05492) || class_0609.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2 + 1, n3)) ? 0.0f : super.lllIIIllIIIIlllIlIIllIIll(class_10132, class_13342, n, n2, n3, class_05492);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1013 class_10132, class_1334 class_13342, int n, int n2, int n3, Block class_05492, float f) {
        return this.llIllllIlIllIIIlIllIIlIlI() && (class_0609.IlIllllllIIlIIllllIIlIIIl(class_05492) || class_0609.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2 + 1, n3)) ? false : super.lllIIIllIIIIlllIlIIllIIll(class_10132, class_13342, n, n2, n3, class_05492, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("TNTFuse", 99)) {
            this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("TNTFuse");
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TNTFuse", this.lllIIIllIIIIlllIlIIllIIll);
    }
}

