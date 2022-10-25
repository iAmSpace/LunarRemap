package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0341
extends Item {
    private static final class_1677 IllIIIllIIIIlIlIlIllIIlll = new class_2066();
    public int IIIllIllIIlIlIlIlIllllIIl;

    public class_0341(int n) {
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIIIIIllllllIIlllIllllll);
        BlockDispenser.dispenseBehaviorRegistry.putObject(this, IllIIIllIIIIlIlIlIllIIlll);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (class_0609.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2, n3))) {
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                class_1860 class_18602 = class_1860.lllIIIllIIIIlllIlIIllIIll(class_13342, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, this.IIIllIllIIlIlIlIlIllllIIl);
                if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
                    class_18602.lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
                }
                class_13342.lllIIIllIIIIlllIlIIllIIll(class_18602);
            }
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            return true;
        }
        return false;
    }
}

