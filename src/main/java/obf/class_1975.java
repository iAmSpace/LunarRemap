package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class class_1975
extends class_1988 {
    protected class_2102[] llllllIlIllllIlIlIlIIIIlI;
    protected class_2102[] lIlIIllllIlIIIIllIIIIlIIl;

    public class_1975() {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
        this.IlIllllllIIlIIllllIIlIIIl(2.0f);
        this.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII);
    }

    public static int IIIllIllIIlIlIlIlIllllIIl(int n) {
        return n & 3;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 1;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        int n5 = 4;
        int n6 = n5 + 1;
        if (class_13342.lllIlIIlIIIlIlIIIllIlllIl(n - n6, n2 - n6, n3 - n6, n + n6, n2 + n6, n3 + n6)) {
            for (int i = -n5; i <= n5; ++i) {
                for (int j = -n5; j <= n5; ++j) {
                    for (int k = -n5; k <= n5; ++k) {
                        int n7;
                        if (class_13342.a_(n + i, n2 + j, n3 + k).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll || ((n7 = class_13342.IlIllllllIIlIIllllIIlIIIl(n + i, n2 + j, n3 + k)) & 8) != 0) continue;
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + i, n2 + j, n3 + k, n7 | 8, 4);
                    }
                }
            }
        }
    }

    @Override
    protected class_2102 IllIIlllllllIIlIIlIIIIlIl(int n) {
        return this.llllllIlIllllIlIlIlIIIIlI[n % this.llllllIlIllllIlIlIlIIIIlI.length];
    }

    @Override
    protected class_2102 IllIIIllIIIIlIlIlIllIIlll(int n) {
        return this.lIlIIllllIlIIIIllIIIIlIIl[n % this.lIlIIllllIlIIIIllIIIIlIIl.length];
    }
}

