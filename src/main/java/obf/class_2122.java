package obf;

import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2122
extends class_0903 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "defaultgamemode";
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.defaultgamemode.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new class_0932("commands.defaultgamemode.usage", new Object[0]);
        }
        class_2243 class_22432 = this.IllIIlllllllIIlIIlIIIIlIl(class_19692, arrstring[0]);
        this.lllIIIllIIIIlllIlIIllIIll(class_22432);
        class_2122.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.defaultgamemode.success", new ChatComponentTranslation("gameMode." + class_22432.lllIlIIlIIIlIlIIIllIlllIl(), new Object[0]));
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
        class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
        class_02202.lllIIIllIIIIlllIlIIllIIll(class_22432);
        if (class_02202.IlllIIlllllllIIllIlIllllI()) {
            for (class_1822 class_18222 : class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().IlIIIIIllllllIIlllIllllll) {
                class_18222.lllIIIllIIIIlllIlIIllIIll(class_22432);
                class_18222.lIIIllIIIIIllllIlIlIllIll = 0.0f;
            }
        }
    }
}

