package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;

import java.util.List;

public class class_1702
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "me";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 0;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.me.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new class_0932("commands.me.usage", new Object[0]);
        }
        IChatComponent class_22552 = class_1702.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 0, class_19692.lllIIIllIIIIlllIlIIllIIll(1, "me"));
        class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("chat.type.emote", class_19692.llIIIIllIIIIIIIlIIIlIIIIl(), class_22552));
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return class_1702.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll());
    }
}

