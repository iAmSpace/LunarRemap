package obf;

import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0029
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "kill";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 0;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.kill.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_1822 class_18222 = class_0029.IlIllllllIIlIIllllIIlIIIl(class_19692);
        class_18222.lllIIIllIIIIlllIlIIllIIll(class_0058.IIIllIllIIlIlIlIlIllllIIl, Float.MAX_VALUE);
        class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.kill.success", new Object[0]));
    }
}

