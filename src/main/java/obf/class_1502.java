package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.IChatComponent;

import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_1502
extends class_1246 {
    public static final Pattern lllIIIllIIIIlllIlIIllIIll = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "ban-ip";
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
        return "commands.banip.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length >= 1 && arrstring[0].length() > 1) {
            Matcher matcher = lllIIIllIIIIlllIlIIllIIll.matcher(arrstring[0]);
            IChatComponent class_22552 = null;
            if (arrstring.length >= 2) {
                class_22552 = class_1502.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 1);
            }
            if (matcher.matches()) {
                this.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[0], class_22552 == null ? null : class_22552.IlIllllllIIlIIllllIIlIIIl());
            } else {
                class_1822 class_18222 = class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(arrstring[0]);
                if (class_18222 == null) {
                    throw new class_0340("commands.banip.invalid", new Object[0]);
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_19692, class_18222.llIllllIlIllIIIlIllIIlIlI(), class_22552 == null ? null : class_22552.IlIllllllIIlIIllllIIlIIIl());
            }
        } else {
            throw new class_0932("commands.banip.usage", new Object[0]);
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_1502.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll()) : null;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string, String string2) {
        class_2227 class_22272 = new class_2227(string, (Date)null, class_19692.llllIIIIlIIIlIIIIIIlIllll(), (Date)null, string2);
        class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll(class_22272);
        List list = class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIlIIlIIIlIlIIIllIlllIl(string);
        Object[] arrobject = new String[list.size()];
        int n = 0;
        for (class_1822 class_18222 : list) {
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("You have been IP banned.");
            arrobject[n++] = class_18222.llllIIIIlIIIlIIIIIIlIllll();
        }
        if (list.isEmpty()) {
            class_1502.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.banip.success", string);
        } else {
            class_1502.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.banip.success.players", string, class_1502.lllIIIllIIIIlllIlIIllIIll(arrobject));
        }
    }
}

