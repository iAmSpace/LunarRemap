package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.UUID;

public abstract class class_1252
extends class_0339 {
    public static final UUID lllIIIllIIIIlllIlIIllIIll = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
    public static final class_1256 lllIlIIlIIIlIlIIIllIlllIl = new class_1256(lllIIIllIIIIlllIlIIllIIll, "Fleeing speed bonus", 2.0, 2).lllIIIllIIIIlllIlIIllIIll(false);
    private class_2086 lIIIlIllllIlllIIIIIllIIIl;
    protected class_1521 IlIllllllIIlIIllllIIlIIIl;
    protected boolean lIlllIlllIIIIlIIlllIllIII;
    protected int IlIIIIIllllllIIlllIllllll;
    private class_2208 lllIIIlllIlllIIlIllllIIlI = new class_2208(0, 0, 0);
    private float lIIlIlllIIlllIIlllIIlIlII = -1.0f;
    private class_1327 lIIlIIIlIlIIlllIlIllIllIl = new class_0649(this, 1.0);
    private boolean lIIlIlIIIIIllIIIIllIlIlII;

    public class_1252(class_1334 class_13342) {
        super(class_13342);
    }

    protected boolean IlIIIIIllllllIIlllIllllll() {
        return false;
    }

    @Override
    protected void llIIlIlIlllIIllIlIlllIllI() {
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("ai");
        if (this.IlIIIIIllllllIIlllIllllll > 0 && --this.IlIIIIIllllllIIlllIllllll == 0) {
            class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII);
            class_16852.lllIlIIlIIIlIlIIIllIlllIl(lllIlIIlIIIlIlIIIllIlllIl);
        }
        this.lIlllIlllIIIIlIIlllIllIII = this.IlIIIIIllllllIIlllIllllll();
        float f = 16.0f;
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.IlIllllllIIlIIllllIIlIIIl = this.IllIIlllllllIIlIIlIIIIlIl();
            if (this.IlIllllllIIlIIllllIIlIIIl != null) {
                this.lIIIlIllllIlllIIIIIllIIIl = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IlIllllllIIlIIllllIIlIIIl, f, true, false, false, true);
            }
        } else if (this.IlIllllllIIlIIllllIIlIIIl.IlllIIlllllllIIllIlIllllI()) {
            float f2 = this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(this);
            if (this.IlIlllIIIIIIlIIllIIllIlll(this.IlIllllllIIlIIllllIIlIIIl)) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, f2);
            }
        } else {
            this.IlIllllllIIlIIllllIIlIIIl = null;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl instanceof class_1822 && ((class_1822)this.IlIllllllIIlIIllllIIlIIIl).IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.IlIllllllIIlIIllllIIlIIIl = null;
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        if (!(this.lIlllIlllIIIIlIIlllIllIII || this.IlIllllllIIlIIllllIIlIIIl == null || this.lIIIlIllllIlllIIIIIllIIIl != null && this.IlllIIlllllllIIllIlIllllI.nextInt(20) != 0)) {
            this.lIIIlIllllIlllIIIIIllIIIl = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IlIllllllIIlIIllllIIlIIIl, f, true, false, false, true);
        } else if (!this.lIlllIlllIIIIlIIlllIllIII && (this.lIIIlIllllIlllIIIIIllIIIl == null && this.IlllIIlllllllIIllIlIllllI.nextInt(180) == 0 || this.IlllIIlllllllIIllIlIllllI.nextInt(120) == 0 || this.IlIIIIIllllllIIlllIllllll > 0) && this.lIIlIlllIIlIIIIlIlIIIIlll < 100) {
            this.lIllllIIlIIIlIllllllIIIll();
        }
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5);
        boolean bl = this.llIlllIlIIllIlIIIIllIIlIl();
        boolean bl2 = this.lIIlIlllIllIlIlllIIIIIIII();
        this.IlIlIIlllIllllllllIIIlIlI = 0.0f;
        if (this.lIIIlIllllIlllIIIIIllIIIl != null && this.IlllIIlllllllIIllIlIllllI.nextInt(100) != 0) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("followpath");
            class_0864 class_08642 = this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
            double d = this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f;
            while (class_08642 != null && class_08642.lIlllIlllIIIIlIIlllIllIII(this.IlIIlllllIIlIlIlllllIllll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, this.IllIIIIllIIllIllIlllIlIIl) < d * d) {
                this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll();
                if (this.lIIIlIllllIlllIIIIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl()) {
                    class_08642 = null;
                    this.lIIIlIllllIlllIIIIIllIIIl = null;
                    continue;
                }
                class_08642 = this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
            }
            this.llIllIlllIllIlIIIIlIIlIII = false;
            if (class_08642 != null) {
                double d2 = class_08642.lllIIIllIIIIlllIlIIllIIll - this.IlIIlllllIIlIlIlllllIllll;
                double d3 = class_08642.IlIllllllIIlIIllllIIlIIIl - this.IllIIIIllIIllIllIlllIlIIl;
                double d4 = class_08642.lllIlIIlIIIlIlIIIllIlllIl - (double)n;
                float f3 = (float)(Math.atan2(d3, d2) * 180.0 / Math.PI) - 90.0f;
                float f4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(f3 - this.IIIIlIllIlIIlIIlIllIlIlll);
                this.llIlIIIlllIIIllIllllIIIll = (float)this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).IlIIIIIllllllIIlllIllllll();
                if (f4 > 30.0f) {
                    f4 = 30.0f;
                }
                if (f4 < -30.0f) {
                    f4 = -30.0f;
                }
                this.IIIIlIllIlIIlIIlIllIlIlll += f4;
                if (this.lIlllIlllIIIIlIIlllIllIII && this.IlIllllllIIlIIllllIIlIIIl != null) {
                    double d5 = this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
                    double d6 = this.IlIllllllIIlIIllllIIlIIIl.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
                    float f5 = this.IIIIlIllIlIIlIIlIllIlIlll;
                    this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d6, d5) * 180.0 / Math.PI) - 90.0f;
                    f4 = (f5 - this.IIIIlIllIlIIlIIlIllIlIlll + 90.0f) * (float)Math.PI / 180.0f;
                    this.IlllIIIlIIlIIIIllllIllllI = -MathHelper.lllIIIllIIIIlllIlIIllIIll(f4) * this.llIlIIIlllIIIllIllllIIIll * 1.0f;
                    this.llIlIIIlllIIIllIllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f4) * this.llIlIIIlllIIIllIllllIIIll * 1.0f;
                }
                if (d4 > 0.0) {
                    this.llIllIlllIllIlIIIIlIIlIII = true;
                }
            }
            if (this.IlIllllllIIlIIllllIIlIIIl != null) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 30.0f, 30.0f);
            }
            if (this.lIlIIllllIlIIIIllIIIIlIIl && !this.IlIlllIIIIIIlIIllIIllIlll()) {
                this.llIllIlllIllIlIIIIlIIlIII = true;
            }
            if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.8f && (bl || bl2)) {
                this.llIllIlllIllIlIIIIlIIlIII = true;
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        } else {
            super.llIIlIlIlllIIllIlIlllIllI();
            this.lIIIlIllllIlllIIIIIllIIIl = null;
        }
    }

    protected void lIllllIIlIIIlIllllllIIIll() {
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("stroll");
        boolean bl = false;
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        float f = -99999.0f;
        for (int i = 0; i < 10; ++i) {
            int n4;
            int n5;
            int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + (double)this.IlllIIlllllllIIllIlIllllI.nextInt(13) - 6.0);
            float f2 = this.lllIIIllIIIIlllIlIIllIIll(n6, n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + (double)this.IlllIIlllllllIIllIlIllllI.nextInt(7) - 3.0), n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl + (double)this.IlllIIlllllllIIllIlIllllI.nextInt(13) - 6.0));
            if (!(f2 > f)) continue;
            f = f2;
            n = n6;
            n2 = n5;
            n3 = n4;
            bl = true;
        }
        if (bl) {
            this.lIIIlIllllIlllIIIIIllIIIl = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, n, n2, n3, 10.0f, true, false, false, true);
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
    }

    public float lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return 0.0f;
    }

    protected class_1521 IllIIlllllllIIlIIlIIIIlIl() {
        return null;
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
        return super.lllIIlIIIllllllIIIIlIlIlI() && this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3) >= 0.0f;
    }

    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return this.lIIIlIllllIlllIIIIIllIIIl != null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2086 class_20862) {
        this.lIIIlIllllIlllIIIIIllIIIl = class_20862;
    }

    public class_1521 IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        this.IlIllllllIIlIIllllIIlIIIl = class_15212;
    }

    public boolean lllllIlllIIllIlIIlIIIllII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        return this.lIIlIlllIIlllIIlllIIlIlII == -1.0f ? true : this.lllIIIlllIlllIIlIllllIIlI.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3) < this.lIIlIlllIIlllIIlllIIlIlII * this.lIIlIlllIIlllIIlllIIlIlII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        this.lllIIIlllIlllIIlIllllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.lIIlIlllIIlllIIlllIIlIlII = n4;
    }

    public class_2208 IlIlIIlllIIlIllIIIlllllIl() {
        return this.lllIIIlllIlllIIlIllllIIlI;
    }

    public float lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.lIIlIlllIIlllIIlllIIlIlII;
    }

    public void IlIIIlIIIIllIIIllIIIIIIll() {
        this.lIIlIlllIIlllIIlllIIlIlII = -1.0f;
    }

    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.lIIlIlllIIlllIIlllIIlIlII != -1.0f;
    }

    @Override
    protected void lIlIllIIlIIlIIlIIlIIlIIll() {
        super.lIlIllIIlIIlIIlIIlIIlIIll();
        if (this.lIIIIIlIllIllIlIlIIllllll() && this.lIIIlllIlIIIlIllIIIlIllll() != null && this.lIIIlllIlIIIlIllIIIlIllll().lIlIllIIlIIlIIlIIlIIlIIll == this.lIlIllIIlIIlIIlIIlIIlIIll) {
            class_1521 class_15212 = this.lIIIlllIlIIIlIllIIIlIllll();
            this.lllIIIllIIIIlllIlIIllIIll((int)class_15212.IlIIlllllIIlIlIlllllIllll, (int)class_15212.llIIlIlIlllIIllIlIlllIllI, (int)class_15212.IllIIIIllIIllIllIlllIlIIl, 5);
            float f = this.lIlllIlllIIIIlIIlllIllIII(class_15212);
            if (this instanceof class_2094 && ((class_2094)this).IlIllIIIIllllIIllIllIIIIl()) {
                if (f > 10.0f) {
                    this.lllIIIllIIIIlllIlIIllIIll(true, true);
                }
                return;
            }
            if (!this.lIIlIlIIIIIllIIIIllIlIlII) {
                this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, this.lIIlIIIlIlIIlllIlIllIllIl);
                this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(false);
                this.lIIlIlIIIIIllIIIIllIlIlII = true;
            }
            this.IlIIIIIllllllIIlllIllllll(f);
            if (f > 4.0f) {
                this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(class_15212, 1.0);
            }
            if (f > 6.0f) {
                double d = (class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll) / (double)f;
                double d2 = (class_15212.llIIlIlIlllIIllIlIlllIllI - this.llIIlIlIlllIIllIlIlllIllI) / (double)f;
                double d3 = (class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl) / (double)f;
                this.IIIIIIIIlIllIIllIIlllIllI += d * Math.abs(d) * 0.4;
                this.IIlIIlIlIlIllIIlIlIIIIlll += d2 * Math.abs(d2) * 0.4;
                this.llIIIlllIlllIlIllIIIIllIl += d3 * Math.abs(d3) * 0.4;
            }
            if (f > 10.0f) {
                this.lllIIIllIIIIlllIlIIllIIll(true, true);
            }
        } else if (!this.lIIIIIlIllIllIlIlIIllllll() && this.lIIlIlIIIIIllIIIIllIlIlII) {
            this.lIIlIlIIIIIllIIIIllIlIlII = false;
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIlIlIIlllIlIllIllIl);
            this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
            this.IlIIIlIIIIllIIIllIIIIIIll();
        }
    }

    protected void IlIIIIIllllllIIlllIllllll(float f) {
    }
}

