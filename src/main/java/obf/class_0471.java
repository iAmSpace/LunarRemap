package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.List;

public class class_0471
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "deop";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 3;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.deop.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        GameProfile gameProfile;
        class_0220 class_02202;
        if (arrstring.length == 1 && arrstring[0].length() > 0) {
            class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
            gameProfile = class_02202.lIIIllIIIIIllllIlIlIllIll().llIIllIllIlIIlIIllIllllll().lllIIIllIIIIlllIlIIllIIll(arrstring[0]);
            if (gameProfile == null) {
                throw new class_1953("commands.deop.failed", arrstring[0]);
            }
        } else {
            throw new class_0932("commands.deop.usage", new Object[0]);
        }
        class_02202.lIIIllIIIIIllllIlIlIllIll().IlIllllllIIlIIllllIIlIIIl(gameProfile);
        class_0471.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.deop.success", arrstring[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0471.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIlIIIllllllIIIIlIlIlI()) : null;
    }
}

