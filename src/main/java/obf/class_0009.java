package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_0009
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "kick";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.kick.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length > 0 && arrstring[0].length() > 1) {
            class_1822 class_18222 = class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(arrstring[0]);
            String string = "Kicked by an operator.";
            boolean bl = false;
            if (class_18222 == null) {
                throw new class_0340();
            }
            if (arrstring.length >= 2) {
                string = class_0009.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 1).IlIllllllIIlIIllllIIlIIIl();
                bl = true;
            }
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string);
            if (bl) {
                class_0009.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.kick.success.reason", class_18222.llllIIIIlIIIlIIIIIIlIllll(), string);
            } else {
                class_0009.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.kick.success", class_18222.llllIIIIlIIIlIIIIIIlIllll());
            }
        } else {
            throw new class_0932("commands.kick.usage", new Object[0]);
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length >= 1 ? class_0009.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll()) : null;
    }
}

