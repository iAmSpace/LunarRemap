package obf;

import net.minecraft.init.Items;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_0863
extends class_0926 {
    private final class_0926 lllIIIllIIIIlllIlIIllIIll = new class_0926();

    class_0863() {
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        class_1057 class_10572 = (class_1057)class_08972.lllIIIllIIIIlllIlIIllIIll();
        int n = class_17282.IlIIIIIllllllIIlllIllllll();
        int n2 = class_17282.lIllllIIlIIIlIllllllIIIll();
        int n3 = class_17282.IIIllIIlIIIIIIlIlIIllIIlI();
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        if (class_10572.lllIIIllIIIIlllIlIIllIIll(class_17282.lllIIIllIIIIlllIlIIllIIll(), n + class_11882.lllIIIllIIIIlllIlIIllIIll(), n2 + class_11882.lllIlIIlIIIlIlIIIllIlllIl(), n3 + class_11882.IlIllllllIIlIIllllIIlIIIl())) {
            class_08972.lllIIIllIIIIlllIlIIllIIll(Items.bucket);
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = 1;
            return class_08972;
        }
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17282, class_08972);
    }
}

