package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1305
extends class_2094 {
    private float lllIIIlllIlllIIlIllllIIlI;
    private float lIIlIlllIIlllIIlllIIlIlII;
    private boolean lIIlIIIlIlIIlllIlIllIllIl;
    private boolean lIIlIlIIIIIllIIIIllIlIlII;
    private float lIIIIlIIIIllIlIIllllIlIII;
    private float lIIIlllllllIlllIIllllllll;

    public class_1305(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.6f, 0.8f);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, this.lIIIlIllllIlllIIIIIllIIIl);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_1963(this, 0.4f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1778(this, 1.0, true));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0820(this, 1.0, 10.0f, 2.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0303(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0921(this, 8.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(9, new class_0235(this, class_0814.class, 8.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(9, new class_0558(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0472(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1377(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(3, new class_0366(this, true));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(4, new class_2032(this, class_1317.class, 200, false));
        this.IllIIIllIIIIlIlIlIllIIlll(false);
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.3f);
        if (this.lllIIIIlIIllIIIlIllIlllII()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(20.0);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(8.0);
        }
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_19652);
        if (class_19652 == null) {
            this.llIIlllIllIllllIIIlIIIIII(false);
        } else if (!this.lllIIIIlIIllIIIlIllIlllII()) {
            this.llIIlllIllIllllIIIlIIIIII(true);
        }
    }

    @Override
    protected void lIIlIlIlIlIllIIlIIllllIll() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(18, Float.valueOf(this.lllIIIlllIlllIIlIllllIIlI()));
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18, new Float(this.lllIIIlllIlllIIlIllllIIlI()));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(19, new Byte(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(20, new Byte((byte)class_0974.IllIIlllllllIIlIIlIIIIlIl(1)));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.wolf.step", 0.15f, 1.0f);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Angry", this.IIIIlllllIlllIIllIIIlIllI());
        class_07752.lllIIIllIIIIlllIlIIllIIll("CollarColor", (byte)this.IlIlIIlllIIlIlllllIlIIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.llIIlllIllIllllIIIlIIIIII(class_07752.lllIIlIIIllllllIIIIlIlIlI("Angry"));
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CollarColor", 99)) {
            this.lIIlIIIIIlIlllIlIIlIlIlll(class_07752.lIlllIlllIIIIlIIlllIllIII("CollarColor"));
        }
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return this.IIIIlllllIlllIIllIIIlIllI() ? "mob.wolf.growl" : (this.IlllIIlllllllIIllIlIllllI.nextInt(3) == 0 ? (this.lllIIIIlIIllIIIlIllIlllII() && this.IlIlIllIIlIIIIlllIlIllIlI.lIlllIlllIIIIlIIlllIllIII(18) < 10.0f ? "mob.wolf.whine" : "mob.wolf.panting") : "mob.wolf.bark");
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.wolf.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.wolf.death";
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 0.4f;
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Item.lllIIIllIIIIlllIlIIllIIll(-1);
    }

    @Override
    public void d_() {
        super.d_();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIIlIIIlIlIIlllIlIllIllIl && !this.lIIlIlIIIIIllIIIIllIlIlII && !this.IlIlllIIIIIIlIIllIIllIlll() && this.llllllIlIllllIlIlIlIIIIlI) {
            this.lIIlIlIIIIIllIIIIllIlIlII = true;
            this.lIIIIlIIIIllIlIIllllIlIII = 0.0f;
            this.lIIIlllllllIlllIIllllllll = 0.0f;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)8);
        }
    }

    @Override
    public void s_() {
        super.s_();
        this.lIIlIlllIIlllIIlllIIlIlII = this.lllIIIlllIlllIIlIllllIIlI;
        this.lllIIIlllIlllIIlIllllIIlI = this.IIllllllIIllIlIllllIIIlll() ? (this.lllIIIlllIlllIIlIllllIIlI += (1.0f - this.lllIIIlllIlllIIlIllllIIlI) * 0.4f) : (this.lllIIIlllIlllIIlIllllIIlI += (0.0f - this.lllIIIlllIlllIIlIllllIIlI) * 0.4f);
        if (this.IIllllllIIllIlIllllIIIlll()) {
            this.llIIlllIllIllllIIIlIIIIII = 10;
        }
        if (this.IllIIIlllllIlIlllIlllllII()) {
            this.lIIlIIIlIlIIlllIlIllIllIl = true;
            this.lIIlIlIIIIIllIIIIllIlIlII = false;
            this.lIIIIlIIIIllIlIIllllIlIII = 0.0f;
            this.lIIIlllllllIlllIIllllllll = 0.0f;
        } else if ((this.lIIlIIIlIlIIlllIlIllIllIl || this.lIIlIlIIIIIllIIIIllIlIlII) && this.lIIlIlIIIIIllIIIIllIlIlII) {
            if (this.lIIIIlIIIIllIlIIllllIlIII == 0.0f) {
                this.lllIIIllIIIIlllIlIIllIIll("mob.wolf.shake", this.IIlIlIIIIlIlllIlIlIIIIIlI(), (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f);
            }
            this.lIIIlllllllIlllIIllllllll = this.lIIIIlIIIIllIlIIllllIlIII;
            this.lIIIIlIIIIllIlIIllllIlIII += 0.05f;
            if (this.lIIIlllllllIlllIIllllllll >= 2.0f) {
                this.lIIlIIIlIlIIlllIlIllIllIl = false;
                this.lIIlIlIIIIIllIIIIllIlIlII = false;
                this.lIIIlllllllIlllIIllllllll = 0.0f;
                this.lIIIIlIIIIllIlIIllllIlIII = 0.0f;
            }
            if (this.lIIIIlIIIIllIlIIllllIlIII > 0.4f) {
                float f = (float)this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl;
                int n = (int)(MathHelper.lllIIIllIIIIlllIlIIllIIll((this.lIIIIlIIIIllIlIIllllIlIII - 0.4f) * (float)Math.PI) * 7.0f);
                for (int i = 0; i < n; ++i) {
                    float f2 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * this.IIIIlIlIIlIIIIlIlllIlIIII * 0.5f;
                    float f3 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f) * this.IIIIlIlIIlIIIIlIlllIlIIII * 0.5f;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("splash", this.IlIIlllllIIlIlIlllllIllll + (double)f2, (double)(f + 0.8f), this.IllIIIIllIIllIllIlllIlIIl + (double)f3, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                }
            }
        }
    }

    public boolean IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.lIIlIIIlIlIIlllIlIllIllIl;
    }

    public float IlIlIIlIlIllIIlIlIIllIIIl(float f) {
        return 0.75f + (this.lIIIlllllllIlllIIllllllll + (this.lIIIIlIIIIllIlIIllllIlIII - this.lIIIlllllllIlllIIllllllll) * f) / 2.0f * 0.25f;
    }

    public float IlIllllllIIlIIllllIIlIIIl(float f, float f2) {
        float f3 = (this.lIIIlllllllIlllIIllllllll + (this.lIIIIlIIIIllIlIIllllIlIII - this.lIIIlllllllIlllIIllllllll) * f + f2) / 1.8f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * (float)Math.PI) * MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    public float lllllIlllIIllIlIIlIIIllII(float f) {
        return (this.lIIlIlllIIlllIIlllIIlIlII + (this.lllIIIlllIlllIIlIllllIIlI - this.lIIlIlllIIlllIIlllIIlIlII) * f) * 0.15f * (float)Math.PI;
    }

    @Override
    public float llIIllIllIlIIlIIllIllllll() {
        return this.lllIIIIlIlIIlIIlllIIIIIIl * 0.8f;
    }

    @Override
    public int IIIlllIlIIllIIlIlIllIlIIl() {
        return this.IlIllIIIIllllIIllIllIIIIl() ? 20 : super.IIIlllIlIIllIIlIlIllIlIIl();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(false);
        if (class_15212 != null && !(class_15212 instanceof class_0814) && !(class_15212 instanceof class_0369)) {
            f = (f + 1.0f) / 2.0f;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    public boolean llIIllIllIlIIlIIllIllllll(class_1521 class_15212) {
        int n = this.lllIIIIlIIllIIIlIllIlllII() ? 4 : 2;
        return class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this), (float)n);
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll(boolean bl) {
        super.IllIIIllIIIIlIlIlIllIIlll(bl);
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(20.0);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(8.0);
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (this.lllIIIIlIIllIIIlIllIlllII()) {
            if (class_08972 != null) {
                int n;
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1949) {
                    class_1949 class_19492 = (class_1949)class_08972.lllIIIllIIIIlllIlIIllIIll();
                    if (class_19492.IlIIIlIIIIllIIIllIIIIIIll() && this.IlIlIllIIlIIIIlllIlIllIlI.lIlllIlllIIIIlIIlllIllIII(18) < 20.0f) {
                        if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                        }
                        this.IlIllllllIIlIIllllIIlIIIl((float)class_19492.llIIllIllIlIIlIIllIllllll(class_08972));
                        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                            class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
                        }
                        return true;
                    }
                } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.dye && (n = class_0974.IllIIlllllllIIlIIlIIIIlIl(class_08972.IllIIIllIIIIlIlIlIllIIlll())) != this.IlIlIIlllIIlIlllllIlIIIIl()) {
                    this.lIIlIIIIIlIlllIlIIlIlIlll(n);
                    if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && --class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                        class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
                    }
                    return true;
                }
            }
            if (this.IlIIIIIllllllIIlllIllllll((class_1965)class_08142) && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IlIllllllIIlIIllllIIlIIIl(class_08972)) {
                this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(!this.IlIllIIIIllllIIllIllIIIIl());
                this.llIllIlllIllIlIIIIlIIlIII = false;
                this.lllIIIllIIIIlllIlIIllIIll((class_2086)null);
                this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)null);
                this.lllIlIIlIIIlIlIIIllIlllIl((class_1965)null);
            }
        } else if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bone && !this.IIIIlllllIlllIIllIIIlIllI()) {
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                if (this.IlllIIlllllllIIllIlIllllI.nextInt(3) == 0) {
                    this.IllIIIllIIIIlIlIlIllIIlll(true);
                    this.lllIIIllIIIIlllIlIIllIIll((class_2086)null);
                    this.lllIlIIlIIIlIlIIIllIlllIl((class_1965)null);
                    this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(true);
                    this.IllIIIllIIIIlIlIlIllIIlll(20.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lIIlllIIlIlIlIIIlIlllIIll().toString());
                    this.IIIllIllIIlIlIlIlIllllIIl(true);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)7);
                } else {
                    this.IIIllIllIIlIlIlIlIllllIIl(false);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)6);
                }
            }
            return true;
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 8) {
            this.lIIlIlIIIIIllIIIIllIlIlII = true;
            this.lIIIIlIIIIllIlIIllllIlIII = 0.0f;
            this.lIIIlllllllIlllIIllllllll = 0.0f;
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    public float IIlIlIIIlIIllIlIlIlIlIIll() {
        return this.IIIIlllllIlllIIllIIIlIllI() ? 1.5393804f : (this.lllIIIIlIIllIIIlIllIlllII() ? (0.55f - (20.0f - this.IlIlIllIIlIIIIlllIlIllIlI.lIlllIlllIIIIlIIlllIllIII(18)) * 0.02f) * (float)Math.PI : 0.62831855f);
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return class_08972 == null ? false : (!(class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1949) ? false : ((class_1949)class_08972.lllIIIllIIIIlllIlIIllIIll()).IlIIIlIIIIllIIIllIIIIIIll());
    }

    @Override
    public int llIIIlIIllIIllIllIIlIlllI() {
        return 8;
    }

    public boolean IIIIlllllIlllIIllIIIlIllI() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 2) != 0;
    }

    public void llIIlllIllIllllIIIlIIIIII(boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by | 2));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & 0xFFFFFFFD));
        }
    }

    public int IlIlIIlllIIlIlllllIlIIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(20) & 0xF;
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(20, (byte)(n & 0xF));
    }

    public class_1305 lllIlIIlIIIlIlIIIllIlllIl(class_0650 class_06502) {
        class_1305 class_13052 = new class_1305(this.lIlIllIIlIIlIIlIIlIIlIIll);
        String string = this.IlIllllllIIlIIllllIIlIIIl();
        if (string != null && string.trim().length() > 0) {
            class_13052.lllIlIIlIIIlIlIIIllIlllIl(string);
            class_13052.IllIIIllIIIIlIlIlIllIIlll(true);
        }
        return class_13052;
    }

    public void llIIllIllIlIIlIIllIllllll(boolean bl) {
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(19, (byte)1);
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(19, (byte)0);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0003 class_00032) {
        if (class_00032 == this) {
            return false;
        }
        if (!this.lllIIIIlIIllIIIlIllIlllII()) {
            return false;
        }
        if (!(class_00032 instanceof class_1305)) {
            return false;
        }
        class_1305 class_13052 = (class_1305)class_00032;
        return !class_13052.lllIIIIlIIllIIIlIllIlllII() ? false : (class_13052.IlIllIIIIllllIIllIllIIIIl() ? false : this.IIlIlIIIIlIlllIIlIIlIIIII() && class_13052.IIlIlIIIIlIlllIIlIIlIIIII());
    }

    public boolean IIllllllIIllIlIllllIIIlll() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(19) == 1;
    }

    @Override
    protected boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return !this.lllIIIIlIIllIIIlIllIlllII() && this.IlllIIIllllIIllIllIlIIlIl > 2400;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1965 class_19653) {
        if (!(class_19652 instanceof class_1234) && !(class_19652 instanceof class_1413)) {
            class_1305 class_13052;
            if (class_19652 instanceof class_1305 && (class_13052 = (class_1305)class_19652).lllIIIIlIIllIIIlIllIlllII() && class_13052.lIlIlIIllIlIIIIIlIIlllIlI() == class_19653) {
                return false;
            }
            return class_19652 instanceof class_0814 && class_19653 instanceof class_0814 && !((class_0814)class_19653).lIlllIlllIIIIlIIlllIllIII((class_0814)class_19652) ? false : !(class_19652 instanceof class_1627) || !((class_1627)class_19652).lIlIlIIllIlIIIIIlIIlllIlI();
        }
        return false;
    }

    @Override
    public /* synthetic */ class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_06502);
    }
}

