package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1496
implements class_1843 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private class_0723[][] IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private class_1334 IlIIIIIllllllIIlllIllllll;

    public class_1496(class_1334 class_13342, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        class_0723 class_07232;
        int n8;
        int n9;
        this.IlIIIIIllllllIIlllIllllll = class_13342;
        this.lllIIIllIIIIlllIlIIllIIll = n - n7 >> 4;
        this.lllIlIIlIIIlIlIIIllIlllIl = n3 - n7 >> 4;
        int n10 = n4 + n7 >> 4;
        int n11 = n6 + n7 >> 4;
        this.IlIllllllIIlIIllllIIlIIIl = new class_0723[n10 - this.lllIIIllIIIIlllIlIIllIIll + 1][n11 - this.lllIlIIlIIIlIlIIIllIlllIl + 1];
        this.lIlllIlllIIIIlIIlllIllIII = true;
        for (n9 = this.lllIIIllIIIIlllIlIIllIIll; n9 <= n10; ++n9) {
            for (n8 = this.lllIlIIlIIIlIlIIIllIlllIl; n8 <= n11; ++n8) {
                class_07232 = class_13342.IlIIIIIllllllIIlllIllllll(n9, n8);
                if (class_07232 == null) continue;
                this.IlIllllllIIlIIllllIIlIIIl[n9 - this.lllIIIllIIIIlllIlIIllIIll][n8 - this.lllIlIIlIIIlIlIIIllIlllIl] = class_07232;
            }
        }
        for (n9 = n >> 4; n9 <= n4 >> 4; ++n9) {
            for (n8 = n3 >> 4; n8 <= n6 >> 4; ++n8) {
                class_07232 = this.IlIllllllIIlIIllllIIlIIIl[n9 - this.lllIIIllIIIIlllIlIIllIIll][n8 - this.lllIlIIlIIIlIlIIIllIlllIl];
                if (class_07232 == null || class_07232.lIlllIlllIIIIlIIlllIllIII(n2, n5)) continue;
                this.lIlllIlllIIIIlIIlllIllIII = false;
            }
        }
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public Block a_(int n, int n2, int n3) {
        Block class_05492 = Blocks.lllIIIllIIIIlllIlIIllIIll;
        if (n2 >= 0 && n2 < 256) {
            class_0723 class_07232;
            int n4 = (n >> 4) - this.lllIIIllIIIIlllIlIIllIIll;
            int n5 = (n3 >> 4) - this.lllIlIIlIIIlIlIIIllIlllIl;
            if (n4 >= 0 && n4 < this.IlIllllllIIlIIllllIIlIIIl.length && n5 >= 0 && n5 < this.IlIllllllIIlIIllllIIlIIIl[n4].length && (class_07232 = this.IlIllllllIIlIIllllIIlIIIl[n4][n5]) != null) {
                class_05492 = class_07232.lllIlIIlIIIlIlIIIllIlllIl(n & 0xF, n2, n3 & 0xF);
            }
        }
        return class_05492;
    }

    @Override
    public class_1774 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        int n4 = (n >> 4) - this.lllIIIllIIIIlllIlIIllIIll;
        int n5 = (n3 >> 4) - this.lllIlIIlIIIlIlIIIllIlllIl;
        return this.IlIllllllIIlIIllllIIlIIIl[n4][n5].IlIIIIIllllllIIlllIllllll(n & 0xF, n2, n3 & 0xF);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5 = this.lllIIIllIIIIlllIlIIllIIll(class_1346.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        int n6 = this.lllIIIllIIIIlllIlIIllIIll(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3);
        if (n6 < n4) {
            n6 = n4;
        }
        return n5 << 20 | n6 << 4;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        if (n2 < 0) {
            return 0;
        }
        if (n2 >= 256) {
            return 0;
        }
        int n4 = (n >> 4) - this.lllIIIllIIIIlllIlIIllIIll;
        int n5 = (n3 >> 4) - this.lllIlIIlIIIlIlIIIllIlllIl;
        return this.IlIllllllIIlIIllllIIlIIIl[n4][n5].IlIllllllIIlIIllllIIlIIIl(n & 0xF, n2, n3 & 0xF);
    }

    @Override
    public class_0672 a_(int n, int n2) {
        return this.IlIIIIIllllllIIlllIllllll.a_(n, n2);
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        return this.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1346 class_13462, int n, int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        if (n2 >= 0 && n2 < 256 && n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 <= 30000000) {
            if (class_13462 == class_1346.lllIIIllIIIIlllIlIIllIIll && this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
                return 0;
            }
            if (this.a_(n, n2, n3).IlIIIIIllllllIIlllIllllll()) {
                int n4 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n, n2 + 1, n3);
                int n5 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n + 1, n2, n3);
                int n6 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n - 1, n2, n3);
                int n7 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n, n2, n3 + 1);
                int n8 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n, n2, n3 - 1);
                if (n5 > n4) {
                    n4 = n5;
                }
                if (n6 > n4) {
                    n4 = n6;
                }
                if (n7 > n4) {
                    n4 = n7;
                }
                if (n8 > n4) {
                    n4 = n8;
                }
                return n4;
            }
            int n9 = (n >> 4) - this.lllIIIllIIIIlllIlIIllIIll;
            int n10 = (n3 >> 4) - this.lllIlIIlIIIlIlIIIllIlllIl;
            return this.IlIllllllIIlIIllllIIlIIIl[n9][n10].lllIIIllIIIIlllIlIIllIIll(class_13462, n & 0xF, n2, n3 & 0xF);
        }
        return class_13462.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(class_1346 class_13462, int n, int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        if (n2 >= 0 && n2 < 256 && n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 <= 30000000) {
            int n4 = (n >> 4) - this.lllIIIllIIIIlllIlIIllIIll;
            int n5 = (n3 >> 4) - this.lllIlIIlIIIlIlIIIllIlllIl;
            return this.IlIllllllIIlIIllllIIlIIIl[n4][n5].lllIIIllIIIIlllIlIIllIIll(class_13462, n & 0xF, n2, n3 & 0xF);
        }
        return class_13462.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return 256;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        return this.a_(n, n2, n3).IlIIIIIllllllIIlllIllllll(this, n, n2, n3, n4);
    }
}

