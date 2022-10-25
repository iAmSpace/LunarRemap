package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.text.Collator;
import java.util.Comparator;

class class_0606
implements Comparator {
    final /* synthetic */ Collator lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0629 IlIllllllIIlIIllllIIlIIIl;

    class_0606(class_0629 class_06292, Collator collator, int n) {
        this.IlIllllllIIlIIllllIIlIIIl = class_06292;
        this.lllIIIllIIIIlllIlIIllIIll = collator;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0368 class_03682, class_0368 class_03683) {
        return this.lllIIIllIIIIlllIlIIllIIll.compare(class_03682.lllIIIllIIIIlllIlIIllIIll, class_03683.lllIIIllIIIIlllIlIIllIIll) * this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0368)object, (class_0368)object2);
    }
}

