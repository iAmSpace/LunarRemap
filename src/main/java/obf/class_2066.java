package obf;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_2066
extends class_0926 {
    private final class_0926 lllIIIllIIIIlllIlIIllIIll = new class_0926();

    class_2066() {
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
        Block class_05492 = class_13342.a_(n3, n2 = class_17282.lIllllIIlIIIlIllllllIIIll() + class_11882.lllIlIIlIIIlIlIIIllIlllIl(), n = class_17282.IIIllIIlIIIIIIlIlIIllIIlI() + class_11882.IlIllllllIIlIIllllIIlIIIl());
        if (class_0609.IlIllllllIIlIIllllIIlIIIl(class_05492)) {
            d = 0.0;
        } else {
            if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll || !class_0609.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n3, n2 - 1, n))) {
                return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17282, class_08972);
            }
            d = -1.0;
        }
        class_1860 class_18602 = class_1860.lllIIIllIIIIlllIlIIllIIll(class_13342, d2, d3 + d, d4, ((class_0341)class_08972.lllIIIllIIIIlllIlIIllIIll()).IIIllIllIIlIlIlIlIllllIIl);
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            class_18602.lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(class_18602);
        class_08972.lllIIIllIIIIlllIlIIllIIll(1);
        return class_08972;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282) {
        class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(1000, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), 0);
    }
}

