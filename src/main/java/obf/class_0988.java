package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0988
extends Item {
    public class_0988() {
        this.lIlllIlllIIIIlIIlllIllIII = 16;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)class_08142, "random.bow", 0.5f, 0.4f / (IlIllllllIIlIIllllIIlIIIl.nextFloat() * 0.4f + 0.8f));
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(new class_0333(class_13342, class_08142));
        }
        return class_08972;
    }
}

