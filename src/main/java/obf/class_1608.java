package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1608
extends class_2257 {
    private final Random llllllIlIllllIlIlIlIIIIlI = new Random();
    private final boolean lIlIIllllIlIIIIllIIIIlIIl;
    private static boolean llIlllIIllIlllIlIlIlIIIll;
    private class_2102 IIIIlIIlIIIllIIIIllIIIlII;
    private class_2102 lllIIIIIIlIlllIIlIlIIIllI;

    protected class_1608(boolean bl) {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        this.lIlIIllllIlIIIIllIIIIlIIl = bl;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(Blocks.furnace);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    private void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
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
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.IIIIlIIlIIIllIIIIllIIIlII : (n == 0 ? this.IIIIlIIlIIIllIIIIllIIIlII : (n != n2 ? this.llIIIIllIIIIIIIlIIIlIIIIl : this.lllIIIIIIlIlllIIlIlIIIllI));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("furnace_side");
        this.lllIIIIIIlIlllIIlIlIIIllI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIIllllIlIIIIllIIIIlIIl ? "furnace_front_on" : "furnace_front_off");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll("furnace_top");
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (this.lIlIIllllIlIIIIllIIIIlIIl) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            float f = (float)n + 0.5f;
            float f2 = (float)n2 + 0.0f + random.nextFloat() * 6.0f / 16.0f;
            float f3 = (float)n3 + 0.5f;
            float f4 = 0.52f;
            float f5 = random.nextFloat() * 0.6f - 0.3f;
            if (n4 == 4) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", (double)(f - f4), (double)f2, (double)(f3 + f5), 0.0, 0.0, 0.0);
                class_13342.lllIIIllIIIIlllIlIIllIIll("flame", (double)(f - f4), (double)f2, (double)(f3 + f5), 0.0, 0.0, 0.0);
            } else if (n4 == 5) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", (double)(f + f4), (double)f2, (double)(f3 + f5), 0.0, 0.0, 0.0);
                class_13342.lllIIIllIIIIlllIlIIllIIll("flame", (double)(f + f4), (double)f2, (double)(f3 + f5), 0.0, 0.0, 0.0);
            } else if (n4 == 2) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", (double)(f + f5), (double)f2, (double)(f3 - f4), 0.0, 0.0, 0.0);
                class_13342.lllIIIllIIIIlllIlIIllIIll("flame", (double)(f + f5), (double)f2, (double)(f3 - f4), 0.0, 0.0, 0.0);
            } else if (n4 == 3) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", (double)(f + f5), (double)f2, (double)(f3 + f4), 0.0, 0.0, 0.0);
                class_13342.lllIIIllIIIIlllIlIIllIIll("flame", (double)(f + f5), (double)f2, (double)(f3 + f4), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_1587 class_15872 = (class_1587)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_15872 != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_15872);
        }
        return true;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(boolean bl, class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        llIlllIIllIlllIlIlIlIIIll = true;
        if (bl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.llllIlIIllIIlllllIIllIIll);
        } else {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.furnace);
        }
        llIlllIIllIlllIlIlIlIIIll = false;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
        if (class_17742 != null) {
            class_17742.lIIIIlIlIIlllllIIllIIlIII();
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_17742);
        }
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_1587();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3;
        if (n4 == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 2, 2);
        }
        if (n4 == 1) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 5, 2);
        }
        if (n4 == 2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 3, 2);
        }
        if (n4 == 3) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 4, 2);
        }
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            ((class_1587)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        class_1587 class_15872;
        if (!llIlllIIllIlllIlIlIlIIIll && (class_15872 = (class_1587)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) != null) {
            for (int i = 0; i < class_15872.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = class_15872.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                float f = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                float f2 = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                float f3 = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                    int n5 = this.llllllIlIllllIlIlIlIIIIlI.nextInt(21) + 10;
                    if (n5 > class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                        n5 = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    }
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl -= n5;
                    class_1781 class_17812 = new class_1781(class_13342, (float)n + f, (float)n2 + f2, (float)n3 + f3, new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll(), n5, class_08972.IllIIIllIIIIlIlIlIllIIlll()));
                    if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                        class_17812.lIlllIlllIIIIlIIlllIllIII().lIlllIlllIIIIlIIlllIllIII((class_0775)class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl());
                    }
                    float f4 = 0.05f;
                    class_17812.IIIIIIIIlIllIIllIIlllIllI = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4;
                    class_17812.IIlIIlIlIlIllIIlIlIIIIlll = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4 + 0.2f;
                    class_17812.llIIIlllIlllIlIllIIIIllIl = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(class_17812);
                }
            }
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3, class_05492);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return class_1071.lllIlIIlIIIlIlIIIllIlllIl((class_0850)((Object)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)));
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.getItemFromBlock(Blocks.furnace);
    }
}

