package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

public class class_1921
extends class_0265
implements class_2239 {
    protected final class_1355 lllIIIllIIIIlllIlIIllIIll = new class_1355();
    protected final Map lllIlIIlIIIlIlIIIllIlllIl = ((BiMap)this.IlIllllllIIlIIllllIIlIIIl).inverse();

    public void lllIIIllIIIIlllIlIIllIIll(int n, String string, Object object) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(object, n);
        this.putObject(class_1921.IlIllllllIIlIIllllIIlIIIl(string), object);
    }

    @Override
    protected Map lllIIIllIIIIlllIlIIllIIll() {
        return HashBiMap.create();
    }

    public Object getObject(String string) {
        return super.lllIIIllIIIIlllIlIIllIIll(class_1921.IlIllllllIIlIIllllIIlIIIl(string));
    }

    public String lllIlIIlIIIlIlIIIllIlllIl(Object object) {
        return (String)this.lllIlIIlIIIlIlIIIllIlllIl.get(object);
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return super.lIlllIlllIIIIlIIlllIllIII(class_1921.IlIllllllIIlIIllllIIlIIIl(string));
    }

    public int IlIllllllIIlIIllllIIlIIIl(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(object);
    }

    public Object lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n);
    }

    public Iterator iterator() {
        return this.lllIIIllIIIIlllIlIIllIIll.iterator();
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n);
    }

    private static String IlIllllllIIlIIllllIIlIIIl(String string) {
        return string.indexOf(58) == -1 ? "minecraft:" + string : string;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(Object object) {
        return this.lllIlIIlIIIlIlIIIllIlllIl((String)object);
    }

    @Override
    public Object lllIIIllIIIIlllIlIIllIIll(Object object) {
        return this.getObject((String)object);
    }
}

