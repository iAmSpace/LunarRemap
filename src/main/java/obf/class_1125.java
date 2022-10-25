package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;

import java.util.Random;

public class class_1125
extends class_0854 {
    protected class_1125() {
        super(class_1855.llIIlllIllIllllIIIlIIIIII);
        float f = 0.4f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.8f, 0.5f + f);
    }

    @Override
    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.llIIllIllIlIIlIIllIllllll || class_05492 == Blocks.IllIlIIllIIllIlIIlIllIlIl || class_05492 == Blocks.llllIIIllIllIIIllIlIIIIIl || class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n, int n2, int n3, int n4) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_08142.IllIlIlIIIlIllIlIlIIlllII() != null && class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIIllIIllIllIlllIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(this)], 1);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Blocks.llllIIIIlIIIlIIIIIIlIllll, 1, n4));
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, n, n2, n3, n4);
        }
    }
}

