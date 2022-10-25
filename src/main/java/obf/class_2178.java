package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_2178
extends class_1860
implements class_0850 {
    private ItemStack[] lllIIIllIIIIlllIlIIllIIll = new ItemStack[36];
    private boolean lllIlIIlIIIlIlIIIllIlllIl = true;

    public class_2178(class_1334 class_13342) {
        super(class_13342);
    }

    public class_2178(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll(); ++i) {
            ItemStack class_08972 = this.llIIllIllIlIIlIIllIllllll(i);
            if (class_08972 == null) continue;
            float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.8f + 0.1f;
            float f2 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.8f + 0.1f;
            float f3 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.8f + 0.1f;
            while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                int n = this.IlllIIlllllllIIllIlIllllI.nextInt(21) + 10;
                if (n > class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                    n = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                }
                class_08972.lllIlIIlIIIlIlIIIllIlllIl -= n;
                class_1781 class_17812 = new class_1781(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll + (double)f, this.llIIlIlIlllIIllIlIlllIllI + (double)f2, this.IllIIIIllIIllIllIlllIlIIl + (double)f3, new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll(), n, class_08972.IllIIIllIIIIlIlIlIllIIlll()));
                float f4 = 0.05f;
                class_17812.IIIIIIIIlIllIIllIIlllIllI = (float)this.IlllIIlllllllIIllIlIllllI.nextGaussian() * f4;
                class_17812.IIlIIlIlIlIllIIlIlIIIIlll = (float)this.IlllIIlllllllIIllIlIllllI.nextGaussian() * f4 + 0.2f;
                class_17812.llIIIlllIlllIlIllIIIIllIl = (float)this.IlllIIlllllllIIllIlIllllI.nextGaussian() * f4;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_17812);
            }
        }
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll[n];
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.lllIIIllIIIIlllIlIIllIIll[n] != null) {
            if (this.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll[n];
                this.lllIIIllIIIIlllIlIIllIIll[n] = null;
                return class_08972;
            }
            ItemStack class_08973 = this.lllIIIllIIIIlllIlIIllIIll[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (this.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.lllIIIllIIIIlllIlIIllIIll[n] = null;
            }
            return class_08973;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.lllIIIllIIIIlllIlIIllIIll[n] != null) {
            ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll[n];
            this.lllIIIllIIIIlllIlIIllIIll[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll[n] = class_08972;
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > this.llIIlIlIlllIIllIlIlllIllI()) {
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI();
        }
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return this.IllllIIIIlIIlIIIIlllIIIIl ? false : class_08142.IlIIIIIllllllIIlllIllllll(this) <= 64.0;
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, ItemStack class_08972) {
        return true;
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl() ? this.lIlIllIIlIIlIIlIIlIIlIIll() : "container.minecart";
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = false;
        super.IIIllIllIIlIlIlIlIllllIIl(n);
    }

    @Override
    public void IIIIlIIlIIIllIIIIllIIIlII() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = this.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.8f + 0.1f;
                float f2 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.8f + 0.1f;
                float f3 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.8f + 0.1f;
                while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                    int n = this.IlllIIlllllllIIllIlIllllI.nextInt(21) + 10;
                    if (n > class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                        n = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    }
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl -= n;
                    class_1781 class_17812 = new class_1781(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll + (double)f, this.llIIlIlIlllIIllIlIlllIllI + (double)f2, this.IllIIIIllIIllIllIlllIlIIl + (double)f3, new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll(), n, class_08972.IllIIIllIIIIlIlIlIllIIlll()));
                    if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                        class_17812.lIlllIlllIIIIlIIlllIllIII().lIlllIlllIIIIlIIlllIllIII((class_0775)class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl());
                    }
                    float f4 = 0.05f;
                    class_17812.IIIIIIIIlIllIIllIIlllIllI = (float)this.IlllIIlllllllIIllIlIllllI.nextGaussian() * f4;
                    class_17812.IIlIIlIlIlIllIIlIlIIIIlll = (float)this.IlllIIlllllllIIllIlIllllI.nextGaussian() * f4 + 0.2f;
                    class_17812.llIIIlllIlllIlIllIIIIllIl = (float)this.IlllIIlllllllIIllIlIllllI.nextGaussian() * f4;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_17812);
                }
            }
        }
        super.IIIIlIIlIIIllIIIIllIIIlII();
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll[i] == null) continue;
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)i);
            this.lllIIIllIIIIlllIlIIllIIll[i].lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Items", class_21452);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("net.minecraft.init.Items", 10);
        this.lllIIIllIIIIlllIlIIllIIll = new ItemStack[this.IlIIIIIllllllIIlllIllllll()];
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            int n = class_07753.lIlllIlllIIIIlIIlllIllIII("Slot") & 0xFF;
            if (n < 0 || n >= this.lllIIIllIIIIlllIlIIllIIll.length) continue;
            this.lllIIIllIIIIlllIlIIllIIll[n] = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
    }

    @Override
    public boolean b_(class_0814 class_08142) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(this);
        }
        return true;
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll() {
        int n = 15 - class_1071.lllIlIIlIIIlIlIIIllIlllIl(this);
        float f = 0.98f + (float)n * 0.001f;
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.0;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)f;
    }
}

