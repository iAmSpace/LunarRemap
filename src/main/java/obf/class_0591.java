package obf;

import net.minecraft.init.Blocks;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_0591
extends class_0926 {
    private boolean lllIIIllIIIIlllIlIIllIIll = true;

    class_0591() {
    }

    @Override
    protected ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        int n;
        int n2;
        int n3;
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        class_1334 class_13342 = class_17282.lllIIIllIIIIlllIlIIllIIll();
        if (class_13342.lIlllIlllIIIIlIIlllIllIII(n3 = class_17282.IlIIIIIllllllIIlllIllllll() + class_11882.lllIIIllIIIIlllIlIIllIIll(), n2 = class_17282.lIllllIIlIIIlIllllllIIIll() + class_11882.lllIlIIlIIIlIlIIIllIlllIl(), n = class_17282.IIIllIIlIIIIIIlIlIIllIIlI() + class_11882.IlIllllllIIlIIllllIIlIIIl())) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, Blocks.lIIlIlllIllIlIlllIIIIIIII);
            if (class_08972.lllIIIllIIIIlllIlIIllIIll(1, class_13342.lllllIlllIIllIlIIlIIIllII)) {
                class_08972.lllIlIIlIIIlIlIIIllIlllIl = 0;
            }
        } else if (class_13342.a_(n3, n2, n) == Blocks.tnt) {
            Blocks.tnt.lllIIIllIIIIlllIlIIllIIll(class_13342, n3, n2, n, 1);
            class_13342.lIllllIIlIIIlIllllllIIIll(n3, n2, n);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll = false;
        }
        return class_08972;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282) {
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(1000, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), 0);
        } else {
            class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(1001, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), 0);
        }
    }
}

