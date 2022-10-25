package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class class_0962 {
    private int lllIIIllIIIIlllIlIIllIIll = 0;
    private String lllIlIIlIIIlIlIIIllIlllIl = null;
    private Map IlIllllllIIlIIllllIIlIIIl = new LinkedHashMap();
    private byte[] lIlllIlllIIIIlIIlllIllIII = null;

    public class_0962(int n, String string, Map map, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = map;
        this.lIlllIlllIIIIlIIlllIllIII = arrby;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public Map IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lllIIIllIIIIlllIlIIllIIll(String string) {
        return (String)this.IlIllllllIIlIIllllIIlIIIl.get(string);
    }

    public byte[] lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }
}

