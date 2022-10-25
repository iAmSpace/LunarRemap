package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1086
implements class_0850 {
    private final class_1510 lllIIIllIIIIlllIlIIllIIll;
    private ItemStack[] lllIlIIlIIIlIlIIIllIlllIl = new ItemStack[3];
    private final class_0814 IlIllllllIIlIIllllIIlIIIl;
    private class_2187 lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public class_1086(class_0814 class_08142, class_1510 class_15102) {
        this.IlIllllllIIlIIllllIIlIIIl = class_08142;
        this.lllIIIllIIIIlllIlIIllIIll = class_15102;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.length;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return this.lllIlIIlIIIlIlIIIllIlllIl[n];
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl[n] != null) {
            if (n == 2) {
                ItemStack class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl[n];
                this.lllIlIIlIIIlIlIIIllIlllIl[n] = null;
                return class_08972;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08973 = this.lllIlIIlIIIlIlIIIllIlllIl[n];
                this.lllIlIIlIIIlIlIIIllIlllIl[n] = null;
                if (this.lllIlIIlIIIlIlIIIllIlllIl(n)) {
                    this.lllIIIllIIIIlllIlIIllIIll();
                }
                return class_08973;
            }
            ItemStack class_08974 = this.lllIlIIlIIIlIlIIIllIlllIl[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (this.lllIlIIlIIIlIlIIIllIlllIl[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl[n] = null;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl(n)) {
                this.lllIIIllIIIIlllIlIIllIIll();
            }
            return class_08974;
        }
        return null;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n == 0 || n == 1;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl[n] != null) {
            ItemStack class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl[n];
            this.lllIlIIlIIIlIlIIIllIlllIl[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.lllIlIIlIIIlIlIIIllIlllIl[n] = class_08972;
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > this.llIIlIlIlllIIllIlIlllIllI()) {
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI();
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl(n)) {
            this.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return "mob.villager";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return false;
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll() == class_08142;
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, ItemStack class_08972) {
        return true;
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lIlllIlllIIIIlIIlllIllIII = null;
        ItemStack class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl[0];
        ItemStack class_08973 = this.lllIlIIlIIIlIlIIIllIlllIl[1];
        if (class_08972 == null) {
            class_08972 = class_08973;
            class_08973 = null;
        }
        if (class_08972 == null) {
            this.lllIlIIlIIIlIlIIIllIlllIl(2, null);
        } else {
            class_1596 class_15962 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl);
            if (class_15962 != null) {
                class_2187 class_21872 = class_15962.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08973, this.IlIIIIIllllllIIlllIllllll);
                if (class_21872 != null && !class_21872.lIllllIIlIIIlIllllllIIIll()) {
                    this.lIlllIlllIIIIlIIlllIllIII = class_21872;
                    this.lllIlIIlIIIlIlIIIllIlllIl(2, class_21872.lIlllIlllIIIIlIIlllIllIII().llIIlllIllIllllIIIlIIIIII());
                } else if (class_08973 != null) {
                    class_21872 = class_15962.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972, this.IlIIIIIllllllIIlllIllllll);
                    if (class_21872 != null && !class_21872.lIllllIIlIIIlIllllllIIIll()) {
                        this.lIlllIlllIIIIlIIlllIllIII = class_21872;
                        this.lllIlIIlIIIlIlIIIllIlllIl(2, class_21872.lIlllIlllIIIIlIIlllIllIII().llIIlllIllIllllIIIlIIIIII());
                    } else {
                        this.lllIlIIlIIIlIlIIIllIlllIl(2, null);
                    }
                } else {
                    this.lllIlIIlIIIlIlIIIllIlllIl(2, null);
                }
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll(2));
    }

    public class_2187 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIIIIIllllllIIlllIllllll = n;
        this.lllIIIllIIIIlllIlIIllIIll();
    }
}

