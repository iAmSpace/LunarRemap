package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_0798
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "tp";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.tp.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_1822 class_18222;
        if (arrstring.length < 1) {
            throw new class_0932("commands.tp.usage", new Object[0]);
        }
        if (arrstring.length != 2 && arrstring.length != 4) {
            class_18222 = class_0798.IlIllllllIIlIIllllIIlIIIl(class_19692);
        } else {
            class_18222 = class_0798.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
            if (class_18222 == null) {
                throw new class_0340();
            }
        }
        if (arrstring.length != 3 && arrstring.length != 4) {
            if (arrstring.length == 1 || arrstring.length == 2) {
                class_1822 class_18223 = class_0798.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[arrstring.length - 1]);
                if (class_18223 == null) {
                    throw new class_0340();
                }
                if (class_18223.lIlIllIIlIIlIIlIIlIIlIIll != class_18222.lIlIllIIlIIlIIlIIlIIlIIll) {
                    class_0798.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.tp.notSameDimension", new Object[0]);
                    return;
                }
                class_18222.lllIIIllIIIIlllIlIIllIIll((class_1521)null);
                class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_18223.IlIIlllllIIlIlIlllllIllll, class_18223.llIIlIlIlllIIllIlIlllIllI, class_18223.IllIIIIllIIllIllIlllIlIIl, class_18223.IIIIlIllIlIIlIIlIllIlIlll, class_18223.IlIlIIlllIllllllllIIIlIlI);
                class_0798.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.tp.success", class_18222.llllIIIIlIIIlIIIIIIlIllll(), class_18223.llllIIIIlIIIlIIIIIIlIllll());
            }
        } else if (class_18222.lIlIllIIlIIlIIlIIlIIlIIll != null) {
            int n = arrstring.length - 3;
            double d = class_0798.lllIIIllIIIIlllIlIIllIIll(class_19692, class_18222.IlIIlllllIIlIlIlllllIllll, arrstring[n++]);
            double d2 = class_0798.lllIIIllIIIIlllIlIIllIIll(class_19692, class_18222.llIIlIlIlllIIllIlIlllIllI, arrstring[n++], 0, 0);
            double d3 = class_0798.lllIIIllIIIIlllIlIIllIIll(class_19692, class_18222.IllIIIIllIIllIllIlllIlIIl, arrstring[n++]);
            class_18222.lllIIIllIIIIlllIlIIllIIll((class_1521)null);
            class_18222.IllIIIllIIIIlIlIlIllIIlll(d, d2, d3);
            class_0798.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.tp.success.coordinates", class_18222.llllIIIIlIIIlIIIIIIlIllll(), d, d2, d3);
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length != 1 && arrstring.length != 2 ? null : class_0798.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll());
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

