package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1554
extends class_0003 {
    public float lIIIlIllllIlllIIIIIllIIIl;
    public float lllIIIlllIlllIIlIllllIIlI;
    public float lIIlIlllIIlllIIlllIIlIlII;
    public float lIIlIIIlIlIIlllIlIllIllIl;
    public float lIIlIlIIIIIllIIIIllIlIlII = 1.0f;
    public int lIIIIlIIIIllIlIIllllIlIII;
    public boolean lIIIlllllllIlllIIllllllll;

    public class_1554(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.3f, 0.7f);
        this.lIIIIlIIIIllIlIIllllIlIII = this.IlllIIlllllllIIllIlIllllI.nextInt(6000) + 6000;
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0826(this, 1.4));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0303(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_1801(this, 1.0, Items.llIlllIIllIlllIlIlIlIIIll, false));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1954(this, 1.1));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0235(this, class_0814.class, 6.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0558(this));
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(4.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.25);
    }

    @Override
    public void d_() {
        super.d_();
        this.lIIlIIIlIlIIlllIlIllIllIl = this.lIIIlIllllIlllIIIIIllIIIl;
        this.lIIlIlllIIlllIIlllIIlIlII = this.lllIIIlllIlllIIlIllllIIlI;
        this.lllIIIlllIlllIIlIllllIIlI = (float)((double)this.lllIIIlllIlllIIlIllllIIlI + (double)(this.llllllIlIllllIlIlIlIIIIlI ? -1 : 4) * 0.3);
        if (this.lllIIIlllIlllIIlIllllIIlI < 0.0f) {
            this.lllIIIlllIlllIIlIllllIIlI = 0.0f;
        }
        if (this.lllIIIlllIlllIIlIllllIIlI > 1.0f) {
            this.lllIIIlllIlllIIlIllllIIlI = 1.0f;
        }
        if (!this.llllllIlIllllIlIlIlIIIIlI && this.lIIlIlIIIIIllIIIIllIlIlII < 1.0f) {
            this.lIIlIlIIIIIllIIIIllIlIlII = 1.0f;
        }
        this.lIIlIlIIIIIllIIIIllIlIlII = (float)((double)this.lIIlIlIIIIIllIIIIllIlIlII * 0.9);
        if (!this.llllllIlIllllIlIlIlIIIIlI && this.IIlIIlIlIlIllIIlIlIIIIlll < 0.0) {
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.6;
        }
        this.lIIIlIllllIlllIIIIIllIIIl += this.lIIlIlIIIIIllIIIIllIlIlII * 2.0f;
        if (!(this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl || this.g_() || this.IIlIlIlIIlllIIIlIIIIlIIIl() || --this.lIIIIlIIIIllIlIIllllIlIII > 0)) {
            this.lllIIIllIIIIlllIlIIllIIll("mob.chicken.plop", 1.0f, (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(Items.egg, 1);
            this.lIIIIlIIIIllIlIIllllIlIII = this.IlllIIlllllllIIllIlIllllI.nextInt(6000) + 6000;
        }
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.chicken.say";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.chicken.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.chicken.hurt";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.chicken.step", 0.15f, 1.0f);
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.IIIIlIllIlIIlIIlIllIlIlll;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(3) + this.IlllIIlllllllIIllIlIllllI.nextInt(1 + n);
        for (int i = 0; i < n2; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.IIIIlIllIlIIlIIlIllIlIlll, 1);
        }
        if (this.llIIIIIlIIlIIIIllIIIlIIII()) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.lIIIIIlIllIllIlIlIIllllll, 1);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(Items.IIIIlIIIllIIIlIIlIIIIIlll, 1);
        }
    }

    public class_1554 lllIlIIlIIIlIlIIIllIlllIl(class_0650 class_06502) {
        return new class_1554(this.lIlIllIIlIIlIIlIIlIIlIIll);
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1626;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lIIIlllllllIlllIIllllllll = class_07752.lllIIlIIIllllllIIIIlIlIlI("IsChickenJockey");
    }

    @Override
    protected int IlIIIIIllllllIIlllIllllll(class_0814 class_08142) {
        return this.IIlIlIlIIlllIIIlIIIIlIIIl() ? 10 : super.IlIIIIIllllllIIlllIllllll(class_08142);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("IsChickenJockey", this.lIIIlllllllIlllIIllllllll);
    }

    @Override
    protected boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return this.IIlIlIlIIlllIIIlIIIIlIIIl() && this.lIlIlIIlIIIIlIIIIIlllIIII == null;
    }

    @Override
    public void IIIlIlIllIlllllIlIllllllI() {
        super.IIIlIlIllIlllllIlIllllllI();
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllllIllllIIIIllIIlIlIlII * (float)Math.PI / 180.0f);
        float f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIllllIIIIllIIlIlIlII * (float)Math.PI / 180.0f);
        float f3 = 0.1f;
        float f4 = 0.0f;
        this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + (double)(f3 * f), this.llIIlIlIlllIIllIlIlllIllI + (double)(this.lllIIIIlIlIIlIIlllIIIIIIl * 0.5f) + this.lIlIlIIlIIIIlIIIIIlllIIII.IIIIlIllIlIIIIIllllIIlllI() + (double)f4, this.IllIIIIllIIllIllIlllIlIIl - (double)(f3 * f2));
        if (this.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_1965) {
            ((class_1965)this.lIlIlIIlIIIIlIIIIIlllIIII).lllllIllllIIIIllIIlIlIlII = this.lllllIllllIIIIllIIlIlIlII;
        }
    }

    public boolean IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.lIIIlllllllIlllIIllllllll;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(boolean bl) {
        this.lIIIlllllllIlllIIllllllll = bl;
    }

    @Override
    public /* synthetic */ class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_06502);
    }
}

