package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1568
extends Item {
    public class_1568() {
        this.lllIlIIlIIIlIlIIIllIlllIl(1);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_08142.IlIIllIIIlIlIlIIlIlIllIIl();
        }
        return class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0 ? new ItemStack(Items.bucket) : class_08972;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(ItemStack class_08972) {
        return 32;
    }

    @Override
    public class_1484 IlIIIIIllllllIIlllIllllll(ItemStack class_08972) {
        return class_1484.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_08142.IlIllllllIIlIIllllIIlIIIl(class_08972, this.lIllllIIlIIIlIllllllIIIll(class_08972));
        return class_08972;
    }
}

