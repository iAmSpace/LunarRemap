package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class class_1416 {
    private String lIllllIIlIIIlIllllllIIIll = null;
    private int IIIllIIlIIIIIIlIlIIllIIlI = 0;
    private Proxy IllIIlllllllIIlIIlIIIIlIl = Proxy.NO_PROXY;
    private String IIIllIllIIlIlIlIlIllllIIl = null;
    private String IllIIIllIIIIlIlIlIllIIlll = null;
    private String lIIIIlIlIIlllllIIllIIlIII = null;
    private Map llIIlllIllIllllIIIlIIIIII = new LinkedHashMap();
    private byte[] llIIllIllIlIIlIIllIllllll = null;
    private int lllIIlIIIllllllIIIIlIlIlI = 0;
    public static final String lllIIIllIIIIlllIlIIllIIll = "GET";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = "HEAD";
    public static final String IlIllllllIIlIIllllIIlIIIl = "POST";
    public static final String lIlllIlllIIIIlIIlllIllIII = "HTTP/1.0";
    public static final String IlIIIIIllllllIIlllIllllll = "HTTP/1.1";

    public class_1416(String string, int n, Proxy proxy, String string2, String string3, String string4, Map map, byte[] arrby) {
        this.lIllllIIlIIIlIllllllIIIll = string;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        this.IllIIlllllllIIlIIlIIIIlIl = proxy;
        this.IIIllIllIIlIlIlIlIllllIIl = string2;
        this.IllIIIllIIIIlIlIlIllIIlll = string3;
        this.lIIIIlIlIIlllllIIllIIlIII = string4;
        this.llIIlllIllIllllIIIlIIIIII = map;
        this.llIIllIllIlIIlIIllIllllll = arrby;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public Map lIllllIIlIIIlIllllllIIIll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public byte[] IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllIIlIIIllllllIIIIlIlIlI = n;
    }

    public Proxy IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

