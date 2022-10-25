package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0930 {
    private final class_1334 lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll = 0;
    private class_2208 lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;

    public class_0930(class_1334 class_13342, int n, int n2, int n3, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
        this.lllIlIIlIIIlIlIIIllIlllIl = n4;
        this.lIlllIlllIIIIlIIlllIllIII = class_1610.llllllIlIllllIlIlIlIIIIlI[n4][0];
        this.IlIllllllIIlIIllllIIlIIIl = class_1610.llllllIlIllllIlIlIlIIIIlI[n4][1];
        int n5 = n2;
        while (n2 > n5 - 21 && n2 > 0 && this.lllIIIllIIIIlllIlIIllIIll(class_13342.a_(n, n2 - 1, n3))) {
            --n2;
        }
        n5 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.lIlllIlllIIIIlIIlllIllIII) - 1;
        if (n5 >= 0) {
            this.lIllllIIlIIIlIllllllIIIll = new class_2208(n + n5 * class_1632.lllIIIllIIIIlllIlIIllIIll[this.lIlllIlllIIIIlIIlllIllIII], n2, n3 + n5 * class_1632.lllIlIIlIIIlIlIIIllIlllIl[this.lIlllIlllIIIIlIIlllIllIII]);
            this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll, this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl, this.IlIllllllIIlIIllllIIlIIIl);
            if (this.IllIIlllllllIIlIIlIIIIlIl < 2 || this.IllIIlllllllIIlIIlIIIIlIl > 21) {
                this.lIllllIIlIIIlIllllllIIIll = null;
                this.IllIIlllllllIIlIIlIIIIlIl = 0;
            }
        }
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    protected int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        Block class_05492;
        Block class_05493;
        int n5;
        int n6 = class_1632.lllIIIllIIIIlllIlIIllIIll[n4];
        int n7 = class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4];
        for (n5 = 0; n5 < 22 && this.lllIIIllIIIIlllIlIIllIIll(class_05493 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + n6 * n5, n2, n3 + n7 * n5)) && (class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + n6 * n5, n2 - 1, n3 + n7 * n5)) == Blocks.obsidian; ++n5) {
        }
        class_05493 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + n6 * n5, n2, n3 + n7 * n5);
        return class_05493 == Blocks.obsidian ? n5 : 0;
    }

    protected int lllIIIllIIIIlllIlIIllIIll() {
        int n;
        int n2;
        int n3;
        int n4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
        block0: while (this.IIIllIIlIIIIIIlIlIIllIIlI < 21) {
            n4 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl + this.IIIllIIlIIIIIIlIlIIllIIlI;
            for (n3 = 0; n3 < this.IllIIlllllllIIlIIlIIIIlIl; ++n3) {
                n2 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll + n3 * class_1632.lllIIIllIIIIlllIlIIllIIll[class_1610.llllllIlIllllIlIlIlIIIIlI[this.lllIlIIlIIIlIlIIIllIlllIl][1]];
                n = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl + n3 * class_1632.lllIlIIlIIIlIlIIIllIlllIl[class_1610.llllllIlIllllIlIlIlIIIIlI[this.lllIlIIlIIIlIlIIIllIlllIl][1]];
                Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n2, n4, n);
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_05492)) break block0;
                if (class_05492 == Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                    ++this.IlIIIIIllllllIIlllIllllll;
                }
                if (n3 == 0 ? (class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n2 + class_1632.lllIIIllIIIIlllIlIIllIIll[class_1610.llllllIlIllllIlIlIlIIIIlI[this.lllIlIIlIIIlIlIIIllIlllIl][0]], n4, n + class_1632.lllIlIIlIIIlIlIIIllIlllIl[class_1610.llllllIlIllllIlIlIlIIIIlI[this.lllIlIIlIIIlIlIIIllIlllIl][0]])) != Blocks.obsidian : n3 == this.IllIIlllllllIIlIIlIIIIlIl - 1 && (class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n2 + class_1632.lllIIIllIIIIlllIlIIllIIll[class_1610.llllllIlIllllIlIlIlIIIIlI[this.lllIlIIlIIIlIlIIIllIlllIl][1]], n4, n + class_1632.lllIlIIlIIIlIlIIIllIlllIl[class_1610.llllllIlIllllIlIlIlIIIIlI[this.lllIlIIlIIIlIlIIIllIlllIl][1]])) != Blocks.obsidian) break block0;
            }
            ++this.IIIllIIlIIIIIIlIlIIllIIlI;
        }
        for (n4 = 0; n4 < this.IllIIlllllllIIlIIlIIIIlIl; ++n4) {
            n3 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll + n4 * class_1632.lllIIIllIIIIlllIlIIllIIll[class_1610.llllllIlIllllIlIlIlIIIIlI[this.lllIlIIlIIIlIlIIIllIlllIl][1]];
            n2 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl + this.IIIllIIlIIIIIIlIlIIllIIlI;
            n = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl + n4 * class_1632.lllIlIIlIIIlIlIIIllIlllIl[class_1610.llllllIlIllllIlIlIlIIIIlI[this.lllIlIIlIIIlIlIIIllIlllIl][1]];
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n3, n2, n) == Blocks.obsidian) continue;
            this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
            break;
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI <= 21 && this.IIIllIIlIIIIIIlIlIIllIIlI >= 3) {
            return this.IIIllIIlIIIIIIlIlIIllIIlI;
        }
        this.lIllllIIlIIIlIllllllIIIll = null;
        this.IllIIlllllllIIlIIlIIIIlIl = 0;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
        return 0;
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492) {
        return class_05492.IlIlIIlllIllllllllIIIlIlI == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492 == Blocks.lIIlIlllIllIlIlllIIIIIIII || class_05492 == Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll != null && this.IllIIlllllllIIlIIlIIIIlIl >= 2 && this.IllIIlllllllIIlIIlIIIIlIl <= 21 && this.IIIllIIlIIIIIIlIlIIllIIlI >= 3 && this.IIIllIIlIIIIIIlIlIIllIIlI <= 21;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl; ++i) {
            int n = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll + class_1632.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl] * i;
            int n2 = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl + class_1632.lllIlIIlIIIlIlIIIllIlllIl[this.IlIllllllIIlIIllllIIlIIIl] * i;
            for (int j = 0; j < this.IIIllIIlIIIIIIlIlIIllIIlI; ++j) {
                int n3 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl + j;
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n3, n2, Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI, this.lllIlIIlIIIlIlIIIllIlllIl, 2);
            }
        }
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(class_0930 class_09302) {
        return class_09302.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(class_0930 class_09302) {
        return class_09302.IllIIlllllllIIlIIlIIIIlIl;
    }

    static /* synthetic */ int IlIllllllIIlIIllllIIlIIIl(class_0930 class_09302) {
        return class_09302.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

