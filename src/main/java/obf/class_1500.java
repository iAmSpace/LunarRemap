package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;

public class class_1500
implements class_1690 {
    protected Object lllIIIllIIIIlllIlIIllIIll;
    protected Object lllIlIIlIIIlIlIIIllIlllIl;

    public class_1500(Object object, Object object2) {
        this.lllIIIllIIIIlllIlIIllIIll = object;
        this.lllIlIIlIIIlIlIIIllIlllIl = object2;
    }

    public Object getKey() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public Object getValue() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        return (this.lllIIIllIIIIlllIlIIllIIll == null ? entry.getKey() == null : this.lllIIIllIIIIlllIlIIllIIll.equals(entry.getKey())) && (this.lllIlIIlIIIlIlIIIllIlllIl == null ? entry.getValue() == null : this.lllIlIIlIIIlIlIIIllIlllIl.equals(entry.getValue()));
    }

    @Override
    public int hashCode() {
        return (this.lllIIIllIIIIlllIlIIllIIll == null ? 0 : this.lllIIIllIIIIlllIlIIllIIll.hashCode()) ^ (this.lllIlIIlIIIlIlIIIllIlllIl == null ? 0 : this.lllIlIIlIIIlIlIIIllIlllIl.hashCode());
    }

    public String toString() {
        return this.lllIIIllIIIIlllIlIIllIIll + "->" + this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

