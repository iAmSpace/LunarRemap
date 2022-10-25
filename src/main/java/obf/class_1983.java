package obf;

/*
 * Decompiled with CFR 0.150.
 */
public final class class_1983
implements Comparable {
    public double lllIIIllIIIIlllIlIIllIIll;
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public String IlIllllllIIlIIllllIIlIIIl;

    public class_1983(String string, double d, double d2) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1983 class_19832) {
        return class_19832.lllIIIllIIIIlllIlIIllIIll < this.lllIIIllIIIIlllIlIIllIIll ? -1 : (class_19832.lllIIIllIIIIlllIlIIllIIll > this.lllIIIllIIIIlllIlIIllIIll ? 1 : class_19832.IlIllllllIIlIIllllIIlIIIl.compareTo(this.IlIllllllIIlIIllllIIlIIIl));
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return (this.IlIllllllIIlIIllllIIlIIIl.hashCode() & 0xAAAAAA) + 0x444444;
    }

    public int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1983)object);
    }
}

