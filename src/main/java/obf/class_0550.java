package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import net.minecraft.util.ChatComponentTranslation;

import java.util.List;

public class class_0550
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "whitelist";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 3;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.whitelist.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length >= 1) {
            class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
            if (arrstring[0].equals("on")) {
                class_02202.lIIIllIIIIIllllIlIlIllIll().lllIlIIlIIIlIlIIIllIlllIl(true);
                class_0550.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.whitelist.enabled", new Object[0]);
                return;
            }
            if (arrstring[0].equals("off")) {
                class_02202.lIIIllIIIIIllllIlIlIllIll().lllIlIIlIIIlIlIIIllIlllIl(false);
                class_0550.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.whitelist.disabled", new Object[0]);
                return;
            }
            if (arrstring[0].equals("list")) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.whitelist.list", class_02202.lIIIllIIIIIllllIlIlIllIll().llIIlllIllIllllIIIlIIIIII().length, class_02202.lIIIllIIIIIllllIlIlIllIll().IlIlIIlllIIlIllIIIlllllIl().length));
                Object[] arrobject = class_02202.lIIIllIIIIIllllIlIlIllIll().llIIlllIllIllllIIIlIIIIII();
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0550.lllIIIllIIIIlllIlIIllIIll(arrobject)));
                return;
            }
            if (arrstring[0].equals("add")) {
                if (arrstring.length < 2) {
                    throw new class_0932("commands.whitelist.add.usage", new Object[0]);
                }
                GameProfile gameProfile = class_02202.IlIIllIlIlIllIIIlIIlIlIIl().lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                if (gameProfile == null) {
                    throw new class_1953("commands.whitelist.add.failed", arrstring[1]);
                }
                class_02202.lIIIllIIIIIllllIlIlIllIll().lIllllIIlIIIlIllllllIIIll(gameProfile);
                class_0550.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.whitelist.add.success", arrstring[1]);
                return;
            }
            if (arrstring[0].equals("remove")) {
                if (arrstring.length < 2) {
                    throw new class_0932("commands.whitelist.remove.usage", new Object[0]);
                }
                GameProfile gameProfile = class_02202.lIIIllIIIIIllllIlIlIllIll().lIIIIlIlIIlllllIIllIIlIII().lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
                if (gameProfile == null) {
                    throw new class_1953("commands.whitelist.remove.failed", arrstring[1]);
                }
                class_02202.lIIIllIIIIIllllIlIlIllIll().IIIllIIlIIIIIIlIlIIllIIlI(gameProfile);
                class_0550.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.whitelist.remove.success", arrstring[1]);
                return;
            }
            if (arrstring[0].equals("reload")) {
                class_02202.lIIIllIIIIIllllIlIlIllIll().IlIlllIIIIIIlIIllIIllIlll();
                class_0550.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.whitelist.reloaded", new Object[0]);
                return;
            }
        }
        throw new class_0932("commands.whitelist.usage", new Object[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length == 1) {
            return class_0550.lllIIIllIIIIlllIlIIllIIll(arrstring, "on", "off", "list", "add", "remove", "reload");
        }
        if (arrstring.length == 2) {
            if (arrstring[0].equals("remove")) {
                return class_0550.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().llIIlllIllIllllIIIlIIIIII());
            }
            if (arrstring[0].equals("add")) {
                return class_0550.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().IlIIllIlIlIllIIIlIIlIlIIl().lllIIIllIIIIlllIlIIllIIll());
            }
        }
        return null;
    }
}

