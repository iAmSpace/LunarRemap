package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class class_0531
extends class_0827 {
    private final class_0141 lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private final Set IlIllllllIIlIIllllIIlIIIl = new HashSet();
    private String lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll = "";
    private String lIllllIIlIIIlIllllllIIIll = "";
    private boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    private boolean IllIIlllllllIIlIIlIIIIlIl = true;

    public class_0531(class_0141 class_01412, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01412;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.lIlllIlllIIIIlIIlllIllIII = string;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.lIlllIlllIIIIlIIlllIllIII = string;
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this);
    }

    public Collection IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.IlIIIIIllllllIIlllIllllll = string;
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this);
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Suffix cannot be null");
        }
        this.lIllllIIlIIIlIllllllIIIll = string;
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this);
    }

    @Override
    public String lIlllIlllIIIIlIIlllIllIII(String string) {
        return this.lIlllIlllIIIIlIIlllIllIII() + string + this.IlIIIIIllllllIIlllIllllll();
    }

    public static String lllIIIllIIIIlllIlIIllIIll(class_0827 class_08272, String string) {
        return class_08272 == null ? string : class_08272.lIlllIlllIIIIlIIlllIllIII(string);
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this);
    }

    @Override
    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl = bl;
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this);
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        int n = 0;
        if (this.lIllllIIlIIIlIllllllIIIll()) {
            n |= 1;
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI()) {
            n |= 2;
        }
        return n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllIIIllIIIIlllIlIIllIIll((n & 1) > 0);
        this.lllIlIIlIIIlIlIIIllIlllIl((n & 2) > 0);
    }
}

