package net.minecraft.block;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;
import obf.*;

import java.util.Random;

public class BlockDispenser
extends class_2257 {
    public static final class_1737 dispenseBehaviorRegistry = new class_0856(new class_0926());
    protected Random lIlIIllllIlIIIIllIIIIlIIl = new Random();
    protected IIcon llIlllIIllIlllIlIlIlIIIll;
    protected IIcon IIIIlIIlIIIllIIIIllIIIlII;
    protected IIcon lllIIIIIIlIlllIIlIlIIIllI;

    protected BlockDispenser() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 4;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
    }

    private void lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            Block class_05492 = class_13342.a_(n, n2, n3 - 1);
            Block class_05493 = class_13342.a_(n, n2, n3 + 1);
            Block class_05494 = class_13342.a_(n - 1, n2, n3);
            Block class_05495 = class_13342.a_(n + 1, n2, n3);
            int n4 = 3;
            if (class_05492.lllIIIllIIIIlllIlIIllIIll() && !class_05493.lllIIIllIIIIlllIlIIllIIll()) {
                n4 = 3;
            }
            if (class_05493.lllIIIllIIIIlllIlIIllIIll() && !class_05492.lllIIIllIIIIlllIlIIllIIll()) {
                n4 = 2;
            }
            if (class_05494.lllIIIllIIIIlllIlIIllIIll() && !class_05495.lllIIIllIIIIlllIlIIllIIll()) {
                n4 = 5;
            }
            if (class_05495.lllIIIllIIIIlllIlIIllIIll() && !class_05494.lllIIIllIIIIlllIlIIllIIll()) {
                n4 = 4;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
        }
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = n2 & 7;
        return n == n3 ? (n3 != 1 && n3 != 0 ? this.IIIIlIIlIIIllIIIIllIIIlII : this.lllIIIIIIlIlllIIlIlIIIllI) : (n3 != 1 && n3 != 0 ? (n != 1 && n != 0 ? this.llIIIIllIIIIIIIlIIIlIIIIl : this.llIlllIIllIlllIlIlIlIIIll) : this.llIlllIIllIlllIlIlIlIIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("furnace_side");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll("furnace_top");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_front_horizontal");
        this.lllIIIIIIlIlllIIlIlIIIllI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_front_vertical");
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_1646 class_16462 = (class_1646)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_16462 != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_16462);
        }
        return true;
    }

    protected void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        class_1101 class_11012 = new class_1101(class_13342, n, n2, n3);
        class_1646 class_16462 = (class_1646)class_11012.IIIllIllIIlIlIlIlIllllIIl();
        if (class_16462 != null) {
            int n4 = class_16462.lllIIIllIIIIlllIlIIllIIll();
            if (n4 < 0) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(1001, n, n2, n3, 0);
            } else {
                ItemStack class_08972 = class_16462.llIIllIllIlIIlIIllIllllll(n4);
                class_1677 class_16772 = this.lllIIIllIIIIlllIlIIllIIll(class_08972);
                if (class_16772 != class_1677.lllIlIIlIIIlIlIIIllIlllIl) {
                    ItemStack class_08973 = class_16772.lllIIIllIIIIlllIlIIllIIll(class_11012, class_08972);
                    class_16462.lllIlIIlIIIlIlIIIllIlllIl(n4, class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0 ? null : class_08973);
                }
            }
        }
    }

    protected class_1677 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return (class_1677) dispenseBehaviorRegistry.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        boolean bl;
        boolean bl2 = class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3) || class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2 + 1, n3);
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl3 = bl = (n4 & 8) != 0;
        if (bl2 && !bl) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 | 8, 4);
        } else if (!bl2 && bl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 & 0xFFFFFFF7, 4);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        }
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_1646();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = class_1039.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19652);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            ((class_1646)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        class_1646 class_16462 = (class_1646)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_16462 != null) {
            for (int i = 0; i < class_16462.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = class_16462.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                float f = this.lIlIIllllIlIIIIllIIIIlIIl.nextFloat() * 0.8f + 0.1f;
                float f2 = this.lIlIIllllIlIIIIllIIIIlIIl.nextFloat() * 0.8f + 0.1f;
                float f3 = this.lIlIIllllIlIIIIllIIIIlIIl.nextFloat() * 0.8f + 0.1f;
                while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                    int n5 = this.lIlIIllllIlIIIIllIIIIlIIl.nextInt(21) + 10;
                    if (n5 > class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                        n5 = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    }
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl -= n5;
                    class_1781 class_17812 = new class_1781(class_13342, (float)n + f, (float)n2 + f2, (float)n3 + f3, new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll(), n5, class_08972.IllIIIllIIIIlIlIlIllIIlll()));
                    if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                        class_17812.lIlllIlllIIIIlIIlllIllIII().lIlllIlllIIIIlIIlllIllIII((class_0775)class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl());
                    }
                    float f4 = 0.05f;
                    class_17812.IIIIIIIIlIllIIllIIlllIllI = (float)this.lIlIIllllIlIIIIllIIIIlIIl.nextGaussian() * f4;
                    class_17812.IIlIIlIlIlIllIIlIlIIIIlll = (float)this.lIlIIllllIlIIIIllIIIIlIIl.nextGaussian() * f4 + 0.2f;
                    class_17812.llIIIlllIlllIlIllIIIIllIl = (float)this.lIlIIllllIlIIIIllIIIIlIIl.nextGaussian() * f4;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(class_17812);
                }
            }
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3, class_05492);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    public static class_2132 lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282) {
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        double d = class_17282.lllIlIIlIIIlIlIIIllIlllIl() + 0.7 * (double)class_11882.lllIIIllIIIIlllIlIIllIIll();
        double d2 = class_17282.IlIllllllIIlIIllllIIlIIIl() + 0.7 * (double)class_11882.lllIlIIlIIIlIlIIIllIlllIl();
        double d3 = class_17282.lIlllIlllIIIIlIIlllIllIII() + 0.7 * (double)class_11882.IlIllllllIIlIIllllIIlIIIl();
        return new class_1520(d, d2, d3);
    }

    public static class_1188 IllIIlllllllIIlIIlIIIIlIl(int n) {
        return class_1188.lllIIIllIIIIlllIlIIllIIll(n & 7);
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return class_1071.lllIlIIlIIIlIlIIIllIlllIl((class_0850)((Object)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)));
    }
}

