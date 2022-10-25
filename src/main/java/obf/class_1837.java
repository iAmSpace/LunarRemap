package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1837
extends class_1071 {
    private class_1646 lllIIIllIIIIlllIlIIllIIll;

    public class_1837(class_0850 class_08502, class_1646 class_16462) {
        int n;
        int n2;
        this.lllIIIllIIIIlllIlIIllIIll = class_16462;
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 3; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_16462, n + n2 * 3, 62 + n * 18, 17 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08502, n + n2 * 9 + 9, 8 + n * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08502, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        ItemStack class_08972 = null;
        class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
            ItemStack class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
            class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
            if (n < 9 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 9, 45, true) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0, 9, false)) {
                return null;
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                class_12912.lllIlIIlIIIlIlIIIllIlllIl(null);
            } else {
                class_12912.IlIllllllIIlIIllllIIlIIIl();
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                return null;
            }
            class_12912.lllIIIllIIIIlllIlIIllIIll(class_08142, class_08973);
        }
        return class_08972;
    }
}

