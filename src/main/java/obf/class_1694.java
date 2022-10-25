package obf;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
class class_1694
extends class_1291 {
    final /* synthetic */ class_1334 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ int IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ int lIlllIlllIIIIlIIlllIllIII;
    final /* synthetic */ class_0631 IlIIIIIllllllIIlllIllllll;

    class_1694(class_0631 class_06312, class_0850 class_08502, int n, int n2, int n3, class_1334 class_13342, int n4, int n5, int n6) {
        this.IlIIIIIllllllIIlllIllllll = class_06312;
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
        this.lllIlIIlIIIlIlIIIllIlllIl = n4;
        this.IlIllllllIIlIIllllIIlIIIl = n5;
        this.lIlllIlllIIIIlIIlllIllIII = n6;
        super(class_08502, n, n2, n3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII || class_08142.lllIlllllIllIlIIlIlIIIlll >= this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll) && this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll > 0 && this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, ItemStack class_08972) {
        if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            class_08142.IlIIIlIIIIllIIIllIIIIIIll(-this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll);
        }
        class_0631.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll).lllIlIIlIIIlIlIIIllIlllIl(0, null);
        if (class_0631.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll) > 0) {
            ItemStack class_08973 = class_0631.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll).llIIllIllIlIIlIIllIllllll(1);
            if (class_08973 != null && class_08973.lllIlIIlIIIlIlIIIllIlllIl > class_0631.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll)) {
                class_08973.lllIlIIlIIIlIlIIIllIlllIl -= class_0631.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll);
                class_0631.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll).lllIlIIlIIIlIlIIIllIlllIl(1, class_08973);
            } else {
                class_0631.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll).lllIlIIlIIIlIlIIIllIlllIl(1, null);
            }
        } else {
            class_0631.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll).lllIlIIlIIIlIlIIIllIlllIl(1, null);
        }
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll = 0;
        if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl && this.lllIIIllIIIIlllIlIIllIIll.a_(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) == Blocks.llIlllllIIlIIlIIllllIllll && class_08142.IlllIIIlIIlIIIIllllIllllI().nextFloat() < 0.12f) {
            int n = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            int n2 = n & 3;
            int n3 = n >> 2;
            if (++n3 > 2) {
                this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
                this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(1020, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 0);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, n2 | n3 << 2, 2);
                this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(1021, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 0);
            }
        } else if (!this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(1021, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 0);
        }
    }
}

