package obf;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1800
extends class_1521 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_1800(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(8, 5);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(double d) {
        return d < 4096.0;
    }

    public class_1800(class_1334 class_13342, double d, double d2, double d3, ItemStack class_08972) {
        super(class_13342);
        this.lllIIIllIIIIlllIlIIllIIll = 0;
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        int n = 1;
        if (class_08972 != null && class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(8, class_08972);
            class_0775 class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII();
            class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Fireworks");
            if (class_07753 != null) {
                n += class_07753.lIlllIlllIIIIlIIlllIllIII("Flight");
            }
        }
        this.IIIIIIIIlIllIIllIIlllIllI = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.001;
        this.llIIIlllIlllIlIllIIIIllIl = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.001;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.05;
        this.lllIlIIlIIIlIlIIIllIlllIl = 10 * n + this.IlllIIlllllllIIllIlIllllI.nextInt(6) + this.IlllIIlllllllIIllIlIllllI.nextInt(7);
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(double d, double d2, double d3) {
        this.IIIIIIIIlIllIIllIIlllIllI = d;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d2;
        this.llIIIlllIlllIlIllIIIIllIl = d3;
        if (this.llIIIIllIIIIIIIlIIIlIIIIl == 0.0f && this.llllIIIIlIIIlIIIIIIlIllll == 0.0f) {
            float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3);
            this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
            this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(d2, f) * 180.0 / Math.PI);
        }
    }

    @Override
    public void s_() {
        this.lIIIlIIIlIlllIllIIIlIIIlI = this.IlIIlllllIIlIlIlllllIllll;
        this.lIIlIlllIllIlIlllIIIIIIII = this.llIIlIlIlllIIllIlIlllIllI;
        this.IIlIllIIlllllIIlIIllllIIl = this.IllIIIIllIIllIllIlllIlIIl;
        super.s_();
        this.IIIIIIIIlIllIIllIIlllIllI *= 1.15;
        this.llIIIlllIlllIlIllIIIIllIl *= 1.15;
        this.IIlIIlIlIlIllIIlIlIIIIlll += 0.04;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(this.IIIIIIIIlIllIIllIIlllIllI, this.llIIIlllIlllIlIllIIIIllIl) * 180.0 / Math.PI);
        this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(this.IIlIIlIlIlIllIIlIlIIIIlll, f) * 180.0 / Math.PI);
        while (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl < -180.0f) {
            this.llIIIIllIIIIIIIlIIIlIIIIl -= 360.0f;
        }
        while (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl >= 180.0f) {
            this.llIIIIllIIIIIIIlIIIlIIIIl += 360.0f;
        }
        while (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll < -180.0f) {
            this.llllIIIIlIIIlIIIIIIlIllll -= 360.0f;
        }
        while (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll >= 180.0f) {
            this.llllIIIIlIIIlIIIIIIlIllll += 360.0f;
        }
        this.IlIlIIlllIllllllllIIIlIlI = this.llIIIIllIIIIIIIlIIIlIIIIl + (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl) * 0.2f;
        this.IIIIlIllIlIIlIIlIllIlIlll = this.llllIIIIlIIIlIIIIIIlIllll + (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll) * 0.2f;
        if (this.lllIIIllIIIIlllIlIIllIIll == 0) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, "fireworks.launch", 3.0f, 1.0f);
        }
        ++this.lllIIIllIIIIlllIlIIllIIll;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lllIIIllIIIIlllIlIIllIIll % 2 < 2) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("fireworksSpark", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI - 0.3, this.IllIIIIllIIllIllIlllIlIIl, this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.05, -this.IIlIIlIlIlIllIIlIlIIIIlll * 0.5, this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.05);
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lllIIIllIIIIlllIlIIllIIll > this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)17);
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 17 && this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            ItemStack class_08972 = this.IlIlIllIIlIIIIlllIlIllIlI.lIllllIIlIIIlIllllllIIIll(8);
            class_0775 class_07752 = null;
            if (class_08972 != null && class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("Fireworks");
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl, class_07752);
        }
        super.lllIIIllIIIIlllIlIIllIIll(by);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Life", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("LifeTime", this.lllIlIIlIIIlIlIIIllIlllIl);
        ItemStack class_08972 = this.IlIlIllIIlIIIIlllIlIllIlI.lIllllIIlIIIlIllllllIIIll(8);
        if (class_08972 != null) {
            class_0775 class_07753 = new class_0775();
            class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            class_07752.lllIIIllIIIIlllIlIIllIIll("FireworksItem", class_07753);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        ItemStack class_08972;
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("Life");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("LifeTime");
        class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("FireworksItem");
        if (class_07753 != null && (class_08972 = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753)) != null) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(8, class_08972);
        }
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return super.lllIlIIlIIIlIlIIIllIlllIl(f);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        return super.lllIIIllIIIIlllIlIIllIIll(f);
    }

    @Override
    public boolean m_() {
        return false;
    }
}

