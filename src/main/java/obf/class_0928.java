package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class class_0928
extends class_2037 {
    private String lllIlIIlIIIlIlIIIllIlllIl;

    public class_0928() {
        this.lllIlIIlIIIlIlIIIllIlllIl = "";
    }

    public class_0928(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        if (string == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        dataOutput.writeUTF(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        this.lllIlIIlIIIlIlIIIllIlllIl = dataInput.readUTF();
        class_16332.lllIIIllIIIIlllIlIIllIIll(16 * this.lllIlIIlIIIlIlIIIllIlllIl.length());
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 8;
    }

    @Override
    public String toString() {
        return "\"" + this.lllIlIIlIIIlIlIIIllIlllIl + "\"";
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_0928(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        class_0928 class_09282 = (class_0928)object;
        return this.lllIlIIlIIIlIlIIIllIlllIl == null && class_09282.lllIlIIlIIIlIlIIIllIlllIl == null || this.lllIlIIlIIIlIlIIIllIlllIl != null && this.lllIlIIlIIIlIlIIIllIlllIl.equals(class_09282.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.lllIlIIlIIIlIlIIIllIlllIl.hashCode();
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

