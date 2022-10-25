package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0590
extends class_1168
implements class_2176,
class_0083 {
    private float[] lIIIlIllllIlllIIIIIllIIIl = new float[2];
    private float[] lllIIIlllIlllIIlIllllIIlI = new float[2];
    private float[] lIIlIlllIIlllIIlllIIlIlII = new float[2];
    private float[] lIIlIIIlIlIIlllIlIllIllIl = new float[2];
    private int[] lIIlIlIIIIIllIIIIllIlIlII = new int[2];
    private int[] lIIIIlIIIIllIlIIllllIlIII = new int[2];
    private int lIIIlllllllIlllIIllllllll;
    private static final class_0830 IIllllIIlIlIlIlllIIIllIIl = new class_1919();

    public class_0590(class_1334 class_13342) {
        super(class_13342);
        this.IllIIIllIIIIlIlIlIllIIlll(this.IIllllIIlIlIlIlllIIIllIIl());
        this.IlIIIIIllllllIIlllIllllll(0.9f, 4.0f);
        this.llllIlIIllIIlllllIIllIIll = true;
        this.IllIIIIllIIllIllIlllIlIIl().IlIIIIIllllllIIlllIllllll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1997(this, 1.0, 40, 20.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0235(this, class_0814.class, 8.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0558(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0366(this, false));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1524(this, class_0339.class, 0, false, false, IIllllIIlIlIlIlllIIIllIIl));
        this.IIIllIIlIIIIIIlIlIIllIIlI = 50;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17, new Integer(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18, new Integer(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(19, new Integer(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(20, new Integer(0));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Invul", this.IIlIlIIIIlIlllIIlIIlIIIII());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lIIlIIIIIlIlllIlIIlIlIlll(class_07752.lIllllIIlIIIlIllllllIIIll("Invul"));
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return this.lllIIIIlIlIIlIIlllIIIIIIl / 8.0f;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.wither.idle";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.wither.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.wither.death";
    }

    @Override
    public void d_() {
        int n;
        double d;
        double d2;
        double d3;
        int n2;
        double d4;
        double d5;
        double d6;
        class_1521 class_15212;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.6f;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIlIIlIIIIlIIIIIlllIIII(0) > 0 && (class_15212 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII(0))) != null) {
            double d7;
            if (this.llIIlIlIlllIIllIlIlllIllI < class_15212.llIIlIlIlllIIllIlIlllIllI || !this.lIllIIlllIIIlIlIIIlllIlIl() && this.llIIlIlIlllIIllIlIlllIllI < class_15212.llIIlIlIlllIIllIlIlllIllI + 5.0) {
                if (this.IIlIIlIlIlIllIIlIlIIIIlll < 0.0) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
                }
                this.IIlIIlIlIlIllIIlIlIIIIlll += (0.5 - this.IIlIIlIlIlIllIIlIlIIIIlll) * (double)0.6f;
            }
            if ((d6 = (d7 = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll) * d7 + (d5 = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl) * d5) > 9.0) {
                d4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d6);
                this.IIIIIIIIlIllIIllIIlllIllI += (d7 / d4 * 0.5 - this.IIIIIIIIlIllIIllIIlllIllI) * (double)0.6f;
                this.llIIIlllIlllIlIllIIIIllIl += (d5 / d4 * 0.5 - this.llIIIlllIlllIlIllIIIIllIl) * (double)0.6f;
            }
        }
        if (this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl > (double)0.05f) {
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)Math.atan2(this.llIIIlllIlllIlIllIIIIllIl, this.IIIIIIIIlIllIIllIIlllIllI) * 57.295776f - 90.0f;
        }
        super.d_();
        for (n2 = 0; n2 < 2; ++n2) {
            this.lIIlIIIlIlIIlllIlIllIllIl[n2] = this.lllIIIlllIlllIIlIllllIIlI[n2];
            this.lIIlIlllIIlllIIlllIIlIlII[n2] = this.lIIIlIllllIlllIIIIIllIIIl[n2];
        }
        for (n2 = 0; n2 < 2; ++n2) {
            int n3 = this.lIlIlIIlIIIIlIIIIIlllIIII(n2 + 1);
            class_1521 class_15213 = null;
            if (n3 > 0) {
                class_15213 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n3);
            }
            if (class_15213 != null) {
                d5 = this.IlIIIlIIIIllIIIllIIIIIIll(n2 + 1);
                d6 = this.IIlllIlIlllIllIIIlllIIlIl(n2 + 1);
                d4 = this.lIlIllIIlIIlIIlIIlIIlIIll(n2 + 1);
                d3 = class_15213.IlIIlllllIIlIlIlllllIllll - d5;
                d2 = class_15213.llIIlIlIlllIIllIlIlllIllI + (double)class_15213.llIIllIllIlIIlIIllIllllll() - d6;
                d = class_15213.IllIIIIllIIllIllIlllIlIIl - d4;
                double d8 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d3 * d3 + d * d);
                float f = (float)(Math.atan2(d, d3) * 180.0 / Math.PI) - 90.0f;
                float f2 = (float)(-(Math.atan2(d2, d8) * 180.0 / Math.PI));
                this.lIIIlIllllIlllIIIIIllIIIl[n2] = this.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIlIllllIlllIIIIIllIIIl[n2], f2, 40.0f);
                this.lllIIIlllIlllIIlIllllIIlI[n2] = this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIlllIlllIIlIllllIIlI[n2], f, 10.0f);
                continue;
            }
            this.lllIIIlllIlllIIlIllllIIlI[n2] = this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIlllIlllIIlIllllIIlI[n2], this.lllllIllllIIIIllIIlIlIlII, 10.0f);
        }
        boolean bl = this.lIllIIlllIIIlIlIIIlllIlIl();
        for (n = 0; n < 3; ++n) {
            d3 = this.IlIIIlIIIIllIIIllIIIIIIll(n);
            d2 = this.IIlllIlIlllIllIIIlllIIlIl(n);
            d = this.lIlIllIIlIIlIIlIIlIIlIIll(n);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("smoke", d3 + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.3f, d2 + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.3f, d + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.3f, 0.0, 0.0, 0.0);
            if (!bl || this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(4) != 0) continue;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("mobSpell", d3 + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.3f, d2 + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.3f, d + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.3f, (double)0.7f, (double)0.7f, 0.5);
        }
        if (this.IIlIlIIIIlIlllIIlIIlIIIII() > 0) {
            for (n = 0; n < 3; ++n) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("mobSpell", this.IlIIlllllIIlIlIlllllIllll + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 1.0, this.llIIlIlIlllIIllIlIlllIllI + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 3.3f), this.IllIIIIllIIllIllIlllIlIIl + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 1.0, (double)0.7f, (double)0.7f, 0.9f);
            }
        }
    }

    @Override
    protected void IllIIIIlIIlllllllllIlIlII() {
        if (this.IIlIlIIIIlIlllIIlIIlIIIII() > 0) {
            int n = this.IIlIlIIIIlIlllIIlIIlIIIII() - 1;
            if (n <= 0) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll(), this.IllIIIIllIIllIllIlllIlIIl, 7.0f, false, this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing"));
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(1013, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
            }
            this.lIIlIIIIIlIlllIlIIlIlIlll(n);
            if (this.IlllIIIllllIIllIllIlIIlIl % 10 == 0) {
                this.IlIllllllIIlIIllllIIlIIIl(10.0f);
            }
        } else {
            int n;
            int n2;
            int n3;
            super.IllIIIIlIIlllllllllIlIlII();
            block0: for (n3 = 1; n3 < 3; ++n3) {
                Object object;
                if (this.IlllIIIllllIIllIllIlIIlIl < this.lIIlIlIIIIIllIIIIllIlIlII[n3 - 1]) continue;
                this.lIIlIlIIIIIllIIIIllIlIlII[n3 - 1] = this.IlllIIIllllIIllIllIlIIlIl + 10 + this.IlllIIlllllllIIllIlIllllI.nextInt(10);
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.IlIllllllIIlIIllllIIlIIIl || this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII) {
                    int n4 = n3 - 1;
                    n2 = this.lIIIIlIIIIllIlIIllllIlIII[n3 - 1];
                    this.lIIIIlIIIIllIlIIllllIlIII[n4] = this.lIIIIlIIIIllIlIIllllIlIII[n3 - 1] + 1;
                    if (n2 > 15) {
                        float f = 10.0f;
                        float f2 = 5.0f;
                        double d = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.IlIIlllllIIlIlIlllllIllll - (double)f, this.IlIIlllllIIlIlIlllllIllll + (double)f);
                        double d2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.llIIlIlIlllIIllIlIlllIllI - (double)f2, this.llIIlIlIlllIIllIlIlllIllI + (double)f2);
                        double d3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.IllIIIIllIIllIllIlllIlIIl - (double)f, this.IllIIIIllIIllIllIlllIlIIl + (double)f);
                        this.lllIIIllIIIIlllIlIIllIIll(n3 + 1, d, d2, d3, true);
                        this.lIIIIlIIIIllIlIIllllIlIII[n3 - 1] = 0;
                    }
                }
                if ((n = this.lIlIlIIlIIIIlIIIIIlllIIII(n3)) > 0) {
                    object = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n);
                    if (object != null && ((class_1521)object).IlllIIlllllllIIllIlIllllI() && this.IlIIIIIllllllIIlllIllllll((class_1521)object) <= 900.0 && this.IlIlllIIIIIIlIIllIIllIlll((class_1521)object)) {
                        this.lllIIIllIIIIlllIlIIllIIll(n3 + 1, (class_1965)object);
                        this.lIIlIlIIIIIllIIIIllIlIlII[n3 - 1] = this.IlllIIIllllIIllIllIlIIlIl + 40 + this.IlllIIlllllllIIllIlIllllI.nextInt(20);
                        this.lIIIIlIIIIllIlIIllllIlIII[n3 - 1] = 0;
                        continue;
                    }
                    this.lllIlIIlIIIlIlIIIllIlllIl(n3, 0);
                    continue;
                }
                object = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1965.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(20.0, 8.0, 20.0), IIllllIIlIlIlIlllIIIllIIl);
                for (n2 = 0; n2 < 10 && !object.isEmpty(); ++n2) {
                    class_1965 class_19652 = (class_1965)object.get(this.IlllIIlllllllIIllIlIllllI.nextInt(object.size()));
                    if (class_19652 != this && class_19652.IlllIIlllllllIIllIlIllllI() && this.IlIlllIIIIIIlIIllIIllIlll(class_19652)) {
                        if (class_19652 instanceof class_0814) {
                            if (((class_0814)class_19652).lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll) continue block0;
                            this.lllIlIIlIIIlIlIIIllIlllIl(n3, class_19652.llllllIlIllllIlIlIlIIIIlI());
                            continue block0;
                        }
                        this.lllIlIIlIIIlIlIIIllIlllIl(n3, class_19652.llllllIlIllllIlIlIlIIIIlI());
                        continue block0;
                    }
                    object.remove(class_19652);
                }
            }
            if (this.IIIIlIllIlIIlIIlIllIlIlll() != null) {
                this.lllIlIIlIIIlIlIIIllIlllIl(0, this.IIIIlIllIlIIlIIlIllIlIlll().llllllIlIllllIlIlIlIIIIlI());
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl(0, 0);
            }
            if (this.lIIIlllllllIlllIIllllllll > 0) {
                --this.lIIIlllllllIlllIIllllllll;
                if (this.lIIIlllllllIlllIIllllllll == 0 && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing")) {
                    n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI);
                    n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
                    int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
                    n2 = 0;
                    for (int i = -1; i <= 1; ++i) {
                        for (int j = -1; j <= 1; ++j) {
                            for (int k = 0; k <= 3; ++k) {
                                int n6 = n + i;
                                int n7 = n3 + k;
                                int n8 = n5 + j;
                                Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n6, n7, n8);
                                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492 == Blocks.IllIIlllllllIIlIIlIIIIlIl || class_05492 == Blocks.IllIIIIIllIlIIllIllllllIl || class_05492 == Blocks.IIIlllllIIIIIllIllIIIIllI || class_05492 == Blocks.IlIlIIllIlIlIIIIIlIlllllI) continue;
                                n2 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n6, n7, n8, true) || n2 != 0 ? 1 : 0;
                            }
                        }
                    }
                    if (n2 != 0) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1012, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
                    }
                }
            }
            if (this.IlllIIIllllIIllIllIlIIlIl % 20 == 0) {
                this.IlIllllllIIlIIllllIIlIIIl(1.0f);
            }
        }
    }

    public void lllIIIlIllIlllIlIIllIllIl() {
        this.lIIlIIIIIlIlllIlIIlIlIlll(220);
        this.IllIIIllIIIIlIlIlIllIIlll(this.IIllllIIlIlIlIlllIIIllIIl() / 3.0f);
    }

    @Override
    public void IlIIIlIIlllllIIIllIlIlIll() {
    }

    @Override
    public int lIIlIlIIIIIllIIIIllIlIlII() {
        return 4;
    }

    private double IlIIIlIIIIllIIIllIIIIIIll(int n) {
        if (n <= 0) {
            return this.IlIIlllllIIlIlIlllllIllll;
        }
        float f = (this.lllllIllllIIIIllIIlIlIlII + (float)(180 * (n - 1))) / 180.0f * (float)Math.PI;
        float f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f);
        return this.IlIIlllllIIlIlIlllllIllll + (double)f2 * 1.3;
    }

    private double IIlllIlIlllIllIIIlllIIlIl(int n) {
        return n <= 0 ? this.llIIlIlIlllIIllIlIlllIllI + 3.0 : this.llIIlIlIlllIIllIlIlllIllI + 2.2;
    }

    private double lIlIllIIlIIlIIlIIlIIlIIll(int n) {
        if (n <= 0) {
            return this.IllIIIIllIIllIllIlllIlIIl;
        }
        float f = (this.lllllIllllIIIIllIIlIlIlII + (float)(180 * (n - 1))) / 180.0f * (float)Math.PI;
        float f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f);
        return this.IllIIIIllIIllIllIlllIlIIl + (double)f2 * 1.3;
    }

    private float lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3) {
        float f4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, class_1965 class_19652) {
        this.lllIIIllIIIIlllIlIIllIIll(n, class_19652.IlIIlllllIIlIlIlllllIllll, class_19652.llIIlIlIlllIIllIlIlllIllI + (double)class_19652.llIIllIllIlIIlIIllIllllll() * 0.5, class_19652.IllIIIIllIIllIllIlllIlIIl, n == 0 && this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.001f);
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, double d, double d2, double d3, boolean bl) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1014, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
        double d4 = this.IlIIIlIIIIllIIIllIIIIIIll(n);
        double d5 = this.IIlllIlIlllIllIIIlllIIlIl(n);
        double d6 = this.lIlIllIIlIIlIIlIIlIIlIIll(n);
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        class_2166 class_21662 = new class_2166(this.lIlIllIIlIIlIIlIIlIIlIIll, this, d7, d8, d9);
        if (bl) {
            class_21662.lllIIIllIIIIlllIlIIllIIll(true);
        }
        class_21662.llIIlIlIlllIIllIlIlllIllI = d5;
        class_21662.IlIIlllllIIlIlIlllllIllll = d4;
        class_21662.IllIIIIllIIllIllIlllIlIIl = d6;
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_21662);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll(0, class_19652);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        class_1521 class_15212;
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (class_00582 == class_0058.IlIIIIIllllllIIlllIllllll) {
            return false;
        }
        if (this.IIlIlIIIIlIlllIIlIIlIIIII() > 0) {
            return false;
        }
        if (this.lIllIIlllIIIlIlIIIlllIlIl() && (class_15212 = class_00582.IIIllIllIIlIlIlIlIllllIIl()) instanceof class_0369) {
            return false;
        }
        class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
        if (class_15212 != null && !(class_15212 instanceof class_0814) && class_15212 instanceof class_1965 && ((class_1965)class_15212).IIlllllIIlIIlIlIIlIIlIlII() == this.IIlllllIIlIIlIlIIlIIlIlII()) {
            return false;
        }
        if (this.lIIIlllllllIlllIIllllllll <= 0) {
            this.lIIIlllllllIlllIIllllllll = 20;
        }
        int n = 0;
        while (n < this.lIIIIlIIIIllIlIIllllIlIII.length) {
            int n2 = n++;
            this.lIIIIlIIIIllIlIIllllIlIII[n2] = this.lIIIIlIIIIllIlIIllllIlIII[n2] + 3;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        this.lllIIIllIIIIlllIlIIllIIll(Items.nether_star, 1);
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            for (class_0814 class_08142 : this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0814.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(50.0, 100.0, 50.0))) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150964_J);
            }
        }
    }

    @Override
    public void IllIlllIIIlllllIllIIlIlIl() {
        this.lIIlIlllIIlIIIIlIlIIIIlll = 0;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        return 0xF000F0;
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1852 class_18522) {
    }

    @Override
    protected boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(300.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.6f);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(40.0);
    }

    public float lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.lllIIIlllIlllIIlIllllIIlI[n];
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lIIIlIllllIlllIIIIIllIIIl[n];
    }

    public int IIlIlIIIIlIlllIIlIIlIIIII() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(20);
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(20, n);
    }

    public int lIlIlIIlIIIIlIIIIIlllIIII(int n) {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(17 + n);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(17 + n, n2);
    }

    public boolean lIllIIlllIIIlIlIIIlllIlIl() {
        return this.lllIIIlllIlllIIlIllllIIlI() <= this.IIllllIIlIlIlIlllIIIllIIl() / 2.0f;
    }

    @Override
    public class_0529 IIlllllIIlIIlIlIIlIIlIlII() {
        return class_0529.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        this.IlIIIlIIIIllIIIllIIIIIIll = null;
    }
}

