package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Calendar;

public class class_0453
extends class_0714 {
    private class_2208 lllIIIllIIIIlllIlIIllIIll;

    public class_0453(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.5f, 0.9f);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, new Byte(0));
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 0.1f;
    }

    @Override
    protected float IlIlIIllIlIlIIIIIlIlllllI() {
        return super.IlIlIIllIlIlIIIIIlIlllllI() * 0.95f;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return this.IlIIIIIllllllIIlllIllllll() && this.IlllIIlllllllIIllIlIllllI.nextInt(4) != 0 ? null : "mob.bat.idle";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.bat.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.bat.death";
    }

    @Override
    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return false;
    }

    @Override
    protected void lllIIlIIIllllllIIIIlIlIlI(class_1521 class_15212) {
    }

    @Override
    protected void lIlIIlIIlIIIIllIIlIllIlll() {
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(6.0);
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 1) != 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by | 1));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & 0xFFFFFFFE));
        }
    }

    @Override
    protected boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    public void s_() {
        super.s_();
        if (this.IlIIIIIllllllIIlllIllllll()) {
            this.llIIIlllIlllIlIllIIIIllIl = 0.0;
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
            this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
            this.llIIlIlIlllIIllIlIlllIllI = (double) MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI) + 1.0 - (double)this.lllIIIIlIlIIlIIlllIIIIIIl;
        } else {
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.6f;
        }
    }

    @Override
    protected void IllIIIIlIIlllllllllIlIlII() {
        super.IllIIIIlIIlllllllllIlIlII();
        if (this.IlIIIIIllllllIIlllIllllll()) {
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), (int)this.llIIlIlIlllIIllIlIlllIllI + 1, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(false);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1015, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
            } else {
                if (this.IlllIIlllllllIIllIlIllllI.nextInt(200) == 0) {
                    this.lIIllllIllIlllllIIllIllIl = this.IlllIIlllllllIIllIlIllllI.nextInt(360);
                }
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, 4.0) != null) {
                    this.lllIIIllIIIIlllIlIIllIIll(false);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1015, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
                }
            }
        } else {
            if (!(this.lllIIIllIIIIlllIlIIllIIll == null || this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl) && this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl >= 1)) {
                this.lllIIIllIIIIlllIlIIllIIll = null;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll == null || this.IlllIIlllllllIIllIlIllllI.nextInt(30) == 0 || this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl((int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl) < 4.0f) {
                this.lllIIIllIIIIlllIlIIllIIll = new class_2208((int)this.IlIIlllllIIlIlIlllllIllll + this.IlllIIlllllllIIllIlIllllI.nextInt(7) - this.IlllIIlllllllIIllIlIllllI.nextInt(7), (int)this.llIIlIlIlllIIllIlIlllIllI + this.IlllIIlllllllIIllIlIllllI.nextInt(6) - 2, (int)this.IllIIIIllIIllIllIlllIlIIl + this.IlllIIlllllllIIllIlIllllI.nextInt(7) - this.IlllIIlllllllIIllIlIllllI.nextInt(7));
            }
            double d = (double)this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll + 0.5 - this.IlIIlllllIIlIlIlllllIllll;
            double d2 = (double)this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl + 0.1 - this.llIIlIlIlllIIllIlIlllIllI;
            double d3 = (double)this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl + 0.5 - this.IllIIIIllIIllIllIlllIlIIl;
            this.IIIIIIIIlIllIIllIIlllIllI += (Math.signum(d) * 0.5 - this.IIIIIIIIlIllIIllIIlllIllI) * (double)0.1f;
            this.IIlIIlIlIlIllIIlIlIIIIlll += (Math.signum(d2) * (double)0.7f - this.IIlIIlIlIlIllIIlIlIIIIlll) * (double)0.1f;
            this.llIIIlllIlllIlIllIIIIllIl += (Math.signum(d3) * 0.5 - this.llIIIlllIlllIlIllIIIIllIl) * (double)0.1f;
            float f = (float)(Math.atan2(this.llIIIlllIlllIlIllIIIIllIl, this.IIIIIIIIlIllIIllIIlllIllI) * 180.0 / Math.PI) - 90.0f;
            float f2 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(f - this.IIIIlIllIlIIlIIlIllIlIlll);
            this.llIlIIIlllIIIllIllllIIIll = 0.5f;
            this.IIIIlIllIlIIlIIlIllIlIlll += f2;
            if (this.IlllIIlllllllIIllIlIllllI.nextInt(100) == 0 && this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), (int)this.llIIlIlIlllIIllIlIlllIllI + 1, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(true);
            }
        }
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(double d, boolean bl) {
    }

    @Override
    public boolean IIIIIllIlIllIlIlIIlIllIIl() {
        return true;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IlIIIIIllllllIIlllIllllll()) {
            this.lllIIIllIIIIlllIlIIllIIll(false);
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, class_07752.lIlllIlllIIIIlIIlllIllIII("BatFlags"));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("BatFlags", this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16));
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl);
        if (n >= 63) {
            return false;
        }
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
        int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIllIIIIlIlIlIllIIlll(n2, n, n3);
        int n5 = 4;
        Calendar calendar = this.lIlIllIIlIIlIIlIIlIIlIIll.IIIIlIllIlIIlIIlIllIlIlll();
        if (!(calendar.get(2) + 1 == 10 && calendar.get(5) >= 20 || calendar.get(2) + 1 == 11 && calendar.get(5) <= 3)) {
            if (this.IlllIIlllllllIIllIlIllllI.nextBoolean()) {
                return false;
            }
        } else {
            n5 = 7;
        }
        return n4 > this.IlllIIlllllllIIllIlIllllI.nextInt(n5) ? false : super.lllIIlIIIllllllIIIIlIlIlI();
    }
}

