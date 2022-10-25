package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.List;

public class class_1811
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "ban";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 3;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.ban.usage";
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692) {
        return class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll() && super.lllIlIIlIIIlIlIIIllIlllIl(class_19692);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length >= 1 && arrstring[0].length() > 0) {
            class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
            GameProfile gameProfile = class_02202.IlIIllIlIlIllIIIlIIlIlIIl().lllIIIllIIIIlllIlIIllIIll(arrstring[0]);
            if (gameProfile == null) {
                throw new class_1953("commands.ban.failed", arrstring[0]);
            }
            String string = null;
            if (arrstring.length >= 2) {
                string = class_1811.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 1).IlIllllllIIlIIllllIIlIIIl();
            }
            class_0216 class_02162 = new class_0216(gameProfile, (Date)null, class_19692.llllIIIIlIIIlIIIIIIlIllll(), (Date)null, string);
            class_02202.lIIIllIIIIIllllIlIlIllIll().IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll(class_02162);
            class_1822 class_18222 = class_02202.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(arrstring[0]);
            if (class_18222 != null) {
                class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("You are banned from this server.");
            }
        } else {
            throw new class_0932("commands.ban.usage", new Object[0]);
        }
        class_1811.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.ban.success", arrstring[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length >= 1 ? class_1811.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll()) : null;
    }
}

