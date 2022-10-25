package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.regex.Matcher;

public class class_0813
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "pardon-ip";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 3;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692) {
        return class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll() && super.lllIlIIlIIIlIlIIIllIlllIl(class_19692);
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.unbanip.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length == 1 && arrstring[0].length() > 1) {
            Matcher matcher = class_1502.lllIIIllIIIIlllIlIIllIIll.matcher(arrstring[0]);
            if (!matcher.matches()) {
                throw new class_1648("commands.unbanip.invalid", new Object[0]);
            }
        } else {
            throw new class_0932("commands.unbanip.usage", new Object[0]);
        }
        class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl(arrstring[0]);
        class_0813.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.unbanip.success", arrstring[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0813.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl()) : null;
    }
}

