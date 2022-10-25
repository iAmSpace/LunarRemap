package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0560
extends class_1921 {
    private final String lIlllIlllIIIIlIIlllIllIII;
    private Object IlIIIIIllllllIIlllIllllll;

    public class_0560(String string) {
        this.lIlllIlllIIIIlIIlllIllIII = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, String string, Object object) {
        if (this.lIlllIlllIIIIlIIlllIllIII.equals(string)) {
            this.IlIIIIIllllllIIlllIllllll = object;
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, string, object);
    }

    @Override
    public Object getObject(String string) {
        Object object = super.getObject(string);
        return object == null ? this.IlIIIIIllllllIIlllIllllll : object;
    }

    @Override
    public Object lllIIIllIIIIlllIlIIllIIll(int n) {
        Object object = super.lllIIIllIIIIlllIlIIllIIll(n);
        return object == null ? this.IlIIIIIllllllIIlllIllllll : object;
    }

    @Override
    public Object lllIIIllIIIIlllIlIIllIIll(Object object) {
        return this.getObject((String)object);
    }
}

