package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class class_1598
extends class_1447 {
    private int lllIlIIlIIIlIlIIIllIlllIl;

    class_1598() {
    }

    public class_1598(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        class_16332.lllIIIllIIIIlllIlIIllIIll(32L);
        this.lllIlIIlIIIlIlIIIllIlllIl = dataInput.readInt();
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 3;
    }

    @Override
    public String toString() {
        return "" + this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_1598(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            class_1598 class_15982 = (class_1598)object;
            return this.lllIlIIlIIIlIlIIIllIlllIl == class_15982.lllIlIIlIIIlIlIIIllIlllIl;
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
        return (short)(this.lllIlIIlIIIlIlIIIllIlllIl & 0xFFFF);
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

