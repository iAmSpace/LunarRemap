package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.UUID;

public class class_0066
extends class_1168
implements class_2176 {
    private static final UUID lIIIlIllllIlllIIIIIllIIIl = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
    private static final class_1256 lllIIIlllIlllIIlIllllIIlI = new class_1256(lIIIlIllllIlllIIIIIllIIIl, "Drinking speed penalty", -0.25, 0).lllIIIllIIIIlllIlIIllIIll(false);
    private static final Item[] lIIlIlllIIlllIIlllIIlIlII = new Item[]{Items.IIIIIIlIIIIIIIIIIlIlIlIlI, Items.llIIIlIIllIIllIllIIlIlllI, Items.lIIIlIIllIllIIlIIlIIIllII, Items.lllIlIIllllIIllIIIIllIlIl, Items.lIIlllIIIlIIlIllIIIIIlIlI, Items.IlIlIIlllIllllllllIIIlIlI, Items.llIllllIlIllIIIlIllIIlIlI, Items.llIllllIlIllIIIlIllIIlIlI};
    private int lIIlIIIlIlIIlllIlIllIllIl;

    public class_0066(class_1334 class_13342) {
        super(class_13342);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1997(this, 1.0, 60, 10.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_0235(this, class_0814.class, 8.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_0558(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0366(this, false));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1524(this, class_0814.class, 0, true));
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(21, (Object)0);
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.witch.idle";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.witch.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.witch.death";
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(21, (byte)(bl ? 1 : 0));
    }

    public boolean lllIIIlIllIlllIlIIllIllIl() {
        return this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(21) == 1;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(26.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.25);
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    public void d_() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (this.lllIIIlIllIlllIlIIllIllIl()) {
                if (this.lIIlIIIlIlIIlllIlIllIllIl-- <= 0) {
                    List list;
                    this.lllIIIllIIIIlllIlIIllIIll(false);
                    ItemStack class_08972 = this.lIIIIlIlIlIIIlIIllIIlIlIl();
                    this.lllIIIllIIIIlllIlIIllIIll(0, null);
                    if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.potionitem && (list = Items.potionitem.llIIllIllIlIIlIIllIllllll(class_08972)) != null) {
                        for (class_1852 class_18522 : list) {
                            this.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_18522));
                        }
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl(lllIIIlllIlllIIlIllllIIlI);
                }
            } else {
                int n = -1;
                if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.15f && this.lllIIIllIIIIlllIlIIllIIll(class_1855.IllIIlllllllIIlIIlIIIIlIl) && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIlllIIIIIIlIIllIIllIlll)) {
                    n = 8237;
                } else if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.15f && this.llIIIIIlIIlIIIIllIIIlIIII() && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllIIlIIIllllllIIIIlIlIlI)) {
                    n = 16307;
                } else if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.05f && this.lllIIIlllIlllIIlIllllIIlI() < this.IIllllIIlIlIlIlllIIIllIIl()) {
                    n = 16341;
                } else if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.25f && this.IIIIlIllIlIIlIIlIllIlIlll() != null && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIllllllIIlIIllllIIlIIIl) && this.IIIIlIllIlIIlIIlIllIlIlll().IlIIIIIllllllIIlllIllllll(this) > 121.0) {
                    n = 16274;
                } else if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.25f && this.IIIIlIllIlIIlIIlIllIlIlll() != null && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIllllllIIlIIllllIIlIIIl) && this.IIIIlIllIlIIlIIlIllIlIlll().IlIIIIIllllllIIlllIllllll(this) > 121.0) {
                    n = 16274;
                }
                if (n > -1) {
                    this.lllIIIllIIIIlllIlIIllIIll(0, new ItemStack(Items.potionitem, 1, n));
                    this.lIIlIIIlIlIIlllIlIllIllIl = this.lIIIIlIlIlIIIlIIllIIlIlIl().lllIIlIIIllllllIIIIlIlIlI();
                    this.lllIIIllIIIIlllIlIIllIIll(true);
                    class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII);
                    class_16852.lllIlIIlIIIlIlIIIllIlllIl(lllIIIlllIlllIIlIllllIIlI);
                    class_16852.lllIIIllIIIIlllIlIIllIIll(lllIIIlllIlllIIlIllllIIlI);
                }
            }
            if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 7.5E-4f) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)15);
            }
        }
        super.d_();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 15) {
            for (int i = 0; i < this.IlllIIlllllllIIllIlIllllI.nextInt(35) + 10; ++i) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("witchMagic", this.IlIIlllllIIlIlIlllllIllll + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.13f, this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll + 0.5 + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.13f, this.IllIIIIllIIllIllIlllIlIIl + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.13f, 0.0, 0.0, 0.0);
            }
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    @Override
    protected float lIlllIlllIIIIlIIlllIllIII(class_0058 class_00582, float f) {
        f = super.lIlllIlllIIIIlIIlllIllIII(class_00582, f);
        if (class_00582.IllIIIllIIIIlIlIlIllIIlll() == this) {
            f = 0.0f;
        }
        if (class_00582.lIIlIIIIIlIlllIlIIlIlIlll()) {
            f = (float)((double)f * 0.15);
        }
        return f;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(3) + 1;
        for (int i = 0; i < n2; ++i) {
            int n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(3);
            Item class_06112 = lIIlIlllIIlllIIlllIIlIlII[this.IlllIIlllllllIIllIlIllllI.nextInt(lIIlIlllIIlllIIlllIIlIlII.length)];
            if (n > 0) {
                n3 += this.IlllIIlllllllIIllIlIllllI.nextInt(n + 1);
            }
            for (int j = 0; j < n3; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll(class_06112, 1);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        if (!this.lllIIIlIllIlllIlIIllIllIl()) {
            class_0426 class_04262 = new class_0426(this.lIlIllIIlIIlIIlIIlIIlIIll, (class_1965)this, 32732);
            class_04262.IlIlIIlllIllllllllIIIlIlI -= -20.0f;
            double d = class_19652.IlIIlllllIIlIlIlllllIllll + class_19652.IIIIIIIIlIllIIllIIlllIllI - this.IlIIlllllIIlIlIlllllIllll;
            double d2 = class_19652.llIIlIlIlllIIllIlIlllIllI + (double)class_19652.llIIllIllIlIIlIIllIllllll() - (double)1.1f - this.llIIlIlIlllIIllIlIlllIllI;
            double d3 = class_19652.IllIIIIllIIllIllIlllIlIIl + class_19652.llIIIlllIlllIlIllIIIIllIl - this.IllIIIIllIIllIllIlllIlIIl;
            float f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3);
            if (f2 >= 8.0f && !class_19652.lllIIIllIIIIlllIlIIllIIll(class_0700.lIlllIlllIIIIlIIlllIllIII)) {
                class_04262.lllIIIllIIIIlllIlIIllIIll(32698);
            } else if (class_19652.lllIIIlllIlllIIlIllllIIlI() >= 8.0f && !class_19652.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIIIlIIIIllIIIllIIIIIIll)) {
                class_04262.lllIIIllIIIIlllIlIIllIIll(32660);
            } else if (f2 <= 3.0f && !class_19652.lllIIIllIIIIlllIlIIllIIll(class_0700.lIlIlIIlIIIIlIIIIIlllIIII) && this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.25f) {
                class_04262.lllIIIllIIIIlllIlIIllIIll(32696);
            }
            class_04262.a_(d, d2 + (double)(f2 * 0.2f), d3, 0.75f, 8.0f);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_04262);
        }
    }
}

