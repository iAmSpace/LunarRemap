package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1181
extends Block {
    protected class_1181() {
        super(class_1855.lIlllIlllIlIIIIlllIlIlIIl);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.snowball;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 4;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (class_13342.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3) > 11) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }
}

