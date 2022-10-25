package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0002
extends class_1349 {
    public float lIIIlIllllIlllIIIIIllIIIl;
    public float lllIIIlllIlllIIlIllllIIlI;
    public float lIIlIlllIIlllIIlllIIlIlII;
    public float lIIlIIIlIlIIlllIlIllIllIl;
    public float lIIlIlIIIIIllIIIIllIlIlII;
    public float lIIIIlIIIIllIlIIllllIlIII;
    public float lIIIlllllllIlllIIllllllll;
    public float IIllllIIlIlIlIlllIIIllIIl;
    private float IIIllIIIlIlllllllIIIlllll;
    private float lIlIlllIllllIIlllIlllIIIl;
    private float lIlIllllIlIIIIIllIIIIlIlI;
    private float IIlllllIIlIIlIlIIlIIlIlII;
    private float IIlIlIIIIlIlllIlIlIIIIIlI;
    private float IlIlIIllIlIlIIIIIlIlllllI;

    public class_0002(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.95f, 0.95f);
        this.lIlIlllIllllIIlllIlllIIIl = 1.0f / (this.IlllIIlllllllIIllIlIllllI.nextFloat() + 1.0f) * 0.2f;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(10.0);
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return null;
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return null;
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return null;
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 0.4f;
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Item.lllIIIllIIIIlllIlIIllIIll(0);
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(3 + n) + 1;
        for (int i = 0; i < n2; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.dye, 1, 0), 0.0f);
        }
    }

    @Override
    public boolean llIlllIlIIllIlIIIIllIIlIl() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(0.0, -0.6f, 0.0), class_1855.IllIIlllllllIIlIIlIIIIlIl, (class_1521)this);
    }

    @Override
    public void d_() {
        super.d_();
        this.lllIIIlllIlllIIlIllllIIlI = this.lIIIlIllllIlllIIIIIllIIIl;
        this.lIIlIIIlIlIIlllIlIllIllIl = this.lIIlIlllIIlllIIlllIIlIlII;
        this.lIIIIlIIIIllIlIIllllIlIII = this.lIIlIlIIIIIllIIIIllIlIlII;
        this.IIllllIIlIlIlIlllIIIllIIl = this.lIIIlllllllIlllIIllllllll;
        this.lIIlIlIIIIIllIIIIllIlIlII += this.lIlIlllIllllIIlllIlllIIIl;
        if (this.lIIlIlIIIIIllIIIIllIlIlII > (float)Math.PI * 2) {
            this.lIIlIlIIIIIllIIIIllIlIlII -= (float)Math.PI * 2;
            if (this.IlllIIlllllllIIllIlIllllI.nextInt(10) == 0) {
                this.lIlIlllIllllIIlllIlllIIIl = 1.0f / (this.IlllIIlllllllIIllIlIllllI.nextFloat() + 1.0f) * 0.2f;
            }
        }
        if (this.llIlllIlIIllIlIIIIllIIlIl()) {
            float f;
            if (this.lIIlIlIIIIIllIIIIllIlIlII < (float)Math.PI) {
                f = this.lIIlIlIIIIIllIIIIllIlIlII / (float)Math.PI;
                this.lIIIlllllllIlllIIllllllll = MathHelper.lllIIIllIIIIlllIlIIllIIll(f * f * (float)Math.PI) * (float)Math.PI * 0.25f;
                if ((double)f > 0.75) {
                    this.IIIllIIIlIlllllllIIIlllll = 1.0f;
                    this.lIlIllllIlIIIIIllIIIIlIlI = 1.0f;
                } else {
                    this.lIlIllllIlIIIIIllIIIIlIlI *= 0.8f;
                }
            } else {
                this.lIIIlllllllIlllIIllllllll = 0.0f;
                this.IIIllIIIlIlllllllIIIlllll *= 0.9f;
                this.lIlIllllIlIIIIIllIIIIlIlI *= 0.99f;
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.IIIIIIIIlIllIIllIIlllIllI = this.IIlllllIIlIIlIlIIlIIlIlII * this.IIIllIIIlIlllllllIIIlllll;
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.IIlIlIIIIlIlllIlIlIIIIIlI * this.IIIllIIIlIlllllllIIIlllll;
                this.llIIIlllIlllIlIllIIIIllIl = this.IlIlIIllIlIlIIIIIlIlllllI * this.IIIllIIIlIlllllllIIIlllll;
            }
            f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
            this.lllllIllllIIIIllIIlIlIlII += (-((float)Math.atan2(this.IIIIIIIIlIllIIllIIlllIllI, this.llIIIlllIlllIlIllIIIIllIl)) * 180.0f / (float)Math.PI - this.lllllIllllIIIIllIIlIlIlII) * 0.1f;
            this.IIIIlIllIlIIlIIlIllIlIlll = this.lllllIllllIIIIllIIlIlIlII;
            this.lIIlIlllIIlllIIlllIIlIlII += (float)Math.PI * this.lIlIllllIlIIIIIllIIIIlIlI * 1.5f;
            this.lIIIlIllllIlllIIIIIllIIIl += (-((float)Math.atan2(f, this.IIlIIlIlIlIllIIlIlIIIIlll)) * 180.0f / (float)Math.PI - this.lIIIlIllllIlllIIIIIllIIIl) * 0.1f;
        } else {
            this.lIIIlllllllIlllIIllllllll = MathHelper.IlIIIIIllllllIIlllIllllll(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lIIlIlIIIIIllIIIIllIlIlII)) * (float)Math.PI * 0.25f;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
                this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.08;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
                this.llIIIlllIlllIlIllIIIIllIl = 0.0;
            }
            this.lIIIlIllllIlllIIIIIllIIIl = (float)((double)this.lIIIlIllllIlllIIIIIllIIIl + (double)(-90.0f - this.lIIIlIllllIlllIIIIIllIIIl) * 0.02);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
    }

    @Override
    protected void llIIlIlIlllIIllIlIlllIllI() {
        ++this.lIIlIlllIIlIIIIlIlIIIIlll;
        if (this.lIIlIlllIIlIIIIlIlIIIIlll > 100) {
            this.IlIlIIllIlIlIIIIIlIlllllI = 0.0f;
            this.IIlIlIIIIlIlllIlIlIIIIIlI = 0.0f;
            this.IIlllllIIlIIlIlIIlIIlIlII = 0.0f;
        } else if (this.IlllIIlllllllIIllIlIllllI.nextInt(50) == 0 || !this.IIIlIlIllIlllllIlIllllllI || this.IIlllllIIlIIlIlIIlIIlIlII == 0.0f && this.IIlIlIIIIlIlllIlIlIIIIIlI == 0.0f && this.IlIlIIllIlIlIIIIIlIlllllI == 0.0f) {
            float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * (float)Math.PI * 2.0f;
            this.IIlllllIIlIIlIlIIlIIlIlII = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * 0.2f;
            this.IIlIlIIIIlIlllIlIlIIIIIlI = -0.1f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f;
            this.IlIlIIllIlIlIIIIIlIlllllI = MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * 0.2f;
        }
        this.IllIlllIIIlllllIllIIlIlIl();
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.llIIlIlIlllIIllIlIlllIllI > 45.0 && this.llIIlIlIlllIIllIlIlllIllI < 63.0 && super.lllIIlIIIllllllIIIIlIlIlI();
    }
}

