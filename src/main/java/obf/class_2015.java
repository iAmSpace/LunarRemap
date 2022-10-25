package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.beans.ConstructorProperties;

public class class_2015 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private String lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII;

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public void IlIllllllIIlIIllllIIlIIIl(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    public void lIlllIlllIIIIlIIlllIllIII(String string) {
        this.lIlllIlllIIIIlIIlllIllIII = string;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class_2015)) {
            return false;
        }
        class_2015 class_20152 = (class_2015)object;
        if (!class_20152.lllIIIllIIIIlllIlIIllIIll(this)) {
            return false;
        }
        String string = this.lllIIIllIIIIlllIlIIllIIll();
        String string2 = class_20152.lllIIIllIIIIlllIlIIllIIll();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.lllIlIIlIIIlIlIIIllIlllIl();
        String string4 = class_20152.lllIlIIlIIIlIlIIIllIlllIl();
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return false;
        }
        String string5 = this.IlIllllllIIlIIllllIIlIIIl();
        String string6 = class_20152.IlIllllllIIlIIllllIIlIIIl();
        if (string5 == null ? string6 != null : !string5.equals(string6)) {
            return false;
        }
        String string7 = this.lIlllIlllIIIIlIIlllIllIII();
        String string8 = class_20152.lIlllIlllIIIIlIIlllIllIII();
        return !(string7 == null ? string8 != null : !string7.equals(string8));
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(Object object) {
        return object instanceof class_2015;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        String string = this.lllIIIllIIIIlllIlIIllIIll();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.lllIlIIlIIIlIlIIIllIlllIl();
        n2 = n2 * 59 + (string2 == null ? 43 : string2.hashCode());
        String string3 = this.IlIllllllIIlIIllllIIlIIIl();
        n2 = n2 * 59 + (string3 == null ? 43 : string3.hashCode());
        String string4 = this.lIlllIlllIIIIlIIlllIllIII();
        n2 = n2 * 59 + (string4 == null ? 43 : string4.hashCode());
        return n2;
    }

    public String toString() {
        return "AccountProfile(uuid=" + this.lllIIIllIIIIlllIlIIllIIll() + ", username=" + this.lllIlIIlIIIlIlIIIllIlllIl() + ", accessToken=" + this.IlIllllllIIlIIllllIIlIIIl() + ", displayName=" + this.lIlllIlllIIIIlIIlllIllIII() + ")";
    }

    @ConstructorProperties(value={"uuid", "username", "accessToken", "displayName"})
    public class_2015(String string, String string2, String string3, String string4) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
        this.IlIllllllIIlIIllllIIlIIIl = string3;
        this.lIlllIlllIIIIlIIlllIllIII = string4;
    }
}

