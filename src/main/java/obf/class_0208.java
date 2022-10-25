package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0208
implements class_2098 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private ItemStack[] IlIllllllIIlIIllllIIlIIIl;
    private ItemStack lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;

    public class_0208(int n, int n2, ItemStack[] arrclass_0897, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = arrclass_0897;
        this.lIlllIlllIIIIlIIlllIllIII = class_08972;
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132, class_1334 class_13342) {
        for (int i = 0; i <= 3 - this.lllIIIllIIIIlllIlIIllIIll; ++i) {
            for (int j = 0; j <= 3 - this.lllIlIIlIIIlIlIIIllIlllIl; ++j) {
                if (this.lllIIIllIIIIlllIlIIllIIll(class_00132, i, j, true)) {
                    return true;
                }
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_00132, i, j, false)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132, int n, int n2, boolean bl) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                ItemStack class_08972;
                int n3 = i - n;
                int n4 = j - n2;
                ItemStack class_08973 = null;
                if (n3 >= 0 && n4 >= 0 && n3 < this.lllIIIllIIIIlllIlIIllIIll && n4 < this.lllIlIIlIIIlIlIIIllIlllIl) {
                    class_08973 = bl ? this.IlIllllllIIlIIllllIIlIIIl[this.lllIIIllIIIIlllIlIIllIIll - n3 - 1 + n4 * this.lllIIIllIIIIlllIlIIllIIll] : this.IlIllllllIIlIIllllIIlIIIl[n3 + n4 * this.lllIIIllIIIIlllIlIIllIIll];
                }
                if ((class_08972 = class_00132.lllIlIIlIIIlIlIIIllIlllIl(i, j)) == null && class_08973 == null) continue;
                if (class_08972 == null && class_08973 != null || class_08972 != null && class_08973 == null) {
                    return false;
                }
                if (class_08973.lllIIIllIIIIlllIlIIllIIll() != class_08972.lllIIIllIIIIlllIlIIllIIll()) {
                    return false;
                }
                if (class_08973.IllIIIllIIIIlIlIlIllIIlll() == 32767 || class_08973.IllIIIllIIIIlIlIlIllIIlll() == class_08972.IllIIIllIIIIlIlIlIllIIlll()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132) {
        ItemStack class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl().llIIlllIllIllllIIIlIIIIII();
        if (this.IlIIIIIllllllIIlllIllllll) {
            for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08973 = class_00132.llIIllIllIlIIlIIllIllllll(i);
                if (class_08973 == null || !class_08973.IlIlIIlIlIllIIlIlIIllIIIl()) continue;
                class_08972.lIlllIlllIIIIlIIlllIllIII((class_0775)class_08973.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl());
            }
        }
        return class_08972;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll * this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_0208 IlIllllllIIlIIllllIIlIIIl() {
        this.IlIIIIIllllllIIlllIllllll = true;
        return this;
    }
}

