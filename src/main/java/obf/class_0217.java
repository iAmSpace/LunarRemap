package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.Comparator;

class class_0217
implements Comparator {
    final /* synthetic */ int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0629 lllIlIIlIIIlIlIIIllIlllIl;

    class_0217(class_0629 class_06292, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06292;
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0368 class_03682, class_0368 class_03683) {
        float f = Color.RGBtoHSB((int)(class_03682.IlIlIIlIlIllIIlIlIIllIIIl * 255.0f), (int)(class_03682.lllllIlllIIllIlIIlIIIllII * 255.0f), (int)(class_03682.IlIlIIlllIIlIllIIIlllllIl * 255.0f), null)[0];
        float f2 = Color.RGBtoHSB((int)(class_03683.IlIlIIlIlIllIIlIlIIllIIIl * 255.0f), (int)(class_03683.lllllIlllIIllIlIIlIIIllII * 255.0f), (int)(class_03683.IlIlIIlllIIlIllIIIlllllIl * 255.0f), null)[0];
        return Double.compare(f, f2) * this.lllIIIllIIIIlllIlIIllIIll;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0368)object, (class_0368)object2);
    }
}

