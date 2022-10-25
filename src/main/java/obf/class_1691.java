package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_1691
extends class_0926 {
    class_1691() {
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        double d = class_17282.lllIlIIlIIIlIlIIIllIlllIl() + (double)class_11882.lllIIIllIIIIlllIlIIllIIll();
        double d2 = (float)class_17282.lIllllIIlIIIlIllllllIIIll() + 0.2f;
        double d3 = class_17282.lIlllIlllIIIIlIIlllIllIII() + (double)class_11882.IlIllllllIIlIIllllIIlIIIl();
        class_1521 class_15212 = class_2126.lllIIIllIIIIlllIlIIllIIll(class_17282.lllIIIllIIIIlllIlIIllIIll(), class_08972.IllIIIllIIIIlIlIlIllIIlll(), d, d2, d3);
        if (class_15212 instanceof class_1965 && class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            ((class_0339)class_15212).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
        class_08972.lllIIIllIIIIlllIlIIllIIll(1);
        return class_08972;
    }
}

