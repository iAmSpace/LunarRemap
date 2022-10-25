package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_1903
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "xp";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.xp.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        int n;
        boolean bl;
        boolean bl2;
        if (arrstring.length <= 0) {
            throw new class_0932("commands.xp.usage", new Object[0]);
        }
        String string = arrstring[0];
        boolean bl3 = bl2 = string.endsWith("l") || string.endsWith("L");
        if (bl2 && string.length() > 1) {
            string = string.substring(0, string.length() - 1);
        }
        boolean bl4 = bl = (n = class_1903.lllIIIllIIIIlllIlIIllIIll(class_19692, string)) < 0;
        if (bl) {
            n *= -1;
        }
        class_1822 class_18222 = arrstring.length > 1 ? class_1903.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[1]) : class_1903.IlIllllllIIlIIllllIIlIIIl(class_19692);
        if (bl2) {
            if (bl) {
                class_18222.IlIIIlIIIIllIIIllIIIIIIll(-n);
                class_1903.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.xp.success.negative.levels", n, class_18222.llllIIIIlIIIlIIIIIIlIllll());
            } else {
                class_18222.IlIIIlIIIIllIIIllIIIIIIll(n);
                class_1903.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.xp.success.levels", n, class_18222.llllIIIIlIIIlIIIIIIlIllll());
            }
        } else {
            if (bl) {
                throw new class_0932("commands.xp.failure.widthdrawXp", new Object[0]);
            }
            class_18222.lIlIlIIlIIIIlIIIIIlllIIII(n);
            class_1903.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.xp.success", n, class_18222.llllIIIIlIIIlIIIIIIlIllll());
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 2 ? class_1903.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII()) : null;
    }

    protected String[] lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 1;
    }
}

