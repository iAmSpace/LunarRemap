package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_0204
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "time";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.time.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length > 1) {
            if (arrstring[0].equals("set")) {
                int n = arrstring[1].equals("day") ? 1000 : (arrstring[1].equals("night") ? 13000 : class_0204.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[1], 0));
                this.lllIIIllIIIIlllIlIIllIIll(class_19692, n);
                class_0204.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.time.set", n);
                return;
            }
            if (arrstring[0].equals("add")) {
                int n = class_0204.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[1], 0);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_19692, n);
                class_0204.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.time.added", n);
                return;
            }
        }
        throw new class_0932("commands.time.usage", new Object[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0204.lllIIIllIIIIlllIlIIllIIll(arrstring, "set", "add") : (arrstring.length == 2 && arrstring[0].equals("set") ? class_0204.lllIIIllIIIIlllIlIIllIIll(arrstring, "day", "night") : null);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, int n) {
        for (int i = 0; i < class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl[i].lllIIIllIIIIlllIlIIllIIll((long)n);
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, int n) {
        for (int i = 0; i < class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            class_0976 class_09762 = class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl[i];
            class_09762.lllIIIllIIIIlllIlIIllIIll(class_09762.IIlllIlIlllIllIIIlllIIlIl() + (long)n);
        }
    }
}

