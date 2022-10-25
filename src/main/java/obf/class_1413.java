package obf;

import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1413
extends class_1247
implements class_1310 {
    public int lllIIIllIIIIlllIlIIllIIll;
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public double IlIllllllIIlIIllllIIlIIIl;
    public double lIlllIlllIIIIlIIlllIllIII;
    private class_1521 lllIIIlllIlllIIlIllllIIlI;
    private int lIIlIlllIIlllIIlllIIlIlII;
    public int IlIIIIIllllllIIlllIllllll;
    public int lIIIlIllllIlllIIIIIllIIIl;
    private int lIIlIIIlIlIIlllIlIllIllIl = 1;

    public class_1413(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(4.0f, 4.0f);
        this.llllIlIIllIIlllllIIllIIll = true;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 5;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) != 0;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if ("fireball".equals(class_00582.IlIlIIlIlIllIIlIlIIllIIIl()) && class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_0814) {
            super.lllIIIllIIIIlllIlIIllIIll(class_00582, 1000.0f);
            ((class_0814)class_00582.IllIIIllIIIIlIlIlIllIIlll()).lllIIIllIIIIlllIlIIllIIll(AchievementList.ghast);
            return true;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)0);
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(10.0);
    }

    @Override
    protected void llIIlIlIlllIIllIlIlllIllI() {
        byte by;
        byte by2;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lllIIIllIIIIlllIlIIllIIll) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        this.IllIlllIIIlllllIllIIlIlIl();
        this.IlIIIIIllllllIIlllIllllll = this.lIIIlIllllIlllIIIIIllIIIl;
        double d = this.lllIlIIlIIIlIlIIIllIlllIl - this.IlIIlllllIIlIlIlllllIllll;
        double d2 = this.IlIllllllIIlIIllllIIlIIIl - this.llIIlIlIlllIIllIlIlllIllI;
        double d3 = this.lIlllIlllIIIIlIIlllIllIII - this.IllIIIIllIIllIllIlllIlIIl;
        double d4 = d * d + d2 * d2 + d3 * d3;
        if (d4 < 1.0 || d4 > 3600.0) {
            this.lllIlIIlIIIlIlIIIllIlllIl = this.IlIIlllllIIlIlIlllllIllll + (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.IlIllllllIIlIIllllIIlIIIl = this.llIIlIlIlllIIllIlIlllIllI + (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.lIlllIlllIIIIlIIlllIllIII = this.IllIIIIllIIllIllIlllIlIIl + (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * 16.0f);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll-- <= 0) {
            this.lllIIIllIIIIlllIlIIllIIll += this.IlllIIlllllllIIllIlIllllI.nextInt(5) + 2;
            if (this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, d4 = (double) MathHelper.lllIIIllIIIIlllIlIIllIIll(d4))) {
                this.IIIIIIIIlIllIIllIIlllIllI += d / d4 * 0.1;
                this.IIlIIlIlIlIllIIlIlIIIIlll += d2 / d4 * 0.1;
                this.llIIIlllIlllIlIllIIIIllIl += d3 / d4 * 0.1;
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl = this.IlIIlllllIIlIlIlllllIllll;
                this.IlIllllllIIlIIllllIIlIIIl = this.llIIlIlIlllIIllIlIlllIllI;
                this.lIlllIlllIIIIlIIlllIllIII = this.IllIIIIllIIllIllIlllIlIIl;
            }
        }
        if (this.lllIIIlllIlllIIlIllllIIlI != null && this.lllIIIlllIlllIIlIllllIIlI.IllllIIIIlIIlIIIIlllIIIIl) {
            this.lllIIIlllIlllIIlIllllIIlI = null;
        }
        if (this.lllIIIlllIlllIIlIllllIIlI == null || this.lIIlIlllIIlllIIlllIIlIlII-- <= 0) {
            this.lllIIIlllIlllIIlIllllIIlI = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, 100.0);
            if (this.lllIIIlllIlllIIlIllllIIlI != null) {
                this.lIIlIlllIIlllIIlllIIlIlII = 20;
            }
        }
        double d5 = 64.0;
        if (this.lllIIIlllIlllIIlIllllIIlI != null && this.lllIIIlllIlllIIlIllllIIlI.IlIIIIIllllllIIlllIllllll(this) < d5 * d5) {
            double d6 = this.lllIIIlllIlllIIlIllllIIlI.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
            double d7 = this.lllIIIlllIlllIIlIllllIIlI.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)(this.lllIIIlllIlllIIlIllllIIlI.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f) - (this.llIIlIlIlllIIllIlIlllIllI + (double)(this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f));
            double d8 = this.lllIIIlllIlllIIlIllllIIlI.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
            this.lllllIllllIIIIllIIlIlIlII = this.IIIIlIllIlIIlIIlIllIlIlll = -((float)Math.atan2(d6, d8)) * 180.0f / (float)Math.PI;
            if (this.IlIlllIIIIIIlIIllIIllIlll(this.lllIIIlllIlllIIlIllllIIlI)) {
                if (this.lIIIlIllllIlllIIIIIllIIIl == 10) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1007, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
                }
                ++this.lIIIlIllllIlllIIIIIllIIIl;
                if (this.lIIIlIllllIlllIIIIIllIIIl == 20) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1008, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
                    class_1902 class_19022 = new class_1902(this.lIlIllIIlIIlIIlIIlIIlIIll, this, d6, d7, d8);
                    class_19022.IlIIIIIllllllIIlllIllllll = this.lIIlIIIlIlIIlllIlIllIllIl;
                    double d9 = 4.0;
                    class_0864 class_08642 = this.llIIlllIllIllllIIIlIIIIII(1.0f);
                    class_19022.IlIIlllllIIlIlIlllllIllll = this.IlIIlllllIIlIlIlllllIllll + class_08642.lllIIIllIIIIlllIlIIllIIll * d9;
                    class_19022.llIIlIlIlllIIllIlIlllIllI = this.llIIlIlIlllIIllIlIlllIllI + (double)(this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f) + 0.5;
                    class_19022.IllIIIIllIIllIllIlllIlIIl = this.IllIIIIllIIllIllIlllIlIIl + class_08642.IlIllllllIIlIIllllIIlIIIl * d9;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_19022);
                    this.lIIIlIllllIlllIIIIIllIIIl = -40;
                }
            } else if (this.lIIIlIllllIlllIIIIIllIIIl > 0) {
                --this.lIIIlIllllIlllIIIIIllIIIl;
            }
        } else {
            this.lllllIllllIIIIllIIlIlIlII = this.IIIIlIllIlIIlIIlIllIlIlll = -((float)Math.atan2(this.IIIIIIIIlIllIIllIIlllIllI, this.llIIIlllIlllIlIllIIIIllIl)) * 180.0f / (float)Math.PI;
            if (this.lIIIlIllllIlllIIIIIllIIIl > 0) {
                --this.lIIIlIllllIlllIIIIIllIIIl;
            }
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (by2 = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16)) != (by = (byte)(this.lIIIlIllllIlllIIIIIllIIIl > 10 ? 1 : 0))) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, by);
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4) {
        double d5 = (this.lllIlIIlIIIlIlIIIllIlllIl - this.IlIIlllllIIlIlIlllllIllll) / d4;
        double d6 = (this.IlIllllllIIlIIllllIIlIIIl - this.llIIlIlIlllIIllIlIlllIllI) / d4;
        double d7 = (this.lIlllIlllIIIIlIIlllIllIII - this.IllIIIIllIIllIllIlllIlIIl) / d4;
        class_1974 class_19742 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl();
        int n = 1;
        while ((double)n < d4) {
            class_19742.lIlllIlllIIIIlIIlllIllIII(d5, d6, d7);
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, class_19742).isEmpty()) {
                return false;
            }
            ++n;
        }
        return true;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.ghast.moan";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.ghast.scream";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.ghast.death";
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.IlIlIIlllIllllllllIIIlIlI;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2;
        int n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(2) + this.IlllIIlllllllIIllIlIllllI.nextInt(1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.ghast_tear, 1);
        }
        n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(3) + this.IlllIIlllllllIIllIlIllllI.nextInt(1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.IlIlIIlllIllllllllIIIlIlI, 1);
        }
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 10.0f;
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.IlllIIlllllllIIllIlIllllI.nextInt(20) == 0 && super.lllIIlIIIllllllIIIIlIlIlI() && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public int llIIIlIIllIIllIllIIlIlllI() {
        return 1;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("ExplosionPower", this.lIIlIIIlIlIIlllIlIllIllIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("ExplosionPower", 99)) {
            this.lIIlIIIlIlIIlllIlIllIllIl = class_07752.lIllllIIlIIIlIllllllIIIll("ExplosionPower");
        }
    }
}

