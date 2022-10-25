package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public abstract class class_2037 {
    public static final String[] lllIIIllIIIIlllIlIIllIIll = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]"};

    abstract void lllIIIllIIIIlllIlIIllIIll(DataOutput var1);

    abstract void lllIIIllIIIIlllIlIIllIIll(DataInput var1, int var2, class_1633 var3);

    public abstract String toString();

    public abstract byte lllIIIllIIIIlllIlIIllIIll();

    protected static class_2037 lllIIIllIIIIlllIlIIllIIll(byte by) {
        switch (by) {
            case 0: {
                return new class_1011();
            }
            case 1: {
                return new class_0106();
            }
            case 2: {
                return new class_0791();
            }
            case 3: {
                return new class_1598();
            }
            case 4: {
                return new class_1461();
            }
            case 5: {
                return new class_0112();
            }
            case 6: {
                return new class_2049();
            }
            case 7: {
                return new class_1231();
            }
            case 8: {
                return new class_0928();
            }
            case 9: {
                return new class_2145();
            }
            case 10: {
                return new class_0775();
            }
            case 11: {
                return new class_1794();
            }
        }
        return null;
    }

    public abstract class_2037 lllIlIIlIIIlIlIIIllIlllIl();

    public boolean equals(Object object) {
        if (!(object instanceof class_2037)) {
            return false;
        }
        class_2037 class_20372 = (class_2037)object;
        return this.lllIIIllIIIIlllIlIIllIIll() == class_20372.lllIIIllIIIIlllIlIIllIIll();
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }

    protected String IlIllllllIIlIIllllIIlIIIl() {
        return this.toString();
    }
}

