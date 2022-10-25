package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class class_1915
extends class_1246 {
    private class_0153 lllIIIllIIIIlllIlIIllIIll;

    public class_1915(class_0153 class_01532) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01532;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "ztp";
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "/ztp [waypointName]";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        boolean bl;
        if (arrstring.length < 1) {
            throw new class_0932("/ztp [waypointName]", new Object[0]);
        }
        class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
        class_1822 class_18222 = null;
        if (class_18222 == null) {
            class_18222 = class_1915.IlIllllllIIlIIllllIIlIIIl(class_19692);
        }
        if (class_18222 == null) {
            throw new class_0340();
        }
        String string = arrstring[0];
        for (int i = 1; i < arrstring.length; ++i) {
            string = string + " ";
            string = string + arrstring[i];
        }
        ArrayList arrayList = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
        class_0368 class_03682 = null;
        for (class_0368 class_03683 : arrayList) {
            if (!class_03683.lllIIIllIIIIlllIlIIllIIll.equalsIgnoreCase(string)) continue;
            class_03682 = class_03683;
        }
        boolean bl2 = bl = class_18222.lIIllllllllIlIllllllllIlI == -1;
        if (class_03682 != null && class_18222.lIlIllIIlIIlIIlIIlIIlIIll != null) {
            int n = 30000000;
            int n2 = class_1915.lllIIIllIIIIlllIlIIllIIll(class_19692, "" + class_03682.IlIllllllIIlIIllllIIlIIIl(), -n, n);
            int n3 = class_1915.lllIIIllIIIIlllIlIIllIIll(class_19692, "" + class_03682.lIlllIlllIIIIlIIlllIllIII(), -n, n);
            int n4 = class_03682.IlIIIIIllllllIIlllIllllll();
            if (bl) {
                class_0723 class_07232 = class_18222.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(n2, n3);
                class_18222.lIlIllIIlIIlIIlIIlIIlIIll.llIIlIllIllllIlIIIIlIIlll().IlIllllllIIlIIllllIIlIIIl(n2, n3);
                int n5 = -1;
                for (int i = 0; i < 127; ++i) {
                    if (n4 + i < 127 && this.lllIIIllIIIIlllIlIIllIIll(class_18222.lIlIllIIlIIlIIlIIlIIlIIll, n2, n4 + i, n3) && this.lllIlIIlIIIlIlIIIllIlllIl(class_18222.lIlIllIIlIIlIIlIIlIIlIIll, n2, n4 + i + 1, n3) && this.lllIlIIlIIIlIlIIIllIlllIl(class_18222.lIlIllIIlIIlIIlIIlIIlIIll, n2, n4 + i + 2, n3)) {
                        n5 = n4 + i + 1;
                        i = 128;
                    }
                    if (n4 - i <= 0 || !this.lllIIIllIIIIlllIlIIllIIll(class_18222.lIlIllIIlIIlIIlIIlIIlIIll, n2, n4 - i, n3) || !this.lllIlIIlIIIlIlIIIllIlllIl(class_18222.lIlIllIIlIIlIIlIIlIIlIIll, n2, n4 - i + 1, n3) || !this.lllIlIIlIIIlIlIIIllIlllIl(class_18222.lIlIllIIlIIlIIlIIlIIlIIll, n2, n4 - i + 2, n3)) continue;
                    n5 = n4 - i + 1;
                    i = 128;
                }
                if (n5 == -1) {
                    return;
                }
                n4 = n5;
            } else {
                if (class_03682.IlIIIIIllllllIIlllIllllll() == -1) {
                    n4 = class_18222.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll(n2, n3);
                }
                if (n4 == 0) {
                    class_0723 class_07233 = class_18222.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(n2, n3);
                    n4 = class_18222.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll(n2, n3);
                }
            }
            class_18222.IllIIIllIIIIlIlIlIllIIlll((float)n2 + 0.5f, n4, (float)n3 + 0.5f);
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length != 1 && arrstring.length != 2 ? null : class_1915.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll());
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            return class_05492 instanceof class_1417;
        }
        return class_05492 == null ? false : class_05492.lIllllIIlIIIlIllllllIIIll().IllIIIllIIIIlIlIlIllIIlll();
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            return !(class_05492 instanceof class_1417);
        }
        return class_05492 == null;
    }
}

