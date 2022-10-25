package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;

public class class_1760
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "op";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 3;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.op.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        GameProfile gameProfile;
        class_0220 class_02202;
        if (arrstring.length == 1 && arrstring[0].length() > 0) {
            class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
            gameProfile = class_02202.IlIIllIlIlIllIIIlIIlIlIIl().lllIIIllIIIIlllIlIIllIIll(arrstring[0]);
            if (gameProfile == null) {
                throw new class_1953("commands.op.failed", arrstring[0]);
            }
        } else {
            throw new class_0932("commands.op.usage", new Object[0]);
        }
        class_02202.lIIIllIIIIIllllIlIlIllIll().lllIlIIlIIIlIlIIIllIlllIl(gameProfile);
        class_1760.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.op.success", arrstring[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length == 1) {
            String string = arrstring[arrstring.length - 1];
            ArrayList<String> arrayList = new ArrayList<String>();
            for (GameProfile gameProfile : class_0220.IlIIlllllIIlIlIlllllIllll().llIllllIlIllIIIlIllIIlIlI()) {
                if (class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IlIIIIIllllllIIlllIllllll(gameProfile) || !class_1760.lllIIIllIIIIlllIlIIllIIll(string, gameProfile.getName())) continue;
                arrayList.add(gameProfile.getName());
            }
            return arrayList;
        }
        return null;
    }
}

