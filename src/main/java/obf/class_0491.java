package obf;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0491
extends class_1071 {
    public class_0013 lllIIIllIIIIlllIlIIllIIll = new class_0013(this, 3, 3);
    public class_0850 lIllllIIlIIIlIllllllIIIll = new class_0971();
    private class_1334 IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;

    public class_0491(class_0503 class_05032, class_1334 class_13342, int n, int n2, int n3) {
        int n4;
        int n5;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_13342;
        this.IllIIlllllllIIlIIlIIIIlIl = n;
        this.IIIllIllIIlIlIlIlIllllIIl = n2;
        this.IllIIIllIIIIlIlIlIllIIlll = n3;
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1373(class_05032.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll, this.lIllllIIlIIIlIllllllIIIll, 0, 124, 35));
        for (n5 = 0; n5 < 3; ++n5) {
            for (n4 = 0; n4 < 3; ++n4) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(this.lllIIIllIIIIlllIlIIllIIll, n4 + n5 * 3, 30 + n4 * 18, 17 + n5 * 18));
            }
        }
        for (n5 = 0; n5 < 3; ++n5) {
            for (n4 = 0; n4 < 9; ++n4) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n4 + n5 * 9 + 9, 8 + n4 * 18, 84 + n5 * 18));
            }
        }
        for (n5 = 0; n5 < 9; ++n5) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n5, 8 + n5 * 18, 142));
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0, class_0172.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.IIIllIIlIIIIIIlIlIIllIIlI));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_08142);
        if (!this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIIllIIllIllIlllIlIIl) {
            for (int i = 0; i < 9; ++i) {
                ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI(i);
                if (class_08972 == null) continue;
                class_08142.lllIIIllIIIIlllIlIIllIIll(class_08972, false);
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return this.IIIllIIlIIIIIIlIlIIllIIlI.a_(this.IllIIlllllllIIlIIlIIIIlIl, this.IIIllIllIIlIlIlIlIllllIIl, this.IllIIIllIIIIlIlIlIllIIlll) != Blocks.crafting_table ? false : class_08142.lIllllIIlIIIlIllllllIIIll((double)this.IllIIlllllllIIlIIlIIIIlIl + 0.5, (double)this.IIIllIllIIlIlIlIlIllllIIl + 0.5, (double)this.IllIIIllIIIIlIlIlIllIIlll + 0.5) <= 64.0;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        ItemStack class_08972 = null;
        class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
            ItemStack class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
            class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
            if (n == 0) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08973, 10, 46, true)) {
                    return null;
                }
                class_12912.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972);
            } else if (n >= 10 && n < 37 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 37, 46, false) : (n >= 37 && n < 46 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 10, 37, false) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 10, 46, false))) {
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
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1291 class_12912) {
        return class_12912.lIllllIIlIIIlIllllllIIIll != this.lIllllIIlIIIlIllllllIIIll && super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_12912);
    }
}

