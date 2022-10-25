package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1103 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private Block lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;

    public class_1103(int n, int n2, int n3, Block class_05492, int n4, int n5) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.IlIIIIIllllllIIlllIllllll = n4;
        this.lIllllIIlIIIlIllllllIIIll = n5;
        this.lIlllIlllIIIIlIIlllIllIII = class_05492;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public Block lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class_1103)) {
            return false;
        }
        class_1103 class_11032 = (class_1103)object;
        return this.lllIIIllIIIIlllIlIIllIIll == class_11032.lllIIIllIIIIlllIlIIllIIll && this.lllIlIIlIIIlIlIIIllIlllIl == class_11032.lllIlIIlIIIlIlIIIllIlllIl && this.IlIllllllIIlIIllllIIlIIIl == class_11032.IlIllllllIIlIIllllIIlIIIl && this.IlIIIIIllllllIIlllIllllll == class_11032.IlIIIIIllllllIIlllIllllll && this.lIllllIIlIIIlIllllllIIIll == class_11032.lIllllIIlIIIlIllllllIIIll && this.lIlllIlllIIIIlIIlllIllIII == class_11032.lIlllIlllIIIIlIIlllIllIII;
    }

    public String toString() {
        return "TE(" + this.lllIIIllIIIIlllIlIIllIIll + "," + this.lllIlIIlIIIlIlIIIllIlllIl + "," + this.IlIllllllIIlIIllllIIlIIIl + ")," + this.IlIIIIIllllllIIlllIllllll + "," + this.lIllllIIlIIIlIllllllIIIll + "," + this.lIlllIlllIIIIlIIlllIllIII;
    }
}

