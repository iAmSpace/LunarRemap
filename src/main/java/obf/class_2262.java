package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_2262
extends class_0926 {
    class_2262() {
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        double d = class_17282.lllIlIIlIIIlIlIIIllIlllIl() + (double)class_11882.lllIIIllIIIIlllIlIIllIIll();
        double d2 = (float)class_17282.lIllllIIlIIIlIllllllIIIll() + 0.2f;
        double d3 = class_17282.lIlllIlllIIIIlIIlllIllIII() + (double)class_11882.IlIllllllIIlIIllllIIlIIIl();
        class_1800 class_18002 = new class_1800(class_17282.lllIIIllIIIIlllIlIIllIIll(), d, d2, d3, class_08972);
        class_17282.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_18002);
        class_08972.lllIIIllIIIIlllIlIIllIIll(1);
        return class_08972;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282) {
        class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(1002, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), 0);
    }
}

