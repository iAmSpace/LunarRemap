package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0397
extends Item {
    private final Class IIIllIllIIlIlIlIlIllllIIl;

    public class_0397(Class class_) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 == 0) {
            return false;
        }
        if (n4 == 1) {
            return false;
        }
        int n5 = class_1632.IlIIIIIllllllIIlllIllllll[n4];
        class_1309 class_13092 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n5);
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        if (class_13092 != null && class_13092.IlIllllllIIlIIllllIIlIIIl()) {
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(class_13092);
            }
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return true;
    }

    private class_1309 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return this.IIIllIllIIlIlIlIlIllllIIl == class_0146.class ? new class_0146(class_13342, n, n2, n3, n4) : (this.IIIllIllIIlIlIlIlIllllIIl == class_1094.class ? new class_1094(class_13342, n, n2, n3, n4) : null);
    }
}

