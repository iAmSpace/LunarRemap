package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1410
extends class_1071 {
    private class_0396 lllIIIllIIIIlllIlIIllIIll;
    private final class_0680 lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;

    public class_1410(class_0503 class_05032, class_0396 class_03962) {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll = class_03962;
        this.lIllllIIlIIIlIllllllIIIll = new class_0680(this, class_03962, 0, 136, 110);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll);
        int n2 = 36;
        int n3 = 137;
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, i + n * 9 + 9, n2 + i * 18, n3 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n, n2 + n * 18, 58 + n3));
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_03962.IlIlIIlIlIllIIlIlIIllIIIl();
        this.IllIIlllllllIIlIIlIIIIlIl = class_03962.lllIIlIIIllllllIIIIlIlIlI();
        this.IIIllIllIIlIlIlIlIllllIIl = class_03962.IlIlllIIIIIIlIIllIIllIlll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1283 class_12832) {
        super.lllIIIllIIIIlllIlIIllIIll(class_12832);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 0, this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 1, this.IllIIlllllllIIlIIlIIIIlIl);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 2, this.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n2);
        }
        if (n == 1) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n2);
        }
        if (n == 2) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n2);
        }
    }

    public class_0396 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
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
            if (n == 0) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08973, 1, 37, true)) {
                    return null;
                }
                class_12912.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972);
            } else if (!this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl() && this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_08973) && class_08973.lllIlIIlIIIlIlIIIllIlllIl == 1 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0, 1, false) : (n >= 1 && n < 28 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 28, 37, false) : (n >= 28 && n < 37 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 1, 28, false) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 1, 37, false)))) {
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

