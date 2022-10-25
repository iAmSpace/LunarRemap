package obf;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0144
extends Item {
    public class_0144() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (class_13342.a_(n, n2, n3) != Blocks.lIIllIIlIIIlllIlllIIlIIlI) {
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
            if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
                return false;
            }
        }
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        if (Blocks.IlIIIlIllIIIllIIIIlIIlIll.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IlIIIlIllIIIllIIIIlIIlIll);
        }
        return true;
    }
}

