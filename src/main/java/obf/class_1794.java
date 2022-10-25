package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class class_1794
extends class_2037 {
    private int[] lllIlIIlIIIlIlIIIllIlllIl;

    class_1794() {
    }

    public class_1794(int[] arrn) {
        this.lllIlIIlIIIlIlIIIllIlllIl = arrn;
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl.length);
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++i) {
            dataOutput.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl[i]);
        }
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        int n2 = dataInput.readInt();
        class_16332.lllIIIllIIIIlllIlIIllIIll(32 * n2);
        this.lllIlIIlIIIlIlIIIllIlllIl = new int[n2];
        for (int i = 0; i < n2; ++i) {
            this.lllIlIIlIIIlIlIIIllIlllIl[i] = dataInput.readInt();
        }
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 11;
    }

    @Override
    public String toString() {
        String string = "[";
        for (int n : this.lllIlIIlIIIlIlIIIllIlllIl) {
            string = string + n + ",";
        }
        return string + "]";
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        int[] arrn = new int[this.lllIlIIlIIIlIlIIIllIlllIl.length];
        System.arraycopy(this.lllIlIIlIIIlIlIIIllIlllIl, 0, arrn, 0, this.lllIlIIlIIIlIlIIIllIlllIl.length);
        return new class_1794(arrn);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) ? Arrays.equals(this.lllIlIIlIIIlIlIIIllIlllIl, ((class_1794)object).lllIlIIlIIIlIlIIIllIlllIl) : false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public int[] lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

