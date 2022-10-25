package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0657
extends Item {
    public class_0657() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1965 class_19652) {
        if (!class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            return false;
        }
        if (class_19652 instanceof class_0339) {
            class_0339 class_03392 = (class_0339)class_19652;
            class_03392.lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
            class_03392.IIIIIlllIIllllIlllIlllIIl();
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            return true;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142, class_19652);
    }
}

