package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class class_1461
extends class_1447 {
    private long lllIlIIlIIIlIlIIIllIlllIl;

    class_1461() {
    }

    public class_1461(long l) {
        this.lllIlIIlIIIlIlIIIllIlllIl = l;
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeLong(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        class_16332.lllIIIllIIIIlllIlIIllIIll(64L);
        this.lllIlIIlIIIlIlIIIllIlllIl = dataInput.readLong();
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 4;
    }

    @Override
    public String toString() {
        return "" + this.lllIlIIlIIIlIlIIIllIlllIl + "L";
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_1461(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            class_1461 class_14612 = (class_1461)object;
            return this.lllIlIIlIIIlIlIIIllIlllIl == class_14612.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.lllIlIIlIIIlIlIIIllIlllIl ^ this.lllIlIIlIIIlIlIIIllIlllIl >>> 32);
    }

    @Override
    public long lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return (int)(this.lllIlIIlIIIlIlIIIllIlllIl & 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public short lIllllIIlIIIlIllllllIIIll() {
        return (short)(this.lllIlIIlIIIlIlIIIllIlllIl & 0xFFFFL);
    }

    @Override
    public byte IIIllIIlIIIIIIlIlIIllIIlI() {
        return (byte)(this.lllIlIIlIIIlIlIIIllIlllIl & 0xFFL);
    }

    @Override
    public double IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public float IIIllIllIIlIlIlIlIllllIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

