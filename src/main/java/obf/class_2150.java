package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_2150
extends class_0926 {
    class_2150() {
    }

    @Override
    protected ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        class_1334 class_13342 = class_17282.lllIIIllIIIIlllIlIIllIIll();
        int n = class_17282.IlIIIIIllllllIIlllIllllll() + class_11882.lllIIIllIIIIlllIlIIllIIll();
        int n2 = class_17282.lIllllIIlIIIlIllllllIIIll() + class_11882.lllIlIIlIIIlIlIIIllIlllIl();
        int n3 = class_17282.IIIllIIlIIIIIIlIlIIllIIlI() + class_11882.IlIllllllIIlIIllllIIlIIIl();
        class_0034 class_00342 = new class_0034(class_13342, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, null);
        class_13342.lllIIIllIIIIlllIlIIllIIll(class_00342);
        --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        return class_08972;
    }
}

