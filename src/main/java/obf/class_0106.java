package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class class_0106
extends class_1447 {
    private byte lllIlIIlIIIlIlIIIllIlllIl;

    class_0106() {
    }

    public class_0106(byte by) {
        this.lllIlIIlIIIlIlIIIllIlllIl = by;
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        class_16332.lllIIIllIIIIlllIlIIllIIll(8L);
        this.lllIlIIlIIIlIlIIIllIlllIl = dataInput.readByte();
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 1;
    }

    @Override
    public String toString() {
        return "" + this.lllIlIIlIIIlIlIIIllIlllIl + "b";
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_0106(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            class_0106 class_01062 = (class_0106)object;
            return this.lllIlIIlIIIlIlIIIllIlllIl == class_01062.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public long lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public short lIllllIIlIIIlIllllllIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public byte IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
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

