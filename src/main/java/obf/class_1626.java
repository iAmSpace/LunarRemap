package obf;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1626
extends Item {
    private Block IIIllIllIIlIlIlIlIllllIIl;
    private Block IllIIIllIIIIlIlIlIllIIlll;

    public class_1626(Block class_05492, Block class_05493) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_05492;
        this.IllIIIllIIIIlIlIlIllIIlll = class_05493;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 != 1) {
            return false;
        }
        if (class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972) && class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, n4, class_08972)) {
            if (class_13342.a_(n, n2, n3) == this.IllIIIllIIIIlIlIlIllIIlll && class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, this.IIIllIllIIlIlIlIlIllllIIl);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                return true;
            }
            return false;
        }
        return false;
    }
}

