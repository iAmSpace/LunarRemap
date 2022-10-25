package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0888
extends class_2062 {
    public class_0888(Block class_05492, Block class_05493) {
        super(class_05492, class_05493);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        int n5;
        int n6;
        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            return false;
        }
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492 == Blocks.lIIllIIlIIIlllIlllIIlIIlI && (n6 = (n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) & 7) <= 6 && class_13342.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3)) && class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n6 + 1 | n5 & 0xFFFFFFF8, 2)) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.lllIlIIlIIIlIlIIIllIlllIl(), (this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f) / 2.0f, this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() * 0.8f);
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            return true;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142, class_13342, n, n2, n3, n4, f, f2, f3);
    }
}

