package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0673
extends class_2094 {
    private class_1801 lllIIIlllIlllIIlIllllIIlI;

    public class_0673(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.6f, 0.8f);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, this.lIIIlIllllIlllIIIIIllIIIl);
        this.lllIIIlllIlllIIlIllllIIlI = new class_1801(this, 0.6, Items.IllIlllIIIlllllIllIIlIlIl, true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, this.lllIIIlllIlllIIlIllllIIlI);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1365(this, class_0814.class, 16.0f, 0.8, 1.33));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0820(this, 1.0, 10.0f, 5.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_1590(this, 1.33));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_1963(this, 0.3f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0438(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(9, new class_0303(this, 0.8));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(10, new class_0454(this, 0.8));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(11, new class_0235(this, class_0814.class, 10.0f));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_2032(this, class_1554.class, 750, false));
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18, (Object)0);
    }

    @Override
    public void lIIlIlIlIlIllIIlIIllllIll() {
        if (this.lIlllIlllIlIIIIlllIlIlIIl().lllIIIllIIIIlllIlIIllIIll()) {
            double d = this.lIlllIlllIlIIIIlllIlIlIIl().lllIlIIlIIIlIlIIIllIlllIl();
            if (d == 0.6) {
                this.lIlllIlllIIIIlIIlllIllIII(true);
                this.lllIlIIlIIIlIlIIIllIlllIl(false);
            } else if (d == 1.33) {
                this.lIlllIlllIIIIlIIlllIllIII(false);
                this.lllIlIIlIIIlIlIIIllIlllIl(true);
            } else {
                this.lIlllIlllIIIIlIIlllIllIII(false);
                this.lllIlIIlIIIlIlIIIllIlllIl(false);
            }
        } else {
            this.lIlllIlllIIIIlIIlllIllIII(false);
            this.lllIlIIlIIIlIlIIIllIlllIl(false);
        }
    }

    @Override
    protected boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return !this.lllIIIIlIIllIIIlIllIlllII() && this.IlllIIIllllIIllIllIlIIlIl > 2400;
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(10.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.3f);
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CatType", this.IIlIlIlIIlllIIIlIIIIlIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lIIlIIIIIlIlllIlIIlIlIlll(class_07752.lIllllIIlIIIlIllllllIIIll("CatType"));
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return this.lllIIIIlIIllIIIlIllIlllII() ? (this.IIlIlIIIIlIlllIIlIIlIIIII() ? "mob.cat.purr" : (this.IlllIIlllllllIIllIlIllllI.nextInt(4) == 0 ? "mob.cat.purreow" : "mob.cat.meow")) : "";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.cat.hitt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.cat.hitt";
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 0.4f;
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.leather;
    }

    @Override
    public boolean llIIllIllIlIIlIIllIllllll(class_1521 class_15212) {
        return class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this), 3.0f);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(false);
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (this.lllIIIIlIIllIIIlIllIlllII()) {
            if (this.IlIIIIIllllllIIlllIllllll((class_1965)class_08142) && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IlIllllllIIlIIllllIIlIIIl(class_08972)) {
                this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(!this.IlIllIIIIllllIIllIllIIIIl());
            }
        } else if (this.lllIIIlllIlllIIlIllllIIlI.IllIIlllllllIIlIIlIIIIlIl() && class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IllIlllIIIlllllIllIIlIlIl && class_08142.IlIIIIIllllllIIlllIllllll(this) < 9.0) {
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                if (this.IlllIIlllllllIIllIlIllllI.nextInt(3) == 0) {
                    this.IllIIIllIIIIlIlIlIllIIlll(true);
                    this.lIIlIIIIIlIlllIlIIlIlIlll(1 + this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(3));
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lIIlllIIlIlIlIIIlIlllIIll().toString());
                    this.IIIllIllIIlIlIlIlIllllIIl(true);
                    this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(true);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)7);
                } else {
                    this.IIIllIllIIlIlIlIlIllllIIl(false);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)6);
                }
            }
            return true;
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    public class_0673 lllIlIIlIIIlIlIIIllIlllIl(class_0650 class_06502) {
        class_0673 class_06732 = new class_0673(this.lIlIllIIlIIlIIlIIlIIlIIll);
        if (this.lllIIIIlIIllIIIlIllIlllII()) {
            class_06732.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl());
            class_06732.IllIIIllIIIIlIlIlIllIIlll(true);
            class_06732.lIIlIIIIIlIlllIlIIlIlIlll(this.IIlIlIlIIlllIIIlIIIIlIIIl());
        }
        return class_06732;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IllIlllIIIlllllIllIIlIlIl;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0003 class_00032) {
        if (class_00032 == this) {
            return false;
        }
        if (!this.lllIIIIlIIllIIIlIllIlllII()) {
            return false;
        }
        if (!(class_00032 instanceof class_0673)) {
            return false;
        }
        class_0673 class_06732 = (class_0673)class_00032;
        return !class_06732.lllIIIIlIIllIIIlIllIlllII() ? false : this.IIlIlIIIIlIlllIIlIIlIIIII() && class_06732.IIlIlIIIIlIlllIIlIIlIIIII();
    }

    public int IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18);
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(18, (byte)n);
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(3) == 0) {
            return false;
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI) && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI).isEmpty() && !this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(this.IIllIllIIllIIlllIIIlIlllI)) {
            int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
            int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl);
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
            if (n2 < 63) {
                return false;
            }
            Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2 - 1, n3);
            if (class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        return this.IllIlIlIIIlIllIlIlIIlllII() ? this.llllIIllllIllIlllllIIlIlI() : (this.lllIIIIlIIllIIIlIllIlllII() ? class_1586.lllIIIllIIIIlllIlIIllIIll("entity.Cat.name") : super.llllIIIIlIIIlIIIIIIlIllll());
    }

    @Override
    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        class_20252 = super.lllIIIllIIIIlllIlIIllIIll(class_20252);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(7) == 0) {
            for (int i = 0; i < 2; ++i) {
                class_0673 class_06732 = new class_0673(this.lIlIllIIlIIlIIlIIlIIlIIll);
                class_06732.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, 0.0f);
                class_06732.lllIlIIlIIIlIlIIIllIlllIl(-24000);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_06732);
            }
        }
        return class_20252;
    }

    @Override
    public /* synthetic */ class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_06502);
    }
}

