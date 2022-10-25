package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1342
extends class_0113 {
    public static final double[] lIlIIllllIlIIIIllIIIIlIIl = new double[]{-0.0625, 0.0625, 0.1875, 0.3125};
    private static final int[] llIlllIIllIlllIlIlIlIIIll = new int[]{1, 2, 3, 4};

    protected class_1342(boolean bl) {
        super(bl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n6 = (n5 & 0xC) >> 2;
        n6 = n6 + 1 << 2 & 0xC;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n6 | n5 & 3, 3);
        return true;
    }

    @Override
    protected int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return llIlllIIllIlllIlIlIlIIIll[(n & 0xC) >> 2] * 2;
    }

    @Override
    protected class_0113 llIlllIIllIlllIlIlIlIIIll() {
        return Blocks.llllIIIlIlIlIlIIlIIIIIlIl;
    }

    @Override
    protected class_0113 IIIIlIIlIIIllIIIIllIIIlII() {
        return Blocks.IIIlllIlIIllIIlIlIllIlIIl;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.lIIllIlIllIlIlIIlIlIIIIll;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.lIIllIlIllIlIlIIlIlIIIIll;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 15;
    }

    @Override
    public boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return this.IllIIlllllllIIlIIlIIIIlIl(class_18432, n, n2, n3, n4) > 0;
    }

    @Override
    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_1342.lIlllIlllIIIIlIIlllIllIII(class_05492);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            int n5 = class_1342.IllIIIllIIIIlIlIlIllIIlll(n4);
            double d = (double)((float)n + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d2 = (double)((float)n2 + 0.4f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d3 = (double)((float)n3 + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d4 = 0.0;
            double d5 = 0.0;
            if (random.nextInt(2) == 0) {
                switch (n5) {
                    case 0: {
                        d5 = -0.3125;
                        break;
                    }
                    case 1: {
                        d4 = 0.3125;
                        break;
                    }
                    case 2: {
                        d5 = 0.3125;
                        break;
                    }
                    case 3: {
                        d4 = -0.3125;
                    }
                }
            } else {
                int n6 = (n4 & 0xC) >> 2;
                switch (n5) {
                    case 0: {
                        d5 = lIlIIllllIlIIIIllIIIIlIIl[n6];
                        break;
                    }
                    case 1: {
                        d4 = -lIlIIllllIlIIIIllIIIIlIIl[n6];
                        break;
                    }
                    case 2: {
                        d5 = -lIlIIllllIlIIIIllIIIIlIIl[n6];
                        break;
                    }
                    case 3: {
                        d4 = lIlIIllllIlIIIIllIIIIlIIl[n6];
                    }
                }
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll("reddust", d + d4, d2, d3 + d5, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }
}

