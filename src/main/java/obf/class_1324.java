package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1324 {
    private Block lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl = 1;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_1324(int n, Block class_05492) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
    }

    public class_1324(int n, Block class_05492, int n2) {
        this(n, class_05492);
        this.IlIllllllIIlIIllllIIlIIIl = n2;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public Block lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lIlllIlllIIIIlIIlllIllIII = n;
    }

    public String toString() {
        String string = Integer.toString(Block.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 1) {
            string = this.lllIlIIlIIIlIlIIIllIlllIl + "x" + string;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl > 0) {
            string = string + ":" + this.IlIllllllIIlIIllllIIlIIIl;
        }
        return string;
    }
}

