package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;

import java.util.Comparator;

class class_0272
implements Comparator {
    final /* synthetic */ class_0342 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0696 lllIlIIlIIIlIlIIIllIlllIl;

    class_0272(class_0696 class_06962, class_0342 class_03422) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06962;
        this.lllIIIllIIIIlllIlIIllIIll = class_03422;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1536 class_15362, class_1536 class_15363) {
        int n = Item.lllIIIllIIIIlllIlIIllIIll(class_15362.lllIIIllIIIIlllIlIIllIIll());
        int n2 = Item.lllIIIllIIIIlllIlIIllIIll(class_15363.lllIIIllIIIIlllIlIIllIIll());
        StatBase class_03192 = null;
        StatBase class_03193 = null;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI == 0) {
            class_03192 = StatList.llIIIlllIlllIlIllIIIIllIl[n];
            class_03193 = StatList.llIIIlllIlllIlIllIIIIllIl[n2];
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI == 1) {
            class_03192 = StatList.IIIIIIIIlIllIIllIIlllIllI[n];
            class_03193 = StatList.IIIIIIIIlIllIIllIIlllIllI[n2];
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI == 2) {
            class_03192 = StatList.IIlIIlIlIlIllIIlIlIIIIlll[n];
            class_03193 = StatList.IIlIIlIlIlIllIIlIlIIIIlll[n2];
        }
        if (class_03192 != null || class_03193 != null) {
            int n3;
            if (class_03192 == null) {
                return 1;
            }
            if (class_03193 == null) {
                return -1;
            }
            int n4 = class_0342.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII).lllIIIllIIIIlllIlIIllIIll(class_03192);
            if (n4 != (n3 = class_0342.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII).lllIIIllIIIIlllIlIIllIIll(class_03193))) {
                return (n4 - n3) * this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll;
            }
        }
        return n - n2;
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1536)object, (class_1536)object2);
    }
}

