package obf;

import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1612 {
    lllIIIllIIIIlllIlIIllIIll("ENABLED", 0, "enabled"),
    lllIlIIlIIIlIlIIIllIlllIl("DISABLED", 1, "disabled"),
    IlIllllllIIlIIllllIIlIIIl("PROMPT", 2, "prompt");

    private final IChatComponent lIlllIlllIIIIlIIlllIllIII;
    private static final class_1612[] IlIIIIIllllllIIlllIllllll;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1612(String string2) {
        void var5_-1;
        this.lIlllIlllIIIIlIIlllIllIII = new ChatComponentTranslation("addServer.resourcePack." + (String)var5_-1, new Object[0]);
    }

    public IChatComponent lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    static {
        IlIIIIIllllllIIlllIllllll = new class_1612[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl};
    }
}

