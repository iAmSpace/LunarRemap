package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;

import java.util.List;

public class class_0890
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "say";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 1;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.say.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length <= 0 || arrstring[0].length() <= 0) {
            throw new class_0932("commands.say.usage", new Object[0]);
        }
        IChatComponent class_22552 = class_0890.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 0, true);
        class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("chat.type.announcement", class_19692.llllIIIIlIIIlIIIIIIlIllll(), class_22552));
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length >= 1 ? class_0890.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll()) : null;
    }
}

