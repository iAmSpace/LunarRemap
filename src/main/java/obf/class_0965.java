package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0965
extends class_1071 {
    private class_0850 lllIIIllIIIIlllIlIIllIIll;
    private int lIllllIIlIIIlIllllllIIIll;

    public class_0965(class_0850 class_08502, class_0850 class_08503) {
        int n;
        int n2;
        this.lllIIIllIIIIlllIlIIllIIll = class_08503;
        this.lIllllIIlIIIlIllllllIIIll = class_08503.IlIIIIIllllllIIlllIllllll() / 9;
        class_08503.llIllllIlIllIIIlIllIIlIlI();
        int n3 = (this.lIllllIIlIIIlIllllllIIIll - 4) * 18;
        for (n2 = 0; n2 < this.lIllllIIlIIIlIllllllIIIll; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08503, n + n2 * 9, 8 + n * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08502, n + n2 * 9 + 9, 8 + n * 18, 103 + n2 * 18 + n3));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_08502, n2, 8 + n2 * 18, 161 + n3));
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
            if (n < this.lIllllIIlIIIlIllllllIIIll * 9 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, this.lIllllIIlIIIlIllllllIIIll * 9, this.IlIllllllIIlIIllllIIlIIIl.size(), true) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0, this.lIllllIIlIIIlIllllllIIIll * 9, false)) {
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

    public class_0850 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

