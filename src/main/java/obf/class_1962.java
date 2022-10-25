package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashMap;

final class class_1962
implements class_1874 {
    final /* synthetic */ HashMap lllIIIllIIIIlllIlIIllIIll;

    class_1962(HashMap hashMap) {
        this.lllIIIllIIIIlllIlIIllIIll = hashMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1416 class_14162, class_0962 class_09622) {
        HashMap hashMap = this.lllIIIllIIIIlllIlIIllIIll;
        HashMap hashMap2 = this.lllIIIllIIIIlllIlIIllIIll;
        synchronized (hashMap2) {
            this.lllIIIllIIIIlllIlIIllIIll.put("Response", class_09622);
            this.lllIIIllIIIIlllIlIIllIIll.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1416 class_14162, Exception exception) {
        HashMap hashMap = this.lllIIIllIIIIlllIlIIllIIll;
        HashMap hashMap2 = this.lllIIIllIIIIlllIlIIllIIll;
        synchronized (hashMap2) {
            this.lllIIIllIIIIlllIlIIllIIll.put("Exception", exception);
            this.lllIIIllIIIIlllIlIIllIIll.notifyAll();
        }
    }
}

