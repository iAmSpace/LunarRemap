package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1809
extends Item {
    public class_1809() {
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1965 class_19652) {
        if (class_19652 instanceof class_0161) {
            class_0161 class_01612 = (class_0161)class_19652;
            if (!class_01612.IIlIlIlIIlllIIIlIIIIlIIIl() && !class_01612.g_()) {
                class_01612.IIIllIllIIlIlIlIlIllllIIl(true);
                class_01612.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_01612, "mob.horse.leather", 0.5f, 1.0f);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1965 class_19652, class_1965 class_19653) {
        this.lllIIIllIIIIlllIlIIllIIll(class_08972, (class_0814)null, class_19652);
        return true;
    }
}

