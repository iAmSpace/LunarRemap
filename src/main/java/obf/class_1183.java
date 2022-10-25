package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class class_1183
extends class_0475
implements Serializable,
class_0580 {
    private static final long lllIlIIlIIIlIlIIIllIlllIl = -4940583368468432370L;

    protected class_1183() {
    }

    @Override
    public boolean containsValue(Object object) {
        return this.IlIllllllIIlIIllllIIlIIIl().contains(object);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.lllIlIIlIIIlIlIIIllIlllIl().contains(object);
    }

    public void putAll(Map map) {
        int n = map.size();
        Iterator iterator = map.entrySet().iterator();
        if (map instanceof class_0580) {
            while (n-- != 0) {
                class_1690 class_16902 = (class_1690)iterator.next();
                this.put(class_16902.getKey(), class_16902.getValue());
            }
        } else {
            while (n-- != 0) {
                Map.Entry entry = iterator.next();
                this.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public class_1729 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_1803(this);
    }

    @Override
    public class_1888 IlIllllllIIlIIllllIIlIIIl() {
        return new class_1810(this);
    }

    @Override
    public class_1729 lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public int hashCode() {
        int n = 0;
        int n2 = this.size();
        class_0353 class_03532 = this.lIlllIlllIIIIlIIlllIllIII().lllIIIllIIIIlllIlIIllIIll();
        while (n2-- != 0) {
            n += ((Map.Entry)class_03532.next()).hashCode();
        }
        return n;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map)) {
            return false;
        }
        Map map = (Map)object;
        if (map.size() != this.size()) {
            return false;
        }
        return this.lIlllIlllIIIIlIIlllIllIII().containsAll(map.entrySet());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        class_0353 class_03532 = this.lIlllIlllIIIIlIIlllIllIII().lllIIIllIIIIlllIlIIllIIll();
        int n = this.size();
        boolean bl = true;
        stringBuilder.append("{");
        while (n-- != 0) {
            if (bl) {
                bl = false;
            } else {
                stringBuilder.append(", ");
            }
            class_1690 class_16902 = (class_1690)class_03532.next();
            if (this == class_16902.getKey()) {
                stringBuilder.append("(this map)");
            } else {
                stringBuilder.append(String.valueOf(class_16902.getKey()));
            }
            stringBuilder.append("=>");
            if (this == class_16902.getValue()) {
                stringBuilder.append("(this map)");
                continue;
            }
            stringBuilder.append(String.valueOf(class_16902.getValue()));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return this.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.lllIlIIlIIIlIlIIIllIlllIl();
    }
}

