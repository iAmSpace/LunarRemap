package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

class class_0939
implements Comparator {
    final /* synthetic */ class_0602 lllIIIllIIIIlllIlIIllIIll;

    class_0939(class_0602 class_06022) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06022;
    }

    public int lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, ResourceLocation class_17733) {
        String string;
        String string2 = class_17732.lllIIIllIIIIlllIlIIllIIll().replaceAll(".*/", "").replaceFirst("\\.properties", "");
        int n = string2.compareTo(string = class_17733.lllIIIllIIIIlllIlIIllIIll().replaceAll(".*/", "").replaceFirst("\\.properties", ""));
        if (n != 0) {
            return n;
        }
        return class_17732.lllIIIllIIIIlllIlIIllIIll().compareTo(class_17733.lllIIIllIIIIlllIlIIllIIll());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((ResourceLocation)object, (ResourceLocation)object2);
    }
}

