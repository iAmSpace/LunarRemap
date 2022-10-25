package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1775
extends class_1860 {
    private int IlIllllllIIlIIllllIIlIIIl;
    public double lllIIIllIIIIlllIlIIllIIll;
    public double lllIlIIlIIIlIlIIIllIlllIl;

    public class_1775(class_1334 class_13342) {
        super(class_13342);
    }

    public class_1775(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3);
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 2;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, new Byte(0));
    }

    @Override
    public void s_() {
        super.s_();
        if (this.IlIllllllIIlIIllllIIlIIIl > 0) {
            --this.IlIllllllIIlIIllllIIlIIIl;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl <= 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl = 0.0;
            this.lllIIIllIIIIlllIlIIllIIll = 0.0;
        }
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl > 0);
        if (this.IlIIIIIllllllIIlllIllllll() && this.IlllIIlllllllIIllIlIllllI.nextInt(4) == 0) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("largesmoke", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + 0.8, this.IllIIIIllIIllIllIlllIlIIl, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        if (!class_00582.IlIllllllIIlIIllllIIlIIIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.furnace, 1), 0.0f);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, double d, double d2, Block class_05492, int n4) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, d, d2, class_05492, n4);
        double d3 = this.lllIIIllIIIIlllIlIIllIIll * this.lllIIIllIIIIlllIlIIllIIll + this.lllIlIIlIIIlIlIIIllIlllIl * this.lllIlIIlIIIlIlIIIllIlllIl;
        if (d3 > 1.0E-4 && this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl > 0.001) {
            d3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d3);
            this.lllIIIllIIIIlllIlIIllIIll /= d3;
            this.lllIlIIlIIIlIlIIIllIlllIl /= d3;
            if (this.lllIIIllIIIIlllIlIIllIIll * this.IIIIIIIIlIllIIllIIlllIllI + this.lllIlIIlIIIlIlIIIllIlllIl * this.llIIIlllIlllIlIllIIIIllIl < 0.0) {
                this.lllIIIllIIIIlllIlIIllIIll = 0.0;
                this.lllIlIIlIIIlIlIIIllIlllIl = 0.0;
            } else {
                this.lllIIIllIIIIlllIlIIllIIll = this.IIIIIIIIlIllIIllIIlllIllI;
                this.lllIlIIlIIIlIlIIIllIlllIl = this.llIIIlllIlllIlIllIIIIllIl;
            }
        }
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll() {
        double d = this.lllIIIllIIIIlllIlIIllIIll * this.lllIIIllIIIIlllIlIIllIIll + this.lllIlIIlIIIlIlIIIllIlllIl * this.lllIlIIlIIIlIlIIIllIlllIl;
        if (d > 1.0E-4) {
            d = MathHelper.lllIIIllIIIIlllIlIIllIIll(d);
            this.lllIIIllIIIIlllIlIIllIIll /= d;
            this.lllIlIIlIIIlIlIIIllIlllIl /= d;
            double d2 = 0.05;
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.8f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.0;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.8f;
            this.IIIIIIIIlIllIIllIIlllIllI += this.lllIIIllIIIIlllIlIIllIIll * d2;
            this.llIIIlllIlllIlIllIIIIllIl += this.lllIlIIlIIIlIlIIIllIlllIl * d2;
        } else {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.98f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.0;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.98f;
        }
        super.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public boolean b_(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IllIIlllllllIIlIIlIIIIlIl) {
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && --class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
            }
            this.IlIllllllIIlIIllllIIlIIIl += 3600;
        }
        this.lllIIIllIIIIlllIlIIllIIll = this.IlIIlllllIIlIlIlllllIllll - class_08142.IlIIlllllIIlIlIlllllIllll;
        this.lllIlIIlIIIlIlIIIllIlllIl = this.IllIIIIllIIllIllIlllIlIIl - class_08142.IllIIIIllIIllIllIlllIlIIl;
        return true;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("PushX", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("PushZ", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Fuel", (short)this.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.IIIllIllIIlIlIlIlIllllIIl("PushX");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.IIIllIllIIlIlIlIlIllllIIl("PushZ");
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.IlIIIIIllllllIIlllIllllll("Fuel");
    }

    protected boolean IlIIIIIllllllIIlllIllllll() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 1) != 0;
    }

    protected void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) | 1));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 0xFFFFFFFE));
        }
    }

    @Override
    public Block lIlllIlllIIIIlIIlllIllIII() {
        return Blocks.llllIlIIllIIlllllIIllIIll;
    }

    @Override
    public int IlIlIIlllIIlIllIIIlllllIl() {
        return 2;
    }
}

