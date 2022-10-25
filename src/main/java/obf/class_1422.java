package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_1422 {
    private ArrayList lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    boolean lllIIIllIIIIlllIlIIllIIll;

    public synchronized boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public synchronized void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIIIllIIIIlllIlIIllIIll = false;
    }

    public synchronized List IlIllllllIIlIIllllIIlIIIl() {
        return Collections.unmodifiableList(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public synchronized void lllIIIllIIIIlllIlIIllIIll(String string, InetAddress inetAddress) {
        String string2 = class_0014.lllIIIllIIIIlllIlIIllIIll(string);
        String string3 = class_0014.lllIlIIlIIIlIlIIIllIlllIl(string);
        if (string3 != null) {
            string3 = inetAddress.getHostAddress() + ":" + string3;
            boolean bl = false;
            for (class_0494 class_04942 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                if (!class_04942.lllIlIIlIIIlIlIIIllIlllIl().equals(string3)) continue;
                class_04942.IlIllllllIIlIIllllIIlIIIl();
                bl = true;
                break;
            }
            if (!bl) {
                this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_0494(string2, string3));
                this.lllIIIllIIIIlllIlIIllIIll = true;
            }
        }
    }
}

