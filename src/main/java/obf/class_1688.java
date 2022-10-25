package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_1688
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "spawnpoint";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.spawnpoint.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_1822 class_18222;
        class_1822 class_18223 = class_18222 = arrstring.length == 0 ? class_1688.IlIllllllIIlIIllllIIlIIIl(class_19692) : class_1688.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
        if (arrstring.length == 4) {
            if (class_18222.lIlIllIIlIIlIIlIIlIIlIIll != null) {
                int n = 1;
                int n2 = 30000000;
                int n3 = n + 1;
                int n4 = class_1688.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n], -n2, n2);
                int n5 = class_1688.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n3++], 0, 256);
                int n6 = class_1688.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n3++], -n2, n2);
                class_18222.lllIIIllIIIIlllIlIIllIIll(new class_2208(n4, n5, n6), true);
                class_1688.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.spawnpoint.success", class_18222.llllIIIIlIIIlIIIIIIlIllll(), n4, n5, n6);
            }
        } else {
            if (arrstring.length > 1) {
                throw new class_0932("commands.spawnpoint.usage", new Object[0]);
            }
            class_2208 class_22082 = class_18222.lllIIlIIIllllllIIIIlIlIlI();
            class_18222.lllIIIllIIIIlllIlIIllIIll(class_22082, true);
            class_1688.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.spawnpoint.success", class_18222.llllIIIIlIIIlIIIIIIlIllll(), class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length != 1 && arrstring.length != 2 ? null : class_1688.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll());
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

