package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.text.Collator;
import java.util.Comparator;

class class_0884
implements Comparator {
    final /* synthetic */ Collator lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0803 lllIlIIlIIIlIlIIIllIlllIl;

    class_0884(class_0803 class_08032, Collator collator) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08032;
        this.lllIIIllIIIIlllIlIIllIIll = collator;
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        string = class_0803.lllIIIllIIIIlllIlIIllIIll(string);
        string2 = class_0803.lllIIIllIIIIlllIlIIllIIll(string2);
        return this.lllIIIllIIIIlllIlIIllIIll.compare(string, string2);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((String)object, (String)object2);
    }
}

