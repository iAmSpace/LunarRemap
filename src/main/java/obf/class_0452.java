package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Comparator;

class class_0452
implements Comparator {
    final /* synthetic */ ArrayList lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0629 IlIllllllIIlIIllllIIlIIIl;

    class_0452(class_0629 class_06292, ArrayList arrayList, int n) {
        this.IlIllllllIIlIIllllIIlIIIl = class_06292;
        this.lllIIIllIIIIlllIlIIllIIll = arrayList;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0368 class_03682, class_0368 class_03683) {
        return Double.compare(this.lllIIIllIIIIlllIlIIllIIll.indexOf(class_03682), this.lllIIIllIIIIlllIlIIllIIll.indexOf(class_03683)) * this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0368)object, (class_0368)object2);
    }
}

