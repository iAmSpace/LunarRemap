package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0013
implements class_0850 {
    private ItemStack[] lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private class_1071 IlIllllllIIlIIllllIIlIIIl;

    public class_0013(class_1071 class_10712, int n, int n2) {
        int n3 = n * n2;
        this.lllIIIllIIIIlllIlIIllIIll = new ItemStack[n3];
        this.IlIllllllIIlIIllllIIlIIIl = class_10712;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll.length;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return n >= this.IlIIIIIllllllIIlllIllllll() ? null : this.lllIIIllIIIIlllIlIIllIIll[n];
    }

    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (n >= 0 && n < this.lllIlIIlIIIlIlIIIllIlllIl) {
            int n3 = n + n2 * this.lllIlIIlIIIlIlIIIllIlllIl;
            return this.llIIllIllIlIIlIIllIllllll(n3);
        }
        return null;
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return "container.crafting";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return false;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.lllIIIllIIIIlllIlIIllIIll[n] != null) {
            ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll[n];
            this.lllIIIllIIIIlllIlIIllIIll[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.lllIIIllIIIIlllIlIIllIIll[n] != null) {
            if (this.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll[n];
                this.lllIIIllIIIIlllIlIIllIIll[n] = null;
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this);
                return class_08972;
            }
            ItemStack class_08973 = this.lllIIIllIIIIlllIlIIllIIll[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (this.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.lllIIIllIIIIlllIlIIllIIll[n] = null;
            }
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this);
            return class_08973;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll[n] = class_08972;
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return true;
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
}

