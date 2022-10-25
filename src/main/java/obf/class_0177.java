package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0177
extends class_1071 {
    private class_0647 lllIIIllIIIIlllIlIIllIIll;
    private final class_1291 lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0177(class_0503 class_05032, class_0647 class_06472) {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll = class_06472;
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_0420(class_05032.lIlllIlllIIIIlIIlllIllIII, class_06472, 0, 56, 46));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_0420(class_05032.lIlllIlllIIIIlIIlllIllIII, class_06472, 1, 79, 53));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_0420(class_05032.lIlllIlllIIIIlIIlllIllIII, class_06472, 2, 102, 46));
        this.lIllllIIlIIIlIllllllIIIll = this.lllIlIIlIIIlIlIIIllIlllIl(new class_1479(this, class_06472, 3, 79, 17));
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, i + n * 9 + 9, 8 + i * 18, 84 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n, 8 + n * 18, 142));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1283 class_12832) {
        super.lllIIIllIIIIlllIlIIllIIll(class_12832);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 0, this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            class_1283 class_12832 = (class_1283)this.IlIIIIIllllllIIlllIllllll.get(i);
            if (this.IIIllIIlIIIIIIlIlIIllIIlI == this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll()) continue;
            class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 0, this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll());
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n2);
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
            if ((n < 0 || n > 2) && n != 3) {
                if (!this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl() && this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_08973) ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 4, false) : (class_0420.IlIllllllIIlIIllllIIlIIIl(class_08972) ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0, 3, false) : (n >= 4 && n < 31 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 31, 40, false) : (n >= 31 && n < 40 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 4, 31, false) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 4, 40, false))))) {
                    return null;
                }
            } else {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08973, 4, 40, true)) {
                    return null;
                }
                class_12912.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972);
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

