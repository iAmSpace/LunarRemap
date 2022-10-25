package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0610
extends class_1071 {
    private class_1510 lllIIIllIIIIlllIlIIllIIll;
    private class_1086 lIllllIIlIIIlIllllllIIIll;
    private final class_1334 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0610(class_0503 class_05032, class_1510 class_15102, class_1334 class_13342) {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll = class_15102;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_13342;
        this.lIllllIIlIIIlIllllllIIIll = new class_1086(class_05032.lIlllIlllIIIIlIIlllIllIII, class_15102);
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(this.lIllllIIlIIIlIllllllIIIll, 0, 36, 53));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(this.lIllllIIlIIIlIllllllIIIll, 1, 62, 53));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1625(class_05032.lIlllIlllIIIIlIIlllIllIII, class_15102, this.lIllllIIlIIIlIllllllIIIll, 2, 120, 53));
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, i + n * 9 + 9, 8 + i * 18, 84 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n, 8 + n * 18, 142));
        }
    }

    public class_1086 lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1283 class_12832) {
        super.lllIIIllIIIIlllIlIIllIIll(class_12832);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll();
        super.lllIIIllIIIIlllIlIIllIIll(class_08502);
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll() == class_08142;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        ItemStack class_08972 = null;
        class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
            ItemStack class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
            class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
            if (n == 2) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 39, true)) {
                    return null;
                }
                class_12912.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972);
            } else if (n != 0 && n != 1 ? (n >= 3 && n < 30 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 30, 39, false) : n >= 30 && n < 39 && !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 30, false)) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 39, false)) {
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

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_08142);
        this.lllIIIllIIIIlllIlIIllIIll.a_(null);
        super.lllIlIIlIIIlIlIIIllIlllIl(class_08142);
        if (!this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIIllIIllIllIlllIlIIl) {
            ItemStack class_08972 = this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI(0);
            if (class_08972 != null) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(class_08972, false);
            }
            if ((class_08972 = this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI(1)) != null) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(class_08972, false);
            }
        }
    }
}

