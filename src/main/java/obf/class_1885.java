package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashMap;
import java.util.TimerTask;

class class_1885
extends TimerTask {
    final /* synthetic */ class_1296 lllIIIllIIIIlllIlIIllIIll;

    class_1885(class_1296 class_12962) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12962;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        if (class_1296.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll).IIlIIlIlIlIllIIlIlIIIIlll()) {
            HashMap<String, Object> hashMap;
            Object object = class_1296.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll);
            synchronized (object) {
                hashMap = new HashMap<String, Object>(class_1296.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll));
                if (class_1296.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll) == 0) {
                    hashMap.putAll(class_1296.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll));
                }
                hashMap.put("snooper_count", class_1296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
                hashMap.put("snooper_token", class_1296.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll));
            }
            class_0790.lllIIIllIIIIlllIlIIllIIll(class_1296.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll), hashMap, true);
        }
    }
}

