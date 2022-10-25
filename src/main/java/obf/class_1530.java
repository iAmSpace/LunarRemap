package obf;

import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1530
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "list";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 0;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.players.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.players.list", class_0220.IlIIlllllIIlIlIlllllIllll().IIlllIlIlllIllIIIlllIIlIl(), class_0220.IlIIlllllIIlIlIlllllIllll().lIlIllIIlIIlIIlIIlIIlIIll()));
        class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(arrstring.length > 0 && "uuids".equalsIgnoreCase(arrstring[0]))));
    }
}

