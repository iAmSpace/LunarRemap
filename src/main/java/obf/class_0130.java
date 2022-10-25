package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_0130
extends Block {
    private boolean llllllIlIllllIlIlIlIIIIlI;

    public class_0130(boolean bl) {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(true);
        }
        this.llllllIlIllllIlIlIlIIIIlI = bl;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 30;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_15212);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        return super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142, n4, f, f2, f3);
    }

    private void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
        if (this == Blocks.lIIIlIIllIllIIlIIlIIIllII) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIlIllIIllIIIIlllIlIlllIl);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (this == Blocks.lIlIllIIllIIIIlllIlIlllIl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIIlIIllIllIIlIIlIIIllII);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.lIIIlIIllIllIIlIIlIIIllII;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, Random random) {
        return this.lllIIIllIIIIlllIlIIllIIll(random) + random.nextInt(n + 1);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 4 + random.nextInt(2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, n5);
        if (this.lllIIIllIIIIlllIlIIllIIll(n4, class_13342.lllllIlllIIllIlIIlIIIllII, n5) != Item.getItemFromBlock(this)) {
            int n6 = 1 + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(5);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, n6);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
        }
    }

    private void lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        Random random = class_13342.lllllIlllIIllIlIIlIIIllII;
        double d = 0.0625;
        for (int i = 0; i < 6; ++i) {
            double d2 = (float)n + random.nextFloat();
            double d3 = (float)n2 + random.nextFloat();
            double d4 = (float)n3 + random.nextFloat();
            if (i == 0 && !class_13342.a_(n, n2 + 1, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                d3 = (double)(n2 + 1) + d;
            }
            if (i == 1 && !class_13342.a_(n, n2 - 1, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                d3 = (double)(n2 + 0) - d;
            }
            if (i == 2 && !class_13342.a_(n, n2, n3 + 1).IlIlllIIIIIIlIIllIIllIlll()) {
                d4 = (double)(n3 + 1) + d;
            }
            if (i == 3 && !class_13342.a_(n, n2, n3 - 1).IlIlllIIIIIIlIIllIIllIlll()) {
                d4 = (double)(n3 + 0) - d;
            }
            if (i == 4 && !class_13342.a_(n + 1, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                d2 = (double)(n + 1) + d;
            }
            if (i == 5 && !class_13342.a_(n - 1, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                d2 = (double)(n + 0) - d;
            }
            if (!(d2 < (double)n || d2 > (double)(n + 1) || d3 < 0.0 || d3 > (double)(n2 + 1) || d4 < (double)n3) && !(d4 > (double)(n3 + 1))) continue;
            class_13342.lllIIIllIIIIlllIlIIllIIll("reddust", d2, d3, d4, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return new ItemStack(Blocks.lIIIlIIllIllIIlIIlIIIllII);
    }
}

