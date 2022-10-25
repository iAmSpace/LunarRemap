package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_1646
extends class_1774
implements class_0850 {
    private ItemStack[] IIIllIllIIlIlIlIlIllllIIl = new ItemStack[9];
    private Random IllIIIllIIIIlIlIlIllIIlll = new Random();
    protected String IllIIlllllllIIlIIlIIIIlIl;

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 9;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return this.IIIllIllIIlIlIlIlIllllIIl[n];
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.IIIllIllIIlIlIlIlIllllIIl[n] != null) {
            if (this.IIIllIllIIlIlIlIlIllllIIl[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08972 = this.IIIllIllIIlIlIlIlIllllIIl[n];
                this.IIIllIllIIlIlIlIlIllllIIl[n] = null;
                this.llIIlIllIllllIlIIIIlIIlll();
                return class_08972;
            }
            ItemStack class_08973 = this.IIIllIllIIlIlIlIlIllllIIl[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (this.IIIllIllIIlIlIlIlIllllIIl[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.IIIllIllIIlIlIlIlIllllIIl[n] = null;
            }
            this.llIIlIllIllllIlIIIIlIIlll();
            return class_08973;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.IIIllIllIIlIlIlIlIllllIIl[n] != null) {
            ItemStack class_08972 = this.IIIllIllIIlIlIlIlIllllIIl[n];
            this.IIIllIllIIlIlIlIlIllllIIl[n] = null;
            return class_08972;
        }
        return null;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        int n = -1;
        int n2 = 1;
        for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.length; ++i) {
            if (this.IIIllIllIIlIlIlIlIllllIIl[i] == null || this.IllIIIllIIIIlIlIlIllIIlll.nextInt(n2++) != 0) continue;
            n = i;
        }
        return n;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.IIIllIllIIlIlIlIlIllllIIl[n] = class_08972;
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > this.llIIlIlIlllIIllIlIlllIllI()) {
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI();
        }
        this.llIIlIllIllllIlIIIIlIIlll();
    }

    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.length; ++i) {
            if (this.IIIllIllIIlIlIlIlIllllIIl[i] != null && this.IIIllIllIIlIlIlIlIllllIIl[i].lllIIIllIIIIlllIlIIllIIll() != null) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl(i, class_08972);
            return i;
        }
        return -1;
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl() ? this.IllIIlllllllIIlIIlIIIIlIl : "container.dispenser";
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IllIIlllllllIIlIIlIIIIlIl = string;
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl != null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("net.minecraft.init.Items", 10);
        this.IIIllIllIIlIlIlIlIllllIIl = new ItemStack[this.IlIIIIIllllllIIlllIllllll()];
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            int n = class_07753.lIlllIlllIIIIlIIlllIllIII("Slot") & 0xFF;
            if (n < 0 || n >= this.IIIllIllIIlIlIlIlIllllIIl.length) continue;
            this.IIIllIllIIlIlIlIlIllllIIl[n] = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8)) {
            this.IllIIlllllllIIlIIlIIIIlIl = class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName");
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.length; ++i) {
            if (this.IIIllIllIIlIlIlIlIllllIIl[i] == null) continue;
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)i);
            this.IIIllIllIIlIlIlIlIllllIIl[i].lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Items", class_21452);
        if (this.IIlllIlIlllIllIIIlllIIlIl()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.IllIIlllllllIIlIIlIIIIlIl);
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
        return true;
    }
}

