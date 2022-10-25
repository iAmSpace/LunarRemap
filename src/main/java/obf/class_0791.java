package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class class_0791
extends class_1447 {
    private short lllIlIIlIIIlIlIIIllIlllIl;

    public class_0791() {
    }

    public class_0791(short s) {
        this.lllIlIIlIIIlIlIIIllIlllIl = s;
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeShort(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        class_16332.lllIIIllIIIIlllIlIIllIIll(16L);
        this.lllIlIIlIIIlIlIIIllIlllIl = dataInput.readShort();
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 2;
    }

    @Override
    public String toString() {
        return "" + this.lllIlIIlIIIlIlIIIllIlllIl + "s";
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_0791(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            class_0791 class_07912 = (class_0791)object;
            return this.lllIlIIlIIIlIlIIIllIlllIl == class_07912.lllIlIIlIIIlIlIIIllIlllIl;
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
        return (byte)(this.lllIlIIlIIIlIlIIIllIlllIl & 0xFF);
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

