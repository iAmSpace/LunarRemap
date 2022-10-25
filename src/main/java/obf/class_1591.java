package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
final class class_1591
extends class_0926 {
    private boolean lllIIIllIIIIlllIlIIllIIll = true;

    class_1591() {
    }

    @Override
    protected ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        if (class_08972.IllIIIllIIIIlIlIlIllIIlll() == 15) {
            int n;
            int n2;
            int n3;
            class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
            class_1334 class_13342 = class_17282.lllIIIllIIIIlllIlIIllIIll();
            if (class_1908.lllIIIllIIIIlllIlIIllIIll(class_08972, class_13342, n3 = class_17282.IlIIIIIllllllIIlllIllllll() + class_11882.lllIIIllIIIIlllIlIIllIIll(), n2 = class_17282.lIllllIIlIIIlIllllllIIIll() + class_11882.lllIlIIlIIIlIlIIIllIlllIl(), n = class_17282.IIIllIIlIIIIIIlIlIIllIIlI() + class_11882.IlIllllllIIlIIllllIIlIIIl())) {
                if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                    class_13342.IlIllllllIIlIIllllIIlIIIl(2005, n3, n2, n, 0);
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll = false;
            }
            return class_08972;
        }
        return super.lllIlIIlIIIlIlIIIllIlllIl(class_17282, class_08972);
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

