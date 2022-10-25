package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_2136
extends class_0313 {
    private class_1276 llllllIlIllllIlIlIlIIIIlI;

    protected class_2136(String string, class_1855 class_18552, class_1276 class_12762) {
        super(string, class_18552);
        this.llllllIlIllllIlIlIlIIIIlI = class_12762;
    }

    @Override
    protected int IllIIIllIIIIlIlIlIllIIlll(int n) {
        return n > 0 ? 1 : 0;
    }

    @Override
    protected int IIIllIllIIlIlIlIlIllllIIl(int n) {
        return n == 1 ? 15 : 0;
    }

    @Override
    protected int lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        List list = null;
        if (this.llllllIlIllllIlIlIlIIIIlI == class_1276.lllIIIllIIIIlllIlIIllIIll) {
            list = class_13342.lllIlIIlIIIlIlIIIllIlllIl((class_1521)null, this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3));
        }
        if (this.llllllIlIllllIlIlIlIIIIlI == class_1276.lllIlIIlIIIlIlIIIllIlllIl) {
            list = class_13342.lllIIIllIIIIlllIlIIllIIll(class_1965.class, this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3));
        }
        if (this.llllllIlIllllIlIlIlIIIIlI == class_1276.IlIllllllIIlIIllllIIlIIIl) {
            list = class_13342.lllIIIllIIIIlllIlIIllIIll(class_0814.class, this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3));
        }
        if (list != null && !list.isEmpty()) {
            for (class_1521 class_15212 : list) {
                if (class_15212.IIIIIllIlIllIlIlIIlIllIIl()) continue;
                return 15;
            }
        }
        return 0;
    }
}

