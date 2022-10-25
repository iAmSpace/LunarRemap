package obf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0755
extends class_1949 {
    private Block IllIIIllIIIIlIlIlIllIIlll;
    private Block lIIIIlIlIIlllllIIllIIlIII;

    public class_0755(int n, float f, Block class_05492, Block class_05493) {
        super(n, f, false);
        this.IllIIIllIIIIlIlIlIllIIlll = class_05492;
        this.lIIIIlIlIIlllllIIllIIlIII = class_05493;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 != 1) {
            return false;
        }
        if (class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972) && class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, n4, class_08972)) {
            if (class_13342.a_(n, n2, n3) == this.lIIIIlIlIIlllllIIllIIlIII && class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, this.IllIIIllIIIIlIlIlIllIIlll);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                return true;
            }
            return false;
        }
        return false;
    }
}

