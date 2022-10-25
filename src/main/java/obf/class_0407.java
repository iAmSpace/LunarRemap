package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0407
extends class_1749 {
    private class_1314 lllIIIllIIIIlllIlIIllIIll;

    public class_0407() {
        super("container.enderchest", false, 27);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1314 class_13142) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13142;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2145 class_21452) {
        int n;
        for (n = 0; n < this.IlIIIIIllllllIIlllIllllll(); ++n) {
            this.lllIlIIlIIIlIlIIIllIlllIl(n, null);
        }
        for (n = 0; n < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++n) {
            class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(n);
            int n2 = class_07752.lIlllIlllIIIIlIIlllIllIII("Slot") & 0xFF;
            if (n2 < 0 || n2 >= this.IlIIIIIllllllIIlllIllllll()) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl(n2, ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07752));
        }
    }

    public class_2145 lllIIIllIIIIlllIlIIllIIll() {
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll(); ++i) {
            ItemStack class_08972 = this.llIIllIllIlIIlIIllIllllll(i);
            if (class_08972 == null) continue;
            class_0775 class_07752 = new class_0775();
            class_07752.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)i);
            class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07752);
        }
        return class_21452;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll != null && !this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_08142) ? false : super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
        }
        super.llIllllIlIllIIIlIllIIlIlI();
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
        }
        super.lIlllIlllIlIIIIlllIlIlIIl();
        this.lllIIIllIIIIlllIlIIllIIll = null;
    }
}

