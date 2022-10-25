package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ChatComponentTranslation;

import java.util.List;

public class class_0173
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "banlist";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 3;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692) {
        return (class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll() || class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll()) && super.lllIlIIlIIIlIlIIIllIlllIl(class_19692);
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.banlist.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length >= 1 && arrstring[0].equalsIgnoreCase("ips")) {
            class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.banlist.ips", class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl().length));
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0173.lllIIIllIIIIlllIlIIllIIll(class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl())));
        } else {
            class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.banlist.players", class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl().length));
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0173.lllIIIllIIIIlllIlIIllIIll(class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl())));
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0173.lllIIIllIIIIlllIlIIllIIll(arrstring, "players", "ips") : null;
    }
}

