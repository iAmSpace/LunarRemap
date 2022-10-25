package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_1805
extends class_0926 {
    private final class_0926 lllIIIllIIIIlllIlIIllIIll = new class_0926();

    class_1805() {
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        double d;
        int n;
        int n2;
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        class_1334 class_13342 = class_17282.lllIIIllIIIIlllIlIIllIIll();
        double d2 = class_17282.lllIlIIlIIIlIlIIIllIlllIl() + (double)((float)class_11882.lllIIIllIIIIlllIlIIllIIll() * 1.125f);
        double d3 = class_17282.IlIllllllIIlIIllllIIlIIIl() + (double)((float)class_11882.lllIlIIlIIIlIlIIIllIlllIl() * 1.125f);
        double d4 = class_17282.lIlllIlllIIIIlIIlllIllIII() + (double)((float)class_11882.IlIllllllIIlIIllllIIlIIIl() * 1.125f);
        int n3 = class_17282.IlIIIIIllllllIIlllIllllll() + class_11882.lllIIIllIIIIlllIlIIllIIll();
        class_1855 class_18552 = class_13342.a_(n3, n2 = class_17282.lIllllIIlIIIlIllllllIIIll() + class_11882.lllIlIIlIIIlIlIIIllIlllIl(), n = class_17282.IIIllIIlIIIIIIlIlIIllIIlI() + class_11882.IlIllllllIIlIIllllIIlIIIl()).lIllllIIlIIIlIllllllIIIll();
        if (class_1855.IllIIlllllllIIlIIlIIIIlIl.equals(class_18552)) {
            d = 1.0;
        } else {
            if (!class_1855.lllIIIllIIIIlllIlIIllIIll.equals(class_18552) || !class_1855.IllIIlllllllIIlIIlIIIIlIl.equals(class_13342.a_(n3, n2 - 1, n).lIllllIIlIIIlIllllllIIIll())) {
                return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17282, class_08972);
            }
            d = 0.0;
        }
        class_2263 class_22632 = new class_2263(class_13342, d2, d3 + d, d4);
        class_13342.lllIIIllIIIIlllIlIIllIIll(class_22632);
        class_08972.lllIIIllIIIIlllIlIIllIIll(1);
        return class_08972;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282) {
        class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(1000, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), 0);
    }
}

