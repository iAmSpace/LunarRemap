package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0498
extends class_2033 {
    public class_0498(Block class_05492) {
        super(class_05492, false);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_1112 class_11122 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, true);
        if (class_11122 == null) {
            return class_08972;
        }
        if (class_11122.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl) {
            int n = class_11122.lllIlIIlIIIlIlIIIllIlllIl;
            int n2 = class_11122.IlIllllllIIlIIllllIIlIIIl;
            int n3 = class_11122.lIlllIlllIIIIlIIlllIllIII;
            if (!class_13342.lllIIIllIIIIlllIlIIllIIll(class_08142, n, n2, n3)) {
                return class_08972;
            }
            if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_11122.IlIIIIIllllllIIlllIllllll, class_08972)) {
                return class_08972;
            }
            if (class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, Blocks.IlIIIIIIIIIIlIIlllIIIlIlI);
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                }
            }
        }
        return class_08972;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        return Blocks.IlIIIIIIIIIIlIIlllIIIlIlI.lIllllIIlIIIlIllllllIIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll());
    }
}

