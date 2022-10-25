package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0203 {
    private final class_1936 lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;

    public class_0203(class_1936 class_19362, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19362;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public class_1936 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            class_0203 class_02032 = (class_0203)object;
            if (this.lllIIIllIIIIlllIlIIllIIll != class_02032.lllIIIllIIIIlllIlIIllIIll) {
                return false;
            }
            return !(this.lllIlIIlIIIlIlIIIllIlllIl != null ? !this.lllIlIIlIIIlIlIIIllIlllIl.equals(class_02032.lllIlIIlIIIlIlIIIllIlllIl) : class_02032.lllIlIIlIIIlIlIIIllIlllIl != null);
        }
        return false;
    }

    public String toString() {
        return "ClickEvent{action=" + (Object)((Object)this.lllIIIllIIIIlllIlIIllIIll) + ", value='" + this.lllIlIIlIIIlIlIIIllIlllIl + '\'' + '}';
    }

    public int hashCode() {
        int n = this.lllIIIllIIIIlllIlIIllIIll.hashCode();
        n = 31 * n + (this.lllIlIIlIIIlIlIIIllIlllIl != null ? this.lllIlIIlIIIlIlIIIllIlllIl.hashCode() : 0);
        return n;
    }
}

