package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1298
extends class_0113
implements class_1770 {
    public class_1298(boolean bl) {
        super(bl);
        this.llIllllIlIllIIIlIllIIlIlI = true;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.lllIIIlIllIlllIlIIllIllIl;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.lllIIIlIllIlllIlIIllIllIl;
    }

    @Override
    protected int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return 2;
    }

    @Override
    protected class_0113 llIlllIIllIlllIlIlIlIIIll() {
        return Blocks.IIlIlIlIIlllIIIlIIIIlIIIl;
    }

    @Override
    protected class_0113 IIIIlIIlIIIllIIIIllIIIlII() {
        return Blocks.lIllIIlllIIIlIlIIIlllIlIl;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 37;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        boolean bl;
        boolean bl2 = bl = this.llllllIlIllllIlIlIlIIIIlI || (n2 & 8) != 0;
        return n == 0 ? (bl ? Blocks.lIIllllllllIlIllllllllIlI.lIlllIlllIIIIlIIlllIllIII(n) : Blocks.IlIIIlIIlllllIIIllIlIlIll.lIlllIlllIIIIlIIlllIllIII(n)) : (n == 1 ? (bl ? Blocks.IIlIlIlIIlllIIIlIIIIlIIIl.llIIIIllIIIIIIIlIIIlIIIIl : this.llIIIIllIIIIIIIlIIIlIIIIl) : Blocks.llllIlIIIIIIIIIlllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(1));
    }

    @Override
    protected boolean IIIllIllIIlIlIlIlIllllIIl(int n) {
        return this.llllllIlIllllIlIlIlIIIIlI || (n & 8) != 0;
    }

    @Override
    protected int lIllllIIlIIIlIllllllIIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return this.IlIIIIIllllllIIlllIllllll(class_18432, n, n2, n3).lllIIIllIIIIlllIlIIllIIll();
    }

    private int IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return !this.lIIIIlIlIIlllllIIllIIlIII(n4) ? this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3, n4) : Math.max(this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3, n4) - this.IllIIlllllllIIlIIlIIIIlIl((class_1843)class_13342, n, n2, n3, n4), 0);
    }

    public boolean lIIIIlIlIIlllllIIllIIlIII(int n) {
        return (n & 4) == 4;
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5 = this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3, n4);
        if (n5 >= 15) {
            return true;
        }
        if (n5 == 0) {
            return false;
        }
        int n6 = this.IllIIlllllllIIlIIlIIIIlIl((class_1843)class_13342, n, n2, n3, n4);
        return n6 == 0 ? true : n5 >= n6;
    }

    @Override
    protected int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5;
        int n6 = super.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3, n4);
        int n7 = class_1298.IllIIIllIIIIlIlIlIllIIlll(n4);
        int n8 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[n7];
        Block class_05492 = class_13342.a_(n8, n2, n5 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n7]);
        if (class_05492.IIllIllIIllIIlllIIIlIlllI()) {
            n6 = class_05492.lIllllIIlIIIlIllllllIIIll(class_13342, n8, n2, n5, class_1632.lIllllIIlIIIlIllllllIIIll[n7]);
        } else if (n6 < 15 && class_05492.IIIllIllIIlIlIlIlIllllIIl() && (class_05492 = class_13342.a_(n8 += class_1632.lllIIIllIIIIlllIlIIllIIll[n7], n2, n5 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[n7])).IIllIllIIllIIlllIIIlIlllI()) {
            n6 = class_05492.lIllllIIlIIIlIllllllIIIll(class_13342, n8, n2, n5, class_1632.lIllllIIlIIIlIllllllIIIll[n7]);
        }
        return n6;
    }

    public class_0134 IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        return (class_0134)class_18432.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl = this.llllllIlIllllIlIlIlIIIIlI | (n5 & 8) != 0;
        boolean bl2 = !this.lIIIIlIlIIlllllIIllIIlIII(n5);
        int n6 = bl2 ? 4 : 0;
        int n7 = bl ? 8 : 0;
        class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, bl2 ? 0.55f : 0.5f);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, (n6 |= n7) | n5 & 3, 2);
        this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, class_13342.lllllIlllIIllIlIIlIIIllII);
        return true;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        int n4;
        int n5;
        int n6;
        if (!(class_13342.IlIIIIIllllllIIlllIllllll(n, n2, n3, this) || (n6 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3, n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3))) == (n4 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3).lllIIIllIIIIlllIlIIllIIll()) && this.IIIllIllIIlIlIlIlIllllIIl(n5) == this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n5))) {
            if (this.IIIllIllIIlIlIlIlIllllIIl(class_13342, n, n2, n3, n5)) {
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, this, this.IllIIlllllllIIlIIlIIIIlIl(0), -1);
            } else {
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, this, this.IllIIlllllllIIlIIlIIIIlIl(0), 0);
            }
        }
    }

    private void IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3, n4);
        int n6 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3).lllIIIllIIIIlllIlIIllIIll();
        this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3).lllIIIllIIIIlllIlIIllIIll(n5);
        if (n6 != n5 || !this.lIIIIlIlIIlllllIIllIIlIII(n4)) {
            boolean bl;
            boolean bl2 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
            boolean bl3 = bl = this.llllllIlIllllIlIlIlIIIIlI || (n4 & 8) != 0;
            if (bl && !bl2) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 & 0xFFFFFFF7, 2);
            } else if (!bl && bl2) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 | 8, 2);
            }
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.IIIIlIIlIIIllIIIIllIIIlII(), n4 | 8, 4);
        }
        this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, random);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll(class_13342, 0));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
        class_13342.llIIllIllIlIIlIIllIllllll(n, n2, n3);
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, n4, n5);
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return class_17742 != null ? class_17742.lllIlIIlIIIlIlIIIllIlllIl(n4, n5) : false;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_0134();
    }
}

