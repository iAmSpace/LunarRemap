package obf;

import net.minecraft.init.Items;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_0911
extends class_0926 {
    private final class_0926 lllIIIllIIIIlllIlIIllIIll = new class_0926();

    class_0911() {
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        Item class_06112;
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        class_1334 class_13342 = class_17282.lllIIIllIIIIlllIlIIllIIll();
        int n = class_17282.IlIIIIIllllllIIlllIllllll() + class_11882.lllIIIllIIIIlllIlIIllIIll();
        int n2 = class_17282.lIllllIIlIIIlIllllllIIIll() + class_11882.lllIlIIlIIIlIlIIIllIlllIl();
        int n3 = class_17282.IIIllIIlIIIIIIlIlIIllIIlI() + class_11882.IlIllllllIIlIIllllIIlIIIl();
        class_1855 class_18552 = class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll();
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_1855.IllIIlllllllIIlIIlIIIIlIl.equals(class_18552) && n4 == 0) {
            class_06112 = Items.water_bucket;
        } else {
            if (!class_1855.IIIllIllIIlIlIlIlIllllIIl.equals(class_18552) || n4 != 0) {
                return super.lllIlIIlIIIlIlIIIllIlllIl(class_17282, class_08972);
            }
            class_06112 = Items.lava_bucket;
        }
        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        if (--class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            class_08972.lllIIIllIIIIlllIlIIllIIll(class_06112);
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = 1;
        } else if (((class_1646)class_17282.IIIllIllIIlIlIlIlIllllIIl()).lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_06112)) < 0) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17282, new ItemStack(class_06112));
        }
        return class_08972;
    }
}

