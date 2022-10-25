package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_0738
extends class_1665 {
    public long lllIIIllIIIIlllIlIIllIIll = System.currentTimeMillis();
    private List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();

    public class_0738() {
        super("Notifications");
        this.lllIIIllIIIIlllIlIIllIIll(class_1211.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(true);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1211 class_12112) {
        this.lllIIIllIIIIlllIlIIllIIll = System.currentTimeMillis();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        Iterator iterator = this.lllIlIIlIIIlIlIIIllIlllIl.iterator();
        while (iterator.hasNext()) {
            class_2028 class_20282 = (class_2028)iterator.next();
            class_20282.lllIIIllIIIIlllIlIIllIIll();
            long l = class_20282.lIlllIlllIIIIlIIlllIllIII + class_20282.IlIllllllIIlIIllllIIlIIIl - System.currentTimeMillis();
            if (l > 0L) continue;
            int n = class_20282.IlIIIIIllllllIIlllIllllll;
            for (class_2028 class_20283 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                if (class_20283.IlIIIIIllllllIIlllIllllll >= class_20282.IlIIIIIllllllIIlllIllllll) continue;
                class_20283.IllIIlllllllIIlIIlIIIIlIl = 0;
                class_20283.lIllllIIlIIIlIllllllIIIll = n;
                n = class_20283.IlIIIIIllllllIIlllIllllll;
            }
            iterator.remove();
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        for (class_2028 class_20282 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            class_20282.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll());
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2, long l) {
        class_2067 class_20672;
        class_0321 class_03212 = new class_0321(this.lIIlIIIIIlIlllIlIIlIlIlll, this.lIIlIIIIIlIlllIlIIlIlIlll.displayWidth, this.lIIlIIIIIlIlllIlIIlIlIlll.displayHeight);
        if (l < 2000L) {
            l = 2000L;
        }
        string2 = string2.replaceAll("&([abcdefghijklmrABCDEFGHIJKLMNR0-9])|(&$)", "\u00a7$1");
        switch (string.toLowerCase()) {
            case "info": {
                class_20672 = class_2067.lllIIIllIIIIlllIlIIllIIll;
                break;
            }
            case "error": {
                class_20672 = class_2067.lllIlIIlIIIlIlIIIllIlllIl;
                break;
            }
            default: {
                class_20672 = class_2067.IlIllllllIIlIIllllIIlIIIl;
            }
        }
        Object object = new class_2028(this, class_03212, class_20672, string2, l);
        int n = ((class_2028)object).lIllllIIlIIIlIllllllIIIll - ((class_2028)object).IIIllIIlIIIIIIlIlIIllIIlI - 2;
        for (int i = this.lllIlIIlIIIlIlIIIllIlllIl.size() - 1; i >= 0; --i) {
            class_2028 class_20282 = (class_2028)this.lllIlIIlIIIlIlIIIllIlllIl.get(i);
            class_20282.IllIIlllllllIIlIIlIIIIlIl = 0;
            class_20282.lIllllIIlIIIlIllllllIIIll = n;
            n -= 2 + class_20282.IIIllIIlIIIIIIlIlIIllIIlI;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.add(object);
    }
}

