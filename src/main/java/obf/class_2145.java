package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

public class class_2145
extends class_2037 {
    private List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private byte IlIllllllIIlIIllllIIlIIIl = 0;

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataOutput dataOutput) {
        this.IlIllllllIIlIIllllIIlIIIl = !this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty() ? ((class_2037)this.lllIlIIlIIIlIlIIIllIlllIl.get(0)).lllIIIllIIIIlllIlIIllIIll() : (byte)0;
        dataOutput.writeByte(this.IlIllllllIIlIIllllIIlIIIl);
        dataOutput.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl.size());
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.size(); ++i) {
            ((class_2037)this.lllIlIIlIIIlIlIIIllIlllIl.get(i)).lllIIIllIIIIlllIlIIllIIll(dataOutput);
        }
    }

    @Override
    void lllIIIllIIIIlllIlIIllIIll(DataInput dataInput, int n, class_1633 class_16332) {
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        class_16332.lllIIIllIIIIlllIlIIllIIll(8L);
        this.IlIllllllIIlIIllllIIlIIIl = dataInput.readByte();
        int n2 = dataInput.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
        for (int i = 0; i < n2; ++i) {
            class_2037 class_20372 = class_2037.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            class_20372.lllIIIllIIIIlllIlIIllIIll(dataInput, n + 1, class_16332);
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_20372);
        }
    }

    @Override
    public byte lllIIIllIIIIlllIlIIllIIll() {
        return 9;
    }

    @Override
    public String toString() {
        String string = "[";
        int n = 0;
        for (class_2037 class_20372 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            string = string + "" + n + ':' + class_20372 + ',';
            ++n;
        }
        return string + "]";
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2037 class_20372) {
        if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
            this.IlIllllllIIlIIllllIIlIIIl = class_20372.lllIIIllIIIIlllIlIIllIIll();
        } else if (this.IlIllllllIIlIIllllIIlIIIl != class_20372.lllIIIllIIIIlllIlIIllIIll()) {
            System.err.println("WARNING: Adding mismatching tag types to tag list");
            return;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.add(class_20372);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, class_2037 class_20372) {
        if (n >= 0 && n < this.lllIlIIlIIIlIlIIIllIlllIl.size()) {
            if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
                this.IlIllllllIIlIIllllIIlIIIl = class_20372.lllIIIllIIIIlllIlIIllIIll();
            } else if (this.IlIllllllIIlIIllllIIlIIIl != class_20372.lllIIIllIIIIlllIlIIllIIll()) {
                System.err.println("WARNING: Adding mismatching tag types to tag list");
                return;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.set(n, class_20372);
        } else {
            System.err.println("WARNING: index out of bounds to set tag in tag list");
        }
    }

    public class_2037 lllIIIllIIIIlllIlIIllIIll(int n) {
        return (class_2037)this.lllIlIIlIIIlIlIIIllIlllIl.remove(n);
    }

    public class_0775 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (n >= 0 && n < this.lllIlIIlIIIlIlIIIllIlllIl.size()) {
            class_2037 class_20372 = (class_2037)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
            return class_20372.lllIIIllIIIIlllIlIIllIIll() == 10 ? (class_0775)class_20372 : new class_0775();
        }
        return new class_0775();
    }

    public int[] IlIllllllIIlIIllllIIlIIIl(int n) {
        if (n >= 0 && n < this.lllIlIIlIIIlIlIIIllIlllIl.size()) {
            class_2037 class_20372 = (class_2037)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
            return class_20372.lllIIIllIIIIlllIlIIllIIll() == 11 ? ((class_1794)class_20372).lIlllIlllIIIIlIIlllIllIII() : new int[0];
        }
        return new int[0];
    }

    public double lIlllIlllIIIIlIIlllIllIII(int n) {
        if (n >= 0 && n < this.lllIlIIlIIIlIlIIIllIlllIl.size()) {
            class_2037 class_20372 = (class_2037)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
            return class_20372.lllIIIllIIIIlllIlIIllIIll() == 6 ? ((class_2049)class_20372).IllIIlllllllIIlIIlIIIIlIl() : 0.0;
        }
        return 0.0;
    }

    public float IlIIIIIllllllIIlllIllllll(int n) {
        if (n >= 0 && n < this.lllIlIIlIIIlIlIIIllIlllIl.size()) {
            class_2037 class_20372 = (class_2037)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
            return class_20372.lllIIIllIIIIlllIlIIllIIll() == 5 ? ((class_0112)class_20372).IIIllIllIIlIlIlIlIllllIIl() : 0.0f;
        }
        return 0.0f;
    }

    public String lIllllIIlIIIlIllllllIIIll(int n) {
        if (n >= 0 && n < this.lllIlIIlIIIlIlIIIllIlllIl.size()) {
            class_2037 class_20372 = (class_2037)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
            return class_20372.lllIIIllIIIIlllIlIIllIIll() == 8 ? class_20372.IlIllllllIIlIIllllIIlIIIl() : class_20372.toString();
        }
        return "";
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.size();
    }

    @Override
    public class_2037 lllIlIIlIIIlIlIIIllIlllIl() {
        class_2145 class_21452 = new class_2145();
        class_21452.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
        for (class_2037 class_20372 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            class_2037 class_20373 = class_20372.lllIlIIlIIIlIlIIIllIlllIl();
            class_21452.lllIlIIlIIIlIlIIIllIlllIl.add(class_20373);
        }
        return class_21452;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            class_2145 class_21452 = (class_2145)object;
            if (this.IlIllllllIIlIIllllIIlIIIl == class_21452.IlIllllllIIlIIllllIIlIIIl) {
                return this.lllIlIIlIIIlIlIIIllIlllIl.equals(class_21452.lllIlIIlIIIlIlIIIllIlllIl);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.lllIlIIlIIIlIlIIIllIlllIl.hashCode();
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

