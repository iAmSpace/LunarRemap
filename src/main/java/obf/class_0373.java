package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;

import java.util.List;
import java.util.Random;

public class class_0373
extends class_0854
implements class_0588 {
    private static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"deadbush", "tallgrass", "fern"};
    private class_2102[] lIlIIllllIlIIIIllIIIIlIIl;

    protected class_0373() {
        super(class_1855.llIIlllIllIllllIIIlIIIIII);
        float f = 0.4f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.8f, 0.5f + f);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n2 >= this.lIlIIllllIlIIIIllIIIIlIIl.length) {
            n2 = 0;
        }
        return this.lIlIIllllIlIIIIllIIIIlIIl[n2];
    }

    @Override
    public int llIIlIllIllllIlIIIIlIIlll() {
        double d = 0.5;
        double d2 = 1.0;
        return class_0614.lllIIIllIIIIlllIlIIllIIll(d, d2);
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2 - 1, n3));
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(int n) {
        return n == 0 ? 0xFFFFFF : class_0614.lllIIIllIIIIlllIlIIllIIll(0.5, 1.0);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return n4 == 0 ? 0xFFFFFF : class_18432.a_(n, n3).lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return random.nextInt(8) == 0 ? Items.llIlllIIllIlllIlIlIlIIIll : null;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, Random random) {
        return 1 + random.nextInt(n * 2 + 1);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n, int n2, int n3, int n4) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_08142.IllIlIlIIIlIllIlIlIIlllII() != null && class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIIllIIllIllIlllIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(this)], 1);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Blocks.IlIlIIlllIllllllllIIIlIlI, 1, n4));
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, n, n2, n3, n4);
        }
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 1; i < 3; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.lIlIIllllIlIIIIllIIIIlIIl = new class_2102[llllllIlIllllIlIlIlIIIIlI.length];
        for (int i = 0; i < this.lIlIIllllIlIIIIllIIIIlIIl.length; ++i) {
            this.lIlIIllllIlIIIIllIIIIlIIl[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(llllllIlIllllIlIlIlIIIIlI[i]);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return n4 != 0;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3) {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = 2;
        if (n4 == 2) {
            n5 = 3;
        }
        if (Blocks.IIIlIlIIlIIlIlIIIIIlIlIlI.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
            Blocks.IIIlIlIIlIIlIlIIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, n5, 2);
        }
    }
}

