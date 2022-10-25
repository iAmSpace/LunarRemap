package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Calendar;

public class class_0630
extends class_1168
implements class_2176 {
    private class_1997 lIIIlIllllIlllIIIIIllIIIl = new class_1997(this, 1.0, 20, 60, 15.0f);
    private class_1778 lllIIIlllIlllIIlIllllIIlI = new class_1778(this, class_0814.class, 1.2, false);

    public class_0630(class_1334 class_13342) {
        super(class_13342);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1062(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_0409(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0235(this, class_0814.class, 8.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0558(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0366(this, false));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1524(this, class_0814.class, 0, true));
        if (class_13342 != null && !class_13342.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIlIllIlllIlIIllIllIl();
        }
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.25);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(13, new Byte(0));
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.skeleton.say";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.skeleton.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.skeleton.death";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.skeleton.step", 0.15f, 1.0f);
    }

    @Override
    public boolean llIIllIllIlIIlIIllIllllll(class_1521 class_15212) {
        if (super.llIIllIllIlIIlIIllIllllll(class_15212)) {
            if (this.lIllIIlllIIIlIlIIIlllIlIl() == 1 && class_15212 instanceof class_1965) {
                ((class_1965)class_15212).lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlllIllllllllIIIlIlI, 200));
            }
            return true;
        }
        return false;
    }

    @Override
    public class_0529 IIlllllIIlIIlIlIIlIIlIlII() {
        return class_0529.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void d_() {
        float f;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lIIIIlIlIIlllllIIllIIlIII() && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (f = this.lllIlIIlIIIlIlIIIllIlllIl(1.0f)) > 0.5f && this.IlllIIlllllllIIllIlIllllI.nextFloat() * 30.0f < (f - 0.4f) * 2.0f && this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIlllllllIIlIIlIIIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
            boolean bl = true;
            ItemStack class_08972 = this.IlIllllllIIlIIllllIIlIIIl(4);
            if (class_08972 != null) {
                if (class_08972.lIllllIIlIIIlIllllllIIIll()) {
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_08972.IIIllIllIIlIlIlIlIllllIIl() + this.IlllIIlllllllIIllIlIllllI.nextInt(2));
                    if (class_08972.IIIllIllIIlIlIlIlIllllIIl() >= class_08972.lIIIIlIlIIlllllIIllIIlIII()) {
                        this.lllIlIIlIIIlIlIIIllIlllIl(class_08972);
                        this.lllIIIllIIIIlllIlIIllIIll(4, null);
                    }
                }
                bl = false;
            }
            if (bl) {
                this.IlIIIIIllllllIIlllIllllll(8);
            }
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIllIIlllIIIlIlIIIlllIlIl() == 1) {
            this.IlIIIIIllllllIIlllIllllll(0.72f, 2.34f);
        }
        super.d_();
    }

    @Override
    public void lllIIIlIIlIlIllIIIIIlIIll() {
        super.lllIIIlIIlIlIllIIIIIlIIll();
        if (this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1252) {
            class_1252 class_12522 = (class_1252)this.IlIIIlIIIIllIIIllIIIIIIll;
            this.lllllIllllIIIIllIIlIlIlII = class_12522.lllllIllllIIIIllIIlIlIlII;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        if (class_00582.IIIllIllIIlIlIlIlIllllIIl() instanceof class_0369 && class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_0814) {
            class_0814 class_08142 = (class_0814)class_00582.IllIIIllIIIIlIlIlIllIIlll();
            double d = class_08142.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
            double d2 = class_08142.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
            if (d * d + d2 * d2 >= 2500.0) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.snipeSkeleton);
            }
        }
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.arrow;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2;
        int n3;
        if (this.lIllIIlllIIIlIlIIIlllIlIl() == 1) {
            n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(3 + n) - 1;
            for (n2 = 0; n2 < n3; ++n2) {
                this.lllIIIllIIIIlllIlIIllIIll(Items.IllIIlllllllIIlIIlIIIIlIl, 1);
            }
        } else {
            n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(3 + n);
            for (n2 = 0; n2 < n3; ++n2) {
                this.lllIIIllIIIIlllIlIIllIIll(Items.arrow, 1);
            }
        }
        n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(3 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.bone, 1);
        }
    }

    @Override
    protected void IlIlIIlIlIllIIlIlIIllIIIl(int n) {
        if (this.lIllIIlllIIIlIlIIIlllIlIl() == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.skull, 1, 1), 0.0f);
        }
    }

    @Override
    protected void lllllIllllIIIIllIIlIlIlII() {
        super.lllllIllllIIIIllIIlIlIlII();
        this.lllIIIllIIIIlllIlIIllIIll(0, new ItemStack(Items.bow));
    }

    @Override
    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        Calendar calendar;
        class_20252 = super.lllIIIllIIIIlllIlIIllIIll(class_20252);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIIlIllIIIlllllIl instanceof class_1439 && this.IlllIIIlIIlIIIIllllIllllI().nextInt(5) > 0) {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, this.lllIIIlllIlllIIlIllllIIlI);
            this.lllIIIllIIIIlllIlIIllIIll(1);
            this.lllIIIllIIIIlllIlIIllIIll(0, new ItemStack(Items.lllllIlllIIllIlIIlIIIllII));
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll(4.0);
        } else {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, this.lIIIlIllllIlllIIIIIllIIIl);
            this.lllllIllllIIIIllIIlIlIlII();
            this.lIIllIlIllIlIlIIlIlIIIIll();
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI(this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.55f * this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl));
        if (this.IlIllllllIIlIIllllIIlIIIl(4) == null && (calendar = this.lIlIllIIlIIlIIlIIlIIlIIll.IIIIlIllIlIIlIIlIllIlIlll()).get(2) + 1 == 10 && calendar.get(5) == 31 && this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.25f) {
            this.lllIIIllIIIIlllIlIIllIIll(4, new ItemStack(this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.1f ? Blocks.IllIlllIIIlllllIllIIlIlIl : Blocks.lIlIIlllllIlllllIlIIIllll));
            this.IllIIIllIIIIlIlIlIllIIlll[4] = 0.0f;
        }
        return class_20252;
    }

    public void lllIIIlIllIlllIlIIllIllIl() {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIlllIlllIIlIllllIIlI);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIIIlIllllIlllIIIIIllIIIl);
        ItemStack class_08972 = this.lIIIIlIlIlIIIlIIllIIlIlIl();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bow) {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, this.lIIIlIllllIlllIIIIIllIIIl);
        } else {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, this.lllIIIlllIlllIIlIllllIIlI);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        class_0369 class_03692 = new class_0369(this.lIlIllIIlIIlIIlIIlIIlIIll, this, class_19652, 1.6f, 14 - this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll() * 4);
        int n = class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IlIIIlIIIIllIIIllIIIIIIll.IlIIlllllIIlIlIlllllIllll, this.lIIIIlIlIlIIIlIIllIIlIlIl());
        int n2 = class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IIlllIlIlllIllIIIlllIIlIl.IlIIlllllIIlIlIlllllIllll, this.lIIIIlIlIlIIIlIIllIIlIlIl());
        class_03692.lllIlIIlIIIlIlIIIllIlllIl((double)(f * 2.0f) + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.25 + (double)((float)this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll() * 0.11f));
        if (n > 0) {
            class_03692.lllIlIIlIIIlIlIIIllIlllIl(class_03692.IlIllllllIIlIIllllIIlIIIl() + (double)n * 0.5 + 0.5);
        }
        if (n2 > 0) {
            class_03692.lllIIIllIIIIlllIlIIllIIll(n2);
        }
        if (class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll, this.lIIIIlIlIlIIIlIIllIIlIlIl()) > 0 || this.lIllIIlllIIIlIlIIIlllIlIl() == 1) {
            class_03692.IlIIIIIllllllIIlllIllllll(100);
        }
        this.lllIIIllIIIIlllIlIIllIIll("random.bow", 1.0f, 1.0f / (this.IlllIIIlIIlIIIIllllIllllI().nextFloat() * 0.4f + 0.8f));
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_03692);
    }

    public int lIllIIlllIIIlIlIIIlllIlIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(13);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(13, (byte)n);
        boolean bl = this.llllIlIIllIIlllllIIllIIll = n == 1;
        if (n == 1) {
            this.IlIIIIIllllllIIlllIllllll(0.72f, 2.34f);
        } else {
            this.IlIIIIIllllllIIlllIllllll(0.6f, 1.8f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SkeletonType", 99)) {
            byte by = class_07752.lIlllIlllIIIIlIIlllIllIII("SkeletonType");
            this.lllIIIllIIIIlllIlIIllIIll((int)by);
        }
        this.lllIIIlIllIlllIlIIllIllIl();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SkeletonType", (byte)this.lIllIIlllIIIlIlIIIlllIlIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972) {
        super.lllIIIllIIIIlllIlIIllIIll(n, class_08972);
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && n == 0) {
            this.lllIIIlIllIlllIlIIllIllIl();
        }
    }

    @Override
    public double IIIIlIllIlIIIIIllllIIlllI() {
        return super.IIIIlIllIlIIIIIllllIIlllI() - 0.5;
    }
}

