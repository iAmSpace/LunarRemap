package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class class_0941
extends class_2174 {
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private double lIllllIIlIIIlIllllllIIIll;
    private double IIIllIIlIIIIIIlIlIIllIIlI;
    private double IllIIlllllllIIlIIlIIIIlIl;

    public class_0941(class_1334 class_13342, GameProfile gameProfile) {
        super(class_13342, gameProfile);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        this.IllIlIlIIIlllIIllIIIIlIll = 0.0f;
        this.IlIIIlIllIIIllIIIIlIIlIll = true;
        this.IIIIIllIIlIlIlIIlIlIlIllI = 0.25f;
        this.IlIlIIlllIIlIllIIIlllllIl = 10.0;
    }

    @Override
    protected void e_() {
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2, int n) {
        this.lIlllIlllIIIIlIIlllIllIII = d;
        this.IlIIIIIllllllIIlllIllllll = d2;
        this.lIllllIIlIIIlIllllllIIIll = d3;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
        this.IllIIlllllllIIlIIlIIIIlIl = f2;
        this.IlIllllllIIlIIllllIIlIIIl = n;
    }

    @Override
    public void s_() {
        this.IIIIIllIIlIlIlIIlIlIlIllI = 0.0f;
        super.s_();
        this.IIIIlllIIlIllllllIllIIlll = this.IIIIIIlIIIIIIIIIIlIlIlIlI;
        double d = this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll;
        double d2 = this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl;
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2) * 4.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.IIIIIIlIIIIIIIIIIlIlIlIlI += (f - this.IIIIIIlIIIIIIIIIIlIlIlIlI) * 0.4f;
        this.IllIlllIIIlllllIllIIlIlIl += this.IIIIIIlIIIIIIIIIIlIlIlIlI;
        if (!this.lllIlIIlIIIlIlIIIllIlllIl && this.lIIIlIIllIllIIlIIlIIIllII() && this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] != null) {
            ItemStack class_08972 = this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl];
            this.IlIllllllIIlIIllllIIlIIIl(this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl], class_08972.lllIIIllIIIIlllIlIIllIIll().lIllllIIlIIIlIllllllIIIll(class_08972));
            this.lllIlIIlIIIlIlIIIllIlllIl = true;
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl && !this.lIIIlIIllIllIIlIIlIIIllII()) {
            this.lllllIllllIIIIllIIlIlIlII();
            this.lllIlIIlIIIlIlIIIllIlllIl = false;
        }
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    @Override
    public void d_() {
        super.llIIlIlIlllIIllIlIlllIllI();
        if (this.IlIllllllIIlIIllllIIlIIIl > 0) {
            double d;
            double d2 = this.IlIIlllllIIlIlIlllllIllll + (this.lIlllIlllIIIIlIIlllIllIII - this.IlIIlllllIIlIlIlllllIllll) / (double)this.IlIllllllIIlIIllllIIlIIIl;
            double d3 = this.llIIlIlIlllIIllIlIlllIllI + (this.IlIIIIIllllllIIlllIllllll - this.llIIlIlIlllIIllIlIlllIllI) / (double)this.IlIllllllIIlIIllllIIlIIIl;
            double d4 = this.IllIIIIllIIllIllIlllIlIIl + (this.lIllllIIlIIIlIllllllIIIll - this.IllIIIIllIIllIllIlllIlIIl) / (double)this.IlIllllllIIlIIllllIIlIIIl;
            for (d = this.IIIllIIlIIIIIIlIlIIllIIlI - (double)this.IIIIlIllIlIIlIIlIllIlIlll; d < -180.0; d += 360.0) {
            }
            while (d >= 180.0) {
                d -= 360.0;
            }
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)((double)this.IIIIlIllIlIIlIIlIllIlIlll + d / (double)this.IlIllllllIIlIIllllIIlIIIl);
            this.IlIlIIlllIllllllllIIIlIlI = (float)((double)this.IlIlIIlllIllllllllIIIlIlI + (this.IllIIlllllllIIlIIlIIIIlIl - (double)this.IlIlIIlllIllllllllIIIlIlI) / (double)this.IlIllllllIIlIIllllIIlIIIl);
            --this.IlIllllllIIlIIllllIIlIIIl;
            this.IlIllllllIIlIIllllIIlIIIl(d2, d3, d4);
            this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
        }
        this.lIIlIIIlIlIIlllIlIllIllIl = this.lIIlIlIIIIIllIIIIllIlIlII;
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
        float f2 = (float)Math.atan(-this.IIlIIlIlIlIllIIlIlIIIIlll * (double)0.2f) * 15.0f;
        if (f > 0.1f) {
            f = 0.1f;
        }
        if (!this.llllllIlIllllIlIlIlIIIIlI || this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            f = 0.0f;
        }
        if (this.llllllIlIllllIlIlIlIIIIlI || this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            f2 = 0.0f;
        }
        this.lIIlIlIIIIIllIIIIllIlIlII += (f - this.lIIlIlIIIIIllIIIIllIlIlII) * 0.4f;
        this.llllIIIlIlIlIlIIlIIIIIlIl += (f2 - this.llllIIIlIlIlIlIIlIIIIIlIl) * 0.8f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972) {
        if (n == 0) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = class_08972;
        } else {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl[n - 1] = class_08972;
        }
    }

    @Override
    public float llIIllIllIlIIlIIllIllllll() {
        return 1.82f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_22552);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, String string) {
        return false;
    }

    @Override
    public class_2208 lllIIlIIIllllllIIIIlIlIlI() {
        return new class_2208(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + 0.5), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + 0.5), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl + 0.5));
    }
}

