package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Random;

public abstract class class_0113
extends class_0143 {
    protected final boolean llllllIlIllllIlIlIlIIIIlI;

    protected class_0113(boolean bl) {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.llllllIlIllllIlIlIlIIIIlI = bl;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) ? false : super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3);
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) ? false : super.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (!this.IIIllIIlIIIIIIlIlIIllIIlI((class_1843)class_13342, n, n2, n3, n4)) {
            boolean bl = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
            if (this.llllllIlIllllIlIlIlIIIIlI && !bl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.IIIIlIIlIIIllIIIIllIIIlII(), n4, 2);
            } else if (!this.llllllIlIllllIlIlIlIIIIlI) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.llIlllIIllIlllIlIlIlIIIll(), n4, 2);
                if (!bl) {
                    class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, this.llIlllIIllIlllIlIlIlIIIll(), this.llIIlllIllIllllIIIlIIIIII(n4), -1);
                }
            }
        }
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 0 ? (this.llllllIlIllllIlIlIlIIIIlI ? Blocks.lIIllllllllIlIllllllllIlI.lIlllIlllIIIIlIIlllIllIII(n) : Blocks.IlIIIlIIlllllIIIllIlIlIll.lIlllIlllIIIIlIIlllIllIII(n)) : (n == 1 ? this.llIIIIllIIIIIIIlIIIlIIIIl : Blocks.llllIlIIIIIIIIIlllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(1));
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 != 0 && n4 != 1;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 36;
    }

    protected boolean IIIllIllIIlIlIlIlIllllIIl(int n) {
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return this.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3, n4);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (!this.IIIllIllIIlIlIlIlIllllIIl(n5)) {
            return 0;
        }
        int n6 = class_0113.IllIIIllIIIIlIlIlIllIIlll(n5);
        return n6 == 0 && n4 == 3 ? this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3, n5) : (n6 == 1 && n4 == 4 ? this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3, n5) : (n6 == 2 && n4 == 2 ? this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3, n5) : (n6 == 3 && n4 == 5 ? this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3, n5) : 0)));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, class_05492);
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (!this.IIIllIIlIIIIIIlIlIIllIIlI((class_1843)class_13342, n, n2, n3, n4)) {
            boolean bl = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
            if ((this.llllllIlIllllIlIlIlIIIIlI && !bl || !this.llllllIlIllllIlIlIlIIIIlI && bl) && !class_13342.IlIIIIIllllllIIlllIllllll(n, n2, n3, this)) {
                int n5 = -1;
                if (this.IIIllIllIIlIlIlIlIllllIIl(class_13342, n, n2, n3, n4)) {
                    n5 = -3;
                } else if (this.llllllIlIllllIlIlIlIIIIlI) {
                    n5 = -2;
                }
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, this, this.IllIIlllllllIIlIIlIIIIlIl(n4), n5);
            }
        }
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return false;
    }

    protected boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3, n4) > 0;
    }

    protected int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5;
        int n6 = class_0113.IllIIIllIIIIlIlIlIllIIlll(n4);
        int n7 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[n6];
        int n8 = class_13342.lIllllIIlIIIlIllllllIIIll(n7, n2, n5 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n6], class_1632.lIlllIlllIIIIlIIlllIllIII[n6]);
        return n8 >= 15 ? n8 : Math.max(n8, class_13342.a_(n7, n2, n5) == Blocks.IlIIIlIllIIIllIIIIlIIlIll ? class_13342.IlIllllllIIlIIllllIIlIIIl(n7, n2, n5) : 0);
    }

    protected int IllIIlllllllIIlIIlIIIIlIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        int n5 = class_0113.IllIIIllIIIIlIlIlIllIIlll(n4);
        switch (n5) {
            case 0: 
            case 2: {
                return Math.max(this.IIIllIllIIlIlIlIlIllllIIl(class_18432, n - 1, n2, n3, 4), this.IIIllIllIIlIlIlIlIllllIIl(class_18432, n + 1, n2, n3, 5));
            }
            case 1: 
            case 3: {
                return Math.max(this.IIIllIllIIlIlIlIlIllllIIl(class_18432, n, n2, n3 + 1, 3), this.IIIllIllIIlIlIlIlIllllIIl(class_18432, n, n2, n3 - 1, 2));
            }
        }
        return 0;
    }

    protected int IIIllIllIIlIlIlIlIllllIIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        return this.IlIllllllIIlIIllllIIlIIIl(class_05492) ? (class_05492 == Blocks.IlIIIlIllIIIllIIIIlIIlIll ? class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) : class_18432.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, n4)) : 0;
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = ((MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3) + 2) % 4;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 3);
        boolean bl = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
        if (bl) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, 1);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    protected void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_0113.IllIIIllIIIIlIlIlIllIIlll(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
        if (n4 == 1) {
            class_13342.lIlllIlllIIIIlIIlllIllIII(n + 1, n2, n3, this);
            class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + 1, n2, n3, this, 4);
        }
        if (n4 == 3) {
            class_13342.lIlllIlllIIIIlIIlllIllIII(n - 1, n2, n3, this);
            class_13342.lllIlIIlIIIlIlIIIllIlllIl(n - 1, n2, n3, this, 5);
        }
        if (n4 == 2) {
            class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3 + 1, this);
            class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 + 1, this, 2);
        }
        if (n4 == 0) {
            class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3 - 1, this);
            class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 - 1, this, 3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492.llIllllIlIllIIIlIllIIlIlI();
    }

    protected int lIllllIIlIIIlIllllllIIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return 15;
    }

    public static boolean lIlllIlllIIIIlIIlllIllIII(Block class_05492) {
        return Blocks.IIIlllIlIIllIIlIlIllIlIIl.IlIIIIIllllllIIlllIllllll(class_05492) || Blocks.lIllIIlllIIIlIlIIIlllIlIl.IlIIIIIllllllIIlllIllllll(class_05492);
    }

    public boolean IlIIIIIllllllIIlllIllllll(Block class_05492) {
        return class_05492 == this.llIlllIIllIlllIlIlIlIIIll() || class_05492 == this.IIIIlIIlIIIllIIIIllIIIlII();
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5 = class_0113.IllIIIllIIIIlIlIlIllIIlll(n4);
        if (class_0113.lIlllIlllIIIIlIIlllIllIII(class_13342.a_(n - class_1632.lllIIIllIIIIlllIlIIllIIll[n5], n2, n3 - class_1632.lllIlIIlIIIlIlIIIllIlllIl[n5]))) {
            int n6 = class_13342.IlIllllllIIlIIllllIIlIIIl(n - class_1632.lllIIIllIIIIlllIlIIllIIll[n5], n2, n3 - class_1632.lllIlIIlIIIlIlIIIllIlllIl[n5]);
            int n7 = class_0113.IllIIIllIIIIlIlIlIllIIlll(n6);
            return n7 != n5;
        }
        return false;
    }

    protected int llIIlllIllIllllIIIlIIIIII(int n) {
        return this.IllIIlllllllIIlIIlIIIIlIl(n);
    }

    protected abstract int IllIIlllllllIIlIIlIIIIlIl(int var1);

    protected abstract class_0113 llIlllIIllIlllIlIlIlIIIll();

    protected abstract class_0113 IIIIlIIlIIIllIIIIllIIIlII();

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return this.IlIIIIIllllllIIlllIllllll(class_05492);
    }
}

