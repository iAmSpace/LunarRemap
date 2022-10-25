package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1387
extends class_1071 {
    private class_0850 lllIIIllIIIIlllIlIIllIIll;
    private class_1627 lIllllIIlIIIlIllllllIIIll;

    public class_1387(class_0850 class_08502, class_0850 class_08503, class_1627 class_16272) {
        int n;
        int n2;
        this.lllIIIllIIIIlllIlIIllIIll = class_08503;
        this.lIllllIIlIIIlIllllllIIIll = class_16272;
        int n3 = 3;
        class_08503.llIllllIlIllIIIlIllIIlIlI();
        int n4 = (n3 - 4) * 18;
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_0073(this, class_08503, 0, 8, 18));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_0228(this, class_08503, 1, 8, 36, class_16272));
        if (class_16272.IIllllllIIllIlIllllIIIlll()) {
            for (n2 = 0; n2 < n3; ++n2) {
                for (n = 0; n < 5; ++n) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08503, 2 + n + n2 * 5, 80 + n * 18, 18 + n2 * 18));
                }
            }
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08502, n + n2 * 9 + 9, 8 + n * 18, 102 + n2 * 18 + n4));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08502, n2, 8 + n2 * 18, 160 + n4));
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(class_08142) && this.lIllllIIlIIIlIllllllIIIll.IlllIIlllllllIIllIlIllllI() && this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII((class_1521)class_08142) < 8.0f;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        ItemStack class_08972 = null;
        class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
            ItemStack class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
            class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
            if (n < this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll() ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(), this.IlIllllllIIlIIllllIIlIIIl.size(), true) : (this.lllIIIllIIIIlllIlIIllIIll(1).lllIIIllIIIIlllIlIIllIIll(class_08973) && !this.lllIIIllIIIIlllIlIIllIIll(1).lllIlIIlIIIlIlIIIllIlllIl() ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 1, 2, false) : (this.lllIIIllIIIIlllIlIIllIIll(0).lllIIIllIIIIlllIlIIllIIll(class_08973) ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0, 1, false) : this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll() <= 2 || !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 2, this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(), false)))) {
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

