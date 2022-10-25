package obf;

import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1336
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "save-all";
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.save.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
        class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.save.start", new Object[0]));
        if (class_02202.lIIIllIIIIIllllIlIlIllIll() != null) {
            class_02202.lIIIllIIIIIllllIlIlIllIll().IllIIIllIIIIlIlIlIllIIlll();
        }
        try {
            boolean bl;
            class_0976 class_09762;
            int n;
            for (n = 0; n < class_02202.IlIllllllIIlIIllllIIlIIIl.length; ++n) {
                if (class_02202.IlIllllllIIlIIllllIIlIIIl[n] == null) continue;
                class_09762 = class_02202.IlIllllllIIlIIllllIIlIIIl[n];
                bl = class_09762.llllIIIIlIIIlIIIIIIlIllll;
                class_09762.llllIIIIlIIIlIIIIIIlIllll = false;
                class_09762.lllIIIllIIIIlllIlIIllIIll(true, (class_1832)null);
                class_09762.llllIIIIlIIIlIIIIIIlIllll = bl;
            }
            if (arrstring.length > 0 && "flush".equals(arrstring[0])) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.save.flushStart", new Object[0]));
                for (n = 0; n < class_02202.IlIllllllIIlIIllllIIlIIIl.length; ++n) {
                    if (class_02202.IlIllllllIIlIIllllIIlIIIl[n] == null) continue;
                    class_09762 = class_02202.IlIllllllIIlIIllllIIlIIIl[n];
                    bl = class_09762.llllIIIIlIIIlIIIIIIlIllll;
                    class_09762.llllIIIIlIIIlIIIIIIlIllll = false;
                    class_09762.IIIIlIIlIIIllIIIIllIIIlII();
                    class_09762.llllIIIIlIIIlIIIIIIlIllll = bl;
                }
                class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.save.flushEnd", new Object[0]));
            }
        }
        catch (class_1038 class_10382) {
            class_1336.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.save.failed", class_10382.getMessage());
            return;
        }
        class_1336.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.save.success", new Object[0]);
    }
}

