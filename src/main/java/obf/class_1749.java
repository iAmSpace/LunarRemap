package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class class_1749
implements class_0850 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private ItemStack[] IlIllllllIIlIIllllIIlIIIl;
    private List lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;

    public class_1749(String string, boolean bl, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.IlIIIIIllllllIIlllIllllll = bl;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = new ItemStack[n];
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0278 class_02782) {
        if (this.lIlllIlllIIIIlIIlllIllIII == null) {
            this.lIlllIlllIIIIlIIlllIllIII = new ArrayList();
        }
        this.lIlllIlllIIIIlIIlllIllIII.add(class_02782);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0278 class_02782) {
        this.lIlllIlllIIIIlIIlllIllIII.remove(class_02782);
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return n >= 0 && n < this.IlIllllllIIlIIllllIIlIIIl.length ? this.IlIllllllIIlIIllllIIlIIIl[n] : null;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.IlIllllllIIlIIllllIIlIIIl[n] != null) {
            if (this.IlIllllllIIlIIllllIIlIIIl[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08972 = this.IlIllllllIIlIIllllIIlIIIl[n];
                this.IlIllllllIIlIIllllIIlIIIl[n] = null;
                this.llIIlIllIllllIlIIIIlIIlll();
                return class_08972;
            }
            ItemStack class_08973 = this.IlIllllllIIlIIllllIIlIIIl[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (this.IlIllllllIIlIIllllIIlIIIl[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.IlIllllllIIlIIllllIIlIIIl[n] = null;
            }
            this.llIIlIllIllllIlIIIIlIIlll();
            return class_08973;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.IlIllllllIIlIIllllIIlIIIl[n] != null) {
            ItemStack class_08972 = this.IlIllllllIIlIIllllIIlIIIl[n];
            this.IlIllllllIIlIIllllIIlIIIl[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.IlIllllllIIlIIllllIIlIIIl[n] = class_08972;
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > this.llIIlIlIlllIIllIlIlllIllI()) {
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI();
        }
        this.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIIIIIllllllIIlllIllllll = true;
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.size(); ++i) {
                ((class_0278)this.lIlllIlllIIIIlIIlllIllIII.get(i)).lllIIIllIIIIlllIlIIllIIll(this);
            }
        }
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

