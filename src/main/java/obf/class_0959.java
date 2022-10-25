package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_0959
extends Block {
    public class_0959() {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n != 1 && n != 0 ? super.lllIIIllIIIIlllIlIIllIIll(n, n2) : Blocks.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(n);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 3;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.book;
    }
}

