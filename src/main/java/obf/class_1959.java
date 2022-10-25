package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;

public class class_1959
extends Thread {
    private String lllIIIllIIIIlllIlIIllIIll;
    private Map lllIlIIlIIIlIlIIIllIlllIl;
    private byte[] IlIllllllIIlIIllllIIlIIIl;
    private class_0585 lIlllIlllIIIIlIIlllIllIII;

    public class_1959(String string, Map map, byte[] arrby, class_0585 class_05852) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = map;
        this.IlIllllllIIlIIllllIIlIIIl = arrby;
        this.lIlllIlllIIIIlIIlllIllIII = class_05852;
    }

    @Override
    public void run() {
        try {
            class_0482.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.IlIllllllIIlIIllllIIlIIIl, null);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.IlIllllllIIlIIllllIIlIIIl, exception);
        }
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public byte[] lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_0585 IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }
}

