package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0080
extends class_1071 {
    private final class_0850 lllIIIllIIIIlllIlIIllIIll;

    public class_0080(class_0503 class_05032, class_0850 class_08502) {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll = class_08502;
        class_08502.llIllllIlIllIIIlIllIIlIlI();
        int n2 = 51;
        for (n = 0; n < class_08502.IlIIIIIllllllIIlllIllllll(); ++n) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08502, n, 44 + n * 18, 20));
        }
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, i + n * 9 + 9, 8 + i * 18, n * 18 + n2));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n, 8 + n * 18, 58 + n2));
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
            if (n < this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll() ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(), this.IlIllllllIIlIIllllIIlIIIl.size(), true) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0, this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(), false)) {
                return null;
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                class_12912.lllIlIIlIIIlIlIIIllIlllIl(null);
            } else {
                class_12912.IlIllllllIIlIIllllIIlIIIl();
            }
        }
        return class_08972;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_08142);
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl();
    }
}

