package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.crash.CrashReport;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class class_1521 {
    private static int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl = lllIIIllIIIIlllIlIIllIIll++;
    public double IlIlIIlllIIlIllIIIlllllIl = 1.0;
    public boolean lIIlIIIIIlIlllIlIIlIlIlll;
    public class_1521 lIlIlIIlIIIIlIIIIIlllIIII;
    public class_1521 IlIIIlIIIIllIIIllIIIIIIll;
    public boolean IIlllIlIlllIllIIIlllIIlIl;
    public class_1334 lIlIllIIlIIlIIlIIlIIlIIll;
    public double llIIlIllIllllIlIIIIlIIlll;
    public double llIllllIlIllIIIlIllIIlIlI;
    public double lIlllIlllIlIIIIlllIlIlIIl;
    public double IlIIlllllIIlIlIlllllIllll;
    public double llIIlIlIlllIIllIlIlllIllI;
    public double IllIIIIllIIllIllIlllIlIIl;
    public double IIIIIIIIlIllIIllIIlllIllI;
    public double IIlIIlIlIlIllIIlIlIIIIlll;
    public double llIIIlllIlllIlIllIIIIllIl;
    public float IIIIlIllIlIIlIIlIllIlIlll;
    public float IlIlIIlllIllllllllIIIlIlI;
    public float llllIIIIlIIIlIIIIIIlIllll;
    public float llIIIIllIIIIIIIlIIIlIIIIl;
    public final class_1974 IIllIllIIllIIlllIIIlIlllI = class_1974.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    public boolean llllllIlIllllIlIlIlIIIIlI;
    public boolean lIlIIllllIlIIIIllIIIIlIIl;
    public boolean llIlllIIllIlllIlIlIlIIIll;
    public boolean IIIIlIIlIIIllIIIIllIIIlII;
    public boolean lllIIIIIIlIlllIIlIlIIIllI;
    protected boolean llIIlIIllIIllIlIIllIIllII;
    public boolean lIlIlIIIIIIlIIllllIlIIllI = true;
    public boolean IllllIIIIlIIlIIIIlllIIIIl;
    public float llllIlIIIIIIIIIlllIIlIIIl;
    public float IIIIlIlIIlIIIIlIlllIlIIII = 0.6f;
    public float lllIIIIlIlIIlIIlllIIIIIIl = 1.8f;
    public float llIlIIlllIIIIIllIIlIlIIII;
    public float IllIIIlllllIlIlllIlllllII;
    public float llIlllIlIIllIlIIIIllIIlIl;
    public float lIIIllIIIIIllllIlIlIllIll;
    private int IlIllllllIIlIIllllIIlIIIl = 1;
    public double lIIIlIIIlIlllIllIIIlIIIlI;
    public double lIIlIlllIllIlIlllIIIIIIII;
    public double IIlIllIIlllllIIlIIllllIIl;
    public float IllllIIlIIIllIlllIlllIllI;
    public float IllIlIlIIIlllIIllIIIIlIll;
    public boolean IlIIIlIllIIIllIIIIlIIlIll;
    public float llllIIllIlIlllllllIIlIIlI;
    protected Random IlllIIlllllllIIllIlIllllI = new Random();
    public int IlllIIIllllIIllIllIlIIlIl;
    public int lllIIIlIIlIlIllIIIIIlIIll = 1;
    private int lIlllIlllIIIIlIIlllIllIII;
    protected boolean IIIlIlIllIlllllIlIllllllI;
    public int IIIIlIllIlIIIIIllllIIlllI;
    private boolean IlIIIIIllllllIIlllIllllll = true;
    protected boolean llllIlIIllIIlllllIIllIIll;
    protected class_0788 IlIlIllIIlIIIIlllIlIllIlI;
    private double IIIllIIlIIIIIIlIlIIllIIlI;
    private double IllIIlllllllIIlIIlIIIIlIl;
    public boolean IlIIllIlIlIllIIIlIIlIlIIl;
    public int lIlIIllIllIIIIIlIllllIIIl;
    public int lIlllIIllIIIIIIlIlIIlIllI;
    public int llIIIlIlIlIIlIllIIIllIlIl;
    public int lIIlIIlIllIlIIlIlIIlIlIlI;
    public int llIIIIIlIIlIIIIllIIIlIIII;
    public int lIlIlIIllIIIlllIllIIlIllI;
    public boolean IlIIIIIllIlllIIIIlIIIllIl;
    public boolean lIIlIlIIllIIIlIIlIlIIIlII;
    public int lIIIlIIllIllIIlIIlIIIllII;
    protected boolean lIlIllIIllIIIIlllIlIlllIl;
    protected int IlIIIlIIlllllIIIllIlIlIll;
    public int lIIllllllllIlIllllllllIlI;
    protected int lIIIIllIIllIIIlIIIllIllII;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    protected UUID lIIllIIlIIIlllIlllIIlIIlI = UUID.randomUUID();
    public class_1218 IllIIllIlIlllIllIllIlIIIl = class_1218.lllIlIIlIIIlIlIIIllIlllIl;

    public int llllllIlIllllIlIlIlIIIIlI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public class_1521(class_1334 class_13342) {
        this.lIlIllIIlIIlIIlIIlIIlIIll = class_13342;
        this.IlIllllllIIlIIllllIIlIIIl(0.0, 0.0, 0.0);
        if (class_13342 != null) {
            this.lIIllllllllIlIllllllllIlI = class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl;
        }
        this.IlIlIllIIlIIIIlllIlIllIlI = new class_0788(this);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(0, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(1, (Object)300);
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    protected abstract void lllIlIIlIIIlIlIIIllIlllIl();

    public class_0788 lIlIIllllIlIIIIllIIIIlIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI;
    }

    public boolean equals(Object object) {
        return object instanceof class_1521 ? ((class_1521)object).lllIlIIlIIIlIlIIIllIlllIl == this.lllIlIIlIIIlIlIIIllIlllIl : false;
    }

    public int hashCode() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    protected void llIlllIIllIlllIlIlIlIIIll() {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll != null) {
            while (this.llIIlIlIlllIIllIlIlllIllI > 0.0) {
                this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IIllIllIIllIIlllIIIlIlllI).isEmpty()) break;
                this.llIIlIlIlllIIllIlIlllIllI += 1.0;
            }
            this.llIIIlllIlllIlIllIIIIllIl = 0.0;
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
            this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
            this.IlIlIIlllIllllllllIIIlIlI = 0.0f;
        }
    }

    public void IIIIlIIlIIIllIIIIllIIIlII() {
        this.IllllIIIIlIIlIIIIlllIIIIl = true;
    }

    protected void IlIIIIIllllllIIlllIllllll(float f, float f2) {
        float f3;
        if (f != this.IIIIlIlIIlIIIIlIlllIlIIII || f2 != this.lllIIIIlIlIIlIIlllIIIIIIl) {
            f3 = this.IIIIlIlIIlIIIIlIlllIlIIII;
            this.IIIIlIlIIlIIIIlIlllIlIIII = f;
            this.lllIIIIlIlIIlIIlllIIIIIIl = f2;
            this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII = this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll + (double)this.IIIIlIlIIlIIIIlIlllIlIIII;
            this.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll = this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl + (double)this.IIIIlIlIIlIIIIlIlllIlIIII;
            this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)this.lllIIIIlIlIIlIIlllIIIIIIl;
            if (this.IIIIlIlIIlIIIIlIlllIlIIII > f3 && !this.IlIIIIIllllllIIlllIllllll && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.IlIIIIIllllllIIlllIllllll(f3 - this.IIIIlIlIIlIIIIlIlllIlIIII, 0.0, f3 - this.IIIIlIlIIlIIIIlIlllIlIIII);
            }
        }
        this.IllIIllIlIlllIllIllIlIIIl = (double)(f3 = f % 2.0f) < 0.375 ? class_1218.lllIIIllIIIIlllIlIIllIIll : ((double)f3 < 0.75 ? class_1218.lllIlIIlIIIlIlIIIllIlllIl : ((double)f3 < 1.0 ? class_1218.IlIllllllIIlIIllllIIlIIIl : ((double)f3 < 1.375 ? class_1218.lIlllIlllIIIIlIIlllIllIII : ((double)f3 < 1.75 ? class_1218.IlIIIIIllllllIIlllIllllll : class_1218.lIllllIIlIIIlIllllllIIIll))));
    }

    protected void lIllllIIlIIIlIllllllIIIll(float f, float f2) {
        this.IIIIlIllIlIIlIIlIllIlIlll = f % 360.0f;
        this.IlIlIIlllIllllllllIIIlIlI = f2 % 360.0f;
    }

    public void IlIllllllIIlIIllllIIlIIIl(double d, double d2, double d3) {
        this.IlIIlllllIIlIlIlllllIllll = d;
        this.llIIlIlIlllIIllIlIlllIllI = d2;
        this.IllIIIIllIIllIllIlllIlIIl = d3;
        float f = this.IIIIlIlIIlIIIIlIlllIlIIII / 2.0f;
        float f2 = this.lllIIIIlIlIIlIIlllIIIIIIl;
        this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(d - (double)f, d2 - (double)this.llllIlIIIIIIIIIlllIIlIIIl + (double)this.IllllIIlIIIllIlllIlllIllI, d3 - (double)f, d + (double)f, d2 - (double)this.llllIlIIIIIIIIIlllIIlIIIl + (double)this.IllllIIlIIIllIlllIlllIllI + (double)f2, d3 + (double)f);
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(float f, float f2) {
        float f3 = this.IlIlIIlllIllllllllIIIlIlI;
        float f4 = this.IIIIlIllIlIIlIIlIllIlIlll;
        this.IIIIlIllIlIIlIIlIllIlIlll = (float)((double)this.IIIIlIllIlIIlIIlIllIlIlll + (double)f * 0.15);
        this.IlIlIIlllIllllllllIIIlIlI = (float)((double)this.IlIlIIlllIllllllllIIIlIlI - (double)f2 * 0.15);
        if (this.IlIlIIlllIllllllllIIIlIlI < -90.0f) {
            this.IlIlIIlllIllllllllIIIlIlI = -90.0f;
        }
        if (this.IlIlIIlllIllllllllIIIlIlI > 90.0f) {
            this.IlIlIIlllIllllllllIIIlIlI = 90.0f;
        }
        this.llIIIIllIIIIIIIlIIIlIIIIl += this.IlIlIIlllIllllllllIIIlIlI - f3;
        this.llllIIIIlIIIlIIIIIIlIllll += this.IIIIlIllIlIIlIIlIllIlIlll - f4;
    }

    public void s_() {
        this.lllIIIIIIlIlllIIlIlIIIllI();
    }

    public void lllIIIIIIlIlllIIlIlIIIllI() {
        int n;
        Block class_05492;
        int n2;
        int n3;
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("entityBaseTick");
        if (this.IlIIIlIIIIllIIIllIIIIIIll != null && this.IlIIIlIIIIllIIIllIIIIIIll.IllllIIIIlIIlIIIIlllIIIIl) {
            this.IlIIIlIIIIllIIIllIIIIIIll = null;
        }
        this.llIlIIlllIIIIIllIIlIlIIII = this.IllIIIlllllIlIlllIlllllII;
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI;
        this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIllIIlIIlIIlIIlIIlIIll instanceof class_0976) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("portal");
            class_0220 class_02202 = ((class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll).llIIlIIllIIllIlIIllIIllII();
            n3 = this.llIIlIIllIIllIlIIllIIllII();
            if (this.lIlIllIIllIIIIlllIlIlllIl) {
                if (class_02202.lIIlIIIIIlIlllIlIIlIlIlll()) {
                    if (this.IlIIIlIIIIllIIIllIIIIIIll == null && this.IlIIIlIIlllllIIIllIlIlIll++ >= n3) {
                        this.IlIIIlIIlllllIIIllIlIlIll = n3;
                        this.lIIIlIIllIllIIlIIlIIIllII = this.lIlllIIllIIIIIIlIlIIlIllI();
                        n2 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl == -1 ? 0 : -1;
                        this.IIIllIllIIlIlIlIlIllllIIl(n2);
                    }
                    this.lIlIllIIllIIIIlllIlIlllIl = false;
                }
            } else {
                if (this.IlIIIlIIlllllIIIllIlIlIll > 0) {
                    this.IlIIIlIIlllllIIIllIlIlIll -= 4;
                }
                if (this.IlIIIlIIlllllIIIllIlIlIll < 0) {
                    this.IlIIIlIIlllllIIIllIlIlIll = 0;
                }
            }
            if (this.lIIIlIIllIllIIlIIlIIIllII > 0) {
                --this.lIIIlIIllIllIIlIIlIIIllII;
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        }
        if (this.IlIIIIIllIlllIIIIlIIIllIl() && !this.llIlllIlIIllIlIIIIllIIlIl() && (class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)0.2f - (double)this.llllIlIIIIIIIIIlllIIlIIIl), n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("blockcrack_" + Block.lllIIIllIIIIlllIlIIllIIll(class_05492) + "_" + this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n, n3, n2), this.IlIIlllllIIlIlIlllllIllll + ((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.1, this.IllIIIIllIIllIllIlllIlIIl + ((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, -this.IIIIIIIIlIllIIllIIlllIllI * 4.0, 1.5, -this.llIIIlllIlllIlIllIIIIllIl * 4.0);
        }
        this.lIIIllIIIIIllllIlIlIllIll();
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lIlllIlllIIIIlIIlllIllIII = 0;
        } else if (this.lIlllIlllIIIIlIIlllIllIII > 0) {
            if (this.llllIlIIllIIlllllIIllIIll) {
                this.lIlllIlllIIIIlIIlllIllIII -= 4;
                if (this.lIlllIlllIIIIlIIlllIllIII < 0) {
                    this.lIlllIlllIIIIlIIlllIllIII = 0;
                }
            } else {
                if (this.lIlllIlllIIIIlIIlllIllIII % 20 == 0) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIlIIlIIIlIlIIIllIlllIl, 1.0f);
                }
                --this.lIlllIlllIIIIlIIlllIllIII;
            }
        }
        if (this.lIIlIlllIllIlIlllIIIIIIII()) {
            this.lIlIlIIIIIIlIIllllIlIIllI();
            this.lIIIllIIIIIllllIlIlIllIll *= 0.5f;
        }
        if (this.llIIlIlIlllIIllIlIlllIllI < -64.0) {
            this.llllIlIIIIIIIIIlllIIlIIIl();
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(0, this.lIlllIlllIIIIlIIlllIllIII > 0);
        }
        this.IlIIIIIllllllIIlllIllllll = false;
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    public int llIIlIIllIIllIlIIllIIllII() {
        return 0;
    }

    protected void lIlIlIIIIIIlIIllllIlIIllI() {
        if (!this.llllIlIIllIIlllllIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.IlIllllllIIlIIllllIIlIIIl, 4.0f);
            this.IlIIIIIllllllIIlllIllllll(15);
        }
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        int n2 = n * 20;
        if (this.lIlllIlllIIIIlIIlllIllIII < (n2 = class_1712.lllIIIllIIIIlllIlIIllIIll(this, n2))) {
            this.lIlllIlllIIIIlIIlllIllIII = n2;
        }
    }

    public void IllllIIIIlIIlIIIIlllIIIIl() {
        this.lIlllIlllIIIIlIIlllIllIII = 0;
    }

    protected void llllIlIIIIIIIIIlllIIlIIIl() {
        this.IIIIlIIlIIIllIIIIllIIIlII();
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(double d, double d2, double d3) {
        class_1974 class_19742 = this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, class_19742);
        return !list.isEmpty() ? false : !this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(class_19742);
    }

    public void IlIIIIIllllllIIlllIllllll(double d, double d2, double d3) {
        if (this.IlIIIlIllIIIllIIIIlIIlIll) {
            this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(d, d2, d3);
            this.IlIIlllllIIlIlIlllllIllll = (this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll + this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII) / 2.0;
            this.llIIlIlIlllIIllIlIlllIllI = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)this.llllIlIIIIIIIIIlllIIlIIIl - (double)this.IllllIIlIIIllIlllIlllIllI;
            this.IllIIIIllIIllIllIlllIlIIl = (this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl + this.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll) / 2.0;
        } else {
            Object object;
            int n;
            double d4;
            double d5;
            double d6;
            int n2;
            int n3;
            boolean bl;
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("move");
            this.IllllIIlIIIllIlllIlllIllI *= 0.4f;
            double d7 = this.IlIIlllllIIlIlIlllllIllll;
            double d8 = this.llIIlIlIlllIIllIlIlllIllI;
            double d9 = this.IllIIIIllIIllIllIlllIlIIl;
            if (this.llIIlIIllIIllIlIIllIIllII) {
                this.llIIlIIllIIllIlIIllIIllII = false;
                d *= 0.25;
                d2 *= (double)0.05f;
                d3 *= 0.25;
                this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
                this.llIIIlllIlllIlIllIIIIllIl = 0.0;
            }
            double d10 = d;
            double d11 = d2;
            double d12 = d3;
            class_1974 class_19742 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl();
            boolean bl2 = bl = this.llllllIlIllllIlIlIlIIIIlI && this.IIlIIlIlIlIllIIlIlIIIIlll() && this instanceof class_0814;
            if (bl) {
                double d13 = 0.05;
                while (d != 0.0 && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl(d, -1.0, 0.0)).isEmpty()) {
                    d = d < d13 && d >= -d13 ? 0.0 : (d > 0.0 ? (d -= d13) : (d += d13));
                    d10 = d;
                }
                while (d3 != 0.0 && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl(0.0, -1.0, d3)).isEmpty()) {
                    d3 = d3 < d13 && d3 >= -d13 ? 0.0 : (d3 > 0.0 ? (d3 -= d13) : (d3 += d13));
                    d12 = d3;
                }
                while (d != 0.0 && d3 != 0.0 && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl(d, -1.0, d3)).isEmpty()) {
                    d = d < d13 && d >= -d13 ? 0.0 : (d > 0.0 ? (d -= d13) : (d += d13));
                    d3 = d3 < d13 && d3 >= -d13 ? 0.0 : (d3 > 0.0 ? (d3 -= d13) : (d3 += d13));
                    d10 = d;
                    d12 = d3;
                }
            }
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(d, d2, d3));
            for (n3 = 0; n3 < list.size(); ++n3) {
                d2 = ((class_1974)list.get(n3)).lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI, d2);
            }
            this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(0.0, d2, 0.0);
            if (!this.lIlIlIIIIIIlIIllllIlIIllI && d11 != d2) {
                d3 = 0.0;
                d2 = 0.0;
                d = 0.0;
            }
            n3 = this.llllllIlIllllIlIlIlIIIIlI || d11 != d2 && d11 < 0.0 ? 1 : 0;
            for (n2 = 0; n2 < list.size(); ++n2) {
                d = ((class_1974)list.get(n2)).lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI, d);
            }
            this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(d, 0.0, 0.0);
            if (!this.lIlIlIIIIIIlIIllllIlIIllI && d10 != d) {
                d3 = 0.0;
                d2 = 0.0;
                d = 0.0;
            }
            for (n2 = 0; n2 < list.size(); ++n2) {
                d3 = ((class_1974)list.get(n2)).IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI, d3);
            }
            this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(0.0, 0.0, d3);
            if (!this.lIlIlIIIIIIlIIllllIlIIllI && d12 != d3) {
                d3 = 0.0;
                d2 = 0.0;
                d = 0.0;
            }
            if (this.IllIlIlIIIlllIIllIIIIlIll > 0.0f && n3 != 0 && (bl || this.IllllIIlIIIllIlllIlllIllI < 0.05f) && (d10 != d || d12 != d3)) {
                d6 = d;
                d5 = d2;
                d4 = d3;
                d = d10;
                d2 = this.IllIlIlIIIlllIIllIIIIlIll;
                d3 = d12;
                class_1974 class_19743 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl();
                this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl(class_19742);
                list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(d10, d2, d12));
                for (n = 0; n < list.size(); ++n) {
                    d2 = ((class_1974)list.get(n)).lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI, d2);
                }
                this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(0.0, d2, 0.0);
                if (!this.lIlIlIIIIIIlIIllllIlIIllI && d11 != d2) {
                    d3 = 0.0;
                    d2 = 0.0;
                    d = 0.0;
                }
                for (n = 0; n < list.size(); ++n) {
                    d = ((class_1974)list.get(n)).lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI, d);
                }
                this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(d, 0.0, 0.0);
                if (!this.lIlIlIIIIIIlIIllllIlIIllI && d10 != d) {
                    d3 = 0.0;
                    d2 = 0.0;
                    d = 0.0;
                }
                for (n = 0; n < list.size(); ++n) {
                    d3 = ((class_1974)list.get(n)).IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI, d3);
                }
                this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(0.0, 0.0, d3);
                if (!this.lIlIlIIIIIIlIIllllIlIIllI && d12 != d3) {
                    d3 = 0.0;
                    d2 = 0.0;
                    d = 0.0;
                }
                if (!this.lIlIlIIIIIIlIIllllIlIIllI && d11 != d2) {
                    d3 = 0.0;
                    d2 = 0.0;
                    d = 0.0;
                } else {
                    d2 = -this.IllIlIlIIIlllIIllIIIIlIll;
                    for (n = 0; n < list.size(); ++n) {
                        d2 = ((class_1974)list.get(n)).lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI, d2);
                    }
                    this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(0.0, d2, 0.0);
                }
                if (d6 * d6 + d4 * d4 >= d * d + d3 * d3) {
                    d = d6;
                    d2 = d5;
                    d3 = d4;
                    this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl(class_19743);
                }
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("rest");
            this.IlIIlllllIIlIlIlllllIllll = (this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll + this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII) / 2.0;
            this.llIIlIlIlllIIllIlIlllIllI = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)this.llllIlIIIIIIIIIlllIIlIIIl - (double)this.IllllIIlIIIllIlllIlllIllI;
            this.IllIIIIllIIllIllIlllIlIIl = (this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl + this.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll) / 2.0;
            this.lIlIIllllIlIIIIllIIIIlIIl = d10 != d || d12 != d3;
            this.llIlllIIllIlllIlIlIlIIIll = d11 != d2;
            this.llllllIlIllllIlIlIlIIIIlI = d11 != d2 && d11 < 0.0;
            this.IIIIlIIlIIIllIIIIllIIIlII = this.lIlIIllllIlIIIIllIIIIlIIl || this.llIlllIIllIlllIlIlIlIIIll;
            this.lllIIIllIIIIlllIlIIllIIll(d2, this.llllllIlIllllIlIlIlIIIIlI);
            if (d10 != d) {
                this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
            }
            if (d11 != d2) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
            }
            if (d12 != d3) {
                this.llIIIlllIlllIlIllIIIIllIl = 0.0;
            }
            d6 = this.IlIIlllllIIlIlIlllllIllll - d7;
            d5 = this.llIIlIlIlllIIllIlIlllIllI - d8;
            d4 = this.IllIIIIllIIllIllIlllIlIIl - d9;
            if (this.IIIllIIlIIIIIIlIlIIllIIlI() && !bl && this.IlIIIlIIIIllIIIllIIIIIIll == null) {
                int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
                n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)0.2f - (double)this.llllIlIIIIIIIIIlllIIlIIIl);
                int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
                object = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n4, n, n5);
                int n6 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n4, n - 1, n5).lIIIIlIlIIlllllIIllIIlIII();
                if (n6 == 11 || n6 == 32 || n6 == 21) {
                    object = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n4, n - 1, n5);
                }
                if (object != Blocks.lIlIIllIllIIIIIlIllllIIIl) {
                    d5 = 0.0;
                }
                this.IllIIIlllllIlIlllIlllllII = (float)((double)this.IllIIIlllllIlIlllIlllllII + (double) MathHelper.lllIIIllIIIIlllIlIIllIIll(d6 * d6 + d4 * d4) * 0.6);
                this.llIlllIlIIllIlIIIIllIIlIl = (float)((double)this.llIlllIlIIllIlIIIIllIIlIl + (double) MathHelper.lllIIIllIIIIlllIlIIllIIll(d6 * d6 + d5 * d5 + d4 * d4) * 0.6);
                if (this.llIlllIlIIllIlIIIIllIIlIl > (float)this.IlIllllllIIlIIllllIIlIIIl && ((Block)object).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    this.IlIllllllIIlIIllllIIlIIIl = (int)this.llIlllIlIIllIlIIIIllIIlIl + 1;
                    if (this.llIlllIlIIllIlIIIIllIIlIl()) {
                        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI * (double)0.2f + this.IIlIIlIlIlIllIIlIlIIIIlll * this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl * (double)0.2f) * 0.35f;
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIlIIlIIIIlIlllIlIIII(), f, 1.0f + (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.4f);
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(n4, n, n5, (Block)object);
                    ((Block)object).lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, n4, n, n5, this);
                }
            }
            try {
                this.lllIIIIlIlIIlIIlllIIIIIIl();
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Checking entity block collision");
                object = class_02232.lllIIIllIIIIlllIlIIllIIll("Entity being checked for collision");
                this.lllIIIllIIIIlllIlIIllIIll((class_0799)object);
                throw new class_0892(class_02232);
            }
            boolean bl3 = this.IllIIIlllllIlIlllIlllllII();
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll(this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll(0.001, 0.001, 0.001))) {
                this.lIllllIIlIIIlIllllllIIIll(1);
                if (!bl3) {
                    ++this.lIlllIlllIIIIlIIlllIllIII;
                    if (this.lIlllIlllIIIIlIIlllIllIII == 0) {
                        this.IlIIIIIllllllIIlllIllllll(8);
                    }
                }
            } else if (this.lIlllIlllIIIIlIIlllIllIII <= 0) {
                this.lIlllIlllIIIIlIIlllIllIII = -this.lllIIIlIIlIlIllIIIIIlIIll;
            }
            if (bl3 && this.lIlllIlllIIIIlIIlllIllIII > 0) {
                this.lllIIIllIIIIlllIlIIllIIll("random.fizz", 0.7f, 1.6f + (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.4f);
                this.lIlllIlllIIIIlIIlllIllIII = -this.lllIIIlIIlIlIllIIIIIlIIll;
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        }
    }

    protected String IIIIlIlIIlIIIIlIlllIlIIII() {
        return "game.neutral.swim";
    }

    protected void lllIIIIlIlIIlIIlllIIIIIIl() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll + 0.001);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(n6, n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.001), n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl + 0.001), n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII - 0.001), n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll - 0.001), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll - 0.001))) {
            for (int i = n6; i <= n3; ++i) {
                for (int j = n5; j <= n2; ++j) {
                    for (int k = n4; k <= n; ++k) {
                        Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(i, j, k);
                        try {
                            class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, i, j, k, this);
                            continue;
                        }
                        catch (Throwable throwable) {
                            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Colliding entity with block");
                            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("net.minecraft.block.Block being collided with");
                            class_0799.lllIIIllIIIIlllIlIIllIIll(class_07992, i, j, k, class_05492, this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(i, j, k));
                            throw new class_0892(class_02232);
                        }
                    }
                }
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        class_1031 class_10312 = class_05492.llIIIlllIlllIlIllIIIIllIl;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2 + 1, n3) == Blocks.lIIllIIlIIIlllIlllIIlIIlI) {
            class_10312 = Blocks.lIIllIIlIIIlllIlllIIlIIlI.llIIIlllIlllIlIllIIIIllIl;
            this.lllIIIllIIIIlllIlIIllIIll(class_10312.IlIIIIIllllllIIlllIllllll(), class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.15f, class_10312.lIlllIlllIIIIlIIlllIllIII());
        } else if (!class_05492.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_10312.IlIIIIIllllllIIlllIllllll(), class_10312.IlIllllllIIlIIllllIIlIIIl() * 0.15f, class_10312.lIlllIlllIIIIlIIlllIllIII());
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, float f, float f2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, string, f, f2);
    }

    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return true;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(double d, boolean bl) {
        if (bl) {
            if (this.lIIIllIIIIIllllIlIlIllIll > 0.0f) {
                this.lIllllIIlIIIlIllllllIIIll(this.lIIIllIIIIIllllIlIlIllIll);
                this.lIIIllIIIIIllllIlIlIllIll = 0.0f;
            }
        } else if (d < 0.0) {
            this.lIIIllIIIIIllllIlIlIllIll = (float)((double)this.lIIIllIIIIIllllIlIlIllIll - d);
        }
    }

    public class_1974 IllIIIllIIIIlIlIlIllIIlll() {
        return null;
    }

    protected void lIllllIIlIIIlIllllllIIIll(int n) {
        if (!this.llllIlIIllIIlllllIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll, (float)n);
        }
    }

    public final boolean llIlIIlllIIIIIllIIlIlIIII() {
        return this.llllIlIIllIIlllllIIllIIll;
    }

    protected void lIllllIIlIIIlIllllllIIIll(float f) {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            this.lIlIlIIlIIIIlIIIIIlllIIII.lIllllIIlIIIlIllllllIIIll(f);
        }
    }

    public boolean IllIIIlllllIlIlllIlllllII() {
        return this.IIIlIlIllIlllllIlIllllllI || this.lIlIllIIlIIlIIlIIlIIlIIll.IIlllIlIlllIllIIIlllIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)) || this.lIlIllIIlIIlIIlIIlIIlIIll.IIlllIlIlllIllIIIlllIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + (double)this.lllIIIIlIlIIlIIlllIIIIIIl), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
    }

    public boolean llIlllIlIIllIlIIIIllIIlIl() {
        return this.IIIlIlIllIlllllIlIllllllI;
    }

    public boolean lIIIllIIIIIllllIlIlIllIll() {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(0.0, -0.4f, 0.0).IlIIIIIllllllIIlllIllllll(0.001, 0.001, 0.001), class_1855.IllIIlllllllIIlIIlIIIIlIl, this)) {
            if (!this.IIIlIlIllIlllllIlIllllllI && !this.IlIIIIIllllllIIlllIllllll) {
                float f;
                float f2;
                float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI * (double)0.2f + this.IIlIIlIlIlIllIIlIlIIIIlll * this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl * (double)0.2f) * 0.2f;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                this.lllIIIllIIIIlllIlIIllIIll(this.lIIIlIIIlIlllIllIIIlIIIlI(), f3, 1.0f + (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.4f);
                float f4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl);
                int n = 0;
                while ((float)n < 1.0f + this.IIIIlIlIIlIIIIlIlllIlIIII * 20.0f) {
                    f2 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * this.IIIIlIlIIlIIIIlIlllIlIIII;
                    f = (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * this.IIIIlIlIIlIIIIlIlllIlIIII;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("bubble", this.IlIIlllllIIlIlIlllllIllll + (double)f2, (double)(f4 + 1.0f), this.IllIIIIllIIllIllIlllIlIIl + (double)f, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll - (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f), this.llIIIlllIlllIlIllIIIIllIl);
                    ++n;
                }
                n = 0;
                while ((float)n < 1.0f + this.IIIIlIlIIlIIIIlIlllIlIIII * 20.0f) {
                    f2 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * this.IIIIlIlIIlIIIIlIlllIlIIII;
                    f = (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * this.IIIIlIlIIlIIIIlIlllIlIIII;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("splash", this.IlIIlllllIIlIlIlllllIllll + (double)f2, (double)(f4 + 1.0f), this.IllIIIIllIIllIllIlllIlIIl + (double)f, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                    ++n;
                }
            }
            this.lIIIllIIIIIllllIlIlIllIll = 0.0f;
            this.IIIlIlIllIlllllIlIllllllI = true;
            this.lIlllIlllIIIIlIIlllIllIII = 0;
        } else {
            this.IIIlIlIllIlllllIlIllllllI = false;
        }
        return this.IIIlIlIllIlllllIlIllllllI;
    }

    protected String lIIIlIIIlIlllIllIIIlIIIlI() {
        return "game.neutral.swim.splash";
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1855 class_18552) {
        int n;
        int n2;
        double d = this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll();
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2 = MathHelper.lIlllIlllIIIIlIIlllIllIII((float) MathHelper.IlIllllllIIlIIllllIIlIIIl(d)), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
        if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_18552) {
            float f = class_0816.IllIIlllllllIIlIIlIIIIlIl(this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n3, n2, n)) - 0.11111111f;
            float f2 = (float)(n2 + 1) - f;
            return d < (double)f2;
        }
        return false;
    }

    public float llIIllIllIlIIlIIllIllllll() {
        return 0.0f;
    }

    public boolean lIIlIlllIllIlIlllIIIIIIII() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(-0.1f, -0.4f, -0.1f), class_1855.IIIllIllIIlIlIlIlIllllIIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        float f4 = f * f + f2 * f2;
        if (f4 >= 1.0E-4f) {
            if ((f4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f4)) < 1.0f) {
                f4 = 1.0f;
            }
            f4 = f3 / f4;
            float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
            float f6 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
            this.IIIIIIIIlIllIIllIIlllIllI += (double)((f *= f4) * f6 - (f2 *= f4) * f5);
            this.llIIIlllIlllIlIllIIIIllIl += (double)(f2 * f6 + f * f5);
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        int n;
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll(n2, 0, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
            double d = (this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll - this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) * 0.66;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)this.llllIlIIIIIIIIIlllIIlIIIl + d);
            return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n2, n3, n, 0);
        }
        return 0;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        int n;
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll(n2, 0, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
            double d = (this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll - this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) * 0.66;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)this.llllIlIIIIIIIIIlllIIlIIIl + d);
            return this.lIlIllIIlIIlIIlIIlIIlIIll.llIIlllIllIllllIIIlIIIIII(n2, n3, n);
        }
        return 0.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.lIlIllIIlIIlIIlIIlIIlIIll = class_13342;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2) {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll = d;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI = d2;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl = d3;
        this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = f;
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI = f2;
        this.IllllIIlIIIllIlllIlllIllI = 0.0f;
        double d4 = this.llllIIIIlIIIlIIIIIIlIllll - f;
        if (d4 < -180.0) {
            this.llllIIIIlIIIlIIIIIIlIllll += 360.0f;
        }
        if (d4 >= 180.0) {
            this.llllIIIIlIIIlIIIIIIlIllll -= 360.0f;
        }
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.lIllllIIlIIIlIllllllIIIll(f, f2);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3, float f, float f2) {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll = d;
        this.lIIIlIIIlIlllIllIIIlIIIlI = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI = d2 + (double)this.llllIlIIIIIIIIIlllIIlIIIl;
        this.lIIlIlllIllIlIlllIIIIIIII = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl = d3;
        this.IIlIllIIlllllIIlIIllllIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.IIIIlIllIlIIlIIlIllIlIlll = f;
        this.IlIlIIlllIllllllllIIIlIlI = f2;
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
    }

    public float lIlllIlllIIIIlIIlllIllIII(class_1521 class_15212) {
        float f = (float)(this.IlIIlllllIIlIlIlllllIllll - class_15212.IlIIlllllIIlIlIlllllIllll);
        float f2 = (float)(this.llIIlIlIlllIIllIlIlllIllI - class_15212.llIIlIlIlllIIllIlIlllIllI);
        float f3 = (float)(this.IllIIIIllIIllIllIlllIlIIl - class_15212.IllIIIIllIIllIllIlllIlIIl);
        return MathHelper.IlIllllllIIlIIllllIIlIIIl(f * f + f2 * f2 + f3 * f3);
    }

    public double lIllllIIlIIIlIllllllIIIll(double d, double d2, double d3) {
        double d4 = this.IlIIlllllIIlIlIlllllIllll - d;
        double d5 = this.llIIlIlIlllIIllIlIlllIllI - d2;
        double d6 = this.IllIIIIllIIllIllIlllIlIIl - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public double IIIllIIlIIIIIIlIlIIllIIlI(double d, double d2, double d3) {
        double d4 = this.IlIIlllllIIlIlIlllllIllll - d;
        double d5 = this.llIIlIlIlllIIllIlIlllIllI - d2;
        double d6 = this.IllIIIIllIIllIllIlllIlIIl - d3;
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public double IlIIIIIllllllIIlllIllllll(class_1521 class_15212) {
        double d = this.IlIIlllllIIlIlIlllllIllll - class_15212.IlIIlllllIIlIlIlllllIllll;
        double d2 = this.llIIlIlIlllIIllIlIlllIllI - class_15212.llIIlIlIlllIIllIlIlllIllI;
        double d3 = this.IllIIIIllIIllIllIlllIlIIl - class_15212.IllIIIIllIIllIllIlllIlIIl;
        return d * d + d2 * d2 + d3 * d3;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
    }

    public void lIllllIIlIIIlIllllllIIIll(class_1521 class_15212) {
        double d;
        double d2;
        double d3;
        if (class_15212.lIlIlIIlIIIIlIIIIIlllIIII != this && class_15212.IlIIIlIIIIllIIIllIIIIIIll != this && (d3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d2 = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll, d = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl)) >= (double)0.01f) {
            d3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d3);
            d2 /= d3;
            d /= d3;
            double d4 = 1.0 / d3;
            if (d4 > 1.0) {
                d4 = 1.0;
            }
            d2 *= d4;
            d *= d4;
            d2 *= (double)0.05f;
            d *= (double)0.05f;
            this.IllIIlllllllIIlIIlIIIIlIl(-(d2 *= (double)(1.0f - this.llllIIllIlIlllllllIIlIIlI)), 0.0, -(d *= (double)(1.0f - this.llllIIllIlIlllllllIIlIIlI)));
            class_15212.IllIIlllllllIIlIIlIIIIlIl(d2, 0.0, d);
        }
    }

    public void IllIIlllllllIIlIIlIIIIlIl(double d, double d2, double d3) {
        this.IIIIIIIIlIllIIllIIlllIllI += d;
        this.IIlIIlIlIlIllIIlIlIIIIlll += d2;
        this.llIIIlllIlllIlIllIIIIllIl += d3;
        this.lIIlIlIIllIIIlIIlIlIIIlII = true;
    }

    protected void IIlIllIIlllllIIlIIllllIIl() {
        this.lllIIIIIIlIlllIIlIlIIIllI = true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        this.IIlIllIIlllllIIlIIllllIIl();
        return false;
    }

    public boolean IllllIIlIIIllIlllIlllIllI() {
        return false;
    }

    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return false;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, int n) {
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        double d4 = this.IlIIlllllIIlIlIlllllIllll - d;
        double d5 = this.llIIlIlIlllIIllIlIlllIllI - d2;
        double d6 = this.IllIIIIllIIllIllIlllIlIIl - d3;
        double d7 = d4 * d4 + d5 * d5 + d6 * d6;
        return this.lllIIIllIIIIlllIlIIllIIll(d7);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(double d) {
        double d2 = this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll();
        return d < (d2 *= 64.0 * this.IlIlIIlllIIlIllIIIlllllIl) * d2;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_0775 class_07752) {
        String string = this.IlIIIlIllIIIllIIIIlIIlIll();
        if (!this.IllllIIIIlIIlIIIIlllIIIIl && string != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("id", string);
            this.IlIIIIIllllllIIlllIllllll(class_07752);
            return true;
        }
        return false;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(class_0775 class_07752) {
        String string = this.IlIIIlIllIIIllIIIIlIIlIll();
        if (!this.IllllIIIIlIIlIIIIlllIIIIl && string != null && this.lIlIlIIlIIIIlIIIIIlllIIII == null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("id", string);
            this.IlIIIIIllllllIIlllIllllll(class_07752);
            return true;
        }
        return false;
    }

    public void IlIIIIIllllllIIlllIllllll(class_0775 class_07752) {
        try {
            class_0775 class_07753;
            class_07752.lllIIIllIIIIlllIlIIllIIll("Pos", this.lllIIIllIIIIlllIlIIllIIll(new double[]{this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)this.IllllIIlIIIllIlllIlllIllI, this.IllIIIIllIIllIllIlllIlIIl}));
            class_07752.lllIIIllIIIIlllIlIIllIIll("Motion", this.lllIIIllIIIIlllIlIIllIIll(new double[]{this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl}));
            class_07752.lllIIIllIIIIlllIlIIllIIll("Rotation", this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI));
            class_07752.lllIIIllIIIIlllIlIIllIIll("FallDistance", this.lIIIllIIIIIllllIlIlIllIll);
            class_07752.lllIIIllIIIIlllIlIIllIIll("Fire", (short)this.lIlllIlllIIIIlIIlllIllIII);
            class_07752.lllIIIllIIIIlllIlIIllIIll("Air", (short)this.lIlIllIIllIIIIlllIlIlllIl());
            class_07752.lllIIIllIIIIlllIlIIllIIll("OnGround", this.llllllIlIllllIlIlIlIIIIlI);
            class_07752.lllIIIllIIIIlllIlIIllIIll("Dimension", this.lIIllllllllIlIllllllllIlI);
            class_07752.lllIIIllIIIIlllIlIIllIIll("Invulnerable", this.IIIllIllIIlIlIlIlIllllIIl);
            class_07752.lllIIIllIIIIlllIlIIllIIll("PortalCooldown", this.lIIIlIIllIllIIlIIlIIIllII);
            class_07752.lllIIIllIIIIlllIlIIllIIll("UUIDMost", this.lIIlllIIlIlIlIIIlIlllIIll().getMostSignificantBits());
            class_07752.lllIIIllIIIIlllIlIIllIIll("UUIDLeast", this.lIIlllIIlIlIlIIIlIlllIIll().getLeastSignificantBits());
            this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
            if (this.IlIIIlIIIIllIIIllIIIIIIll != null && this.IlIIIlIIIIllIIIllIIIIIIll.IlIllllllIIlIIllllIIlIIIl(class_07753 = new class_0775())) {
                class_07752.lllIIIllIIIIlllIlIIllIIll("Riding", class_07753);
            }
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Saving entity NBT");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Entity being saved");
            this.lllIIIllIIIIlllIlIIllIIll(class_07992);
            throw new class_0892(class_02232);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll(class_0775 class_07752) {
        try {
            class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Pos", 6);
            class_2145 class_21453 = class_07752.IlIllllllIIlIIllllIIlIIIl("Motion", 6);
            class_2145 class_21454 = class_07752.IlIllllllIIlIIllllIIlIIIl("Rotation", 5);
            this.IIIIIIIIlIllIIllIIlllIllI = class_21453.lIlllIlllIIIIlIIlllIllIII(0);
            this.IIlIIlIlIlIllIIlIlIIIIlll = class_21453.lIlllIlllIIIIlIIlllIllIII(1);
            this.llIIIlllIlllIlIllIIIIllIl = class_21453.lIlllIlllIIIIlIIlllIllIII(2);
            if (Math.abs(this.IIIIIIIIlIllIIllIIlllIllI) > 10.0) {
                this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
            }
            if (Math.abs(this.IIlIIlIlIlIllIIlIlIIIIlll) > 10.0) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
            }
            if (Math.abs(this.llIIIlllIlllIlIllIIIIllIl) > 10.0) {
                this.llIIIlllIlllIlIllIIIIllIl = 0.0;
            }
            this.lIIIlIIIlIlllIllIIIlIIIlI = this.IlIIlllllIIlIlIlllllIllll = class_21452.lIlllIlllIIIIlIIlllIllIII(0);
            this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
            this.lIIlIlllIllIlIlllIIIIIIII = this.llIIlIlIlllIIllIlIlllIllI = class_21452.lIlllIlllIIIIlIIlllIllIII(1);
            this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
            this.IIlIllIIlllllIIlIIllllIIl = this.IllIIIIllIIllIllIlllIlIIl = class_21452.lIlllIlllIIIIlIIlllIllIII(2);
            this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
            this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = class_21454.IlIIIIIllllllIIlllIllllll(0);
            this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI = class_21454.IlIIIIIllllllIIlllIllllll(1);
            this.lIIIllIIIIIllllIlIlIllIll = class_07752.IllIIlllllllIIlIIlIIIIlIl("FallDistance");
            this.lIlllIlllIIIIlIIlllIllIII = class_07752.IlIIIIIllllllIIlllIllllll("Fire");
            this.IllIIlllllllIIlIIlIIIIlIl(class_07752.IlIIIIIllllllIIlllIllllll("Air"));
            this.llllllIlIllllIlIlIlIIIIlI = class_07752.lllIIlIIIllllllIIIIlIlIlI("OnGround");
            this.lIIllllllllIlIllllllllIlI = class_07752.lIllllIIlIIIlIllllllIIIll("Dimension");
            this.IIIllIllIIlIlIlIlIllllIIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Invulnerable");
            this.lIIIlIIllIllIIlIIlIIIllII = class_07752.lIllllIIlIIIlIllllllIIIll("PortalCooldown");
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("UUIDMost", 4) && class_07752.lllIlIIlIIIlIlIIIllIlllIl("UUIDLeast", 4)) {
                this.lIIllIIlIIIlllIlllIIlIIlI = new UUID(class_07752.IIIllIIlIIIIIIlIlIIllIIlI("UUIDMost"), class_07752.IIIllIIlIIIIIIlIlIIllIIlI("UUIDLeast"));
            }
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            this.lllIIIllIIIIlllIlIIllIIll(class_07752);
            if (this.IllIlIlIIIlllIIllIIIIlIll()) {
                this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            }
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Loading entity NBT");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Entity being loaded");
            this.lllIIIllIIIIlllIlIIllIIll(class_07992);
            throw new class_0892(class_02232);
        }
    }

    protected boolean IllIlIlIIIlllIIllIIIIlIll() {
        return true;
    }

    protected final String IlIIIlIllIIIllIIIIlIIlIll() {
        return class_0054.lllIlIIlIIIlIlIIIllIlllIl(this);
    }

    protected abstract void lllIIIllIIIIlllIlIIllIIll(class_0775 var1);

    protected abstract void lllIlIIlIIIlIlIIIllIlllIl(class_0775 var1);

    public void llllIIllIlIlllllllIIlIIlI() {
    }

    protected class_2145 lllIIIllIIIIlllIlIIllIIll(double ... arrd) {
        class_2145 class_21452 = new class_2145();
        double[] arrd2 = arrd;
        int n = arrd.length;
        for (int i = 0; i < n; ++i) {
            double d = arrd2[i];
            class_21452.lllIIIllIIIIlllIlIIllIIll(new class_2049(d));
        }
        return class_21452;
    }

    protected class_2145 lllIIIllIIIIlllIlIIllIIll(float ... arrf) {
        class_2145 class_21452 = new class_2145();
        float[] arrf2 = arrf;
        int n = arrf.length;
        for (int i = 0; i < n; ++i) {
            float f = arrf2[i];
            class_21452.lllIIIllIIIIlllIlIIllIIll(new class_0112(f));
        }
        return class_21452;
    }

    public float llIIlllIllIllllIIIlIIIIII() {
        return this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
    }

    public class_1781 lllIIIllIIIIlllIlIIllIIll(Item class_06112, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_06112, n, 0.0f);
    }

    public class_1781 lllIIIllIIIIlllIlIIllIIll(Item class_06112, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_06112, n, 0), f);
    }

    public class_1781 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, float f) {
        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl != 0 && class_08972.lllIIIllIIIIlllIlIIllIIll() != null) {
            class_1781 class_17812 = new class_1781(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)f, this.IllIIIIllIIllIllIlllIlIIl, class_08972);
            class_17812.lllIlIIlIIIlIlIIIllIlllIl = 10;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_17812);
            return class_17812;
        }
        return null;
    }

    public boolean IlllIIlllllllIIllIlIllllI() {
        return !this.IllllIIIIlIIlIIIIlllIIIIl;
    }

    public boolean IlllIIIllllIIllIllIlIIlIl() {
        for (int i = 0; i < 8; ++i) {
            int n;
            int n2;
            float f = ((float)((i >> 0) % 2) - 0.5f) * this.IIIIlIlIIlIIIIlIlllIlIIII * 0.8f;
            float f2 = ((float)((i >> 1) % 2) - 0.5f) * 0.1f;
            float f3 = ((float)((i >> 2) % 2) - 0.5f) * this.IIIIlIlIIlIIIIlIlllIlIIII * 0.8f;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + (double)f);
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll() + (double)f2), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl + (double)f3)).IIIllIllIIlIlIlIlIllllIIl()) continue;
            return true;
        }
        return false;
    }

    public boolean b_(class_0814 class_08142) {
        return false;
    }

    public class_1974 IIIllIIlIIIIIIlIlIIllIIlI(class_1521 class_15212) {
        return null;
    }

    public void lllIIIlIIlIlIllIIIIIlIIll() {
        if (this.IlIIIlIIIIllIIIllIIIIIIll.IllllIIIIlIIlIIIIlllIIIIl) {
            this.IlIIIlIIIIllIIIllIIIIIIll = null;
        } else {
            this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
            this.llIIIlllIlllIlIllIIIIllIl = 0.0;
            this.s_();
            if (this.IlIIIlIIIIllIIIllIIIIIIll != null) {
                this.IlIIIlIIIIllIIIllIIIIIIll.IIIlIlIllIlllllIlIllllllI();
                this.IllIIlllllllIIlIIlIIIIlIl += (double)(this.IlIIIlIIIIllIIIllIIIIIIll.IIIIlIllIlIIlIIlIllIlIlll - this.IlIIIlIIIIllIIIllIIIIIIll.llllIIIIlIIIlIIIIIIlIllll);
                this.IIIllIIlIIIIIIlIlIIllIIlI += (double)(this.IlIIIlIIIIllIIIllIIIIIIll.IlIlIIlllIllllllllIIIlIlI - this.IlIIIlIIIIllIIIllIIIIIIll.llIIIIllIIIIIIIlIIIlIIIIl);
                while (this.IllIIlllllllIIlIIlIIIIlIl >= 180.0) {
                    this.IllIIlllllllIIlIIlIIIIlIl -= 360.0;
                }
                while (this.IllIIlllllllIIlIIlIIIIlIl < -180.0) {
                    this.IllIIlllllllIIlIIlIIIIlIl += 360.0;
                }
                while (this.IIIllIIlIIIIIIlIlIIllIIlI >= 180.0) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI -= 360.0;
                }
                while (this.IIIllIIlIIIIIIlIlIIllIIlI < -180.0) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI += 360.0;
                }
                double d = this.IllIIlllllllIIlIIlIIIIlIl * 0.5;
                double d2 = this.IIIllIIlIIIIIIlIlIIllIIlI * 0.5;
                float f = 10.0f;
                if (d > (double)f) {
                    d = f;
                }
                if (d < (double)(-f)) {
                    d = -f;
                }
                if (d2 > (double)f) {
                    d2 = f;
                }
                if (d2 < (double)(-f)) {
                    d2 = -f;
                }
                this.IllIIlllllllIIlIIlIIIIlIl -= d;
                this.IIIllIIlIIIIIIlIlIIllIIlI -= d2;
            }
        }
    }

    public void IIIlIlIllIlllllIlIllllllI() {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + this.llllIlIIllIIlllllIIllIIll() + this.lIlIlIIlIIIIlIIIIIlllIIII.IIIIlIllIlIIIIIllllIIlllI(), this.IllIIIIllIIllIllIlllIlIIl);
        }
    }

    public double IIIIlIllIlIIIIIllllIIlllI() {
        return this.llllIlIIIIIIIIIlllIIlIIIl;
    }

    public double llllIlIIllIIlllllIIllIIll() {
        return (double)this.lllIIIIlIlIIlIIlllIIIIIIl * 0.75;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0.0;
        this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
        if (class_15212 == null) {
            if (this.IlIIIlIIIIllIIIllIIIIIIll != null) {
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIlIIIIllIIIllIIIIIIll.IlIIlllllIIlIlIlllllIllll, this.IlIIIlIIIIllIIIllIIIIIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIIlIlIIlIIlllIIIIIIl, this.IlIIIlIIIIllIIIllIIIIIIll.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
                this.IlIIIlIIIIllIIIllIIIIIIll.lIlIlIIlIIIIlIIIIIlllIIII = null;
            }
            this.IlIIIlIIIIllIIIllIIIIIIll = null;
        } else {
            if (this.IlIIIlIIIIllIIIllIIIIIIll != null) {
                this.IlIIIlIIIIllIIIllIIIIIIll.lIlIlIIlIIIIlIIIIIlllIIII = null;
            }
            if (class_15212 != null) {
                class_1521 class_15213 = class_15212.IlIIIlIIIIllIIIllIIIIIIll;
                while (class_15213 != null) {
                    if (class_15213 == this) {
                        return;
                    }
                    class_15213 = class_15213.IlIIIlIIIIllIIIllIIIIIIll;
                }
            }
            this.IlIIIlIIIIllIIIllIIIIIIll = class_15212;
            class_15212.lIlIlIIlIIIIlIIIIIlllIIII = this;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2, int n) {
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.lIllllIIlIIIlIllllllIIIll(f, f2);
        List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll(0.03125, 0.0, 0.03125));
        if (!list.isEmpty()) {
            double d4 = 0.0;
            for (int i = 0; i < list.size(); ++i) {
                class_1974 class_19742 = (class_1974)list.get(i);
                if (!(class_19742.IlIIIIIllllllIIlllIllllll > d4)) continue;
                d4 = class_19742.IlIIIIIllllllIIlllIllllll;
            }
            this.IlIllllllIIlIIllllIIlIIIl(d, d2 += d4 - this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, d3);
        }
    }

    public float IlIlIllIIlIIIIlllIlIllIlI() {
        return 0.1f;
    }

    public class_0864 IlIIllIlIlIllIIIlIIlIlIIl() {
        return null;
    }

    public void lIlIIllIllIIIIIlIllllIIIl() {
        if (this.lIIIlIIllIllIIlIIlIIIllII > 0) {
            this.lIIIlIIllIllIIlIIlIIIllII = this.lIlllIIllIIIIIIlIlIIlIllI();
        } else {
            double d = this.llIIlIllIllllIlIIIIlIIlll - this.IlIIlllllIIlIlIlllllIllll;
            double d2 = this.lIlllIlllIlIIIIlllIlIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.lIlIllIIllIIIIlllIlIlllIl) {
                this.lIIIIllIIllIIIlIIIllIllII = class_1632.lllIIIllIIIIlllIlIIllIIll(d, d2);
            }
            this.lIlIllIIllIIIIlllIlIlllIl = true;
        }
    }

    public int lIlllIIllIIIIIIlIlIIlIllI() {
        return 300;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(double d, double d2, double d3) {
        this.IIIIIIIIlIllIIllIIlllIllI = d;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d2;
        this.llIIIlllIlllIlIllIIIIllIl = d3;
    }

    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
    }

    public void llIIIlIlIlIIlIllIIIllIlIl() {
    }

    public ItemStack[] lIIlIIlIllIlIIlIlIIlIlIlI() {
        return null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972) {
    }

    public boolean llIIIIIlIIlIIIIllIIIlIIII() {
        boolean bl = this.lIlIllIIlIIlIIlIIlIIlIIll != null && this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl;
        return !this.llllIlIIllIIlllllIIllIIll && (this.lIlllIlllIIIIlIIlllIllIII > 0 || bl && this.IIIllIIlIIIIIIlIlIIllIIlI(0));
    }

    public boolean lIlIlIIllIIIlllIllIIlIllI() {
        return this.IlIIIlIIIIllIIIllIIIIIIll != null;
    }

    public boolean IIlIIlIlIlIllIIlIlIIIIlll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI(1);
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll(1, bl);
    }

    public boolean IlIIIIIllIlllIIIIlIIIllIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI(3);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll(3, bl);
    }

    public boolean lIIlIlIIllIIIlIIlIlIIIlII() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI(5);
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_0814 class_08142) {
        return this.lIIlIlIIllIIIlIIlIlIIIlII();
    }

    public void IlIIIIIllllllIIlllIllllll(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll(5, bl);
    }

    public boolean lIIIlIIllIllIIlIIlIIIllII() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI(4);
    }

    public void lIllllIIlIIIlIllllllIIIll(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll(4, bl);
    }

    protected boolean IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(0) & 1 << n) != 0;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(0);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(0, (byte)(by | 1 << n));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(0, (byte)(by & ~(1 << n)));
        }
    }

    public int lIlIllIIllIIIIlllIlIlllIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(1);
    }

    public void IllIIlllllllIIlIIlIIIIlIl(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(1, (short)n);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0411 class_04112) {
        this.lIllllIIlIIIlIllllllIIIll(5);
        ++this.lIlllIlllIIIIlIIlllIllIII;
        if (this.lIlllIlllIIIIlIIlllIllIII == 0) {
            this.IlIIIIIllllllIIlllIllllll(8);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
    }

    protected boolean lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3);
        double d4 = d - (double)n;
        double d5 = d2 - (double)n2;
        double d6 = d3 - (double)n3;
        List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI);
        if (list.isEmpty() && !this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIlIIIllllllIIIIlIlIlI(n, n2, n3)) {
            return false;
        }
        boolean bl = !this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIlIIIllllllIIIIlIlIlI(n - 1, n2, n3);
        boolean bl2 = !this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIlIIIllllllIIIIlIlIlI(n + 1, n2, n3);
        boolean bl3 = !this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIlIIIllllllIIIIlIlIlI(n, n2 - 1, n3);
        boolean bl4 = !this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIlIIIllllllIIIIlIlIlI(n, n2 + 1, n3);
        boolean bl5 = !this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIlIIIllllllIIIIlIlIlI(n, n2, n3 - 1);
        boolean bl6 = !this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIlIIIllllllIIIIlIlIlI(n, n2, n3 + 1);
        int n4 = 3;
        double d7 = 9999.0;
        if (bl && d4 < d7) {
            d7 = d4;
            n4 = 0;
        }
        if (bl2 && 1.0 - d4 < d7) {
            d7 = 1.0 - d4;
            n4 = 1;
        }
        if (bl4 && 1.0 - d5 < d7) {
            d7 = 1.0 - d5;
            n4 = 3;
        }
        if (bl5 && d6 < d7) {
            d7 = d6;
            n4 = 4;
        }
        if (bl6 && 1.0 - d6 < d7) {
            d7 = 1.0 - d6;
            n4 = 5;
        }
        float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f + 0.1f;
        if (n4 == 0) {
            this.IIIIIIIIlIllIIllIIlllIllI = -f;
        }
        if (n4 == 1) {
            this.IIIIIIIIlIllIIllIIlllIllI = f;
        }
        if (n4 == 2) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = -f;
        }
        if (n4 == 3) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = f;
        }
        if (n4 == 4) {
            this.llIIIlllIlllIlIllIIIIllIl = -f;
        }
        if (n4 == 5) {
            this.llIIIlllIlllIlIllIIIIllIl = f;
        }
        return true;
    }

    public void IlIIIlIIlllllIIIllIlIlIll() {
        this.llIIlIIllIIllIlIIllIIllII = true;
        this.lIIIllIIIIIllllIlIlIllIll = 0.0f;
    }

    public String llllIIIIlIIIlIIIIIIlIllll() {
        String string = class_0054.lllIlIIlIIIlIlIIIllIlllIl(this);
        if (string == null) {
            string = "generic";
        }
        return class_1586.lllIIIllIIIIlllIlIIllIIll("entity." + string + ".name");
    }

    public class_1521[] lIIllllllllIlIllllllllIlI() {
        return null;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl(class_1521 class_15212) {
        return this == class_15212;
    }

    public float lIIIIllIIllIIIlIIIllIllII() {
        return 0.0f;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(float f) {
    }

    public boolean m_() {
        return true;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl(class_1521 class_15212) {
        return false;
    }

    public String toString() {
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.llllIIIIlIIIlIIIIIIlIllll(), this.lllIlIIlIIIlIlIIIllIlllIl, this.lIlIllIIlIIlIIlIIlIIlIIll == null ? "~NULL~" : this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIlIIIIlllIlIlIIl().lIIIIlIlIIlllllIIllIIlIII(), this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
    }

    public boolean lIIllIIlIIIlllIlllIIlIIlI() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public void IllIIIllIIIIlIlIlIllIIlll(class_1521 class_15212) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI, class_15212.IllIIIIllIIllIllIlllIlIIl, class_15212.IIIIlIllIlIIlIIlIllIlIlll, class_15212.IlIlIIlllIllllllllIIIlIlI);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, boolean bl) {
        class_0775 class_07752 = new class_0775();
        class_15212.IlIIIIIllllllIIlllIllllll(class_07752);
        this.lIllllIIlIIIlIllllllIIIll(class_07752);
        this.lIIIlIIllIllIIlIIlIIIllII = class_15212.lIIIlIIllIllIIlIIlIIIllII;
        this.lIIIIllIIllIIIlIIIllIllII = class_15212.lIIIIllIIllIIIlIIIllIllII;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(int n) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IllllIIIIlIIlIIIIlllIIIIl) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("changeDimension");
            class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
            int n2 = this.lIIllllllllIlIllllllllIlI;
            class_0976 class_09762 = class_02202.lllIIIllIIIIlllIlIIllIIll(n2);
            class_0976 class_09763 = class_02202.lllIIIllIIIIlllIlIIllIIll(n);
            this.lIIllllllllIlIllllllllIlI = n;
            if (n2 == 1 && n == 1) {
                class_09763 = class_02202.lllIIIllIIIIlllIlIIllIIll(0);
                this.lIIllllllllIlIllllllllIlI = 0;
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this);
            this.IllllIIIIlIIlIIIIlllIIIIl = false;
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("reposition");
            class_02202.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this, n2, class_09762, class_09763);
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endStartSection("reloading");
            class_1521 class_15212 = class_0054.lllIIIllIIIIlllIlIIllIIll(class_0054.lllIlIIlIIIlIlIIIllIlllIl(this), (class_1334)class_09763);
            if (class_15212 != null) {
                class_15212.lllIIIllIIIIlllIlIIllIIll(this, true);
                if (n2 == 1 && n == 1) {
                    class_2208 class_22082 = class_09763.lIlIllIIlIIlIIlIIlIIlIIll();
                    class_22082.lllIlIIlIIIlIlIIIllIlllIl = this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIllIIlIlIlIlIllllIIl(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.IlIllllllIIlIIllllIIlIIIl);
                    class_15212.lllIlIIlIIIlIlIIIllIlllIl(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl, class_15212.IIIIlIllIlIIlIIlIllIlIlll, class_15212.IlIlIIlllIllllllllIIIlIlI);
                }
                class_09763.lllIIIllIIIIlllIlIIllIIll(class_15212);
            }
            this.IllllIIIIlIIlIIIIlllIIIIl = true;
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
            class_09762.llllllIlIllllIlIlIlIIIIlI();
            class_09763.llllllIlIllllIlIlIlIIIIlI();
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        }
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_1013 class_10132, class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        return class_05492.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1013 class_10132, class_1334 class_13342, int n, int n2, int n3, Block class_05492, float f) {
        return true;
    }

    public int IllIIllIlIlllIllIllIlIIIl() {
        return 3;
    }

    public int IIIlIllllIIIlllllIllIlIII() {
        return this.lIIIIllIIllIIIlIIIllIllII;
    }

    public boolean IIIIIllIlIllIlIlIIlIllIIl() {
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0799 class_07992) {
        class_07992.addCrashSectionCallable("Entity Type", new class_0952(this));
        class_07992.lllIIIllIIIIlllIlIIllIIll("Entity ID", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07992.addCrashSectionCallable("Entity Name", new class_0577(this));
        class_07992.lllIIIllIIIIlllIlIIllIIll("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl));
        class_07992.lllIIIllIIIIlllIlIIllIIll("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl));
    }

    public boolean lIIllIlIIlIIlllllIlIIllIl() {
        return this.llIIIIIlIIlIIIIllIIIlIIII();
    }

    public UUID lIIlllIIlIlIlIIIlIlllIIll() {
        return this.lIIllIIlIIIlllIlllIIlIIlI;
    }

    public boolean IlIIlIIlllllIlIIlIlIlIlIl() {
        return true;
    }

    public IChatComponent llIIIIllIIIIIIIlIIIlIIIIl() {
        return new class_0722(this.llllIIIIlIIIlIIIIIIlIllll());
    }

    public void IllIIIllIIIIlIlIlIllIIlll(int n) {
    }
}

