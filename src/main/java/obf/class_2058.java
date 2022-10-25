package obf;

import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2058
extends class_1246 {
    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692) {
        return class_0220.IlIIlllllIIlIlIlllllIllll().llIIIlllIlllIlIllIIIIllIl() || super.lllIlIIlIIIlIlIIIllIlllIl(class_19692);
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "seed";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.seed.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_1334 class_13342 = class_19692 instanceof class_0814 ? ((class_0814)class_19692).lIlIllIIlIIlIIlIIlIIlIIll : class_0220.IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll(0);
        class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.seed.success", class_13342.lIlIlIIlIIIIlIIIIIlllIIII()));
    }
}

