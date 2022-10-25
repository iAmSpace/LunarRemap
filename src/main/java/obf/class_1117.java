package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1117
extends Block {
    public class_1117(class_1855 class_18552) {
        super(class_18552);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, Random random) {
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(random) + random.nextInt(n + 1), 1, 4);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 2 + random.nextInt(3);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.IIIIIIlIIIIIIIIIIlIlIlIlI;
    }

    @Override
    public class_1662 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return class_1662.lIlllIlllIIIIlIIlllIllIII;
    }
}

