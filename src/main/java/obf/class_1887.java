package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1887
extends Item {
    public class_1887() {
        this.lllIlIIlIIIlIlIIIllIlllIl(1);
        this.IlIIIIIllllllIIlllIllllll(238);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, Block class_05492, int n, int n2, int n3, class_1965 class_19652) {
        if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll && class_05492 != Blocks.IIIIlIllIlIIlIIlIllIlIlll && class_05492 != Blocks.IlIlIIlllIllllllllIIIlIlI && class_05492 != Blocks.lIIlIlllIIlIIIIlIlIIIIlll && class_05492 != Blocks.IIIllIIIlIlllllllIIIlllll) {
            return super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_13342, class_05492, n, n2, n3, class_19652);
        }
        class_08972.lllIIIllIIIIlllIlIIllIIll(1, class_19652);
        return true;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return class_05492 == Blocks.IIIIlIllIlIIlIIlIllIlIlll || class_05492 == Blocks.IlIIIlIllIIIllIIIIlIIlIll || class_05492 == Blocks.IIIllIIIlIlllllllIIIlllll;
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, Block class_05492) {
        return class_05492 != Blocks.IIIIlIllIlIIlIIlIllIlIlll && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll ? (class_05492 == Blocks.llllllIlIllllIlIlIlIIIIlI ? 5.0f : super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_05492)) : 15.0f;
    }
}

