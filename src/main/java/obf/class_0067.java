package obf;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_0067
implements class_2191 {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private final double lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;

    protected class_0067(String string, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public double lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_0067 lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIllllllIIlIIllllIIlIIIl = bl;
        return this;
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll.hashCode();
    }
}

