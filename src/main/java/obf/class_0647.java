package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0647
extends class_1774
implements class_0147 {
    private static final int[] IllIIlllllllIIlIIlIIIIlIl = new int[]{3};
    private static final int[] IIIllIllIIlIlIlIlIllllIIl = new int[]{0, 1, 2};
    private ItemStack[] IllIIIllIIIIlIlIlIllIIlll = new ItemStack[4];
    private int lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlllIllIllllIIIlIIIIII;
    private Item llIIllIllIlIIlIIllIllllll;
    private String lllIIlIIIllllllIIIIlIlIlI;

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl() ? this.lllIIlIIIllllllIIIIlIlIlI : "container.brewing";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.lllIIlIIIllllllIIIIlIlIlI != null && this.lllIIlIIIllllllIIIIlIlIlI.length() > 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIlIIIllllllIIIIlIlIlI = string;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.IllIIIllIIIIlIlIlIllIIlll.length;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lIIIIlIlIIlllllIIllIIlIII > 0) {
            --this.lIIIIlIlIIlllllIIllIIlIII;
            if (this.lIIIIlIlIIlllllIIllIIlIII == 0) {
                this.IlIlIIlIlIllIIlIlIIllIIIl();
                this.llIIlIllIllllIlIIIIlIIlll();
            } else if (!this.IlIlllIIIIIIlIIllIIllIlll()) {
                this.lIIIIlIlIIlllllIIllIIlIII = 0;
                this.llIIlIllIllllIlIIIIlIIlll();
            } else if (this.llIIllIllIlIIlIIllIllllll != this.IllIIIllIIIIlIlIlIllIIlll[3].lllIIIllIIIIlllIlIIllIIll()) {
                this.lIIIIlIlIIlllllIIllIIlIII = 0;
                this.llIIlIllIllllIlIIIIlIIlll();
            }
        } else if (this.IlIlllIIIIIIlIIllIIllIlll()) {
            this.lIIIIlIlIIlllllIIllIIlIII = 400;
            this.llIIllIllIlIIlIIllIllllll = this.IllIIIllIIIIlIlIlIllIIlll[3].lllIIIllIIIIlllIlIIllIIll();
        }
        int n = this.lllIIlIIIllllllIIIIlIlIlI();
        if (n != this.llIIlllIllIllllIIIlIIIIII) {
            this.llIIlllIllIllllIIIlIIIIII = n;
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, n, 2);
        }
        super.IlIllllllIIlIIllllIIlIIIl();
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    private boolean IlIlllIIIIIIlIIllIIllIlll() {
        if (this.IllIIIllIIIIlIlIlIllIIlll[3] != null && this.IllIIIllIIIIlIlIlIllIIlll[3].lllIlIIlIIIlIlIIIllIlllIl > 0) {
            ItemStack class_08972 = this.IllIIIllIIIIlIlIlIllIIlll[3];
            if (!class_08972.lllIIIllIIIIlllIlIIllIIll().IllIIlllllllIIlIIlIIIIlIl(class_08972)) {
                return false;
            }
            boolean bl = false;
            for (int i = 0; i < 3; ++i) {
                if (this.IllIIIllIIIIlIlIlIllIIlll[i] == null || this.IllIIIllIIIIlIlIlIllIIlll[i].lllIIIllIIIIlllIlIIllIIll() != Items.potionitem) continue;
                int n = this.IllIIIllIIIIlIlIlIllIIlll[i].IllIIIllIIIIlIlIlIllIIlll();
                int n2 = this.lllIIIllIIIIlllIlIIllIIll(n, class_08972);
                if (!class_0483.IIIllIIlIIIIIIlIlIIllIIlI(n) && class_0483.IIIllIIlIIIIIIlIlIIllIIlI(n2)) {
                    bl = true;
                    break;
                }
                List list = Items.potionitem.lIllllIIlIIIlIllllllIIIll(n);
                List list2 = Items.potionitem.lIllllIIlIIIlIllllllIIIll(n2);
                if (n > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null) || n == n2) continue;
                bl = true;
                break;
            }
            return bl;
        }
        return false;
    }

    private void IlIlIIlIlIllIIlIlIIllIIIl() {
        if (this.IlIlllIIIIIIlIIllIIllIlll()) {
            ItemStack class_08972 = this.IllIIIllIIIIlIlIlIllIIlll[3];
            for (int i = 0; i < 3; ++i) {
                if (this.IllIIIllIIIIlIlIlIllIIlll[i] == null || this.IllIIIllIIIIlIlIlIllIIlll[i].lllIIIllIIIIlllIlIIllIIll() != Items.potionitem) continue;
                int n = this.IllIIIllIIIIlIlIlIllIIlll[i].IllIIIllIIIIlIlIlIllIIlll();
                int n2 = this.lllIIIllIIIIlllIlIIllIIll(n, class_08972);
                List list = Items.potionitem.lIllllIIlIIIlIllllllIIIll(n);
                List list2 = Items.potionitem.lIllllIIlIIIlIllllllIIIll(n2);
                if (!(n > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null))) {
                    if (n == n2) continue;
                    this.IllIIIllIIIIlIlIlIllIIlll[i].lllIlIIlIIIlIlIIIllIlllIl(n2);
                    continue;
                }
                if (class_0483.IIIllIIlIIIIIIlIlIIllIIlI(n) || !class_0483.IIIllIIlIIIIIIlIlIIllIIlI(n2)) continue;
                this.IllIIIllIIIIlIlIlIllIIlll[i].lllIlIIlIIIlIlIIIllIlllIl(n2);
            }
            if (class_08972.lllIIIllIIIIlllIlIIllIIll().llIIllIllIlIIlIIllIllllll()) {
                this.IllIIIllIIIIlIlIlIllIIlll[3] = new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll().llIIlllIllIllllIIIlIIIIII());
            } else {
                --this.IllIIIllIIIIlIlIlIllIIlll[3].lllIlIIlIIIlIlIIIllIlllIl;
                if (this.IllIIIllIIIIlIlIlIllIIlll[3].lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                    this.IllIIIllIIIIlIlIlIllIIlll[3] = null;
                }
            }
        }
    }

    private int lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972) {
        return class_08972 == null ? n : (class_08972.lllIIIllIIIIlllIlIIllIIll().IllIIlllllllIIlIIlIIIIlIl(class_08972) ? class_0668.lllIIIllIIIIlllIlIIllIIll(n, class_08972.lllIIIllIIIIlllIlIIllIIll().IIIllIIlIIIIIIlIlIIllIIlI(class_08972)) : n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("net.minecraft.init.Items", 10);
        this.IllIIIllIIIIlIlIlIllIIlll = new ItemStack[this.IlIIIIIllllllIIlllIllllll()];
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            byte by = class_07753.lIlllIlllIIIIlIIlllIllIII("Slot");
            if (by < 0 || by >= this.IllIIIllIIIIlIlIlIllIIlll.length) continue;
            this.IllIIIllIIIIlIlIlIllIIlll[by] = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        this.lIIIIlIlIIlllllIIllIIlIII = class_07752.IlIIIIIllllllIIlllIllllll("BrewTime");
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8)) {
            this.lllIIlIIIllllllIIIIlIlIlI = class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName");
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("BrewTime", (short)this.lIIIIlIlIIlllllIIllIIlIII);
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            if (this.IllIIIllIIIIlIlIlIllIIlll[i] == null) continue;
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)i);
            this.IllIIIllIIIIlIlIlIllIIlll[i].lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Items", class_21452);
        if (this.IIlllIlIlllIllIIIlllIIlIl()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.lllIIlIIIllllllIIIIlIlIlI);
        }
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return n >= 0 && n < this.IllIIIllIIIIlIlIlIllIIlll.length ? this.IllIIIllIIIIlIlIlIllIIlll[n] : null;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n >= 0 && n < this.IllIIIllIIIIlIlIlIllIIlll.length) {
            ItemStack class_08972 = this.IllIIIllIIIIlIlIlIllIIlll[n];
            this.IllIIIllIIIIlIlIlIllIIlll[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (n >= 0 && n < this.IllIIIllIIIIlIlIlIllIIlll.length) {
            ItemStack class_08972 = this.IllIIIllIIIIlIlIlIllIIlll[n];
            this.IllIIIllIIIIlIlIlIllIIlll[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        if (n >= 0 && n < this.IllIIIllIIIIlIlIlIllIIlll.length) {
            this.IllIIIllIIIIlIlIlIllIIlll[n] = class_08972;
        }
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) != this ? false : class_08142.lIllllIIlIIIlIllllllIIIll((double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5, (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5, (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5) <= 64.0;
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, ItemStack class_08972) {
        return n == 3 ? class_08972.lllIIIllIIIIlllIlIIllIIll().IllIIlllllllIIlIIlIIIIlIl(class_08972) : class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.potionitem || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIIlllIIIlIIlIllIIIIIlIlI;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.lIIIIlIlIIlllllIIllIIlIII = n;
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            if (this.IllIIIllIIIIlIlIlIllIIlll[i] == null) continue;
            n |= 1 << i;
        }
        return n;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n) {
        return n == 1 ? IllIIlllllllIIlIIlIIIIlIl : IIIllIllIIlIlIlIlIllllIIl;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972, int n2) {
        return this.IlIllllllIIlIIllllIIlIIIl(n, class_08972);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972, int n2) {
        return true;
    }
}

