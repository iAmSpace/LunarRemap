package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1370
extends class_1071 {
    private class_1587 lllIIIllIIIIlllIlIIllIIll;
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;

    public class_1370(class_0503 class_05032, class_1587 class_15872) {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll = class_15872;
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_15872, 0, 56, 17));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_15872, 1, 56, 53));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1628(class_05032.lIlllIlllIIIIlIIlllIllIII, class_15872, 2, 116, 35));
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
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 0, this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 1, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 2, this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            class_1283 class_12832 = (class_1283)this.IlIIIIIllllllIIlllIllllll.get(i);
            if (this.lIllllIIlIIIlIllllllIIIll != this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll) {
                class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 0, this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll);
            }
            if (this.IIIllIIlIIIIIIlIlIIllIIlI != this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl) {
                class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 1, this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl);
            }
            if (this.IllIIlllllllIIlIIlIIIIlIl == this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl) continue;
            class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 2, this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl);
        }
        this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl;
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll = n2;
        }
        if (n == 1) {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl = n2;
        }
        if (n == 2) {
            this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl = n2;
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
            if (n == 2) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 39, true)) {
                    return null;
                }
                class_12912.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972);
            } else if (n != 1 && n != 0 ? (class_0400.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08973) != null ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0, 1, false) : (class_1587.lllIlIIlIIIlIlIIIllIlllIl(class_08973) ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 1, 2, false) : (n >= 3 && n < 30 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 30, 39, false) : n >= 30 && n < 39 && !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 30, false)))) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 39, false)) {
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

