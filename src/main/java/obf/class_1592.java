package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class class_1592
implements Map {
    private final Map lllIIIllIIIIlllIlIIllIIll = new LinkedHashMap();

    @Override
    public int size() {
        return this.lllIIIllIIIIlllIlIIllIIll.size();
    }

    @Override
    public boolean isEmpty() {
        return this.lllIIIllIIIIlllIlIIllIIll.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.containsKey(object.toString().toLowerCase());
    }

    @Override
    public boolean containsValue(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.containsKey(object);
    }

    public Object get(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.get(object.toString().toLowerCase());
    }

    public Object lllIIIllIIIIlllIlIIllIIll(String string, Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.put(string.toLowerCase(), object);
    }

    public Object remove(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.remove(object.toString().toLowerCase());
    }

    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.lllIIIllIIIIlllIlIIllIIll((String)entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
    }

    public Set keySet() {
        return this.lllIIIllIIIIlllIlIIllIIll.keySet();
    }

    public Collection values() {
        return this.lllIIIllIIIIlllIlIIllIIll.values();
    }

    public Set entrySet() {
        return this.lllIIIllIIIIlllIlIIllIIll.entrySet();
    }

    public Object put(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((String)object, object2);
    }
}

