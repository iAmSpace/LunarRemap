package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class class_1231
extends class_2037 {
    private byte[] lllIlIIlIIIlIlIIIllIlllIl;

    class_1231() {
    }

    public class_1231(byte[] arrby) {
        this.lllIlIIlIIIlIlIIIllIlllIl = arrby;
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl.length);
        dataOutput.write(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        int n2 = dataInput.readInt();
        class_16332.lllIIIllIIIIlllIlIIllIIll(8 * n2);
        this.lllIlIIlIIIlIlIIIllIlllIl = new byte[n2];
        dataInput.readFully(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 7;
    }

    @Override
    public String toString() {
        return "[" + this.lllIlIIlIIIlIlIIIllIlllIl.length + " bytes]";
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        byte[] arrby = new byte[this.lllIlIIlIIIlIlIIIllIlllIl.length];
        System.arraycopy(this.lllIlIIlIIIlIlIIIllIlllIl, 0, arrby, 0, this.lllIlIIlIIIlIlIIIllIlllIl.length);
        return new class_1231(arrby);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) ? Arrays.equals(this.lllIlIIlIIIlIlIIIllIlllIl, ((class_1231)object).lllIlIIlIIIlIlIIIllIlllIl) : false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public byte[] lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

