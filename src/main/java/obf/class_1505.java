package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1505
implements Comparable {
    private static long lIllllIIlIIIlIllllllIIIll;
    private final Block IIIllIIlIIIIIIlIlIIllIIlI;
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public long lIlllIlllIIIIlIIlllIllIII;
    public int IlIIIIIllllllIIlllIllllll;
    private long IllIIlllllllIIlIIlIIIIlIl = lIllllIIlIIIlIllllllIIIll++;

    public class_1505(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_05492;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class_1505)) {
            return false;
        }
        class_1505 class_15052 = (class_1505)object;
        return this.lllIIIllIIIIlllIlIIllIIll == class_15052.lllIIIllIIIIlllIlIIllIIll && this.lllIlIIlIIIlIlIIIllIlllIl == class_15052.lllIlIIlIIIlIlIIIllIlllIl && this.IlIllllllIIlIIllllIIlIIIl == class_15052.IlIllllllIIlIIllllIIlIIIl && Block.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, class_15052.IIIllIIlIIIIIIlIlIIllIIlI);
    }

    public int hashCode() {
        return (this.lllIIIllIIIIlllIlIIllIIll * 1024 * 1024 + this.IlIllllllIIlIIllllIIlIIIl * 1024 + this.lllIlIIlIIIlIlIIIllIlllIl) * 256;
    }

    public class_1505 lllIIIllIIIIlllIlIIllIIll(long l) {
        this.lIlllIlllIIIIlIIlllIllIII = l;
        return this;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIIIIIllllllIIlllIllllll = n;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1505 class_15052) {
        return this.lIlllIlllIIIIlIIlllIllIII < class_15052.lIlllIlllIIIIlIIlllIllIII ? -1 : (this.lIlllIlllIIIIlIIlllIllIII > class_15052.lIlllIlllIIIIlIIlllIllIII ? 1 : (this.IlIIIIIllllllIIlllIllllll != class_15052.IlIIIIIllllllIIlllIllllll ? this.IlIIIIIllllllIIlllIllllll - class_15052.IlIIIIIllllllIIlllIllllll : (this.IllIIlllllllIIlIIlIIIIlIl < class_15052.IllIIlllllllIIlIIlIIIIlIl ? -1 : (this.IllIIlllllllIIlIIlIIIIlIl > class_15052.IllIIlllllllIIlIIlIIIIlIl ? 1 : 0))));
    }

    public String toString() {
        return Block.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI) + ": (" + this.lllIIIllIIIIlllIlIIllIIll + ", " + this.lllIlIIlIIIlIlIIIllIlllIl + ", " + this.IlIllllllIIlIIllllIIlIIIl + "), " + this.lIlllIlllIIIIlIIlllIllIII + ", " + this.IlIIIIIllllllIIlllIllllll + ", " + this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public Block lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1505)object);
    }
}

