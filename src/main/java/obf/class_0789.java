package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0789
extends Item {
    public class_0789() {
        this.lllIlIIlIIIlIlIIIllIlllIl(1);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_08142.lllIIIllIIIIlllIlIIllIIll(class_08972);
        return class_08972;
    }

    @Override
    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return true;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        if (class_07752 == null) {
            return false;
        }
        if (!class_07752.lllIlIIlIIIlIlIIIllIlllIl("pages", 9)) {
            return false;
        }
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("pages", 8);
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            String string = class_21452.lIllllIIlIIIlIllllllIIIll(i);
            if (string == null) {
                return false;
            }
            if (string.length() <= 256) continue;
            return false;
        }
        return true;
    }
}

