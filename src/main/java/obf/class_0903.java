package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ChatComponentTranslation;

import java.util.List;

public class class_0903
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "gamemode";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.gamemode.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length > 0) {
            class_2243 class_22432 = this.IllIIlllllllIIlIIlIIIIlIl(class_19692, arrstring[0]);
            class_1822 class_18222 = arrstring.length >= 2 ? class_0903.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[1]) : class_0903.IlIllllllIIlIIllllIIlIIIl(class_19692);
            class_18222.lllIIIllIIIIlllIlIIllIIll(class_22432);
            class_18222.lIIIllIIIIIllllIlIlIllIll = 0.0f;
            ChatComponentTranslation class_17902 = new ChatComponentTranslation("gameMode." + class_22432.lllIlIIlIIIlIlIIIllIlllIl(), new Object[0]);
            if (class_18222 != class_19692) {
                class_0903.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, 1, "commands.gamemode.success.other", class_18222.llllIIIIlIIIlIIIIIIlIllll(), class_17902);
            } else {
                class_0903.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, 1, "commands.gamemode.success.self", class_17902);
            }
        } else {
            throw new class_0932("commands.gamemode.usage", new Object[0]);
        }
    }

    protected class_2243 IllIIlllllllIIlIIlIIIIlIl(class_1969 class_19692, String string) {
        return !string.equalsIgnoreCase(class_2243.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl()) && !string.equalsIgnoreCase("s") ? (!string.equalsIgnoreCase(class_2243.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl()) && !string.equalsIgnoreCase("c") ? (!string.equalsIgnoreCase(class_2243.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl()) && !string.equalsIgnoreCase("a") ? class_1078.lllIIIllIIIIlllIlIIllIIll(class_0903.lllIIIllIIIIlllIlIIllIIll(class_19692, string, 0, class_2243.values().length - 2)) : class_2243.lIlllIlllIIIIlIIlllIllIII) : class_2243.IlIllllllIIlIIllllIIlIIIl) : class_2243.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0903.lllIIIllIIIIlllIlIIllIIll(arrstring, "survival", "creative", "adventure") : (arrstring.length == 2 ? class_0903.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII()) : null);
    }

    protected String[] lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 1;
    }
}

