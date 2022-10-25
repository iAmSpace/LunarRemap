package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1532 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private byte[] lIlllIlllIIIIlIIlllIllIII;
    private class_0783 IlIIIIIllllllIIlllIllllll;
    private class_0783 lIllllIIlIIIlIllllllIIIll;
    private class_0783 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0783 IllIIlllllllIIlIIlIIIIlIl;

    public class_1532(int n, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lIlllIlllIIIIlIIlllIllIII = new byte[4096];
        this.lIllllIIlIIIlIllllllIIIll = new class_0783(this.lIlllIlllIIIIlIIlllIllIII.length, 4);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0783(this.lIlllIlllIIIIlIIlllIllIII.length, 4);
        if (bl) {
            this.IllIIlllllllIIlIIlIIIIlIl = new class_0783(this.lIlllIlllIIIIlIIlllIllIII.length, 4);
        }
    }

    public Block lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = this.lIlllIlllIIIIlIIlllIllIII[n2 << 8 | n3 << 4 | n] & 0xFF;
        if (this.IlIIIIIllllllIIlllIllllll != null) {
            n4 |= this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3) << 8;
        }
        return Block.lllIIIllIIIIlllIlIIllIIll(n4);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        Block class_05493;
        int n4 = this.lIlllIlllIIIIlIIlllIllIII[n2 << 8 | n3 << 4 | n] & 0xFF;
        if (this.IlIIIIIllllllIIlllIllllll != null) {
            n4 |= this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3) << 8;
        }
        if ((class_05493 = Block.lllIIIllIIIIlllIlIIllIIll(n4)) != Blocks.lllIIIllIIIIlllIlIIllIIll) {
            --this.lllIlIIlIIIlIlIIIllIlllIl;
            if (class_05493.llIIllIllIlIIlIIllIllllll()) {
                --this.IlIllllllIIlIIllllIIlIIIl;
            }
        }
        if (class_05492 != Blocks.lllIIIllIIIIlllIlIIllIIll) {
            ++this.lllIlIIlIIIlIlIIIllIlllIl;
            if (class_05492.llIIllIllIlIIlIIllIllllll()) {
                ++this.IlIllllllIIlIIllllIIlIIIl;
            }
        }
        int n5 = Block.lllIIIllIIIIlllIlIIllIIll(class_05492);
        this.lIlllIlllIIIIlIIlllIllIII[n2 << 8 | n3 << 4 | n] = (byte)(n5 & 0xFF);
        if (n5 > 255) {
            if (this.IlIIIIIllllllIIlllIllllll == null) {
                this.IlIIIIIllllllIIlllIllllll = new class_0783(this.lIlllIlllIIIIlIIlllIllIII.length, 4);
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, (n5 & 0xF00) >> 8);
        } else if (this.IlIIIIIllllllIIlllIllllll != null) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0);
        }
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        return this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl == 0;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl > 0;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        return this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
    }

    public int lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        return this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
        this.IlIllllllIIlIIllllIIlIIIl = 0;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll(i, j, k);
                    if (class_05492 == Blocks.lllIIIllIIIIlllIlIIllIIll) continue;
                    ++this.lllIlIIlIIIlIlIIIllIlllIl;
                    if (!class_05492.llIIllIllIlIIlIIllIllllll()) continue;
                    ++this.IlIllllllIIlIIllllIIlIIIl;
                }
            }
        }
    }

    public byte[] IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.IlIIIIIllllllIIlllIllllll = null;
    }

    public class_0783 IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public class_0783 IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public class_0783 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public class_0783 IllIIIllIIIIlIlIlIllIIlll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(byte[] arrby) {
        this.lIlllIlllIIIIlIIlllIllIII = arrby;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0783 class_07832) {
        this.IlIIIIIllllllIIlllIllllll = class_07832;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0783 class_07832) {
        this.lIllllIIlIIIlIllllllIIIll = class_07832;
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0783 class_07832) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07832;
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_0783 class_07832) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_07832;
    }

    public class_0783 lIIIIlIlIIlllllIIllIIlIII() {
        this.IlIIIIIllllllIIlllIllllll = new class_0783(this.lIlllIlllIIIIlIIlllIllIII.length, 4);
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

