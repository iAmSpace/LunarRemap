package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ChatComponentTranslation;

import java.util.List;

public class class_0091
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "difficulty";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.difficulty.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new class_0932("commands.difficulty.usage", new Object[0]);
        }
        class_1999 class_19992 = this.IllIIlllllllIIlIIlIIIIlIl(class_19692, arrstring[0]);
        class_0220.IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll(class_19992);
        class_0091.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.difficulty.success", new ChatComponentTranslation(class_19992.lllIlIIlIIIlIlIIIllIlllIl(), new Object[0]));
    }

    protected class_1999 IllIIlllllllIIlIIlIIIIlIl(class_1969 class_19692, String string) {
        return !string.equalsIgnoreCase("peaceful") && !string.equalsIgnoreCase("p") ? (!string.equalsIgnoreCase("easy") && !string.equalsIgnoreCase("e") ? (!string.equalsIgnoreCase("normal") && !string.equalsIgnoreCase("n") ? (!string.equalsIgnoreCase("hard") && !string.equalsIgnoreCase("h") ? class_1999.lllIIIllIIIIlllIlIIllIIll(class_0091.lllIIIllIIIIlllIlIIllIIll(class_19692, string, 0, 3)) : class_1999.lIlllIlllIIIIlIIlllIllIII) : class_1999.IlIllllllIIlIIllllIIlIIIl) : class_1999.lllIlIIlIIIlIlIIIllIlllIl) : class_1999.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0091.lllIIIllIIIIlllIlIIllIIll(arrstring, "peaceful", "easy", "normal", "hard") : null;
    }
}

