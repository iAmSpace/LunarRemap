package obf;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1003
extends Item {
    public class_1003() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        if (n4 != 1) {
            return false;
        }
        ++n2;
        class_0736 class_07362 = (class_0736) Blocks.IllIIIIllIIllIllIlllIlIIl;
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_08142.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3;
        int n6 = 0;
        int n7 = 0;
        if (n5 == 0) {
            n7 = 1;
        }
        if (n5 == 1) {
            n6 = -1;
        }
        if (n5 == 2) {
            n7 = -1;
        }
        if (n5 == 3) {
            n6 = 1;
        }
        if (class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972) && class_08142.lllIIIllIIIIlllIlIIllIIll(n + n6, n2, n3 + n7, n4, class_08972)) {
            if (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3) && class_13342.lIlllIlllIIIIlIIlllIllIII(n + n6, n2, n3 + n7) && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n + n6, n2 - 1, n3 + n7)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_07362, n5, 3);
                if (class_13342.a_(n, n2, n3) == class_07362) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n + n6, n2, n3 + n7, class_07362, n5 + 8, 3);
                }
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                return true;
            }
            return false;
        }
        return false;
    }
}

