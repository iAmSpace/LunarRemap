package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;
import java.util.List;

public class class_0678 {
    public static final Comparator lllIIIllIIIIlllIlIIllIIll = new class_0956();
    private final class_0141 lllIlIIlIIIlIlIIIllIlllIl;
    private final class_0693 IlIllllllIIlIIllllIIlIIIl;
    private final String lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public class_0678(class_0141 class_01412, class_0693 class_06932, String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01412;
        this.IlIllllllIIlIIllllIIlIIIl = class_06932;
        this.lIlllIlllIIIIlIIlllIllIII = string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl() + n);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl() - n);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        int n2 = this.IlIIIIIllllllIIlllIllllll;
        this.IlIIIIIllllllIIlllIllllll = n;
        if (n2 != n) {
            this.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    public class_0693 IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public class_0141 IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(list));
    }
}

