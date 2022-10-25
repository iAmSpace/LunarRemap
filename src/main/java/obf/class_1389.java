package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.*;
import net.minecraft.util.MathHelper;
import net.minecraft.stats.StatBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_1389
extends class_0139 {
    public final class_1764 lllIlIIlIIIlIlIIIllIlllIl;
    private final class_1707 lIllIIlllIIIlIlIIIlllIlIl;
    private double IIlIlIlIIlllIIIlIIIIlIIIl;
    private double lllIIIIlIIllIIIlIllIlllII;
    private double IlIllIIIIllllIIllIllIIIIl;
    private double lIlIlIIllIlIIIIIlIIlllIlI;
    private float llllIllllllIllIIIlIlIIllI;
    private float IIlIlIIIlIIllIlIlIlIlIIll;
    private boolean IIIIlllllIlllIIllIIIlIllI;
    private boolean IlIlIIlllIIlIlllllIlIIIIl;
    private boolean IIllllllIIllIlIllllIIIlll;
    private int llllIIIllIllIIIllIlIIIIIl;
    private boolean lIlIllIIIlIlIlIlIIIllllll;
    private String IllIIIIIllIIlllIlIIIlIlll;
    List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private boolean IllIlIIllIIllIlIIlIllIlIl;

    public class_1389(Minecraft class_06672, class_1334 class_13342, class_1220 class_12202, class_1764 class_17642, class_1707 class_17072) {
        super(class_06672, class_13342, class_12202, 0);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_17642;
        this.lIllIIlllIIIlIlIIIlllIlIl = class_17072;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        if (class_1664.llIIlIllIllllIlIIIIlIIlll()) {
            double d = this.IlIIlllllIIlIlIlllllIllll;
            double d2 = this.llIIlIlIlllIIllIlIlllIllI;
            double d3 = this.IllIIIIllIIllIllIlllIlIIl;
            if (this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl && this.IlIIIlIIIIllIIIllIIIIIIll == null) {
                super.lllIIIllIIIIlllIlIIllIIll(f, f2);
            } else {
                this.lIlllIlllIIIIlIIlllIllIII(f, f2);
            }
            this.lIIIIlIlIIlllllIIllIIlIII(this.IlIIlllllIIlIlIlllllIllll - d, this.llIIlIlIlllIIllIlIlllIllI - d2, this.IllIIIIllIIllIllIlllIlIIl - d3);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(f, f2);
        }
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        this.llIllIlllIllIlIIIIlIIlIII = false;
        if (!this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) {
            this.IlIllllllIIlIIllllIIlIIIl.clear();
        }
    }

    @Override
    public void d_() {
        if (class_1664.llIIlIllIllllIlIIIIlIIlll()) {
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
        super.d_();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        if (class_1664.llIIlIllIllllIlIIIIlIIlll()) {
            if (this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl && this.IlIIIlIIIIllIIIllIIIIIIll == null || this.llIlllIlIIllIlIIIIllIIlIl()) {
                super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3);
                return;
            }
            float[] arrf = this.a_(f, f2);
            float[] arrf2 = new float[]{arrf[0] * (f3 *= 2.15f), arrf[1] * f3};
            this.IlIllllllIIlIIllllIIlIIIl.add(arrf2);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3);
        }
    }

    @Override
    public void f_() {
        if (class_1664.llIIlIllIllllIlIIIIlIIlll()) {
            if (this.IlIIIIIllIlllIIIIlIIIllIl()) {
                float f = this.IIIIlIllIlIIlIIlIllIlIlll * ((float)Math.PI / 180);
                this.IIIIIIIIlIllIIllIIlllIllI += (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * 0.2f);
                this.llIIIlllIlllIlIllIIIIllIl -= (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * 0.2f);
            }
            this.IIllllllIIllIlIllllIIIlll();
            this.IllIlIIllIIllIlIIlIllIlIl = true;
        }
        super.f_();
    }

    public double i_() {
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
    }

    public float j_() {
        float f = 1.0f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) - 1, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
            f = 1.0f - class_05492.llllIIIIlIIIlIIIIIIlIllll;
        }
        return f;
    }

    public float k_() {
        float f = 0.91f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            f = 0.54600006f;
            Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) - 1, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
            if (class_05492 != null) {
                f = class_05492.llllIIIIlIIIlIIIIIIlIllll * 0.91f;
            }
        }
        return f;
    }

    public float IlIlllIIIIIIlIIllIIllIlll() {
        float f = this.k_();
        float f2 = 0.16277136f / (f * f * f);
        return this.lIllIIlIlllIllIlIlIlIllII() * f2;
    }

    public float[] a_(float f, float f2) {
        float f3 = f * f + f2 * f2;
        float[] arrf = new float[]{0.0f, 0.0f};
        if (f3 >= 1.0E-4f) {
            if ((f3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f3)) < 1.0f) {
                f3 = 1.0f;
            }
            f3 = 1.0f / f3;
            float f4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
            float f5 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
            arrf[0] = (f *= f3) * f5 - (f2 *= f3) * f4;
            arrf[1] = f2 * f5 + f * f4;
        }
        return arrf;
    }

    public float IlIlIIlIlIllIIlIlIIllIIIl() {
        float f = this.lIllIIlIlllIllIlIlIlIllII();
        return !this.IIlIIlIlIlIllIIlIlIIIIlll() ? f * 2.15f : f * 1.11f;
    }

    public float lllllIlllIIllIlIIlIIIllII() {
        float f = this.lIllIIlIlllIllIlIlIlIllII();
        return f * 2.15f;
    }

    private void IIlllIlIlllIllIIIlllIIlIl(int n) {
        int n2;
        int n3;
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n4, n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)0.2f - (double)this.llllIlIIIIIIIIIlllIIlIIIl), n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
        if (class_05492 != null && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            for (int i = 0; i < n; ++i) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("blockcrack_" + Block.lllIIIllIIIIlllIlIIllIIll(class_05492) + "_" + this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n4, n3, n2), this.IlIIlllllIIlIlIlllllIllll + ((double)new Random().nextFloat() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.1, this.IllIIIIllIIllIllIlllIlIIl + ((double)new Random().nextFloat() - 0.5) * (double)this.IIIIlIlIIlIIIIlIlllIlIIII, -this.IIIIIIIIlIllIIllIIlllIllI * 4.0, 1.5, -this.llIIIlllIlllIlIllIIIIllIl * 4.0);
            }
        }
    }

    private void llllIllllllIllIIIlIlIIllI() {
        this.IIlIIlIlIlIllIIlIlIIIIlll = !(!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl || this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll((int)this.IlIIlllllIIlIlIlllllIllll, 0, (int)this.IllIIIIllIIllIllIlllIlIIl) && this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII((int)((int)this.IlIIlllllIIlIlIlllllIllll), (int)((int)this.IllIIIIllIIllIllIlllIlIIl)).lIlllIlllIIIIlIIlllIllIII) ? (this.llIIlIlIlllIIllIlIlllIllI > 0.0 ? -0.1 : 0.0) : (this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.08);
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
    }

    private void IllIIlllllllIIlIIlIIIIlIl(float f) {
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)f;
    }

    private void IIlIlIIIlIIllIlIlIlIlIIll() {
        if (this.h_()) {
            boolean bl;
            float f = 0.15f;
            if (this.IIIIIIIIlIllIIllIIlllIllI < (double)(-f)) {
                this.IIIIIIIIlIllIIllIIlllIllI = -f;
            }
            if (this.IIIIIIIIlIllIIllIIlllIllI > (double)f) {
                this.IIIIIIIIlIllIIllIIlllIllI = f;
            }
            if (this.llIIIlllIlllIlIllIIIIllIl < (double)(-f)) {
                this.llIIIlllIlllIlIllIIIIllIl = -f;
            }
            if (this.llIIIlllIlllIlIllIIIIllIl > (double)f) {
                this.llIIIlllIlllIlIllIIIIllIl = f;
            }
            this.lIIIllIIIIIllllIlIlIllIll = 0.0f;
            if (this.IIlIIlIlIlIllIIlIlIIIIlll < -0.15) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = -0.15;
            }
            if ((bl = this.IIlIIlIlIlIllIIlIlIIIIlll()) && this.IIlIIlIlIlIllIIlIlIIIIlll < 0.0) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
            }
        }
    }

    private void IIIIlllllIlllIIllIIIlIllI() {
        if (this.lIlIIllllIlIIIIllIIIIlIIl && this.h_()) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.2;
        }
    }

    private void IlIlIIlllIIlIlllllIlIIIIl() {
        this.IIIIlllIIlIllllllIllIIlll = this.IIIIIIlIIIIIIIIIIlIlIlIlI;
        double d = this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll;
        double d2 = this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl;
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2) * 4.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.IIIIIIlIIIIIIIIIIlIlIlIlI += (f - this.IIIIIIlIIIIIIIIIIlIlIlIlI) * 0.4f;
        this.IllIlllIIIlllllIllIIlIlIl += this.IIIIIIlIIIIIIIIIIlIlIlIlI;
    }

    private void IllIIlllllllIIlIIlIIIIlIl(float f, float f2) {
        double d = this.llIIlIlIlllIIllIlIlllIllI;
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, 0.04f);
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.8f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.8f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.8f;
        this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.02;
        if (this.lIlIIllllIlIIIIllIIIIlIIl && this.lIlllIlllIIIIlIIlllIllIII(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll + (double)0.6f - this.llIIlIlIlllIIllIlIlllIllI + d, this.llIIIlllIlllIlIllIIIIllIl)) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.3f;
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f, float f2) {
        if (this.llIlllIlIIllIlIIIIllIIlIl() && !this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl || this.lIIlIlllIllIlIlllIIIIIIII() && !this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
            super.lllIIIllIIIIlllIlIIllIIll(f, f2);
        } else {
            float f3 = this.k_();
            this.lllIIIllIIIIlllIlIIllIIll(f, f2, this.IlIlllIIIIIIlIIllIIllIlll());
            this.IIlIlIIIlIIllIlIlIlIlIIll();
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIlllllIlllIIllIIIlIllI();
            this.llllIllllllIllIIIlIlIIllI();
            this.IllIIlllllllIIlIIlIIIIlIl(f3);
            this.IlIlIIlllIIlIlllllIlIIIIl();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lIlllIlllIIIIlIIlllIllIII(float f, float f2) {
        if (this.lIIlIlllIllIlIlllIIIIIIII() && !this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
            super.lllIIIllIIIIlllIlIIllIIll(f, f2);
            return;
        }
        if (this.llIlllIlIIllIlIIIIllIIlIl() && !this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
            if (!((Boolean)class_1664.lIllllIIlIIIlIllllllIIIll.getValue()).booleanValue()) {
                super.lllIIIllIIIIlllIlIIllIIll(f, f2);
                return;
            }
            this.IIIllIllIIlIlIlIlIllllIIl(f, f2);
        } else {
            float f3 = f != 0.0f || f2 != 0.0f ? this.IlIlIIlIlIllIIlIlIIllIIIl() : 0.0f;
            float[] arrf = this.a_(f, f2);
            boolean bl = this.llllllIlIllllIlIlIlIIIIlI && !this.llIllIlllIllIlIIIIlIIlIII;
            float f4 = this.k_();
            if (bl) {
                this.IllIIlllllllIIlIIlIIIIlIl(f4);
                double d = (Double)class_1664.IIIllIllIIlIlIlIlIllllIIl.getValue();
                if (f3 != 0.0f) {
                    this.lllIIIllIIIIlllIlIIllIIll(f3, (double)arrf[0], (double)arrf[1], d *= (double)(this.IlIlllIIIIIIlIIllIIllIlll() * 2.15f / f3));
                }
                if (!this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) {
                    float f5 = f3 / this.lllllIlllIIllIlIIlIIIllII();
                    for (float[] arrf2 : this.IlIllllllIIlIIllllIIlIIIl) {
                        this.IIIIIIIIlIllIIllIIlllIllI += (double)(arrf2[0] * f5);
                        this.llIIIlllIlllIlIllIIIIllIl += (double)(arrf2[1] * f5);
                    }
                }
            } else {
                class_1974 class_19742;
                boolean bl2;
                double d = (Double)class_1664.IllIIIllIIIIlIlIlIllIIlll.getValue();
                this.lllIlIIlIIIlIlIIIllIlllIl(f3, arrf[0], arrf[1], d);
                if (((Boolean)class_1664.lIllllIIlIIIlIllllllIIIll.getValue()).booleanValue() && (Double)class_1664.IIIllIIlIIIIIIlIlIIllIIlI.getValue() > 0.0 && this.llIllIlllIllIlIIIIlIIlIII && this.IIlIIlIlIlIllIIlIlIIIIlll < 0.0 && (bl2 = this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(class_19742 = this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl)))) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll *= ((Double)class_1664.IIIllIIlIIIIIIlIlIIllIIlI.getValue()).doubleValue();
                }
            }
            this.IIlIlIIIlIIllIlIlIlIlIIll();
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIlllllIlllIIllIIIlIllI();
            this.llllIllllllIllIIIlIlIIllI();
        }
        this.IlIlIIlllIIlIlllllIlIIIIl();
    }

    private void IIllllllIIllIlIllllIIIlll() {
        this.IlIlIIlIlIllIIlIlIIllIIIl(this.lllllIlllIIllIlIIlIIIllII());
        boolean bl = this.llllIIIllIllIIIllIlIIIIIl();
        if (!bl) {
            this.lllllIlllIIllIlIIlIIIllII(this.lllllIlllIIllIlIIlIIIllII());
        }
    }

    private boolean llllIIIllIllIIIllIlIIIIIl() {
        float f;
        double d;
        if (((Boolean)class_1664.lllIIIllIIIIlllIlIIllIIll.getValue()).booleanValue() && this.IIlIIlIlIlIllIIlIlIIIIlll() && (d = this.i_()) > (double)(f = this.lllllIlllIIllIlIIlIIIllII())) {
            double d2 = d / (double)f * 0.5;
            if (d2 > 1.0) {
                d2 = 1.0;
            }
            this.IIlIIlIlIlIllIIlIlIIIIlll += d2 * d * (double)((Float)class_1664.lllIlIIlIIIlIlIIIllIlllIl.getValue()).floatValue();
            if (((Float)class_1664.lllIlIIlIIIlIlIIIllIlllIl.getValue()).floatValue() > 0.0f) {
                float f2 = 1.0f / ((Float)class_1664.lllIlIIlIIIlIlIIIllIlllIl.getValue()).floatValue();
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)f2;
                this.llIIIlllIlllIlIllIIIIllIl *= (double)f2;
            }
            this.IIlllIlIlllIllIIIlllIIlIl(30);
            return true;
        }
        return false;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(double d) {
        this.IIIIIIIIlIllIIllIIlllIllI *= d;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= d;
        this.llIIIlllIlllIlIllIIIIllIl *= d;
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, float f2, double d, double d2, double d3) {
        float f3 = f - f2;
        if (f3 > 0.0f) {
            float f4 = (float)(d3 * (double)f * (double)0.05f);
            if (f4 > f3) {
                f4 = f3;
            }
            this.IIIIIIIIlIllIIllIIlllIllI += (double)f4 * d;
            this.llIIIlllIlllIlIllIIIIllIl += (double)f4 * d2;
        }
    }

    private void IIIllIllIIlIlIlIlIllllIIl(float f, float f2) {
        double d = this.llIIlIlIlllIIllIlIlllIllI;
        float f3 = f != 0.0f || f2 != 0.0f ? this.lllllIlllIIllIlIIlIIIllII() : 0.0f;
        float[] arrf = this.a_(f, f2);
        boolean bl = this.llIllIlllIllIlIIIIlIIlIII && this.lIlllIlllIIIIlIIlllIllIII(0.0, 1.0, 0.0);
        double d2 = this.i_();
        if (!bl || d2 < (double)0.078f) {
            this.IllIIlllllllIIlIIlIIIIlIl(f, f2);
        } else {
            if (d2 > 0.09) {
                this.lllIlIIlIIIlIlIIIllIlllIl((Double)class_1664.IllIIlllllllIIlIIlIIIIlIl.getValue());
            }
            if (d2 > 0.098) {
                this.lllIlIIlIIIlIlIIIllIlllIl(f3, arrf[0], arrf[1], (Double)class_1664.IIIllIllIIlIlIlIlIllllIIl.getValue());
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0.098f, (double)arrf[0], (double)arrf[1], (double)((Double)class_1664.IIIllIllIIlIlIlIlIllllIIl.getValue()));
            }
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        }
        if (this.lIlIIllllIlIIIIllIIIIlIIl && this.lIlllIlllIIIIlIIlllIllIII(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll + (double)0.6f - this.llIIlIlIlllIIllIlIlllIllI + d, this.llIIIlllIlllIlIllIIIIllIl)) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.3f;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) {
            float f4 = f3 / this.lllllIlllIIllIlIIlIIIllII();
            for (float[] arrf2 : this.IlIllllllIIlIIllllIIlIIIl) {
                this.IIIIIIIIlIllIIllIIlllIllI += (double)(arrf2[0] * f4);
                this.llIIIlllIlllIlIllIIIIllIl += (double)(arrf2[1] * f4);
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, double d, double d2, double d3) {
        double d4 = this.IIIIIIIIlIllIIllIIlllIllI * d + this.llIIIlllIlllIlIllIIIIllIl * d2;
        double d5 = (double)f - d4;
        if (d5 <= 0.0) {
            return;
        }
        double d6 = d3 * (double)f / (double)this.k_() * (double)0.05f;
        if (d6 > d5) {
            d6 = d5;
        }
        this.IIIIIIIIlIllIIllIIlllIllI += d6 * d;
        this.llIIIlllIlllIlIllIIIIllIl += d6 * d2;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(float f, double d, double d2, double d3) {
        double d4;
        double d5;
        float f2 = f;
        float f3 = (float)((Double)class_1664.llIIllIllIlIIlIIllIllllll.getValue()).doubleValue();
        if (f2 > f3) {
            f2 = f3;
        }
        if ((d5 = (double)f2 - (d4 = this.IIIIIIIIlIllIIllIIlllIllI * d + this.llIIIlllIlllIlIllIIIIllIl * d2)) <= 0.0) {
            return;
        }
        double d6 = d3 * (double)f * (double)0.05f;
        if (d6 > d5) {
            d6 = d5;
        }
        this.IIIIIIIIlIllIIllIIlllIllI += d6 * d;
        this.llIIIlllIlllIlIllIIIIllIl += d6 * d2;
    }

    private void lIlIllIIIlIlIlIlIIIllllll() {
        float f;
        float f2;
        float f3;
        double d = this.i_();
        if (d <= 0.0) {
            return;
        }
        float f4 = 0.0f;
        float f5 = 0.005f;
        double d2 = d < (double)f5 ? (double)f5 : d;
        double d3 = d - (double)(f4 = (float)((double)f4 + d2 * (double)(f3 = (f2 = 1.0f) * (f = this.j_())) * (double)0.05f));
        if (d3 < 0.0) {
            d3 = 0.0;
        }
        if (d3 != d) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (d3 /= d);
            this.llIIIlllIlllIlIllIIIIllIl *= d3;
        }
    }

    private void IlIlIIlIlIllIIlIlIIllIIIl(float f) {
        float f2;
        float f3;
        float f4 = ((Float)class_1664.lIlllIlllIIIIlIIlllIllIII.getValue()).floatValue();
        float f5 = ((Float)class_1664.IlIIIIIllllllIIlllIllllll.getValue()).floatValue();
        if (((Boolean)class_1664.lIIIIlIlIIlllllIIllIIlIII.getValue()).booleanValue()) {
            f4 = 1.0f;
            f5 = 1.0f;
        }
        if ((f3 = (float)this.i_()) > (f2 = f * f4)) {
            if (f5 != 1.0f) {
                float f6 = (f3 - f2) * f5 + f2;
                float f7 = f6 / f3;
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)f7;
                this.llIIIlllIlllIlIllIIIIllIl *= (double)f7;
            }
            this.IIlllIlIlllIllIIIlllIIlIl(10);
        }
    }

    private void lllllIlllIIllIlIIlIIIllII(float f) {
        float f2;
        if (((Boolean)class_1664.lIIIIlIlIIlllllIIllIIlIII.getValue()).booleanValue()) {
            return;
        }
        float f3 = ((Float)class_1664.IlIllllllIIlIIllllIIlIIIl.getValue()).floatValue();
        float f4 = (float)this.i_();
        if (f4 > (f2 = f * f3) && f2 != 0.0f) {
            float f5 = f2 / f4;
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)f5;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)f5;
            this.IIlllIlIlllIllIIIlllIIlIl(30);
        }
    }

    private void IllIIIIIllIIlllIlIIIlIlll() {
        this.IllIlIIllIIllIlIIlIllIlIl = false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(float f) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        super.lllIIIllIIIIlllIlIIllIIll(class_15212);
        if (class_15212 instanceof class_1860) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(new class_1735(this, (class_1860)class_15212));
        }
    }

    @Override
    public void s_() {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), 0, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
            super.s_();
            if (this.lIlIlIIllIIIlllIllIIlIllI()) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C03PacketPlayer_C05PacketPlayerLook(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI, this.llllllIlIllllIlIlIlIIIIlI));
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0CPacketInput(this.IlllIIIlIIlIIIIllllIllllI, this.llIlIIIlllIIIllIllllIIIll, this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl, this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll));
            } else {
                this.IlIlIIlllIIlIllIIIlllllIl();
            }
        }
    }

    public void IlIlIIlllIIlIllIIIlllllIl() {
        boolean bl;
        boolean bl2;
        boolean bl3 = this.IlIIIIIllIlllIIIIlIIIllIl();
        if (bl3 != this.IIllllllIIllIlIllllIIIlll) {
            if (bl3) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0BPacketEntityAction(this, 4));
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0BPacketEntityAction(this, 5));
            }
            this.IIllllllIIllIlIllllIIIlll = bl3;
        }
        if ((bl2 = this.IIlIIlIlIlIllIIlIlIIIIlll()) != this.IlIlIIlllIIlIlllllIlIIIIl) {
            if (bl2) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0BPacketEntityAction(this, 1));
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0BPacketEntityAction(this, 2));
            }
            this.IlIlIIlllIIlIlllllIlIIIIl = bl2;
        }
        double d = this.IlIIlllllIIlIlIlllllIllll - this.IIlIlIlIIlllIIIlIIIIlIIIl;
        double d2 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl - this.lllIIIIlIIllIIIlIllIlllII;
        double d3 = this.IllIIIIllIIllIllIlllIlIIl - this.lIlIlIIllIlIIIIIlIIlllIlI;
        double d4 = this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIllllllIllIIIlIlIIllI;
        double d5 = this.IlIlIIlllIllllllllIIIlIlI - this.IIlIlIIIlIIllIlIlIlIlIIll;
        boolean bl4 = d * d + d2 * d2 + d3 * d3 > 9.0E-4 || this.llllIIIllIllIIIllIlIIIIIl >= 20;
        boolean bl5 = bl = d4 != 0.0 || d5 != 0.0;
        if (this.IlIIIlIIIIllIIIllIIIIIIll != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C03PacketPlayer_C06PacketPlayerPosLook(this.IIIIIIIIlIllIIllIIlllIllI, -999.0, -999.0, this.llIIIlllIlllIlIllIIIIllIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI, this.llllllIlIllllIlIlIlIIIIlI));
            bl4 = false;
        } else if (bl4 && bl) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C03PacketPlayer_C06PacketPlayerPosLook(this.IlIIlllllIIlIlIlllllIllll, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI, this.llllllIlIllllIlIlIlIIIIlI));
        } else if (bl4) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C03PacketPlayer_C04PacketPlayerPosition(this.IlIIlllllIIlIlIlllllIllll, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.llllllIlIllllIlIlIlIIIIlI));
        } else if (bl) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C03PacketPlayer_C05PacketPlayerLook(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI, this.llllllIlIllllIlIlIlIIIIlI));
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C03PacketPlayer(this.llllllIlIllllIlIlIlIIIIlI));
        }
        ++this.llllIIIllIllIIIllIlIIIIIl;
        this.IIIIlllllIlllIIllIIIlIllI = this.llllllIlIllllIlIlIlIIIIlI;
        if (bl4) {
            this.IIlIlIlIIlllIIIlIIIIlIIIl = this.IlIIlllllIIlIlIlllllIllll;
            this.lllIIIIlIIllIIIlIllIlllII = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl;
            this.IlIllIIIIllllIIllIllIIIIl = this.llIIlIlIlllIIllIlIlllIllI;
            this.lIlIlIIllIlIIIIIlIIlllIlI = this.IllIIIIllIIllIllIlllIlIIl;
            this.llllIIIllIllIIIllIlIIIIIl = 0;
        }
        if (bl) {
            this.llllIllllllIllIIIlIlIIllI = this.IIIIlIllIlIIlIIlIllIlIlll;
            this.IIlIlIIIlIIllIlIlIlIlIIll = this.IlIlIIlllIllllllllIIIlIlI;
        }
    }

    @Override
    public class_1781 lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        int n = bl ? 3 : 4;
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C07PacketPlayerDigging(n, 0, 0, 0, 0));
        return null;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1781 class_17812) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string.equals("/debug")) {
            LunarClient.getInstance().getSettingsManager().IllIIlllllllIIlIIlIIIIlIl = !LunarClient.getInstance().getSettingsManager().IllIIlllllllIIlIIlIIIIlIl;
            class_0722 class_07222 = new class_0722((Object)((Object) EnumChatFormatting.RED) + "   [LC] " + (Object)((Object) EnumChatFormatting.RESET));
            class_0722 class_07223 = new class_0722((Object)((Object) EnumChatFormatting.GRAY) + "Debug: " + LunarClient.getInstance().getSettingsManager().IllIIlllllllIIlIIlIIIIlIl);
            class_07223.lllIIIllIIIIlllIlIIllIIll(true);
            class_07222.lllIIIllIIIIlllIlIIllIIll(class_07223);
            class_07222.lllIIIllIIIIlllIlIIllIIll(true);
            Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07222);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C01PacketChatMessage(string));
        }
    }

    @Override
    public void lIIlIIIIIlIlllIlIIlIlIlll() {
        super.lIIlIIIIIlIlllIlIIlIlIlll();
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0APacketAnimation(this, 1));
    }

    @Override
    public void lIlIlIIlIIIIlIIIIIlllIIII() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C16PacketClientStatus(class_1297.lllIIIllIIIIlllIlIIllIIll));
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0058 class_00582, float f) {
        if (!this.lIIllIIlIIIlllIlllIIlIIlI()) {
            this.IllIIIllIIIIlIlIlIllIIlll(this.lllIIIlllIlllIIlIllllIIlI() - f);
        }
    }

    @Override
    public void IlIIIlIIIIllIIIllIIIIIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0DPacketCloseWindow(this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII));
        this.IIlllIlIlllIllIIIlllIIlIl();
    }

    public void IIlllIlIlllIllIIIlllIIlIl() {
        this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
        super.IlIIIlIIIIllIIIllIIIIIIll();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(float f) {
        if (this.lIlIllIIIlIlIlIlIIIllllll) {
            super.lIlllIlllIIIIlIIlllIllIII(f);
        } else {
            this.IllIIIllIIIIlIlIlIllIIlll(f);
            this.lIlIllIIIlIlIlIlIIIllllll = true;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(StatBase class_03192, int n) {
        if (class_03192 != null && class_03192.isIndependent) {
            super.lllIIIllIIIIlllIlIIllIIll(class_03192, n);
        }
    }

    @Override
    public void lIlIllIIlIIlIIlIIlIIlIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C13PacketPlayerAbilities(this.lIIlIlIlIlIllIIlIIllllIll));
    }

    @Override
    protected void l_() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0BPacketEntityAction(this, 6, (int)(this.IlIlIIlllIllllllllIIIlIlI() * 100.0f)));
    }

    public void llIllllIlIllIIIlIllIIlIlI() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0BPacketEntityAction(this, 7));
    }

    public void IlIllllllIIlIIllllIIlIIIl(String string) {
        this.IllIIIIIllIIlllIlIIIlIlll = string;
    }

    public String lIlllIlllIlIIIIlllIlIlIIl() {
        return this.IllIIIIIllIIlllIlIIIlIlll;
    }

    public class_1707 IlIIlllllIIlIlIlllllIllll() {
        return this.lIllIIlllIIIlIlIIIlllIlIl;
    }
}

