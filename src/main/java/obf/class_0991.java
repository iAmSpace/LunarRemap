package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0991
extends class_0442 {
    private int lllIIIlllIlllIIlIllllIIlI;
    class_0938 lIIIlIllllIlllIIIIIllIIIl;
    private int lIIlIlllIIlllIIlllIIlIlII;
    private int lIIlIIIlIlIIlllIlIllIllIl;

    public class_0991(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(1.4f, 2.9f);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_1778(this, 1.0, true));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0779(this, 0.9, 32.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_0419(this, 0.6, true));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_0649(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0304(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0454(this, 0.6));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0235(this, class_0814.class, 6.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0558(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0692(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0366(this, false));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(3, new class_1524(this, class_0339.class, 0, false, true, class_1310.b_));
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)0);
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void lIIlIlIlIlIllIIlIIllllIll() {
        if (--this.lllIIIlllIlllIIlIllllIIlI <= 0) {
            this.lllIIIlllIlllIIlIllllIIlI = 70 + this.IlllIIlllllllIIllIlIllllI.nextInt(50);
            this.lIIIlIllllIlllIIIIIllIIIl = this.lIlIllIIlIIlIIlIIlIIlIIll.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl), 32);
            if (this.lIIIlIllllIlllIIIIIllIIIl == null) {
                this.IlIIIlIIIIllIIIllIIIIIIll();
            } else {
                class_2208 class_22082 = this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll();
                this.lllIIIllIIIIlllIlIIllIIll(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl, (int)((float)this.lIIIlIllllIlllIIIIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl() * 0.6f));
            }
        }
        super.lIIlIlIlIlIllIIlIIllllIll();
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(100.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.25);
    }

    @Override
    protected int llIIlllIllIllllIIIlIIIIII(int n) {
        return n;
    }

    @Override
    protected void lllIIlIIIllllllIIIIlIlIlI(class_1521 class_15212) {
        if (class_15212 instanceof class_1310 && this.IlllIIIlIIlIIIIllllIllllI().nextInt(20) == 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1965)class_15212);
        }
        super.lllIIlIIIllllllIIIIlIlIlI(class_15212);
    }

    @Override
    public void d_() {
        int n;
        int n2;
        int n3;
        Block class_05492;
        super.d_();
        if (this.lIIlIlllIIlllIIlllIIlIlII > 0) {
            --this.lIIlIlllIIlllIIlllIIlIlII;
        }
        if (this.lIIlIIIlIlIIlllIlIllIllIl > 0) {
            --this.lIIlIIIlIlIIlllIlIllIllIl;
        }
        if (this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl > 2.500000277905201E-7 && this.IlllIIlllllllIIllIlIllllI.nextInt(5) == 0 && (class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)0.2f - (double)this.llllIlIIIIIIIIIlllIIlIIIl), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("blockcrack_" + Block.lllIIIllIIIIlllIlIIllIIll(class_05492) + "_" + this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n3, n2, n), this.IlIIlllllIIlIlIlllllIllll + ((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.1, this.IllIIIIllIIllIllIlllIlIIl + ((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, 4.0 * ((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5), 0.5, ((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * 4.0);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(Class class_) {
        return this.IIlIlIlIIlllIIIlIIIIlIIIl() && class_0814.class.isAssignableFrom(class_) ? false : super.lllIIIllIIIIlllIlIIllIIll(class_);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("PlayerCreated", this.IIlIlIlIIlllIIIlIIIIlIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IIIllIllIIlIlIlIlIllllIIl(class_07752.lllIIlIIIllllllIIIIlIlIlI("PlayerCreated"));
    }

    @Override
    public boolean llIIllIllIlIIlIIllIllllll(class_1521 class_15212) {
        this.lIIlIlllIIlllIIlllIIlIlII = 10;
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)4);
        boolean bl = class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this), (float)(7 + this.IlllIIlllllllIIllIlIllllI.nextInt(15)));
        if (bl) {
            class_15212.IIlIIlIlIlIllIIlIlIIIIlll += (double)0.4f;
        }
        this.lllIIIllIIIIlllIlIIllIIll("mob.irongolem.throw", 1.0f, 1.0f);
        return bl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 4) {
            this.lIIlIlllIIlllIIlllIIlIlII = 10;
            this.lllIIIllIIIIlllIlIIllIIll("mob.irongolem.throw", 1.0f, 1.0f);
        } else if (by == 11) {
            this.lIIlIIIlIlIIlllIlIllIllIl = 400;
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    public class_0938 lllIIIlIllIlllIlIIllIllIl() {
        return this.lIIIlIllllIlllIIIIIllIIIl;
    }

    public int IIlIlIIIIlIlllIIlIIlIIIII() {
        return this.lIIlIlllIIlllIIlllIIlIlII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIIlIIIlIlIIlllIlIllIllIl = bl ? 400 : 0;
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)11);
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.irongolem.hit";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.irongolem.death";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.irongolem.walk", 1.0f, 1.0f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2;
        int n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(3);
        for (n2 = 0; n2 < n3; ++n2) {
            this.lllIIIllIIIIlllIlIIllIIll(Item.getItemFromBlock(Blocks.IIIIlIIlIIIllIIIIllIIIlII), 1, 0.0f);
        }
        n2 = 3 + this.IlllIIlllllllIIllIlIllllI.nextInt(3);
        for (int i = 0; i < n2; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.iron_ingot, 1);
        }
    }

    public int lIllIIlllIIIlIlIIIlllIlIl() {
        return this.lIIlIIIlIlIIlllIlIllIllIl;
    }

    public boolean IIlIlIlIIlllIIIlIIIIlIIIl() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 1) != 0;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by | 1));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & 0xFFFFFFFE));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        if (!this.IIlIlIlIIlllIIIlIIIIlIIIl() && this.IllIlIlIIIlIllIlIlIIlllII != null && this.lIIIlIllllIlllIIIIIllIIIl != null) {
            this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this.IllIlIlIIIlIllIlIlIIlllII.llllIIIIlIIIlIIIIIIlIllll(), -5);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
    }
}

