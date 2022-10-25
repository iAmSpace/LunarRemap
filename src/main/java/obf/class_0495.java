package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_0495
extends class_2257 {
    private IIcon llllllIlIllllIlIlIlIIIIlI;
    private IIcon lIlIIllllIlIIIIllIIIIlIIl;

    protected class_0495() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
        this.IlIllllllIIlIIllllIIlIIIl(0);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, random);
        for (int i = n - 2; i <= n + 2; ++i) {
            block1: for (int j = n3 - 2; j <= n3 + 2; ++j) {
                if (i > n - 2 && i < n + 2 && j == n3 - 1) {
                    j = n3 + 2;
                }
                if (random.nextInt(16) != 0) continue;
                for (int k = n2; k <= n2 + 1; ++k) {
                    if (class_13342.a_(i, k, j) != Blocks.bookshelf) continue;
                    if (!class_13342.lIlllIlllIIIIlIIlllIllIII((i - n) / 2 + n, k, (j - n3) / 2 + n3)) continue block1;
                    class_13342.lllIIIllIIIIlllIlIIllIIll("enchantmenttable", (double)n + 0.5, (double)n2 + 2.0, (double)n3 + 0.5, (double)((float)(i - n) + random.nextFloat()) - 0.5, (double)((float)(k - n2) - random.nextFloat() - 1.0f), (double)((float)(j - n3) + random.nextFloat()) - 0.5);
                }
            }
        }
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 0 ? this.lIlIIllllIlIIIIllIIIIlIIl : (n == 1 ? this.llllllIlIllllIlIlIlIIIIlI : this.llIIIIllIIIIIIIlIIIlIIIIl);
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_2014();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_2014 class_20142 = (class_2014)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_20142.IlIIIIIllllllIIlllIllllll() ? class_20142.lllIIIllIIIIlllIlIIllIIll() : null);
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19652, class_08972);
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            ((class_2014)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_bottom");
    }
}

