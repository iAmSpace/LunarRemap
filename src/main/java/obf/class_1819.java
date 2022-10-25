package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1819
extends class_1168 {
    private float lIIIlIllllIlllIIIIIllIIIl = 0.5f;
    private int lllIIIlllIlllIIlIllllIIlI;
    private int lIIlIlllIIlllIIlllIIlIlII;

    public class_1819(class_1334 class_13342) {
        super(class_13342);
        this.llllIlIIllIIlllllIIllIIll = true;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 10;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll(6.0);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, new Byte(0));
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.blaze.breathe";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.blaze.hit";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.blaze.death";
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        return 0xF000F0;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return 1.0f;
    }

    @Override
    public void d_() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (this.IllIIIlllllIlIlllIlllllII()) {
                this.lllIIIllIIIIlllIlIIllIIll(class_0058.IlIIIIIllllllIIlllIllllll, 1.0f);
            }
            --this.lllIIIlllIlllIIlIllllIIlI;
            if (this.lllIIIlllIlllIIlIllllIIlI <= 0) {
                this.lllIIIlllIlllIIlIllllIIlI = 100;
                this.lIIIlIllllIlllIIIIIllIIIl = 0.5f + (float)this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 3.0f;
            }
            if (this.IlIlIIlIlIllIIlIlIIllIIIl() != null && this.IlIlIIlIlIllIIlIlIIllIIIl().llIIlIlIlllIIllIlIlllIllI + (double)this.IlIlIIlIlIllIIlIlIIllIIIl().llIIllIllIlIIlIIllIllllll() > this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll() + (double)this.lIIIlIllllIlllIIIIIllIIIl) {
                this.IIlIIlIlIlIllIIlIlIIIIlll += ((double)0.3f - this.IIlIIlIlIlIllIIlIlIIIIlll) * (double)0.3f;
            }
        }
        if (this.IlllIIlllllllIIllIlIllllI.nextInt(24) == 0) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + 0.5, this.llIIlIlIlllIIllIlIlllIllI + 0.5, this.IllIIIIllIIllIllIlllIlIIl + 0.5, "fire.fire", 1.0f + this.IlllIIlllllllIIllIlIllllI.nextFloat(), this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.7f + 0.3f);
        }
        if (!this.llllllIlIllllIlIlIlIIIIlI && this.IIlIIlIlIlIllIIlIlIIIIlll < 0.0) {
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.6;
        }
        for (int i = 0; i < 2; ++i) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("largesmoke", this.IlIIlllllIIlIlIlllllIllll + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + this.IlllIIlllllllIIllIlIllllI.nextDouble() * (double)this.lllIIIIlIlIIlIIlllIIIIIIl, this.IllIIIIllIIllIllIlllIlIIl + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, 0.0, 0.0, 0.0);
        }
        super.d_();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
        if (this.lIlIIlllllIlllllIlIIIllll <= 0 && f < 2.0f && class_15212.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll > this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl && class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl < this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll) {
            this.lIlIIlllllIlllllIlIIIllll = 20;
            this.llIIllIllIlIIlIIllIllllll(class_15212);
        } else if (f < 30.0f) {
            double d = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
            double d2 = class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)(class_15212.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f) - (this.llIIlIlIlllIIllIlIlllIllI + (double)(this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f));
            double d3 = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
            if (this.lIlIIlllllIlllllIlIIIllll == 0) {
                ++this.lIIlIlllIIlllIIlllIIlIlII;
                if (this.lIIlIlllIIlllIIlllIIlIlII == 1) {
                    this.lIlIIlllllIlllllIlIIIllll = 60;
                    this.lllIIIllIIIIlllIlIIllIIll(true);
                } else if (this.lIIlIlllIIlllIIlllIIlIlII <= 4) {
                    this.lIlIIlllllIlllllIlIIIllll = 6;
                } else {
                    this.lIlIIlllllIlllllIlIIIllll = 100;
                    this.lIIlIlllIIlllIIlllIIlIlII = 0;
                    this.lllIIIllIIIIlllIlIIllIIll(false);
                }
                if (this.lIIlIlllIIlllIIlllIIlIlII > 1) {
                    float f2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f) * 0.5f;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1009, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
                    for (int i = 0; i < 1; ++i) {
                        class_1332 class_13322 = new class_1332(this.lIlIllIIlIIlIIlIIlIIlIIll, this, d + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)f2, d2, d3 + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)f2);
                        class_13322.llIIlIlIlllIIllIlIlllIllI = this.llIIlIlIlllIIllIlIlllIllI + (double)(this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f) + 0.5;
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_13322);
                    }
                }
            }
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
            this.lIlllIlllIIIIlIIlllIllIII = true;
        }
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.blaze_rod;
    }

    @Override
    public boolean llIIIIIlIIlIIIIllIIIlIIII() {
        return this.lllIIIlIllIlllIlIIllIllIl();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        if (bl) {
            int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(2 + n);
            for (int i = 0; i < n2; ++i) {
                this.lllIIIllIIIIlllIlIIllIIll(Items.blaze_rod, 1);
            }
        }
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
    protected boolean t_() {
        return true;
    }
}

