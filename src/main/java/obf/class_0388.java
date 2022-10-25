package obf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0388 {
    public class_1334 lllIIIllIIIIlllIlIIllIIll;
    public class_1822 lllIlIIlIIIlIlIIIllIlllIl;
    private class_2243 IlIllllllIIlIIllllIIlIIIl = class_2243.lllIIIllIIIIlllIlIIllIIll;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlllIllIllllIIIlIIIIII;
    private int llIIllIllIlIIlIIllIllllll;
    private int lllIIlIIIllllllIIIIlIlIlI;
    private int IlIlllIIIIIIlIIllIIllIlll = -1;

    public class_0388(class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
        this.IlIllllllIIlIIllllIIlIIIl = class_22432;
        class_22432.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIlIlIlIlIllIIlIIllllIll);
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll();
    }

    public class_2243 lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_2243 class_22432) {
        if (this.IlIllllllIIlIIllllIIlIIIl == class_2243.lllIIIllIIIIlllIlIIllIIll) {
            this.IlIllllllIIlIIllllIIlIIIl = class_22432;
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        ++this.IIIllIllIIlIlIlIlIllllIIl;
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            int n = this.IIIllIllIIlIlIlIlIllllIIl - this.lllIIlIIIllllllIIIIlIlIlI;
            Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                this.IllIIIllIIIIlIlIlIllIIlll = false;
            } else {
                float f = class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll) * (float)(n + 1);
                int n2 = (int)(f * 10.0f);
                if (n2 != this.IlIlllIIIIIIlIIllIIllIlll) {
                    this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI(), this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll, n2);
                    this.IlIlllIIIIIIlIIllIIllIlll = n2;
                }
                if (f >= 1.0f) {
                    this.IllIIIllIIIIlIlIlIllIIlll = false;
                    this.IlIllllllIIlIIllllIIlIIIl(this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll);
                }
            }
        } else if (this.lIlllIlllIIIIlIIlllIllIII) {
            Block class_05493 = this.lllIIIllIIIIlllIlIIllIIll.a_(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl);
            if (class_05493.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI(), this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl, -1);
                this.IlIlllIIIIIIlIIllIIllIlll = -1;
                this.lIlllIlllIIIIlIIlllIllIII = false;
            } else {
                int n = this.IIIllIllIIlIlIlIlIllllIIl - this.IlIIIIIllllllIIlllIllllll;
                float f = class_05493.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl) * (float)(n + 1);
                int n3 = (int)(f * 10.0f);
                if (n3 != this.IlIlllIIIIIIlIIllIIllIlll) {
                    this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI(), this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl, n3);
                    this.IlIlllIIIIIIlIIllIIllIlll = n3;
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        if (!this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl() || this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
                if (!this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((class_0814)null, n, n2, n3, n4)) {
                    this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((class_0814)null, n, n2, n3, n4);
                this.IlIIIIIllllllIIlllIllllll = this.IIIllIllIIlIlIlIlIllllIIl;
                float f = 1.0f;
                Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
                if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, this.lllIlIIlIIIlIlIIIllIlllIl);
                    f = class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3);
                }
                if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && f >= 1.0f) {
                    this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                } else {
                    this.lIlllIlllIIIIlIIlllIllIII = true;
                    this.lIllllIIlIIIlIllllllIIIll = n;
                    this.IIIllIIlIIIIIIlIlIIllIIlI = n2;
                    this.IllIIlllllllIIlIIlIIIIlIl = n3;
                    int n5 = (int)(f * 10.0f);
                    this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI(), n, n2, n3, n5);
                    this.IlIlllIIIIIIlIIllIIllIlll = n5;
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (n == this.lIllllIIlIIIlIllllllIIIll && n2 == this.IIIllIIlIIIIIIlIlIIllIIlI && n3 == this.IllIIlllllllIIlIIlIIIIlIl) {
            int n4 = this.IIIllIllIIlIlIlIlIllllIIl - this.IlIIIIIllllllIIlllIllllll;
            Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                float f = class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3) * (float)(n4 + 1);
                if (f >= 0.7f) {
                    this.lIlllIlllIIIIlIIlllIllIII = false;
                    this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI(), n, n2, n3, -1);
                    this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                } else if (!this.IllIIIllIIIIlIlIlIllIIlll) {
                    this.lIlllIlllIIIIlIIlllIllIII = false;
                    this.IllIIIllIIIIlIlIlIllIIlll = true;
                    this.lIIIIlIlIIlllllIIllIIlIII = n;
                    this.llIIlllIllIllllIIIlIIIIII = n2;
                    this.llIIllIllIlIIlIIllIllllll = n3;
                    this.lllIIlIIIllllllIIIIlIlIlI = this.IlIIIIIllllllIIlllIllllll;
                }
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        this.lIlllIlllIIIIlIIlllIllIII = false;
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI(), this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl, -1);
    }

    private boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4, this.lllIlIIlIIIlIlIIIllIlllIl);
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        if (bl) {
            class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4);
        }
        return bl;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl() && !this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
            return false;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII() && this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIlIIIlIIllIIlIlIl() != null && this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIlIIIlIIllIIlIlIl().lllIIIllIIIIlllIlIIllIIll() instanceof class_1531) {
            return false;
        }
        Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, 2001, n, n2, n3, Block.lllIIIllIIIIlllIlIIllIIll(class_05492) + (this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) << 12));
        boolean bl = this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2088(n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll));
        } else {
            ItemStack class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIlIlIIIlIllIlIlIIlllII();
            boolean bl2 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_05492);
            if (class_08972 != null) {
                class_08972.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, n, n2, n3, this.lllIlIIlIIIlIlIIIllIlllIl);
                if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lIIIllIlIlIlIIIllIlIlIllI();
                }
            }
            if (bl && bl2) {
                class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3, n4);
            }
        }
        return bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, ItemStack class_08972) {
        int n = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        int n2 = class_08972.IllIIIllIIIIlIlIlIllIIlll();
        ItemStack class_08973 = class_08972.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142);
        if (class_08973 == class_08972 && (class_08973 == null || class_08973.lllIlIIlIIIlIlIIIllIlllIl == n && class_08973.lllIIlIIIllllllIIIIlIlIlI() <= 0 && class_08973.IllIIIllIIIIlIlIlIllIIlll() == n2)) {
            return false;
        }
        class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = class_08973;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_08973.lllIlIIlIIIlIlIIIllIlllIl = n;
            if (class_08973.lIllllIIlIIIlIllllllIIIll()) {
                class_08973.lllIlIIlIIIlIlIIIllIlllIl(n2);
            }
        }
        if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = null;
        }
        if (!class_08142.IIIlllIlIIllIIlIlIllIlIIl()) {
            ((class_1822)class_08142).lllIIIllIIIIlllIlIIllIIll(class_08142.IlIlllIIIIIIlIIllIIllIlll);
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, ItemStack class_08972, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if ((!class_08142.IIlIIlIlIlIllIIlIlIIIIlll() || class_08142.lIIIIlIlIlIIIlIIllIIlIlIl() == null) && class_13342.a_(n, n2, n3).lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142, n4, f, f2, f3)) {
            return true;
        }
        if (class_08972 == null) {
            return false;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            int n5 = class_08972.IllIIIllIIIIlIlIlIllIIlll();
            int n6 = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            boolean bl = class_08972.lllIIIllIIIIlllIlIIllIIll(class_08142, class_13342, n, n2, n3, n4, f, f2, f3);
            class_08972.lllIlIIlIIIlIlIIIllIlllIl(n5);
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = n6;
            return bl;
        }
        return class_08972.lllIIIllIIIIlllIlIIllIIll(class_08142, class_13342, n, n2, n3, n4, f, f2, f3);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0976 class_09762) {
        this.lllIIIllIIIIlllIlIIllIIll = class_09762;
    }
}

