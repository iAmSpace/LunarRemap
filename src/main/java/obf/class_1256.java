package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.util.UUID;
import org.apache.commons.lang3.Validate;

public class class_1256 {
    private final double lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final String IlIllllllIIlIIllllIIlIIIl;
    private final UUID lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll = true;

    public class_1256(String string, double d, int n) {
        this(UUID.randomUUID(), string, d, n);
    }

    public class_1256(UUID uUID, String string, double d, int n) {
        this.lIlllIlllIIIIlIIlllIllIII = uUID;
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        Validate.notEmpty((CharSequence)string, (String)"Modifier name cannot be empty", (Object[])new Object[0]);
        Validate.inclusiveBetween((Object)0, (Object)2, (Comparable)Integer.valueOf(n), (String)"Invalid operation", (Object[])new Object[0]);
    }

    public UUID lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public double lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public class_1256 lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = bl;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            class_1256 class_12562 = (class_1256)object;
            return !(this.lIlllIlllIIIIlIIlllIllIII != null ? !this.lIlllIlllIIIIlIIlllIllIII.equals(class_12562.lIlllIlllIIIIlIIlllIllIII) : class_12562.lIlllIlllIIIIlIIlllIllIII != null);
        }
        return false;
    }

    public int hashCode() {
        return this.lIlllIlllIIIIlIIlllIllIII != null ? this.lIlllIlllIIIIlIIlllIllIII.hashCode() : 0;
    }

    public String toString() {
        return "AttributeModifier{amount=" + this.lllIIIllIIIIlllIlIIllIIll + ", operation=" + this.lllIlIIlIIIlIlIIIllIlllIl + ", name='" + this.IlIllllllIIlIIllllIIlIIIl + '\'' + ", id=" + this.lIlllIlllIIIIlIIlllIllIII + ", serialize=" + this.IlIIIIIllllllIIlllIllllll + '}';
    }
}

